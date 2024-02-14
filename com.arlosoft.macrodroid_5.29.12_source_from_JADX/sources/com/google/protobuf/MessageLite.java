package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        /* renamed from: E0 */
        MessageLite mo65192E0();

        MessageLite build();

        /* renamed from: w1 */
        Builder mo64731w1(byte[] bArr) throws InvalidProtocolBufferException;

        /* renamed from: y0 */
        Builder mo64733y0(MessageLite messageLite);
    }

    /* renamed from: b */
    Builder mo65173b();

    /* renamed from: c */
    int mo65174c();

    /* renamed from: d */
    Builder mo65175d();

    /* renamed from: f */
    Parser<? extends MessageLite> mo65178f();

    /* renamed from: g */
    ByteString mo64717g();

    /* renamed from: h */
    byte[] mo64718h();

    /* renamed from: k */
    void mo65180k(CodedOutputStream codedOutputStream) throws IOException;

    void writeTo(OutputStream outputStream) throws IOException;
}
