// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EmployeeService.proto

package org.example.grpc;

/**
 * Protobuf enum {@code EmployeeType}
 */
public enum EmployeeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PERMANENT = 0;</code>
   */
  PERMANENT(0),
  /**
   * <code>CONTRACT = 1;</code>
   */
  CONTRACT(1),
  /**
   * <code>DETACHED = 2;</code>
   */
  DETACHED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PERMANENT = 0;</code>
   */
  public static final int PERMANENT_VALUE = 0;
  /**
   * <code>CONTRACT = 1;</code>
   */
  public static final int CONTRACT_VALUE = 1;
  /**
   * <code>DETACHED = 2;</code>
   */
  public static final int DETACHED_VALUE = 2;


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
  public static EmployeeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static EmployeeType forNumber(int value) {
    switch (value) {
      case 0: return PERMANENT;
      case 1: return CONTRACT;
      case 2: return DETACHED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EmployeeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EmployeeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EmployeeType>() {
          public EmployeeType findValueByNumber(int number) {
            return EmployeeType.forNumber(number);
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
    return org.example.grpc.EmployeeServiceOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final EmployeeType[] VALUES = values();

  public static EmployeeType valueOf(
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

  private EmployeeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:EmployeeType)
}

