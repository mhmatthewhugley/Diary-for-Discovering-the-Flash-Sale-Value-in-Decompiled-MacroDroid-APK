package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzejv implements zzejp {

    /* renamed from: a */
    private final zzdnd f34219a;

    /* renamed from: b */
    private final zzfzq f34220b;

    /* renamed from: c */
    private final zzdrd f34221c;

    /* renamed from: d */
    private final zzffb f34222d;

    /* renamed from: e */
    private final zzdtt f34223e;

    public zzejv(zzdnd zzdnd, zzfzq zzfzq, zzdrd zzdrd, zzffb zzffb, zzdtt zzdtt) {
        this.f34219a = zzdnd;
        this.f34220b = zzfzq;
        this.f34221c = zzdrd;
        this.f34222d = zzffb;
        this.f34223e = zzdtt;
    }

    /* renamed from: g */
    private final zzfzp m48970g(zzfdw zzfdw, zzfdk zzfdk, JSONObject jSONObject) {
        zzfzp a = this.f34222d.mo45671a();
        zzfzp a2 = this.f34221c.mo44933a(zzfdw, zzfdk, jSONObject);
        return zzfzg.m51409d(a, a2).mo46623a(new zzejq(this, a2, a, zzfdw, zzfdk, jSONObject), this.f34220b);
    }

    /* renamed from: a */
    public final boolean mo45298a(zzfdw zzfdw, zzfdk zzfdk) {
        zzfdp zzfdp = zzfdk.f35554t;
        return (zzfdp == null || zzfdp.f35579c == null) ? false : true;
    }

    /* renamed from: b */
    public final zzfzp mo45299b(zzfdw zzfdw, zzfdk zzfdk) {
        return zzfzg.m51419n(zzfzg.m51419n(this.f34222d.mo45671a(), new zzejs(this, zzfdk), this.f34220b), new zzejt(this, zzfdw, zzfdk), this.f34220b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzdol mo45339c(zzfzp zzfzp, zzfzp zzfzp2, zzfdw zzfdw, zzfdk zzfdk, JSONObject jSONObject) throws Exception {
        zzdoq zzdoq = (zzdoq) zzfzp.get();
        zzdtn zzdtn = (zzdtn) zzfzp2.get();
        zzdor c = this.f34219a.mo44248c(new zzczt(zzfdw, zzfdk, (String) null), new zzdpc(zzdoq), new zzdns(jSONObject, zzdtn));
        c.mo44310j().mo44964b();
        c.mo44311k().mo44971a(zzdtn);
        c.mo44309i().mo44951a(zzdoq.mo44813Z());
        c.mo44312l().mo44983a(this.f34223e);
        return c.mo44308h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ zzfzp mo45340d(zzdtn zzdtn, JSONObject jSONObject) throws Exception {
        this.f34222d.mo45672b(zzfzg.m51414i(zzdtn));
        if (jSONObject.optBoolean("success")) {
            return zzfzg.m51414i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbtz("process json failed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ zzfzp mo45341e(zzfdk zzfdk, zzdtn zzdtn) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27219p7)).booleanValue() && PlatformVersion.m4907l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfdk.f35554t.f35579c);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfzg.m51419n(zzdtn.mo44975d("google.afma.nativeAds.preProcessJson", jSONObject2), new zzejr(this, zzdtn), this.f34220b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ zzfzp mo45342f(zzfdw zzfdw, zzfdk zzfdk, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfzg.m51413h(new zzebh(3));
        }
        if (zzfdw.f35589a.f35583a.f35636k <= 1) {
            return zzfzg.m51418m(m48970g(zzfdw, zzfdk, jSONArray.getJSONObject(0)), zzeju.f34218a, this.f34220b);
        }
        int length = jSONArray.length();
        this.f34222d.mo45673c(Math.min(length, zzfdw.f35589a.f35583a.f35636k));
        ArrayList arrayList = new ArrayList(zzfdw.f35589a.f35583a.f35636k);
        for (int i = 0; i < zzfdw.f35589a.f35583a.f35636k; i++) {
            if (i < length) {
                arrayList.add(m48970g(zzfdw, zzfdk, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzfzg.m51413h(new zzebh(3)));
            }
        }
        return zzfzg.m51414i(arrayList);
    }
}
