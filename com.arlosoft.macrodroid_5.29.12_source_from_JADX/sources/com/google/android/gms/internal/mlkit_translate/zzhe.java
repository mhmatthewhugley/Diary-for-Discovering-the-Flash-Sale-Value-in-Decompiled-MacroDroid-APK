package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhe implements ObjectEncoder {

    /* renamed from: a */
    static final zzhe f43565a = new zzhe();

    /* renamed from: b */
    private static final FieldDescriptor f43566b;

    /* renamed from: c */
    private static final FieldDescriptor f43567c;

    /* renamed from: d */
    private static final FieldDescriptor f43568d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelType");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43566b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isDownloaded");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43567c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("modelName");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43568d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzhe() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzky zzky = (zzky) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43566b, zzky.mo52245a());
        objectEncoderContext.mo23608e(f43567c, zzky.mo52246b());
        objectEncoderContext.mo23608e(f43568d, (Object) null);
    }
}
