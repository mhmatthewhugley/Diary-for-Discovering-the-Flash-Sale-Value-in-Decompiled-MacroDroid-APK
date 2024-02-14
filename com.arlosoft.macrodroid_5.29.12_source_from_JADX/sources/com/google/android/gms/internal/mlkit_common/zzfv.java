package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfv implements ObjectEncoder {

    /* renamed from: a */
    static final zzfv f42464a = new zzfv();

    /* renamed from: b */
    private static final FieldDescriptor f42465b;

    /* renamed from: c */
    private static final FieldDescriptor f42466c;

    /* renamed from: d */
    private static final FieldDescriptor f42467d;

    /* renamed from: e */
    private static final FieldDescriptor f42468e;

    /* renamed from: f */
    private static final FieldDescriptor f42469f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42465b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("options");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42466c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("imageInfo");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42467d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("labelCount");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42468e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("highestConfidence");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42469f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
    }

    private zzfv() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkb zzkb = (zzkb) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
