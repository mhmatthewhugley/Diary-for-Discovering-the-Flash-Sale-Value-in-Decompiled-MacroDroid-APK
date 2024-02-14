package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzcfs;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzfzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzj implements zzg {

    /* renamed from: A */
    private boolean f2264A = false;

    /* renamed from: B */
    private String f2265B = "";

    /* renamed from: C */
    private int f2266C = -1;

    /* renamed from: D */
    private int f2267D = -1;

    /* renamed from: E */
    private long f2268E = 0;

    /* renamed from: a */
    private final Object f2269a = new Object();

    /* renamed from: b */
    private boolean f2270b;

    /* renamed from: c */
    private final List f2271c = new ArrayList();

    /* renamed from: d */
    private zzfzp f2272d;
    @Nullable

    /* renamed from: e */
    private zzbcp f2273e = null;
    @Nullable

    /* renamed from: f */
    private SharedPreferences f2274f;
    @Nullable

    /* renamed from: g */
    private SharedPreferences.Editor f2275g;

    /* renamed from: h */
    private boolean f2276h = true;
    @Nullable

    /* renamed from: i */
    private String f2277i;
    @Nullable

    /* renamed from: j */
    private String f2278j;

    /* renamed from: k */
    private boolean f2279k = true;

    /* renamed from: l */
    private String f2280l = "-1";

    /* renamed from: m */
    private String f2281m = "-1";

    /* renamed from: n */
    private String f2282n = "-1";

    /* renamed from: o */
    private int f2283o = -1;

    /* renamed from: p */
    private zzcfs f2284p = new zzcfs("", 0);

    /* renamed from: q */
    private long f2285q = 0;

    /* renamed from: r */
    private long f2286r = 0;

    /* renamed from: s */
    private int f2287s = -1;

    /* renamed from: t */
    private int f2288t = 0;

    /* renamed from: u */
    private Set f2289u = Collections.emptySet();

    /* renamed from: v */
    private JSONObject f2290v = new JSONObject();

    /* renamed from: w */
    private boolean f2291w = true;

    /* renamed from: x */
    private boolean f2292x = true;

    /* renamed from: y */
    private String f2293y = null;

    /* renamed from: z */
    private String f2294z = "";

    /* renamed from: o */
    private final void m2689o() {
        zzfzp zzfzp = this.f2272d;
        if (zzfzp != null && !zzfzp.isDone()) {
            try {
                this.f2272d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                zzcgp.m45230h("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                zzcgp.m45227e("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    /* renamed from: q */
    private final void m2690q() {
        zzchc.f28456a.execute(new zzi(this));
    }

    /* renamed from: M */
    public final boolean mo20354M() {
        boolean z;
        m2689o();
        synchronized (this.f2269a) {
            z = this.f2292x;
        }
        return z;
    }

    /* renamed from: T */
    public final boolean mo20355T() {
        boolean z;
        m2689o();
        synchronized (this.f2269a) {
            z = this.f2291w;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004c  */
    @androidx.annotation.Nullable
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo20356Z(@androidx.annotation.NonNull java.lang.String r6) {
        /*
            r5 = this;
            r5.m2689o()
            java.lang.Object r0 = r5.f2269a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x0050 }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x003a
            r6 = 2
            goto L_0x003b
        L_0x003a:
            r6 = -1
        L_0x003b:
            if (r6 == 0) goto L_0x004c
            if (r6 == r4) goto L_0x0048
            if (r6 == r3) goto L_0x0044
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            r6 = 0
            return r6
        L_0x0044:
            java.lang.String r6 = r5.f2282n     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0048:
            java.lang.String r6 = r5.f2281m     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x004c:
            java.lang.String r6 = r5.f2280l     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r6
        L_0x0050:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.mo20356Z(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final int mo20357a() {
        int i;
        m2689o();
        synchronized (this.f2269a) {
            i = this.f2287s;
        }
        return i;
    }

    /* renamed from: a0 */
    public final boolean mo20358a0() {
        boolean z;
        m2689o();
        synchronized (this.f2269a) {
            z = this.f2264A;
        }
        return z;
    }

    /* renamed from: b */
    public final long mo20359b() {
        long j;
        m2689o();
        synchronized (this.f2269a) {
            j = this.f2286r;
        }
        return j;
    }

    /* renamed from: b0 */
    public final void mo20360b0(int i) {
        m2689o();
        synchronized (this.f2269a) {
            this.f2283o = i;
            SharedPreferences.Editor editor = this.f2275g;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.f2275g.apply();
            }
            m2690q();
        }
    }

    /* renamed from: c */
    public final long mo20361c() {
        long j;
        m2689o();
        synchronized (this.f2269a) {
            j = this.f2268E;
        }
        return j;
    }

    /* renamed from: c0 */
    public final void mo20362c0(boolean z) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue()) {
            m2689o();
            synchronized (this.f2269a) {
                if (this.f2264A != z) {
                    this.f2264A = z;
                    SharedPreferences.Editor editor = this.f2275g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.f2275g.apply();
                    }
                    m2690q();
                }
            }
        }
    }

    /* renamed from: d */
    public final long mo20363d() {
        long j;
        m2689o();
        synchronized (this.f2269a) {
            j = this.f2285q;
        }
        return j;
    }

    /* renamed from: d0 */
    public final void mo20364d0(String str) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue()) {
            m2689o();
            synchronized (this.f2269a) {
                if (!this.f2265B.equals(str)) {
                    this.f2265B = str;
                    SharedPreferences.Editor editor = this.f2275g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f2275g.apply();
                    }
                    m2690q();
                }
            }
        }
    }

    /* renamed from: e */
    public final zzcfs mo20365e() {
        zzcfs zzcfs;
        m2689o();
        synchronized (this.f2269a) {
            zzcfs = this.f2284p;
        }
        return zzcfs;
    }

    /* renamed from: e0 */
    public final boolean mo20366e0() {
        boolean z;
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27232r0)).booleanValue()) {
            return false;
        }
        m2689o();
        synchronized (this.f2269a) {
            z = this.f2279k;
        }
        return z;
    }

    @Nullable
    /* renamed from: f */
    public final zzbcp mo20367f() {
        if (!this.f2270b) {
            return null;
        }
        if ((mo20355T() && mo20354M()) || !((Boolean) zzbkk.f27401b.mo42728e()).booleanValue()) {
            return null;
        }
        synchronized (this.f2269a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f2273e == null) {
                this.f2273e = new zzbcp();
            }
            this.f2273e.mo42472e();
            zzcgp.m45228f("start fetching content...");
            zzbcp zzbcp = this.f2273e;
            return zzbcp;
        }
    }

    /* renamed from: f0 */
    public final void mo20368f0(Runnable runnable) {
        this.f2271c.add(runnable);
    }

    /* renamed from: g */
    public final zzcfs mo20369g() {
        zzcfs zzcfs;
        synchronized (this.f2269a) {
            zzcfs = this.f2284p;
        }
        return zzcfs;
    }

    /* renamed from: g0 */
    public final void mo20370g0(int i) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2288t != i) {
                this.f2288t = i;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    @Nullable
    /* renamed from: h */
    public final String mo20371h() {
        String str;
        m2689o();
        synchronized (this.f2269a) {
            str = this.f2277i;
        }
        return str;
    }

    /* renamed from: h0 */
    public final void mo20372h0(long j) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2285q != j) {
                this.f2285q = j;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    @Nullable
    /* renamed from: i */
    public final String mo20373i() {
        String str;
        m2689o();
        synchronized (this.f2269a) {
            str = this.f2278j;
        }
        return str;
    }

    /* renamed from: i0 */
    public final void mo20374i0(boolean z) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2292x != z) {
                this.f2292x = z;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: j */
    public final String mo20375j() {
        String str;
        m2689o();
        synchronized (this.f2269a) {
            str = this.f2265B;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004f  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20376j0(@androidx.annotation.NonNull java.lang.String r6, @androidx.annotation.NonNull java.lang.String r7) {
        /*
            r5 = this;
            r5.m2689o()
            java.lang.Object r0 = r5.f2269a
            monitor-enter(r0)
            int r1 = r6.hashCode()     // Catch:{ all -> 0x006c }
            r2 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x0030
            r2 = 83641339(0x4fc43fb, float:5.9307345E-36)
            if (r1 == r2) goto L_0x0026
            r2 = 1218895378(0x48a6de12, float:341744.56)
            if (r1 == r2) goto L_0x001c
            goto L_0x003a
        L_0x001c:
            java.lang.String r1 = "IABTCF_TCString"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 1
            goto L_0x003b
        L_0x0026:
            java.lang.String r1 = "IABTCF_gdprApplies"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003b
        L_0x0030:
            java.lang.String r1 = "IABTCF_PurposeConsents"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x003a
            r1 = 2
            goto L_0x003b
        L_0x003a:
            r1 = -1
        L_0x003b:
            if (r1 == 0) goto L_0x0049
            if (r1 == r4) goto L_0x0046
            if (r1 == r3) goto L_0x0043
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x0043:
            r5.f2282n = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0046:
            r5.f2281m = r7     // Catch:{ all -> 0x006c }
            goto L_0x004b
        L_0x0049:
            r5.f2280l = r7     // Catch:{ all -> 0x006c }
        L_0x004b:
            android.content.SharedPreferences$Editor r1 = r5.f2275g     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x0067
            java.lang.String r1 = "-1"
            boolean r1 = r7.equals(r1)     // Catch:{ all -> 0x006c }
            if (r1 == 0) goto L_0x005d
            android.content.SharedPreferences$Editor r7 = r5.f2275g     // Catch:{ all -> 0x006c }
            r7.remove(r6)     // Catch:{ all -> 0x006c }
            goto L_0x0062
        L_0x005d:
            android.content.SharedPreferences$Editor r1 = r5.f2275g     // Catch:{ all -> 0x006c }
            r1.putString(r6, r7)     // Catch:{ all -> 0x006c }
        L_0x0062:
            android.content.SharedPreferences$Editor r6 = r5.f2275g     // Catch:{ all -> 0x006c }
            r6.apply()     // Catch:{ all -> 0x006c }
        L_0x0067:
            r5.m2690q()     // Catch:{ all -> 0x006c }
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            return
        L_0x006c:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006c }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.mo20376j0(java.lang.String, java.lang.String):void");
    }

    /* renamed from: k */
    public final String mo20377k() {
        String str;
        m2689o();
        synchronized (this.f2269a) {
            str = this.f2293y;
        }
        return str;
    }

    /* renamed from: k0 */
    public final void mo20378k0(long j) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2286r != j) {
                this.f2286r = j;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: l */
    public final String mo20379l() {
        String str;
        m2689o();
        synchronized (this.f2269a) {
            str = this.f2294z;
        }
        return str;
    }

    /* renamed from: l0 */
    public final void mo20380l0(boolean z) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2291w != z) {
                this.f2291w = z;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: m */
    public final JSONObject mo20381m() {
        JSONObject jSONObject;
        m2689o();
        synchronized (this.f2269a) {
            jSONObject = this.f2290v;
        }
        return jSONObject;
    }

    /* renamed from: m0 */
    public final void mo20382m0(int i) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2267D != i) {
                this.f2267D = i;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo20398n(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f2269a) {
            this.f2274f = sharedPreferences;
            this.f2275g = edit;
            if (PlatformVersion.m4902g()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.f2276h = this.f2274f.getBoolean("use_https", this.f2276h);
            this.f2291w = this.f2274f.getBoolean("content_url_opted_out", this.f2291w);
            this.f2277i = this.f2274f.getString("content_url_hashes", this.f2277i);
            this.f2279k = this.f2274f.getBoolean("gad_idless", this.f2279k);
            this.f2292x = this.f2274f.getBoolean("content_vertical_opted_out", this.f2292x);
            this.f2278j = this.f2274f.getString("content_vertical_hashes", this.f2278j);
            this.f2288t = this.f2274f.getInt("version_code", this.f2288t);
            this.f2284p = new zzcfs(this.f2274f.getString("app_settings_json", this.f2284p.mo43478c()), this.f2274f.getLong("app_settings_last_update_ms", this.f2284p.mo43476a()));
            this.f2285q = this.f2274f.getLong("app_last_background_time_ms", this.f2285q);
            this.f2287s = this.f2274f.getInt("request_in_session_count", this.f2287s);
            this.f2286r = this.f2274f.getLong("first_ad_req_time_ms", this.f2286r);
            this.f2289u = this.f2274f.getStringSet("never_pool_slots", this.f2289u);
            this.f2293y = this.f2274f.getString("display_cutout", this.f2293y);
            this.f2266C = this.f2274f.getInt("app_measurement_npa", this.f2266C);
            this.f2267D = this.f2274f.getInt("sd_app_measure_npa", this.f2267D);
            this.f2268E = this.f2274f.getLong("sd_app_measure_npa_ts", this.f2268E);
            this.f2294z = this.f2274f.getString("inspector_info", this.f2294z);
            this.f2264A = this.f2274f.getBoolean("linked_device", this.f2264A);
            this.f2265B = this.f2274f.getString("linked_ad_unit", this.f2265B);
            this.f2280l = this.f2274f.getString("IABTCF_gdprApplies", this.f2280l);
            this.f2282n = this.f2274f.getString("IABTCF_PurposeConsents", this.f2282n);
            this.f2281m = this.f2274f.getString("IABTCF_TCString", this.f2281m);
            this.f2283o = this.f2274f.getInt("gad_has_consent_for_cookies", this.f2283o);
            try {
                this.f2290v = new JSONObject(this.f2274f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzcgp.m45230h("Could not convert native advanced settings to json object", e);
            }
            m2690q();
        }
    }

    /* renamed from: n0 */
    public final void mo20383n0(long j) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2268E != j) {
                this.f2268E = j;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: o0 */
    public final void mo20384o0(boolean z) {
        m2689o();
        synchronized (this.f2269a) {
            if (z != this.f2279k) {
                this.f2279k = z;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: p */
    public final void mo20385p() {
        m2689o();
        synchronized (this.f2269a) {
            this.f2290v = new JSONObject();
            SharedPreferences.Editor editor = this.f2275g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f2275g.apply();
            }
            m2690q();
        }
    }

    /* renamed from: p0 */
    public final void mo20386p0(String str) {
        m2689o();
        synchronized (this.f2269a) {
            if (!TextUtils.equals(this.f2293y, str)) {
                this.f2293y = str;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: q0 */
    public final void mo20387q0(@Nullable String str) {
        m2689o();
        synchronized (this.f2269a) {
            if (!str.equals(this.f2277i)) {
                this.f2277i = str;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putString("content_url_hashes", str);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: r0 */
    public final void mo20388r0(String str) {
        m2689o();
        synchronized (this.f2269a) {
            long a = zzt.m2889b().mo21950a();
            if (str != null) {
                if (!str.equals(this.f2284p.mo43478c())) {
                    this.f2284p = new zzcfs(str, a);
                    SharedPreferences.Editor editor = this.f2275g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f2275g.putLong("app_settings_last_update_ms", a);
                        this.f2275g.apply();
                    }
                    m2690q();
                    for (Runnable run : this.f2271c) {
                        run.run();
                    }
                    return;
                }
            }
            this.f2284p.mo43482g(a);
        }
    }

    /* renamed from: s0 */
    public final void mo20389s0(int i) {
        m2689o();
        synchronized (this.f2269a) {
            if (this.f2287s != i) {
                this.f2287s = i;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: t0 */
    public final void mo20390t0(Context context) {
        synchronized (this.f2269a) {
            if (this.f2274f == null) {
                this.f2272d = zzchc.f28456a.mo46580I(new zzh(this, context, "admob"));
                this.f2270b = true;
            }
        }
    }

    /* renamed from: u0 */
    public final void mo20391u0(@Nullable String str) {
        m2689o();
        synchronized (this.f2269a) {
            if (!str.equals(this.f2278j)) {
                this.f2278j = str;
                SharedPreferences.Editor editor = this.f2275g;
                if (editor != null) {
                    editor.putString("content_vertical_hashes", str);
                    this.f2275g.apply();
                }
                m2690q();
            }
        }
    }

    /* renamed from: v0 */
    public final void mo20392v0(String str, String str2, boolean z) {
        m2689o();
        synchronized (this.f2269a) {
            JSONArray optJSONArray = this.f2290v.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (str2.equals(optJSONObject.optString("template_id"))) {
                            if (z) {
                                if (optJSONObject.optBoolean("uses_media_view", false)) {
                                    return;
                                }
                            }
                            length = i;
                        } else {
                            i++;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzt.m2889b().mo21950a());
                optJSONArray.put(length, jSONObject);
                this.f2290v.put(str, optJSONArray);
            } catch (JSONException e) {
                zzcgp.m45230h("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.f2275g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f2290v.toString());
                this.f2275g.apply();
            }
            m2690q();
        }
    }

    /* renamed from: w0 */
    public final void mo20393w0(String str) {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue()) {
            m2689o();
            synchronized (this.f2269a) {
                if (!this.f2294z.equals(str)) {
                    this.f2294z = str;
                    SharedPreferences.Editor editor = this.f2275g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f2275g.apply();
                    }
                    m2690q();
                }
            }
        }
    }

    public final int zza() {
        int i;
        m2689o();
        synchronized (this.f2269a) {
            i = this.f2288t;
        }
        return i;
    }

    public final int zzb() {
        int i;
        m2689o();
        synchronized (this.f2269a) {
            i = this.f2283o;
        }
        return i;
    }
}
