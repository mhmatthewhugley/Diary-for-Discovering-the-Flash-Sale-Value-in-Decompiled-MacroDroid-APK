package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzcx implements ObjectEncoder {

    /* renamed from: a */
    static final zzcx f42028a = new zzcx();

    /* renamed from: b */
    private static final FieldDescriptor f42029b;

    /* renamed from: c */
    private static final FieldDescriptor f42030c;

    /* renamed from: d */
    private static final FieldDescriptor f42031d;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("logEventKey");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42029b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("eventCount");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42030c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("inferenceDurationStats");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42031d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
    }

    private zzcx() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzby zzby = (zzby) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
