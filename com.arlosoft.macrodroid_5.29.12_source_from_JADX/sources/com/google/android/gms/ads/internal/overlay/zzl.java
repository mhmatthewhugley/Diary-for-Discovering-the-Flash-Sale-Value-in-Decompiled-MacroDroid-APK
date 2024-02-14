package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbkb;
import com.google.android.gms.internal.ads.zzbop;
import com.google.android.gms.internal.ads.zzbor;
import com.google.android.gms.internal.ads.zzbpv;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqm;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzcnb;
import com.google.android.gms.internal.ads.zzcoc;
import com.google.android.gms.internal.ads.zzcoe;
import com.google.android.gms.internal.ads.zzdkn;
import com.google.android.gms.internal.ads.zzdxq;
import com.google.android.gms.internal.ads.zzego;
import com.google.android.gms.internal.ads.zzegw;
import com.google.android.gms.internal.ads.zzfdk;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzfpz;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzl extends zzbzb implements zzad {
    @VisibleForTesting

    /* renamed from: L */
    static final int f2098L = Color.argb(0, 0, 0, 0);
    @VisibleForTesting

    /* renamed from: A */
    boolean f2099A = false;
    @VisibleForTesting

    /* renamed from: B */
    zzg f2100B;
    @VisibleForTesting

    /* renamed from: C */
    boolean f2101C = false;

    /* renamed from: D */
    private final Object f2102D = new Object();

    /* renamed from: E */
    private Runnable f2103E;

    /* renamed from: F */
    private boolean f2104F;

    /* renamed from: G */
    private boolean f2105G;

    /* renamed from: H */
    private boolean f2106H = false;

    /* renamed from: I */
    private boolean f2107I = false;

    /* renamed from: J */
    private boolean f2108J = true;
    @VisibleForTesting

    /* renamed from: K */
    int f2109K = 1;

    /* renamed from: a */
    protected final Activity f2110a;
    @Nullable
    @VisibleForTesting

    /* renamed from: c */
    AdOverlayInfoParcel f2111c;
    @VisibleForTesting

    /* renamed from: d */
    zzcmp f2112d;
    @VisibleForTesting

    /* renamed from: f */
    zzh f2113f;
    @VisibleForTesting

    /* renamed from: g */
    zzr f2114g;
    @VisibleForTesting

    /* renamed from: o */
    boolean f2115o = false;
    @VisibleForTesting

    /* renamed from: p */
    FrameLayout f2116p;
    @VisibleForTesting

    /* renamed from: s */
    WebChromeClient.CustomViewCallback f2117s;
    @VisibleForTesting

    /* renamed from: z */
    boolean f2118z = false;

    public zzl(Activity activity) {
        this.f2110a = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f2057F;
     */
    /* renamed from: Mb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2435Mb(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.f2111c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0010
            com.google.android.gms.ads.internal.zzj r0 = r0.f2057F
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.f2344c
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.google.android.gms.ads.internal.util.zzaa r3 = com.google.android.gms.ads.internal.zzt.m2906s()
            android.app.Activity r4 = r5.f2110a
            boolean r6 = r3.mo20250e(r4, r6)
            boolean r3 = r5.f2099A
            if (r3 == 0) goto L_0x0021
            if (r0 == 0) goto L_0x0031
        L_0x0021:
            if (r6 != 0) goto L_0x0031
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.f2111c
            if (r6 == 0) goto L_0x0032
            com.google.android.gms.ads.internal.zzj r6 = r6.f2057F
            if (r6 == 0) goto L_0x0032
            boolean r6 = r6.f2349p
            if (r6 == 0) goto L_0x0032
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            android.app.Activity r6 = r5.f2110a
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27044Y0
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r3.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005e
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0055
            r0 = 5894(0x1706, float:8.259E-42)
            goto L_0x005a
        L_0x0055:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L_0x005a
        L_0x0058:
            r0 = 256(0x100, float:3.59E-43)
        L_0x005a:
            r6.setSystemUiVisibility(r0)
            return
        L_0x005e:
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0076
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L_0x0075
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L_0x0075:
            return
        L_0x0076:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.m2435Mb(android.content.res.Configuration):void");
    }

    /* renamed from: Nb */
    private static final void m2436Nb(@Nullable IObjectWrapper iObjectWrapper, @Nullable View view) {
        if (iObjectWrapper != null && view != null) {
            zzt.m2888a().mo45293c(iObjectWrapper, view);
        }
    }

    /* renamed from: A1 */
    public final void mo20176A1() {
        this.f2109K = 2;
        this.f2110a.finish();
    }

    /* renamed from: D */
    public final void mo20185D() {
        this.f2100B.removeView(this.f2114g);
        mo20188Ob(true);
    }

    /* renamed from: Kb */
    public final void mo20186Kb(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f2110a);
        this.f2116p = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f2116p.addView(view, -1, -1);
        this.f2110a.setContentView(this.f2116p);
        this.f2105G = true;
        this.f2117s = customViewCallback;
        this.f2115o = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Lb */
    public final void mo20187Lb(boolean z) throws zzf {
        if (!this.f2105G) {
            this.f2110a.requestWindowFeature(1);
        }
        Window window = this.f2110a.getWindow();
        if (window != null) {
            zzcmp zzcmp = this.f2111c.f2071f;
            zzb zzb = null;
            zzcoc e0 = zzcmp != null ? zzcmp.mo44044e0() : null;
            boolean z2 = false;
            boolean z3 = e0 != null && e0.mo44088Q();
            this.f2101C = false;
            if (z3) {
                int i = this.f2111c.f2052A;
                if (i == 6) {
                    if (this.f2110a.getResources().getConfiguration().orientation == 1) {
                        z2 = true;
                    }
                    this.f2101C = z2;
                } else if (i == 7) {
                    if (this.f2110a.getResources().getConfiguration().orientation == 2) {
                        z2 = true;
                    }
                    this.f2101C = z2;
                }
            }
            zzcgp.m45224b("Delay onShow to next orientation change: " + z2);
            mo20191Qb(this.f2111c.f2052A);
            window.setFlags(16777216, 16777216);
            zzcgp.m45224b("Hardware acceleration on the AdActivity window enabled.");
            if (!this.f2099A) {
                this.f2100B.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            } else {
                this.f2100B.setBackgroundColor(f2098L);
            }
            this.f2110a.setContentView(this.f2100B);
            this.f2105G = true;
            if (z) {
                try {
                    zzt.m2887B();
                    Activity activity = this.f2110a;
                    zzcmp zzcmp2 = this.f2111c.f2071f;
                    zzcoe C = zzcmp2 != null ? zzcmp2.mo44009C() : null;
                    zzcmp zzcmp3 = this.f2111c.f2071f;
                    String m0 = zzcmp3 != null ? zzcmp3.mo44061m0() : null;
                    AdOverlayInfoParcel adOverlayInfoParcel = this.f2111c;
                    zzcgv zzcgv = adOverlayInfoParcel.f2055D;
                    zzcmp zzcmp4 = adOverlayInfoParcel.f2071f;
                    zzcmp a = zzcnb.m45940a(activity, C, m0, true, z3, (zzape) null, (zzbkb) null, zzcgv, (zzbjr) null, (com.google.android.gms.ads.internal.zzl) null, zzcmp4 != null ? zzcmp4.mo43757k() : null, zzbep.m43241a(), (zzfdk) null, (zzfdn) null);
                    this.f2112d = a;
                    zzcoc e02 = a.mo44044e0();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2111c;
                    zzbop zzbop = adOverlayInfoParcel2.f2058G;
                    zzbor zzbor = adOverlayInfoParcel2.f2072g;
                    zzz zzz = adOverlayInfoParcel2.f2076z;
                    zzcmp zzcmp5 = adOverlayInfoParcel2.f2071f;
                    if (zzcmp5 != null) {
                        zzb = zzcmp5.mo44044e0().mo44098d();
                    }
                    e02.mo44086I0((zza) null, zzbop, (zzo) null, zzbor, zzz, true, (zzbpx) null, zzb, (zzbyg) null, (zzcdq) null, (zzego) null, (zzfkm) null, (zzdxq) null, (zzfir) null, (zzbpv) null, (zzdkn) null, (zzbqm) null, (zzbqg) null);
                    this.f2112d.mo44044e0().mo44085I(new zzd(this));
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.f2111c;
                    String str = adOverlayInfoParcel3.f2054C;
                    if (str != null) {
                        this.f2112d.loadUrl(str);
                    } else {
                        String str2 = adOverlayInfoParcel3.f2075s;
                        if (str2 != null) {
                            this.f2112d.loadDataWithBaseURL(adOverlayInfoParcel3.f2073o, str2, "text/html", "UTF-8", (String) null);
                        } else {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzcmp zzcmp6 = this.f2111c.f2071f;
                    if (zzcmp6 != null) {
                        zzcmp6.mo44074t0(this);
                    }
                } catch (Exception e) {
                    zzcgp.m45227e("Error obtaining webview.", e);
                    throw new zzf("Could not obtain webview for the overlay.", e);
                }
            } else {
                zzcmp zzcmp7 = this.f2111c.f2071f;
                this.f2112d = zzcmp7;
                zzcmp7.mo44010C0(this.f2110a);
            }
            this.f2112d.mo44033U(this);
            zzcmp zzcmp8 = this.f2111c.f2071f;
            if (zzcmp8 != null) {
                m2436Nb(zzcmp8.mo44032T0(), this.f2100B);
            }
            if (this.f2111c.f2053B != 5) {
                ViewParent parent = this.f2112d.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.f2112d.mo44027R());
                }
                if (this.f2099A) {
                    this.f2112d.mo44069s0();
                }
                this.f2100B.addView(this.f2112d.mo44027R(), -1, -1);
            }
            if (!z && !this.f2101C) {
                mo20196b();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f2111c;
            if (adOverlayInfoParcel4.f2053B != 5) {
                mo20188Ob(z3);
                if (this.f2112d.mo44076z()) {
                    mo20190Pb(z3, true);
                    return;
                }
                return;
            }
            zzegw.m48815Mb(this.f2110a, this, adOverlayInfoParcel4.f2063L, adOverlayInfoParcel4.f2060I, adOverlayInfoParcel4.f2061J, adOverlayInfoParcel4.f2062K, adOverlayInfoParcel4.f2059H, adOverlayInfoParcel4.f2064M);
            return;
        }
        throw new zzf("Invalid activity, no window available.");
    }

    /* renamed from: Ob */
    public final void mo20188Ob(boolean z) {
        int intValue = ((Integer) zzay.m1924c().mo42663b(zzbjc.f27056Z3)).intValue();
        int i = 0;
        boolean z2 = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27007U0)).booleanValue() || z;
        zzq zzq = new zzq();
        zzq.f2123d = 50;
        zzq.f2120a = true != z2 ? 0 : intValue;
        if (true != z2) {
            i = intValue;
        }
        zzq.f2121b = i;
        zzq.f2122c = intValue;
        this.f2114g = new zzr(this.f2110a, zzq, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        mo20190Pb(z, this.f2111c.f2074p);
        this.f2100B.addView(this.f2114g, layoutParams);
    }

    /* renamed from: P */
    public final boolean mo20189P() {
        this.f2109K = 1;
        if (this.f2112d == null) {
            return true;
        }
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue() || !this.f2112d.canGoBack()) {
            boolean F = this.f2112d.mo44014F();
            if (!F) {
                this.f2112d.mo42954y("onbackblocked", Collections.emptyMap());
            }
            return F;
        }
        this.f2112d.goBack();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = (r0 = r6.f2111c).f2057F;
     */
    /* renamed from: Pb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20190Pb(boolean r7, boolean r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26987S0
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.f2111c
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.zzj r0 = r0.f2057F
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.f2350s
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f26997T0
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r4.mo42663b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r6.f2111c
            if (r3 == 0) goto L_0x0043
            com.google.android.gms.ads.internal.zzj r3 = r3.f2057F
            if (r3 == 0) goto L_0x0043
            boolean r3 = r3.f2351z
            if (r3 == 0) goto L_0x0043
            r3 = 1
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            if (r7 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x005b
            if (r0 == 0) goto L_0x005b
            if (r3 != 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzbyf r7 = new com.google.android.gms.internal.ads.zzbyf
            com.google.android.gms.internal.ads.zzcmp r4 = r6.f2112d
            java.lang.String r5 = "useCustomClose"
            r7.<init>(r4, r5)
            java.lang.String r4 = "Custom close has been disabled for interstitial ads in this ad slot."
            r7.mo43218c(r4)
        L_0x005b:
            com.google.android.gms.ads.internal.overlay.zzr r7 = r6.f2114g
            if (r7 == 0) goto L_0x006a
            if (r3 != 0) goto L_0x0067
            if (r8 == 0) goto L_0x0066
            if (r0 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r1 = 0
        L_0x0067:
            r7.mo20225b(r1)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.mo20190Pb(boolean, boolean):void");
    }

    /* renamed from: Qb */
    public final void mo20191Qb(int i) {
        if (this.f2110a.getApplicationInfo().targetSdkVersion >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f27077b5)).intValue()) {
            if (this.f2110a.getApplicationInfo().targetSdkVersion <= ((Integer) zzay.m1924c().mo42663b(zzbjc.f27087c5)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f27097d5)).intValue()) {
                    if (i2 <= ((Integer) zzay.m1924c().mo42663b(zzbjc.f27107e5)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f2110a.setRequestedOrientation(i);
        } catch (Throwable th) {
            zzt.m2904q().mo43502s(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* renamed from: Rb */
    public final void mo20192Rb(boolean z) {
        if (z) {
            this.f2100B.setBackgroundColor(0);
        } else {
            this.f2100B.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[Catch:{ zzf -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c4 A[Catch:{ zzf -> 0x00f5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e9 A[Catch:{ zzf -> 0x00f5 }] */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo20193T0(android.os.Bundle r9) {
        /*
            r8 = this;
            android.app.Activity r0 = r8.f2110a
            r1 = 1
            r0.requestWindowFeature(r1)
            r0 = 0
            if (r9 == 0) goto L_0x0013
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.hasResumed"
            boolean r2 = r9.getBoolean(r2, r0)
            if (r2 == 0) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            r8.f2118z = r2
            r2 = 4
            android.app.Activity r3 = r8.f2110a     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.m2428l2(r3)     // Catch:{ zzf -> 0x00f5 }
            r8.f2111c = r3     // Catch:{ zzf -> 0x00f5 }
            if (r3 == 0) goto L_0x00ed
            com.google.android.gms.internal.ads.zzcgv r3 = r3.f2055D     // Catch:{ zzf -> 0x00f5 }
            int r3 = r3.f28448d     // Catch:{ zzf -> 0x00f5 }
            r4 = 7500000(0x7270e0, float:1.0509738E-38)
            if (r3 <= r4) goto L_0x0030
            r8.f2109K = r2     // Catch:{ zzf -> 0x00f5 }
        L_0x0030:
            android.app.Activity r3 = r8.f2110a     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            if (r3 == 0) goto L_0x0046
            android.app.Activity r3 = r8.f2110a     // Catch:{ zzf -> 0x00f5 }
            android.content.Intent r3 = r3.getIntent()     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r4 = "shouldCallOnOverlayOpened"
            boolean r3 = r3.getBooleanExtra(r4, r1)     // Catch:{ zzf -> 0x00f5 }
            r8.f2108J = r3     // Catch:{ zzf -> 0x00f5 }
        L_0x0046:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r3 = r8.f2111c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.zzj r4 = r3.f2057F     // Catch:{ zzf -> 0x00f5 }
            r5 = 5
            if (r4 == 0) goto L_0x0054
            boolean r6 = r4.f2343a     // Catch:{ zzf -> 0x00f5 }
            r8.f2099A = r6     // Catch:{ zzf -> 0x00f5 }
            if (r6 == 0) goto L_0x006f
            goto L_0x005a
        L_0x0054:
            int r6 = r3.f2053B     // Catch:{ zzf -> 0x00f5 }
            if (r6 != r5) goto L_0x006d
            r8.f2099A = r1     // Catch:{ zzf -> 0x00f5 }
        L_0x005a:
            int r3 = r3.f2053B     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r5) goto L_0x006f
            int r3 = r4.f2348o     // Catch:{ zzf -> 0x00f5 }
            r4 = -1
            if (r3 == r4) goto L_0x006f
            com.google.android.gms.ads.internal.overlay.zzk r3 = new com.google.android.gms.ads.internal.overlay.zzk     // Catch:{ zzf -> 0x00f5 }
            r4 = 0
            r3.<init>(r8, r4)     // Catch:{ zzf -> 0x00f5 }
            r3.mo20314b()     // Catch:{ zzf -> 0x00f5 }
            goto L_0x006f
        L_0x006d:
            r8.f2099A = r0     // Catch:{ zzf -> 0x00f5 }
        L_0x006f:
            if (r9 != 0) goto L_0x009d
            boolean r9 = r8.f2108J     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f2111c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzddn r9 = r9.f2066O     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x007e
            r9.mo44578b()     // Catch:{ zzf -> 0x00f5 }
        L_0x007e:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f2111c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.zzo r9 = r9.f2070d     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0087
            r9.zzb()     // Catch:{ zzf -> 0x00f5 }
        L_0x0087:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f2111c     // Catch:{ zzf -> 0x00f5 }
            int r3 = r9.f2053B     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r1) goto L_0x009d
            com.google.android.gms.ads.internal.client.zza r9 = r9.f2069c     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x0094
            r9.onAdClicked()     // Catch:{ zzf -> 0x00f5 }
        L_0x0094:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f2111c     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzdkn r9 = r9.f2067P     // Catch:{ zzf -> 0x00f5 }
            if (r9 == 0) goto L_0x009d
            r9.mo44113s()     // Catch:{ zzf -> 0x00f5 }
        L_0x009d:
            com.google.android.gms.ads.internal.overlay.zzg r9 = new com.google.android.gms.ads.internal.overlay.zzg     // Catch:{ zzf -> 0x00f5 }
            android.app.Activity r3 = r8.f2110a     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4 = r8.f2111c     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r6 = r4.f2056E     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcgv r7 = r4.f2055D     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r7 = r7.f28446a     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r4 = r4.f2065N     // Catch:{ zzf -> 0x00f5 }
            r9.<init>(r3, r6, r7, r4)     // Catch:{ zzf -> 0x00f5 }
            r8.f2100B = r9     // Catch:{ zzf -> 0x00f5 }
            r3 = 1000(0x3e8, float:1.401E-42)
            r9.setId(r3)     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.util.zzaa r9 = com.google.android.gms.ads.internal.zzt.m2906s()     // Catch:{ zzf -> 0x00f5 }
            android.app.Activity r3 = r8.f2110a     // Catch:{ zzf -> 0x00f5 }
            r9.mo20254i(r3)     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r9 = r8.f2111c     // Catch:{ zzf -> 0x00f5 }
            int r3 = r9.f2053B     // Catch:{ zzf -> 0x00f5 }
            if (r3 == r1) goto L_0x00e9
            r4 = 2
            if (r3 == r4) goto L_0x00dc
            r9 = 3
            if (r3 == r9) goto L_0x00d8
            if (r3 != r5) goto L_0x00d0
            r8.mo20187Lb(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00d0:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r0 = "Could not determine ad overlay type."
            r9.<init>(r0)     // Catch:{ zzf -> 0x00f5 }
            throw r9     // Catch:{ zzf -> 0x00f5 }
        L_0x00d8:
            r8.mo20187Lb(r1)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00dc:
            com.google.android.gms.ads.internal.overlay.zzh r1 = new com.google.android.gms.ads.internal.overlay.zzh     // Catch:{ zzf -> 0x00f5 }
            com.google.android.gms.internal.ads.zzcmp r9 = r9.f2071f     // Catch:{ zzf -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ zzf -> 0x00f5 }
            r8.f2113f = r1     // Catch:{ zzf -> 0x00f5 }
            r8.mo20187Lb(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00e9:
            r8.mo20187Lb(r0)     // Catch:{ zzf -> 0x00f5 }
            return
        L_0x00ed:
            com.google.android.gms.ads.internal.overlay.zzf r9 = new com.google.android.gms.ads.internal.overlay.zzf     // Catch:{ zzf -> 0x00f5 }
            java.lang.String r0 = "Could not get info for ad overlay."
            r9.<init>(r0)     // Catch:{ zzf -> 0x00f5 }
            throw r9     // Catch:{ zzf -> 0x00f5 }
        L_0x00f5:
            r9 = move-exception
            java.lang.String r9 = r9.getMessage()
            com.google.android.gms.internal.ads.zzcgp.m45229g(r9)
            r8.f2109K = r2
            android.app.Activity r9 = r8.f2110a
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.mo20193T0(android.os.Bundle):void");
    }

    /* renamed from: V8 */
    public final void mo20194V8(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: a */
    public final void mo20195a() {
        zzcmp zzcmp;
        zzo zzo;
        if (!this.f2107I) {
            this.f2107I = true;
            zzcmp zzcmp2 = this.f2112d;
            if (zzcmp2 != null) {
                this.f2100B.removeView(zzcmp2.mo44027R());
                zzh zzh = this.f2113f;
                if (zzh != null) {
                    this.f2112d.mo44010C0(zzh.f2094d);
                    this.f2112d.mo44030S0(false);
                    ViewGroup viewGroup = this.f2113f.f2093c;
                    View R = this.f2112d.mo44027R();
                    zzh zzh2 = this.f2113f;
                    viewGroup.addView(R, zzh2.f2091a, zzh2.f2092b);
                    this.f2113f = null;
                } else if (this.f2110a.getApplicationContext() != null) {
                    this.f2112d.mo44010C0(this.f2110a.getApplicationContext());
                }
                this.f2112d = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f2111c;
            if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.f2070d) == null)) {
                zzo.mo20220y(this.f2109K);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2111c;
            if (adOverlayInfoParcel2 != null && (zzcmp = adOverlayInfoParcel2.f2071f) != null) {
                m2436Nb(zzcmp.mo44032T0(), this.f2111c.f2071f.mo44027R());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo20196b() {
        this.f2112d.mo44040a1();
    }

    /* renamed from: c */
    public final void mo20197c() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2111c;
        if (adOverlayInfoParcel != null && this.f2115o) {
            mo20191Qb(adOverlayInfoParcel.f2052A);
        }
        if (this.f2116p != null) {
            this.f2110a.setContentView(this.f2100B);
            this.f2105G = true;
            this.f2116p.removeAllViews();
            this.f2116p = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f2117s;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f2117s = null;
        }
        this.f2115o = false;
    }

    /* renamed from: d */
    public final void mo20198d() {
        this.f2100B.f2090c = true;
    }

    /* renamed from: e */
    public final void mo20199e() {
        this.f2109K = 1;
    }

    /* renamed from: i0 */
    public final void mo20200i0(IObjectWrapper iObjectWrapper) {
        m2435Mb((Configuration) ObjectWrapper.m5050A1(iObjectWrapper));
    }

    /* renamed from: j */
    public final void mo20201j() {
        zzcmp zzcmp = this.f2112d;
        if (zzcmp != null) {
            try {
                this.f2100B.removeView(zzcmp.mo44027R());
            } catch (NullPointerException unused) {
            }
        }
        mo20209p0();
    }

    /* renamed from: j0 */
    public final void mo20202j0() {
        synchronized (this.f2102D) {
            this.f2104F = true;
            Runnable runnable = this.f2103E;
            if (runnable != null) {
                zzfpz zzfpz = zzs.f2304i;
                zzfpz.removeCallbacks(runnable);
                zzfpz.post(this.f2103E);
            }
        }
    }

    /* renamed from: k */
    public final void mo20203k() {
        if (this.f2101C) {
            this.f2101C = false;
            mo20196b();
        }
    }

    /* renamed from: k0 */
    public final void mo20204k0(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2118z);
    }

    /* renamed from: l */
    public final void mo20205l() {
    }

    /* renamed from: m */
    public final void mo20206m() {
        zzo zzo;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2111c;
        if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.f2070d) == null)) {
            zzo.mo20219t1();
        }
        m2435Mb(this.f2110a.getResources().getConfiguration());
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27038X3)).booleanValue()) {
            zzcmp zzcmp = this.f2112d;
            if (zzcmp == null || zzcmp.mo44037X0()) {
                zzcgp.m45229g("The webview does not exist. Ignoring action.");
            } else {
                this.f2112d.onResume();
            }
        }
    }

    /* renamed from: n */
    public final void mo20207n() {
        zzo zzo;
        mo20197c();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2111c;
        if (!(adOverlayInfoParcel == null || (zzo = adOverlayInfoParcel.f2070d) == null)) {
            zzo.mo20216Z8();
        }
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27038X3)).booleanValue() && this.f2112d != null && (!this.f2110a.isFinishing() || this.f2113f == null)) {
            this.f2112d.onPause();
        }
        mo20209p0();
    }

    /* renamed from: p */
    public final void mo20208p() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27038X3)).booleanValue() && this.f2112d != null && (!this.f2110a.isFinishing() || this.f2113f == null)) {
            this.f2112d.onPause();
        }
        mo20209p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final void mo20209p0() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzo;
        if (this.f2110a.isFinishing() && !this.f2106H) {
            this.f2106H = true;
            zzcmp zzcmp = this.f2112d;
            if (zzcmp != null) {
                zzcmp.mo44008B0(this.f2109K - 1);
                synchronized (this.f2102D) {
                    if (!this.f2104F && this.f2112d.mo44007B()) {
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27020V3)).booleanValue() && !this.f2107I && (adOverlayInfoParcel = this.f2111c) != null && (zzo = adOverlayInfoParcel.f2070d) != null) {
                            zzo.mo20218sb();
                        }
                        zze zze = new zze(this);
                        this.f2103E = zze;
                        zzs.f2304i.postDelayed(zze, ((Long) zzay.m1924c().mo42663b(zzbjc.f26977R0)).longValue());
                        return;
                    }
                }
            }
            mo20195a();
        }
    }

    /* renamed from: q */
    public final void mo20210q() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27038X3)).booleanValue()) {
            zzcmp zzcmp = this.f2112d;
            if (zzcmp == null || zzcmp.mo44037X0()) {
                zzcgp.m45229g("The webview does not exist. Ignoring action.");
            } else {
                this.f2112d.onResume();
            }
        }
    }

    /* renamed from: r */
    public final void mo20211r() {
        zzo zzo;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2111c;
        if (adOverlayInfoParcel != null && (zzo = adOverlayInfoParcel.f2070d) != null) {
            zzo.mo20217b();
        }
    }

    /* renamed from: w */
    public final void mo20212w() {
        this.f2105G = true;
    }

    public final void zzb() {
        this.f2109K = 3;
        this.f2110a.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2111c;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.f2053B == 5) {
            this.f2110a.overridePendingTransition(0, 0);
        }
    }
}
