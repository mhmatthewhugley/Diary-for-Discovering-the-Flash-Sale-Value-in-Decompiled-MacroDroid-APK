package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzdr implements ObjectEncoder {

    /* renamed from: a */
    static final zzdr f42124a = new zzdr();

    /* renamed from: b */
    private static final FieldDescriptor f42125b;

    /* renamed from: c */
    private static final FieldDescriptor f42126c;

    /* renamed from: d */
    private static final FieldDescriptor f42127d;

    /* renamed from: e */
    private static final FieldDescriptor f42128e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("remoteModelOptions");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42125b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("localModelOptions");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42126c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("errorCodes");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42127d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("modelInitializationMs");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42128e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
    }

    private zzdr() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzcr zzcr = (zzcr) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
