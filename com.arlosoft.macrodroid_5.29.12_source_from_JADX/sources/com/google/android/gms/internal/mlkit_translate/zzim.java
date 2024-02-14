package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzim implements ObjectEncoder {

    /* renamed from: a */
    static final zzim f43789a = new zzim();

    /* renamed from: b */
    private static final FieldDescriptor f43790b;

    /* renamed from: c */
    private static final FieldDescriptor f43791c;

    /* renamed from: d */
    private static final FieldDescriptor f43792d;

    /* renamed from: e */
    private static final FieldDescriptor f43793e;

    /* renamed from: f */
    private static final FieldDescriptor f43794f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("detectorMode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43790b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("personDetectionMode");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43791c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("landmarkDetectionMode");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43792d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("preferredHardwareConfigs");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43793e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("runConfig");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43794f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
    }

    private zzim() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzms zzms = (zzms) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
