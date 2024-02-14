package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgr implements ObjectEncoder {

    /* renamed from: a */
    static final zzgr f43480a = new zzgr();

    /* renamed from: b */
    private static final FieldDescriptor f43481b;

    /* renamed from: c */
    private static final FieldDescriptor f43482c;

    /* renamed from: d */
    private static final FieldDescriptor f43483d;

    /* renamed from: e */
    private static final FieldDescriptor f43484e;

    /* renamed from: f */
    private static final FieldDescriptor f43485f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("remoteModelOptions");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43481b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("localModelOptions");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43482c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCodes");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43483d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("modelInitializationMs");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43484e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("isNnApiEnabled");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43485f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
    }

    private zzgr() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkj zzkj = (zzkj) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
