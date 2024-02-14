package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzii implements ObjectEncoder {

    /* renamed from: a */
    static final zzii f43764a = new zzii();

    /* renamed from: b */
    private static final FieldDescriptor f43765b;

    /* renamed from: c */
    private static final FieldDescriptor f43766c;

    /* renamed from: d */
    private static final FieldDescriptor f43767d;

    /* renamed from: e */
    private static final FieldDescriptor f43768e;

    /* renamed from: f */
    private static final FieldDescriptor f43769f;

    /* renamed from: g */
    private static final FieldDescriptor f43770g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("detectorMode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43765b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("multipleObjectsEnabled");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43766c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("classificationEnabled");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43767d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("maxPerObjectLabelCount");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43768e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("classificationConfidenceThreshold");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43769f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("customLocalModelOptions");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43770g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
    }

    private zzii() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzmo zzmo = (zzmo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
