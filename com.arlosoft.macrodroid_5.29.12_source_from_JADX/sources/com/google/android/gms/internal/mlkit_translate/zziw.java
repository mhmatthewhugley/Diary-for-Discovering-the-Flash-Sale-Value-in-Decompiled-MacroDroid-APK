package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zziw implements ObjectEncoder {

    /* renamed from: a */
    static final zziw f43826a = new zziw();

    /* renamed from: b */
    private static final FieldDescriptor f43827b;

    /* renamed from: c */
    private static final FieldDescriptor f43828c;

    /* renamed from: d */
    private static final FieldDescriptor f43829d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43827b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43828c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("recognizerOptions");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43829d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zziw() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznc zznc = (zznc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
