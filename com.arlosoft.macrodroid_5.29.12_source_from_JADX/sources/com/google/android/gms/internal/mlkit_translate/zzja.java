package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzja implements ObjectEncoder {

    /* renamed from: a */
    static final zzja f43846a = new zzja();

    /* renamed from: b */
    private static final FieldDescriptor f43847b;

    /* renamed from: c */
    private static final FieldDescriptor f43848c;

    /* renamed from: d */
    private static final FieldDescriptor f43849d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("name");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43847b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("stages");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43848c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("runMiniBenchmark");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43849d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzja() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzod zzod = (zzod) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
