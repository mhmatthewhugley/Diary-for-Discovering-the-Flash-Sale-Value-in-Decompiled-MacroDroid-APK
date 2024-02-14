package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzdb implements ObjectEncoder {

    /* renamed from: a */
    static final zzdb f42049a = new zzdb();

    /* renamed from: b */
    private static final FieldDescriptor f42050b;

    /* renamed from: c */
    private static final FieldDescriptor f42051c;

    /* renamed from: d */
    private static final FieldDescriptor f42052d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("logEventKey");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42050b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventCount");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42051c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("inferenceDurationStats");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42052d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzdb() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzcc zzcc = (zzcc) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
