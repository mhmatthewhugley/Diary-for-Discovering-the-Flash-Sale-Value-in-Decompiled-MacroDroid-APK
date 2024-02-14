package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeck implements zzedi {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Pattern f33682h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    private final zzebl f33683a;

    /* renamed from: b */
    private final zzfzq f33684b;

    /* renamed from: c */
    private final zzfef f33685c;

    /* renamed from: d */
    private final ScheduledExecutorService f33686d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzefo f33687e;

    /* renamed from: f */
    private final zzfju f33688f;

    /* renamed from: g */
    private final Context f33689g;

    zzeck(Context context, zzfef zzfef, zzebl zzebl, zzfzq zzfzq, ScheduledExecutorService scheduledExecutorService, zzefo zzefo, zzfju zzfju) {
        this.f33689g = context;
        this.f33685c = zzfef;
        this.f33683a = zzebl;
        this.f33684b = zzfzq;
        this.f33686d = scheduledExecutorService;
        this.f33687e = zzefo;
        this.f33688f = zzfju;
    }

    /* renamed from: a */
    public final zzfzp mo45167a(zzcbc zzcbc) {
        zzfzp b = this.f33683a.mo45155b(zzcbc);
        zzfjj a = zzfji.m50258a(this.f33689g, 11);
        zzfjt.m50321d(b, a);
        zzfzp n = zzfzg.m51419n(b, new zzech(this), this.f33684b);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26841D4)).booleanValue()) {
            n = zzfzg.m51412g(zzfzg.m51420o(n, (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26851E4)).intValue(), TimeUnit.SECONDS, this.f33686d), TimeoutException.class, zzeci.f33680a, zzchc.f28461f);
        }
        zzfjt.m50318a(n, this.f33688f, a);
        zzfzg.m51423r(n, new zzecj(this), zzchc.f28461f);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo45168c(InputStream inputStream) throws Exception {
        return zzfzg.m51414i(new zzfdw(new zzfdt(this.f33685c), zzfdv.m49948a(new InputStreamReader(inputStream))));
    }
}
