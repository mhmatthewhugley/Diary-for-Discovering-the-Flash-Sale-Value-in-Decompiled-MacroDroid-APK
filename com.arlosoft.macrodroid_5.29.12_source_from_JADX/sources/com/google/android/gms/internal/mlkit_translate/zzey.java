package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzey implements ObjectEncoder {

    /* renamed from: a */
    static final zzey f43279a = new zzey();

    /* renamed from: b */
    private static final FieldDescriptor f43280b;

    /* renamed from: c */
    private static final FieldDescriptor f43281c;

    /* renamed from: d */
    private static final FieldDescriptor f43282d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("logEventKey");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43280b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventCount");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43281c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("inferenceDurationStats");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43282d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzey() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzdz zzdz = (zzdz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
