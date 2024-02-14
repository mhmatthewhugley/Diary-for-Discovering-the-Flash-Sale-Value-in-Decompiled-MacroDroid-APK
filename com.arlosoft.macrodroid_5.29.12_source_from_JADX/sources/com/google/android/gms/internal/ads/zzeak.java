package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzeak implements zzebf, zzdzv {

    /* renamed from: a */
    private final zzeas f33548a;

    /* renamed from: b */
    private final zzebg f33549b;

    /* renamed from: c */
    private final zzdzw f33550c;

    /* renamed from: d */
    private final zzeaf f33551d;

    /* renamed from: e */
    private final zzdzu f33552e;

    /* renamed from: f */
    private final zzebe f33553f;

    /* renamed from: g */
    private final String f33554g;

    /* renamed from: h */
    private final String f33555h;

    /* renamed from: i */
    private final Map f33556i = new HashMap();

    /* renamed from: j */
    private final Map f33557j = new HashMap();

    /* renamed from: k */
    private final Map f33558k = new HashMap();

    /* renamed from: l */
    private String f33559l = "{}";

    /* renamed from: m */
    private String f33560m = "";

    /* renamed from: n */
    private long f33561n = LocationRequestCompat.PASSIVE_INTERVAL;

    /* renamed from: o */
    private zzeag f33562o = zzeag.NONE;

    /* renamed from: p */
    private boolean f33563p;

    /* renamed from: q */
    private int f33564q;

    /* renamed from: r */
    private boolean f33565r;

    /* renamed from: s */
    private zzeaj f33566s = zzeaj.UNKNOWN;

    zzeak(zzeas zzeas, zzebg zzebg, zzdzw zzdzw, Context context, zzcgv zzcgv, zzeaf zzeaf, zzebe zzebe) {
        this.f33548a = zzeas;
        this.f33549b = zzebg;
        this.f33550c = zzdzw;
        this.f33552e = new zzdzu(context);
        this.f33554g = zzcgv.f28446a;
        this.f33555h = "afma-sdk-a-v21.3.0";
        this.f33551d = zzeaf;
        this.f33553f = zzebe;
        zzt.m2908u().mo20303g(this);
    }

    /* renamed from: p */
    private final synchronized JSONObject m48498p() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.f33556i.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdzy zzdzy : (List) entry.getValue()) {
                if (zzdzy.mo45117e()) {
                    jSONArray.put(zzdzy.mo45114b());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    /* renamed from: q */
    private final void m48499q() {
        this.f33565r = true;
        this.f33551d.mo45121c();
        this.f33548a.mo45139c(this);
        this.f33549b.mo45149c(this);
        this.f33550c.mo45110c(this);
        this.f33553f.mo45143d(this);
        m48505w(zzt.m2904q().mo43494h().mo20379l());
    }

    /* renamed from: r */
    private final void m48500r() {
        zzt.m2904q().mo43494h().mo20393w0(mo45125d());
    }

    /* renamed from: s */
    private final synchronized void m48501s(zzeag zzeag, boolean z) {
        if (this.f33562o != zzeag) {
            if (mo45135n()) {
                m48503u();
            }
            this.f33562o = zzeag;
            if (mo45135n()) {
                m48504v();
            }
            if (z) {
                m48500r();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m48502t(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f33563p     // Catch:{ all -> 0x003d }
            if (r0 != r2) goto L_0x0007
            monitor-exit(r1)
            return
        L_0x0007:
            r1.f33563p = r2     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x002b
            com.google.android.gms.internal.ads.zzbiu r2 = com.google.android.gms.internal.ads.zzbjc.f27004T7     // Catch:{ all -> 0x003d }
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x003d }
            java.lang.Object r2 = r0.mo42663b(r2)     // Catch:{ all -> 0x003d }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x003d }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0027
            com.google.android.gms.ads.internal.util.zzaw r2 = com.google.android.gms.ads.internal.zzt.m2908u()     // Catch:{ all -> 0x003d }
            boolean r2 = r2.mo20308l()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x002b
        L_0x0027:
            r1.m48504v()     // Catch:{ all -> 0x003d }
            goto L_0x0034
        L_0x002b:
            boolean r2 = r1.mo45135n()     // Catch:{ all -> 0x003d }
            if (r2 != 0) goto L_0x0034
            r1.m48503u()     // Catch:{ all -> 0x003d }
        L_0x0034:
            if (r3 == 0) goto L_0x003b
            r1.m48500r()     // Catch:{ all -> 0x003d }
            monitor-exit(r1)
            return
        L_0x003b:
            monitor-exit(r1)
            return
        L_0x003d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeak.m48502t(boolean, boolean):void");
    }

    /* renamed from: u */
    private final synchronized void m48503u() {
        zzeag zzeag = zzeag.NONE;
        int ordinal = this.f33562o.ordinal();
        if (ordinal == 1) {
            this.f33549b.mo45147a();
        } else if (ordinal == 2) {
            this.f33550c.mo45108a();
        }
    }

    /* renamed from: v */
    private final synchronized void m48504v() {
        zzeag zzeag = zzeag.NONE;
        int ordinal = this.f33562o.ordinal();
        if (ordinal == 1) {
            this.f33549b.mo45148b();
        } else if (ordinal == 2) {
            this.f33550c.mo45109b();
        }
    }

    /* renamed from: w */
    private final synchronized void m48505w(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                m48502t(jSONObject.optBoolean("isTestMode", false), false);
                m48501s(zzeag.m48495b(jSONObject.optString("gesture", KeyPropertiesCompact.DIGEST_NONE)), false);
                this.f33559l = jSONObject.optString("networkExtras", "{}");
                this.f33561n = jSONObject.optLong("networkExtrasExpirationSecs", LocationRequestCompat.PASSIVE_INTERVAL);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final zzeag mo45122a() {
        return this.f33562o;
    }

    /* renamed from: b */
    public final synchronized zzfzp mo45123b(String str) {
        zzchh zzchh;
        zzchh = new zzchh();
        if (this.f33557j.containsKey(str)) {
            zzchh.mo43574c((zzdzy) this.f33557j.get(str));
        } else {
            if (!this.f33558k.containsKey(str)) {
                this.f33558k.put(str, new ArrayList());
            }
            ((List) this.f33558k.get(str)).add(zzchh);
        }
        return zzchh;
    }

    /* renamed from: c */
    public final synchronized String mo45124c() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue()) {
            if (mo45135n()) {
                if (this.f33561n < zzt.m2889b().mo21950a() / 1000) {
                    this.f33559l = "{}";
                    this.f33561n = LocationRequestCompat.PASSIVE_INTERVAL;
                    return "";
                } else if (this.f33559l.equals("{}")) {
                    return "";
                } else {
                    return this.f33559l;
                }
            }
        }
        return "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|(1:7)|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0033 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo45125d() {
        /*
            r7 = this;
            monitor-enter(r7)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0039 }
            r0.<init>()     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "isTestMode"
            boolean r2 = r7.f33563p     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "gesture"
            com.google.android.gms.internal.ads.zzeag r2 = r7.f33562o     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            long r1 = r7.f33561n     // Catch:{ JSONException -> 0x0033 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzt.m2889b()     // Catch:{ JSONException -> 0x0033 }
            long r3 = r3.mo21950a()     // Catch:{ JSONException -> 0x0033 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            java.lang.String r1 = "networkExtras"
            java.lang.String r2 = r7.f33559l     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "networkExtrasExpirationSecs"
            long r2 = r7.f33561n     // Catch:{ JSONException -> 0x0033 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeak.mo45125d():java.lang.String");
    }

    /* renamed from: e */
    public final synchronized JSONObject mo45126e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("sdkVersion", this.f33555h);
            jSONObject.put("internalSdkVersion", this.f33554g);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.f33551d.mo45120a());
            if (this.f33561n < zzt.m2889b().mo21950a() / 1000) {
                this.f33559l = "{}";
            }
            jSONObject.put("networkExtras", this.f33559l);
            jSONObject.put("adSlots", m48498p());
            jSONObject.put("appInfo", this.f33552e.mo45107a());
            String c = zzt.m2904q().mo43494h().mo20365e().mo43478c();
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("cld", new JSONObject(c));
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27014U7)).booleanValue() && !TextUtils.isEmpty(this.f33560m)) {
                String str = this.f33560m;
                zzcgp.m45224b("Policy violation data: " + str);
                jSONObject.put("policyViolations", new JSONObject(this.f33560m));
            }
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue()) {
                jSONObject.put("openAction", this.f33566s);
                jSONObject.put("gesture", this.f33562o);
            }
        } catch (JSONException e) {
            zzt.m2904q().mo43502s(e, "Inspector.toJson");
            zzcgp.m45230h("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo45127f(java.lang.String r4, com.google.android.gms.internal.ads.zzdzy r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26854E7     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r3.mo45135n()     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x001b
            goto L_0x00a1
        L_0x001b:
            int r0 = r3.f33564q     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f26874G7     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbja r2 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r1 = r2.mo42663b(r1)     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00a3 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00a3 }
            if (r0 < r1) goto L_0x0036
            java.lang.String r4 = "Maximum number of ad requests stored reached. Dropping the current request."
            com.google.android.gms.internal.ads.zzcgp.m45229g(r4)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r3)
            return
        L_0x0036:
            java.util.Map r0 = r3.f33556i     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0048
            java.util.Map r0 = r3.f33556i     // Catch:{ all -> 0x00a3 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00a3 }
            r1.<init>()     // Catch:{ all -> 0x00a3 }
            r0.put(r4, r1)     // Catch:{ all -> 0x00a3 }
        L_0x0048:
            int r0 = r3.f33564q     // Catch:{ all -> 0x00a3 }
            int r0 = r0 + 1
            r3.f33564q = r0     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.f33556i     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00a3 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00a3 }
            r4.add(r5)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbiu r4 = com.google.android.gms.internal.ads.zzbjc.f27070a8     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.mo42663b(r4)     // Catch:{ all -> 0x00a3 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ all -> 0x00a3 }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00a3 }
            if (r4 != 0) goto L_0x006d
            monitor-exit(r3)
            return
        L_0x006d:
            java.lang.String r4 = r5.mo45113a()     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.f33557j     // Catch:{ all -> 0x00a3 }
            r0.put(r4, r5)     // Catch:{ all -> 0x00a3 }
            java.util.Map r0 = r3.f33558k     // Catch:{ all -> 0x00a3 }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x009f
            java.util.Map r0 = r3.f33558k     // Catch:{ all -> 0x00a3 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x00a3 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r0 = r4.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x008a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r1 == 0) goto L_0x009a
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.zzchh r1 = (com.google.android.gms.internal.ads.zzchh) r1     // Catch:{ all -> 0x00a3 }
            r1.mo43574c(r5)     // Catch:{ all -> 0x00a3 }
            goto L_0x008a
        L_0x009a:
            r4.clear()     // Catch:{ all -> 0x00a3 }
            monitor-exit(r3)
            return
        L_0x009f:
            monitor-exit(r3)
            return
        L_0x00a1:
            monitor-exit(r3)
            return
        L_0x00a3:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeak.mo45127f(java.lang.String, com.google.android.gms.internal.ads.zzdzy):void");
    }

    /* renamed from: g */
    public final void mo45128g() {
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue()) {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue() || !zzt.m2904q().mo43494h().mo20358a0()) {
                String l = zzt.m2904q().mo43494h().mo20379l();
                if (!TextUtils.isEmpty(l)) {
                    try {
                        if (new JSONObject(l).optBoolean("isTestMode", false)) {
                            m48499q();
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else {
                m48499q();
            }
        }
    }

    /* renamed from: h */
    public final synchronized void mo45129h(zzcy zzcy, zzeaj zzeaj) {
        if (!mo45135n()) {
            try {
                zzcy.mo19987G3(zzffe.m50085d(18, (String) null, (zze) null));
            } catch (RemoteException unused) {
                zzcgp.m45229g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
            }
        } else {
            if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f26854E7)).booleanValue()) {
                try {
                    zzcy.mo19987G3(zzffe.m50085d(1, (String) null, (zze) null));
                } catch (RemoteException unused2) {
                    zzcgp.m45229g("Ad inspector had an internal error.");
                }
            } else {
                this.f33566s = zzeaj;
                this.f33548a.mo45141e(zzcy, new zzbpv(this), new zzbqg(this.f33553f));
            }
        }
    }

    /* renamed from: i */
    public final synchronized void mo45130i(String str, long j) {
        this.f33559l = str;
        this.f33561n = j;
        m48500r();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r2 != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45131j(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f33565r
            if (r0 != 0) goto L_0x000a
            if (r2 == 0) goto L_0x0015
            r1.m48499q()
            goto L_0x000c
        L_0x000a:
            if (r2 == 0) goto L_0x0015
        L_0x000c:
            boolean r2 = r1.f33563p
            if (r2 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            r1.m48504v()
            return
        L_0x0015:
            boolean r2 = r1.mo45135n()
            if (r2 != 0) goto L_0x001e
            r1.m48503u()
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeak.mo45131j(boolean):void");
    }

    /* renamed from: k */
    public final void mo45132k(zzeag zzeag) {
        m48501s(zzeag, true);
    }

    /* renamed from: l */
    public final synchronized void mo45133l(String str) {
        this.f33560m = str;
    }

    /* renamed from: m */
    public final void mo45134m(boolean z) {
        if (!this.f33565r && z) {
            m48499q();
        }
        m48502t(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r2.f33563p || com.google.android.gms.ads.internal.zzt.m2908u().mo20308l();
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo45135n() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27004T7     // Catch:{ all -> 0x002b }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x002b }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x002b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x002b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0027
            boolean r0 = r2.f33563p     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.ads.internal.util.zzaw r0 = com.google.android.gms.ads.internal.zzt.m2908u()     // Catch:{ all -> 0x002b }
            boolean r0 = r0.mo20308l()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            r0 = 0
        L_0x0023:
            monitor-exit(r2)
            return r0
        L_0x0025:
            r0 = 1
            goto L_0x0023
        L_0x0027:
            boolean r0 = r2.f33563p     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return r0
        L_0x002b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeak.mo45135n():boolean");
    }

    /* renamed from: o */
    public final synchronized boolean mo45136o() {
        return this.f33563p;
    }
}
