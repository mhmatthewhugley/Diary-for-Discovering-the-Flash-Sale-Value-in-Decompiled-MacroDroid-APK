package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzev implements ObjectEncoder {

    /* renamed from: a */
    static final zzev f42270a = new zzev();

    /* renamed from: b */
    private static final FieldDescriptor f42271b;

    /* renamed from: c */
    private static final FieldDescriptor f42272c;

    /* renamed from: d */
    private static final FieldDescriptor f42273d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("detectorOptions");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42271b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventType");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42272c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42273d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzev() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzim zzim = (zzim) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
