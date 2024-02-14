package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzenc {
    @GuardedBy("this")

    /* renamed from: a */
    private final Map f34517a = new HashMap();
    @GuardedBy("this")

    /* renamed from: b */
    private final Map f34518b = new HashMap();
    @GuardedBy("this")

    /* renamed from: c */
    private final Map f34519c = new HashMap();

    /* renamed from: d */
    private final Executor f34520d;

    /* renamed from: e */
    private JSONObject f34521e;

    zzenc(Executor executor) {
        this.f34520d = executor;
    }

    /* renamed from: g */
    private final synchronized List m49189g(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Bundle l = m49194l(jSONObject.optJSONObject(Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA));
        JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
        if (optJSONArray == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            String optString = optJSONArray.optString(i, "");
            if (!TextUtils.isEmpty(optString)) {
                arrayList2.add(optString);
            }
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList2.get(i2);
            mo45388f(str2);
            if (((zzene) this.f34517a.get(str2)) != null) {
                arrayList.add(new zzene(str2, str, l));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final synchronized void m49190h() {
        this.f34518b.clear();
        this.f34517a.clear();
        m49192j();
        m49193k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m49191i(java.lang.String r3, java.lang.String r4, java.util.List r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x0036
            java.util.Map r0 = r2.f34519c     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0038 }
            if (r0 != 0) goto L_0x001c
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0038 }
            r0.<init>()     // Catch:{ all -> 0x0038 }
        L_0x001c:
            java.util.Map r1 = r2.f34519c     // Catch:{ all -> 0x0038 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0038 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0038 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x002e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0038 }
            r3.<init>()     // Catch:{ all -> 0x0038 }
        L_0x002e:
            r3.addAll(r5)     // Catch:{ all -> 0x0038 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            return
        L_0x0036:
            monitor-exit(r2)
            return
        L_0x0038:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenc.m49191i(java.lang.String, java.lang.String, java.util.List):void");
    }

    /* renamed from: j */
    private final synchronized void m49192j() {
        String str;
        JSONObject f = zzt.m2904q().mo43494h().mo20365e().mo43481f();
        if (f != null) {
            try {
                JSONArray optJSONArray = f.optJSONArray("ad_unit_id_settings");
                this.f34521e = f.optJSONObject("ad_unit_patterns");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27320z8)).booleanValue()) {
                            str = jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT);
                        } else {
                            str = jSONObject.optString("ad_unit_id", "");
                        }
                        String optString = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("ad_networks");
                            if (optJSONArray2 != null) {
                                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                    arrayList.addAll(m49189g(optJSONArray2.getJSONObject(i2), optString));
                                }
                            }
                        }
                        m49191i(optString, str, arrayList);
                    }
                }
            } catch (JSONException e) {
                zze.m2646l("Malformed config loading JSON.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m49193k() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzbke r0 = com.google.android.gms.internal.ads.zzbkx.f27476e     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r0.mo42728e()     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0081
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27313z1     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0083 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ all -> 0x0083 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0083 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0022
            goto L_0x0081
        L_0x0022:
            com.google.android.gms.internal.ads.zzcfy r0 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.ads.internal.util.zzg r0 = r0.mo43494h()     // Catch:{ all -> 0x0083 }
            com.google.android.gms.internal.ads.zzcfs r0 = r0.mo20365e()     // Catch:{ all -> 0x0083 }
            org.json.JSONObject r0 = r0.mo43481f()     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0036
            monitor-exit(r9)
            return
        L_0x0036:
            java.lang.String r1 = "signal_adapters"
            org.json.JSONArray r0 = r0.getJSONArray(r1)     // Catch:{ JSONException -> 0x0079 }
            r1 = 0
            r2 = 0
        L_0x003e:
            int r3 = r0.length()     // Catch:{ JSONException -> 0x0079 }
            if (r2 >= r3) goto L_0x0077
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r4 = "data"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ JSONException -> 0x0079 }
            android.os.Bundle r4 = m49194l(r4)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r5 = "adapter_class_name"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r6 = "render"
            boolean r6 = r3.optBoolean(r6, r1)     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r7 = "collect_signals"
            boolean r3 = r3.optBoolean(r7, r1)     // Catch:{ JSONException -> 0x0079 }
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ JSONException -> 0x0079 }
            if (r7 != 0) goto L_0x0074
            java.util.Map r7 = r9.f34518b     // Catch:{ JSONException -> 0x0079 }
            com.google.android.gms.internal.ads.zzeng r8 = new com.google.android.gms.internal.ads.zzeng     // Catch:{ JSONException -> 0x0079 }
            r8.<init>(r5, r3, r6, r4)     // Catch:{ JSONException -> 0x0079 }
            r7.put(r5, r8)     // Catch:{ JSONException -> 0x0079 }
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0077:
            monitor-exit(r9)
            return
        L_0x0079:
            r0 = move-exception
            java.lang.String r1 = "Malformed config loading JSON."
            com.google.android.gms.ads.internal.util.zze.m2646l(r1, r0)     // Catch:{ all -> 0x0083 }
            monitor-exit(r9)
            return
        L_0x0081:
            monitor-exit(r9)
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenc.m49193k():void");
    }

    /* renamed from: l */
    private static final Bundle m49194l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Map mo45384a(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x000f
            goto L_0x008b
        L_0x000f:
            java.util.Map r0 = r3.f34519c     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0091 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x001f
            com.google.android.gms.internal.ads.zzfvq r4 = com.google.android.gms.internal.ads.zzfvq.m51148d()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x001f:
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0091 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
            if (r1 != 0) goto L_0x004c
            org.json.JSONObject r1 = r3.f34521e     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = com.google.android.gms.internal.ads.zzdvs.m48248a(r1, r5, r4)     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.zzbiu r5 = com.google.android.gms.internal.ads.zzbjc.f27320z8     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ all -> 0x0091 }
            java.lang.Object r5 = r1.mo42663b(r5)     // Catch:{ all -> 0x0091 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0091 }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0091 }
            if (r5 == 0) goto L_0x0045
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch:{ all -> 0x0091 }
        L_0x0045:
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0091 }
            r1 = r4
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
        L_0x004c:
            if (r1 != 0) goto L_0x0054
            com.google.android.gms.internal.ads.zzfvq r4 = com.google.android.gms.internal.ads.zzfvq.m51148d()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x0054:
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0091 }
            r4.<init>()     // Catch:{ all -> 0x0091 }
            java.util.Iterator r5 = r1.iterator()     // Catch:{ all -> 0x0091 }
        L_0x005d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.zzene r0 = (com.google.android.gms.internal.ads.zzene) r0     // Catch:{ all -> 0x0091 }
            java.lang.String r1 = r0.f34523a     // Catch:{ all -> 0x0091 }
            boolean r2 = r4.containsKey(r1)     // Catch:{ all -> 0x0091 }
            if (r2 != 0) goto L_0x0079
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
            r4.put(r1, r2)     // Catch:{ all -> 0x0091 }
        L_0x0079:
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x0091 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0091 }
            android.os.Bundle r0 = r0.f34525c     // Catch:{ all -> 0x0091 }
            r1.add(r0)     // Catch:{ all -> 0x0091 }
            goto L_0x005d
        L_0x0085:
            com.google.android.gms.internal.ads.zzfvq r4 = com.google.android.gms.internal.ads.zzfvq.m51147c(r4)     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x008b:
            com.google.android.gms.internal.ads.zzfvq r4 = com.google.android.gms.internal.ads.zzfvq.m51148d()     // Catch:{ all -> 0x0091 }
            monitor-exit(r3)
            return r4
        L_0x0091:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenc.mo45384a(java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: b */
    public final synchronized Map mo45385b() {
        return zzfvq.m51147c(this.f34518b);
    }

    /* renamed from: d */
    public final void mo45386d() {
        zzt.m2904q().mo43494h().mo20368f0(new zzena(this));
        this.f34520d.execute(new zzenb(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo45387e() {
        this.f34520d.execute(new zzenb(this));
    }

    /* renamed from: f */
    public final synchronized void mo45388f(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!this.f34517a.containsKey(str)) {
                this.f34517a.put(str, new zzene(str, "", new Bundle()));
            }
        }
    }
}
