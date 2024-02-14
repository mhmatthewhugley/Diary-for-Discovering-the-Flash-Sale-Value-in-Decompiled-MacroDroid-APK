package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzgo implements ObjectEncoder {

    /* renamed from: a */
    static final zzgo f43468a = new zzgo();

    /* renamed from: b */
    private static final FieldDescriptor f43469b;

    /* renamed from: c */
    private static final FieldDescriptor f43470c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("options");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43469b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("errorCode");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43470c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
    }

    private zzgo() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkg zzkg = (zzkg) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
