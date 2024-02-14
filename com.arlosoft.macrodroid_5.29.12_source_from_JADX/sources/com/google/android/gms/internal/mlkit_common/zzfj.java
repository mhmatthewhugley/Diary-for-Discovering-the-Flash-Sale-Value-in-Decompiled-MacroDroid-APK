package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfj implements ObjectEncoder {

    /* renamed from: a */
    static final zzfj f42420a = new zzfj();

    /* renamed from: b */
    private static final FieldDescriptor f42421b;

    /* renamed from: c */
    private static final FieldDescriptor f42422c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("eventType");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42421b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42422c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
    }

    private zzfj() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjr zzjr = (zzjr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
