package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzij implements ObjectEncoder {

    /* renamed from: a */
    static final zzij f43771a = new zzij();

    /* renamed from: b */
    private static final FieldDescriptor f43772b;

    /* renamed from: c */
    private static final FieldDescriptor f43773c;

    /* renamed from: d */
    private static final FieldDescriptor f43774d;

    /* renamed from: e */
    private static final FieldDescriptor f43775e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43772b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43773c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("detectorOptions");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43774d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("objectInfos");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43775e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzij() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzmp zzmp = (zzmp) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
