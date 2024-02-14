package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdyu {

    /* renamed from: a */
    private final zzbqr f33410a;

    zzdyu(zzbqr zzbqr) {
        this.f33410a = zzbqr;
    }

    /* renamed from: s */
    private final void m48393s(zzdyt zzdyt) throws RemoteException {
        String a = zzdyt.m48387a(zzdyt);
        zzcgp.m45228f("Dispatching AFMA event on publisher webview: ".concat(a));
        this.f33410a.mo42915t(a);
    }

    /* renamed from: a */
    public final void mo45067a() throws RemoteException {
        m48393s(new zzdyt("initialize", (zzdys) null));
    }

    /* renamed from: b */
    public final void mo45068b(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("interstitial", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onAdClicked";
        this.f33410a.mo42915t(zzdyt.m48387a(zzdyt));
    }

    /* renamed from: c */
    public final void mo45069c(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("interstitial", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onAdClosed";
        m48393s(zzdyt);
    }

    /* renamed from: d */
    public final void mo45070d(long j, int i) throws RemoteException {
        zzdyt zzdyt = new zzdyt("interstitial", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onAdFailedToLoad";
        zzdyt.f33407d = Integer.valueOf(i);
        m48393s(zzdyt);
    }

    /* renamed from: e */
    public final void mo45071e(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("interstitial", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onAdLoaded";
        m48393s(zzdyt);
    }

    /* renamed from: f */
    public final void mo45072f(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("interstitial", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onNativeAdObjectNotAvailable";
        m48393s(zzdyt);
    }

    /* renamed from: g */
    public final void mo45073g(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("interstitial", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onAdOpened";
        m48393s(zzdyt);
    }

    /* renamed from: h */
    public final void mo45074h(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("creation", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "nativeObjectCreated";
        m48393s(zzdyt);
    }

    /* renamed from: i */
    public final void mo45075i(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("creation", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "nativeObjectNotCreated";
        m48393s(zzdyt);
    }

    /* renamed from: j */
    public final void mo45076j(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onAdClicked";
        m48393s(zzdyt);
    }

    /* renamed from: k */
    public final void mo45077k(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onRewardedAdClosed";
        m48393s(zzdyt);
    }

    /* renamed from: l */
    public final void mo45078l(long j, zzcci zzcci) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onUserEarnedReward";
        zzdyt.f33408e = zzcci.mo43350c();
        zzdyt.f33409f = Integer.valueOf(zzcci.mo43349b());
        m48393s(zzdyt);
    }

    /* renamed from: m */
    public final void mo45079m(long j, int i) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onRewardedAdFailedToLoad";
        zzdyt.f33407d = Integer.valueOf(i);
        m48393s(zzdyt);
    }

    /* renamed from: n */
    public final void mo45080n(long j, int i) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onRewardedAdFailedToShow";
        zzdyt.f33407d = Integer.valueOf(i);
        m48393s(zzdyt);
    }

    /* renamed from: o */
    public final void mo45081o(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onAdImpression";
        m48393s(zzdyt);
    }

    /* renamed from: p */
    public final void mo45082p(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onRewardedAdLoaded";
        m48393s(zzdyt);
    }

    /* renamed from: q */
    public final void mo45083q(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onNativeAdObjectNotAvailable";
        m48393s(zzdyt);
    }

    /* renamed from: r */
    public final void mo45084r(long j) throws RemoteException {
        zzdyt zzdyt = new zzdyt("rewarded", (zzdys) null);
        zzdyt.f33404a = Long.valueOf(j);
        zzdyt.f33406c = "onRewardedAdOpened";
        m48393s(zzdyt);
    }
}
