package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzge implements ObjectEncoder {

    /* renamed from: a */
    static final zzge f42502a = new zzge();

    /* renamed from: b */
    private static final FieldDescriptor f42503b;

    /* renamed from: c */
    private static final FieldDescriptor f42504c;

    /* renamed from: d */
    private static final FieldDescriptor f42505d;

    /* renamed from: e */
    private static final FieldDescriptor f42506e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42503b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageInfo");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42504c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("detectorOptions");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42505d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("objectInfos");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42506e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
    }

    private zzge() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzkk zzkk = (zzkk) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
