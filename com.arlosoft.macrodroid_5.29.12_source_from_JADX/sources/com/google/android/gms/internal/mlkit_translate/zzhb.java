package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhb implements ObjectEncoder {

    /* renamed from: a */
    static final zzhb f43543a = new zzhb();

    /* renamed from: b */
    private static final FieldDescriptor f43544b;

    /* renamed from: c */
    private static final FieldDescriptor f43545c;

    /* renamed from: d */
    private static final FieldDescriptor f43546d;

    /* renamed from: e */
    private static final FieldDescriptor f43547e;

    /* renamed from: f */
    private static final FieldDescriptor f43548f;

    /* renamed from: g */
    private static final FieldDescriptor f43549g;

    /* renamed from: h */
    private static final FieldDescriptor f43550h;

    /* renamed from: i */
    private static final FieldDescriptor f43551i;

    /* renamed from: j */
    private static final FieldDescriptor f43552j;

    /* renamed from: k */
    private static final FieldDescriptor f43553k;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43544b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43545c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isColdCall");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43546d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("autoManageModelOnBackground");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43547e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("autoManageModelOnLowMemory");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43548f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("isNnApiEnabled");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43549g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("eventsCount");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43550h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("otherErrors");
        zzbc zzbc8 = new zzbc();
        zzbc8.mo52081a(8);
        f43551i = a8.mo23604b(zzbc8.mo52082b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("remoteConfigValueForAcceleration");
        zzbc zzbc9 = new zzbc();
        zzbc9.mo52081a(9);
        f43552j = a9.mo23604b(zzbc9.mo52082b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("isAccelerated");
        zzbc zzbc10 = new zzbc();
        zzbc10.mo52081a(10);
        f43553k = a10.mo23604b(zzbc10.mo52082b()).mo23603a();
    }

    private zzhb() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzku zzku = (zzku) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43544b, zzku.mo52241c());
        objectEncoderContext.mo23608e(f43545c, zzku.mo52239a());
        objectEncoderContext.mo23608e(f43546d, zzku.mo52240b());
        objectEncoderContext.mo23608e(f43547e, (Object) null);
        objectEncoderContext.mo23608e(f43548f, (Object) null);
        objectEncoderContext.mo23608e(f43549g, (Object) null);
        objectEncoderContext.mo23608e(f43550h, (Object) null);
        objectEncoderContext.mo23608e(f43551i, (Object) null);
        objectEncoderContext.mo23608e(f43552j, (Object) null);
        objectEncoderContext.mo23608e(f43553k, (Object) null);
    }
}
