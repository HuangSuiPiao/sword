// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: phone_type.proto

package com.huangsuip.netty.protobuf;

public final class PhoneTypeProto {
  private PhoneTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code PhoneType}
   */
  public enum PhoneType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MOBILE = 0;</code>
     */
    MOBILE(0),
    /**
     * <code>HOME = 1;</code>
     */
    HOME(1),
    /**
     * <code>WORK = 2;</code>
     */
    WORK(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MOBILE = 0;</code>
     */
    public static final int MOBILE_VALUE = 0;
    /**
     * <code>HOME = 1;</code>
     */
    public static final int HOME_VALUE = 1;
    /**
     * <code>WORK = 2;</code>
     */
    public static final int WORK_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PhoneType valueOf(int value) {
      return forNumber(value);
    }

    public static PhoneType forNumber(int value) {
      switch (value) {
        case 0: return MOBILE;
        case 1: return HOME;
        case 2: return WORK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PhoneType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PhoneType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PhoneType>() {
            public PhoneType findValueByNumber(int number) {
              return PhoneType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.huangsuip.netty.protobuf.PhoneTypeProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final PhoneType[] VALUES = values();

    public static PhoneType valueOf(
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

    private PhoneType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:PhoneType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020phone_type.proto*+\n\tPhoneType\022\n\n\006MOBIL" +
      "E\020\000\022\010\n\004HOME\020\001\022\010\n\004WORK\020\002B.\n\034com.huangsuip" +
      ".netty.protobufB\016PhoneTypeProtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}