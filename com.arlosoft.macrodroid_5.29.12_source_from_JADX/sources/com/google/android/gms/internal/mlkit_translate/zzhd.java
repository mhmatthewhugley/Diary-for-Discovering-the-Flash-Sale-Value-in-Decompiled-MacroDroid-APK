package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhd implements ObjectEncoder {

    /* renamed from: a */
    static final zzhd f43557a = new zzhd();

    /* renamed from: b */
    private static final FieldDescriptor f43558b;

    /* renamed from: c */
    private static final FieldDescriptor f43559c;

    /* renamed from: d */
    private static final FieldDescriptor f43560d;

    /* renamed from: e */
    private static final FieldDescriptor f43561e;

    /* renamed from: f */
    private static final FieldDescriptor f43562f;

    /* renamed from: g */
    private static final FieldDescriptor f43563g;

    /* renamed from: h */
    private static final FieldDescriptor f43564h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43558b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageSource");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43559c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("imageFormat");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43560d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("imageByteSize");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43561e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("imageWidth");
        zzbc zzbc5 = new zzbc();
        zzbc5.mo52081a(5);
        f43562f = a5.mo23604b(zzbc5.mo52082b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("imageHeight");
        zzbc zzbc6 = new zzbc();
        zzbc6.mo52081a(6);
        f43563g = a6.mo23604b(zzbc6.mo52082b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("rotationDegrees");
        zzbc zzbc7 = new zzbc();
        zzbc7.mo52081a(7);
        f43564h = a7.mo23604b(zzbc7.mo52082b()).mo23603a();
    }

    private zzhd() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkv zzkv = (zzkv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
