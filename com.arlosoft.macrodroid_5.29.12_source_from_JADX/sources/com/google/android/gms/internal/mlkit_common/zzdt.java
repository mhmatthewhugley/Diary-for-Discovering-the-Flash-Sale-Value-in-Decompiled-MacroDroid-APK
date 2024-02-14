package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzdt implements ObjectEncoder {

    /* renamed from: a */
    static final zzdt f42134a = new zzdt();

    /* renamed from: b */
    private static final FieldDescriptor f42135b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("format");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42135b = a.mo23604b(zzbh.mo51822b()).mo23603a();
    }

    private zzdt() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlx zzlx = (zzlx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
