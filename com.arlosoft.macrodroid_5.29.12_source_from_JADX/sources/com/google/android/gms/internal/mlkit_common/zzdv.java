package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzdv implements ObjectEncoder {

    /* renamed from: a */
    static final zzdv f42143a = new zzdv();

    /* renamed from: b */
    private static final FieldDescriptor f42144b;

    /* renamed from: c */
    private static final FieldDescriptor f42145c;

    /* renamed from: d */
    private static final FieldDescriptor f42146d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42144b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("options");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42145c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("imageInfo");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42146d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzdv() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzhn zzhn = (zzhn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
