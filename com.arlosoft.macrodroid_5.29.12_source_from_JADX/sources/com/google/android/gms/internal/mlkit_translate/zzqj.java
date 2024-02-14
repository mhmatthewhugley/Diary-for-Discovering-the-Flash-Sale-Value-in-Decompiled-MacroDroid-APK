package com.google.android.gms.internal.mlkit_translate;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzqj {

    /* renamed from: a */
    private JSONObject f44457a = new JSONObject();

    /* renamed from: b */
    private Date f44458b = zzqk.f44460e;

    /* renamed from: c */
    private JSONArray f44459c = new JSONArray();

    private zzqj() {
    }

    /* renamed from: a */
    public final zzqj mo52449a(JSONObject jSONObject) {
        try {
            this.f44457a = new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: b */
    public final zzqj mo52450b(JSONArray jSONArray) {
        try {
            this.f44459c = new JSONArray(jSONArray.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: c */
    public final zzqj mo52451c(Date date) {
        this.f44458b = date;
        return this;
    }

    /* renamed from: d */
    public final zzqk mo52452d() throws JSONException {
        return new zzqk(this.f44457a, this.f44458b, this.f44459c);
    }

    /* synthetic */ zzqj(zzqi zzqi) {
    }
}
