package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzib implements ObjectEncoder {

    /* renamed from: a */
    static final zzib f43739a = new zzib();

    /* renamed from: b */
    private static final FieldDescriptor f43740b;

    /* renamed from: c */
    private static final FieldDescriptor f43741c;

    /* renamed from: d */
    private static final FieldDescriptor f43742d;

    /* renamed from: e */
    private static final FieldDescriptor f43743e;

    /* renamed from: f */
    private static final FieldDescriptor f43744f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("detectorOptions");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43740b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("errorCodes");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43741c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("totalInitializationMs");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43742d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("loggingInitializationMs");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43743e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("otherErrors");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43744f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
    }

    private zzib() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzmh zzmh = (zzmh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
