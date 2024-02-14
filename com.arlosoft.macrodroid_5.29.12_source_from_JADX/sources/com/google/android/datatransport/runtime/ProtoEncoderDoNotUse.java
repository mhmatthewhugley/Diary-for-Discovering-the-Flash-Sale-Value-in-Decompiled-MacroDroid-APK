package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.ProtobufEncoder;

@Encodable
public abstract class ProtoEncoderDoNotUse {

    /* renamed from: a */
    private static final ProtobufEncoder f1357a = ProtobufEncoder.m7820a().mo23656d(AutoProtoEncoderDoNotUseEncoder.f1290a).mo23655c();

    private ProtoEncoderDoNotUse() {
    }

    /* renamed from: a */
    public static byte[] m1238a(Object obj) {
        return f1357a.mo23654c(obj);
    }

    /* renamed from: b */
    public abstract ClientMetrics mo19455b();
}
