package com.google.firebase.messaging;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

@Encodable
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a */
    private static final ProtobufEncoder f55014a = ProtobufEncoder.m7820a().mo23656d(AutoProtoEncoderDoNotUseEncoder.f54933a).mo23655c();

    private ProtoEncoderDoNotUse() {
    }

    /* renamed from: a */
    public static byte[] m76982a(Object obj) {
        return f55014a.mo23654c(obj);
    }

    /* renamed from: b */
    public abstract MessagingClientEventExtension mo63391b();
}
