package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzfz implements ObjectEncoder {

    /* renamed from: a */
    static final zzfz f43405a = new zzfz();

    /* renamed from: b */
    private static final FieldDescriptor f43406b;

    /* renamed from: c */
    private static final FieldDescriptor f43407c;

    /* renamed from: d */
    private static final FieldDescriptor f43408d;

    /* renamed from: e */
    private static final FieldDescriptor f43409e;

    /* renamed from: f */
    private static final FieldDescriptor f43410f;

    /* renamed from: g */
    private static final FieldDescriptor f43411g;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("cameraSource");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43406b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventType");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43407c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("requestedPreviewHeight");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43408d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("requestedPreviewWidth");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43409e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("actualPreviewHeight");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43410f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("actualPreviewWidth");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43411g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
    }

    private zzfz() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjr zzjr = (zzjr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
