package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzcev {
    @GuardedBy("ScionComponent.class")
    @VisibleForTesting

    /* renamed from: a */
    static zzcev f28326a;

    /* renamed from: d */
    public static synchronized zzcev m45054d(Context context) {
        synchronized (zzcev.class) {
            zzcev zzcev = f28326a;
            if (zzcev != null) {
                return zzcev;
            }
            Context applicationContext = context.getApplicationContext();
            zzbjc.m43542c(applicationContext);
            zzg h = zzt.m2904q().mo43494h();
            h.mo20390t0(applicationContext);
            zzcdz zzcdz = new zzcdz((zzcdy) null);
            zzcdz.mo43414b(applicationContext);
            zzcdz.mo43415c(zzt.m2889b());
            zzcdz.mo43413a(h);
            zzcdz.mo43416d(zzt.m2903p());
            zzcev e = zzcdz.mo43417e();
            f28326a = e;
            e.mo43418a().mo43404a();
            f28326a.mo43419b().mo43409c();
            zzcez c = f28326a.mo43420c();
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27202o0)).booleanValue()) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject((String) zzay.m1924c().mo42663b(zzbjc.f27222q0));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        HashSet hashSet = new HashSet();
                        JSONArray optJSONArray = jSONObject.optJSONArray(next);
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                String optString = optJSONArray.optString(i);
                                if (optString != null) {
                                    hashSet.add(optString);
                                }
                            }
                            hashMap.put(next, hashSet);
                        }
                    }
                    for (String c2 : hashMap.keySet()) {
                        c.mo43452c(c2);
                    }
                    c.mo43453d(new zzcex(c, hashMap));
                } catch (JSONException e2) {
                    zzcgp.m45225c("Failed to parse listening list", e2);
                }
            }
            zzcev zzcev2 = f28326a;
            return zzcev2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract zzcds mo43418a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract zzcdw mo43419b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract zzcez mo43420c();
}
