package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzdm implements ObjectEncoder {

    /* renamed from: a */
    static final zzdm f42101a = new zzdm();

    /* renamed from: b */
    private static final FieldDescriptor f42102b;

    /* renamed from: c */
    private static final FieldDescriptor f42103c;

    /* renamed from: d */
    private static final FieldDescriptor f42104d;

    /* renamed from: e */
    private static final FieldDescriptor f42105e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42102b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("imageInfo");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42103c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isColdCall");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42104d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("detectorOptions");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42105e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
    }

    private zzdm() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzcl zzcl = (zzcl) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
