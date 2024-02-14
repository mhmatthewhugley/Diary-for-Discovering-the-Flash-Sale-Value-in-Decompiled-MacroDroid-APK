package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzes implements ObjectEncoder {

    /* renamed from: a */
    static final zzes f42250a = new zzes();

    /* renamed from: b */
    private static final FieldDescriptor f42251b;

    /* renamed from: c */
    private static final FieldDescriptor f42252c;

    /* renamed from: d */
    private static final FieldDescriptor f42253d;

    /* renamed from: e */
    private static final FieldDescriptor f42254e;

    /* renamed from: f */
    private static final FieldDescriptor f42255f;

    /* renamed from: g */
    private static final FieldDescriptor f42256g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("mode");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42251b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("landmark");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42252c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("classification");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42253d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("prominentFaceOnly");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42254e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("tracking");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42255f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("minFaceSize");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42256g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
    }

    private zzes() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzly zzly = (zzly) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
