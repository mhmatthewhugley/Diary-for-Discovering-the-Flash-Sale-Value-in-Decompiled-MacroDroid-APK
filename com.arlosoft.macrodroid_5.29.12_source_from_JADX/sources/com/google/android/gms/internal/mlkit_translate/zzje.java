package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzje implements ObjectEncoder {

    /* renamed from: a */
    static final zzje f43873a = new zzje();

    /* renamed from: b */
    private static final FieldDescriptor f43874b;

    /* renamed from: c */
    private static final FieldDescriptor f43875c;

    /* renamed from: d */
    private static final FieldDescriptor f43876d;

    /* renamed from: e */
    private static final FieldDescriptor f43877e;

    /* renamed from: f */
    private static final FieldDescriptor f43878f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43874b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("handledErrors");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43875c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("partiallyHandledErrors");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43876d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("unhandledErrors");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43877e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("httpResponseCode");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43878f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
    }

    private zzje() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznm zznm = (zznm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43874b, zznm.mo52337e());
        objectEncoderContext.mo23608e(f43875c, zznm.mo52333a());
        objectEncoderContext.mo23608e(f43876d, zznm.mo52334b());
        objectEncoderContext.mo23608e(f43877e, zznm.mo52335c());
        objectEncoderContext.mo23608e(f43878f, zznm.mo52336d());
    }
}
