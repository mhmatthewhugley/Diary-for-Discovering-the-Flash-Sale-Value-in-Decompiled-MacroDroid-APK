package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    private C14516o unfinishedMessage = null;

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: b */
    static InvalidProtocolBufferException m90801b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static InvalidProtocolBufferException m90802c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static InvalidProtocolBufferException m90803d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static InvalidProtocolBufferException m90804e() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static InvalidProtocolBufferException m90805f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    static InvalidProtocolBufferException m90806g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    static InvalidProtocolBufferException m90807h() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    static InvalidProtocolBufferException m90808j() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: k */
    static InvalidProtocolBufferException m90809k() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public C14516o mo73276a() {
        return this.unfinishedMessage;
    }

    /* renamed from: i */
    public InvalidProtocolBufferException mo73277i(C14516o oVar) {
        this.unfinishedMessage = oVar;
        return this;
    }
}
