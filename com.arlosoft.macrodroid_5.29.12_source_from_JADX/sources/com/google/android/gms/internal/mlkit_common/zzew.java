package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzew implements ObjectEncoder {

    /* renamed from: a */
    static final zzew f42274a = new zzew();

    /* renamed from: b */
    private static final FieldDescriptor f42275b;

    /* renamed from: c */
    private static final FieldDescriptor f42276c;

    /* renamed from: d */
    private static final FieldDescriptor f42277d;

    /* renamed from: e */
    private static final FieldDescriptor f42278e;

    /* renamed from: f */
    private static final FieldDescriptor f42279f;

    /* renamed from: g */
    private static final FieldDescriptor f42280g;

    /* renamed from: h */
    private static final FieldDescriptor f42281h;

    /* renamed from: i */
    private static final FieldDescriptor f42282i;

    /* renamed from: j */
    private static final FieldDescriptor f42283j;

    /* renamed from: k */
    private static final FieldDescriptor f42284k;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("durationMs");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42275b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("errorCode");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42276c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("isColdCall");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42277d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("autoManageModelOnBackground");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42278e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("autoManageModelOnLowMemory");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42279f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("isNnApiEnabled");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42280g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a("eventsCount");
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42281h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("otherErrors");
        zzbh zzbh8 = new zzbh();
        zzbh8.mo51821a(8);
        f42282i = a8.mo23604b(zzbh8.mo51822b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("remoteConfigValueForAcceleration");
        zzbh zzbh9 = new zzbh();
        zzbh9.mo51821a(9);
        f42283j = a9.mo23604b(zzbh9.mo51822b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("isAccelerated");
        zzbh zzbh10 = new zzbh();
        zzbh10.mo51821a(10);
        f42284k = a10.mo23604b(zzbh10.mo51822b()).mo23603a();
    }

    private zzew() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzin zzin = (zzin) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
