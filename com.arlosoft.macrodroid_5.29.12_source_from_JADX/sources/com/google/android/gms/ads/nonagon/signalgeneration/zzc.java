package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzdxl;
import com.google.android.gms.internal.ads.zzdxv;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f2533a;

    /* renamed from: b */
    private final long f2534b;

    /* renamed from: c */
    private final boolean f2535c;

    /* renamed from: d */
    private final boolean f2536d;

    /* renamed from: e */
    private final Map f2537e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ArrayDeque f2538f = new ArrayDeque();

    /* renamed from: g */
    private final ArrayDeque f2539g = new ArrayDeque();

    /* renamed from: h */
    private final zzdxv f2540h;

    /* renamed from: i */
    private Map f2541i;

    public zzc(zzdxv zzdxv) {
        this.f2540h = zzdxv;
        this.f2533a = ((Integer) zzay.m1924c().mo42663b(zzbjc.f27078b6)).intValue();
        this.f2534b = ((Long) zzay.m1924c().mo42663b(zzbjc.f27088c6)).longValue();
        this.f2535c = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27138h6)).booleanValue();
        this.f2536d = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27118f6)).booleanValue();
        this.f2537e = Collections.synchronizedMap(new zzb(this));
    }

    /* renamed from: g */
    private final synchronized void m3052g(zzdxl zzdxl) {
        if (this.f2535c) {
            ArrayDeque clone = this.f2539g.clone();
            this.f2539g.clear();
            ArrayDeque clone2 = this.f2538f.clone();
            this.f2538f.clear();
            zzchc.f28456a.execute(new zza(this, zzdxl, clone, clone2));
        }
    }

    /* renamed from: h */
    private final void m3053h(zzdxl zzdxl, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdxl.mo45036a());
            this.f2541i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f2541i.put("e_r", str);
            this.f2541i.put("e_id", (String) pair2.first);
            if (this.f2536d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.m3060a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                m3055j(this.f2541i, "e_type", (String) pair.first);
                m3055j(this.f2541i, "e_agent", (String) pair.second);
            }
            this.f2540h.mo45056e(this.f2541i);
        }
    }

    /* renamed from: i */
    private final synchronized void m3054i() {
        long a = zzt.m2889b().mo21950a();
        try {
            Iterator it = this.f2537e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f2534b) {
                    break;
                }
                this.f2539g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            zzt.m2904q().mo43503t(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    /* renamed from: j */
    private static final void m3055j(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    @Nullable
    /* renamed from: b */
    public final synchronized String mo20681b(String str, zzdxl zzdxl) {
        Pair pair = (Pair) this.f2537e.get(str);
        zzdxl.mo45036a().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.f2537e.remove(str);
            zzdxl.mo45036a().put("mhit", "true");
            return str2;
        }
        zzdxl.mo45036a().put("mhit", "false");
        return null;
    }

    /* renamed from: d */
    public final synchronized void mo20682d(String str, String str2, zzdxl zzdxl) {
        this.f2537e.put(str, new Pair(Long.valueOf(zzt.m2889b().mo21950a()), str2));
        m3054i();
        m3052g(zzdxl);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo20683e(zzdxl zzdxl, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        m3053h(zzdxl, arrayDeque, TypedValues.Transition.S_TO);
        m3053h(zzdxl, arrayDeque2, "of");
    }

    /* renamed from: f */
    public final synchronized void mo20684f(String str) {
        this.f2537e.remove(str);
    }
}
