package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzbso {
    /* renamed from: a */
    public static void m44053a(zzbsp zzbsp, String str, Map map) {
        try {
            zzbsp.mo42953b(str, zzaw.m1917b().mo43550i(map));
        } catch (JSONException unused) {
            zzcgp.m45229g("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: b */
    public static void m44054b(zzbsp zzbsp, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zzcgp.m45224b("Dispatching AFMA event: ".concat(sb.toString()));
        zzbsp.mo42955o(sb.toString());
    }

    /* renamed from: c */
    public static void m44055c(zzbsp zzbsp, String str, String str2) {
        zzbsp.mo42955o(str + "(" + str2 + ");");
    }

    /* renamed from: d */
    public static void m44056d(zzbsp zzbsp, String str, JSONObject jSONObject) {
        zzbsp.mo42956q(str, jSONObject.toString());
    }
}
