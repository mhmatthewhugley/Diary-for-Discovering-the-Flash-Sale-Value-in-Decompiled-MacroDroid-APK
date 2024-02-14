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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzccu extends RewardedAd {

    /* renamed from: a */
    private final String f28209a;

    /* renamed from: b */
    private final zzccl f28210b;

    /* renamed from: c */
    private final Context f28211c;

    /* renamed from: d */
    private final zzcdd f28212d = new zzcdd();

    public zzccu(Context context, String str) {
        this.f28211c = context.getApplicationContext();
        this.f28209a = str;
        this.f28210b = zzaw.m1916a().mo19882o(context, str, new zzbvh());
    }

    @NonNull
    /* renamed from: a */
    public final ResponseInfo mo20711a() {
        zzdh zzdh = null;
        try {
            zzccl zzccl = this.f28210b;
            if (zzccl != null) {
                zzdh = zzccl.mo20122a();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.m1739e(zzdh);
    }

    /* renamed from: c */
    public final void mo20712c(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f28212d.mo43389Jb(onUserEarnedRewardListener);
        if (activity == null) {
            zzcgp.m45229g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzccl zzccl = this.f28210b;
            if (zzccl != null) {
                zzccl.mo20125eb(this.f28212d);
                this.f28210b.mo20121Pa(ObjectWrapper.m5051g8(activity));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo43363d(zzdr zzdr, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzccl zzccl = this.f28210b;
            if (zzccl != null) {
                zzccl.mo20127r7(zzp.f2018a.mo20160a(this.f28211c, zzdr), new zzccy(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }
}
