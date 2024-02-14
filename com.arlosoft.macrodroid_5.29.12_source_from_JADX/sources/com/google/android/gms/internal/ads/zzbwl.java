package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzbwl implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener {

    /* renamed from: a */
    private final zzbvq f27892a;

    /* renamed from: b */
    private UnifiedNativeAdMapper f27893b;

    /* renamed from: c */
    private NativeCustomTemplateAd f27894c;

    public zzbwl(zzbvq zzbvq) {
        this.f27892a = zzbvq;
    }

    /* renamed from: a */
    public final void mo20504a(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdOpened.");
        try {
            this.f27892a.mo43081m();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo20505b(MediationNativeAdapter mediationNativeAdapter, AdError adError) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        int a = adError.mo19645a();
        String c = adError.mo19647c();
        String b = adError.mo19646b();
        zzcgp.m45224b("Adapter called onAdFailedToLoad with error. ErrorCode: " + a + ". ErrorMessage: " + c + ". ErrorDomain: " + b);
        try {
            this.f27892a.mo43086u2(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: c */
    public final void mo20498c(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdFailedToLoad with error " + i + ".");
        try {
            this.f27892a.mo43088x(i);
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo20488d(MediationBannerAdapter mediationBannerAdapter, AdError adError) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        int a = adError.mo19645a();
        String c = adError.mo19647c();
        String b = adError.mo19646b();
        zzcgp.m45224b("Adapter called onAdFailedToLoad with error. ErrorCode: " + a + ". ErrorMessage: " + c + ". ErrorDomain: " + b);
        try {
            this.f27892a.mo43086u2(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo20506e(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdLoaded with template id ".concat(String.valueOf(nativeCustomTemplateAd.mo19806a())));
        this.f27894c = nativeCustomTemplateAd;
        try {
            this.f27892a.mo43080l();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo20489f(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdClicked.");
        try {
            this.f27892a.mo43076b();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo20507g(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdClosed.");
        try {
            this.f27892a.mo43077c();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo20490h(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdLoaded.");
        try {
            this.f27892a.mo43080l();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo20508i(MediationNativeAdapter mediationNativeAdapter, NativeCustomTemplateAd nativeCustomTemplateAd, String str) {
        if (nativeCustomTemplateAd instanceof zzbmz) {
            try {
                this.f27892a.mo43075T2(((zzbmz) nativeCustomTemplateAd).mo42815b(), str);
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        } else {
            zzcgp.m45229g("Unexpected native custom template ad type.");
        }
    }

    /* renamed from: j */
    public final void mo20491j(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdOpened.");
        try {
            this.f27892a.mo43081m();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: k */
    public final void mo20492k(MediationBannerAdapter mediationBannerAdapter, String str, String str2) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAppEvent.");
        try {
            this.f27892a.mo43084ta(str, str2);
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: l */
    public final void mo20509l(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f27893b;
        if (this.f27894c == null) {
            if (unifiedNativeAdMapper == null) {
                zzcgp.m45231i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideImpressionRecording()) {
                zzcgp.m45224b("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        zzcgp.m45224b("Adapter called onAdImpression.");
        try {
            this.f27892a.mo43079k();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: m */
    public final void mo20493m(MediationBannerAdapter mediationBannerAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdClosed.");
        try {
            this.f27892a.mo43077c();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: n */
    public final void mo20510n(MediationNativeAdapter mediationNativeAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        UnifiedNativeAdMapper unifiedNativeAdMapper = this.f27893b;
        if (this.f27894c == null) {
            if (unifiedNativeAdMapper == null) {
                zzcgp.m45231i("#007 Could not call remote method.", (Throwable) null);
                return;
            } else if (!unifiedNativeAdMapper.getOverrideClickHandling()) {
                zzcgp.m45224b("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        zzcgp.m45224b("Adapter called onAdClicked.");
        try {
            this.f27892a.mo43076b();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: o */
    public final void mo20499o(MediationInterstitialAdapter mediationInterstitialAdapter, AdError adError) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        int a = adError.mo19645a();
        String c = adError.mo19647c();
        String b = adError.mo19646b();
        zzcgp.m45224b("Adapter called onAdFailedToLoad with error. ErrorCode: " + a + ". ErrorMessage: " + c + ". ErrorDomain: " + b);
        try {
            this.f27892a.mo43086u2(adError.mo19648d());
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: p */
    public final void mo20500p(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdLoaded.");
        try {
            this.f27892a.mo43080l();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo20501q(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdClosed.");
        try {
            this.f27892a.mo43077c();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo20511r(MediationNativeAdapter mediationNativeAdapter, UnifiedNativeAdMapper unifiedNativeAdMapper) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdLoaded.");
        this.f27893b = unifiedNativeAdMapper;
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            VideoController videoController = new VideoController();
            videoController.mo19754c(new zzbwa());
            if (unifiedNativeAdMapper != null && unifiedNativeAdMapper.hasVideoContent()) {
                unifiedNativeAdMapper.zze(videoController);
            }
        }
        try {
            this.f27892a.mo43080l();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo20502s(MediationInterstitialAdapter mediationInterstitialAdapter) {
        Preconditions.m4483f("#008 Must be called on the main UI thread.");
        zzcgp.m45224b("Adapter called onAdOpened.");
        try {
            this.f27892a.mo43081m();
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: t */
    public final NativeCustomTemplateAd mo43155t() {
        return this.f27894c;
    }

    /* renamed from: u */
    public final UnifiedNativeAdMapper mo43156u() {
        return this.f27893b;
    }
}
