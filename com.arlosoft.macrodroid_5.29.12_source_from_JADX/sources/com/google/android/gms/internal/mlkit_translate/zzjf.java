package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzjf implements ObjectEncoder {

    /* renamed from: a */
    static final zzjf f43879a = new zzjf();

    /* renamed from: b */
    private static final FieldDescriptor f43880b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelLanguage");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43880b = a.mo23604b(zzbc.mo52082b()).mo23603a();
    }

    private zzjf() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznn zznn = (zznn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
