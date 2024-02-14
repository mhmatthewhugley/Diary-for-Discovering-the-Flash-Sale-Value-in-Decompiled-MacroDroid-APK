package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzx implements zzxn {

    /* renamed from: c */
    private static final String f40748c = "zzzx";

    /* renamed from: a */
    private List f40749a;

    /* renamed from: a */
    public final zzzx mo50144a(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f40749a = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f40749a.add(optJSONArray.getString(i));
                }
            }
            return this;
        } catch (JSONException e) {
            throw zzabk.m56110a(e, f40748c, str);
        }
    }

    /* renamed from: b */
    public final List mo50145b() {
        return this.f40749a;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        mo50144a(str);
        return this;
    }
}
