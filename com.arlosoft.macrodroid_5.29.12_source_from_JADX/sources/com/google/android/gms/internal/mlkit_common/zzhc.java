package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzhc implements ObjectEncoder {

    /* renamed from: a */
    static final zzhc f42620a = new zzhc();

    /* renamed from: b */
    private static final FieldDescriptor f42621b;

    /* renamed from: c */
    private static final FieldDescriptor f42622c;

    /* renamed from: d */
    private static final FieldDescriptor f42623d;

    /* renamed from: e */
    private static final FieldDescriptor f42624e;

    /* renamed from: f */
    private static final FieldDescriptor f42625f;

    /* renamed from: g */
    private static final FieldDescriptor f42626g;

    /* renamed from: h */
    private static final FieldDescriptor f42627h;

    /* renamed from: i */
    private static final FieldDescriptor f42628i;

    /* renamed from: j */
    private static final FieldDescriptor f42629j;

    /* renamed from: k */
    private static final FieldDescriptor f42630k;

    /* renamed from: l */
    private static final FieldDescriptor f42631l;

    /* renamed from: m */
    private static final FieldDescriptor f42632m;

    /* renamed from: n */
    private static final FieldDescriptor f42633n;

    /* renamed from: o */
    private static final FieldDescriptor f42634o;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("appId");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42621b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("appVersion");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42622c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("firebaseProjectId");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42623d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("mlSdkVersion");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42624e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("tfliteSchemaVersion");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42625f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("gcmSenderId");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42626g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("apiKey");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42627h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("languages");
        zzbh zzbh8 = new zzbh();
        zzbh8.mo51821a(8);
        f42628i = a8.mo23604b(zzbh8.mo51822b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("mlSdkInstanceId");
        zzbh zzbh9 = new zzbh();
        zzbh9.mo51821a(9);
        f42629j = a9.mo23604b(zzbh9.mo51822b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("isClearcutClient");
        zzbh zzbh10 = new zzbh();
        zzbh10.mo51821a(10);
        f42630k = a10.mo23604b(zzbh10.mo51822b()).mo23603a();
        FieldDescriptor.Builder a11 = FieldDescriptor.m7731a("isStandaloneMlkit");
        zzbh zzbh11 = new zzbh();
        zzbh11.mo51821a(11);
        f42631l = a11.mo23604b(zzbh11.mo51822b()).mo23603a();
        FieldDescriptor.Builder a12 = FieldDescriptor.m7731a("isJsonLogging");
        zzbh zzbh12 = new zzbh();
        zzbh12.mo51821a(12);
        f42632m = a12.mo23604b(zzbh12.mo51822b()).mo23603a();
        FieldDescriptor.Builder a13 = FieldDescriptor.m7731a("buildLevel");
        zzbh zzbh13 = new zzbh();
        zzbh13.mo51821a(13);
        f42633n = a13.mo23604b(zzbh13.mo51822b()).mo23603a();
        FieldDescriptor.Builder a14 = FieldDescriptor.m7731a("optionalModuleVersion");
        zzbh zzbh14 = new zzbh();
        zzbh14.mo51821a(14);
        f42634o = a14.mo23604b(zzbh14.mo51822b()).mo23603a();
    }

    private zzhc() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlg zzlg = (zzlg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f42621b, zzlg.mo51960g());
        objectEncoderContext.mo23608e(f42622c, zzlg.mo51961h());
        objectEncoderContext.mo23608e(f42623d, (Object) null);
        objectEncoderContext.mo23608e(f42624e, zzlg.mo51963j());
        objectEncoderContext.mo23608e(f42625f, zzlg.mo51964k());
        objectEncoderContext.mo23608e(f42626g, (Object) null);
        objectEncoderContext.mo23608e(f42627h, (Object) null);
        objectEncoderContext.mo23608e(f42628i, zzlg.mo51954a());
        objectEncoderContext.mo23608e(f42629j, zzlg.mo51962i());
        objectEncoderContext.mo23608e(f42630k, zzlg.mo51955b());
        objectEncoderContext.mo23608e(f42631l, zzlg.mo51957d());
        objectEncoderContext.mo23608e(f42632m, zzlg.mo51956c());
        objectEncoderContext.mo23608e(f42633n, zzlg.mo51958e());
        objectEncoderContext.mo23608e(f42634o, zzlg.mo51959f());
    }
}
