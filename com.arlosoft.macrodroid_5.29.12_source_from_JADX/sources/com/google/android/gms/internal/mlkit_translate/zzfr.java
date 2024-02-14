package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzfr implements ObjectEncoder {

    /* renamed from: a */
    static final zzfr f43370a = new zzfr();

    /* renamed from: b */
    private static final FieldDescriptor f43371b;

    /* renamed from: c */
    private static final FieldDescriptor f43372c;

    /* renamed from: d */
    private static final FieldDescriptor f43373d;

    /* renamed from: e */
    private static final FieldDescriptor f43374e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43371b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43372c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isColdCall");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43373d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("detectorOptions");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43374e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzfr() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzeq zzeq = (zzeq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
