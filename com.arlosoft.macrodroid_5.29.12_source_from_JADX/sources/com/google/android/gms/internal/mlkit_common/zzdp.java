package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzdp implements ObjectEncoder {

    /* renamed from: a */
    static final zzdp f42116a = new zzdp();

    /* renamed from: b */
    private static final FieldDescriptor f42117b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42117b = a.mo23604b(zzbh.mo51822b()).mo23603a();
    }

    private zzdp() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzcp zzcp = (zzcp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
