package com.apple.sql;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;

import static org.apache.flink.table.api.Expressions.$;

public class SQLDemo03 {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tblEnv = StreamTableEnvironment.create(env);
        tblEnv.executeSql("create table clicks (" +
                "`user` string, " +
                "`url` string, " +
                "`ts` BIGINT) " +
                " WITH (" +
                " 'connector' = 'filesystem', " +
                " 'path' = 'input/clicks.txt', " +
                " 'format' = 'csv'" +
                ")");
        Table clicksTable = tblEnv.sqlQuery("select user, url, ts from clicks");
        tblEnv.toDataStream(clicksTable).print();
        env.execute();
    }
}
