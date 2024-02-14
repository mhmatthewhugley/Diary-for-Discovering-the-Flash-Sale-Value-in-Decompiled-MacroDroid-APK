package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzcdf extends RewardedInterstitialAd {

    /* renamed from: a */
    private final String f28225a;

    /* renamed from: b */
    private final zzccl f28226b;

    /* renamed from: c */
    private final Context f28227c;

    /* renamed from: d */
    private final zzcdd f28228d = new zzcdd();

    public zzcdf(Context context, String str) {
        this.f28225a = str;
        this.f28227c = context.getApplicationContext();
        this.f28226b = zzaw.m1916a().mo19882o(context, str, new zzbvh());
    }

    @NonNull
    /* renamed from: a */
    public final ResponseInfo mo20715a() {
        zzdh zzdh = null;
        try {
            zzccl zzccl = this.f28226b;
            if (zzccl != null) {
                zzdh = zzccl.mo20122a();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.m1739e(zzdh);
    }

    /* renamed from: c */
    public final void mo20716c(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f28228d.mo43389Jb(onUserEarnedRewardListener);
        try {
            zzccl zzccl = this.f28226b;
            if (zzccl != null) {
                zzccl.mo20125eb(this.f28228d);
                this.f28226b.mo20121Pa(ObjectWrapper.m5051g8(activity));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo43390d(zzdr zzdr, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            zzccl zzccl = this.f28226b;
            if (zzccl != null) {
                zzccl.mo20117Fb(zzp.f2018a.mo20160a(this.f28227c, zzdr), new zzcde(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }
}
