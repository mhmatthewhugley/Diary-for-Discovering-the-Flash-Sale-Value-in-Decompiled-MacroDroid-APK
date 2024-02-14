package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzil implements ObjectEncoder {

    /* renamed from: a */
    static final zzil f43782a = new zzil();

    /* renamed from: b */
    private static final FieldDescriptor f43783b;

    /* renamed from: c */
    private static final FieldDescriptor f43784c;

    /* renamed from: d */
    private static final FieldDescriptor f43785d;

    /* renamed from: e */
    private static final FieldDescriptor f43786e;

    /* renamed from: f */
    private static final FieldDescriptor f43787f;

    /* renamed from: g */
    private static final FieldDescriptor f43788g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43783b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43784c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("detectorOptions");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43785d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("loadDurationMs");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43786e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("sessionDurationMs");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43787f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("sessionTotalInferenceDurationMs");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43788g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
    }

    private zzil() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzmr zzmr = (zzmr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
