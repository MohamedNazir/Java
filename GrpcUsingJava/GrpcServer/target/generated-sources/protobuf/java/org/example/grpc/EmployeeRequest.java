// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmployeeService.proto

package org.example.grpc;

/**
 * Protobuf type {@code EmployeeRequest}
 */
public final class EmployeeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EmployeeRequest)
    EmployeeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmployeeRequest.newBuilder() to construct.
  private EmployeeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmployeeRequest() {
    name_ = "";
    technologies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    sentiment_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EmployeeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmployeeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            age_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              technologies_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            technologies_.add(s);
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              bagOfTricks_ = com.google.protobuf.MapField.newMapField(
                  BagOfTricksDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            bagOfTricks__ = input.readMessage(
                BagOfTricksDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            bagOfTricks_.getMutableMap().put(
                bagOfTricks__.getKey(), bagOfTricks__.getValue());
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            sentiment_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        technologies_ = technologies_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.grpc.EmployeeServiceOuterClass.internal_static_EmployeeRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 4:
        return internalGetBagOfTricks();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.grpc.EmployeeServiceOuterClass.internal_static_EmployeeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.grpc.EmployeeRequest.class, org.example.grpc.EmployeeRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGE_FIELD_NUMBER = 2;
  private int age_;
  /**
   * <code>int32 age = 2;</code>
   * @return The age.
   */
  @java.lang.Override
  public int getAge() {
    return age_;
  }

  public static final int TECHNOLOGIES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList technologies_;
  /**
   * <code>repeated string technologies = 3;</code>
   * @return A list containing the technologies.
   */
  public com.google.protobuf.ProtocolStringList
      getTechnologiesList() {
    return technologies_;
  }
  /**
   * <code>repeated string technologies = 3;</code>
   * @return The count of technologies.
   */
  public int getTechnologiesCount() {
    return technologies_.size();
  }
  /**
   * <code>repeated string technologies = 3;</code>
   * @param index The index of the element to return.
   * @return The technologies at the given index.
   */
  public java.lang.String getTechnologies(int index) {
    return technologies_.get(index);
  }
  /**
   * <code>repeated string technologies = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the technologies at the given index.
   */
  public com.google.protobuf.ByteString
      getTechnologiesBytes(int index) {
    return technologies_.getByteString(index);
  }

  public static final int BAGOFTRICKS_FIELD_NUMBER = 4;
  private static final class BagOfTricksDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.example.grpc.EmployeeServiceOuterClass.internal_static_EmployeeRequest_BagOfTricksEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> bagOfTricks_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetBagOfTricks() {
    if (bagOfTricks_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          BagOfTricksDefaultEntryHolder.defaultEntry);
    }
    return bagOfTricks_;
  }

  public int getBagOfTricksCount() {
    return internalGetBagOfTricks().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */

  @java.lang.Override
  public boolean containsBagOfTricks(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetBagOfTricks().getMap().containsKey(key);
  }
  /**
   * Use {@link #getBagOfTricksMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getBagOfTricks() {
    return getBagOfTricksMap();
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getBagOfTricksMap() {
    return internalGetBagOfTricks().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  @java.lang.Override

  public java.lang.String getBagOfTricksOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBagOfTricks().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
   */
  @java.lang.Override

  public java.lang.String getBagOfTricksOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetBagOfTricks().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SENTIMENT_FIELD_NUMBER = 5;
  private int sentiment_;
  /**
   * <code>.EmployeeType sentiment = 5;</code>
   * @return The enum numeric value on the wire for sentiment.
   */
  @java.lang.Override public int getSentimentValue() {
    return sentiment_;
  }
  /**
   * <code>.EmployeeType sentiment = 5;</code>
   * @return The sentiment.
   */
  @java.lang.Override public org.example.grpc.EmployeeType getSentiment() {
    @SuppressWarnings("deprecation")
    org.example.grpc.EmployeeType result = org.example.grpc.EmployeeType.valueOf(sentiment_);
    return result == null ? org.example.grpc.EmployeeType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (age_ != 0) {
      output.writeInt32(2, age_);
    }
    for (int i = 0; i < technologies_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, technologies_.getRaw(i));
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetBagOfTricks(),
        BagOfTricksDefaultEntryHolder.defaultEntry,
        4);
    if (sentiment_ != org.example.grpc.EmployeeType.PERMANENT.getNumber()) {
      output.writeEnum(5, sentiment_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (age_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, age_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < technologies_.size(); i++) {
        dataSize += computeStringSizeNoTag(technologies_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTechnologiesList().size();
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetBagOfTricks().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      bagOfTricks__ = BagOfTricksDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, bagOfTricks__);
    }
    if (sentiment_ != org.example.grpc.EmployeeType.PERMANENT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, sentiment_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.example.grpc.EmployeeRequest)) {
      return super.equals(obj);
    }
    org.example.grpc.EmployeeRequest other = (org.example.grpc.EmployeeRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (getAge()
        != other.getAge()) return false;
    if (!getTechnologiesList()
        .equals(other.getTechnologiesList())) return false;
    if (!internalGetBagOfTricks().equals(
        other.internalGetBagOfTricks())) return false;
    if (sentiment_ != other.sentiment_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + AGE_FIELD_NUMBER;
    hash = (53 * hash) + getAge();
    if (getTechnologiesCount() > 0) {
      hash = (37 * hash) + TECHNOLOGIES_FIELD_NUMBER;
      hash = (53 * hash) + getTechnologiesList().hashCode();
    }
    if (!internalGetBagOfTricks().getMap().isEmpty()) {
      hash = (37 * hash) + BAGOFTRICKS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetBagOfTricks().hashCode();
    }
    hash = (37 * hash) + SENTIMENT_FIELD_NUMBER;
    hash = (53 * hash) + sentiment_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.grpc.EmployeeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.grpc.EmployeeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.example.grpc.EmployeeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.grpc.EmployeeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.grpc.EmployeeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code EmployeeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EmployeeRequest)
      org.example.grpc.EmployeeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.grpc.EmployeeServiceOuterClass.internal_static_EmployeeRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetBagOfTricks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetMutableBagOfTricks();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.grpc.EmployeeServiceOuterClass.internal_static_EmployeeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.grpc.EmployeeRequest.class, org.example.grpc.EmployeeRequest.Builder.class);
    }

    // Construct using org.example.grpc.EmployeeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      age_ = 0;

      technologies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableBagOfTricks().clear();
      sentiment_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.grpc.EmployeeServiceOuterClass.internal_static_EmployeeRequest_descriptor;
    }

    @java.lang.Override
    public org.example.grpc.EmployeeRequest getDefaultInstanceForType() {
      return org.example.grpc.EmployeeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.grpc.EmployeeRequest build() {
      org.example.grpc.EmployeeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.grpc.EmployeeRequest buildPartial() {
      org.example.grpc.EmployeeRequest result = new org.example.grpc.EmployeeRequest(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.age_ = age_;
      if (((bitField0_ & 0x00000001) != 0)) {
        technologies_ = technologies_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.technologies_ = technologies_;
      result.bagOfTricks_ = internalGetBagOfTricks();
      result.bagOfTricks_.makeImmutable();
      result.sentiment_ = sentiment_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.grpc.EmployeeRequest) {
        return mergeFrom((org.example.grpc.EmployeeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.grpc.EmployeeRequest other) {
      if (other == org.example.grpc.EmployeeRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getAge() != 0) {
        setAge(other.getAge());
      }
      if (!other.technologies_.isEmpty()) {
        if (technologies_.isEmpty()) {
          technologies_ = other.technologies_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTechnologiesIsMutable();
          technologies_.addAll(other.technologies_);
        }
        onChanged();
      }
      internalGetMutableBagOfTricks().mergeFrom(
          other.internalGetBagOfTricks());
      if (other.sentiment_ != 0) {
        setSentimentValue(other.getSentimentValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.example.grpc.EmployeeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.example.grpc.EmployeeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int age_ ;
    /**
     * <code>int32 age = 2;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
    }
    /**
     * <code>int32 age = 2;</code>
     * @param value The age to set.
     * @return This builder for chaining.
     */
    public Builder setAge(int value) {
      
      age_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 age = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAge() {
      
      age_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList technologies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureTechnologiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        technologies_ = new com.google.protobuf.LazyStringArrayList(technologies_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @return A list containing the technologies.
     */
    public com.google.protobuf.ProtocolStringList
        getTechnologiesList() {
      return technologies_.getUnmodifiableView();
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @return The count of technologies.
     */
    public int getTechnologiesCount() {
      return technologies_.size();
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @param index The index of the element to return.
     * @return The technologies at the given index.
     */
    public java.lang.String getTechnologies(int index) {
      return technologies_.get(index);
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the technologies at the given index.
     */
    public com.google.protobuf.ByteString
        getTechnologiesBytes(int index) {
      return technologies_.getByteString(index);
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @param index The index to set the value at.
     * @param value The technologies to set.
     * @return This builder for chaining.
     */
    public Builder setTechnologies(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTechnologiesIsMutable();
      technologies_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @param value The technologies to add.
     * @return This builder for chaining.
     */
    public Builder addTechnologies(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureTechnologiesIsMutable();
      technologies_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @param values The technologies to add.
     * @return This builder for chaining.
     */
    public Builder addAllTechnologies(
        java.lang.Iterable<java.lang.String> values) {
      ensureTechnologiesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, technologies_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTechnologies() {
      technologies_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string technologies = 3;</code>
     * @param value The bytes of the technologies to add.
     * @return This builder for chaining.
     */
    public Builder addTechnologiesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureTechnologiesIsMutable();
      technologies_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> bagOfTricks_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetBagOfTricks() {
      if (bagOfTricks_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            BagOfTricksDefaultEntryHolder.defaultEntry);
      }
      return bagOfTricks_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableBagOfTricks() {
      onChanged();;
      if (bagOfTricks_ == null) {
        bagOfTricks_ = com.google.protobuf.MapField.newMapField(
            BagOfTricksDefaultEntryHolder.defaultEntry);
      }
      if (!bagOfTricks_.isMutable()) {
        bagOfTricks_ = bagOfTricks_.copy();
      }
      return bagOfTricks_;
    }

    public int getBagOfTricksCount() {
      return internalGetBagOfTricks().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    @java.lang.Override
    public boolean containsBagOfTricks(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetBagOfTricks().getMap().containsKey(key);
    }
    /**
     * Use {@link #getBagOfTricksMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getBagOfTricks() {
      return getBagOfTricksMap();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getBagOfTricksMap() {
      return internalGetBagOfTricks().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */
    @java.lang.Override

    public java.lang.String getBagOfTricksOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBagOfTricks().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */
    @java.lang.Override

    public java.lang.String getBagOfTricksOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetBagOfTricks().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearBagOfTricks() {
      internalGetMutableBagOfTricks().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public Builder removeBagOfTricks(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBagOfTricks().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableBagOfTricks() {
      return internalGetMutableBagOfTricks().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */
    public Builder putBagOfTricks(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableBagOfTricks().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; bagOfTricks = 4;</code>
     */

    public Builder putAllBagOfTricks(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableBagOfTricks().getMutableMap()
          .putAll(values);
      return this;
    }

    private int sentiment_ = 0;
    /**
     * <code>.EmployeeType sentiment = 5;</code>
     * @return The enum numeric value on the wire for sentiment.
     */
    @java.lang.Override public int getSentimentValue() {
      return sentiment_;
    }
    /**
     * <code>.EmployeeType sentiment = 5;</code>
     * @param value The enum numeric value on the wire for sentiment to set.
     * @return This builder for chaining.
     */
    public Builder setSentimentValue(int value) {
      
      sentiment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.EmployeeType sentiment = 5;</code>
     * @return The sentiment.
     */
    @java.lang.Override
    public org.example.grpc.EmployeeType getSentiment() {
      @SuppressWarnings("deprecation")
      org.example.grpc.EmployeeType result = org.example.grpc.EmployeeType.valueOf(sentiment_);
      return result == null ? org.example.grpc.EmployeeType.UNRECOGNIZED : result;
    }
    /**
     * <code>.EmployeeType sentiment = 5;</code>
     * @param value The sentiment to set.
     * @return This builder for chaining.
     */
    public Builder setSentiment(org.example.grpc.EmployeeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      sentiment_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.EmployeeType sentiment = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSentiment() {
      
      sentiment_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:EmployeeRequest)
  }

  // @@protoc_insertion_point(class_scope:EmployeeRequest)
  private static final org.example.grpc.EmployeeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.grpc.EmployeeRequest();
  }

  public static org.example.grpc.EmployeeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmployeeRequest>
      PARSER = new com.google.protobuf.AbstractParser<EmployeeRequest>() {
    @java.lang.Override
    public EmployeeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmployeeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmployeeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmployeeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.grpc.EmployeeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

