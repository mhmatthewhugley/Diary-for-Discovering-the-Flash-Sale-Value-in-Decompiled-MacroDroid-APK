package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzha implements ObjectEncoder {

    /* renamed from: a */
    static final zzha f43539a = new zzha();

    /* renamed from: b */
    private static final FieldDescriptor f43540b;

    /* renamed from: c */
    private static final FieldDescriptor f43541c;

    /* renamed from: d */
    private static final FieldDescriptor f43542d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("detectorOptions");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43540b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventType");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43541c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43542d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzha() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkr zzkr = (zzkr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
