package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzix implements ObjectEncoder {

    /* renamed from: a */
    static final zzix f43830a = new zzix();

    /* renamed from: b */
    private static final FieldDescriptor f43831b;

    /* renamed from: c */
    private static final FieldDescriptor f43832c;

    /* renamed from: d */
    private static final FieldDescriptor f43833d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("languageOption");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(3);
        f43831b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isUsingLegacyApi");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(4);
        f43832c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("sdkVersion");
        zzbc zzbc3 = new zzbc();
        zzbc3.mo52081a(5);
        f43833d = a3.mo23604b(zzbc3.mo52082b()).mo23603a();
    }

    private zzix() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznd zznd = (zznd) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
