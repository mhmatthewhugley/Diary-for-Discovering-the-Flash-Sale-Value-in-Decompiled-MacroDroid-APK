package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgv implements ObjectEncoder {

    /* renamed from: a */
    static final zzgv f43508a = new zzgv();

    /* renamed from: b */
    private static final FieldDescriptor f43509b;

    /* renamed from: c */
    private static final FieldDescriptor f43510c;

    /* renamed from: d */
    private static final FieldDescriptor f43511d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("options");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43509b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventType");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43510c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43511d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzgv() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzko zzko = (zzko) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
