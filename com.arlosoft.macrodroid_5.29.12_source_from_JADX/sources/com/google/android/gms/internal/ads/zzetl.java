package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzetl implements zzeve {

    /* renamed from: a */
    private final zzfzq f34884a;

    /* renamed from: b */
    private final Context f34885b;

    /* renamed from: c */
    private final Set f34886c;

    public zzetl(zzfzq zzfzq, Context context, Set set) {
        this.f34884a = zzfzq;
        this.f34885b = context;
        this.f34886c = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzetm mo45466a() throws Exception {
        zzbiu zzbiu = zzbjc.f27126g4;
        String str = null;
        if (((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
            Set set = this.f34886c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                zzt.m2888a();
                if (true == ((Boolean) zzay.m1924c().mo42663b(zzbiu)).booleanValue()) {
                    str = "a.1.3.31-google_20220407";
                }
                return new zzetm(str);
            }
        }
        return new zzetm((String) null);
    }

    public final int zza() {
        return 27;
    }

    public final zzfzp zzb() {
        return this.f34884a.mo46579F(new zzetk(this));
    }
}
