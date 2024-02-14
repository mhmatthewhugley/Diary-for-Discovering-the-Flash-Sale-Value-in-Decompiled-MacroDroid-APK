package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzhg implements ObjectEncoder {

    /* renamed from: a */
    static final zzhg f42645a = new zzhg();

    /* renamed from: b */
    private static final FieldDescriptor f42646b;

    /* renamed from: c */
    private static final FieldDescriptor f42647c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("sourceLanguage");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42646b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("targetLanguage");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42647c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
    }

    private zzhg() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlk zzlk = (zzlk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
