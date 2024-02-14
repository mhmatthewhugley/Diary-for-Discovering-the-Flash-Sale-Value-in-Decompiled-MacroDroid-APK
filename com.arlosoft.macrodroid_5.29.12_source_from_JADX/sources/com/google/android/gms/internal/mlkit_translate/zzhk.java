package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhk implements ObjectEncoder {

    /* renamed from: a */
    static final zzhk f43664a = new zzhk();

    /* renamed from: b */
    private static final FieldDescriptor f43665b;

    /* renamed from: c */
    private static final FieldDescriptor f43666c;

    /* renamed from: d */
    private static final FieldDescriptor f43667d;

    /* renamed from: e */
    private static final FieldDescriptor f43668e;

    /* renamed from: f */
    private static final FieldDescriptor f43669f;

    /* renamed from: g */
    private static final FieldDescriptor f43670g;

    /* renamed from: h */
    private static final FieldDescriptor f43671h;

    /* renamed from: i */
    private static final FieldDescriptor f43672i;

    /* renamed from: j */
    private static final FieldDescriptor f43673j;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("name");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43665b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a(ClientCookie.VERSION_ATTR);
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43666c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("source");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43667d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("uri");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43668e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("hash");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43669f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("modelType");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43670g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("size");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43671h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("hasLabelMap");
        zzbc zzbc8 = new zzbc();
        zzbc8.mo52081a(8);
        f43672i = a8.mo23604b(zzbc8.mo52082b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("isManifestModel");
        zzbc zzbc9 = new zzbc();
        zzbc9.mo52081a(9);
        f43673j = a9.mo23604b(zzbc9.mo52082b()).mo23603a();
    }

    private zzhk() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlq zzlq = (zzlq) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43665b, zzlq.mo52283d());
        objectEncoderContext.mo23608e(f43666c, (Object) null);
        objectEncoderContext.mo23608e(f43667d, zzlq.mo52281b());
        objectEncoderContext.mo23608e(f43668e, (Object) null);
        objectEncoderContext.mo23608e(f43669f, zzlq.mo52282c());
        objectEncoderContext.mo23608e(f43670g, zzlq.mo52280a());
        objectEncoderContext.mo23608e(f43671h, (Object) null);
        objectEncoderContext.mo23608e(f43672i, (Object) null);
        objectEncoderContext.mo23608e(f43673j, (Object) null);
    }
}
