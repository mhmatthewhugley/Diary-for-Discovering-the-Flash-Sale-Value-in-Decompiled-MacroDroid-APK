package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzdw implements ObjectEncoder {

    /* renamed from: a */
    static final zzdw f42147a = new zzdw();

    /* renamed from: b */
    private static final FieldDescriptor f42148b;

    /* renamed from: c */
    private static final FieldDescriptor f42149c;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("maxResults");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42148b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("modelType");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42149c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
    }

    private zzdw() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzho zzho = (zzho) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
