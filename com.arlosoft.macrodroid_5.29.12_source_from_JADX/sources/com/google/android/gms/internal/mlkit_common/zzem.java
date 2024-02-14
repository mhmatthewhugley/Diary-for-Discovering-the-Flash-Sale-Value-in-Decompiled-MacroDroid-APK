package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzem implements ObjectEncoder {

    /* renamed from: a */
    static final zzem f42211a = new zzem();

    /* renamed from: b */
    private static final FieldDescriptor f42212b;

    /* renamed from: c */
    private static final FieldDescriptor f42213c;

    /* renamed from: d */
    private static final FieldDescriptor f42214d;

    /* renamed from: e */
    private static final FieldDescriptor f42215e;

    /* renamed from: f */
    private static final FieldDescriptor f42216f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("remoteModelOptions");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42212b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("localModelOptions");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42213c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCodes");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42214d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("modelInitializationMs");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42215e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("isNnApiEnabled");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42216f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
    }

    private zzem() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzie zzie = (zzie) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
