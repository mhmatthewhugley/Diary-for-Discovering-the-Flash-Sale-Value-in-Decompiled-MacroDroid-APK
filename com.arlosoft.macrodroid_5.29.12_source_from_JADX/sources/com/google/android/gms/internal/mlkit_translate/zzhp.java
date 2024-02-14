package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhp implements ObjectEncoder {

    /* renamed from: a */
    static final zzhp f43690a = new zzhp();

    /* renamed from: b */
    private static final FieldDescriptor f43691b;

    /* renamed from: c */
    private static final FieldDescriptor f43692c;

    /* renamed from: d */
    private static final FieldDescriptor f43693d;

    /* renamed from: e */
    private static final FieldDescriptor f43694e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("name");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43691b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("type");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43692c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a(ClientCookie.VERSION_ATTR);
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43693d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("featureLevel");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43694e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzhp() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzob zzob = (zzob) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
