package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzevh {

    /* renamed from: a */
    private final Context f35004a;

    /* renamed from: b */
    private final Set f35005b;

    /* renamed from: c */
    private final Executor f35006c;

    /* renamed from: d */
    private final zzfju f35007d;

    /* renamed from: e */
    private final zzdxq f35008e;

    public zzevh(Context context, Executor executor, Set set, zzfju zzfju, zzdxq zzdxq) {
        this.f35004a = context;
        this.f35006c = executor;
        this.f35005b = set;
        this.f35007d = zzfju;
        this.f35008e = zzdxq;
    }

    /* renamed from: a */
    public final zzfzp mo45481a(Object obj) {
        zzfjj a = zzfji.m50258a(this.f35004a, 8);
        a.mo45794c();
        ArrayList arrayList = new ArrayList(this.f35005b.size());
        for (zzeve zzeve : this.f35005b) {
            zzfzp zzb = zzeve.zzb();
            zzb.mo43580q(new zzevf(this, zzeve), zzchc.f28461f);
            arrayList.add(zzb);
        }
        zzfzp a2 = zzfzg.m51408c(arrayList).mo46623a(new zzevg(arrayList, obj), this.f35006c);
        if (zzfjw.m50333a()) {
            zzfjt.m50318a(a2, this.f35007d, a);
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo45482b(zzeve zzeve) {
        long c = zzt.m2889b().mo21952c() - zzt.m2889b().mo21952c();
        if (((Boolean) zzbkv.f27469a.mo42728e()).booleanValue()) {
            String c2 = zzftm.m50972c(zzeve.getClass().getCanonicalName());
            zze.m2645k("Signal runtime (ms) : " + c2 + " = " + c);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26948O1)).booleanValue()) {
            zzdxp a = this.f35008e.mo45050a();
            a.mo45041b("action", "lat_ms");
            a.mo45041b("lat_grp", "sig_lat_grp");
            a.mo45041b("lat_id", String.valueOf(zzeve.zza()));
            a.mo45041b("clat_ms", String.valueOf(c));
            a.mo45047h();
        }
    }
}
