package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfe implements ObjectEncoder {

    /* renamed from: a */
    static final zzfe f42389a = new zzfe();

    /* renamed from: b */
    private static final FieldDescriptor f42390b;

    /* renamed from: c */
    private static final FieldDescriptor f42391c;

    /* renamed from: d */
    private static final FieldDescriptor f42392d;

    /* renamed from: e */
    private static final FieldDescriptor f42393e;

    /* renamed from: f */
    private static final FieldDescriptor f42394f;

    /* renamed from: g */
    private static final FieldDescriptor f42395g;

    /* renamed from: h */
    private static final FieldDescriptor f42396h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("options");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42390b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("roughDownloadDurationMs");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42391c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42392d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("exactDownloadDurationMs");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42393e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("downloadStatus");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42394f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("downloadFailureStatus");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42395g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("mddDownloadErrorCodes");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42396h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
    }

    private zzfe() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjg zzjg = (zzjg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f42390b, zzjg.mo51906c());
        objectEncoderContext.mo23608e(f42391c, zzjg.mo51909f());
        objectEncoderContext.mo23608e(f42392d, zzjg.mo51904a());
        objectEncoderContext.mo23608e(f42393e, zzjg.mo51908e());
        objectEncoderContext.mo23608e(f42394f, zzjg.mo51905b());
        objectEncoderContext.mo23608e(f42395g, zzjg.mo51907d());
        objectEncoderContext.mo23608e(f42396h, (Object) null);
    }
}
