package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzez implements ObjectEncoder {

    /* renamed from: a */
    static final zzez f43283a = new zzez();

    /* renamed from: b */
    private static final FieldDescriptor f43284b;

    /* renamed from: c */
    private static final FieldDescriptor f43285c;

    /* renamed from: d */
    private static final FieldDescriptor f43286d;

    /* renamed from: e */
    private static final FieldDescriptor f43287e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43284b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isColdCall");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43285c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43286d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("options");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43287e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzez() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzdy zzdy = (zzdy) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
