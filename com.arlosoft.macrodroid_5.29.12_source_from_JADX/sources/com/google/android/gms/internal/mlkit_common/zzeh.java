package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzeh implements ObjectEncoder {

    /* renamed from: a */
    static final zzeh f42191a = new zzeh();

    /* renamed from: b */
    private static final FieldDescriptor f42192b;

    /* renamed from: c */
    private static final FieldDescriptor f42193c;

    /* renamed from: d */
    private static final FieldDescriptor f42194d;

    /* renamed from: e */
    private static final FieldDescriptor f42195e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("supportedFormats");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42192b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("durationMs");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42193c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42194d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("allowManualInput");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42195e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
    }

    private zzeh() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzhz zzhz = (zzhz) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
