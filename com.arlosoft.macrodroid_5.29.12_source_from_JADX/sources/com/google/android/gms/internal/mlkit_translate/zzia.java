package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzia implements ObjectEncoder {

    /* renamed from: a */
    static final zzia f43733a = new zzia();

    /* renamed from: b */
    private static final FieldDescriptor f43734b;

    /* renamed from: c */
    private static final FieldDescriptor f43735c;

    /* renamed from: d */
    private static final FieldDescriptor f43736d;

    /* renamed from: e */
    private static final FieldDescriptor f43737e;

    /* renamed from: f */
    private static final FieldDescriptor f43738f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43734b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("options");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43735c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43736d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("labelCount");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43737e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("highestConfidence");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43738f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
    }

    private zzia() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzmg zzmg = (zzmg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
