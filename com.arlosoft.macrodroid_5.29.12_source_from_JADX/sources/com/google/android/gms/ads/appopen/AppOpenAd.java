package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbdr;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzcge;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class AppOpenAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
    public @interface AppOpenAdOrientation {
    }

    /* renamed from: b */
    public static void m1764b(@NonNull Context context, @NonNull String str, @NonNull AdRequest adRequest, @AppOpenAdOrientation int i, @NonNull AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.m4489l(context, "Context cannot be null.");
        Preconditions.m4489l(str, "adUnitId cannot be null.");
        Preconditions.m4489l(adRequest, "AdRequest cannot be null.");
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzbjc.m43542c(context);
        if (((Boolean) zzbkq.f27443d.mo42728e()).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                zzcge.f28418b.execute(new zzb(context, str, adRequest, i, appOpenAdLoadCallback));
                return;
            }
        }
        new zzbdr(context, str, adRequest.mo19668a(), i, appOpenAdLoadCallback).mo42512a();
    }

    @NonNull
    /* renamed from: a */
    public abstract ResponseInfo mo19777a();

    /* renamed from: c */
    public abstract void mo19778c(@NonNull Activity activity);
}
