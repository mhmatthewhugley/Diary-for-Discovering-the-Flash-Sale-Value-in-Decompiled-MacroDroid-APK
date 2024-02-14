package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.ads.internal.zzt;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzecp {

    /* renamed from: a */
    private final zzcom f33702a;

    /* renamed from: b */
    private final Context f33703b;

    /* renamed from: c */
    private final zzcgv f33704c;

    /* renamed from: d */
    private final zzfef f33705d;

    /* renamed from: e */
    private final Executor f33706e;

    /* renamed from: f */
    private final String f33707f;

    /* renamed from: g */
    private final zzfju f33708g;

    /* renamed from: h */
    private final zzfer f33709h;

    /* renamed from: i */
    private final zzdxl f33710i;

    public zzecp(zzcom zzcom, Context context, zzcgv zzcgv, zzfef zzfef, Executor executor, String str, zzfju zzfju, zzdxl zzdxl) {
        this.f33702a = zzcom;
        this.f33703b = context;
        this.f33704c = zzcgv;
        this.f33705d = zzfef;
        this.f33706e = executor;
        this.f33707f = str;
        this.f33708g = zzfju;
        this.f33709h = zzcom.mo44215y();
        this.f33710i = zzdxl;
    }

    /* renamed from: c */
    private final zzfzp m48586c(String str, String str2) {
        zzfjj a = zzfji.m50258a(this.f33703b, 11);
        a.mo45794c();
        zzbuk a2 = zzt.m2895h().mo42996a(this.f33703b, this.f33704c, this.f33702a.mo44191B());
        zzbue zzbue = zzbuh.f27784b;
        zzfzp n = zzfzg.m51419n(zzfzg.m51419n(zzfzg.m51419n(zzfzg.m51414i(""), new zzecm(this, str, str2), this.f33706e), new zzecn(a2.mo43000a("google.afma.response.normalize", zzbue, zzbue)), this.f33706e), new zzeco(this), this.f33706e);
        zzfjt.m50318a(n, this.f33708g, a);
        return n;
    }

    /* renamed from: d */
    private final String m48587d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.f33707f));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zzcgp.m45229g("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    /* renamed from: e */
    private static final String m48588e(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfzp mo45169a() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfef r0 = r10.f33705d
            com.google.android.gms.ads.internal.client.zzl r0 = r0.f35629d
            java.lang.String r0 = r0.f1996O
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "true"
            if (r1 != 0) goto L_0x0115
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27068a6
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r3.mo42663b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0115
            java.lang.String r1 = m48588e(r0)
            com.google.android.gms.internal.ads.zzbiu r3 = com.google.android.gms.internal.ads.zzbjc.f27198n6
            com.google.android.gms.internal.ads.zzbja r4 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r4 = r4.mo42663b(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x004e
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x004e
            java.lang.String r1 = "&request_id="
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r5) goto L_0x004c
            int r1 = r1 + 12
            java.lang.String r1 = r0.substring(r1)
            goto L_0x004e
        L_0x004c:
            java.lang.String r1 = ""
        L_0x004e:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzekr r0 = new com.google.android.gms.internal.ads.zzekr
            r1 = 15
            java.lang.String r2 = "Invalid ad string."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfzp r0 = com.google.android.gms.internal.ads.zzfzg.m51413h(r0)
            return r0
        L_0x0062:
            com.google.android.gms.internal.ads.zzcom r4 = r10.f33702a
            com.google.android.gms.ads.nonagon.signalgeneration.zzc r4 = r4.mo44207q()
            com.google.android.gms.internal.ads.zzdxl r6 = r10.f33710i
            java.lang.String r4 = r4.mo20681b(r1, r6)
            com.google.android.gms.internal.ads.zzbja r6 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r3 = r6.mo42663b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0105
            com.google.android.gms.internal.ads.zzdxl r3 = r10.f33710i
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0105
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x009a }
            java.lang.String r7 = "is_gbid"
            java.lang.String r6 = r6.optString(r7)     // Catch:{ JSONException -> 0x009a }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x009a }
            if (r6 == 0) goto L_0x009a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x009a }
            goto L_0x009c
        L_0x009a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L_0x009c:
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x00a3
            goto L_0x0105
        L_0x00a3:
            java.lang.String r6 = "&"
            int r6 = r0.lastIndexOf(r6)
            r7 = 0
            if (r6 == r5) goto L_0x00b2
            r5 = 0
            java.lang.String r5 = r0.substring(r5, r6)
            goto L_0x00b3
        L_0x00b2:
            r5 = r7
        L_0x00b3:
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00ba
            goto L_0x0105
        L_0x00ba:
            r6 = 11
            byte[] r5 = android.util.Base64.decode(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            java.lang.String r6 = "UTF-8"
            byte[] r1 = r1.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d2 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r8 = "arek"
            java.lang.String r7 = r6.getString(r8)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00e9
        L_0x00d2:
            r6 = move-exception
            java.lang.String r8 = "Failed to get key from QueryJSONMap"
            java.lang.String r9 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            java.lang.String r8 = r8.concat(r9)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            com.google.android.gms.ads.internal.util.zze.m2645k(r8)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            com.google.android.gms.internal.ads.zzcfy r8 = com.google.android.gms.ads.internal.zzt.m2904q()     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            java.lang.String r9 = "CryptoUtils.getKeyFromQueryJsonMap"
            r8.mo43503t(r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
        L_0x00e9:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfer.m50028b(r5, r1, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x00ee }
            goto L_0x0105
        L_0x00ee:
            r1 = move-exception
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = "Failed to decode the adResponse. "
            java.lang.String r3 = r5.concat(r3)
            com.google.android.gms.ads.internal.util.zze.m2645k(r3)
            com.google.android.gms.internal.ads.zzcfy r3 = com.google.android.gms.ads.internal.zzt.m2904q()
            java.lang.String r5 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r3.mo43503t(r1, r5)
        L_0x0105:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x010c
            goto L_0x0115
        L_0x010c:
            java.lang.String r1 = r10.m48587d(r4)
            com.google.android.gms.internal.ads.zzfzp r0 = r10.m48586c(r0, r1)
            return r0
        L_0x0115:
            com.google.android.gms.internal.ads.zzfef r0 = r10.f33705d
            com.google.android.gms.ads.internal.client.zzl r0 = r0.f35629d
            com.google.android.gms.ads.internal.client.zzc r0 = r0.f1991J
            if (r0 == 0) goto L_0x0174
            com.google.android.gms.internal.ads.zzbiu r1 = com.google.android.gms.internal.ads.zzbjc.f27049Y5
            com.google.android.gms.internal.ads.zzbja r3 = com.google.android.gms.ads.internal.client.zzay.m1924c()
            java.lang.Object r1 = r3.mo42663b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0130
            goto L_0x015c
        L_0x0130:
            java.lang.String r1 = r0.f1867a
            java.lang.String r1 = m48588e(r1)
            java.lang.String r3 = r0.f1868c
            java.lang.String r3 = m48588e(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0169
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0169
            com.google.android.gms.internal.ads.zzcom r2 = r10.f33702a
            com.google.android.gms.ads.nonagon.signalgeneration.zzc r2 = r2.mo44207q()
            r2.mo20684f(r1)
            com.google.android.gms.internal.ads.zzdxl r2 = r10.f33710i
            java.util.Map r2 = r2.mo45036a()
            java.lang.String r3 = "rid"
            r2.put(r3, r1)
        L_0x015c:
            java.lang.String r1 = r0.f1867a
            java.lang.String r0 = r0.f1868c
            java.lang.String r0 = r10.m48587d(r0)
            com.google.android.gms.internal.ads.zzfzp r0 = r10.m48586c(r1, r0)
            return r0
        L_0x0169:
            com.google.android.gms.internal.ads.zzdxl r0 = r10.f33710i
            java.util.Map r0 = r0.mo45036a()
            java.lang.String r1 = "ridmm"
            r0.put(r1, r2)
        L_0x0174:
            com.google.android.gms.internal.ads.zzekr r0 = new com.google.android.gms.internal.ads.zzekr
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfzp r0 = com.google.android.gms.internal.ads.zzfzg.m51413h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecp.mo45169a():com.google.android.gms.internal.ads.zzfzp");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ zzfzp mo45170b(JSONObject jSONObject) throws Exception {
        return zzfzg.m51414i(new zzfdw(new zzfdt(this.f33705d), zzfdv.m49948a(new StringReader(jSONObject.toString()))));
    }
}
