package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzji implements ObjectEncoder {

    /* renamed from: a */
    static final zzji f43899a = new zzji();

    /* renamed from: b */
    private static final FieldDescriptor f43900b;

    /* renamed from: c */
    private static final FieldDescriptor f43901c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("language");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43900b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43901c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
    }

    private zzji() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzns zzns = (zzns) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
