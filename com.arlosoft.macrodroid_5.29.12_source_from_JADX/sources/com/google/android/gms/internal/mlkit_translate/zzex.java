package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzex implements ObjectEncoder {

    /* renamed from: a */
    static final zzex f43271a = new zzex();

    /* renamed from: b */
    private static final FieldDescriptor f43272b;

    /* renamed from: c */
    private static final FieldDescriptor f43273c;

    /* renamed from: d */
    private static final FieldDescriptor f43274d;

    /* renamed from: e */
    private static final FieldDescriptor f43275e;

    /* renamed from: f */
    private static final FieldDescriptor f43276f;

    /* renamed from: g */
    private static final FieldDescriptor f43277g;

    /* renamed from: h */
    private static final FieldDescriptor f43278h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43272b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("handledErrors");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43273c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("partiallyHandledErrors");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43274d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("unhandledErrors");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43275e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("modelNamespace");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43276f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("delegateFilter");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43277g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("httpResponseCode");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43278h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
    }

    private zzex() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzdx zzdx = (zzdx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}