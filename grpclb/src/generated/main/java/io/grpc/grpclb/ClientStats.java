// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: load_balancer.proto

package io.grpc.grpclb;

/**
 * <pre>
 * Contains client level statistics that are useful to load balancing. Each
 * count except the timestamp should be reset to zero after reporting the stats.
 * </pre>
 *
 * Protobuf type {@code grpc.lb.v1.ClientStats}
 */
public  final class ClientStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.lb.v1.ClientStats)
    ClientStatsOrBuilder {
  // Use ClientStats.newBuilder() to construct.
  private ClientStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientStats() {
    numCallsStarted_ = 0L;
    numCallsFinished_ = 0L;
    numCallsFinishedWithDropForRateLimiting_ = 0L;
    numCallsFinishedWithDropForLoadBalancing_ = 0L;
    numCallsFinishedWithClientFailedToSend_ = 0L;
    numCallsFinishedKnownReceived_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClientStats(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (timestamp_ != null) {
              subBuilder = timestamp_.toBuilder();
            }
            timestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(timestamp_);
              timestamp_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            numCallsStarted_ = input.readInt64();
            break;
          }
          case 24: {

            numCallsFinished_ = input.readInt64();
            break;
          }
          case 32: {

            numCallsFinishedWithDropForRateLimiting_ = input.readInt64();
            break;
          }
          case 40: {

            numCallsFinishedWithDropForLoadBalancing_ = input.readInt64();
            break;
          }
          case 48: {

            numCallsFinishedWithClientFailedToSend_ = input.readInt64();
            break;
          }
          case 56: {

            numCallsFinishedKnownReceived_ = input.readInt64();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_ClientStats_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_ClientStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.grpclb.ClientStats.class, io.grpc.grpclb.ClientStats.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp timestamp_;
  /**
   * <pre>
   * The timestamp of generating the report.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  public boolean hasTimestamp() {
    return timestamp_ != null;
  }
  /**
   * <pre>
   * The timestamp of generating the report.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  public com.google.protobuf.Timestamp getTimestamp() {
    return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
  }
  /**
   * <pre>
   * The timestamp of generating the report.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
    return getTimestamp();
  }

  public static final int NUM_CALLS_STARTED_FIELD_NUMBER = 2;
  private long numCallsStarted_;
  /**
   * <pre>
   * The total number of RPCs that started.
   * </pre>
   *
   * <code>int64 num_calls_started = 2;</code>
   */
  public long getNumCallsStarted() {
    return numCallsStarted_;
  }

  public static final int NUM_CALLS_FINISHED_FIELD_NUMBER = 3;
  private long numCallsFinished_;
  /**
   * <pre>
   * The total number of RPCs that finished.
   * </pre>
   *
   * <code>int64 num_calls_finished = 3;</code>
   */
  public long getNumCallsFinished() {
    return numCallsFinished_;
  }

  public static final int NUM_CALLS_FINISHED_WITH_DROP_FOR_RATE_LIMITING_FIELD_NUMBER = 4;
  private long numCallsFinishedWithDropForRateLimiting_;
  /**
   * <pre>
   * The total number of RPCs that were dropped by the client because of rate
   * limiting.
   * </pre>
   *
   * <code>int64 num_calls_finished_with_drop_for_rate_limiting = 4;</code>
   */
  public long getNumCallsFinishedWithDropForRateLimiting() {
    return numCallsFinishedWithDropForRateLimiting_;
  }

  public static final int NUM_CALLS_FINISHED_WITH_DROP_FOR_LOAD_BALANCING_FIELD_NUMBER = 5;
  private long numCallsFinishedWithDropForLoadBalancing_;
  /**
   * <pre>
   * The total number of RPCs that were dropped by the client because of load
   * balancing.
   * </pre>
   *
   * <code>int64 num_calls_finished_with_drop_for_load_balancing = 5;</code>
   */
  public long getNumCallsFinishedWithDropForLoadBalancing() {
    return numCallsFinishedWithDropForLoadBalancing_;
  }

  public static final int NUM_CALLS_FINISHED_WITH_CLIENT_FAILED_TO_SEND_FIELD_NUMBER = 6;
  private long numCallsFinishedWithClientFailedToSend_;
  /**
   * <pre>
   * The total number of RPCs that failed to reach a server except dropped RPCs.
   * </pre>
   *
   * <code>int64 num_calls_finished_with_client_failed_to_send = 6;</code>
   */
  public long getNumCallsFinishedWithClientFailedToSend() {
    return numCallsFinishedWithClientFailedToSend_;
  }

  public static final int NUM_CALLS_FINISHED_KNOWN_RECEIVED_FIELD_NUMBER = 7;
  private long numCallsFinishedKnownReceived_;
  /**
   * <pre>
   * The total number of RPCs that finished and are known to have been received
   * by a server.
   * </pre>
   *
   * <code>int64 num_calls_finished_known_received = 7;</code>
   */
  public long getNumCallsFinishedKnownReceived() {
    return numCallsFinishedKnownReceived_;
  }

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
    if (timestamp_ != null) {
      output.writeMessage(1, getTimestamp());
    }
    if (numCallsStarted_ != 0L) {
      output.writeInt64(2, numCallsStarted_);
    }
    if (numCallsFinished_ != 0L) {
      output.writeInt64(3, numCallsFinished_);
    }
    if (numCallsFinishedWithDropForRateLimiting_ != 0L) {
      output.writeInt64(4, numCallsFinishedWithDropForRateLimiting_);
    }
    if (numCallsFinishedWithDropForLoadBalancing_ != 0L) {
      output.writeInt64(5, numCallsFinishedWithDropForLoadBalancing_);
    }
    if (numCallsFinishedWithClientFailedToSend_ != 0L) {
      output.writeInt64(6, numCallsFinishedWithClientFailedToSend_);
    }
    if (numCallsFinishedKnownReceived_ != 0L) {
      output.writeInt64(7, numCallsFinishedKnownReceived_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTimestamp());
    }
    if (numCallsStarted_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, numCallsStarted_);
    }
    if (numCallsFinished_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, numCallsFinished_);
    }
    if (numCallsFinishedWithDropForRateLimiting_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, numCallsFinishedWithDropForRateLimiting_);
    }
    if (numCallsFinishedWithDropForLoadBalancing_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, numCallsFinishedWithDropForLoadBalancing_);
    }
    if (numCallsFinishedWithClientFailedToSend_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, numCallsFinishedWithClientFailedToSend_);
    }
    if (numCallsFinishedKnownReceived_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, numCallsFinishedKnownReceived_);
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
    if (!(obj instanceof io.grpc.grpclb.ClientStats)) {
      return super.equals(obj);
    }
    io.grpc.grpclb.ClientStats other = (io.grpc.grpclb.ClientStats) obj;

    boolean result = true;
    result = result && (hasTimestamp() == other.hasTimestamp());
    if (hasTimestamp()) {
      result = result && getTimestamp()
          .equals(other.getTimestamp());
    }
    result = result && (getNumCallsStarted()
        == other.getNumCallsStarted());
    result = result && (getNumCallsFinished()
        == other.getNumCallsFinished());
    result = result && (getNumCallsFinishedWithDropForRateLimiting()
        == other.getNumCallsFinishedWithDropForRateLimiting());
    result = result && (getNumCallsFinishedWithDropForLoadBalancing()
        == other.getNumCallsFinishedWithDropForLoadBalancing());
    result = result && (getNumCallsFinishedWithClientFailedToSend()
        == other.getNumCallsFinishedWithClientFailedToSend());
    result = result && (getNumCallsFinishedKnownReceived()
        == other.getNumCallsFinishedKnownReceived());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTimestamp()) {
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
    }
    hash = (37 * hash) + NUM_CALLS_STARTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCallsStarted());
    hash = (37 * hash) + NUM_CALLS_FINISHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCallsFinished());
    hash = (37 * hash) + NUM_CALLS_FINISHED_WITH_DROP_FOR_RATE_LIMITING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCallsFinishedWithDropForRateLimiting());
    hash = (37 * hash) + NUM_CALLS_FINISHED_WITH_DROP_FOR_LOAD_BALANCING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCallsFinishedWithDropForLoadBalancing());
    hash = (37 * hash) + NUM_CALLS_FINISHED_WITH_CLIENT_FAILED_TO_SEND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCallsFinishedWithClientFailedToSend());
    hash = (37 * hash) + NUM_CALLS_FINISHED_KNOWN_RECEIVED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumCallsFinishedKnownReceived());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.grpclb.ClientStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.grpclb.ClientStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.grpclb.ClientStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.grpclb.ClientStats parseFrom(
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
  public static Builder newBuilder(io.grpc.grpclb.ClientStats prototype) {
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
   * Contains client level statistics that are useful to load balancing. Each
   * count except the timestamp should be reset to zero after reporting the stats.
   * </pre>
   *
   * Protobuf type {@code grpc.lb.v1.ClientStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.lb.v1.ClientStats)
      io.grpc.grpclb.ClientStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_ClientStats_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_ClientStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.grpclb.ClientStats.class, io.grpc.grpclb.ClientStats.Builder.class);
    }

    // Construct using io.grpc.grpclb.ClientStats.newBuilder()
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
      if (timestampBuilder_ == null) {
        timestamp_ = null;
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }
      numCallsStarted_ = 0L;

      numCallsFinished_ = 0L;

      numCallsFinishedWithDropForRateLimiting_ = 0L;

      numCallsFinishedWithDropForLoadBalancing_ = 0L;

      numCallsFinishedWithClientFailedToSend_ = 0L;

      numCallsFinishedKnownReceived_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.grpclb.LoadBalancerProto.internal_static_grpc_lb_v1_ClientStats_descriptor;
    }

    public io.grpc.grpclb.ClientStats getDefaultInstanceForType() {
      return io.grpc.grpclb.ClientStats.getDefaultInstance();
    }

    public io.grpc.grpclb.ClientStats build() {
      io.grpc.grpclb.ClientStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.grpclb.ClientStats buildPartial() {
      io.grpc.grpclb.ClientStats result = new io.grpc.grpclb.ClientStats(this);
      if (timestampBuilder_ == null) {
        result.timestamp_ = timestamp_;
      } else {
        result.timestamp_ = timestampBuilder_.build();
      }
      result.numCallsStarted_ = numCallsStarted_;
      result.numCallsFinished_ = numCallsFinished_;
      result.numCallsFinishedWithDropForRateLimiting_ = numCallsFinishedWithDropForRateLimiting_;
      result.numCallsFinishedWithDropForLoadBalancing_ = numCallsFinishedWithDropForLoadBalancing_;
      result.numCallsFinishedWithClientFailedToSend_ = numCallsFinishedWithClientFailedToSend_;
      result.numCallsFinishedKnownReceived_ = numCallsFinishedKnownReceived_;
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
      if (other instanceof io.grpc.grpclb.ClientStats) {
        return mergeFrom((io.grpc.grpclb.ClientStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.grpclb.ClientStats other) {
      if (other == io.grpc.grpclb.ClientStats.getDefaultInstance()) return this;
      if (other.hasTimestamp()) {
        mergeTimestamp(other.getTimestamp());
      }
      if (other.getNumCallsStarted() != 0L) {
        setNumCallsStarted(other.getNumCallsStarted());
      }
      if (other.getNumCallsFinished() != 0L) {
        setNumCallsFinished(other.getNumCallsFinished());
      }
      if (other.getNumCallsFinishedWithDropForRateLimiting() != 0L) {
        setNumCallsFinishedWithDropForRateLimiting(other.getNumCallsFinishedWithDropForRateLimiting());
      }
      if (other.getNumCallsFinishedWithDropForLoadBalancing() != 0L) {
        setNumCallsFinishedWithDropForLoadBalancing(other.getNumCallsFinishedWithDropForLoadBalancing());
      }
      if (other.getNumCallsFinishedWithClientFailedToSend() != 0L) {
        setNumCallsFinishedWithClientFailedToSend(other.getNumCallsFinishedWithClientFailedToSend());
      }
      if (other.getNumCallsFinishedKnownReceived() != 0L) {
        setNumCallsFinishedKnownReceived(other.getNumCallsFinishedKnownReceived());
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
      io.grpc.grpclb.ClientStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.grpclb.ClientStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp timestamp_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampBuilder_;
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public boolean hasTimestamp() {
      return timestampBuilder_ != null || timestamp_ != null;
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public com.google.protobuf.Timestamp getTimestamp() {
      if (timestampBuilder_ == null) {
        return timestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      } else {
        return timestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder setTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timestamp_ = value;
        onChanged();
      } else {
        timestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder setTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampBuilder_ == null) {
        timestamp_ = builderForValue.build();
        onChanged();
      } else {
        timestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder mergeTimestamp(com.google.protobuf.Timestamp value) {
      if (timestampBuilder_ == null) {
        if (timestamp_ != null) {
          timestamp_ =
            com.google.protobuf.Timestamp.newBuilder(timestamp_).mergeFrom(value).buildPartial();
        } else {
          timestamp_ = value;
        }
        onChanged();
      } else {
        timestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public Builder clearTimestamp() {
      if (timestampBuilder_ == null) {
        timestamp_ = null;
        onChanged();
      } else {
        timestamp_ = null;
        timestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampBuilder() {
      
      onChanged();
      return getTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder() {
      if (timestampBuilder_ != null) {
        return timestampBuilder_.getMessageOrBuilder();
      } else {
        return timestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : timestamp_;
      }
    }
    /**
     * <pre>
     * The timestamp of generating the report.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampFieldBuilder() {
      if (timestampBuilder_ == null) {
        timestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getTimestamp(),
                getParentForChildren(),
                isClean());
        timestamp_ = null;
      }
      return timestampBuilder_;
    }

    private long numCallsStarted_ ;
    /**
     * <pre>
     * The total number of RPCs that started.
     * </pre>
     *
     * <code>int64 num_calls_started = 2;</code>
     */
    public long getNumCallsStarted() {
      return numCallsStarted_;
    }
    /**
     * <pre>
     * The total number of RPCs that started.
     * </pre>
     *
     * <code>int64 num_calls_started = 2;</code>
     */
    public Builder setNumCallsStarted(long value) {
      
      numCallsStarted_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of RPCs that started.
     * </pre>
     *
     * <code>int64 num_calls_started = 2;</code>
     */
    public Builder clearNumCallsStarted() {
      
      numCallsStarted_ = 0L;
      onChanged();
      return this;
    }

    private long numCallsFinished_ ;
    /**
     * <pre>
     * The total number of RPCs that finished.
     * </pre>
     *
     * <code>int64 num_calls_finished = 3;</code>
     */
    public long getNumCallsFinished() {
      return numCallsFinished_;
    }
    /**
     * <pre>
     * The total number of RPCs that finished.
     * </pre>
     *
     * <code>int64 num_calls_finished = 3;</code>
     */
    public Builder setNumCallsFinished(long value) {
      
      numCallsFinished_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of RPCs that finished.
     * </pre>
     *
     * <code>int64 num_calls_finished = 3;</code>
     */
    public Builder clearNumCallsFinished() {
      
      numCallsFinished_ = 0L;
      onChanged();
      return this;
    }

    private long numCallsFinishedWithDropForRateLimiting_ ;
    /**
     * <pre>
     * The total number of RPCs that were dropped by the client because of rate
     * limiting.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_drop_for_rate_limiting = 4;</code>
     */
    public long getNumCallsFinishedWithDropForRateLimiting() {
      return numCallsFinishedWithDropForRateLimiting_;
    }
    /**
     * <pre>
     * The total number of RPCs that were dropped by the client because of rate
     * limiting.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_drop_for_rate_limiting = 4;</code>
     */
    public Builder setNumCallsFinishedWithDropForRateLimiting(long value) {
      
      numCallsFinishedWithDropForRateLimiting_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of RPCs that were dropped by the client because of rate
     * limiting.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_drop_for_rate_limiting = 4;</code>
     */
    public Builder clearNumCallsFinishedWithDropForRateLimiting() {
      
      numCallsFinishedWithDropForRateLimiting_ = 0L;
      onChanged();
      return this;
    }

    private long numCallsFinishedWithDropForLoadBalancing_ ;
    /**
     * <pre>
     * The total number of RPCs that were dropped by the client because of load
     * balancing.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_drop_for_load_balancing = 5;</code>
     */
    public long getNumCallsFinishedWithDropForLoadBalancing() {
      return numCallsFinishedWithDropForLoadBalancing_;
    }
    /**
     * <pre>
     * The total number of RPCs that were dropped by the client because of load
     * balancing.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_drop_for_load_balancing = 5;</code>
     */
    public Builder setNumCallsFinishedWithDropForLoadBalancing(long value) {
      
      numCallsFinishedWithDropForLoadBalancing_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of RPCs that were dropped by the client because of load
     * balancing.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_drop_for_load_balancing = 5;</code>
     */
    public Builder clearNumCallsFinishedWithDropForLoadBalancing() {
      
      numCallsFinishedWithDropForLoadBalancing_ = 0L;
      onChanged();
      return this;
    }

    private long numCallsFinishedWithClientFailedToSend_ ;
    /**
     * <pre>
     * The total number of RPCs that failed to reach a server except dropped RPCs.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_client_failed_to_send = 6;</code>
     */
    public long getNumCallsFinishedWithClientFailedToSend() {
      return numCallsFinishedWithClientFailedToSend_;
    }
    /**
     * <pre>
     * The total number of RPCs that failed to reach a server except dropped RPCs.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_client_failed_to_send = 6;</code>
     */
    public Builder setNumCallsFinishedWithClientFailedToSend(long value) {
      
      numCallsFinishedWithClientFailedToSend_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of RPCs that failed to reach a server except dropped RPCs.
     * </pre>
     *
     * <code>int64 num_calls_finished_with_client_failed_to_send = 6;</code>
     */
    public Builder clearNumCallsFinishedWithClientFailedToSend() {
      
      numCallsFinishedWithClientFailedToSend_ = 0L;
      onChanged();
      return this;
    }

    private long numCallsFinishedKnownReceived_ ;
    /**
     * <pre>
     * The total number of RPCs that finished and are known to have been received
     * by a server.
     * </pre>
     *
     * <code>int64 num_calls_finished_known_received = 7;</code>
     */
    public long getNumCallsFinishedKnownReceived() {
      return numCallsFinishedKnownReceived_;
    }
    /**
     * <pre>
     * The total number of RPCs that finished and are known to have been received
     * by a server.
     * </pre>
     *
     * <code>int64 num_calls_finished_known_received = 7;</code>
     */
    public Builder setNumCallsFinishedKnownReceived(long value) {
      
      numCallsFinishedKnownReceived_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The total number of RPCs that finished and are known to have been received
     * by a server.
     * </pre>
     *
     * <code>int64 num_calls_finished_known_received = 7;</code>
     */
    public Builder clearNumCallsFinishedKnownReceived() {
      
      numCallsFinishedKnownReceived_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:grpc.lb.v1.ClientStats)
  }

  // @@protoc_insertion_point(class_scope:grpc.lb.v1.ClientStats)
  private static final io.grpc.grpclb.ClientStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.grpclb.ClientStats();
  }

  public static io.grpc.grpclb.ClientStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientStats>
      PARSER = new com.google.protobuf.AbstractParser<ClientStats>() {
    public ClientStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientStats> getParserForType() {
    return PARSER;
  }

  public io.grpc.grpclb.ClientStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

