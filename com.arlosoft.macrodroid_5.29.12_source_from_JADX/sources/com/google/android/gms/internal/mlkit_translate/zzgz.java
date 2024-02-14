package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgz implements ObjectEncoder {

    /* renamed from: a */
    static final zzgz f43534a = new zzgz();

    /* renamed from: b */
    private static final FieldDescriptor f43535b;

    /* renamed from: c */
    private static final FieldDescriptor f43536c;

    /* renamed from: d */
    private static final FieldDescriptor f43537d;

    /* renamed from: e */
    private static final FieldDescriptor f43538e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("imageFormat");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43535b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("originalImageSize");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43536c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("compressedImageSize");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43537d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("isOdmlImage");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43538e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzgz() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkq zzkq = (zzkq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
