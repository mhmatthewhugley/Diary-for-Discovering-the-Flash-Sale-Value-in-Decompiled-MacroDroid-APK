package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzhj implements ObjectEncoder {

    /* renamed from: a */
    static final zzhj f42654a = new zzhj();

    /* renamed from: b */
    private static final FieldDescriptor f42655b;

    /* renamed from: c */
    private static final FieldDescriptor f42656c;

    /* renamed from: d */
    private static final FieldDescriptor f42657d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("numSamples");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42655b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42656c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("metricResults");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42657d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzhj() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlv zzlv = (zzlv) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
