package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzez implements ObjectEncoder {

    /* renamed from: a */
    static final zzez f42296a = new zzez();

    /* renamed from: b */
    private static final FieldDescriptor f42297b;

    /* renamed from: c */
    private static final FieldDescriptor f42298c;

    /* renamed from: d */
    private static final FieldDescriptor f42299d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelType");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42297b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isDownloaded");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42298c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("modelName");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42299d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzez() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzir zzir = (zzir) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f42297b, zzir.mo51878a());
        objectEncoderContext.mo23608e(f42298c, zzir.mo51879b());
        objectEncoderContext.mo23608e(f42299d, (Object) null);
    }
}
