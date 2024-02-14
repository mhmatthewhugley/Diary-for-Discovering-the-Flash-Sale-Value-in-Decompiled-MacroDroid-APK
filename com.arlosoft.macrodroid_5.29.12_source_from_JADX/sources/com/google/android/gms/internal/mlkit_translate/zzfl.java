package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzfl implements ObjectEncoder {

    /* renamed from: a */
    static final zzfl f43342a = new zzfl();

    /* renamed from: b */
    private static final FieldDescriptor f43343b;

    /* renamed from: c */
    private static final FieldDescriptor f43344c;

    /* renamed from: d */
    private static final FieldDescriptor f43345d;

    /* renamed from: e */
    private static final FieldDescriptor f43346e;

    /* renamed from: f */
    private static final FieldDescriptor f43347f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43343b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("hasResult");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43344c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isColdCall");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43345d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43346e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("detectorOptions");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43347f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
    }

    private zzfl() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzek zzek = (zzek) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
