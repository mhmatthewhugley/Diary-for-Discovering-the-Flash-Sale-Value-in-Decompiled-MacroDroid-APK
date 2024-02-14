package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgz implements ObjectEncoder {

    /* renamed from: a */
    static final zzgz f42604a = new zzgz();

    /* renamed from: b */
    private static final FieldDescriptor f42605b;

    /* renamed from: c */
    private static final FieldDescriptor f42606c;

    /* renamed from: d */
    private static final FieldDescriptor f42607d;

    /* renamed from: e */
    private static final FieldDescriptor f42608e;

    /* renamed from: f */
    private static final FieldDescriptor f42609f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42605b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("handledErrors");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42606c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("partiallyHandledErrors");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42607d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("unhandledErrors");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42608e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("httpResponseCode");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42609f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
    }

    private zzgz() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlb zzlb = (zzlb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
