package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgs implements ObjectEncoder {

    /* renamed from: a */
    static final zzgs f42561a = new zzgs();

    /* renamed from: b */
    private static final FieldDescriptor f42562b;

    /* renamed from: c */
    private static final FieldDescriptor f42563c;

    /* renamed from: d */
    private static final FieldDescriptor f42564d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("languageOption");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(3);
        f42562b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isUsingLegacyApi");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(4);
        f42563c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("sdkVersion");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(5);
        f42564d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzgs() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzky zzky = (zzky) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
