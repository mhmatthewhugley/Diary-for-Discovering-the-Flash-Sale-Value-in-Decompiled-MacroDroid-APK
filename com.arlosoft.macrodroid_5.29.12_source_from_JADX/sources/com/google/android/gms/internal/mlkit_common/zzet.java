package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
import org.apache.http.cookie.ClientCookie;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzet implements ObjectEncoder {

    /* renamed from: a */
    static final zzet f42257a = new zzet();

    /* renamed from: b */
    private static final FieldDescriptor f42258b;

    /* renamed from: c */
    private static final FieldDescriptor f42259c;

    /* renamed from: d */
    private static final FieldDescriptor f42260d;

    /* renamed from: e */
    private static final FieldDescriptor f42261e;

    /* renamed from: f */
    private static final FieldDescriptor f42262f;

    /* renamed from: g */
    private static final FieldDescriptor f42263g;

    /* renamed from: h */
    private static final FieldDescriptor f42264h;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("renderer");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42258b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("vendor");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42259c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a(ClientCookie.VERSION_ATTR);
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42260d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("maxImages");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42261e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("maxSsbo");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42262f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("workGroupSizes");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42263g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42264h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
    }

    private zzet() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzlm zzlm = (zzlm) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
