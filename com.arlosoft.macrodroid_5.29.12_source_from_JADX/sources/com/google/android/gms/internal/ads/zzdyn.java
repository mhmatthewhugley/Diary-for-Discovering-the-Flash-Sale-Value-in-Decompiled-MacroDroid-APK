package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdyn implements zzdfv, zza, zzdda, zzddu, zzddv, zzdeo, zzddd, zzasf, zzfii {

    /* renamed from: a */
    private final List f33399a;

    /* renamed from: c */
    private final zzdyb f33400c;

    /* renamed from: d */
    private long f33401d;

    public zzdyn(zzdyb zzdyb, zzcom zzcom) {
        this.f33400c = zzdyb;
        this.f33399a = Collections.singletonList(zzcom);
    }

    /* renamed from: y */
    private final void m48362y(Class cls, String str, Object... objArr) {
        this.f33400c.mo45063a(this.f33399a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    /* renamed from: E */
    public final void mo41880E(String str, String str2) {
        m48362y(zzasf.class, "onAppEvent", str, str2);
    }

    /* renamed from: H */
    public final void mo44387H() {
        m48362y(zzdda.class, "onRewardedVideoCompleted", new Object[0]);
    }

    /* renamed from: a */
    public final void mo45028a(zzfib zzfib, String str) {
        m48362y(zzfia.class, "onTaskStarted", str);
    }

    /* renamed from: b */
    public final void mo45029b(zzfib zzfib, String str) {
        m48362y(zzfia.class, "onTaskCreated", str);
    }

    /* renamed from: c */
    public final void mo45030c(zzfib zzfib, String str) {
        m48362y(zzfia.class, "onTaskSucceeded", str);
    }

    /* renamed from: e */
    public final void mo45031e(zzfib zzfib, String str, Throwable th) {
        m48362y(zzfia.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    /* renamed from: f */
    public final void mo44379f(Context context) {
        m48362y(zzddv.class, "onPause", context);
    }

    /* renamed from: g */
    public final void mo44489g(zzfdw zzfdw) {
    }

    /* renamed from: h */
    public final void mo44389h() {
        m48362y(zzdda.class, "onAdClosed", new Object[0]);
    }

    /* renamed from: j */
    public final void mo44390j() {
        m48362y(zzddu.class, "onAdImpression", new Object[0]);
    }

    /* renamed from: k */
    public final void mo44391k() {
        m48362y(zzdda.class, "onAdLeftApplication", new Object[0]);
    }

    /* renamed from: l */
    public final void mo44392l() {
        m48362y(zzdda.class, "onAdOpened", new Object[0]);
    }

    /* renamed from: n */
    public final void mo44393n() {
        long c = zzt.m2889b().mo21952c();
        long j = this.f33401d;
        zze.m2645k("Ad Request Latency : " + (c - j));
        m48362y(zzdeo.class, "onAdLoaded", new Object[0]);
    }

    /* renamed from: o */
    public final void mo44380o(Context context) {
        m48362y(zzddv.class, "onDestroy", context);
    }

    public final void onAdClicked() {
        m48362y(zza.class, "onAdClicked", new Object[0]);
    }

    /* renamed from: q */
    public final void mo44395q() {
        m48362y(zzdda.class, "onRewardedVideoStarted", new Object[0]);
    }

    /* renamed from: r */
    public final void mo44382r(com.google.android.gms.ads.internal.client.zze zze) {
        m48362y(zzddd.class, "onAdFailedToLoad", Integer.valueOf(zze.f1934a), zze.f1935c, zze.f1936d);
    }

    /* renamed from: s */
    public final void mo44381s(Context context) {
        m48362y(zzddv.class, "onResume", context);
    }

    /* renamed from: u */
    public final void mo44490u(zzcbc zzcbc) {
        this.f33401d = zzt.m2889b().mo21952c();
        m48362y(zzdfv.class, "onAdRequest", new Object[0]);
    }

    /* renamed from: x */
    public final void mo44398x(zzcbs zzcbs, String str, String str2) {
        m48362y(zzdda.class, "onRewarded", zzcbs, str, str2);
    }
}
