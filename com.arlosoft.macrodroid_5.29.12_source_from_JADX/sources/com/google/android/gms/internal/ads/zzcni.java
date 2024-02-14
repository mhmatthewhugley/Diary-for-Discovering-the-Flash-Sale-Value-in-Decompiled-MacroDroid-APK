package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzce;
import com.google.android.gms.ads.internal.util.zzci;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzcni extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcmp {

    /* renamed from: r0 */
    public static final /* synthetic */ int f29071r0 = 0;

    /* renamed from: A */
    private zzfdn f29072A;

    /* renamed from: B */
    private boolean f29073B = false;

    /* renamed from: C */
    private boolean f29074C = false;

    /* renamed from: D */
    private zzcmw f29075D;

    /* renamed from: E */
    private zzl f29076E;

    /* renamed from: F */
    private IObjectWrapper f29077F;

    /* renamed from: G */
    private zzcoe f29078G;

    /* renamed from: H */
    private final String f29079H;

    /* renamed from: I */
    private boolean f29080I;

    /* renamed from: J */
    private boolean f29081J;

    /* renamed from: K */
    private boolean f29082K;

    /* renamed from: L */
    private boolean f29083L;

    /* renamed from: M */
    private Boolean f29084M;

    /* renamed from: N */
    private boolean f29085N = true;

    /* renamed from: O */
    private final String f29086O = "";

    /* renamed from: P */
    private zzcnl f29087P;

    /* renamed from: Q */
    private boolean f29088Q;

    /* renamed from: R */
    private boolean f29089R;

    /* renamed from: S */
    private zzblr f29090S;

    /* renamed from: T */
    private zzblp f29091T;

    /* renamed from: U */
    private zzbdd f29092U;

    /* renamed from: V */
    private int f29093V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public int f29094W;

    /* renamed from: a */
    private final zzcod f29095a;

    /* renamed from: a0 */
    private zzbjo f29096a0;

    /* renamed from: b0 */
    private final zzbjo f29097b0;

    /* renamed from: c */
    private final zzape f29098c;

    /* renamed from: c0 */
    private zzbjo f29099c0;

    /* renamed from: d */
    private final zzbkb f29100d;

    /* renamed from: d0 */
    private final zzbjp f29101d0;

    /* renamed from: e0 */
    private int f29102e0;

    /* renamed from: f */
    private final zzcgv f29103f;

    /* renamed from: f0 */
    private int f29104f0;

    /* renamed from: g */
    private com.google.android.gms.ads.internal.zzl f29105g;

    /* renamed from: g0 */
    private int f29106g0;

    /* renamed from: h0 */
    private zzl f29107h0;

    /* renamed from: i0 */
    private boolean f29108i0;

    /* renamed from: j0 */
    private final zzci f29109j0;

    /* renamed from: k0 */
    private int f29110k0 = -1;

    /* renamed from: l0 */
    private int f29111l0 = -1;

    /* renamed from: m0 */
    private int f29112m0 = -1;

    /* renamed from: n0 */
    private int f29113n0 = -1;

    /* renamed from: o */
    private final zza f29114o;

    /* renamed from: o0 */
    private Map f29115o0;

    /* renamed from: p */
    private final DisplayMetrics f29116p;

    /* renamed from: p0 */
    private final WindowManager f29117p0;

    /* renamed from: q0 */
    private final zzbep f29118q0;

    /* renamed from: s */
    private final float f29119s;

    /* renamed from: z */
    private zzfdk f29120z;

    @VisibleForTesting
    protected zzcni(zzcod zzcod, zzcoe zzcoe, String str, boolean z, boolean z2, zzape zzape, zzbkb zzbkb, zzcgv zzcgv, zzbjr zzbjr, com.google.android.gms.ads.internal.zzl zzl, zza zza, zzbep zzbep, zzfdk zzfdk, zzfdn zzfdn) {
        super(zzcod);
        zzfdn zzfdn2;
        this.f29095a = zzcod;
        this.f29078G = zzcoe;
        this.f29079H = str;
        this.f29082K = z;
        this.f29098c = zzape;
        this.f29100d = zzbkb;
        this.f29103f = zzcgv;
        this.f29105g = zzl;
        this.f29114o = zza;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f29117p0 = windowManager;
        zzt.m2905r();
        DisplayMetrics O = zzs.m2741O(windowManager);
        this.f29116p = O;
        this.f29119s = O.density;
        this.f29118q0 = zzbep;
        this.f29120z = zzfdk;
        this.f29072A = zzfdn;
        this.f29109j0 = new zzci(zzcod.mo44178a(), this, this, (ViewTreeObserver.OnScrollChangedListener) null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzcgp.m45227e("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        settings.setUserAgentString(zzt.m2905r().mo20412z(zzcod, zzcgv.f28446a));
        zzt.m2905r();
        Context context = getContext();
        zzcb.m2626a(context, new zzm(settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        m46037p1();
        addJavascriptInterface(new zzcnp(this, new zzcno(this), (byte[]) null), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        m46045x1();
        zzbjp zzbjp = new zzbjp(new zzbjr(true, "make_wv", this.f29079H));
        this.f29101d0 = zzbjp;
        zzbjp.mo42682a().mo42689c((zzbjr) null);
        if (!(!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() || (zzfdn2 = this.f29072A) == null || zzfdn2.f35566b == null)) {
            zzbjp.mo42682a().mo42690d("gqi", this.f29072A.f35566b);
        }
        zzbjp.mo42682a();
        zzbjo f = zzbjr.m43574f();
        this.f29097b0 = f;
        zzbjp.mo42683b("native:view_create", f);
        this.f29099c0 = null;
        this.f29096a0 = null;
        zzce.m2627a().mo20342b(zzcod);
        zzt.m2904q().mo43500q();
    }

    /* renamed from: p1 */
    private final synchronized void m46037p1() {
        zzfdk zzfdk = this.f29120z;
        if (zzfdk != null) {
            if (zzfdk.f35548o0) {
                zzcgp.m45224b("Disabling hardware acceleration on an overlay.");
                m46039r1();
                return;
            }
        }
        if (!this.f29082K) {
            if (!this.f29078G.mo44186i()) {
                zzcgp.m45224b("Enabling hardware acceleration on an AdView.");
                m46041t1();
                return;
            }
        }
        zzcgp.m45224b("Enabling hardware acceleration on an overlay.");
        m46041t1();
    }

    /* renamed from: q1 */
    private final synchronized void m46038q1() {
        if (!this.f29108i0) {
            this.f29108i0 = true;
            zzt.m2904q().mo43499p();
        }
    }

    /* renamed from: r1 */
    private final synchronized void m46039r1() {
        if (!this.f29083L) {
            setLayerType(1, (Paint) null);
        }
        this.f29083L = true;
    }

    /* renamed from: s1 */
    private final void m46040s1(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z ? "0" : "1");
        mo42954y("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: t1 */
    private final synchronized void m46041t1() {
        if (this.f29083L) {
            setLayerType(0, (Paint) null);
        }
        this.f29083L = false;
    }

    /* renamed from: u1 */
    private final synchronized void m46042u1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            zzt.m2904q().mo43503t(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcgp.m45230h("Could not call loadUrl in destroy(). ", th);
        }
    }

    /* renamed from: v1 */
    private final void m46043v1() {
        zzbjj.m43560a(this.f29101d0.mo42682a(), this.f29097b0, "aeh2");
    }

    /* renamed from: w1 */
    private final synchronized void m46044w1() {
        Map map = this.f29115o0;
        if (map != null) {
            for (zzclb release : map.values()) {
                release.release();
            }
        }
        this.f29115o0 = null;
    }

    /* renamed from: x1 */
    private final void m46045x1() {
        zzbjp zzbjp = this.f29101d0;
        if (zzbjp != null) {
            zzbjr a = zzbjp.mo42682a();
            zzbjh f = zzt.m2904q().mo43492f();
            if (f != null) {
                f.mo42677f(a);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo44151n1(java.lang.Boolean.FALSE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m46046y1() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzcfy r0 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ all -> 0x0023 }
            java.lang.Boolean r0 = r0.mo43496k()     // Catch:{ all -> 0x0023 }
            r2.f29084M = r0     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "(function(){})()"
            r1 = 0
            r2.evaluateJavascript(r0, r1)     // Catch:{ IllegalStateException -> 0x001a }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IllegalStateException -> 0x001a }
            r2.mo44151n1(r0)     // Catch:{ IllegalStateException -> 0x001a }
            monitor-exit(r2)
            return
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0023 }
            r2.mo44151n1(r0)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcni.m46046y1():void");
    }

    /* renamed from: A */
    public final synchronized void mo43743A(zzcnl zzcnl) {
        if (this.f29087P != null) {
            zzcgp.m45226d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.f29087P = zzcnl;
        }
    }

    /* renamed from: A0 */
    public final synchronized void mo44006A0(zzblp zzblp) {
        this.f29091T = zzblp;
    }

    /* renamed from: B */
    public final synchronized boolean mo44007B() {
        return this.f29093V > 0;
    }

    /* renamed from: B0 */
    public final void mo44008B0(int i) {
        if (i == 0) {
            zzbjj.m43560a(this.f29101d0.mo42682a(), this.f29097b0, "aebb2");
        }
        m46043v1();
        this.f29101d0.mo42682a();
        this.f29101d0.mo42682a().mo42690d("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(ClientCookie.VERSION_ATTR, this.f29103f.f28446a);
        mo42954y("onhide", hashMap);
    }

    /* renamed from: C */
    public final synchronized zzcoe mo44009C() {
        return this.f29078G;
    }

    /* renamed from: C0 */
    public final void mo44010C0(Context context) {
        this.f29095a.setBaseContext(context);
        this.f29109j0.mo20351e(this.f29095a.mo44178a());
    }

    /* renamed from: D */
    public final synchronized void mo44011D() {
        zze.m2645k("Destroying WebView!");
        m46038q1();
        zzs.f2304i.post(new zzcnh(this));
    }

    /* renamed from: D0 */
    public final void mo44012D0() {
        m46043v1();
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.f29103f.f28446a);
        mo42954y("onhide", hashMap);
    }

    /* renamed from: E */
    public final synchronized void mo43744E(int i) {
        this.f29102e0 = i;
    }

    /* renamed from: E0 */
    public final boolean mo44013E0(boolean z, int i) {
        destroy();
        this.f29118q0.mo42550b(new zzcnf(z, i));
        this.f29118q0.mo42551c(10003);
        return true;
    }

    /* renamed from: F */
    public final synchronized boolean mo44014F() {
        return this.f29085N;
    }

    /* renamed from: F0 */
    public final synchronized void mo44015F0(IObjectWrapper iObjectWrapper) {
        this.f29077F = iObjectWrapper;
    }

    /* renamed from: G */
    public final void mo44016G() {
        this.f29109j0.mo20348b();
    }

    /* renamed from: G0 */
    public final synchronized void mo20442G0() {
        com.google.android.gms.ads.internal.zzl zzl = this.f29105g;
        if (zzl != null) {
            zzl.mo20442G0();
        }
    }

    /* renamed from: H */
    public final synchronized void mo43745H() {
        zzblp zzblp = this.f29091T;
        if (zzblp != null) {
            zzs.f2304i.post(new zzdsl((zzdsn) zzblp));
        }
    }

    /* renamed from: J */
    public final Context mo44017J() {
        return this.f29095a.mo44179b();
    }

    /* renamed from: K */
    public final void mo43746K() {
        zzl M = mo44020M();
        if (M != null) {
            M.mo20198d();
        }
    }

    /* renamed from: K0 */
    public final synchronized void mo44018K0(zzblr zzblr) {
        this.f29090S = zzblr;
    }

    /* renamed from: L */
    public final zzape mo44019L() {
        return this.f29098c;
    }

    /* renamed from: M */
    public final synchronized zzl mo44020M() {
        return this.f29076E;
    }

    /* renamed from: M0 */
    public final void mo44138M0(boolean z, int i, String str, boolean z2) {
        this.f29075D.mo44123y0(z, i, str, z2);
    }

    /* renamed from: N */
    public final void mo44021N() {
        throw null;
    }

    /* renamed from: N0 */
    public final void mo44139N0(zzc zzc, boolean z) {
        this.f29075D.mo44104h0(zzc, z);
    }

    /* renamed from: O */
    public final zzfdn mo44022O() {
        return this.f29072A;
    }

    /* renamed from: O0 */
    public final void mo42396O0(zzbbp zzbbp) {
        boolean z;
        synchronized (this) {
            z = zzbbp.f26529j;
            this.f29088Q = z;
        }
        m46040s1(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0016, code lost:
        return;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44023P(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f29093V     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r1 == r3) goto L_0x0007
            r1 = -1
        L_0x0007:
            int r0 = r0 + r1
            r2.f29093V = r0     // Catch:{ all -> 0x0017 }
            if (r0 > 0) goto L_0x0015
            com.google.android.gms.ads.internal.overlay.zzl r3 = r2.f29076E     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0015
            r3.mo20202j0()     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return
        L_0x0015:
            monitor-exit(r2)
            return
        L_0x0017:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcni.mo44023P(boolean):void");
    }

    /* renamed from: P0 */
    public final synchronized void mo44024P0(boolean z) {
        this.f29085N = z;
    }

    /* renamed from: Q */
    public final WebViewClient mo44025Q() {
        return this.f29075D;
    }

    /* renamed from: Q0 */
    public final void mo44026Q0(String str, Predicate predicate) {
        zzcmw zzcmw = this.f29075D;
        if (zzcmw != null) {
            zzcmw.mo44096c(str, predicate);
        }
    }

    /* renamed from: R */
    public final View mo44027R() {
        return this;
    }

    /* renamed from: R0 */
    public final synchronized void mo44028R0(String str, String str2, String str3) {
        String str4;
        if (!mo44037X0()) {
            String[] strArr = new String[1];
            String str5 = (String) zzay.m1924c().mo42663b(zzbjc.f26936N);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ClientCookie.VERSION_ATTR, str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e) {
                zzcgp.m45230h("Unable to build MRAID_ENV", e);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcnv.m46176a(str2, strArr), "text/html", "UTF-8", (String) null);
            return;
        }
        zzcgp.m45229g("#004 The webview is destroyed. Ignoring action.");
    }

    /* renamed from: S */
    public final WebView mo44029S() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44030S0(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f29082K     // Catch:{ all -> 0x003a }
            r2.f29082K = r3     // Catch:{ all -> 0x003a }
            r2.m46037p1()     // Catch:{ all -> 0x003a }
            if (r3 == r0) goto L_0x0038
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26946O     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x003a }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003a }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.zzcoe r0 = r2.f29078G     // Catch:{ all -> 0x003a }
            boolean r0 = r0.mo44186i()     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
        L_0x0024:
            com.google.android.gms.internal.ads.zzbyf r0 = new com.google.android.gms.internal.ads.zzbyf     // Catch:{ all -> 0x003a }
            java.lang.String r1 = ""
            r0.<init>(r2, r1)     // Catch:{ all -> 0x003a }
            r1 = 1
            if (r1 == r3) goto L_0x0031
            java.lang.String r3 = "default"
            goto L_0x0033
        L_0x0031:
            java.lang.String r3 = "expanded"
        L_0x0033:
            r0.mo43222g(r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
            return
        L_0x0038:
            monitor-exit(r2)
            return
        L_0x003a:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcni.mo44030S0(boolean):void");
    }

    /* renamed from: T */
    public final synchronized zzblr mo44031T() {
        return this.f29090S;
    }

    /* renamed from: T0 */
    public final synchronized IObjectWrapper mo44032T0() {
        return this.f29077F;
    }

    /* renamed from: U */
    public final synchronized void mo44033U(zzl zzl) {
        this.f29076E = zzl;
    }

    /* renamed from: U0 */
    public final synchronized void mo44034U0(zzbdd zzbdd) {
        this.f29092U = zzbdd;
    }

    /* renamed from: V */
    public final void mo44035V() {
        throw null;
    }

    /* renamed from: W0 */
    public final void mo44140W0(boolean z, int i, boolean z2) {
        this.f29075D.mo44119w0(z, i, z2);
    }

    /* renamed from: X */
    public final synchronized void mo44036X(boolean z) {
        if (z) {
            setBackgroundColor(0);
        }
        zzl zzl = this.f29076E;
        if (zzl != null) {
            zzl.mo20192Rb(z);
        }
    }

    /* renamed from: X0 */
    public final synchronized boolean mo44037X0() {
        return this.f29081J;
    }

    /* renamed from: Y0 */
    public final void mo44141Y0(zzbr zzbr, zzego zzego, zzdxq zzdxq, zzfir zzfir, String str, String str2, int i) {
        this.f29075D.mo44118v0(zzbr, zzego, zzdxq, zzfir, str, str2, 14);
    }

    /* renamed from: Z0 */
    public final zzfzp mo44038Z0() {
        zzbkb zzbkb = this.f29100d;
        if (zzbkb == null) {
            return zzfzg.m51414i((Object) null);
        }
        return zzbkb.mo42726a();
    }

    /* renamed from: a0 */
    public final synchronized zzl mo44039a0() {
        return this.f29107h0;
    }

    /* renamed from: a1 */
    public final void mo44040a1() {
        if (this.f29096a0 == null) {
            zzbjj.m43560a(this.f29101d0.mo42682a(), this.f29097b0, "aes2");
            this.f29101d0.mo42682a();
            zzbjo f = zzbjr.m43574f();
            this.f29096a0 = f;
            this.f29101d0.mo42683b("native:view_show", f);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(ClientCookie.VERSION_ATTR, this.f29103f.f28446a);
        mo42954y("onshow", hashMap);
    }

    /* renamed from: b */
    public final void mo42953b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzcgp.m45224b("Dispatching AFMA event: ".concat(sb.toString()));
        mo44149l1(sb.toString());
    }

    /* renamed from: b0 */
    public final void mo43747b0(int i) {
    }

    /* renamed from: b1 */
    public final synchronized void mo44041b1(boolean z) {
        zzl zzl = this.f29076E;
        if (zzl != null) {
            zzl.mo20190Pb(this.f29075D.mo44088Q(), z);
        } else {
            this.f29080I = z;
        }
    }

    /* renamed from: c */
    public final int mo43748c() {
        return this.f29106g0;
    }

    /* renamed from: c0 */
    public final void mo43749c0(boolean z) {
        this.f29075D.mo44093a(false);
    }

    /* renamed from: c1 */
    public final void mo44142c1(boolean z, int i, String str, String str2, boolean z2) {
        this.f29075D.mo44124z0(z, i, str, str2, z2);
    }

    /* renamed from: d1 */
    public final void mo42972d1(String str, JSONObject jSONObject) {
        mo42956q(str, jSONObject.toString());
    }

    public final synchronized void destroy() {
        m46045x1();
        this.f29109j0.mo20347a();
        zzl zzl = this.f29076E;
        if (zzl != null) {
            zzl.zzb();
            this.f29076E.mo20201j();
            this.f29076E = null;
        }
        this.f29077F = null;
        this.f29075D.mo44087J0();
        this.f29092U = null;
        this.f29105g = null;
        setOnClickListener((View.OnClickListener) null);
        setOnTouchListener((View.OnTouchListener) null);
        if (!this.f29081J) {
            zzt.m2886A().mo43886h(this);
            m46044w1();
            this.f29081J = true;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27300x8)).booleanValue()) {
                zze.m2645k("Initiating WebView self destruct sequence in 3...");
                zze.m2645k("Loading blank page in WebView, 2...");
                m46042u1("about:blank");
                return;
            }
            zze.m2645k("Destroying the WebView immediately...");
            mo44011D();
        }
    }

    /* renamed from: e */
    public final synchronized int mo43750e() {
        return this.f29102e0;
    }

    /* renamed from: e0 */
    public final /* synthetic */ zzcoc mo44044e0() {
        return this.f29075D;
    }

    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (mo44037X0()) {
            zzcgp.m45231i("#004 The webview is destroyed. Ignoring action.", (Throwable) null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue((Object) null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: f */
    public final int mo43751f() {
        return this.f29104f0;
    }

    /* renamed from: f0 */
    public final void mo43752f0(int i) {
        this.f29104f0 = i;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.f29081J) {
                    this.f29075D.mo44087J0();
                    zzt.m2886A().mo43886h(this);
                    m46044w1();
                    m46038q1();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* renamed from: g */
    public final int mo43753g() {
        return getMeasuredHeight();
    }

    /* renamed from: g0 */
    public final synchronized void mo44045g0(int i) {
        zzl zzl = this.f29076E;
        if (zzl != null) {
            zzl.mo20191Qb(i);
        }
    }

    /* renamed from: g1 */
    public final zzcmw mo44146g1() {
        return this.f29075D;
    }

    /* renamed from: h */
    public final int mo43755h() {
        return getMeasuredWidth();
    }

    /* renamed from: h0 */
    public final synchronized void mo20443h0() {
        com.google.android.gms.ads.internal.zzl zzl = this.f29105g;
        if (zzl != null) {
            zzl.mo20443h0();
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: h1 */
    public final synchronized Boolean mo44147h1() {
        return this.f29084M;
    }

    /* renamed from: i */
    public final Activity mo43756i() {
        return this.f29095a.mo44178a();
    }

    /* renamed from: i0 */
    public final void mo44054i0(zzfdk zzfdk, zzfdn zzfdn) {
        this.f29120z = zzfdk;
        this.f29072A = zzfdn;
    }

    /* renamed from: j0 */
    public final synchronized boolean mo44055j0() {
        return this.f29082K;
    }

    /* renamed from: k */
    public final zza mo43757k() {
        return this.f29114o;
    }

    /* renamed from: k0 */
    public final void mo44056k0() {
        if (this.f29099c0 == null) {
            this.f29101d0.mo42682a();
            zzbjo f = zzbjr.m43574f();
            this.f29099c0 = f;
            this.f29101d0.mo42683b("native:view_load", f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k1 */
    public final synchronized void mo44148k1(String str, ValueCallback valueCallback) {
        if (!mo44037X0()) {
            evaluateJavascript(str, (ValueCallback) null);
        } else {
            zzcgp.m45229g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: l */
    public final zzbjp mo43758l() {
        return this.f29101d0;
    }

    /* renamed from: l0 */
    public final synchronized void mo44057l0(zzcoe zzcoe) {
        this.f29078G = zzcoe;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l1 */
    public final void mo44149l1(String str) {
        if (PlatformVersion.m4899d()) {
            if (mo44147h1() == null) {
                m46046y1();
            }
            if (mo44147h1().booleanValue()) {
                mo44148k1(str, (ValueCallback) null);
            } else {
                mo44150m1("javascript:".concat(str));
            }
        } else {
            mo44150m1("javascript:".concat(str));
        }
    }

    public final synchronized void loadData(String str, String str2, String str3) {
        if (!mo44037X0()) {
            super.loadData(str, str2, str3);
        } else {
            zzcgp.m45229g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!mo44037X0()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzcgp.m45229g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void loadUrl(String str) {
        if (!mo44037X0()) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                zzt.m2904q().mo43503t(th, "AdWebViewImpl.loadUrl");
                zzcgp.m45230h("Could not call loadUrl. ", th);
            }
        } else {
            zzcgp.m45229g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: m */
    public final zzcgv mo43759m() {
        return this.f29103f;
    }

    /* renamed from: m0 */
    public final synchronized String mo44061m0() {
        return this.f29079H;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m1 */
    public final synchronized void mo44150m1(String str) {
        if (!mo44037X0()) {
            loadUrl(str);
        } else {
            zzcgp.m45229g("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* renamed from: n */
    public final zzbjo mo43760n() {
        return this.f29097b0;
    }

    /* renamed from: n0 */
    public final void mo44063n0(String str, zzbpu zzbpu) {
        zzcmw zzcmw = this.f29075D;
        if (zzcmw != null) {
            zzcmw.mo44094b(str, zzbpu);
        }
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: n1 */
    public final void mo44151n1(Boolean bool) {
        synchronized (this) {
            this.f29084M = bool;
        }
        zzt.m2904q().mo43504u(bool);
    }

    /* renamed from: o */
    public final void mo42955o(String str) {
        throw null;
    }

    /* renamed from: o0 */
    public final void mo44064o0(String str, zzbpu zzbpu) {
        zzcmw zzcmw = this.f29075D;
        if (zzcmw != null) {
            zzcmw.mo44083G0(str, zzbpu);
        }
    }

    /* renamed from: o1 */
    public final boolean mo44152o1() {
        int i;
        int i2;
        boolean z = false;
        if (!this.f29075D.mo44088Q() && !this.f29075D.mo44101f()) {
            return false;
        }
        zzaw.m1917b();
        DisplayMetrics displayMetrics = this.f29116p;
        int u = zzcgi.m45185u(displayMetrics, displayMetrics.widthPixels);
        zzaw.m1917b();
        DisplayMetrics displayMetrics2 = this.f29116p;
        int u2 = zzcgi.m45185u(displayMetrics2, displayMetrics2.heightPixels);
        Activity a = this.f29095a.mo44178a();
        if (a == null || a.getWindow() == null) {
            i2 = u;
            i = u2;
        } else {
            zzt.m2905r();
            int[] n = zzs.m2763n(a);
            zzaw.m1917b();
            int u3 = zzcgi.m45185u(this.f29116p, n[0]);
            zzaw.m1917b();
            i = zzcgi.m45185u(this.f29116p, n[1]);
            i2 = u3;
        }
        int i3 = this.f29111l0;
        if (i3 == u && this.f29110k0 == u2 && this.f29112m0 == i2 && this.f29113n0 == i) {
            return false;
        }
        if (!(i3 == u && this.f29110k0 == u2)) {
            z = true;
        }
        this.f29111l0 = u;
        this.f29110k0 = u2;
        this.f29112m0 = i2;
        this.f29113n0 = i;
        new zzbyf(this, "").mo43220e(u, u2, i2, i, this.f29116p.density, this.f29117p0.getDefaultDisplay().getRotation());
        return z;
    }

    public final void onAdClicked() {
        zzcmw zzcmw = this.f29075D;
        if (zzcmw != null) {
            zzcmw.onAdClicked();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo44037X0()) {
            this.f29109j0.mo20349c();
        }
        boolean z = this.f29088Q;
        zzcmw zzcmw = this.f29075D;
        if (zzcmw != null && zzcmw.mo44101f()) {
            if (!this.f29089R) {
                this.f29075D.mo44120x();
                this.f29075D.mo44122y();
                this.f29089R = true;
            }
            mo44152o1();
            z = true;
        }
        m46040s1(z);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        zzcmw zzcmw;
        synchronized (this) {
            if (!mo44037X0()) {
                this.f29109j0.mo20350d();
            }
            super.onDetachedFromWindow();
            if (this.f29089R && (zzcmw = this.f29075D) != null && zzcmw.mo44101f() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f29075D.mo44120x();
                this.f29075D.mo44122y();
                this.f29089R = false;
            }
        }
        m46040s1(false);
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            zzt.m2905r();
            zzs.m2759j(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzcgp.m45224b("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (!mo44037X0()) {
            if (Build.VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
            }
        }
    }

    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public final void onGlobalLayout() {
        boolean o1 = mo44152o1();
        zzl M = mo44020M();
        if (M != null && o1) {
            M.mo20203k();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01bb A[SYNTHETIC, Splitter:B:111:0x01bb] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.mo44037X0()     // Catch:{ all -> 0x01e1 }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x000d:
            boolean r0 = r8.isInEditMode()     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01dc
            boolean r0 = r8.f29082K     // Catch:{ all -> 0x01e1 }
            if (r0 != 0) goto L_0x01dc
            com.google.android.gms.internal.ads.zzcoe r0 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo44183f()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0021
            goto L_0x01dc
        L_0x0021:
            com.google.android.gms.internal.ads.zzcoe r0 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo44185h()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x002e
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x002e:
            com.google.android.gms.internal.ads.zzcoe r0 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo44187j()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27037X2     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r2.mo42663b(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x004d
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x004d:
            com.google.android.gms.internal.ads.zzcnl r0 = r8.mo43761p()     // Catch:{ all -> 0x01e1 }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            float r0 = r0.mo19999b()     // Catch:{ all -> 0x01e1 }
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0063
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x0063:
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
            float r2 = (float) r10     // Catch:{ all -> 0x01e1 }
            float r2 = r2 * r0
            int r2 = (int) r2     // Catch:{ all -> 0x01e1 }
            float r3 = (float) r9     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r0
            int r3 = (int) r3     // Catch:{ all -> 0x01e1 }
            if (r10 != 0) goto L_0x007e
            if (r3 == 0) goto L_0x007d
            float r10 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r10 = r10 * r0
            int r2 = (int) r10     // Catch:{ all -> 0x01e1 }
            r1 = r9
            r10 = r3
            goto L_0x0088
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r9 != 0) goto L_0x0087
            if (r2 == 0) goto L_0x0088
            float r9 = (float) r2     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r0
            int r3 = (int) r9     // Catch:{ all -> 0x01e1 }
            r1 = r2
            goto L_0x0088
        L_0x0087:
            r1 = r9
        L_0x0088:
            int r9 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x01e1 }
            int r10 = java.lang.Math.min(r3, r10)     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x0095:
            com.google.android.gms.internal.ads.zzcoe r0 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo44184g()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00de
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27095d3     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00b4
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00b4:
            com.google.android.gms.internal.ads.zzcng r0 = new com.google.android.gms.internal.ads.zzcng     // Catch:{ all -> 0x01e1 }
            r0.<init>(r8)     // Catch:{ all -> 0x01e1 }
            java.lang.String r1 = "/contentHeight"
            r8.mo44064o0(r1, r0)     // Catch:{ all -> 0x01e1 }
            java.lang.String r0 = "(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();"
            r8.mo44149l1(r0)     // Catch:{ all -> 0x01e1 }
            android.util.DisplayMetrics r0 = r8.f29116p     // Catch:{ all -> 0x01e1 }
            float r0 = r0.density     // Catch:{ all -> 0x01e1 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r1 = r8.f29094W     // Catch:{ all -> 0x01e1 }
            r2 = -1
            if (r1 == r2) goto L_0x00d5
            float r10 = (float) r1     // Catch:{ all -> 0x01e1 }
            float r10 = r10 * r0
            int r10 = (int) r10     // Catch:{ all -> 0x01e1 }
            goto L_0x00d9
        L_0x00d5:
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
        L_0x00d9:
            r8.setMeasuredDimension(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00de:
            com.google.android.gms.internal.ads.zzcoe r0 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            boolean r0 = r0.mo44186i()     // Catch:{ all -> 0x01e1 }
            if (r0 == 0) goto L_0x00f1
            android.util.DisplayMetrics r9 = r8.f29116p     // Catch:{ all -> 0x01e1 }
            int r10 = r9.widthPixels     // Catch:{ all -> 0x01e1 }
            int r9 = r9.heightPixels     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x00f1:
            int r0 = android.view.View.MeasureSpec.getMode(r9)     // Catch:{ all -> 0x01e1 }
            int r9 = android.view.View.MeasureSpec.getSize(r9)     // Catch:{ all -> 0x01e1 }
            int r2 = android.view.View.MeasureSpec.getMode(r10)     // Catch:{ all -> 0x01e1 }
            int r10 = android.view.View.MeasureSpec.getSize(r10)     // Catch:{ all -> 0x01e1 }
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r5) goto L_0x0111
            if (r0 != r4) goto L_0x010d
            goto L_0x0111
        L_0x010d:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0112
        L_0x0111:
            r0 = r9
        L_0x0112:
            if (r2 == r5) goto L_0x0116
            if (r2 != r4) goto L_0x0117
        L_0x0116:
            r3 = r10
        L_0x0117:
            com.google.android.gms.internal.ads.zzcoe r2 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            int r4 = r2.f29155c     // Catch:{ all -> 0x01e1 }
            r5 = 1
            if (r4 > r0) goto L_0x0125
            int r2 = r2.f29154b     // Catch:{ all -> 0x01e1 }
            if (r2 <= r3) goto L_0x0123
            goto L_0x0125
        L_0x0123:
            r2 = 0
            goto L_0x0126
        L_0x0125:
            r2 = 1
        L_0x0126:
            com.google.android.gms.internal.ads.zzbiu r4 = com.google.android.gms.internal.ads.zzbjc.f27316z4     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzbja r6 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x01e1 }
            java.lang.Object r4 = r6.mo42663b(r4)     // Catch:{ all -> 0x01e1 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x01e1 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x01e1 }
            if (r4 == 0) goto L_0x0154
            com.google.android.gms.internal.ads.zzcoe r4 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            int r6 = r4.f29155c     // Catch:{ all -> 0x01e1 }
            float r7 = r8.f29119s     // Catch:{ all -> 0x01e1 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e1 }
            float r6 = r6 / r7
            float r0 = (float) r0     // Catch:{ all -> 0x01e1 }
            float r0 = r0 / r7
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0152
            int r0 = r4.f29154b     // Catch:{ all -> 0x01e1 }
            float r0 = (float) r0     // Catch:{ all -> 0x01e1 }
            float r0 = r0 / r7
            float r3 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0152
            r0 = 1
            goto L_0x0153
        L_0x0152:
            r0 = 0
        L_0x0153:
            r2 = r2 & r0
        L_0x0154:
            r0 = 8
            if (r2 == 0) goto L_0x01bb
            com.google.android.gms.internal.ads.zzcoe r2 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            int r3 = r2.f29155c     // Catch:{ all -> 0x01e1 }
            float r4 = r8.f29119s     // Catch:{ all -> 0x01e1 }
            int r2 = r2.f29154b     // Catch:{ all -> 0x01e1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e1 }
            r6.<init>()     // Catch:{ all -> 0x01e1 }
            java.lang.String r7 = "Not enough space to show ad. Needs "
            r6.append(r7)     // Catch:{ all -> 0x01e1 }
            float r3 = (float) r3     // Catch:{ all -> 0x01e1 }
            float r3 = r3 / r4
            int r3 = (int) r3     // Catch:{ all -> 0x01e1 }
            r6.append(r3)     // Catch:{ all -> 0x01e1 }
            java.lang.String r3 = "x"
            r6.append(r3)     // Catch:{ all -> 0x01e1 }
            float r2 = (float) r2     // Catch:{ all -> 0x01e1 }
            float r2 = r2 / r4
            int r2 = (int) r2     // Catch:{ all -> 0x01e1 }
            r6.append(r2)     // Catch:{ all -> 0x01e1 }
            java.lang.String r2 = " dp, but only has "
            r6.append(r2)     // Catch:{ all -> 0x01e1 }
            float r9 = (float) r9     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e1 }
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = "x"
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            float r9 = (float) r10     // Catch:{ all -> 0x01e1 }
            float r9 = r9 / r4
            int r9 = (int) r9     // Catch:{ all -> 0x01e1 }
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = " dp."
            r6.append(r9)     // Catch:{ all -> 0x01e1 }
            java.lang.String r9 = r6.toString()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzcgp.m45229g(r9)     // Catch:{ all -> 0x01e1 }
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e1 }
            if (r9 == r0) goto L_0x01a7
            r9 = 4
            r8.setVisibility(r9)     // Catch:{ all -> 0x01e1 }
        L_0x01a7:
            r8.setMeasuredDimension(r1, r1)     // Catch:{ all -> 0x01e1 }
            boolean r9 = r8.f29073B     // Catch:{ all -> 0x01e1 }
            if (r9 != 0) goto L_0x01b9
            com.google.android.gms.internal.ads.zzbep r9 = r8.f29118q0     // Catch:{ all -> 0x01e1 }
            r10 = 10001(0x2711, float:1.4014E-41)
            r9.mo42551c(r10)     // Catch:{ all -> 0x01e1 }
            r8.f29073B = r5     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01b9:
            monitor-exit(r8)
            return
        L_0x01bb:
            int r9 = r8.getVisibility()     // Catch:{ all -> 0x01e1 }
            if (r9 == r0) goto L_0x01c4
            r8.setVisibility(r1)     // Catch:{ all -> 0x01e1 }
        L_0x01c4:
            boolean r9 = r8.f29074C     // Catch:{ all -> 0x01e1 }
            if (r9 != 0) goto L_0x01d1
            com.google.android.gms.internal.ads.zzbep r9 = r8.f29118q0     // Catch:{ all -> 0x01e1 }
            r10 = 10002(0x2712, float:1.4016E-41)
            r9.mo42551c(r10)     // Catch:{ all -> 0x01e1 }
            r8.f29074C = r5     // Catch:{ all -> 0x01e1 }
        L_0x01d1:
            com.google.android.gms.internal.ads.zzcoe r9 = r8.f29078G     // Catch:{ all -> 0x01e1 }
            int r10 = r9.f29155c     // Catch:{ all -> 0x01e1 }
            int r9 = r9.f29154b     // Catch:{ all -> 0x01e1 }
            r8.setMeasuredDimension(r10, r9)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01dc:
            super.onMeasure(r9, r10)     // Catch:{ all -> 0x01e1 }
            monitor-exit(r8)
            return
        L_0x01e1:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcni.onMeasure(int, int):void");
    }

    public final void onPause() {
        if (!mo44037X0()) {
            try {
                super.onPause();
            } catch (Exception e) {
                zzcgp.m45227e("Could not pause webview.", e);
            }
        }
    }

    public final void onResume() {
        if (!mo44037X0()) {
            try {
                super.onResume();
            } catch (Exception e) {
                zzcgp.m45227e("Could not resume webview.", e);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f29075D.mo44101f() || this.f29075D.mo44100e()) {
            zzape zzape = this.f29098c;
            if (zzape != null) {
                zzape.mo41777d(motionEvent);
            }
            zzbkb zzbkb = this.f29100d;
            if (zzbkb != null) {
                zzbkb.mo42727b(motionEvent);
            }
        } else {
            synchronized (this) {
                zzblr zzblr = this.f29090S;
                if (zzblr != null) {
                    zzblr.mo42747b(motionEvent);
                }
            }
        }
        if (mo44037X0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final synchronized zzcnl mo43761p() {
        return this.f29087P;
    }

    /* renamed from: q */
    public final void mo42956q(String str, String str2) {
        mo44149l1(str + "(" + str2 + ");");
    }

    /* renamed from: q0 */
    public final boolean mo44067q0() {
        return false;
    }

    /* renamed from: r */
    public final synchronized String mo43762r() {
        zzfdn zzfdn = this.f29072A;
        if (zzfdn == null) {
            return null;
        }
        return zzfdn.f35566b;
    }

    /* renamed from: r0 */
    public final void mo44068r0(boolean z) {
        this.f29075D.mo44095b0(z);
    }

    /* renamed from: s */
    public final void mo44113s() {
        zzcmw zzcmw = this.f29075D;
        if (zzcmw != null) {
            zzcmw.mo44113s();
        }
    }

    /* renamed from: s0 */
    public final void mo44069s0() {
        setBackgroundColor(0);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcmw) {
            this.f29075D = (zzcmw) webViewClient;
        }
    }

    public final void stopLoading() {
        if (!mo44037X0()) {
            try {
                super.stopLoading();
            } catch (Exception e) {
                zzcgp.m45227e("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public final zzfdk mo43986t() {
        return this.f29120z;
    }

    /* renamed from: t0 */
    public final synchronized void mo44074t0(zzl zzl) {
        this.f29107h0 = zzl;
    }

    /* renamed from: u */
    public final synchronized String mo43764u() {
        return this.f29086O;
    }

    /* renamed from: u0 */
    public final synchronized zzbdd mo44075u0() {
        return this.f29092U;
    }

    /* renamed from: v0 */
    public final void mo43765v0(int i) {
        this.f29106g0 = i;
    }

    /* renamed from: w */
    public final synchronized void mo43766w(String str, zzclb zzclb) {
        if (this.f29115o0 == null) {
            this.f29115o0 = new HashMap();
        }
        this.f29115o0.put(str, zzclb);
    }

    /* renamed from: x */
    public final synchronized zzclb mo43767x(String str) {
        Map map = this.f29115o0;
        if (map == null) {
            return null;
        }
        return (zzclb) map.get(str);
    }

    /* renamed from: x0 */
    public final zzcin mo43768x0() {
        return null;
    }

    /* renamed from: y */
    public final void mo42954y(String str, Map map) {
        try {
            mo42953b(str, zzaw.m1917b().mo43550i(map));
        } catch (JSONException unused) {
            zzcgp.m45229g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: y0 */
    public final void mo43769y0(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z ? "0" : "1");
        hashMap.put(TypedValues.Transition.S_DURATION, Long.toString(j));
        mo42954y("onCacheAccessComplete", hashMap);
    }

    /* renamed from: z */
    public final synchronized boolean mo44076z() {
        return this.f29080I;
    }
}
