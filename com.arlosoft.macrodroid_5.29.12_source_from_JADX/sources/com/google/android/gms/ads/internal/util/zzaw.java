package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzfzp;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaw {

    /* renamed from: a */
    private final Object f2190a = new Object();

    /* renamed from: b */
    private String f2191b = "";

    /* renamed from: c */
    private String f2192c = "";

    /* renamed from: d */
    private boolean f2193d = false;

    /* renamed from: e */
    private boolean f2194e = false;
    @VisibleForTesting

    /* renamed from: f */
    protected String f2195f = "";

    /* renamed from: g */
    private zzeak f2196g;

    @Nullable
    @VisibleForTesting
    /* renamed from: o */
    protected static final String m2548o(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(HTTP.USER_AGENT, zzt.m2905r().mo20412z(context, str2));
        zzfzp b = new zzbo(context).mo20332b(0, str, hashMap, (byte[]) null);
        try {
            return (String) b.get((long) ((Integer) zzay.m1924c().mo42663b(zzbjc.f27000T3)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            zzcgp.m45227e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e);
            b.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            zzcgp.m45227e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e2);
            b.cancel(true);
            return null;
        } catch (Exception e3) {
            zzcgp.m45227e("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* renamed from: p */
    private final Uri m2549p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f2190a) {
            if (TextUtils.isEmpty(this.f2191b)) {
                zzt.m2905r();
                try {
                    str5 = new String(IOUtils.m4892e(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    zzcgp.m45224b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f2191b = str5;
                if (TextUtils.isEmpty(str5)) {
                    zzt.m2905r();
                    this.f2191b = UUID.randomUUID().toString();
                    zzt.m2905r();
                    String str6 = this.f2191b;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        zzcgp.m45227e("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.f2191b;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    /* renamed from: a */
    public final zzeak mo20297a() {
        return this.f2196g;
    }

    /* renamed from: b */
    public final String mo20298b() {
        String str;
        synchronized (this.f2190a) {
            str = this.f2192c;
        }
        return str;
    }

    /* renamed from: c */
    public final void mo20299c(Context context) {
        zzeak zzeak;
        if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue() && (zzeak = this.f2196g) != null) {
            zzeak.mo45129h(new zzat(this, context), zzeaj.DEBUG_MENU);
        }
    }

    /* renamed from: d */
    public final void mo20300d(Context context, String str, String str2) {
        zzt.m2905r();
        zzs.m2766q(context, m2549p(context, (String) zzay.m1924c().mo42663b(zzbjc.f26960P3), str, str2));
    }

    /* renamed from: e */
    public final void mo20301e(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = m2549p(context, (String) zzay.m1924c().mo42663b(zzbjc.f26990S3), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzt.m2905r();
        zzs.m2757h(context, str, buildUpon.build().toString());
    }

    /* renamed from: f */
    public final void mo20302f(boolean z) {
        synchronized (this.f2190a) {
            this.f2194e = z;
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue()) {
                zzt.m2904q().mo43494h().mo20362c0(z);
                zzeak zzeak = this.f2196g;
                if (zzeak != null) {
                    zzeak.mo45131j(z);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo20303g(zzeak zzeak) {
        this.f2196g = zzeak;
    }

    /* renamed from: h */
    public final void mo20304h(boolean z) {
        synchronized (this.f2190a) {
            this.f2193d = z;
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    /* renamed from: i */
    public final void mo20305i(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            zzcgp.m45228f("Can not create dialog without Activity Context");
        } else {
            zzs.f2304i.post(new zzav(this, context, str, z, z2));
        }
    }

    /* renamed from: j */
    public final boolean mo20306j(Context context, String str, String str2) {
        String o = m2548o(context, m2549p(context, (String) zzay.m1924c().mo42663b(zzbjc.f26980R3), str, str2).toString(), str2);
        if (TextUtils.isEmpty(o)) {
            zzcgp.m45224b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(o.trim()).optString("debug_mode"));
            mo20302f(equals);
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27004T7)).booleanValue()) {
                zzg h = zzt.m2904q().mo43494h();
                if (true != equals) {
                    str = "";
                }
                h.mo20364d0(str);
            }
            return equals;
        } catch (JSONException e) {
            zzcgp.m45230h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo20307k(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbiu r0 = com.google.android.gms.internal.ads.zzbjc.f26970Q3
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r0 = r1.mo42663b(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.m2549p(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = m2548o(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0025
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.internal.ads.zzcgp.m45224b(r4)
            return r0
        L_0x0025:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0083 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0083 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0083 }
            r3.f2195f = r6     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.zzbiu r6 = com.google.android.gms.internal.ads.zzbjc.f27004T7     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.zzbja r1 = com.google.android.gms.ads.internal.client.zzay.m1924c()     // Catch:{ JSONException -> 0x0083 }
            java.lang.Object r6 = r1.mo42663b(r6)     // Catch:{ JSONException -> 0x0083 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0083 }
            r1 = 1
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.f2195f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 != 0) goto L_0x0066
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.f2195f     // Catch:{ JSONException -> 0x0083 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0083 }
            if (r6 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r6 = 0
            goto L_0x0067
        L_0x0066:
            r6 = 1
        L_0x0067:
            r3.mo20302f(r6)     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.internal.ads.zzcfy r2 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ JSONException -> 0x0083 }
            com.google.android.gms.ads.internal.util.zzg r2 = r2.mo43494h()     // Catch:{ JSONException -> 0x0083 }
            if (r1 == r6) goto L_0x0076
            java.lang.String r5 = ""
        L_0x0076:
            r2.mo20364d0(r5)     // Catch:{ JSONException -> 0x0083 }
        L_0x0079:
            java.lang.Object r5 = r3.f2190a
            monitor-enter(r5)
            r3.f2192c = r4     // Catch:{ all -> 0x0080 }
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            return r1
        L_0x0080:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0080 }
            throw r4
        L_0x0083:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.internal.ads.zzcgp.m45230h(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzaw.mo20307k(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: l */
    public final boolean mo20308l() {
        boolean z;
        synchronized (this.f2190a) {
            z = this.f2194e;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo20309m() {
        boolean z;
        synchronized (this.f2190a) {
            z = this.f2193d;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean mo20310n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !mo20309m()) {
            return false;
        }
        zzcgp.m45224b("Sending troubleshooting signals to the server.");
        mo20301e(context, str, str2, str3);
        return true;
    }
}
