package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.p027h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzc;
import com.google.android.gms.internal.ads.zzcah;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcfg;
import com.google.android.gms.internal.ads.zzcgp;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzau {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzk f1844a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final zzi f1845b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final zzek f1846c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final zzbod f1847d;

    /* renamed from: e */
    private final zzccx f1848e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final zzbyz f1849f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final zzboe f1850g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public zzcah f1851h;

    public zzau(zzk zzk, zzi zzi, zzek zzek, zzbod zzbod, zzccx zzccx, zzbyz zzbyz, zzboe zzboe) {
        this.f1844a = zzk;
        this.f1845b = zzi;
        this.f1846c = zzek;
        this.f1847d = zzbod;
        this.f1848e = zzccx;
        this.f1849f = zzbyz;
        this.f1850g = zzboe;
    }

    /* renamed from: r */
    static /* bridge */ /* synthetic */ void m1900r(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzaw.m1917b().mo43554m(context, zzaw.m1918c().f28446a, "gmob-apps", bundle, true);
    }

    /* renamed from: c */
    public final zzbo mo19875c(Context context, String str, zzbvk zzbvk) {
        return (zzbo) new zzam(this, context, str, zzbvk).mo19884d(context, false);
    }

    /* renamed from: d */
    public final zzbs mo19876d(Context context, zzq zzq, String str, zzbvk zzbvk) {
        return (zzbs) new zzai(this, context, zzq, str, zzbvk).mo19884d(context, false);
    }

    /* renamed from: e */
    public final zzbs mo19877e(Context context, zzq zzq, String str, zzbvk zzbvk) {
        return (zzbs) new zzak(this, context, zzq, str, zzbvk).mo19884d(context, false);
    }

    /* renamed from: g */
    public final zzbmi mo19878g(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbmi) new zzaq(this, frameLayout, frameLayout2, context).mo19884d(context, false);
    }

    @RequiresApi(api = 21)
    /* renamed from: j */
    public final zzbqu mo19879j(Context context, zzbvk zzbvk, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbqu) new zzag(this, context, zzbvk, onH5AdsEventListener).mo19884d(context, false);
    }

    @Nullable
    /* renamed from: k */
    public final zzbyv mo19880k(Context context, zzbvk zzbvk) {
        return (zzbyv) new zzae(this, context, zzbvk).mo19884d(context, false);
    }

    @Nullable
    /* renamed from: m */
    public final zzbzc mo19881m(Activity activity) {
        zzaa zzaa = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcgp.m45226d("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbzc) zzaa.mo19884d(activity, z);
    }

    /* renamed from: o */
    public final zzccl mo19882o(Context context, String str, zzbvk zzbvk) {
        return (zzccl) new zzat(this, context, str, zzbvk).mo19884d(context, false);
    }

    @Nullable
    /* renamed from: p */
    public final zzcfg mo19883p(Context context, zzbvk zzbvk) {
        return (zzcfg) new zzac(this, context, zzbvk).mo19884d(context, false);
    }
}
