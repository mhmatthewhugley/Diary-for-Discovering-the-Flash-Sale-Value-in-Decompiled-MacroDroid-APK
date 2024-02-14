package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzduk implements zzgxi {

    /* renamed from: a */
    private final zzgxv f33139a;

    public zzduk(zzgxv zzgxv) {
        this.f33139a = zzgxv;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbez zzbez;
        if (((zzdcr) this.f33139a).mo44567a().f35640o.f35582a == 3) {
            zzbez = zzbez.REWARDED_INTERSTITIAL;
        } else {
            zzbez = zzbez.REWARD_BASED_VIDEO_AD;
        }
        zzgxq.m53658b(zzbez);
        return zzbez;
    }
}
