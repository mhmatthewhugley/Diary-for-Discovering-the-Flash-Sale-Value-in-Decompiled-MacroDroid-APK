package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzfu implements ObjectEncoder {

    /* renamed from: a */
    static final zzfu f43385a = new zzfu();

    /* renamed from: b */
    private static final FieldDescriptor f43386b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43386b = a.mo23604b(zzbc.mo52082b()).mo23603a();
    }

    private zzfu() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzeu zzeu = (zzeu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
