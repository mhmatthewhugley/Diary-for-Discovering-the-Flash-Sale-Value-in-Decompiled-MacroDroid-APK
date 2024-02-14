package com.google.protobuf;

import com.google.protobuf.MessageLite;

public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* renamed from: a */
    private static final ExtensionRegistryLite f56561a = ExtensionRegistryLite.m80520b();

    /* renamed from: d */
    private MessageType m79308d(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.mo65172a()) {
            return messagetype;
        }
        throw m79309e(messagetype).mo65441a().mo65249i(messagetype);
    }

    /* renamed from: e */
    private UninitializedMessageException m79309e(MessageType messagetype) {
        if (messagetype instanceof AbstractMessageLite) {
            return ((AbstractMessageLite) messagetype).mo64721o();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: f */
    public MessageType mo64738a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return m79308d(mo64742h(byteString, extensionRegistryLite));
    }

    /* renamed from: g */
    public MessageType mo64739b(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return m79308d((MessageLite) mo65200c(codedInputStream, extensionRegistryLite));
    }

    /* renamed from: h */
    public MessageType mo64742h(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            CodedInputStream M = byteString.mo64910M();
            messagetype = (MessageLite) mo65200c(M, extensionRegistryLite);
            M.mo64958a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.mo65249i(messagetype);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
