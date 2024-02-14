package com.google.android.gms.internal.mlkit_translate;

import androidx.annotation.VisibleForTesting;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzqk {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Date f44460e = new Date(0);

    /* renamed from: a */
    private final JSONObject f44461a;

    /* renamed from: b */
    private final JSONObject f44462b;

    /* renamed from: c */
    private final Date f44463c;

    /* renamed from: d */
    private final JSONArray f44464d;

    @VisibleForTesting
    zzqk(JSONObject jSONObject, Date date, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.f44462b = jSONObject;
        this.f44463c = date;
        this.f44464d = jSONArray;
        this.f44461a = jSONObject2;
    }

    /* renamed from: a */
    public static zzqj m62206a() {
        return new zzqj((zzqi) null);
    }

    /* renamed from: c */
    public final Date mo52453c() {
        return this.f44463c;
    }

    /* renamed from: d */
    public final JSONObject mo52454d() {
        return this.f44462b;
    }

    public final String toString() {
        return this.f44461a.toString();
    }
}
