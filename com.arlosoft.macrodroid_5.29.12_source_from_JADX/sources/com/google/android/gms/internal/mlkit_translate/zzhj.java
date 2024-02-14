package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhj implements ObjectEncoder {

    /* renamed from: a */
    static final zzhj f43656a = new zzhj();

    /* renamed from: b */
    private static final FieldDescriptor f43657b;

    /* renamed from: c */
    private static final FieldDescriptor f43658c;

    /* renamed from: d */
    private static final FieldDescriptor f43659d;

    /* renamed from: e */
    private static final FieldDescriptor f43660e;

    /* renamed from: f */
    private static final FieldDescriptor f43661f;

    /* renamed from: g */
    private static final FieldDescriptor f43662g;

    /* renamed from: h */
    private static final FieldDescriptor f43663h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("options");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43657b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("roughDownloadDurationMs");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43658c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43659d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("exactDownloadDurationMs");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43660e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("downloadStatus");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43661f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("downloadFailureStatus");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43662g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("mddDownloadErrorCodes");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43663h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
    }

    private zzhj() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzll zzll = (zzll) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43657b, zzll.mo52272c());
        objectEncoderContext.mo23608e(f43658c, zzll.mo52274e());
        objectEncoderContext.mo23608e(f43659d, zzll.mo52270a());
        objectEncoderContext.mo23608e(f43660e, (Object) null);
        objectEncoderContext.mo23608e(f43661f, zzll.mo52271b());
        objectEncoderContext.mo23608e(f43662g, zzll.mo52273d());
        objectEncoderContext.mo23608e(f43663h, (Object) null);
    }
}
