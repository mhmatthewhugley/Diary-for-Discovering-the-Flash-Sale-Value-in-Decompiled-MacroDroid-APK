package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfei {

    /* renamed from: a */
    private final JSONObject f35645a;

    public zzfei(JSONObject jSONObject) {
        this.f35645a = jSONObject;
    }

    @Nullable
    /* renamed from: a */
    public final String mo45627a() {
        if (mo45628b() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    /* renamed from: b */
    public final int mo45628b() {
        int optInt = this.f35645a.optInt("media_type", -1);
        if (optInt != 0) {
            return optInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
