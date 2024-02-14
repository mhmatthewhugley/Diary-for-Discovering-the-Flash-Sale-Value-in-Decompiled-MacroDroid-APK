package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdvq {

    /* renamed from: a */
    private final Map f33227a = new ConcurrentHashMap();

    /* renamed from: b */
    private JSONObject f33228b;

    /* renamed from: c */
    private final Executor f33229c;

    /* renamed from: d */
    private boolean f33230d;

    /* renamed from: e */
    private JSONObject f33231e;

    public zzdvq(Executor executor) {
        this.f33229c = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final synchronized void mo45027f() {
        Map map;
        this.f33230d = true;
        zzcfs e = zzt.m2904q().mo43494h().mo20365e();
        if (e != null) {
            JSONObject f = e.mo43481f();
            if (f != null) {
                this.f33228b = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27125g3)).booleanValue() ? f.optJSONObject("common_settings") : null;
                this.f33231e = f.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (!(optString == null || optJSONObject2 == null || optString2 == null)) {
                                if (this.f33227a.containsKey(optString2)) {
                                    map = (Map) this.f33227a.get(optString2);
                                } else {
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    this.f33227a.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final JSONObject mo45022a() {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27125g3)).booleanValue()) {
            return null;
        }
        return this.f33228b;
    }

    /* renamed from: b */
    public final JSONObject mo45023b(String str, String str2) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27115f3)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f33230d) {
            mo45027f();
        }
        Map map = (Map) this.f33227a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String a = zzdvs.m48248a(this.f33231e, str, str2);
        if (a == null) {
            return null;
        }
        return (JSONObject) map.get(a);
    }

    /* renamed from: c */
    public final void mo45024c() {
        zzt.m2904q().mo43494h().mo20368f0(new zzdvn(this));
        this.f33229c.execute(new zzdvo(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo45026e() {
        this.f33229c.execute(new zzdvp(this));
    }
}
