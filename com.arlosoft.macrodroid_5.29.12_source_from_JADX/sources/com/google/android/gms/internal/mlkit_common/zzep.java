package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzep implements ObjectEncoder {

    /* renamed from: a */
    static final zzep f42232a = new zzep();

    /* renamed from: b */
    private static final FieldDescriptor f42233b;

    /* renamed from: c */
    private static final FieldDescriptor f42234c;

    /* renamed from: d */
    private static final FieldDescriptor f42235d;

    /* renamed from: e */
    private static final FieldDescriptor f42236e;

    /* renamed from: f */
    private static final FieldDescriptor f42237f;

    /* renamed from: g */
    private static final FieldDescriptor f42238g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("maxMs");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42233b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("minMs");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42234c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("avgMs");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42235d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("firstQuartileMs");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42236e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("medianMs");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42237f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("thirdQuartileMs");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42238g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
    }

    private zzep() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzii zzii = (zzii) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
