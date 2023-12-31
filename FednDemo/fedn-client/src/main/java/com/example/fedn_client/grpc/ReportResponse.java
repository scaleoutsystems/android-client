// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fedn.proto

package com.example.fedn_client.grpc;

/**
 * Protobuf type {@code grpc.ReportResponse}
 */
public final class ReportResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.ReportResponse)
    ReportResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportResponse.newBuilder() to construct.
  private ReportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportResponse() {
    parameter_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.fedn_client.grpc.Fedn.internal_static_grpc_ReportResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.fedn_client.grpc.Fedn.internal_static_grpc_ReportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.fedn_client.grpc.ReportResponse.class, com.example.fedn_client.grpc.ReportResponse.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  private com.example.fedn_client.grpc.Client sender_;
  /**
   * <code>.grpc.Client sender = 1;</code>
   * @return Whether the sender field is set.
   */
  @java.lang.Override
  public boolean hasSender() {
    return sender_ != null;
  }
  /**
   * <code>.grpc.Client sender = 1;</code>
   * @return The sender.
   */
  @java.lang.Override
  public com.example.fedn_client.grpc.Client getSender() {
    return sender_ == null ? com.example.fedn_client.grpc.Client.getDefaultInstance() : sender_;
  }
  /**
   * <code>.grpc.Client sender = 1;</code>
   */
  @java.lang.Override
  public com.example.fedn_client.grpc.ClientOrBuilder getSenderOrBuilder() {
    return sender_ == null ? com.example.fedn_client.grpc.Client.getDefaultInstance() : sender_;
  }

  public static final int PARAMETER_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.example.fedn_client.grpc.Parameter> parameter_;
  /**
   * <code>repeated .grpc.Parameter parameter = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.example.fedn_client.grpc.Parameter> getParameterList() {
    return parameter_;
  }
  /**
   * <code>repeated .grpc.Parameter parameter = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.example.fedn_client.grpc.ParameterOrBuilder> 
      getParameterOrBuilderList() {
    return parameter_;
  }
  /**
   * <code>repeated .grpc.Parameter parameter = 2;</code>
   */
  @java.lang.Override
  public int getParameterCount() {
    return parameter_.size();
  }
  /**
   * <code>repeated .grpc.Parameter parameter = 2;</code>
   */
  @java.lang.Override
  public com.example.fedn_client.grpc.Parameter getParameter(int index) {
    return parameter_.get(index);
  }
  /**
   * <code>repeated .grpc.Parameter parameter = 2;</code>
   */
  @java.lang.Override
  public com.example.fedn_client.grpc.ParameterOrBuilder getParameterOrBuilder(
      int index) {
    return parameter_.get(index);
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
    if (sender_ != null) {
      output.writeMessage(1, getSender());
    }
    for (int i = 0; i < parameter_.size(); i++) {
      output.writeMessage(2, parameter_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sender_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSender());
    }
    for (int i = 0; i < parameter_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, parameter_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.fedn_client.grpc.ReportResponse)) {
      return super.equals(obj);
    }
    com.example.fedn_client.grpc.ReportResponse other = (com.example.fedn_client.grpc.ReportResponse) obj;

    if (hasSender() != other.hasSender()) return false;
    if (hasSender()) {
      if (!getSender()
          .equals(other.getSender())) return false;
    }
    if (!getParameterList()
        .equals(other.getParameterList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSender()) {
      hash = (37 * hash) + SENDER_FIELD_NUMBER;
      hash = (53 * hash) + getSender().hashCode();
    }
    if (getParameterCount() > 0) {
      hash = (37 * hash) + PARAMETER_FIELD_NUMBER;
      hash = (53 * hash) + getParameterList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.example.fedn_client.grpc.ReportResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.example.fedn_client.grpc.ReportResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.fedn_client.grpc.ReportResponse parseFrom(
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
  public static Builder newBuilder(com.example.fedn_client.grpc.ReportResponse prototype) {
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
   * Protobuf type {@code grpc.ReportResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.ReportResponse)
      com.example.fedn_client.grpc.ReportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.fedn_client.grpc.Fedn.internal_static_grpc_ReportResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.fedn_client.grpc.Fedn.internal_static_grpc_ReportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.fedn_client.grpc.ReportResponse.class, com.example.fedn_client.grpc.ReportResponse.Builder.class);
    }

    // Construct using com.example.fedn_client.grpc.ReportResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sender_ = null;
      if (senderBuilder_ != null) {
        senderBuilder_.dispose();
        senderBuilder_ = null;
      }
      if (parameterBuilder_ == null) {
        parameter_ = java.util.Collections.emptyList();
      } else {
        parameter_ = null;
        parameterBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.fedn_client.grpc.Fedn.internal_static_grpc_ReportResponse_descriptor;
    }

    @java.lang.Override
    public com.example.fedn_client.grpc.ReportResponse getDefaultInstanceForType() {
      return com.example.fedn_client.grpc.ReportResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.fedn_client.grpc.ReportResponse build() {
      com.example.fedn_client.grpc.ReportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.fedn_client.grpc.ReportResponse buildPartial() {
      com.example.fedn_client.grpc.ReportResponse result = new com.example.fedn_client.grpc.ReportResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.example.fedn_client.grpc.ReportResponse result) {
      if (parameterBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          parameter_ = java.util.Collections.unmodifiableList(parameter_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.parameter_ = parameter_;
      } else {
        result.parameter_ = parameterBuilder_.build();
      }
    }

    private void buildPartial0(com.example.fedn_client.grpc.ReportResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = senderBuilder_ == null
            ? sender_
            : senderBuilder_.build();
      }
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
      if (other instanceof com.example.fedn_client.grpc.ReportResponse) {
        return mergeFrom((com.example.fedn_client.grpc.ReportResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.fedn_client.grpc.ReportResponse other) {
      if (other == com.example.fedn_client.grpc.ReportResponse.getDefaultInstance()) return this;
      if (other.hasSender()) {
        mergeSender(other.getSender());
      }
      if (parameterBuilder_ == null) {
        if (!other.parameter_.isEmpty()) {
          if (parameter_.isEmpty()) {
            parameter_ = other.parameter_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureParameterIsMutable();
            parameter_.addAll(other.parameter_);
          }
          onChanged();
        }
      } else {
        if (!other.parameter_.isEmpty()) {
          if (parameterBuilder_.isEmpty()) {
            parameterBuilder_.dispose();
            parameterBuilder_ = null;
            parameter_ = other.parameter_;
            bitField0_ = (bitField0_ & ~0x00000002);
            parameterBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParameterFieldBuilder() : null;
          } else {
            parameterBuilder_.addAllMessages(other.parameter_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getSenderFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.example.fedn_client.grpc.Parameter m =
                  input.readMessage(
                      com.example.fedn_client.grpc.Parameter.parser(),
                      extensionRegistry);
              if (parameterBuilder_ == null) {
                ensureParameterIsMutable();
                parameter_.add(m);
              } else {
                parameterBuilder_.addMessage(m);
              }
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.example.fedn_client.grpc.Client sender_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.fedn_client.grpc.Client, com.example.fedn_client.grpc.Client.Builder, com.example.fedn_client.grpc.ClientOrBuilder> senderBuilder_;
    /**
     * <code>.grpc.Client sender = 1;</code>
     * @return Whether the sender field is set.
     */
    public boolean hasSender() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     * @return The sender.
     */
    public com.example.fedn_client.grpc.Client getSender() {
      if (senderBuilder_ == null) {
        return sender_ == null ? com.example.fedn_client.grpc.Client.getDefaultInstance() : sender_;
      } else {
        return senderBuilder_.getMessage();
      }
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     */
    public Builder setSender(com.example.fedn_client.grpc.Client value) {
      if (senderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sender_ = value;
      } else {
        senderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     */
    public Builder setSender(
        com.example.fedn_client.grpc.Client.Builder builderForValue) {
      if (senderBuilder_ == null) {
        sender_ = builderForValue.build();
      } else {
        senderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     */
    public Builder mergeSender(com.example.fedn_client.grpc.Client value) {
      if (senderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          sender_ != null &&
          sender_ != com.example.fedn_client.grpc.Client.getDefaultInstance()) {
          getSenderBuilder().mergeFrom(value);
        } else {
          sender_ = value;
        }
      } else {
        senderBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sender_ = null;
      if (senderBuilder_ != null) {
        senderBuilder_.dispose();
        senderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     */
    public com.example.fedn_client.grpc.Client.Builder getSenderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSenderFieldBuilder().getBuilder();
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     */
    public com.example.fedn_client.grpc.ClientOrBuilder getSenderOrBuilder() {
      if (senderBuilder_ != null) {
        return senderBuilder_.getMessageOrBuilder();
      } else {
        return sender_ == null ?
            com.example.fedn_client.grpc.Client.getDefaultInstance() : sender_;
      }
    }
    /**
     * <code>.grpc.Client sender = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.example.fedn_client.grpc.Client, com.example.fedn_client.grpc.Client.Builder, com.example.fedn_client.grpc.ClientOrBuilder> 
        getSenderFieldBuilder() {
      if (senderBuilder_ == null) {
        senderBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.example.fedn_client.grpc.Client, com.example.fedn_client.grpc.Client.Builder, com.example.fedn_client.grpc.ClientOrBuilder>(
                getSender(),
                getParentForChildren(),
                isClean());
        sender_ = null;
      }
      return senderBuilder_;
    }

    private java.util.List<com.example.fedn_client.grpc.Parameter> parameter_ =
      java.util.Collections.emptyList();
    private void ensureParameterIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        parameter_ = new java.util.ArrayList<com.example.fedn_client.grpc.Parameter>(parameter_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.fedn_client.grpc.Parameter, com.example.fedn_client.grpc.Parameter.Builder, com.example.fedn_client.grpc.ParameterOrBuilder> parameterBuilder_;

    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public java.util.List<com.example.fedn_client.grpc.Parameter> getParameterList() {
      if (parameterBuilder_ == null) {
        return java.util.Collections.unmodifiableList(parameter_);
      } else {
        return parameterBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public int getParameterCount() {
      if (parameterBuilder_ == null) {
        return parameter_.size();
      } else {
        return parameterBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public com.example.fedn_client.grpc.Parameter getParameter(int index) {
      if (parameterBuilder_ == null) {
        return parameter_.get(index);
      } else {
        return parameterBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder setParameter(
        int index, com.example.fedn_client.grpc.Parameter value) {
      if (parameterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParameterIsMutable();
        parameter_.set(index, value);
        onChanged();
      } else {
        parameterBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder setParameter(
        int index, com.example.fedn_client.grpc.Parameter.Builder builderForValue) {
      if (parameterBuilder_ == null) {
        ensureParameterIsMutable();
        parameter_.set(index, builderForValue.build());
        onChanged();
      } else {
        parameterBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder addParameter(com.example.fedn_client.grpc.Parameter value) {
      if (parameterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParameterIsMutable();
        parameter_.add(value);
        onChanged();
      } else {
        parameterBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder addParameter(
        int index, com.example.fedn_client.grpc.Parameter value) {
      if (parameterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParameterIsMutable();
        parameter_.add(index, value);
        onChanged();
      } else {
        parameterBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder addParameter(
        com.example.fedn_client.grpc.Parameter.Builder builderForValue) {
      if (parameterBuilder_ == null) {
        ensureParameterIsMutable();
        parameter_.add(builderForValue.build());
        onChanged();
      } else {
        parameterBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder addParameter(
        int index, com.example.fedn_client.grpc.Parameter.Builder builderForValue) {
      if (parameterBuilder_ == null) {
        ensureParameterIsMutable();
        parameter_.add(index, builderForValue.build());
        onChanged();
      } else {
        parameterBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder addAllParameter(
        java.lang.Iterable<? extends com.example.fedn_client.grpc.Parameter> values) {
      if (parameterBuilder_ == null) {
        ensureParameterIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, parameter_);
        onChanged();
      } else {
        parameterBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder clearParameter() {
      if (parameterBuilder_ == null) {
        parameter_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        parameterBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public Builder removeParameter(int index) {
      if (parameterBuilder_ == null) {
        ensureParameterIsMutable();
        parameter_.remove(index);
        onChanged();
      } else {
        parameterBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public com.example.fedn_client.grpc.Parameter.Builder getParameterBuilder(
        int index) {
      return getParameterFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public com.example.fedn_client.grpc.ParameterOrBuilder getParameterOrBuilder(
        int index) {
      if (parameterBuilder_ == null) {
        return parameter_.get(index);  } else {
        return parameterBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public java.util.List<? extends com.example.fedn_client.grpc.ParameterOrBuilder> 
         getParameterOrBuilderList() {
      if (parameterBuilder_ != null) {
        return parameterBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(parameter_);
      }
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public com.example.fedn_client.grpc.Parameter.Builder addParameterBuilder() {
      return getParameterFieldBuilder().addBuilder(
          com.example.fedn_client.grpc.Parameter.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public com.example.fedn_client.grpc.Parameter.Builder addParameterBuilder(
        int index) {
      return getParameterFieldBuilder().addBuilder(
          index, com.example.fedn_client.grpc.Parameter.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.Parameter parameter = 2;</code>
     */
    public java.util.List<com.example.fedn_client.grpc.Parameter.Builder> 
         getParameterBuilderList() {
      return getParameterFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.fedn_client.grpc.Parameter, com.example.fedn_client.grpc.Parameter.Builder, com.example.fedn_client.grpc.ParameterOrBuilder> 
        getParameterFieldBuilder() {
      if (parameterBuilder_ == null) {
        parameterBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.fedn_client.grpc.Parameter, com.example.fedn_client.grpc.Parameter.Builder, com.example.fedn_client.grpc.ParameterOrBuilder>(
                parameter_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        parameter_ = null;
      }
      return parameterBuilder_;
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


    // @@protoc_insertion_point(builder_scope:grpc.ReportResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.ReportResponse)
  private static final com.example.fedn_client.grpc.ReportResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.fedn_client.grpc.ReportResponse();
  }

  public static com.example.fedn_client.grpc.ReportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReportResponse>() {
    @java.lang.Override
    public ReportResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ReportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.fedn_client.grpc.ReportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

