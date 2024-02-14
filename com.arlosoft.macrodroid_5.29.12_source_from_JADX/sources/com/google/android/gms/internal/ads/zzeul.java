package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeul implements zzeve {

    /* renamed from: a */
    private final String f34948a;

    /* renamed from: b */
    private final zzfzq f34949b;

    /* renamed from: c */
    private final ScheduledExecutorService f34950c;

    /* renamed from: d */
    private final Context f34951d;

    /* renamed from: e */
    private final zzfef f34952e;

    /* renamed from: f */
    private final zzcom f34953f;

    zzeul(zzfzq zzfzq, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfef zzfef, zzcom zzcom) {
        this.f34949b = zzfzq;
        this.f34950c = scheduledExecutorService;
        this.f34948a = str;
        this.f34951d = context;
        this.f34952e = zzfef;
        this.f34953f = zzcom;
    }

    /* renamed from: a */
    public static /* synthetic */ zzfzp m49511a(zzeul zzeul) {
        String str = zzeul.f34948a;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27158j6)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzg r = zzeul.f34953f.mo44208r();
        zzdck zzdck = new zzdck();
        zzdck.mo44554c(zzeul.f34951d);
        zzfed zzfed = new zzfed();
        zzfed.mo45606J("adUnitId");
        zzfed.mo45618e(zzeul.f34952e.f35629d);
        zzfed.mo45605I(new zzq());
        zzdck.mo44557f(zzfed.mo45620g());
        r.mo20688c(zzdck.mo44558g());
        zzac zzac = new zzac();
        zzac.mo20670a(str);
        r.mo20687b(zzac.mo20671b());
        new zzdik();
        return zzfzg.m51411f(zzfzg.m51418m((zzfyx) zzfzg.m51420o(zzfyx.m51389C(r.mo20686a().mo20691c()), ((Long) zzay.m1924c().mo42663b(zzbjc.f27168k6)).longValue(), TimeUnit.MILLISECONDS, zzeul.f34950c), zzeuj.f34946a, zzeul.f34949b), Exception.class, zzeuk.f34947a, zzeul.f34949b);
    }

    public final int zza() {
        return 33;
    }

    public final zzfzp zzb() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27148i6)).booleanValue() || "adUnitId".equals(this.f34952e.f35631f)) {
            return this.f34949b.mo46579F(zzeuh.f34944a);
        }
        return zzfzg.m51417l(new zzeui(this), this.f34949b);
    }
}
