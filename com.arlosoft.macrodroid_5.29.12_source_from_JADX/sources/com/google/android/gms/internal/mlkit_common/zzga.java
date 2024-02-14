package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzga implements ObjectEncoder {

    /* renamed from: a */
    static final zzga f42488a = new zzga();

    /* renamed from: b */
    private static final FieldDescriptor f42489b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("identifiedLanguage");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42489b = a.mo23604b(zzbh.mo51822b()).mo23603a();
    }

    private zzga() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkf zzkf = (zzkf) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
