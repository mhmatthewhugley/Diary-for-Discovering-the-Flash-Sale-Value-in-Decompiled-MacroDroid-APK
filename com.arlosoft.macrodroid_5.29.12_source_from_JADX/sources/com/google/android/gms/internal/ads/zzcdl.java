package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcdl implements zzcdq {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final List f28235m = Collections.synchronizedList(new ArrayList());

    /* renamed from: n */
    public static final /* synthetic */ int f28236n = 0;

    /* renamed from: a */
    private final zzguz f28237a;

    /* renamed from: b */
    private final LinkedHashMap f28238b;

    /* renamed from: c */
    private final List f28239c = new ArrayList();

    /* renamed from: d */
    private final List f28240d = new ArrayList();

    /* renamed from: e */
    private final Context f28241e;
    @VisibleForTesting

    /* renamed from: f */
    boolean f28242f;

    /* renamed from: g */
    private final zzcdn f28243g;

    /* renamed from: h */
    private final Object f28244h = new Object();

    /* renamed from: i */
    private HashSet f28245i = new HashSet();

    /* renamed from: j */
    private boolean f28246j = false;

    /* renamed from: k */
    private boolean f28247k = false;

    /* renamed from: l */
    private final zzcdm f28248l;

    public zzcdl(Context context, zzcgv zzcgv, zzcdn zzcdn, String str, zzcdm zzcdm, byte[] bArr) {
        Preconditions.m4489l(zzcdn, "SafeBrowsing config is not present.");
        this.f28241e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f28238b = new LinkedHashMap();
        this.f28248l = zzcdm;
        this.f28243g = zzcdn;
        for (String lowerCase : zzcdn.f28253g) {
            this.f28245i.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f28245i.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzguz F = zzgwe.m53588F();
        F.mo47543J(9);
        F.mo47539D(str);
        F.mo47537B(str);
        zzgva F2 = zzgvb.m53513F();
        String str2 = this.f28243g.f28249a;
        if (str2 != null) {
            F2.mo47555n(str2);
        }
        F.mo47536A((zzgvb) F2.mo47341h());
        zzgvz F3 = zzgwa.m53579F();
        F3.mo47571u(Wrappers.m4929a(this.f28241e).mo21964g());
        String str3 = zzcgv.f28446a;
        if (str3 != null) {
            F3.mo47569n(str3);
        }
        long b = (long) GoogleApiAvailabilityLight.m3542h().mo21171b(this.f28241e);
        if (b > 0) {
            F3.mo47570o(b);
        }
        F.mo47549y((zzgwa) F3.mo47341h());
        this.f28237a = F;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43393a(java.lang.String r7, java.util.Map r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f28244h
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.f28247k = r2     // Catch:{ all -> 0x00b7 }
        L_0x0009:
            java.util.LinkedHashMap r2 = r6.f28238b     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0024
            if (r9 != r1) goto L_0x0022
            java.util.LinkedHashMap r8 = r6.f28238b     // Catch:{ all -> 0x00b7 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgvx r7 = (com.google.android.gms.internal.ads.zzgvx) r7     // Catch:{ all -> 0x00b7 }
            int r8 = com.google.android.gms.internal.ads.zzgvw.m53551a(r1)     // Catch:{ all -> 0x00b7 }
            r7.mo47566x(r8)     // Catch:{ all -> 0x00b7 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x0024:
            com.google.android.gms.internal.ads.zzgvx r1 = com.google.android.gms.internal.ads.zzgvy.m53557G()     // Catch:{ all -> 0x00b7 }
            int r9 = com.google.android.gms.internal.ads.zzgvw.m53551a(r9)     // Catch:{ all -> 0x00b7 }
            if (r9 == 0) goto L_0x0031
            r1.mo47566x(r9)     // Catch:{ all -> 0x00b7 }
        L_0x0031:
            java.util.LinkedHashMap r9 = r6.f28238b     // Catch:{ all -> 0x00b7 }
            int r9 = r9.size()     // Catch:{ all -> 0x00b7 }
            r1.mo47563o(r9)     // Catch:{ all -> 0x00b7 }
            r1.mo47565v(r7)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgvi r9 = com.google.android.gms.internal.ads.zzgvl.m53531F()     // Catch:{ all -> 0x00b7 }
            java.util.HashSet r2 = r6.f28245i     // Catch:{ all -> 0x00b7 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b7 }
            if (r2 != 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a7
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00b7 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00b7 }
        L_0x0053:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00b7 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00b7 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b7 }
            goto L_0x006e
        L_0x006c:
            java.lang.String r3 = ""
        L_0x006e:
            java.lang.Object r4 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x007b
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00b7 }
            goto L_0x007d
        L_0x007b:
            java.lang.String r2 = ""
        L_0x007d:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b7 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x00b7 }
            java.util.HashSet r5 = r6.f28245i     // Catch:{ all -> 0x00b7 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x00b7 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.internal.ads.zzgvg r4 = com.google.android.gms.internal.ads.zzgvh.m53523F()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgpw r3 = com.google.android.gms.internal.ads.zzgpw.m52566V(r3)     // Catch:{ all -> 0x00b7 }
            r4.mo47556n(r3)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgpw r2 = com.google.android.gms.internal.ads.zzgpw.m52566V(r2)     // Catch:{ all -> 0x00b7 }
            r4.mo47557o(r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgre r2 = r4.mo47341h()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgvh r2 = (com.google.android.gms.internal.ads.zzgvh) r2     // Catch:{ all -> 0x00b7 }
            r9.mo47558n(r2)     // Catch:{ all -> 0x00b7 }
            goto L_0x0053
        L_0x00a7:
            com.google.android.gms.internal.ads.zzgre r8 = r9.mo47341h()     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.ads.zzgvl r8 = (com.google.android.gms.internal.ads.zzgvl) r8     // Catch:{ all -> 0x00b7 }
            r1.mo47564u(r8)     // Catch:{ all -> 0x00b7 }
            java.util.LinkedHashMap r8 = r6.f28238b     // Catch:{ all -> 0x00b7 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00b7 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            return
        L_0x00b7:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b7 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdl.mo43393a(java.lang.String, java.util.Map, int):void");
    }

    /* renamed from: b */
    public final void mo43394b() {
        synchronized (this.f28244h) {
            this.f28238b.keySet();
            zzfzp i = zzfzg.m51414i(Collections.emptyMap());
            zzcdi zzcdi = new zzcdi(this);
            zzfzq zzfzq = zzchc.f28461f;
            zzfzp n = zzfzg.m51419n(i, zzcdi, zzfzq);
            zzfzp o = zzfzg.m51420o(n, 10, TimeUnit.SECONDS, zzchc.f28459d);
            zzfzg.m51423r(n, new zzcdk(this, o), zzfzq);
            f28235m.add(o);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036 A[SYNTHETIC, Splitter:B:20:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43395c(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcdn r0 = r7.f28243g
            boolean r0 = r0.f28251d
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r7.f28246j
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            com.google.android.gms.ads.internal.zzt.m2905r()
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0014
            goto L_0x006d
        L_0x0014:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch:{ RuntimeException -> 0x002d }
            r8.setDrawingCacheEnabled(r0)     // Catch:{ RuntimeException -> 0x002d }
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch:{ RuntimeException -> 0x002d }
            if (r3 == 0) goto L_0x0026
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch:{ RuntimeException -> 0x002d }
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r8.setDrawingCacheEnabled(r2)     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r2 = move-exception
            goto L_0x002f
        L_0x002d:
            r2 = move-exception
            r3 = r1
        L_0x002f:
            java.lang.String r4 = "Fail to capture the web view"
            com.google.android.gms.internal.ads.zzcgp.m45227e(r4, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x006c
            int r2 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r3 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            if (r2 == 0) goto L_0x005f
            if (r3 != 0) goto L_0x0043
            goto L_0x005f
        L_0x0043:
            int r4 = r8.getWidth()     // Catch:{ RuntimeException -> 0x0065 }
            int r5 = r8.getHeight()     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch:{ RuntimeException -> 0x0065 }
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch:{ RuntimeException -> 0x0065 }
            r5.<init>(r4)     // Catch:{ RuntimeException -> 0x0065 }
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch:{ RuntimeException -> 0x0065 }
            r8.draw(r5)     // Catch:{ RuntimeException -> 0x0065 }
            r1 = r4
            goto L_0x006d
        L_0x005f:
            java.lang.String r8 = "Width or height of view is zero"
            com.google.android.gms.internal.ads.zzcgp.m45229g(r8)     // Catch:{ RuntimeException -> 0x0065 }
            goto L_0x006d
        L_0x0065:
            r8 = move-exception
            java.lang.String r2 = "Fail to capture the webview"
            com.google.android.gms.internal.ads.zzcgp.m45227e(r2, r8)
            goto L_0x006d
        L_0x006c:
            r1 = r3
        L_0x006d:
            if (r1 != 0) goto L_0x0075
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzcdp.m44981a(r8)
            return
        L_0x0075:
            r7.f28246j = r0
            com.google.android.gms.internal.ads.zzcdj r8 = new com.google.android.gms.internal.ads.zzcdj
            r8.<init>(r7, r1)
            com.google.android.gms.ads.internal.util.zzs.m2734C(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdl.mo43395c(android.view.View):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ zzfzp mo43396d(Map map) throws Exception {
        zzfzp m;
        zzgvx zzgvx;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f28244h) {
                            int length = optJSONArray.length();
                            synchronized (this.f28244h) {
                                zzgvx = (zzgvx) this.f28238b.get(str);
                            }
                            if (zzgvx == null) {
                                zzcdp.m44981a("Cannot find the corresponding resource object for " + str);
                            } else {
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    zzgvx.mo47562n(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                boolean z2 = this.f28242f;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f28242f = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbkz.f27482b.mo42728e()).booleanValue()) {
                    zzcgp.m45225c("Failed to get SafeBrowsing metadata", e);
                }
                return zzfzg.m51413h(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f28242f) {
            synchronized (this.f28244h) {
                this.f28237a.mo47543J(10);
            }
        }
        boolean z3 = this.f28242f;
        if ((!z3 || !this.f28243g.f28255p) && ((!this.f28247k || !this.f28243g.f28254o) && (z3 || !this.f28243g.f28252f))) {
            return zzfzg.m51414i((Object) null);
        }
        synchronized (this.f28244h) {
            for (zzgvx h : this.f28238b.values()) {
                this.f28237a.mo47546u((zzgvy) h.mo47341h());
            }
            this.f28237a.mo47544n(this.f28239c);
            this.f28237a.mo47545o(this.f28240d);
            if (zzcdp.m44982b()) {
                String G = this.f28237a.mo47541G();
                String E = this.f28237a.mo47540E();
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + G + "\n  clickUrl: " + E + "\n  resources: \n");
                for (zzgvy zzgvy : this.f28237a.mo47542H()) {
                    sb.append("    [");
                    sb.append(zzgvy.mo47567F());
                    sb.append("] ");
                    sb.append(zzgvy.mo47568I());
                }
                zzcdp.m44981a(sb.toString());
            }
            byte[] p = ((zzgwe) this.f28237a.mo47341h()).mo47050p();
            zzfzp b = new zzbo(this.f28241e).mo20332b(1, this.f28243g.f28250c, (Map) null, p);
            if (zzcdp.m44982b()) {
                b.mo43580q(zzcdg.f28229a, zzchc.f28456a);
            }
            m = zzfzg.m51418m(b, zzcdh.f28230a, zzchc.f28461f);
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo43397f(Bitmap bitmap) {
        zzgpt P = zzgpw.m52562P();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, P);
        synchronized (this.f28244h) {
            zzguz zzguz = this.f28237a;
            zzgvq F = zzgvs.m53543F();
            F.mo47559n(P.mo47098c());
            F.mo47560o("image/png");
            F.mo47561u(2);
            zzguz.mo47538C((zzgvs) F.mo47341h());
        }
    }

    /* renamed from: g */
    public final boolean mo43398g() {
        return PlatformVersion.m4899d() && this.f28243g.f28251d && !this.f28246j;
    }

    /* renamed from: w0 */
    public final void mo43399w0(String str) {
        synchronized (this.f28244h) {
            if (str == null) {
                this.f28237a.mo47547v();
            } else {
                this.f28237a.mo47548x(str);
            }
        }
    }

    public final zzcdn zza() {
        return this.f28243g;
    }
}
