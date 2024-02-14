package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzenf extends zzbxf {

    /* renamed from: a */
    private final String f34526a;

    /* renamed from: c */
    private final zzbxd f34527c;

    /* renamed from: d */
    private final zzchh f34528d;

    /* renamed from: f */
    private final JSONObject f34529f;

    /* renamed from: g */
    private boolean f34530g = false;

    public zzenf(String str, zzbxd zzbxd, zzchh zzchh) {
        JSONObject jSONObject = new JSONObject();
        this.f34529f = jSONObject;
        this.f34528d = zzchh;
        this.f34526a = str;
        this.f34527c = zzbxd;
        try {
            jSONObject.put("adapter_version", zzbxd.mo43178c().toString());
            jSONObject.put("sdk_version", zzbxd.mo43180f().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* renamed from: Jb */
    public static synchronized void m49200Jb(String str, zzchh zzchh) {
        synchronized (zzenf.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27253t1)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzchh.mo43574c(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|(1:9)|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* renamed from: Kb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m49201Kb(java.lang.String r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f34530g     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            org.json.JSONObject r0 = r2.f34529f     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0027 }
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27253t1     // Catch:{ JSONException -> 0x0027 }
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ JSONException -> 0x0027 }
            java.lang.Object r3 = r0.mo42663b(r3)     // Catch:{ JSONException -> 0x0027 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x0027 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x0027 }
            if (r3 == 0) goto L_0x0027
            org.json.JSONObject r3 = r2.f34529f     // Catch:{ JSONException -> 0x0027 }
            java.lang.String r0 = "signal_error_code"
            r3.put(r0, r4)     // Catch:{ JSONException -> 0x0027 }
        L_0x0027:
            com.google.android.gms.internal.ads.zzchh r3 = r2.f34528d     // Catch:{ all -> 0x0033 }
            org.json.JSONObject r4 = r2.f34529f     // Catch:{ all -> 0x0033 }
            r3.mo43574c(r4)     // Catch:{ all -> 0x0033 }
            r3 = 1
            r2.f34530g = r3     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenf.m49201Kb(java.lang.String, int):void");
    }

    /* renamed from: R1 */
    public final synchronized void mo43184R1(zze zze) throws RemoteException {
        m49201Kb(zze.f1935c, 2);
    }

    /* renamed from: W */
    public final synchronized void mo43185W(String str) throws RemoteException {
        m49201Kb(str, 2);
    }

    /* renamed from: a */
    public final synchronized void mo45389a() {
        m49201Kb("Signal collection timeout.", 3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|(1:9)|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo45390d() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f34530g     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f27253t1     // Catch:{ JSONException -> 0x0021 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ JSONException -> 0x0021 }
            java.lang.Object r0 = r1.mo42663b(r0)     // Catch:{ JSONException -> 0x0021 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x0021 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x0021 }
            if (r0 == 0) goto L_0x0021
            org.json.JSONObject r0 = r3.f34529f     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r1 = "signal_error_code"
            r2 = 0
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0021 }
        L_0x0021:
            com.google.android.gms.internal.ads.zzchh r0 = r3.f34528d     // Catch:{ all -> 0x002d }
            org.json.JSONObject r1 = r3.f34529f     // Catch:{ all -> 0x002d }
            r0.mo43574c(r1)     // Catch:{ all -> 0x002d }
            r0 = 1
            r3.f34530g = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenf.mo45390d():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|(1:15)|16|17|18|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0031 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo43186z(java.lang.String r3) throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f34530g     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = "Adapter returned null signals"
            r2.mo43185W(r3)     // Catch:{ all -> 0x003d }
            monitor-exit(r2)
            return
        L_0x0010:
            org.json.JSONObject r0 = r2.f34529f     // Catch:{ JSONException -> 0x0031 }
            java.lang.String r1 = "signals"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0031 }
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27253t1     // Catch:{ JSONException -> 0x0031 }
            com.google.android.gms.internal.ads.zzbja r0 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ JSONException -> 0x0031 }
            java.lang.Object r3 = r0.mo42663b(r3)     // Catch:{ JSONException -> 0x0031 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x0031 }
            boolean r3 = r3.booleanValue()     // Catch:{ JSONException -> 0x0031 }
            if (r3 == 0) goto L_0x0031
            org.json.JSONObject r3 = r2.f34529f     // Catch:{ JSONException -> 0x0031 }
            java.lang.String r0 = "signal_error_code"
            r1 = 0
            r3.put(r0, r1)     // Catch:{ JSONException -> 0x0031 }
        L_0x0031:
            com.google.android.gms.internal.ads.zzchh r3 = r2.f34528d     // Catch:{ all -> 0x003d }
            org.json.JSONObject r0 = r2.f34529f     // Catch:{ all -> 0x003d }
            r3.mo43574c(r0)     // Catch:{ all -> 0x003d }
            r3 = 1
            r2.f34530g = r3     // Catch:{ all -> 0x003d }
            monitor-exit(r2)
            return
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzenf.mo43186z(java.lang.String):void");
    }
}
