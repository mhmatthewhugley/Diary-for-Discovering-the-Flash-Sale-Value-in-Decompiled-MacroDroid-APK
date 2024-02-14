package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgb implements ObjectEncoder {

    /* renamed from: a */
    static final zzgb f42490a = new zzgb();

    /* renamed from: b */
    private static final FieldDescriptor f42491b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("identifiedLanguages");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42491b = a.mo23604b(zzbh.mo51822b()).mo23603a();
    }

    private zzgb() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkg zzkg = (zzkg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
