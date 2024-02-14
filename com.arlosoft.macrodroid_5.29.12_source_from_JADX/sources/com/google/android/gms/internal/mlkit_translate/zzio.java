package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzio implements ObjectEncoder {

    /* renamed from: a */
    static final zzio f43799a = new zzio();

    /* renamed from: b */
    private static final FieldDescriptor f43800b;

    /* renamed from: c */
    private static final FieldDescriptor f43801c;

    /* renamed from: d */
    private static final FieldDescriptor f43802d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("detectorMode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43800b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("streamModeSmoothingRatio");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43801c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("rawSizeMaskEnabled");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43802d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzio() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzmu zzmu = (zzmu) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
