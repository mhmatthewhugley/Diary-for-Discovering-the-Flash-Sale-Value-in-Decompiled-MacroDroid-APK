package com.google.android.gms.internal.mlkit_translate;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zziy implements ObjectEncoder {

    /* renamed from: a */
    static final zziy f43834a = new zziy();

    /* renamed from: b */
    private static final FieldDescriptor f43835b;

    /* renamed from: c */
    private static final FieldDescriptor f43836c;

    /* renamed from: d */
    private static final FieldDescriptor f43837d;

    /* renamed from: e */
    private static final FieldDescriptor f43838e;

    /* renamed from: f */
    private static final FieldDescriptor f43839f;

    /* renamed from: g */
    private static final FieldDescriptor f43840g;

    /* renamed from: h */
    private static final FieldDescriptor f43841h;

    /* renamed from: i */
    private static final FieldDescriptor f43842i;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43835b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("options");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43836c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("inputLength");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43837d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("outputLength");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43838e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("loadDictionaryErrorCode");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43839f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("translateResultStatusCode");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43840g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a(NotificationCompat.CATEGORY_STATUS);
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43841h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("downloadHttpResponseCode");
        zzbc zzbc8 = new zzbc();
        zzbc8.mo52081a(8);
        f43842i = a8.mo23604b(zzbc8.mo52082b()).mo23603a();
    }

    private zziy() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznh zznh = (zznh) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43835b, zznh.mo52320a());
        objectEncoderContext.mo23608e(f43836c, zznh.mo52322c());
        objectEncoderContext.mo23608e(f43837d, zznh.mo52323d());
        objectEncoderContext.mo23608e(f43838e, zznh.mo52325f());
        objectEncoderContext.mo23608e(f43839f, zznh.mo52324e());
        objectEncoderContext.mo23608e(f43840g, zznh.mo52326g());
        objectEncoderContext.mo23608e(f43841h, zznh.mo52321b());
        objectEncoderContext.mo23608e(f43842i, (Object) null);
    }
}
