package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgg implements ObjectEncoder {

    /* renamed from: a */
    static final zzgg f42513a = new zzgg();

    /* renamed from: b */
    private static final FieldDescriptor f42514b;

    /* renamed from: c */
    private static final FieldDescriptor f42515c;

    /* renamed from: d */
    private static final FieldDescriptor f42516d;

    /* renamed from: e */
    private static final FieldDescriptor f42517e;

    /* renamed from: f */
    private static final FieldDescriptor f42518f;

    /* renamed from: g */
    private static final FieldDescriptor f42519g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42514b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageInfo");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42515c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("detectorOptions");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42516d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("loadDurationMs");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42517e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("sessionDurationMs");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42518f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("sessionTotalInferenceDurationMs");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42519g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
    }

    private zzgg() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkm zzkm = (zzkm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
