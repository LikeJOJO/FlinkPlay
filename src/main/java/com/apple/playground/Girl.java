package com.apple.playground;

public class Girl {
    public String name;
    public int age;
    public Long timeStamp;

    public Girl() {

    }

    public Girl(String name, int age, Long timeStamp) {
        this.name = name;
        this.age = age;
        this.timeStamp = timeStamp;
    }

    public static Girl of(String name, int age, Long timeStamp) {
        return new Girl(name, age, timeStamp);
    }
}
