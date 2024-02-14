package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgs implements ObjectEncoder {

    /* renamed from: a */
    static final zzgs f43486a = new zzgs();

    /* renamed from: b */
    private static final FieldDescriptor f43487b;

    /* renamed from: c */
    private static final FieldDescriptor f43488c;

    /* renamed from: d */
    private static final FieldDescriptor f43489d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelType");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43487b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isSuccessful");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43488c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("modelName");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43489d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzgs() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkm zzkm = (zzkm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43487b, zzkm.mo52229a());
        objectEncoderContext.mo23608e(f43488c, zzkm.mo52230b());
        objectEncoderContext.mo23608e(f43489d, (Object) null);
    }
}
