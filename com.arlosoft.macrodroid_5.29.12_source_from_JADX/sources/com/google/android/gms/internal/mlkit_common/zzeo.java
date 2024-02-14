package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzeo implements ObjectEncoder {

    /* renamed from: a */
    static final zzeo f42221a = new zzeo();

    /* renamed from: b */
    private static final FieldDescriptor f42222b;

    /* renamed from: c */
    private static final FieldDescriptor f42223c;

    /* renamed from: d */
    private static final FieldDescriptor f42224d;

    /* renamed from: e */
    private static final FieldDescriptor f42225e;

    /* renamed from: f */
    private static final FieldDescriptor f42226f;

    /* renamed from: g */
    private static final FieldDescriptor f42227g;

    /* renamed from: h */
    private static final FieldDescriptor f42228h;

    /* renamed from: i */
    private static final FieldDescriptor f42229i;

    /* renamed from: j */
    private static final FieldDescriptor f42230j;

    /* renamed from: k */
    private static final FieldDescriptor f42231k;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("sdkVersion");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42222b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("osBuild");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42223c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("brand");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42224d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("device");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42225e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("hardware");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42226f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("manufacturer");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42227g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("model");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42228h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("product");
        zzbh zzbh8 = new zzbh();
        zzbh8.mo51821a(8);
        f42229i = a8.mo23604b(zzbh8.mo51822b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("soc");
        zzbh zzbh9 = new zzbh();
        zzbh9.mo51821a(9);
        f42230j = a9.mo23604b(zzbh9.mo51822b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("socMetaBuildId");
        zzbh zzbh10 = new zzbh();
        zzbh10.mo51821a(10);
        f42231k = a10.mo23604b(zzbh10.mo51822b()).mo23603a();
    }

    private zzeo() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzll zzll = (zzll) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
