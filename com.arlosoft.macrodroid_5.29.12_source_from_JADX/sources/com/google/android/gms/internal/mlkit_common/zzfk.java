package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzfk implements ObjectEncoder {

    /* renamed from: a */
    static final zzfk f42423a = new zzfk();

    /* renamed from: b */
    private static final FieldDescriptor f42424b;

    /* renamed from: c */
    private static final FieldDescriptor f42425c;

    /* renamed from: d */
    private static final FieldDescriptor f42426d;

    /* renamed from: e */
    private static final FieldDescriptor f42427e;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("name");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42424b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("type");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42425c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a(ClientCookie.VERSION_ATTR);
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42426d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("featureLevel");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42427e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
    }

    private zzfk() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlo zzlo = (zzlo) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
