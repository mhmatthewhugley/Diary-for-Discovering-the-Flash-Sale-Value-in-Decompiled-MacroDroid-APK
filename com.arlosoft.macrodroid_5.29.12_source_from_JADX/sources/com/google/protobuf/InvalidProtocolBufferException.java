package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private MessageLite unfinishedMessage = null;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;

        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: a */
    static InvalidProtocolBufferException m80758a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    static InvalidProtocolBufferException m80759b() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static InvalidProtocolBufferException m80760c() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static InvalidWireTypeException m80761d() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static InvalidProtocolBufferException m80762e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static InvalidProtocolBufferException m80763f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static InvalidProtocolBufferException m80764g() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: h */
    static InvalidProtocolBufferException m80765h() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    static InvalidProtocolBufferException m80766j() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: k */
    static InvalidProtocolBufferException m80767k() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: i */
    public InvalidProtocolBufferException mo65249i(MessageLite messageLite) {
        this.unfinishedMessage = messageLite;
        return this;
    }
}
