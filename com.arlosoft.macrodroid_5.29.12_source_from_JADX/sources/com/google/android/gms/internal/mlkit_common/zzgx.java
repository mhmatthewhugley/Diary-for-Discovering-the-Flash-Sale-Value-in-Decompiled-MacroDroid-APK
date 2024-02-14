package com.google.android.gms.internal.mlkit_common;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzgx implements ObjectEncoder {

    /* renamed from: a */
    static final zzgx f42588a = new zzgx();

    /* renamed from: b */
    private static final FieldDescriptor f42589b;

    /* renamed from: c */
    private static final FieldDescriptor f42590c;

    /* renamed from: d */
    private static final FieldDescriptor f42591d;

    /* renamed from: e */
    private static final FieldDescriptor f42592e;

    /* renamed from: f */
    private static final FieldDescriptor f42593f;

    /* renamed from: g */
    private static final FieldDescriptor f42594g;

    /* renamed from: h */
    private static final FieldDescriptor f42595h;

    /* renamed from: i */
    private static final FieldDescriptor f42596i;

    /* renamed from: j */
    private static final FieldDescriptor f42597j;

    /* renamed from: k */
    private static final FieldDescriptor f42598k;

    /* renamed from: l */
    private static final FieldDescriptor f42599l;

    /* renamed from: m */
    private static final FieldDescriptor f42600m;

    static {
        FieldDescriptor.Builder a = FieldDescriptor.m7731a("deviceInfo");
        zzbh zzbh = new zzbh();
        zzbh.mo51821a(1);
        f42589b = a.mo23604b(zzbh.mo51822b()).mo23603a();
        FieldDescriptor.Builder a2 = FieldDescriptor.m7731a("nnapiInfo");
        zzbh zzbh2 = new zzbh();
        zzbh2.mo51821a(2);
        f42590c = a2.mo23604b(zzbh2.mo51822b()).mo23603a();
        FieldDescriptor.Builder a3 = FieldDescriptor.m7731a("gpuInfo");
        zzbh zzbh3 = new zzbh();
        zzbh3.mo51821a(3);
        f42591d = a3.mo23604b(zzbh3.mo51822b()).mo23603a();
        FieldDescriptor.Builder a4 = FieldDescriptor.m7731a("pipelineIdentifier");
        zzbh zzbh4 = new zzbh();
        zzbh4.mo51821a(4);
        f42592e = a4.mo23604b(zzbh4.mo51822b()).mo23603a();
        FieldDescriptor.Builder a5 = FieldDescriptor.m7731a("acceptedConfigurations");
        zzbh zzbh5 = new zzbh();
        zzbh5.mo51821a(5);
        f42593f = a5.mo23604b(zzbh5.mo51822b()).mo23603a();
        FieldDescriptor.Builder a6 = FieldDescriptor.m7731a("action");
        zzbh zzbh6 = new zzbh();
        zzbh6.mo51821a(6);
        f42594g = a6.mo23604b(zzbh6.mo51822b()).mo23603a();
        FieldDescriptor.Builder a7 = FieldDescriptor.m7731a(NotificationCompat.CATEGORY_STATUS);
        zzbh zzbh7 = new zzbh();
        zzbh7.mo51821a(7);
        f42595h = a7.mo23604b(zzbh7.mo51822b()).mo23603a();
        FieldDescriptor.Builder a8 = FieldDescriptor.m7731a("customErrors");
        zzbh zzbh8 = new zzbh();
        zzbh8.mo51821a(8);
        f42596i = a8.mo23604b(zzbh8.mo51822b()).mo23603a();
        FieldDescriptor.Builder a9 = FieldDescriptor.m7731a("benchmarkStatus");
        zzbh zzbh9 = new zzbh();
        zzbh9.mo51821a(9);
        f42597j = a9.mo23604b(zzbh9.mo51822b()).mo23603a();
        FieldDescriptor.Builder a10 = FieldDescriptor.m7731a("validationTestResult");
        zzbh zzbh10 = new zzbh();
        zzbh10.mo51821a(10);
        f42598k = a10.mo23604b(zzbh10.mo51822b()).mo23603a();
        FieldDescriptor.Builder a11 = FieldDescriptor.m7731a("timestampUs");
        zzbh zzbh11 = new zzbh();
        zzbh11.mo51821a(11);
        f42599l = a11.mo23604b(zzbh11.mo51822b()).mo23603a();
        FieldDescriptor.Builder a12 = FieldDescriptor.m7731a("elapsedUs");
        zzbh zzbh12 = new zzbh();
        zzbh12.mo51821a(12);
        f42600m = a12.mo23604b(zzbh12.mo51822b()).mo23603a();
    }

    private zzgx() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo19314a(Object obj, Object obj2) throws IOException {
        zzls zzls = (zzls) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        throw null;
    }
}
