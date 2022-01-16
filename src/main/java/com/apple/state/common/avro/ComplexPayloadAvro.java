///**
// * Autogenerated by Avro
// *
// * DO NOT EDIT DIRECTLY
// */
//package com.apple.state.common.avro;
//
//import org.apache.avro.message.BinaryMessageDecoder;
//import org.apache.avro.message.BinaryMessageEncoder;
//import org.apache.avro.message.SchemaStore;
//import org.apache.avro.specific.SpecificData;
//
//@SuppressWarnings("all")
//@org.apache.avro.specific.AvroGenerated
//public class ComplexPayloadAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
//  private static final long serialVersionUID = -2750936869018926220L;
//  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ComplexPayloadAvro\",\"namespace\":\"org.apache.flink.streaming.tests.avro\",\"fields\":[{\"name\":\"eventTime\",\"type\":\"long\",\"default\":\"\"},{\"name\":\"stringList\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"strPayload\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"default\":\"\"},{\"name\":\"innerPayLoad\",\"type\":{\"type\":\"record\",\"name\":\"InnerPayLoadAvro\",\"fields\":[{\"name\":\"sequenceNumber\",\"type\":\"long\"}]}}]}");
//  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
//
//  private static SpecificData MODEL$ = new SpecificData();
//
//  private static final BinaryMessageEncoder<ComplexPayloadAvro> ENCODER =
//      new BinaryMessageEncoder<ComplexPayloadAvro>(MODEL$, SCHEMA$);
//
//  private static final BinaryMessageDecoder<ComplexPayloadAvro> DECODER =
//      new BinaryMessageDecoder<ComplexPayloadAvro>(MODEL$, SCHEMA$);
//
//  /**
//   * Return the BinaryMessageDecoder instance used by this class.
//   */
//  public static BinaryMessageDecoder<ComplexPayloadAvro> getDecoder() {
//    return DECODER;
//  }
//
//  /**
//   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
//   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
//   */
//  public static BinaryMessageDecoder<ComplexPayloadAvro> createDecoder(SchemaStore resolver) {
//    return new BinaryMessageDecoder<ComplexPayloadAvro>(MODEL$, SCHEMA$, resolver);
//  }
//
//  /** Serializes this ComplexPayloadAvro to a ByteBuffer. */
//  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
//    return ENCODER.encode(this);
//  }
//
//  /** Deserializes a ComplexPayloadAvro from a ByteBuffer. */
//  public static ComplexPayloadAvro fromByteBuffer(
//      java.nio.ByteBuffer b) throws java.io.IOException {
//    return DECODER.decode(b);
//  }
//
//   private long eventTime;
//   private java.util.List<String> stringList;
//   private String strPayload;
//   private InnerPayLoadAvro innerPayLoad;
//
//  /**
//   * Default constructor.  Note that this does not initialize fields
//   * to their default values from the schema.  If that is desired then
//   * one should use <code>newBuilder()</code>.
//   */
//  public ComplexPayloadAvro() {}
//
//  /**
//   * All-args constructor.
//   * @param eventTime The new value for eventTime
//   * @param stringList The new value for stringList
//   * @param strPayload The new value for strPayload
//   * @param innerPayLoad The new value for innerPayLoad
//   */
//  public ComplexPayloadAvro(Long eventTime, java.util.List<String> stringList, String strPayload, InnerPayLoadAvro innerPayLoad) {
//    this.eventTime = eventTime;
//    this.stringList = stringList;
//    this.strPayload = strPayload;
//    this.innerPayLoad = innerPayLoad;
//  }
//
//  @Override
//  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
//  // Used by DatumWriter.  Applications should not call.
//  @Override
//  public Object get(int field$) {
//    switch (field$) {
//    case 0: return eventTime;
//    case 1: return stringList;
//    case 2: return strPayload;
//    case 3: return innerPayLoad;
//    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
//    }
//  }
//
//  // Used by DatumReader.  Applications should not call.
//  @SuppressWarnings(value="unchecked")
//  @Override
//  public void put(int field$, Object value$) {
//    switch (field$) {
//    case 0: eventTime = (Long)value$; break;
//    case 1: stringList = (java.util.List<String>)value$; break;
//    case 2: strPayload = (String)value$; break;
//    case 3: innerPayLoad = (InnerPayLoadAvro)value$; break;
//    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
//    }
//  }
//
//  /**
//   * Gets the value of the 'eventTime' field.
//   * @return The value of the 'eventTime' field.
//   */
//  public Long getEventTime() {
//    return eventTime;
//  }
//
//  /**
//   * Sets the value of the 'eventTime' field.
//   * @param value the value to set.
//   */
//  public void setEventTime(Long value) {
//    this.eventTime = value;
//  }
//
//  /**
//   * Gets the value of the 'stringList' field.
//   * @return The value of the 'stringList' field.
//   */
//  public java.util.List<String> getStringList() {
//    return stringList;
//  }
//
//  /**
//   * Sets the value of the 'stringList' field.
//   * @param value the value to set.
//   */
//  public void setStringList(java.util.List<String> value) {
//    this.stringList = value;
//  }
//
//  /**
//   * Gets the value of the 'strPayload' field.
//   * @return The value of the 'strPayload' field.
//   */
//  public String getStrPayload() {
//    return strPayload;
//  }
//
//  /**
//   * Sets the value of the 'strPayload' field.
//   * @param value the value to set.
//   */
//  public void setStrPayload(String value) {
//    this.strPayload = value;
//  }
//
//  /**
//   * Gets the value of the 'innerPayLoad' field.
//   * @return The value of the 'innerPayLoad' field.
//   */
//  public InnerPayLoadAvro getInnerPayLoad() {
//    return innerPayLoad;
//  }
//
//  /**
//   * Sets the value of the 'innerPayLoad' field.
//   * @param value the value to set.
//   */
//  public void setInnerPayLoad(InnerPayLoadAvro value) {
//    this.innerPayLoad = value;
//  }
//
//  /**
//   * Creates a new ComplexPayloadAvro RecordBuilder.
//   * @return A new ComplexPayloadAvro RecordBuilder
//   */
//  public static ComplexPayloadAvro.Builder newBuilder() {
//    return new ComplexPayloadAvro.Builder();
//  }
//
//  /**
//   * Creates a new ComplexPayloadAvro RecordBuilder by copying an existing Builder.
//   * @param other The existing builder to copy.
//   * @return A new ComplexPayloadAvro RecordBuilder
//   */
//  public static ComplexPayloadAvro.Builder newBuilder(ComplexPayloadAvro.Builder other) {
//    return new ComplexPayloadAvro.Builder(other);
//  }
//
//  /**
//   * Creates a new ComplexPayloadAvro RecordBuilder by copying an existing ComplexPayloadAvro instance.
//   * @param other The existing instance to copy.
//   * @return A new ComplexPayloadAvro RecordBuilder
//   */
//  public static ComplexPayloadAvro.Builder newBuilder(ComplexPayloadAvro other) {
//    return new ComplexPayloadAvro.Builder(other);
//  }
//
//  /**
//   * RecordBuilder for ComplexPayloadAvro instances.
//   */
//  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ComplexPayloadAvro>
//    implements org.apache.avro.data.RecordBuilder<ComplexPayloadAvro> {
//
//    private long eventTime;
//    private java.util.List<String> stringList;
//    private String strPayload;
//    private InnerPayLoadAvro innerPayLoad;
//    private InnerPayLoadAvro.Builder innerPayLoadBuilder;
//
//    /** Creates a new Builder */
//    private Builder() {
//      super(SCHEMA$);
//    }
//
//    /**
//     * Creates a Builder by copying an existing Builder.
//     * @param other The existing Builder to copy.
//     */
//    private Builder(ComplexPayloadAvro.Builder other) {
//      super(other);
//      if (isValidValue(fields()[0], other.eventTime)) {
//        this.eventTime = data().deepCopy(fields()[0].schema(), other.eventTime);
//        fieldSetFlags()[0] = true;
//      }
//      if (isValidValue(fields()[1], other.stringList)) {
//        this.stringList = data().deepCopy(fields()[1].schema(), other.stringList);
//        fieldSetFlags()[1] = true;
//      }
//      if (isValidValue(fields()[2], other.strPayload)) {
//        this.strPayload = data().deepCopy(fields()[2].schema(), other.strPayload);
//        fieldSetFlags()[2] = true;
//      }
//      if (isValidValue(fields()[3], other.innerPayLoad)) {
//        this.innerPayLoad = data().deepCopy(fields()[3].schema(), other.innerPayLoad);
//        fieldSetFlags()[3] = true;
//      }
//      if (other.hasInnerPayLoadBuilder()) {
//        this.innerPayLoadBuilder = InnerPayLoadAvro.newBuilder(other.getInnerPayLoadBuilder());
//      }
//    }
//
//    /**
//     * Creates a Builder by copying an existing ComplexPayloadAvro instance
//     * @param other The existing instance to copy.
//     */
//    private Builder(ComplexPayloadAvro other) {
//            super(SCHEMA$);
//      if (isValidValue(fields()[0], other.eventTime)) {
//        this.eventTime = data().deepCopy(fields()[0].schema(), other.eventTime);
//        fieldSetFlags()[0] = true;
//      }
//      if (isValidValue(fields()[1], other.stringList)) {
//        this.stringList = data().deepCopy(fields()[1].schema(), other.stringList);
//        fieldSetFlags()[1] = true;
//      }
//      if (isValidValue(fields()[2], other.strPayload)) {
//        this.strPayload = data().deepCopy(fields()[2].schema(), other.strPayload);
//        fieldSetFlags()[2] = true;
//      }
//      if (isValidValue(fields()[3], other.innerPayLoad)) {
//        this.innerPayLoad = data().deepCopy(fields()[3].schema(), other.innerPayLoad);
//        fieldSetFlags()[3] = true;
//      }
//      this.innerPayLoadBuilder = null;
//    }
//
//    /**
//      * Gets the value of the 'eventTime' field.
//      * @return The value.
//      */
//    public Long getEventTime() {
//      return eventTime;
//    }
//
//    /**
//      * Sets the value of the 'eventTime' field.
//      * @param value The value of 'eventTime'.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder setEventTime(long value) {
//      validate(fields()[0], value);
//      this.eventTime = value;
//      fieldSetFlags()[0] = true;
//      return this;
//    }
//
//    /**
//      * Checks whether the 'eventTime' field has been set.
//      * @return True if the 'eventTime' field has been set, false otherwise.
//      */
//    public boolean hasEventTime() {
//      return fieldSetFlags()[0];
//    }
//
//
//    /**
//      * Clears the value of the 'eventTime' field.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder clearEventTime() {
//      fieldSetFlags()[0] = false;
//      return this;
//    }
//
//    /**
//      * Gets the value of the 'stringList' field.
//      * @return The value.
//      */
//    public java.util.List<String> getStringList() {
//      return stringList;
//    }
//
//    /**
//      * Sets the value of the 'stringList' field.
//      * @param value The value of 'stringList'.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder setStringList(java.util.List<String> value) {
//      validate(fields()[1], value);
//      this.stringList = value;
//      fieldSetFlags()[1] = true;
//      return this;
//    }
//
//    /**
//      * Checks whether the 'stringList' field has been set.
//      * @return True if the 'stringList' field has been set, false otherwise.
//      */
//    public boolean hasStringList() {
//      return fieldSetFlags()[1];
//    }
//
//
//    /**
//      * Clears the value of the 'stringList' field.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder clearStringList() {
//      stringList = null;
//      fieldSetFlags()[1] = false;
//      return this;
//    }
//
//    /**
//      * Gets the value of the 'strPayload' field.
//      * @return The value.
//      */
//    public String getStrPayload() {
//      return strPayload;
//    }
//
//    /**
//      * Sets the value of the 'strPayload' field.
//      * @param value The value of 'strPayload'.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder setStrPayload(String value) {
//      validate(fields()[2], value);
//      this.strPayload = value;
//      fieldSetFlags()[2] = true;
//      return this;
//    }
//
//    /**
//      * Checks whether the 'strPayload' field has been set.
//      * @return True if the 'strPayload' field has been set, false otherwise.
//      */
//    public boolean hasStrPayload() {
//      return fieldSetFlags()[2];
//    }
//
//
//    /**
//      * Clears the value of the 'strPayload' field.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder clearStrPayload() {
//      strPayload = null;
//      fieldSetFlags()[2] = false;
//      return this;
//    }
//
//    /**
//      * Gets the value of the 'innerPayLoad' field.
//      * @return The value.
//      */
//    public InnerPayLoadAvro getInnerPayLoad() {
//      return innerPayLoad;
//    }
//
//    /**
//      * Sets the value of the 'innerPayLoad' field.
//      * @param value The value of 'innerPayLoad'.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder setInnerPayLoad(InnerPayLoadAvro value) {
//      validate(fields()[3], value);
//      this.innerPayLoadBuilder = null;
//      this.innerPayLoad = value;
//      fieldSetFlags()[3] = true;
//      return this;
//    }
//
//    /**
//      * Checks whether the 'innerPayLoad' field has been set.
//      * @return True if the 'innerPayLoad' field has been set, false otherwise.
//      */
//    public boolean hasInnerPayLoad() {
//      return fieldSetFlags()[3];
//    }
//
//    /**
//     * Gets the Builder instance for the 'innerPayLoad' field and creates one if it doesn't exist yet.
//     * @return This builder.
//     */
//    public InnerPayLoadAvro.Builder getInnerPayLoadBuilder() {
//      if (innerPayLoadBuilder == null) {
//        if (hasInnerPayLoad()) {
//          setInnerPayLoadBuilder(InnerPayLoadAvro.newBuilder(innerPayLoad));
//        } else {
//          setInnerPayLoadBuilder(InnerPayLoadAvro.newBuilder());
//        }
//      }
//      return innerPayLoadBuilder;
//    }
//
//    /**
//     * Sets the Builder instance for the 'innerPayLoad' field
//     * @param value The builder instance that must be set.
//     * @return This builder.
//     */
//    public ComplexPayloadAvro.Builder setInnerPayLoadBuilder(InnerPayLoadAvro.Builder value) {
//      clearInnerPayLoad();
//      innerPayLoadBuilder = value;
//      return this;
//    }
//
//    /**
//     * Checks whether the 'innerPayLoad' field has an active Builder instance
//     * @return True if the 'innerPayLoad' field has an active Builder instance
//     */
//    public boolean hasInnerPayLoadBuilder() {
//      return innerPayLoadBuilder != null;
//    }
//
//    /**
//      * Clears the value of the 'innerPayLoad' field.
//      * @return This builder.
//      */
//    public ComplexPayloadAvro.Builder clearInnerPayLoad() {
//      innerPayLoad = null;
//      innerPayLoadBuilder = null;
//      fieldSetFlags()[3] = false;
//      return this;
//    }
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public ComplexPayloadAvro build() {
//      try {
//        ComplexPayloadAvro record = new ComplexPayloadAvro();
//        record.eventTime = fieldSetFlags()[0] ? this.eventTime : (Long) defaultValue(fields()[0]);
//        record.stringList = fieldSetFlags()[1] ? this.stringList : (java.util.List<String>) defaultValue(fields()[1]);
//        record.strPayload = fieldSetFlags()[2] ? this.strPayload : (String) defaultValue(fields()[2]);
//        if (innerPayLoadBuilder != null) {
//          record.innerPayLoad = this.innerPayLoadBuilder.build();
//        } else {
//          record.innerPayLoad = fieldSetFlags()[3] ? this.innerPayLoad : (InnerPayLoadAvro) defaultValue(fields()[3]);
//        }
//        return record;
//      } catch (Exception e) {
//        throw new org.apache.avro.AvroRuntimeException(e);
//      }
//    }
//  }
//
//  @SuppressWarnings("unchecked")
//  private static final org.apache.avro.io.DatumWriter<ComplexPayloadAvro>
//    WRITER$ = (org.apache.avro.io.DatumWriter<ComplexPayloadAvro>)MODEL$.createDatumWriter(SCHEMA$);
//
//  @Override public void writeExternal(java.io.ObjectOutput out)
//    throws java.io.IOException {
//    WRITER$.write(this, SpecificData.getEncoder(out));
//  }
//
//  @SuppressWarnings("unchecked")
//  private static final org.apache.avro.io.DatumReader<ComplexPayloadAvro>
//    READER$ = (org.apache.avro.io.DatumReader<ComplexPayloadAvro>)MODEL$.createDatumReader(SCHEMA$);
//
//  @Override public void readExternal(java.io.ObjectInput in)
//    throws java.io.IOException {
//    READER$.read(this, SpecificData.getDecoder(in));
//  }
//
//}