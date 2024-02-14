package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbsm extends AdManagerInterstitialAd {

    /* renamed from: a */
    private final Context f27705a;

    /* renamed from: b */
    private final zzp f27706b = zzp.f2018a;

    /* renamed from: c */
    private final zzbs f27707c;

    /* renamed from: d */
    private final String f27708d;

    /* renamed from: e */
    private final zzbvh f27709e;
    @Nullable

    /* renamed from: f */
    private FullScreenContentCallback f27710f;

    public zzbsm(Context context, String str) {
        zzbvh zzbvh = new zzbvh();
        this.f27709e = zzbvh;
        this.f27705a = context;
        this.f27708d = str;
        this.f27707c = zzaw.m1916a().mo19877e(context, new zzq(), str, zzbvh);
    }

    @NonNull
    /* renamed from: a */
    public final ResponseInfo mo20461a() {
        zzdh zzdh = null;
        try {
            zzbs zzbs = this.f27707c;
            if (zzbs != null) {
                zzdh = zzbs.mo19933i();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.m1739e(zzdh);
    }

    /* renamed from: c */
    public final void mo20462c(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f27710f = fullScreenContentCallback;
            zzbs zzbs = this.f27707c;
            if (zzbs != null) {
                zzbs.mo19936m8(new zzaz(fullScreenContentCallback));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo20463d(boolean z) {
        try {
            zzbs zzbs = this.f27707c;
            if (zzbs != null) {
                zzbs.mo19945ya(z);
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo20464e(@NonNull Activity activity) {
        if (activity == null) {
            zzcgp.m45229g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbs zzbs = this.f27707c;
            if (zzbs != null) {
                zzbs.mo19942t8(ObjectWrapper.m5051g8(activity));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo42952f(zzdr zzdr, AdLoadCallback adLoadCallback) {
        try {
            zzbs zzbs = this.f27707c;
            if (zzbs != null) {
                zzbs.mo19928c3(this.f27706b.mo20160a(this.f27705a, zzdr), new zzh(adLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", "com.google.android.gms.ads", (AdError) null, (ResponseInfo) null));
        }
    }
}
