// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello.proto

package ai.icg.hello;

public final class HelloProto {
  private HelloProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_hello_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_hello_HelloReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hello.proto\022\005hello\"\034\n\014HelloRequest\022\014\n\004" +
      "name\030\001 \001(\t\"\035\n\nHelloReply\022\017\n\007message\030\001 \001(" +
      "\t2?\n\007Greeter\0224\n\010SayHello\022\023.hello.HelloRe" +
      "quest\032\021.hello.HelloReply\"\000B\"\n\014ai.icg.hel" +
      "loB\nHelloProtoP\001\242\002\003HLWb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_hello_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_hello_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_hello_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_hello_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_hello_HelloReply_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
