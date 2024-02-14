package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfh implements ObjectEncoder {

    /* renamed from: a */
    static final zzfh f42412a = new zzfh();

    /* renamed from: b */
    private static final FieldDescriptor f42413b;

    /* renamed from: c */
    private static final FieldDescriptor f42414c;

    /* renamed from: d */
    private static final FieldDescriptor f42415d;

    /* renamed from: e */
    private static final FieldDescriptor f42416e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("isChargingRequired");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42413b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("isWifiRequired");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42414c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isDeviceIdleRequired");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42415d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("canDownloadInBackground");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42416e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
    }

    private zzfh() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzjn zzjn = (zzjn) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
