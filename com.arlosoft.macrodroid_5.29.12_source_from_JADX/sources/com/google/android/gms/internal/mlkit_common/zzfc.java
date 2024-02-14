package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfc implements ObjectEncoder {

    /* renamed from: a */
    static final zzfc f42310a = new zzfc();

    /* renamed from: b */
    private static final FieldDescriptor f42311b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("api");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42311b = a.mo23604b(zzbh.mo51822b()).mo23603a();
    }

    private zzfc() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        ((ObjectEncoderContext) obj2).mo23608e(f42311b, ((zzix) obj).mo51882a());
    }
}
