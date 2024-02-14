package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.VisibleForTesting;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzewi implements zzevd {
    @Nullable
    @VisibleForTesting

    /* renamed from: a */
    final String f35082a;
    @VisibleForTesting

    /* renamed from: b */
    final int f35083b;

    public zzewi(@Nullable String str, int i) {
        this.f35082a = str;
        this.f35083b = i;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo45422d(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (!TextUtils.isEmpty(this.f35082a) && this.f35083b != -1) {
            try {
                JSONObject f = zzbu.m2596f(jSONObject, "pii");
                f.put("pvid", this.f35082a);
                f.put("pvid_s", this.f35083b);
            } catch (JSONException e) {
                zze.m2646l("Failed putting gms core app set ID info.", e);
            }
        }
    }
}
