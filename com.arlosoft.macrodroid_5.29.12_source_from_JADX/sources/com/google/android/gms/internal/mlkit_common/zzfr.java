package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfr implements ObjectEncoder {

    /* renamed from: a */
    static final zzfr f42449a = new zzfr();

    /* renamed from: b */
    private static final FieldDescriptor f42450b;

    /* renamed from: c */
    private static final FieldDescriptor f42451c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42450b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("durationMs");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42451c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
    }

    private zzfr() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjx zzjx = (zzjx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
