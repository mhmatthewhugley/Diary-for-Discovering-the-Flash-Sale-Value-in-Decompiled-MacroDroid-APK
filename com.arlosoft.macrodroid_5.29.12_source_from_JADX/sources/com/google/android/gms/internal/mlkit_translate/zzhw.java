package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzhw implements ObjectEncoder {

    /* renamed from: a */
    static final zzhw f43716a = new zzhw();

    /* renamed from: b */
    private static final FieldDescriptor f43717b;

    /* renamed from: c */
    private static final FieldDescriptor f43718c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43717b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("durationMs");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43718c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
    }

    private zzhw() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzmc zzmc = (zzmc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
