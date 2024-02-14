package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzjh implements ObjectEncoder {

    /* renamed from: a */
    static final zzjh f43884a = new zzjh();

    /* renamed from: b */
    private static final FieldDescriptor f43885b;

    /* renamed from: c */
    private static final FieldDescriptor f43886c;

    /* renamed from: d */
    private static final FieldDescriptor f43887d;

    /* renamed from: e */
    private static final FieldDescriptor f43888e;

    /* renamed from: f */
    private static final FieldDescriptor f43889f;

    /* renamed from: g */
    private static final FieldDescriptor f43890g;

    /* renamed from: h */
    private static final FieldDescriptor f43891h;

    /* renamed from: i */
    private static final FieldDescriptor f43892i;

    /* renamed from: j */
    private static final FieldDescriptor f43893j;

    /* renamed from: k */
    private static final FieldDescriptor f43894k;

    /* renamed from: l */
    private static final FieldDescriptor f43895l;

    /* renamed from: m */
    private static final FieldDescriptor f43896m;

    /* renamed from: n */
    private static final FieldDescriptor f43897n;

    /* renamed from: o */
    private static final FieldDescriptor f43898o;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("appId");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43885b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("appVersion");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43886c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("firebaseProjectId");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43887d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("mlSdkVersion");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43888e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("tfliteSchemaVersion");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43889f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("gcmSenderId");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43890g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("apiKey");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43891h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("languages");
        zzbc zzbc8 = new zzbc();
        zzbc8.mo52081a(8);
        f43892i = a8.mo23604b(zzbc8.mo52082b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("mlSdkInstanceId");
        zzbc zzbc9 = new zzbc();
        zzbc9.mo52081a(9);
        f43893j = a9.mo23604b(zzbc9.mo52082b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("isClearcutClient");
        zzbc zzbc10 = new zzbc();
        zzbc10.mo52081a(10);
        f43894k = a10.mo23604b(zzbc10.mo52082b()).mo23603a();
        FieldDescriptor.Builder a11 = FieldDescriptor.m7731a("isStandaloneMlkit");
        zzbc zzbc11 = new zzbc();
        zzbc11.mo52081a(11);
        f43895l = a11.mo23604b(zzbc11.mo52082b()).mo23603a();
        FieldDescriptor.Builder a12 = FieldDescriptor.m7731a("isJsonLogging");
        zzbc zzbc12 = new zzbc();
        zzbc12.mo52081a(12);
        f43896m = a12.mo23604b(zzbc12.mo52082b()).mo23603a();
        FieldDescriptor.Builder a13 = FieldDescriptor.m7731a("buildLevel");
        zzbc zzbc13 = new zzbc();
        zzbc13.mo52081a(13);
        f43897n = a13.mo23604b(zzbc13.mo52082b()).mo23603a();
        FieldDescriptor.Builder a14 = FieldDescriptor.m7731a("optionalModuleVersion");
        zzbc zzbc14 = new zzbc();
        zzbc14.mo52081a(14);
        f43898o = a14.mo23604b(zzbc14.mo52082b()).mo23603a();
    }

    private zzjh() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznr zznr = (zznr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43885b, zznr.mo52356g());
        objectEncoderContext.mo23608e(f43886c, zznr.mo52357h());
        objectEncoderContext.mo23608e(f43887d, (Object) null);
        objectEncoderContext.mo23608e(f43888e, zznr.mo52359j());
        objectEncoderContext.mo23608e(f43889f, zznr.mo52360k());
        objectEncoderContext.mo23608e(f43890g, (Object) null);
        objectEncoderContext.mo23608e(f43891h, (Object) null);
        objectEncoderContext.mo23608e(f43892i, zznr.mo52350a());
        objectEncoderContext.mo23608e(f43893j, zznr.mo52358i());
        objectEncoderContext.mo23608e(f43894k, zznr.mo52351b());
        objectEncoderContext.mo23608e(f43895l, zznr.mo52353d());
        objectEncoderContext.mo23608e(f43896m, zznr.mo52352c());
        objectEncoderContext.mo23608e(f43897n, zznr.mo52354e());
        objectEncoderContext.mo23608e(f43898o, zznr.mo52355f());
    }
}
