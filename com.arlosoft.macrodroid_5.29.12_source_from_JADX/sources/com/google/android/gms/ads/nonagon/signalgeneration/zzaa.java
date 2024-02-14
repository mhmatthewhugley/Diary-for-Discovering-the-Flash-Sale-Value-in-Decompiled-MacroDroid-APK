package com.google.android.gms.ads.nonagon.signalgeneration;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzape;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcfd;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzcom;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import com.google.android.gms.internal.ads.zzffb;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzftm;
import com.google.android.gms.internal.ads.zzfyx;
import com.google.android.gms.internal.ads.zzfzg;
import com.google.android.gms.internal.ads.zzfzp;
import com.google.android.gms.internal.ads.zzfzq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaa extends zzcff {

    /* renamed from: T */
    protected static final List f2470T = new ArrayList(Arrays.asList(new String[]{"/aclk", "/pcs/click", "/dbm/clk"}));

    /* renamed from: U */
    protected static final List f2471U = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com"}));

    /* renamed from: V */
    protected static final List f2472V = new ArrayList(Arrays.asList(new String[]{"/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"}));

    /* renamed from: W */
    protected static final List f2473W = new ArrayList(Arrays.asList(new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"}));

    /* renamed from: X */
    public static final /* synthetic */ int f2474X = 0;

    /* renamed from: A */
    private Point f2475A = new Point();

    /* renamed from: B */
    private final Set f2476B = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: C */
    private final zzc f2477C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final zzdxv f2478D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final zzfkm f2479E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final boolean f2480F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final boolean f2481G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final boolean f2482H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final boolean f2483I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public final String f2484J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final String f2485K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final AtomicInteger f2486L = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final zzcgv f2487M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public String f2488N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final String f2489O;

    /* renamed from: P */
    private final List f2490P;

    /* renamed from: Q */
    private final List f2491Q;

    /* renamed from: R */
    private final List f2492R;

    /* renamed from: S */
    private final List f2493S;

    /* renamed from: a */
    private final zzcom f2494a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Context f2495c;

    /* renamed from: d */
    private final zzape f2496d;

    /* renamed from: f */
    private final zzffb f2497f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzdxl f2498g = null;

    /* renamed from: o */
    private final zzfzq f2499o;

    /* renamed from: p */
    private final ScheduledExecutorService f2500p;
    @Nullable

    /* renamed from: s */
    private zzcaa f2501s;

    /* renamed from: z */
    private Point f2502z = new Point();

    public zzaa(zzcom zzcom, Context context, zzape zzape, zzffb zzffb, zzfzq zzfzq, ScheduledExecutorService scheduledExecutorService, zzdxv zzdxv, zzfkm zzfkm, zzcgv zzcgv) {
        List list;
        this.f2494a = zzcom;
        this.f2495c = context;
        this.f2496d = zzape;
        this.f2497f = zzffb;
        this.f2499o = zzfzq;
        this.f2500p = scheduledExecutorService;
        this.f2477C = zzcom.mo44207q();
        this.f2478D = zzdxv;
        this.f2479E = zzfkm;
        this.f2487M = zzcgv;
        this.f2480F = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27228q6)).booleanValue();
        this.f2481G = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27218p6)).booleanValue();
        this.f2482H = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27238r6)).booleanValue();
        this.f2483I = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27258t6)).booleanValue();
        this.f2484J = (String) zzay.m1924c().mo42663b(zzbjc.f27248s6);
        this.f2485K = (String) zzay.m1924c().mo42663b(zzbjc.f27268u6);
        this.f2489O = (String) zzay.m1924c().mo42663b(zzbjc.f27278v6);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27288w6)).booleanValue()) {
            this.f2490P = m3008hc((String) zzay.m1924c().mo42663b(zzbjc.f27298x6));
            this.f2491Q = m3008hc((String) zzay.m1924c().mo42663b(zzbjc.f27308y6));
            this.f2492R = m3008hc((String) zzay.m1924c().mo42663b(zzbjc.f27318z6));
            list = m3008hc((String) zzay.m1924c().mo42663b(zzbjc.f26813A6));
        } else {
            this.f2490P = f2470T;
            this.f2491Q = f2471U;
            this.f2492R = f2472V;
            list = f2473W;
        }
        this.f2493S = list;
    }

    /* renamed from: Pb */
    static /* bridge */ /* synthetic */ void m2994Pb(zzaa zzaa, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaa.mo20657Xb((Uri) it.next())) {
                zzaa.f2486L.getAndIncrement();
                return;
            }
        }
    }

    /* renamed from: Qb */
    static /* bridge */ /* synthetic */ void m2995Qb(zzaa zzaa, String str, String str2, zzdxl zzdxl) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27068a6)).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27128g6)).booleanValue()) {
                zzchc.f28456a.execute(new zzi(zzaa, str, str2, zzdxl));
            } else {
                zzaa.f2477C.mo20682d(str, str2, zzdxl);
            }
        }
    }

    /* renamed from: Zb */
    static final /* synthetic */ Uri m3000Zb(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? m3007gc(uri, "nas", str) : uri;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: ac */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzh m3001ac(android.content.Context r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.ads.internal.client.zzq r12, com.google.android.gms.ads.internal.client.zzl r13) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzfed r0 = new com.google.android.gms.internal.ads.zzfed
            r0.<init>()
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26833C6
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r2 = r2.mo42663b(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            java.lang.String r4 = "REWARDED"
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L_0x0038
            boolean r2 = r4.equals(r11)
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzfdq r2 = r0.mo45602F()
            r2.mo45601a(r6)
            goto L_0x0038
        L_0x002b:
            boolean r2 = r3.equals(r11)
            if (r2 == 0) goto L_0x0038
            com.google.android.gms.internal.ads.zzfdq r2 = r0.mo45602F()
            r2.mo45601a(r5)
        L_0x0038:
            com.google.android.gms.internal.ads.zzcom r2 = r8.f2494a
            com.google.android.gms.ads.nonagon.signalgeneration.zzg r2 = r2.mo44208r()
            com.google.android.gms.internal.ads.zzdck r7 = new com.google.android.gms.internal.ads.zzdck
            r7.<init>()
            r7.mo44554c(r9)
            if (r10 != 0) goto L_0x004a
            java.lang.String r10 = "adUnitId"
        L_0x004a:
            r0.mo45606J(r10)
            if (r13 != 0) goto L_0x0058
            com.google.android.gms.ads.internal.client.zzm r10 = new com.google.android.gms.ads.internal.client.zzm
            r10.<init>()
            com.google.android.gms.ads.internal.client.zzl r13 = r10.mo20149a()
        L_0x0058:
            r0.mo45618e(r13)
            r10 = 1
            if (r12 != 0) goto L_0x00c0
            com.google.android.gms.internal.ads.zzbja r12 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r12 = r12.mo42663b(r1)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L_0x0074
            com.google.android.gms.ads.internal.client.zzq r12 = new com.google.android.gms.ads.internal.client.zzq
            r12.<init>()
            goto L_0x00c0
        L_0x0074:
            int r12 = r11.hashCode()
            switch(r12) {
                case -1999289321: goto L_0x0096;
                case 543046670: goto L_0x008e;
                case 1854800829: goto L_0x0086;
                case 1951953708: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x00a0
        L_0x007c:
            java.lang.String r12 = "BANNER"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00a0
            r12 = 0
            goto L_0x00a1
        L_0x0086:
            boolean r12 = r11.equals(r3)
            if (r12 == 0) goto L_0x00a0
            r12 = 2
            goto L_0x00a1
        L_0x008e:
            boolean r12 = r11.equals(r4)
            if (r12 == 0) goto L_0x00a0
            r12 = 1
            goto L_0x00a1
        L_0x0096:
            java.lang.String r12 = "NATIVE"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00a0
            r12 = 3
            goto L_0x00a1
        L_0x00a0:
            r12 = -1
        L_0x00a1:
            if (r12 == 0) goto L_0x00b9
            if (r12 == r10) goto L_0x00b4
            if (r12 == r6) goto L_0x00b4
            if (r12 == r5) goto L_0x00af
            com.google.android.gms.ads.internal.client.zzq r12 = new com.google.android.gms.ads.internal.client.zzq
            r12.<init>()
            goto L_0x00c0
        L_0x00af:
            com.google.android.gms.ads.internal.client.zzq r12 = com.google.android.gms.ads.internal.client.zzq.m2419n2()
            goto L_0x00c0
        L_0x00b4:
            com.google.android.gms.ads.internal.client.zzq r12 = com.google.android.gms.ads.internal.client.zzq.m2420o2()
            goto L_0x00c0
        L_0x00b9:
            com.google.android.gms.ads.internal.client.zzq r12 = new com.google.android.gms.ads.internal.client.zzq
            com.google.android.gms.ads.AdSize r13 = com.google.android.gms.ads.AdSize.f1675i
            r12.<init>((android.content.Context) r9, (com.google.android.gms.ads.AdSize) r13)
        L_0x00c0:
            r0.mo45605I(r12)
            r0.mo45611O(r10)
            com.google.android.gms.internal.ads.zzfef r9 = r0.mo45620g()
            r7.mo44557f(r9)
            com.google.android.gms.internal.ads.zzdcm r9 = r7.mo44558g()
            r2.mo20688c(r9)
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r9 = new com.google.android.gms.ads.nonagon.signalgeneration.zzac
            r9.<init>()
            r9.mo20670a(r11)
            com.google.android.gms.ads.nonagon.signalgeneration.zzae r10 = new com.google.android.gms.ads.nonagon.signalgeneration.zzae
            r11 = 0
            r10.<init>(r9, r11)
            r2.mo20687b(r10)
            com.google.android.gms.internal.ads.zzdik r9 = new com.google.android.gms.internal.ads.zzdik
            r9.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzh r9 = r2.mo20686a()
            com.google.android.gms.internal.ads.zzdxl r10 = r9.mo20689a()
            r8.f2498g = r10
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaa.m3001ac(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzq, com.google.android.gms.ads.internal.client.zzl):com.google.android.gms.ads.nonagon.signalgeneration.zzh");
    }

    /* renamed from: bc */
    private final zzfzp m3002bc(String str) {
        zzdtn[] zzdtnArr = new zzdtn[1];
        zzfzp n = zzfzg.m51419n(this.f2497f.mo45671a(), new zzk(this, zzdtnArr, str), this.f2499o);
        n.mo43580q(new zzl(this, zzdtnArr), this.f2499o);
        return zzfzg.m51411f(zzfzg.m51418m((zzfyx) zzfzg.m51420o(zzfyx.m51389C(n), (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f26873G6)).intValue(), TimeUnit.MILLISECONDS, this.f2500p), zzv.f2573a, this.f2499o), Exception.class, zzj.f2551a, this.f2499o);
    }

    /* renamed from: cc */
    private final void m3003cc(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzr, boolean z) {
        zzfzp zzfzp;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26863F6)).booleanValue()) {
            zzcgp.m45229g("The updating URL feature is not enabled.");
            try {
                zzbzr.mo43233z("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzcgp.m45227e("", e);
            }
        } else {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (mo20657Xb((Uri) it.next())) {
                    i++;
                }
            }
            if (i > 1) {
                zzcgp.m45229g("Multiple google urls found: ".concat(String.valueOf(list)));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Uri uri = (Uri) it2.next();
                if (!mo20657Xb(uri)) {
                    zzcgp.m45229g("Not a Google URL: ".concat(String.valueOf(uri)));
                    zzfzp = zzfzg.m51414i(uri);
                } else {
                    zzfzp = this.f2499o.mo46579F(new zzq(this, uri, iObjectWrapper));
                    if (m3006fc()) {
                        zzfzp = zzfzg.m51419n(zzfzp, new zzr(this), this.f2499o);
                    } else {
                        zzcgp.m45228f("Asset view map is empty.");
                    }
                }
                arrayList.add(zzfzp);
            }
            zzfzg.m51423r(zzfzg.m51410e(arrayList), new zzy(this, zzbzr, z), this.f2494a.mo44194b());
        }
    }

    /* renamed from: dc */
    private final void m3004dc(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzr, boolean z) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26863F6)).booleanValue()) {
            try {
                zzbzr.mo43233z("The updating URL feature is not enabled.");
            } catch (RemoteException e) {
                zzcgp.m45227e("", e);
            }
        } else {
            zzfzp F = this.f2499o.mo46579F(new zzs(this, list, iObjectWrapper));
            if (m3006fc()) {
                F = zzfzg.m51419n(F, new zzt(this), this.f2499o);
            } else {
                zzcgp.m45228f("Asset view map is empty.");
            }
            zzfzg.m51423r(F, new zzx(this, zzbzr, z), this.f2494a.mo44194b());
        }
    }

    /* renamed from: ec */
    private static boolean m3005ec(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (!(host == null || path == null)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f28040c;
     */
    /* renamed from: fc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m3006fc() {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.zzcaa r0 = r1.f2501s
            if (r0 == 0) goto L_0x0010
            java.util.Map r0 = r0.f28040c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzaa.m3006fc():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: gc */
    public static final Uri m3007gc(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = indexOf + 1;
        return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
    }

    /* renamed from: hc */
    private static final List m3008hc(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzftm.m50973d(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: pc */
    static /* bridge */ /* synthetic */ zzfju m3014pc(zzfzp zzfzp, zzcfk zzcfk) {
        String str;
        if (!zzfjw.m50333a() || !((Boolean) zzbkl.f27410e.mo42728e()).booleanValue()) {
            return null;
        }
        try {
            zzfju b = ((zzh) zzfzg.m51421p(zzfzp)).mo20690b();
            b.mo45825d(new ArrayList(Collections.singletonList(zzcfk.f28348c)));
            zzl zzl = zzcfk.f28350f;
            if (zzl == null) {
                str = "";
            } else {
                str = zzl.f1988G;
            }
            b.mo45823b(str);
            return b;
        } catch (ExecutionException e) {
            zzt.m2904q().mo43503t(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Lb */
    public final /* synthetic */ ArrayList mo20650Lb(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!mo20658Yb(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(m3007gc(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Mb */
    public final /* synthetic */ ArrayList mo20651Mb(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String g = this.f2496d.mo41776c() != null ? this.f2496d.mo41776c().mo20433g(this.f2495c, (View) ObjectWrapper.m5050A1(iObjectWrapper), (Activity) null) : "";
        if (!TextUtils.isEmpty(g)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!mo20658Yb(uri)) {
                    zzcgp.m45229g("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(m3007gc(uri, "ms", g));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Rb */
    public final /* synthetic */ void mo20652Rb(zzdtn[] zzdtnArr) {
        zzdtn zzdtn = zzdtnArr[0];
        if (zzdtn != null) {
            this.f2497f.mo45672b(zzfzg.m51414i(zzdtn));
        }
    }

    /* renamed from: S5 */
    public final void mo20653S5(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzr) {
        m3003cc(list, iObjectWrapper, zzbzr, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Sb */
    public final /* synthetic */ void mo20654Sb(String str, String str2, zzdxl zzdxl) {
        this.f2477C.mo20682d(str, str2, zzdxl);
    }

    /* renamed from: U4 */
    public final void mo20655U4(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzr) {
        m3003cc(list, iObjectWrapper, zzbzr, false);
    }

    /* renamed from: U8 */
    public final void mo20656U8(zzcaa zzcaa) {
        this.f2501s = zzcaa;
        this.f2497f.mo45673c(1);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: Xb */
    public final boolean mo20657Xb(@NonNull Uri uri) {
        return m3005ec(uri, this.f2490P, this.f2491Q);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: Yb */
    public final boolean mo20658Yb(@NonNull Uri uri) {
        return m3005ec(uri, this.f2492R, this.f2493S);
    }

    /* renamed from: i0 */
    public final void mo20659i0(IObjectWrapper iObjectWrapper) {
        View view;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26863F6)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.m5050A1(iObjectWrapper);
            zzcaa zzcaa = this.f2501s;
            if (zzcaa == null) {
                view = null;
            } else {
                view = zzcaa.f28039a;
            }
            this.f2502z = zzbx.m2608a(motionEvent, view);
            if (motionEvent.getAction() == 0) {
                this.f2475A = this.f2502z;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            Point point = this.f2502z;
            obtain.setLocation((float) point.x, (float) point.y);
            this.f2496d.mo41777d(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kc */
    public final /* synthetic */ Uri mo20660kc(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.f2496d.mo41774a(uri, this.f2495c, (View) ObjectWrapper.m5050A1(iObjectWrapper), (Activity) null);
        } catch (zzapf e) {
            zzcgp.m45230h("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oc */
    public final /* synthetic */ zzh mo20661oc(zzcfk zzcfk) throws Exception {
        return m3001ac(this.f2495c, zzcfk.f28347a, zzcfk.f28348c, zzcfk.f28349d, zzcfk.f28350f);
    }

    /* renamed from: p8 */
    public final void mo20662p8(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzr) {
        m3004dc(list, iObjectWrapper, zzbzr, false);
    }

    /* renamed from: q5 */
    public final void mo20663q5(IObjectWrapper iObjectWrapper, zzcfk zzcfk, zzcfd zzcfd) {
        zzfzp zzfzp;
        zzfzp zzfzp2;
        zzcfk zzcfk2 = zzcfk;
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        this.f2495c = context;
        zzfjj a = zzfji.m50258a(context, 22);
        a.mo45794c();
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26885H8)).booleanValue()) {
            zzfzq zzfzq = zzchc.f28456a;
            zzfzp = zzfzq.mo46579F(new zzo(this, zzcfk));
            zzfzp2 = zzfzg.m51419n(zzfzp, zzp.f2563a, zzfzq);
        } else {
            zzh ac = m3001ac(this.f2495c, zzcfk2.f28347a, zzcfk2.f28348c, zzcfk2.f28349d, zzcfk2.f28350f);
            zzfzp = zzfzg.m51414i(ac);
            zzfzp2 = ac.mo20691c();
        }
        zzfzg.m51423r(zzfzp2, new zzw(this, zzfzp, zzcfk, zzcfd, a, zzt.m2889b().mo21950a()), this.f2494a.mo44194b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: sc */
    public final /* synthetic */ zzfzp mo20664sc() throws Exception {
        return m3001ac(this.f2495c, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).mo20691c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: tc */
    public final /* synthetic */ zzfzp mo20665tc(zzdtn[] zzdtnArr, String str, zzdtn zzdtn) throws Exception {
        zzdtnArr[0] = zzdtn;
        Context context = this.f2495c;
        zzcaa zzcaa = this.f2501s;
        Map map = zzcaa.f28040c;
        JSONObject d = zzbx.m2611d(context, map, map, zzcaa.f28039a);
        JSONObject g = zzbx.m2614g(this.f2495c, this.f2501s.f28039a);
        JSONObject f = zzbx.m2613f(this.f2501s.f28039a);
        JSONObject e = zzbx.m2612e(this.f2495c, this.f2501s.f28039a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", d);
        jSONObject.put("ad_view_signal", g);
        jSONObject.put("scroll_view_signal", f);
        jSONObject.put("lock_screen_signal", e);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.m2610c((String) null, this.f2495c, this.f2475A, this.f2502z));
        }
        return zzdtn.mo44975d(str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: uc */
    public final /* synthetic */ zzfzp mo20666uc(ArrayList arrayList) throws Exception {
        return zzfzg.m51418m(m3002bc("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzn(this, arrayList), this.f2499o);
    }

    /* renamed from: x6 */
    public final void mo20667x6(List list, IObjectWrapper iObjectWrapper, zzbzr zzbzr) {
        m3004dc(list, iObjectWrapper, zzbzr, true);
    }

    /* renamed from: y0 */
    public final void mo20668y0(IObjectWrapper iObjectWrapper) {
        zzfzp zzfzp;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27080b8)).booleanValue()) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27090c8)).booleanValue()) {
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26885H8)).booleanValue()) {
                    zzfzp = zzfzg.m51417l(new zzu(this), zzchc.f28456a);
                } else {
                    zzfzp = m3001ac(this.f2495c, (String) null, AdFormat.BANNER.name(), (zzq) null, (zzl) null).mo20691c();
                }
                zzfzg.m51423r(zzfzp, new zzz(this), this.f2494a.mo44194b());
            }
            WebView webView = (WebView) ObjectWrapper.m5050A1(iObjectWrapper);
            if (webView == null) {
                zzcgp.m45226d("The webView cannot be null.");
            } else if (this.f2476B.contains(webView)) {
                zzcgp.m45228f("This webview has already been registered.");
            } else {
                this.f2476B.add(webView);
                webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.f2496d, this.f2478D), "gmaSdk");
            }
        }
    }
}
