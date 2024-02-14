package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzey implements ObjectEncoder {

    /* renamed from: a */
    static final zzey f42288a = new zzey();

    /* renamed from: b */
    private static final FieldDescriptor f42289b;

    /* renamed from: c */
    private static final FieldDescriptor f42290c;

    /* renamed from: d */
    private static final FieldDescriptor f42291d;

    /* renamed from: e */
    private static final FieldDescriptor f42292e;

    /* renamed from: f */
    private static final FieldDescriptor f42293f;

    /* renamed from: g */
    private static final FieldDescriptor f42294g;

    /* renamed from: h */
    private static final FieldDescriptor f42295h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42289b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageSource");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42290c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("imageFormat");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42291d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("imageByteSize");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42292e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("imageWidth");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42293f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("imageHeight");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42294g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("rotationDegrees");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42295h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
    }

    private zzey() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzio zzio = (zzio) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
