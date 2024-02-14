package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzfd implements ObjectEncoder {

    /* renamed from: a */
    static final zzfd f43302a = new zzfd();

    /* renamed from: b */
    private static final FieldDescriptor f43303b;

    /* renamed from: c */
    private static final FieldDescriptor f43304c;

    /* renamed from: d */
    private static final FieldDescriptor f43305d;

    /* renamed from: e */
    private static final FieldDescriptor f43306e;

    /* renamed from: f */
    private static final FieldDescriptor f43307f;

    /* renamed from: g */
    private static final FieldDescriptor f43308g;

    /* renamed from: h */
    private static final FieldDescriptor f43309h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43303b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("hasResult");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43304c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isColdCall");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43305d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("imageInfo");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43306e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("options");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43307f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("detectedBarcodeFormats");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43308g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("detectedBarcodeValueTypes");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43309h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
    }

    private zzfd() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzec zzec = (zzec) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
