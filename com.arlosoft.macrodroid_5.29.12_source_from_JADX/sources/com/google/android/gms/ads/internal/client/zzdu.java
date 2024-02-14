package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbce;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcgp;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class zzdu {

    /* renamed from: a */
    private final zzbvh f1911a;

    /* renamed from: b */
    private final zzp f1912b;

    /* renamed from: c */
    private final AtomicBoolean f1913c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final VideoController f1914d;
    @VisibleForTesting

    /* renamed from: e */
    final zzax f1915e;
    @Nullable

    /* renamed from: f */
    private zza f1916f;

    /* renamed from: g */
    private AdListener f1917g;

    /* renamed from: h */
    private AdSize[] f1918h;
    @Nullable

    /* renamed from: i */
    private AppEventListener f1919i;
    @Nullable

    /* renamed from: j */
    private zzbs f1920j;

    /* renamed from: k */
    private VideoOptions f1921k;

    /* renamed from: l */
    private String f1922l;

    /* renamed from: m */
    private final ViewGroup f1923m;

    /* renamed from: n */
    private int f1924n;

    /* renamed from: o */
    private boolean f1925o;
    @Nullable

    /* renamed from: p */
    private OnPaidEventListener f1926p;

    public zzdu(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, zzp.f2018a, (zzbs) null, i);
    }

    /* renamed from: b */
    private static zzq m2225b(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize equals : adSizeArr) {
            if (equals.equals(AdSize.f1683q)) {
                return zzq.m2421p2();
            }
        }
        zzq zzq = new zzq(context, adSizeArr);
        zzq.f2019A = m2226c(i);
        return zzq;
    }

    /* renamed from: c */
    private static boolean m2226c(int i) {
        return i == 1;
    }

    /* renamed from: A */
    public final void mo20046A(VideoOptions videoOptions) {
        zzff zzff;
        this.f1921k = videoOptions;
        try {
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                if (videoOptions == null) {
                    zzff = null;
                } else {
                    zzff = new zzff(videoOptions);
                }
                zzbs.mo19944y9(zzff);
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: B */
    public final boolean mo20047B(zzbs zzbs) {
        try {
            IObjectWrapper n = zzbs.mo19937n();
            if (n == null || ((View) ObjectWrapper.m5050A1(n)).getParent() != null) {
                return false;
            }
            this.f1923m.addView((View) ObjectWrapper.m5050A1(n));
            this.f1920j = zzbs;
            return true;
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final AdSize[] mo20048a() {
        return this.f1918h;
    }

    /* renamed from: d */
    public final AdListener mo20049d() {
        return this.f1917g;
    }

    @Nullable
    /* renamed from: e */
    public final AdSize mo20050e() {
        zzq f;
        try {
            zzbs zzbs = this.f1920j;
            if (!(zzbs == null || (f = zzbs.mo19929f()) == null)) {
                return zzb.m3103c(f.f2029g, f.f2026c, f.f2025a);
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.f1918h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public final OnPaidEventListener mo20051f() {
        return this.f1926p;
    }

    @Nullable
    /* renamed from: g */
    public final ResponseInfo mo20052g() {
        zzdh zzdh = null;
        try {
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzdh = zzbs.mo19933i();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        return ResponseInfo.m1738d(zzdh);
    }

    /* renamed from: i */
    public final VideoController mo20053i() {
        return this.f1914d;
    }

    /* renamed from: j */
    public final VideoOptions mo20054j() {
        return this.f1921k;
    }

    @Nullable
    /* renamed from: k */
    public final AppEventListener mo20055k() {
        return this.f1919i;
    }

    @Nullable
    /* renamed from: l */
    public final zzdk mo20056l() {
        zzbs zzbs = this.f1920j;
        if (zzbs != null) {
            try {
                return zzbs.mo19934j();
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    /* renamed from: m */
    public final String mo20057m() {
        zzbs zzbs;
        if (this.f1922l == null && (zzbs = this.f1920j) != null) {
            try {
                this.f1922l = zzbs.mo19940q();
            } catch (RemoteException e) {
                zzcgp.m45231i("#007 Could not call remote method.", e);
            }
        }
        return this.f1922l;
    }

    /* renamed from: n */
    public final void mo20058n() {
        try {
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19922D();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final /* synthetic */ void mo20059o(IObjectWrapper iObjectWrapper) {
        this.f1923m.addView((View) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: p */
    public final void mo20060p(zzdr zzdr) {
        zzbs zzbs;
        try {
            if (this.f1920j == null) {
                if (this.f1918h == null || this.f1922l == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.f1923m.getContext();
                zzq b = m2225b(context, this.f1918h, this.f1924n);
                if ("search_v2".equals(b.f2025a)) {
                    zzbs = (zzbs) new zzaj(zzaw.m1916a(), context, b, this.f1922l).mo19884d(context, false);
                } else {
                    zzbs = (zzbs) new zzah(zzaw.m1916a(), context, b, this.f1922l, this.f1911a).mo19884d(context, false);
                }
                this.f1920j = zzbs;
                zzbs.mo19943xa(new zzg(this.f1915e));
                zza zza = this.f1916f;
                if (zza != null) {
                    this.f1920j.mo19926N3(new zzb(zza));
                }
                AppEventListener appEventListener = this.f1919i;
                if (appEventListener != null) {
                    this.f1920j.mo19938o7(new zzbce(appEventListener));
                }
                if (this.f1921k != null) {
                    this.f1920j.mo19944y9(new zzff(this.f1921k));
                }
                this.f1920j.mo19935l9(new zzey(this.f1926p));
                this.f1920j.mo19923Eb(this.f1925o);
                zzbs zzbs2 = this.f1920j;
                if (zzbs2 != null) {
                    try {
                        IObjectWrapper n = zzbs2.mo19937n();
                        if (n != null) {
                            if (((Boolean) zzbkq.f27445f.mo42728e()).booleanValue()) {
                                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26935M8)).booleanValue()) {
                                    zzcgi.f28421b.post(new zzds(this, n));
                                }
                            }
                            this.f1923m.addView((View) ObjectWrapper.m5050A1(n));
                        }
                    } catch (RemoteException e) {
                        zzcgp.m45231i("#007 Could not call remote method.", e);
                    }
                }
            }
            zzbs zzbs3 = this.f1920j;
            Objects.requireNonNull(zzbs3);
            zzbs3.mo19932h6(this.f1912b.mo20160a(this.f1923m.getContext(), zzdr));
        } catch (RemoteException e2) {
            zzcgp.m45231i("#007 Could not call remote method.", e2);
        }
    }

    /* renamed from: q */
    public final void mo20061q() {
        try {
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19924I();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: r */
    public final void mo20062r() {
        try {
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19927V();
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: s */
    public final void mo20063s(@Nullable zza zza) {
        try {
            this.f1916f = zza;
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19926N3(zza != null ? new zzb(zza) : null);
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: t */
    public final void mo20064t(AdListener adListener) {
        this.f1917g = adListener;
        this.f1915e.mo19885a(adListener);
    }

    /* renamed from: u */
    public final void mo20065u(AdSize... adSizeArr) {
        if (this.f1918h == null) {
            mo20066v(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    /* renamed from: v */
    public final void mo20066v(AdSize... adSizeArr) {
        this.f1918h = adSizeArr;
        try {
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19939oa(m2225b(this.f1923m.getContext(), this.f1918h, this.f1924n));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
        this.f1923m.requestLayout();
    }

    /* renamed from: w */
    public final void mo20067w(String str) {
        if (this.f1922l == null) {
            this.f1922l = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    /* renamed from: x */
    public final void mo20068x(@Nullable AppEventListener appEventListener) {
        try {
            this.f1919i = appEventListener;
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19938o7(appEventListener != null ? new zzbce(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: y */
    public final void mo20069y(boolean z) {
        this.f1925o = z;
        try {
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19923Eb(z);
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: z */
    public final void mo20070z(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.f1926p = onPaidEventListener;
            zzbs zzbs = this.f1920j;
            if (zzbs != null) {
                zzbs.mo19935l9(new zzey(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzcgp.m45231i("#007 Could not call remote method.", e);
        }
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzp.f2018a, (zzbs) null, 0);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzp.f2018a, (zzbs) null, i);
    }

    @VisibleForTesting
    zzdu(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z, zzp zzp, @Nullable zzbs zzbs, int i) {
        zzq zzq;
        this.f1911a = new zzbvh();
        this.f1914d = new VideoController();
        this.f1915e = new zzdt(this);
        this.f1923m = viewGroup;
        this.f1912b = zzp;
        this.f1920j = null;
        this.f1913c = new AtomicBoolean(false);
        this.f1924n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzy = new zzy(context, attributeSet);
                this.f1918h = zzy.mo20174b(z);
                this.f1922l = zzy.mo20173a();
                if (viewGroup.isInEditMode()) {
                    zzcgi b = zzaw.m1917b();
                    AdSize adSize = this.f1918h[0];
                    int i2 = this.f1924n;
                    if (adSize.equals(AdSize.f1683q)) {
                        zzq = zzq.m2421p2();
                    } else {
                        zzq zzq2 = new zzq(context, adSize);
                        zzq2.f2019A = m2226c(i2);
                        zzq = zzq2;
                    }
                    b.mo43553l(viewGroup, zzq, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzaw.m1917b().mo43552k(viewGroup, new zzq(context, AdSize.f1675i), e.getMessage(), e.getMessage());
            }
        }
    }
}
