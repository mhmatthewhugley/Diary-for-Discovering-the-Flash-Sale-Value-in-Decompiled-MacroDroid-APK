package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfg implements ObjectEncoder {

    /* renamed from: a */
    static final zzfg f42407a = new zzfg();

    /* renamed from: b */
    private static final FieldDescriptor f42408b;

    /* renamed from: c */
    private static final FieldDescriptor f42409c;

    /* renamed from: d */
    private static final FieldDescriptor f42410d;

    /* renamed from: e */
    private static final FieldDescriptor f42411e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("modelInfo");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42408b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("initialDownloadConditions");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42409c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("updateDownloadConditions");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42410d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("isModelUpdateEnabled");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42411e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
    }

    private zzfg() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.mo23608e(f42408b, ((zzjp) obj).mo51925a());
        objectEncoderContext.mo23608e(f42409c, (Object) null);
        objectEncoderContext.mo23608e(f42410d, (Object) null);
        objectEncoderContext.mo23608e(f42411e, (Object) null);
    }
}
