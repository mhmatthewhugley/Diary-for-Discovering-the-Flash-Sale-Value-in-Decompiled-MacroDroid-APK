package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzfw implements ObjectEncoder {

    /* renamed from: a */
    static final zzfw f43393a = new zzfw();

    /* renamed from: b */
    private static final FieldDescriptor f43394b;

    /* renamed from: c */
    private static final FieldDescriptor f43395c;

    /* renamed from: d */
    private static final FieldDescriptor f43396d;

    /* renamed from: e */
    private static final FieldDescriptor f43397e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("remoteModelOptions");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43394b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("localModelOptions");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43395c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCodes");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43396d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("modelInitializationMs");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43397e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzfw() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzew zzew = (zzew) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
