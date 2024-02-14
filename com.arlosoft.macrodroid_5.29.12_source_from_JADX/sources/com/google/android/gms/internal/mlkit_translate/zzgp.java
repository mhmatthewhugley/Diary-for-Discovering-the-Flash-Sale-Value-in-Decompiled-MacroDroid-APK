package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgp implements ObjectEncoder {

    /* renamed from: a */
    static final zzgp f43471a = new zzgp();

    /* renamed from: b */
    private static final FieldDescriptor f43472b;

    /* renamed from: c */
    private static final FieldDescriptor f43473c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("type");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43472b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("dims");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43473c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
    }

    private zzgp() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkh zzkh = (zzkh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
