package com.google.android.gms.internal.mlkit_translate;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzjc implements ObjectEncoder {

    /* renamed from: a */
    static final zzjc f43857a = new zzjc();

    /* renamed from: b */
    private static final FieldDescriptor f43858b;

    /* renamed from: c */
    private static final FieldDescriptor f43859c;

    /* renamed from: d */
    private static final FieldDescriptor f43860d;

    /* renamed from: e */
    private static final FieldDescriptor f43861e;

    /* renamed from: f */
    private static final FieldDescriptor f43862f;

    /* renamed from: g */
    private static final FieldDescriptor f43863g;

    /* renamed from: h */
    private static final FieldDescriptor f43864h;

    /* renamed from: i */
    private static final FieldDescriptor f43865i;

    /* renamed from: j */
    private static final FieldDescriptor f43866j;

    /* renamed from: k */
    private static final FieldDescriptor f43867k;

    /* renamed from: l */
    private static final FieldDescriptor f43868l;

    /* renamed from: m */
    private static final FieldDescriptor f43869m;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("deviceInfo");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43858b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("nnapiInfo");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43859c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("gpuInfo");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43860d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("pipelineIdentifier");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43861e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("acceptedConfigurations");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43862f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("action");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43863g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a(NotificationCompat.CATEGORY_STATUS);
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43864h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("customErrors");
        zzbc zzbc8 = new zzbc();
        zzbc8.mo52081a(8);
        f43865i = a8.mo23604b(zzbc8.mo52082b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("benchmarkStatus");
        zzbc zzbc9 = new zzbc();
        zzbc9.mo52081a(9);
        f43866j = a9.mo23604b(zzbc9.mo52082b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("validationTestResult");
        zzbc zzbc10 = new zzbc();
        zzbc10.mo52081a(10);
        f43867k = a10.mo23604b(zzbc10.mo52082b()).mo23603a();
        FieldDescriptor.Builder a11 = FieldDescriptor.m7731a("timestampUs");
        zzbc zzbc11 = new zzbc();
        zzbc11.mo52081a(11);
        f43868l = a11.mo23604b(zzbc11.mo52082b()).mo23603a();
        FieldDescriptor.Builder a12 = FieldDescriptor.m7731a("elapsedUs");
        zzbc zzbc12 = new zzbc();
        zzbc12.mo52081a(12);
        f43869m = a12.mo23604b(zzbc12.mo52082b()).mo23603a();
    }

    private zzjc() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzof zzof = (zzof) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
