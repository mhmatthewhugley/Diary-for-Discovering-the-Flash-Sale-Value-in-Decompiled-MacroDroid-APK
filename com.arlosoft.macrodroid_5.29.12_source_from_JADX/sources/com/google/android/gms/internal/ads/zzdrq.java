package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzdrq {

    /* renamed from: a */
    private final Context f32890a;

    /* renamed from: b */
    private final zzdqz f32891b;

    /* renamed from: c */
    private final zzape f32892c;

    /* renamed from: d */
    private final zzcgv f32893d;

    /* renamed from: e */
    private final zza f32894e;

    /* renamed from: f */
    private final zzbep f32895f;

    /* renamed from: g */
    private final Executor f32896g;

    /* renamed from: h */
    private final zzbls f32897h;

    /* renamed from: i */
    private final zzdsi f32898i;

    /* renamed from: j */
    private final zzduy f32899j;

    /* renamed from: k */
    private final ScheduledExecutorService f32900k;

    /* renamed from: l */
    private final zzdtt f32901l;

    /* renamed from: m */
    private final zzdxq f32902m;

    /* renamed from: n */
    private final zzfir f32903n;

    /* renamed from: o */
    private final zzfkm f32904o;

    /* renamed from: p */
    private final zzego f32905p;

    public zzdrq(Context context, zzdqz zzdqz, zzape zzape, zzcgv zzcgv, zza zza, zzbep zzbep, Executor executor, zzfef zzfef, zzdsi zzdsi, zzduy zzduy, ScheduledExecutorService scheduledExecutorService, zzdxq zzdxq, zzfir zzfir, zzfkm zzfkm, zzego zzego, zzdtt zzdtt) {
        this.f32890a = context;
        this.f32891b = zzdqz;
        this.f32892c = zzape;
        this.f32893d = zzcgv;
        this.f32894e = zza;
        this.f32895f = zzbep;
        this.f32896g = executor;
        this.f32897h = zzfef.f35634i;
        this.f32898i = zzdsi;
        this.f32899j = zzduy;
        this.f32900k = scheduledExecutorService;
        this.f32902m = zzdxq;
        this.f32903n = zzfir;
        this.f32904o = zzfkm;
        this.f32905p = zzego;
        this.f32901l = zzdtt;
    }

    @Nullable
    /* renamed from: i */
    public static final zzef m47971i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m47980r(optJSONObject);
    }

    /* renamed from: j */
    public static final List m47972j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfvn.m51135w();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfvn.m51135w();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzef r = m47980r(optJSONArray.optJSONObject(i));
            if (r != null) {
                arrayList.add(r);
            }
        }
        return zzfvn.m51133t(arrayList);
    }

    /* renamed from: k */
    private final zzq m47973k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.m2419n2();
            }
            i = 0;
        }
        return new zzq(this.f32890a, new AdSize(i, i2));
    }

    /* renamed from: l */
    private static zzfzp m47974l(zzfzp zzfzp, Object obj) {
        return zzfzg.m51412g(zzfzp, Exception.class, new zzdrn((Object) null), zzchc.f28461f);
    }

    /* renamed from: m */
    private static zzfzp m47975m(boolean z, zzfzp zzfzp, Object obj) {
        if (z) {
            return zzfzg.m51419n(zzfzp, new zzdrl(zzfzp), zzchc.f28461f);
        }
        return m47974l(zzfzp, (Object) null);
    }

    /* renamed from: n */
    private final zzfzp m47976n(@Nullable JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfzg.m51414i((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzfzg.m51414i((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfzg.m51414i(new zzblq((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m47975m(jSONObject.optBoolean("require"), zzfzg.m51418m(this.f32891b.mo44929b(optString, optDouble, optBoolean), new zzdro(optString, optDouble, optInt, optInt2), this.f32896g), (Object) null);
    }

    /* renamed from: o */
    private final zzfzp m47977o(@Nullable JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfzg.m51414i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m47976n(jSONArray.optJSONObject(i), z));
        }
        return zzfzg.m51418m(zzfzg.m51410e(arrayList), zzdrm.f32884a, this.f32896g);
    }

    /* renamed from: p */
    private final zzfzp m47978p(JSONObject jSONObject, zzfdk zzfdk, zzfdn zzfdn) {
        zzfzp b = this.f32898i.mo44955b(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfdk, zzfdn, m47973k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfzg.m51419n(b, new zzdrp(b), zzchc.f28461f);
    }

    @Nullable
    /* renamed from: q */
    private static Integer m47979q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: r */
    private static final zzef m47980r(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzef(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzbln mo44935a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q = m47979q(jSONObject, "bg_color");
        Integer q2 = m47979q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbln(optString, list, q, q2, num, optInt3 + optInt2, this.f32897h.f27530g, optBoolean);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo44936b(zzq zzq, zzfdk zzfdk, zzfdn zzfdn, String str, String str2, Object obj) throws Exception {
        zzcmp a = this.f32899j.mo45004a(zzq, zzfdk, zzfdn);
        zzchg e = zzchg.m45246e(a);
        zzdtq b = this.f32901l.mo44984b();
        zzdtq zzdtq = b;
        zzcoc e0 = a.mo44044e0();
        zzb zzb = r3;
        zzb zzb2 = new zzb(this.f32890a, (zzcdq) null, (zzcaq) null);
        e0.mo44086I0(b, zzdtq, b, b, b, false, (zzbpx) null, zzb, (zzbyg) null, (zzcdq) null, this.f32905p, this.f32904o, this.f32902m, this.f32903n, (zzbpv) null, b, (zzbqm) null, (zzbqg) null);
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f26999T2)).booleanValue()) {
            a.mo44064o0("/getNativeAdViewSignals", zzbpt.f27621s);
        }
        a.mo44064o0("/getNativeClickMeta", zzbpt.f27622t);
        a.mo44044e0().mo44085I(new zzdrk(e));
        a.mo44028R0(str, str2, (String) null);
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ zzfzp mo44937c(String str, Object obj) throws Exception {
        zzt.m2887B();
        zzcmp a = zzcnb.m45940a(this.f32890a, zzcoe.m46199a(), "native-omid", false, false, this.f32892c, (zzbkb) null, this.f32893d, (zzbjr) null, (zzl) null, this.f32894e, this.f32895f, (zzfdk) null, (zzfdn) null);
        zzchg e = zzchg.m45246e(a);
        a.mo44044e0().mo44085I(new zzdrg(e));
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27156j4)).booleanValue()) {
            a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a.loadData(str, "text/html", "UTF-8");
        }
        return e;
    }

    /* renamed from: d */
    public final zzfzp mo44938d(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfzg.m51414i((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m47975m(optJSONObject.optBoolean("require"), zzfzg.m51418m(m47977o(optJSONArray, false, true), new zzdrh(this, optJSONObject), this.f32896g), (Object) null);
    }

    /* renamed from: e */
    public final zzfzp mo44939e(JSONObject jSONObject, String str) {
        return m47976n(jSONObject.optJSONObject(str), this.f32897h.f27527c);
    }

    /* renamed from: f */
    public final zzfzp mo44940f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbls zzbls = this.f32897h;
        return m47977o(optJSONArray, zzbls.f27527c, zzbls.f27529f);
    }

    /* renamed from: g */
    public final zzfzp mo44941g(JSONObject jSONObject, String str, zzfdk zzfdk, zzfdn zzfdn) {
        if (!((Boolean) zzay.m1924c().mo42663b(zzbjc.f27170k8)).booleanValue()) {
            return zzfzg.m51414i((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfzg.m51414i((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfzg.m51414i((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        zzq k = m47973k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzfzg.m51414i((Object) null);
        }
        zzfzp n = zzfzg.m51419n(zzfzg.m51414i((Object) null), new zzdri(this, k, zzfdk, zzfdn, optString, optString2), zzchc.f28460e);
        return zzfzg.m51419n(n, new zzdrj(n), zzchc.f28461f);
    }

    /* renamed from: h */
    public final zzfzp mo44942h(JSONObject jSONObject, zzfdk zzfdk, zzfdn zzfdn) {
        zzfzp zzfzp;
        JSONObject g = zzbu.m2597g(jSONObject, "html_containers", "instream");
        if (g != null) {
            return m47978p(g, zzfdk, zzfdn);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzfzg.m51414i((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27160j8)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                zzcgp.m45229g("Required field 'vast_xml' or 'html' is missing");
                return zzfzg.m51414i((Object) null);
            }
        } else if (!z) {
            zzfzp = this.f32898i.mo44954a(optJSONObject);
            return m47974l(zzfzg.m51420o(zzfzp, (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27009U2)).intValue(), TimeUnit.SECONDS, this.f32900k), (Object) null);
        }
        zzfzp = m47978p(optJSONObject, zzfdk, zzfdn);
        return m47974l(zzfzg.m51420o(zzfzp, (long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27009U2)).intValue(), TimeUnit.SECONDS, this.f32900k), (Object) null);
    }
}
