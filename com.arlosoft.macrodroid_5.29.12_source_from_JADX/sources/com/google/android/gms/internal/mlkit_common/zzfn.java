package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfn implements ObjectEncoder {

    /* renamed from: a */
    static final zzfn f42436a = new zzfn();

    /* renamed from: b */
    private static final FieldDescriptor f42437b;

    /* renamed from: c */
    private static final FieldDescriptor f42438c;

    /* renamed from: d */
    private static final FieldDescriptor f42439d;

    /* renamed from: e */
    private static final FieldDescriptor f42440e;

    /* renamed from: f */
    private static final FieldDescriptor f42441f;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("inferenceCommonLogEvent");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42437b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("options");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42438c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("detectedBarcodeFormats");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42439d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("detectedBarcodeValueTypes");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42440e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("imageInfo");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42441f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
    }

    private zzfn() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjt zzjt = (zzjt) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
