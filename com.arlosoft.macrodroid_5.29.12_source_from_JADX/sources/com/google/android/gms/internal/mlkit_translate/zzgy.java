package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgy implements ObjectEncoder {

    /* renamed from: a */
    static final zzgy f43526a = new zzgy();

    /* renamed from: b */
    private static final FieldDescriptor f43527b;

    /* renamed from: c */
    private static final FieldDescriptor f43528c;

    /* renamed from: d */
    private static final FieldDescriptor f43529d;

    /* renamed from: e */
    private static final FieldDescriptor f43530e;

    /* renamed from: f */
    private static final FieldDescriptor f43531f;

    /* renamed from: g */
    private static final FieldDescriptor f43532g;

    /* renamed from: h */
    private static final FieldDescriptor f43533h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("renderer");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43527b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("vendor");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43528c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a(ClientCookie.VERSION_ATTR);
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43529d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("maxImages");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43530e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("maxSsbo");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43531f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("workGroupSizes");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43532g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43533h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
    }

    private zzgy() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznz zznz = (zznz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
