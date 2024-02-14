package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgn implements ObjectEncoder {

    /* renamed from: a */
    static final zzgn f42545a = new zzgn();

    /* renamed from: b */
    private static final FieldDescriptor f42546b;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("isFaceMeshEnabled");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42546b = a.mo23604b(zzbh.mo51822b()).mo23603a();
    }

    private zzgn() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkt zzkt = (zzkt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
