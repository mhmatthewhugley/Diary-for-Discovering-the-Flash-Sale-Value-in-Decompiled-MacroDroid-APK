package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzecm implements zzfyn {

    /* renamed from: a */
    public final /* synthetic */ zzecp f33697a;

    /* renamed from: b */
    public final /* synthetic */ String f33698b;

    /* renamed from: c */
    public final /* synthetic */ String f33699c;

    public /* synthetic */ zzecm(zzecp zzecp, String str, String str2) {
        this.f33697a = zzecp;
        this.f33698b = str;
        this.f33699c = str2;
    }

    /* renamed from: a */
    public final zzfzp mo20417a(Object obj) {
        String str = this.f33698b;
        String str2 = this.f33699c;
        String str3 = (String) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("headers", new JSONObject());
            jSONObject3.put("body", str);
            jSONObject2.put("base_url", "");
            jSONObject2.put("signals", new JSONObject(str2));
            jSONObject.put("request", jSONObject2);
            jSONObject.put("response", jSONObject3);
            jSONObject.put("flags", new JSONObject());
            return zzfzg.m51414i(jSONObject);
        } catch (JSONException e) {
            throw new JSONException("Preloaded loader: ".concat(String.valueOf(e.getCause())));
        }
    }
}
