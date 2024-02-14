package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzen implements ObjectEncoder {

    /* renamed from: a */
    static final zzen f42217a = new zzen();

    /* renamed from: b */
    private static final FieldDescriptor f42218b;

    /* renamed from: c */
    private static final FieldDescriptor f42219c;

    /* renamed from: d */
    private static final FieldDescriptor f42220d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelType");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42218b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isSuccessful");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42219c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("modelName");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42220d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzen() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzih zzih = (zzih) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f42218b, zzih.mo51869a());
        objectEncoderContext.mo23608e(f42219c, zzih.mo51870b());
        objectEncoderContext.mo23608e(f42220d, (Object) null);
    }
}
