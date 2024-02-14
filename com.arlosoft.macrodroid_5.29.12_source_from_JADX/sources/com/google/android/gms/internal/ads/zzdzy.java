package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdzy implements zzddd, zzdfv, zzdes {

    /* renamed from: A */
    private boolean f33504A;

    /* renamed from: B */
    private boolean f33505B;

    /* renamed from: a */
    private final zzeak f33506a;

    /* renamed from: c */
    private final String f33507c;

    /* renamed from: d */
    private final String f33508d;

    /* renamed from: f */
    private int f33509f = 0;

    /* renamed from: g */
    private zzdzx f33510g = zzdzx.AD_REQUESTED;

    /* renamed from: o */
    private zzdct f33511o;

    /* renamed from: p */
    private zze f33512p;

    /* renamed from: s */
    private String f33513s;

    /* renamed from: z */
    private String f33514z;

    zzdzy(zzeak zzeak, zzfef zzfef, String str) {
        this.f33506a = zzeak;
        this.f33508d = str;
        this.f33507c = zzfef.f35631f;
    }

    /* renamed from: h */
    private static JSONObject m48478h(zze zze) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zze.f1936d);
        jSONObject.put("errorCode", zze.f1934a);
        jSONObject.put("errorDescription", zze.f1935c);
        zze zze2 = zze.f1937f;
        jSONObject.put("underlyingError", zze2 == null ? null : m48478h(zze2));
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m48479i(zzdct zzdct) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", zzdct.mo19995f());
        jSONObject2.put("responseSecsSinceEpoch", zzdct.mo44569a());
        jSONObject2.put("responseId", zzdct.mo19996g());
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27024V7)).booleanValue()) {
            String d = zzdct.mo44570d();
            if (!TextUtils.isEmpty(d)) {
                zzcgp.m45224b("Bidding data: ".concat(String.valueOf(d)));
                jSONObject2.put("biddingData", new JSONObject(d));
            }
        }
        if (!TextUtils.isEmpty(this.f33513s)) {
            jSONObject2.put("adRequestUrl", this.f33513s);
        }
        if (!TextUtils.isEmpty(this.f33514z)) {
            jSONObject2.put("postBody", this.f33514z);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzu : zzdct.mo19997h()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("adapterClassName", zzu.f2038a);
            jSONObject3.put("latencyMillis", zzu.f2039c);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27033W7)).booleanValue()) {
                jSONObject3.put("credentials", zzaw.m1917b().mo43549h(zzu.f2041f));
            }
            zze zze = zzu.f2040d;
            if (zze == null) {
                jSONObject = null;
            } else {
                jSONObject = m48478h(zze);
            }
            jSONObject3.put("error", jSONObject);
            jSONArray.put(jSONObject3);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    /* renamed from: a */
    public final String mo45113a() {
        return this.f33508d;
    }

    /* renamed from: b */
    public final JSONObject mo45114b() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f33510g);
        jSONObject.put("format", zzfdk.m49940a(this.f33509f));
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27070a8)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.f33504A);
            if (this.f33504A) {
                jSONObject.put("shown", this.f33505B);
            }
        }
        zzdct zzdct = this.f33511o;
        JSONObject jSONObject2 = null;
        if (zzdct != null) {
            jSONObject2 = m48479i(zzdct);
        } else {
            zze zze = this.f33512p;
            if (!(zze == null || (iBinder = zze.f1938g) == null)) {
                zzdct zzdct2 = (zzdct) iBinder;
                jSONObject2 = m48479i(zzdct2);
                if (zzdct2.mo19997h().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m48478h(this.f33512p));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    /* renamed from: c */
    public final void mo45115c() {
        this.f33504A = true;
    }

    /* renamed from: d */
    public final void mo45116d() {
        this.f33505B = true;
    }

    /* renamed from: e */
    public final boolean mo45117e() {
        return this.f33510g != zzdzx.AD_REQUESTED;
    }

    /* renamed from: f */
    public final void mo44599f(zzcze zzcze) {
        this.f33511o = zzcze.mo44496c();
        this.f33510g = zzdzx.AD_LOADED;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27070a8)).booleanValue()) {
            this.f33506a.mo45127f(this.f33507c, this);
        }
    }

    /* renamed from: g */
    public final void mo44489g(zzfdw zzfdw) {
        if (!zzfdw.f35590b.f35586a.isEmpty()) {
            this.f33509f = ((zzfdk) zzfdw.f35590b.f35586a.get(0)).f35521b;
        }
        if (!TextUtils.isEmpty(zzfdw.f35590b.f35587b.f35575k)) {
            this.f33513s = zzfdw.f35590b.f35587b.f35575k;
        }
        if (!TextUtils.isEmpty(zzfdw.f35590b.f35587b.f35576l)) {
            this.f33514z = zzfdw.f35590b.f35587b.f35576l;
        }
    }

    /* renamed from: r */
    public final void mo44382r(zze zze) {
        this.f33510g = zzdzx.AD_LOAD_FAILED;
        this.f33512p = zze;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27070a8)).booleanValue()) {
            this.f33506a.mo45127f(this.f33507c, this);
        }
    }

    /* renamed from: u */
    public final void mo44490u(zzcbc zzcbc) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27070a8)).booleanValue()) {
            this.f33506a.mo45127f(this.f33507c, this);
        }
    }
}
