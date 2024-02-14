package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class LoadAdError extends AdError {
    @Nullable

    /* renamed from: e */
    private final ResponseInfo f1700e;

    public LoadAdError(int i, @NonNull String str, @NonNull String str2, @Nullable AdError adError, @Nullable ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.f1700e = responseInfo;
    }

    @NonNull
    /* renamed from: e */
    public final JSONObject mo19649e() throws JSONException {
        JSONObject e = super.mo19649e();
        ResponseInfo f = mo19724f();
        if (f == null) {
            e.put("Response Info", "null");
        } else {
            e.put("Response Info", f.mo19746g());
        }
        return e;
    }

    @Nullable
    /* renamed from: f */
    public ResponseInfo mo19724f() {
        return this.f1700e;
    }

    @NonNull
    public String toString() {
        try {
            return mo19649e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
