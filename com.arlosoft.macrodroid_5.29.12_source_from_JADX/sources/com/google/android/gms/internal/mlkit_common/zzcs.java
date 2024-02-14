package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzcs implements ObjectEncoder {

    /* renamed from: a */
    static final zzcs f42001a = new zzcs();

    /* renamed from: b */
    private static final FieldDescriptor f42002b;

    /* renamed from: c */
    private static final FieldDescriptor f42003c;

    /* renamed from: d */
    private static final FieldDescriptor f42004d;

    /* renamed from: e */
    private static final FieldDescriptor f42005e;

    /* renamed from: f */
    private static final FieldDescriptor f42006f;

    /* renamed from: g */
    private static final FieldDescriptor f42007g;

    /* renamed from: h */
    private static final FieldDescriptor f42008h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42002b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("handledErrors");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42003c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("partiallyHandledErrors");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42004d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("unhandledErrors");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42005e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("modelNamespace");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42006f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("delegateFilter");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42007g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("httpResponseCode");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42008h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
    }

    private zzcs() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzbs zzbs = (zzbs) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}