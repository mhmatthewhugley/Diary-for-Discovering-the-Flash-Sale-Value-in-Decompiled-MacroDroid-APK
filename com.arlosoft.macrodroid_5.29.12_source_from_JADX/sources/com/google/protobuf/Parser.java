package com.google.protobuf;

public interface Parser<MessageType> {
    /* renamed from: a */
    MessageType mo64738a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* renamed from: b */
    MessageType mo64739b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* renamed from: c */
    MessageType mo65200c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
}
