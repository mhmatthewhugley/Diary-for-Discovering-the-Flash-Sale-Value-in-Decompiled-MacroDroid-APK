package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbxu implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f27933a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MediationInterstitialListener f27934b;

    /* renamed from: c */
    private Uri f27935c;

    public final void onDestroy() {
        zzcgp.m45224b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzcgp.m45224b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzcgp.m45224b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.f27934b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            zzcgp.m45229g("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            zzcgp.m45229g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f27934b.mo20498c(this, 0);
        } else if (!zzbka.m43635g(context)) {
            zzcgp.m45229g("Default browser does not support custom tabs. Bailing out.");
            this.f27934b.mo20498c(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                zzcgp.m45229g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f27934b.mo20498c(this, 0);
                return;
            }
            this.f27933a = (Activity) context;
            this.f27935c = Uri.parse(string);
            this.f27934b.mo20500p(this);
        }
    }

    public final void showInterstitial() {
        CustomTabsIntent build = new CustomTabsIntent.Builder().build();
        build.intent.setData(this.f27935c);
        zzs.f2304i.post(new zzbxt(this, new AdOverlayInfoParcel(new zzc(build.intent, (zzx) null), (zza) null, new zzbxs(this), (zzz) null, new zzcgv(0, 0, false, false, false), (zzcmp) null, (zzdkn) null)));
        zzt.m2904q().mo43498o();
    }
}
