// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fedn.proto

package com.example.fedn_client.grpc;

/**
 * Protobuf enum {@code grpc.Role}
 */
public enum Role
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WORKER = 0;</code>
   */
  WORKER(0),
  /**
   * <code>COMBINER = 1;</code>
   */
  COMBINER(1),
  /**
   * <code>REDUCER = 2;</code>
   */
  REDUCER(2),
  /**
   * <code>OTHER = 3;</code>
   */
  OTHER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WORKER = 0;</code>
   */
  public static final int WORKER_VALUE = 0;
  /**
   * <code>COMBINER = 1;</code>
   */
  public static final int COMBINER_VALUE = 1;
  /**
   * <code>REDUCER = 2;</code>
   */
  public static final int REDUCER_VALUE = 2;
  /**
   * <code>OTHER = 3;</code>
   */
  public static final int OTHER_VALUE = 3;


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
  public static Role valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Role forNumber(int value) {
    switch (value) {
      case 0: return WORKER;
      case 1: return COMBINER;
      case 2: return REDUCER;
      case 3: return OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Role>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Role> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Role>() {
          public Role findValueByNumber(int number) {
            return Role.forNumber(number);
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
    return com.example.fedn_client.grpc.Fedn.getDescriptor().getEnumTypes().get(3);
  }

  private static final Role[] VALUES = values();

  public static Role valueOf(
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

  private Role(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpc.Role)
}

