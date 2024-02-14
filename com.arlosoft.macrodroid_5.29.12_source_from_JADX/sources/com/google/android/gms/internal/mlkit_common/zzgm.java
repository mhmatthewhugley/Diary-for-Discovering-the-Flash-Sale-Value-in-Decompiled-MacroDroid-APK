package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgm implements ObjectEncoder {

    /* renamed from: a */
    static final zzgm f42541a = new zzgm();

    /* renamed from: b */
    private static final FieldDescriptor f42542b;

    /* renamed from: c */
    private static final FieldDescriptor f42543c;

    /* renamed from: d */
    private static final FieldDescriptor f42544d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42542b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("detectorOptions");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42543c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("imageInfo");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42544d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzgm() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzks zzks = (zzks) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
