package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgq implements ObjectEncoder {

    /* renamed from: a */
    static final zzgq f43474a = new zzgq();

    /* renamed from: b */
    private static final FieldDescriptor f43475b;

    /* renamed from: c */
    private static final FieldDescriptor f43476c;

    /* renamed from: d */
    private static final FieldDescriptor f43477d;

    /* renamed from: e */
    private static final FieldDescriptor f43478e;

    /* renamed from: f */
    private static final FieldDescriptor f43479f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43475b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("options");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43476c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("inputsFormats");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43477d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("outputFormats");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43478e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("modelInitializationMs");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43479f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
    }

    private zzgq() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzki zzki = (zzki) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
