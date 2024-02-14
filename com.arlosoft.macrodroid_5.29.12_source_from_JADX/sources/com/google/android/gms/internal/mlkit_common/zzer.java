package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzer implements ObjectEncoder {

    /* renamed from: a */
    static final zzer f42243a = new zzer();

    /* renamed from: b */
    private static final FieldDescriptor f42244b;

    /* renamed from: c */
    private static final FieldDescriptor f42245c;

    /* renamed from: d */
    private static final FieldDescriptor f42246d;

    /* renamed from: e */
    private static final FieldDescriptor f42247e;

    /* renamed from: f */
    private static final FieldDescriptor f42248f;

    /* renamed from: g */
    private static final FieldDescriptor f42249g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("landmarkMode");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42244b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("classificationMode");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42245c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("performanceMode");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42246d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("contourMode");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42247e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("isTrackingEnabled");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42248f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("minFaceSize");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42249g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
    }

    private zzer() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzik zzik = (zzik) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
