package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhm implements ObjectEncoder {

    /* renamed from: a */
    static final zzhm f43679a = new zzhm();

    /* renamed from: b */
    private static final FieldDescriptor f43680b;

    /* renamed from: c */
    private static final FieldDescriptor f43681c;

    /* renamed from: d */
    private static final FieldDescriptor f43682d;

    /* renamed from: e */
    private static final FieldDescriptor f43683e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("isChargingRequired");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43680b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isWifiRequired");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43681c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isDeviceIdleRequired");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(3);
        f43682d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("canDownloadInBackground");
        zzbc zzbc4 = new zzbc();
        zzbc4.mo52081a(4);
        f43683e = a4.mo23604b(zzbc4.mo52082b()).mo23603a();
    }

    private zzhm() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzls zzls = (zzls) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
