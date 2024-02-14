package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzcmw extends WebViewClient implements zzcoc {

    /* renamed from: T */
    public static final /* synthetic */ int f29012T = 0;

    /* renamed from: A */
    private zzbor f29013A;

    /* renamed from: B */
    private zzdkn f29014B;

    /* renamed from: C */
    private boolean f29015C;

    /* renamed from: D */
    private boolean f29016D;

    /* renamed from: E */
    private boolean f29017E;

    /* renamed from: F */
    private boolean f29018F;

    /* renamed from: G */
    private boolean f29019G;

    /* renamed from: H */
    private zzz f29020H;
    @Nullable

    /* renamed from: I */
    private zzbye f29021I;

    /* renamed from: J */
    private zzb f29022J;

    /* renamed from: K */
    private zzbxz f29023K;
    @Nullable

    /* renamed from: L */
    protected zzcdq f29024L;
    @Nullable

    /* renamed from: M */
    private zzfkm f29025M;

    /* renamed from: N */
    private boolean f29026N;

    /* renamed from: O */
    private boolean f29027O;

    /* renamed from: P */
    private int f29028P;

    /* renamed from: Q */
    private boolean f29029Q;

    /* renamed from: R */
    private final HashSet f29030R;

    /* renamed from: S */
    private View.OnAttachStateChangeListener f29031S;

    /* renamed from: a */
    private final zzcmp f29032a;
    @Nullable

    /* renamed from: c */
    private final zzbep f29033c;

    /* renamed from: d */
    private final HashMap f29034d = new HashMap();

    /* renamed from: f */
    private final Object f29035f = new Object();

    /* renamed from: g */
    private zza f29036g;

    /* renamed from: o */
    private zzo f29037o;

    /* renamed from: p */
    private zzcoa f29038p;

    /* renamed from: s */
    private zzcob f29039s;

    /* renamed from: z */
    private zzbop f29040z;

    public zzcmw(zzcmp zzcmp, @Nullable zzbep zzbep, boolean z) {
        zzbye zzbye = new zzbye(zzcmp, zzcmp.mo44017J(), new zzbim(zzcmp.getContext()));
        this.f29033c = zzbep;
        this.f29032a = zzcmp;
        this.f29017E = z;
        this.f29021I = zzbye;
        this.f29023K = null;
        this.f29030R = new HashSet(Arrays.asList(((String) zzay.m1924c().mo42663b(zzbjc.f26901J4)).split(",")));
    }

    @Nullable
    /* renamed from: g */
    private static WebResourceResponse m45882g() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26837D0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    /* renamed from: n */
    private final WebResourceResponse m45883n(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
                    openConnection.setReadTimeout(SamsungIrisUnlockModule.IRIS_ACQUIRED_VENDOR_EVENT_BASE);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        zzt.m2905r().mo20405B(this.f29032a.getContext(), this.f29032a.mo43759m().f28446a, false, httpURLConnection, false, 60000);
                        zzcgo zzcgo = new zzcgo((String) null);
                        zzcgo.mo43556c(httpURLConnection, (byte[]) null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzcgo.mo43558e(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            zzt.m2905r();
                            WebResourceResponse m = zzs.m2762m(httpURLConnection);
                        } else {
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (headerField == null) {
                                throw new IOException("Missing Location header in redirect");
                            } else if (headerField.startsWith("tel:")) {
                                TrafficStats.clearThreadStatsTag();
                                return null;
                            } else {
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (protocol == null) {
                                    zzcgp.m45229g("Protocol is null");
                                    WebResourceResponse g = m45882g();
                                    TrafficStats.clearThreadStatsTag();
                                    return g;
                                } else if (protocol.equals("http") || protocol.equals(ProxyConfig.MATCH_HTTPS)) {
                                    zzcgp.m45224b("Redirecting to " + headerField);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                } else {
                                    zzcgp.m45229g("Unsupported scheme: " + protocol);
                                    return m45882g();
                                }
                            }
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            zzt.m2905r();
            WebResourceResponse m2 = zzs.m2762m(httpURLConnection);
            TrafficStats.clearThreadStatsTag();
            return m2;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m45884o(Map map, List list, String str) {
        if (zze.m2647m()) {
            zze.m2645k("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                zze.m2645k("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbpu) it.next()).mo42867a(this.f29032a, map);
        }
    }

    /* renamed from: q */
    private final void m45885q() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f29031S;
        if (onAttachStateChangeListener != null) {
            ((View) this.f29032a).removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m45886r(View view, zzcdq zzcdq, int i) {
        if (zzcdq.mo43398g() && i > 0) {
            zzcdq.mo43395c(view);
            if (zzcdq.mo43398g()) {
                zzs.f2304i.postDelayed(new zzcms(this, view, zzcdq, i), 100);
            }
        }
    }

    /* renamed from: u */
    private static final boolean m45887u(boolean z, zzcmp zzcmp) {
        return z && !zzcmp.mo44009C().mo44186i() && !zzcmp.mo44061m0().equals("interstitial_mb");
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: E */
    public final WebResourceResponse mo44082E(String str, Map map) {
        zzbdy b;
        try {
            if (((Boolean) zzbkt.f27465a.mo42728e()).booleanValue()) {
                if (this.f29025M != null && "oda".equals(Uri.parse(str).getScheme())) {
                    this.f29025M.mo45862c(str, (zzfju) null);
                    return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
                }
            }
            String c = zzcew.m45060c(str, this.f29032a.getContext(), this.f29029Q);
            if (!c.equals(str)) {
                return m45883n(c, map);
            }
            zzbeb l2 = zzbeb.m43220l2(Uri.parse(str));
            if (l2 != null && (b = zzt.m2892e().mo42515b(l2)) != null && b.mo42523p2()) {
                return new WebResourceResponse("", "", b.mo42521n2());
            }
            if (!zzcgo.m45209l() || !((Boolean) zzbko.f27418b.mo42728e()).booleanValue()) {
                return null;
            }
            return m45883n(str, map);
        } catch (Exception | NoClassDefFoundError e) {
            zzt.m2904q().mo43503t(e, "AdWebViewClient.interceptRequest");
            return m45882g();
        }
    }

    /* renamed from: G0 */
    public final void mo44083G0(String str, zzbpu zzbpu) {
        synchronized (this.f29035f) {
            List list = (List) this.f29034d.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f29034d.put(str, list);
            }
            list.add(zzbpu);
        }
    }

    /* renamed from: H0 */
    public final void mo44084H0(boolean z) {
        synchronized (this.f29035f) {
            this.f29018F = true;
        }
    }

    /* renamed from: I */
    public final void mo44085I(zzcoa zzcoa) {
        this.f29038p = zzcoa;
    }

    /* renamed from: I0 */
    public final void mo44086I0(@Nullable zza zza, @Nullable zzbop zzbop, @Nullable zzo zzo, @Nullable zzbor zzbor, @Nullable zzz zzz, boolean z, @Nullable zzbpx zzbpx, @Nullable zzb zzb, @Nullable zzbyg zzbyg, @Nullable zzcdq zzcdq, @Nullable zzego zzego, @Nullable zzfkm zzfkm, @Nullable zzdxq zzdxq, @Nullable zzfir zzfir, @Nullable zzbpv zzbpv, @Nullable zzdkn zzdkn, @Nullable zzbqm zzbqm, @Nullable zzbqg zzbqg) {
        zzbop zzbop2 = zzbop;
        zzbor zzbor2 = zzbor;
        zzbpx zzbpx2 = zzbpx;
        zzbyg zzbyg2 = zzbyg;
        zzcdq zzcdq2 = zzcdq;
        zzego zzego2 = zzego;
        zzfkm zzfkm2 = zzfkm;
        zzbpv zzbpv2 = zzbpv;
        zzdkn zzdkn2 = zzdkn;
        zzbqm zzbqm2 = zzbqm;
        zzbqg zzbqg2 = zzbqg;
        zzb zzb2 = zzb == null ? new zzb(this.f29032a.getContext(), zzcdq2, (zzcaq) null) : zzb;
        this.f29023K = new zzbxz(this.f29032a, zzbyg2);
        this.f29024L = zzcdq2;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26917L0)).booleanValue()) {
            mo44083G0("/adMetadata", new zzboo(zzbop2));
        }
        if (zzbor2 != null) {
            mo44083G0("/appEvent", new zzboq(zzbor2));
        }
        mo44083G0("/backButton", zzbpt.f27612j);
        mo44083G0("/refresh", zzbpt.f27613k);
        mo44083G0("/canOpenApp", zzbpt.f27604b);
        mo44083G0("/canOpenURLs", zzbpt.f27603a);
        mo44083G0("/canOpenIntents", zzbpt.f27605c);
        mo44083G0("/close", zzbpt.f27606d);
        mo44083G0("/customClose", zzbpt.f27607e);
        mo44083G0("/instrument", zzbpt.f27616n);
        mo44083G0("/delayPageLoaded", zzbpt.f27618p);
        mo44083G0("/delayPageClosed", zzbpt.f27619q);
        mo44083G0("/getLocationInfo", zzbpt.f27620r);
        mo44083G0("/log", zzbpt.f27609g);
        mo44083G0("/mraid", new zzbqb(zzb2, this.f29023K, zzbyg2));
        zzbye zzbye = this.f29021I;
        if (zzbye != null) {
            mo44083G0("/mraidLoaded", zzbye);
        }
        zzbqf zzbqf = r4;
        zzb zzb3 = zzb2;
        zzbqf zzbqf2 = new zzbqf(zzb2, this.f29023K, zzego, zzdxq, zzfir);
        mo44083G0("/open", zzbqf);
        mo44083G0("/precache", new zzclc());
        mo44083G0("/touch", zzbpt.f27611i);
        mo44083G0("/video", zzbpt.f27614l);
        mo44083G0("/videoMeta", zzbpt.f27615m);
        if (zzego2 == null || zzfkm2 == null) {
            mo44083G0("/click", zzbpt.m43931a(zzdkn));
            mo44083G0("/httpTrack", zzbpt.f27608f);
        } else {
            mo44083G0("/click", new zzfem(zzdkn2, zzfkm2, zzego2));
            mo44083G0("/httpTrack", new zzfel(zzfkm2, zzego2));
        }
        if (zzt.m2903p().mo43449z(this.f29032a.getContext())) {
            mo44083G0("/logScionEvent", new zzbqa(this.f29032a.getContext()));
        }
        if (zzbpx2 != null) {
            mo44083G0("/setInterstitialProperties", new zzbpw(zzbpx2, (byte[]) null));
        }
        if (zzbpv2 != null) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue()) {
                mo44083G0("/inspectorNetworkExtras", zzbpv2);
            }
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27042X7)).booleanValue() && zzbqm2 != null) {
            mo44083G0("/shareSheet", zzbqm2);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27070a8)).booleanValue() && zzbqg2 != null) {
            mo44083G0("/inspectorOutOfContextTest", zzbqg2);
        }
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27015U8)).booleanValue()) {
            mo44083G0("/bindPlayStoreOverlay", zzbpt.f27623u);
            mo44083G0("/presentPlayStoreOverlay", zzbpt.f27624v);
            mo44083G0("/expandPlayStoreOverlay", zzbpt.f27625w);
            mo44083G0("/collapsePlayStoreOverlay", zzbpt.f27626x);
            mo44083G0("/closePlayStoreOverlay", zzbpt.f27627y);
        }
        this.f29036g = zza;
        this.f29037o = zzo;
        this.f29040z = zzbop;
        this.f29013A = zzbor;
        this.f29020H = zzz;
        this.f29022J = zzb3;
        this.f29014B = zzdkn2;
        this.f29015C = z;
        this.f29025M = zzfkm2;
    }

    /* renamed from: J0 */
    public final void mo44087J0() {
        zzcdq zzcdq = this.f29024L;
        if (zzcdq != null) {
            zzcdq.mo43394b();
            this.f29024L = null;
        }
        m45885q();
        synchronized (this.f29035f) {
            this.f29034d.clear();
            this.f29036g = null;
            this.f29037o = null;
            this.f29038p = null;
            this.f29039s = null;
            this.f29040z = null;
            this.f29013A = null;
            this.f29015C = false;
            this.f29017E = false;
            this.f29018F = false;
            this.f29020H = null;
            this.f29022J = null;
            this.f29021I = null;
            zzbxz zzbxz = this.f29023K;
            if (zzbxz != null) {
                zzbxz.mo43199h(true);
                this.f29023K = null;
            }
            this.f29025M = null;
        }
    }

    /* renamed from: Q */
    public final boolean mo44088Q() {
        boolean z;
        synchronized (this.f29035f) {
            z = this.f29017E;
        }
        return z;
    }

    /* renamed from: V0 */
    public final void mo44089V0(Uri uri) {
        String path = uri.getPath();
        List list = (List) this.f29034d.get(path);
        if (path == null || list == null) {
            zze.m2645k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26962P5)).booleanValue() && zzt.m2904q().mo43492f() != null) {
                zzchc.f28456a.execute(new zzcmq((path == null || path.length() < 2) ? "null" : path.substring(1)));
                return;
            }
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26891I4)).booleanValue() && this.f29030R.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) zzay.m1924c().mo42663b(zzbjc.f26911K4)).intValue()) {
                zze.m2645k("Parsing gmsg query params on BG thread: ".concat(path));
                zzfzg.m51423r(zzt.m2905r().mo20411y(uri), new zzcmu(this, list, path, uri), zzchc.f28460e);
                return;
            }
        }
        zzt.m2905r();
        m45884o(zzs.m2761l(uri), list, path);
    }

    /* renamed from: W */
    public final void mo44090W() {
        if (this.f29038p != null && ((this.f29026N && this.f29028P <= 0) || this.f29027O || this.f29016D)) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26838D1)).booleanValue() && this.f29032a.mo43758l() != null) {
                zzbjj.m43560a(this.f29032a.mo43758l().mo42682a(), this.f29032a.mo43760n(), "awfllc");
            }
            zzcoa zzcoa = this.f29038p;
            boolean z = false;
            if (!this.f29027O && !this.f29016D) {
                z = true;
            }
            zzcoa.mo20180O(z);
            this.f29038p = null;
        }
        this.f29032a.mo44056k0();
    }

    /* renamed from: Y */
    public final void mo44091Y(boolean z) {
        synchronized (this.f29035f) {
            this.f29019G = z;
        }
    }

    /* renamed from: Z */
    public final void mo44092Z(int i, int i2, boolean z) {
        zzbye zzbye = this.f29021I;
        if (zzbye != null) {
            zzbye.mo43216h(i, i2);
        }
        zzbxz zzbxz = this.f29023K;
        if (zzbxz != null) {
            zzbxz.mo43201j(i, i2, false);
        }
    }

    /* renamed from: a */
    public final void mo44093a(boolean z) {
        this.f29015C = false;
    }

    /* renamed from: b */
    public final void mo44094b(String str, zzbpu zzbpu) {
        synchronized (this.f29035f) {
            List list = (List) this.f29034d.get(str);
            if (list != null) {
                list.remove(zzbpu);
            }
        }
    }

    /* renamed from: b0 */
    public final void mo44095b0(boolean z) {
        this.f29029Q = z;
    }

    /* renamed from: c */
    public final void mo44096c(String str, Predicate predicate) {
        synchronized (this.f29035f) {
            List<zzbpu> list = (List) this.f29034d.get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (zzbpu zzbpu : list) {
                    if (predicate.apply(zzbpu)) {
                        arrayList.add(zzbpu);
                    }
                }
                list.removeAll(arrayList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public final /* synthetic */ void mo44097c0() {
        this.f29032a.mo44016G();
        zzl M = this.f29032a.mo44020M();
        if (M != null) {
            M.mo20185D();
        }
    }

    /* renamed from: d */
    public final zzb mo44098d() {
        return this.f29022J;
    }

    /* renamed from: d0 */
    public final void mo44099d0(zzcob zzcob) {
        this.f29039s = zzcob;
    }

    /* renamed from: e */
    public final boolean mo44100e() {
        boolean z;
        synchronized (this.f29035f) {
            z = this.f29019G;
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo44101f() {
        boolean z;
        synchronized (this.f29035f) {
            z = this.f29018F;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final /* synthetic */ void mo44102f0(View view, zzcdq zzcdq, int i) {
        m45886r(view, zzcdq, i - 1);
    }

    /* renamed from: h */
    public final void mo44103h() {
        zzbep zzbep = this.f29033c;
        if (zzbep != null) {
            zzbep.mo42551c(10005);
        }
        this.f29027O = true;
        mo44090W();
        this.f29032a.destroy();
    }

    /* renamed from: h0 */
    public final void mo44104h0(zzc zzc, boolean z) {
        zzdkn zzdkn;
        boolean j0 = this.f29032a.mo44055j0();
        boolean u = m45887u(j0, this.f29032a);
        boolean z2 = true;
        if (!u && z) {
            z2 = false;
        }
        zza zza = u ? null : this.f29036g;
        zzo zzo = j0 ? null : this.f29037o;
        zzz zzz = this.f29020H;
        zzcgv m = this.f29032a.mo43759m();
        zzcmp zzcmp = this.f29032a;
        if (z2) {
            zzdkn = null;
        } else {
            zzdkn = this.f29014B;
        }
        mo44121x0(new AdOverlayInfoParcel(zzc, zza, zzo, zzz, m, zzcmp, zzdkn));
    }

    /* renamed from: i */
    public final void mo44105i() {
        synchronized (this.f29035f) {
        }
        this.f29028P++;
        mo44090W();
    }

    /* renamed from: j */
    public final void mo44106j() {
        this.f29028P--;
        mo44090W();
    }

    /* renamed from: m */
    public final void mo44107m() {
        zzcdq zzcdq = this.f29024L;
        if (zzcdq != null) {
            WebView S = this.f29032a.mo44029S();
            if (ViewCompat.isAttachedToWindow(S)) {
                m45886r(S, zzcdq, 10);
                return;
            }
            m45885q();
            zzcmt zzcmt = new zzcmt(this, zzcdq);
            this.f29031S = zzcmt;
            ((View) this.f29032a).addOnAttachStateChangeListener(zzcmt);
        }
    }

    public final void onAdClicked() {
        zza zza = this.f29036g;
        if (zza != null) {
            zza.onAdClicked();
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        zze.m2645k("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            mo44089V0(parse);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1.zza();
        r0.f29039s = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        mo44090W();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0.f29026N = true;
        r1 = r0.f29039s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.f29035f
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzcmp r2 = r0.f29032a     // Catch:{ all -> 0x0029 }
            boolean r2 = r2.mo44037X0()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "Blank page loaded, 1..."
            com.google.android.gms.ads.internal.util.zze.m2645k(r2)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.internal.ads.zzcmp r2 = r0.f29032a     // Catch:{ all -> 0x0029 }
            r2.mo44011D()     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            return
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            r1 = 1
            r0.f29026N = r1
            com.google.android.gms.internal.ads.zzcob r1 = r0.f29039s
            if (r1 == 0) goto L_0x0025
            r1.zza()
            r1 = 0
            r0.f29039s = r1
        L_0x0025:
            r0.mo44090W()
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0029 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmw.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f29016D = true;
    }

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f29032a.mo44013E0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    /* renamed from: p0 */
    public final void mo44112p0() {
        synchronized (this.f29035f) {
            this.f29015C = false;
            this.f29017E = true;
            zzchc.f28460e.execute(new zzcmr(this));
        }
    }

    /* renamed from: s */
    public final void mo44113s() {
        zzdkn zzdkn = this.f29014B;
        if (zzdkn != null) {
            zzdkn.mo44113s();
        }
    }

    @Nullable
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return mo44082E(str, Collections.emptyMap());
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        zze.m2645k("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.f29015C && webView == this.f29032a.mo44029S()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(scheme)) {
                    zza zza = this.f29036g;
                    if (zza != null) {
                        zza.onAdClicked();
                        zzcdq zzcdq = this.f29024L;
                        if (zzcdq != null) {
                            zzcdq.mo43399w0(str);
                        }
                        this.f29036g = null;
                    }
                    zzdkn zzdkn = this.f29014B;
                    if (zzdkn != null) {
                        zzdkn.mo44113s();
                        this.f29014B = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f29032a.mo44029S().willNotDraw()) {
                try {
                    zzape L = this.f29032a.mo44019L();
                    if (L != null && L.mo41779f(parse)) {
                        Context context = this.f29032a.getContext();
                        zzcmp zzcmp = this.f29032a;
                        parse = L.mo41774a(parse, context, (View) zzcmp, zzcmp.mo43756i());
                    }
                } catch (zzapf unused) {
                    zzcgp.m45229g("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                zzb zzb = this.f29022J;
                if (zzb == null || zzb.mo20416c()) {
                    mo44104h0(new zzc("android.intent.action.VIEW", parse.toString(), (String) null, (String) null, (String) null, (String) null, (String) null, (zzx) null), true);
                } else {
                    this.f29022J.mo20415b(str);
                }
            } else {
                zzcgp.m45229g("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        } else {
            mo44089V0(parse);
        }
        return true;
    }

    /* renamed from: v */
    public final void mo44117v(int i, int i2) {
        zzbxz zzbxz = this.f29023K;
        if (zzbxz != null) {
            zzbxz.mo43202k(i, i2);
        }
    }

    /* renamed from: v0 */
    public final void mo44118v0(zzbr zzbr, zzego zzego, zzdxq zzdxq, zzfir zzfir, String str, String str2, int i) {
        zzcmp zzcmp = this.f29032a;
        mo44121x0(new AdOverlayInfoParcel(zzcmp, zzcmp.mo43759m(), zzbr, zzego, zzdxq, zzfir, str, str2, 14));
    }

    /* renamed from: w0 */
    public final void mo44119w0(boolean z, int i, boolean z2) {
        zzdkn zzdkn;
        boolean u = m45887u(this.f29032a.mo44055j0(), this.f29032a);
        boolean z3 = true;
        if (!u && z2) {
            z3 = false;
        }
        zza zza = u ? null : this.f29036g;
        zzo zzo = this.f29037o;
        zzz zzz = this.f29020H;
        zzcmp zzcmp = this.f29032a;
        zzcgv m = zzcmp.mo43759m();
        if (z3) {
            zzdkn = null;
        } else {
            zzdkn = this.f29014B;
        }
        mo44121x0(new AdOverlayInfoParcel(zza, zzo, zzz, zzcmp, z, i, m, zzdkn));
    }

    /* renamed from: x */
    public final ViewTreeObserver.OnGlobalLayoutListener mo44120x() {
        synchronized (this.f29035f) {
        }
        return null;
    }

    /* renamed from: x0 */
    public final void mo44121x0(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzc;
        zzbxz zzbxz = this.f29023K;
        boolean l = zzbxz != null ? zzbxz.mo43203l() : false;
        zzt.m2898k();
        zzm.m2466a(this.f29032a.getContext(), adOverlayInfoParcel, !l);
        zzcdq zzcdq = this.f29024L;
        if (zzcdq != null) {
            String str = adOverlayInfoParcel.f2054C;
            if (str == null && (zzc = adOverlayInfoParcel.f2068a) != null) {
                str = zzc.f2079c;
            }
            zzcdq.mo43399w0(str);
        }
    }

    /* renamed from: y */
    public final ViewTreeObserver.OnScrollChangedListener mo44122y() {
        synchronized (this.f29035f) {
        }
        return null;
    }

    /* renamed from: y0 */
    public final void mo44123y0(boolean z, int i, String str, boolean z2) {
        zza zza;
        zzcmv zzcmv;
        zzdkn zzdkn;
        boolean j0 = this.f29032a.mo44055j0();
        boolean u = m45887u(j0, this.f29032a);
        boolean z3 = true;
        if (!u && z2) {
            z3 = false;
        }
        if (u) {
            zza = null;
        } else {
            zza = this.f29036g;
        }
        if (j0) {
            zzcmv = null;
        } else {
            zzcmv = new zzcmv(this.f29032a, this.f29037o);
        }
        zzbop zzbop = this.f29040z;
        zzbor zzbor = this.f29013A;
        zzz zzz = this.f29020H;
        zzcmp zzcmp = this.f29032a;
        zzcgv m = zzcmp.mo43759m();
        if (z3) {
            zzdkn = null;
        } else {
            zzdkn = this.f29014B;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza, zzcmv, zzbop, zzbor, zzz, zzcmp, z, i, str, m, zzdkn);
        mo44121x0(adOverlayInfoParcel);
    }

    /* renamed from: z0 */
    public final void mo44124z0(boolean z, int i, String str, String str2, boolean z2) {
        zza zza;
        zzcmv zzcmv;
        zzdkn zzdkn;
        boolean j0 = this.f29032a.mo44055j0();
        boolean u = m45887u(j0, this.f29032a);
        boolean z3 = true;
        if (!u && z2) {
            z3 = false;
        }
        if (u) {
            zza = null;
        } else {
            zza = this.f29036g;
        }
        if (j0) {
            zzcmv = null;
        } else {
            zzcmv = new zzcmv(this.f29032a, this.f29037o);
        }
        zzbop zzbop = this.f29040z;
        zzbor zzbor = this.f29013A;
        zzz zzz = this.f29020H;
        zzcmp zzcmp = this.f29032a;
        zzcgv m = zzcmp.mo43759m();
        if (z3) {
            zzdkn = null;
        } else {
            zzdkn = this.f29014B;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel(zza, (zzo) zzcmv, zzbop, zzbor, zzz, zzcmp, z, i, str, str2, m, zzdkn);
        mo44121x0(adOverlayInfoParcel);
    }
}
