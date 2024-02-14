package com.google.android.gms.internal.mlkit_translate;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzjl implements ObjectEncoder {

    /* renamed from: a */
    static final zzjl f43909a = new zzjl();

    /* renamed from: b */
    private static final FieldDescriptor f43910b;

    /* renamed from: c */
    private static final FieldDescriptor f43911c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("sourceLanguage");
        zzbc zzbc = new zzbc();
        zzbc.mo52081a(1);
        f43910b = a.mo23604b(zzbc.mo52082b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("targetLanguage");
        zzbc zzbc2 = new zzbc();
        zzbc2.mo52081a(2);
        f43911c = a2.mo23604b(zzbc2.mo52082b()).mo23603a();
    }

    private zzjl() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zznx zznx = (zznx) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f43910b, zznx.mo52364a());
        objectEncoderContext.mo23608e(f43911c, zznx.mo52365b());
    }
}
