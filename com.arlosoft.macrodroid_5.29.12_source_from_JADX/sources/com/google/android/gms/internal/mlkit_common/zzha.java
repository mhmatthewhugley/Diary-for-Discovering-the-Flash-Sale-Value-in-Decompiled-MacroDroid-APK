package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzha implements ObjectEncoder {

    /* renamed from: a */
    static final zzha f42615a = new zzha();

    /* renamed from: b */
    private static final FieldDescriptor f42616b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelLanguage");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42616b = a.mo23604b(zzbh.mo51822b()).mo23603a();
    }

    private zzha() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlc zzlc = (zzlc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
