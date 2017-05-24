// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/reflection/v1alpha/reflection.proto

package io.grpc.reflection.v1alpha;

/**
 * <pre>
 * A list of extension numbers sent by the server answering
 * all_extension_numbers_of_type request.
 * </pre>
 *
 * Protobuf type {@code grpc.reflection.v1alpha.ExtensionNumberResponse}
 */
public  final class ExtensionNumberResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.reflection.v1alpha.ExtensionNumberResponse)
    ExtensionNumberResponseOrBuilder {
  // Use ExtensionNumberResponse.newBuilder() to construct.
  private ExtensionNumberResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExtensionNumberResponse() {
    baseTypeName_ = "";
    extensionNumber_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ExtensionNumberResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            baseTypeName_ = s;
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              extensionNumber_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            extensionNumber_.add(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
              extensionNumber_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              extensionNumber_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        extensionNumber_ = java.util.Collections.unmodifiableList(extensionNumber_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.reflection.v1alpha.ExtensionNumberResponse.class, io.grpc.reflection.v1alpha.ExtensionNumberResponse.Builder.class);
  }

  private int bitField0_;
  public static final int BASE_TYPE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object baseTypeName_;
  /**
   * <pre>
   * Full name of the base type, including the package name. The format
   * is &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string base_type_name = 1;</code>
   */
  public java.lang.String getBaseTypeName() {
    java.lang.Object ref = baseTypeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseTypeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Full name of the base type, including the package name. The format
   * is &lt;package&gt;.&lt;type&gt;
   * </pre>
   *
   * <code>string base_type_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBaseTypeNameBytes() {
    java.lang.Object ref = baseTypeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseTypeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENSION_NUMBER_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> extensionNumber_;
  /**
   * <code>repeated int32 extension_number = 2;</code>
   */
  public java.util.List<java.lang.Integer>
      getExtensionNumberList() {
    return extensionNumber_;
  }
  /**
   * <code>repeated int32 extension_number = 2;</code>
   */
  public int getExtensionNumberCount() {
    return extensionNumber_.size();
  }
  /**
   * <code>repeated int32 extension_number = 2;</code>
   */
  public int getExtensionNumber(int index) {
    return extensionNumber_.get(index);
  }
  private int extensionNumberMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (!getBaseTypeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, baseTypeName_);
    }
    if (getExtensionNumberList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(extensionNumberMemoizedSerializedSize);
    }
    for (int i = 0; i < extensionNumber_.size(); i++) {
      output.writeInt32NoTag(extensionNumber_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBaseTypeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, baseTypeName_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < extensionNumber_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(extensionNumber_.get(i));
      }
      size += dataSize;
      if (!getExtensionNumberList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      extensionNumberMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.reflection.v1alpha.ExtensionNumberResponse)) {
      return super.equals(obj);
    }
    io.grpc.reflection.v1alpha.ExtensionNumberResponse other = (io.grpc.reflection.v1alpha.ExtensionNumberResponse) obj;

    boolean result = true;
    result = result && getBaseTypeName()
        .equals(other.getBaseTypeName());
    result = result && getExtensionNumberList()
        .equals(other.getExtensionNumberList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BASE_TYPE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBaseTypeName().hashCode();
    if (getExtensionNumberCount() > 0) {
      hash = (37 * hash) + EXTENSION_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionNumberList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.reflection.v1alpha.ExtensionNumberResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * A list of extension numbers sent by the server answering
   * all_extension_numbers_of_type request.
   * </pre>
   *
   * Protobuf type {@code grpc.reflection.v1alpha.ExtensionNumberResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.reflection.v1alpha.ExtensionNumberResponse)
      io.grpc.reflection.v1alpha.ExtensionNumberResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.reflection.v1alpha.ExtensionNumberResponse.class, io.grpc.reflection.v1alpha.ExtensionNumberResponse.Builder.class);
    }

    // Construct using io.grpc.reflection.v1alpha.ExtensionNumberResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      baseTypeName_ = "";

      extensionNumber_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.reflection.v1alpha.ServerReflectionProto.internal_static_grpc_reflection_v1alpha_ExtensionNumberResponse_descriptor;
    }

    public io.grpc.reflection.v1alpha.ExtensionNumberResponse getDefaultInstanceForType() {
      return io.grpc.reflection.v1alpha.ExtensionNumberResponse.getDefaultInstance();
    }

    public io.grpc.reflection.v1alpha.ExtensionNumberResponse build() {
      io.grpc.reflection.v1alpha.ExtensionNumberResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.reflection.v1alpha.ExtensionNumberResponse buildPartial() {
      io.grpc.reflection.v1alpha.ExtensionNumberResponse result = new io.grpc.reflection.v1alpha.ExtensionNumberResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.baseTypeName_ = baseTypeName_;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        extensionNumber_ = java.util.Collections.unmodifiableList(extensionNumber_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.extensionNumber_ = extensionNumber_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.reflection.v1alpha.ExtensionNumberResponse) {
        return mergeFrom((io.grpc.reflection.v1alpha.ExtensionNumberResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.reflection.v1alpha.ExtensionNumberResponse other) {
      if (other == io.grpc.reflection.v1alpha.ExtensionNumberResponse.getDefaultInstance()) return this;
      if (!other.getBaseTypeName().isEmpty()) {
        baseTypeName_ = other.baseTypeName_;
        onChanged();
      }
      if (!other.extensionNumber_.isEmpty()) {
        if (extensionNumber_.isEmpty()) {
          extensionNumber_ = other.extensionNumber_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureExtensionNumberIsMutable();
          extensionNumber_.addAll(other.extensionNumber_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.reflection.v1alpha.ExtensionNumberResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.reflection.v1alpha.ExtensionNumberResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object baseTypeName_ = "";
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     */
    public java.lang.String getBaseTypeName() {
      java.lang.Object ref = baseTypeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseTypeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBaseTypeNameBytes() {
      java.lang.Object ref = baseTypeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseTypeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     */
    public Builder setBaseTypeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      baseTypeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     */
    public Builder clearBaseTypeName() {
      
      baseTypeName_ = getDefaultInstance().getBaseTypeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Full name of the base type, including the package name. The format
     * is &lt;package&gt;.&lt;type&gt;
     * </pre>
     *
     * <code>string base_type_name = 1;</code>
     */
    public Builder setBaseTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      baseTypeName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> extensionNumber_ = java.util.Collections.emptyList();
    private void ensureExtensionNumberIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        extensionNumber_ = new java.util.ArrayList<java.lang.Integer>(extensionNumber_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     */
    public java.util.List<java.lang.Integer>
        getExtensionNumberList() {
      return java.util.Collections.unmodifiableList(extensionNumber_);
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     */
    public int getExtensionNumberCount() {
      return extensionNumber_.size();
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     */
    public int getExtensionNumber(int index) {
      return extensionNumber_.get(index);
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     */
    public Builder setExtensionNumber(
        int index, int value) {
      ensureExtensionNumberIsMutable();
      extensionNumber_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     */
    public Builder addExtensionNumber(int value) {
      ensureExtensionNumberIsMutable();
      extensionNumber_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     */
    public Builder addAllExtensionNumber(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureExtensionNumberIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, extensionNumber_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 extension_number = 2;</code>
     */
    public Builder clearExtensionNumber() {
      extensionNumber_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:grpc.reflection.v1alpha.ExtensionNumberResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.reflection.v1alpha.ExtensionNumberResponse)
  private static final io.grpc.reflection.v1alpha.ExtensionNumberResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.reflection.v1alpha.ExtensionNumberResponse();
  }

  public static io.grpc.reflection.v1alpha.ExtensionNumberResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExtensionNumberResponse>
      PARSER = new com.google.protobuf.AbstractParser<ExtensionNumberResponse>() {
    public ExtensionNumberResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ExtensionNumberResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExtensionNumberResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExtensionNumberResponse> getParserForType() {
    return PARSER;
  }

  public io.grpc.reflection.v1alpha.ExtensionNumberResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

