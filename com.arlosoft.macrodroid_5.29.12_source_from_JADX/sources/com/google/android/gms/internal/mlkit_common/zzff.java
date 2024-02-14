package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzff implements ObjectEncoder {

    /* renamed from: a */
    static final zzff f42397a = new zzff();

    /* renamed from: b */
    private static final FieldDescriptor f42398b;

    /* renamed from: c */
    private static final FieldDescriptor f42399c;

    /* renamed from: d */
    private static final FieldDescriptor f42400d;

    /* renamed from: e */
    private static final FieldDescriptor f42401e;

    /* renamed from: f */
    private static final FieldDescriptor f42402f;

    /* renamed from: g */
    private static final FieldDescriptor f42403g;

    /* renamed from: h */
    private static final FieldDescriptor f42404h;

    /* renamed from: i */
    private static final FieldDescriptor f42405i;

    /* renamed from: j */
    private static final FieldDescriptor f42406j;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("name");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42398b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a(ClientCookie.VERSION_ATTR);
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42399c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("source");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42400d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("uri");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42401e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("hash");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42402f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("modelType");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42403g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("size");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42404h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("hasLabelMap");
        zzbh zzbh8 = new zzbh();
        zzbh8.mo51821a(8);
        f42405i = a8.mo23604b(zzbh8.mo51822b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("isManifestModel");
        zzbh zzbh9 = new zzbh();
        zzbh9.mo51821a(9);
        f42406j = a9.mo23604b(zzbh9.mo51822b()).mo23603a();
    }

    private zzff() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjl zzjl = (zzjl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f42398b, zzjl.mo51918d());
        objectEncoderContext.mo23608e(f42399c, (Object) null);
        objectEncoderContext.mo23608e(f42400d, zzjl.mo51916b());
        objectEncoderContext.mo23608e(f42401e, (Object) null);
        objectEncoderContext.mo23608e(f42402f, zzjl.mo51917c());
        objectEncoderContext.mo23608e(f42403g, zzjl.mo51915a());
        objectEncoderContext.mo23608e(f42404h, (Object) null);
        objectEncoderContext.mo23608e(f42405i, (Object) null);
        objectEncoderContext.mo23608e(f42406j, (Object) null);
    }
}
