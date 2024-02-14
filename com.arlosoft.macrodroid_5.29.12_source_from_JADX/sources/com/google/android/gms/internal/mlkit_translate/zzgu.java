package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgu implements ObjectEncoder {

    /* renamed from: a */
    static final zzgu f43501a = new zzgu();

    /* renamed from: b */
    private static final FieldDescriptor f43502b;

    /* renamed from: c */
    private static final FieldDescriptor f43503c;

    /* renamed from: d */
    private static final FieldDescriptor f43504d;

    /* renamed from: e */
    private static final FieldDescriptor f43505e;

    /* renamed from: f */
    private static final FieldDescriptor f43506f;

    /* renamed from: g */
    private static final FieldDescriptor f43507g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("maxMs");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43502b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("minMs");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43503c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("avgMs");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43504d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("firstQuartileMs");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43505e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("medianMs");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43506f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("thirdQuartileMs");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43507g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
    }

    private zzgu() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkn zzkn = (zzkn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
