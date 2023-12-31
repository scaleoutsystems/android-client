// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fedn.proto

package com.example.fedn_client.grpc;

/**
 * Protobuf enum {@code grpc.ModelStatus}
 */
public enum ModelStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OK = 0;</code>
   */
  OK(0),
  /**
   * <code>IN_PROGRESS = 1;</code>
   */
  IN_PROGRESS(1),
  /**
   * <code>IN_PROGRESS_OK = 2;</code>
   */
  IN_PROGRESS_OK(2),
  /**
   * <code>FAILED = 3;</code>
   */
  FAILED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OK = 0;</code>
   */
  public static final int OK_VALUE = 0;
  /**
   * <code>IN_PROGRESS = 1;</code>
   */
  public static final int IN_PROGRESS_VALUE = 1;
  /**
   * <code>IN_PROGRESS_OK = 2;</code>
   */
  public static final int IN_PROGRESS_OK_VALUE = 2;
  /**
   * <code>FAILED = 3;</code>
   */
  public static final int FAILED_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ModelStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ModelStatus forNumber(int value) {
    switch (value) {
      case 0: return OK;
      case 1: return IN_PROGRESS;
      case 2: return IN_PROGRESS_OK;
      case 3: return FAILED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ModelStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ModelStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ModelStatus>() {
          public ModelStatus findValueByNumber(int number) {
            return ModelStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.example.fedn_client.grpc.Fedn.getDescriptor().getEnumTypes().get(2);
  }

  private static final ModelStatus[] VALUES = values();

  public static ModelStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ModelStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpc.ModelStatus)
}

