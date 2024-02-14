package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcvv implements zzgxi {

    /* renamed from: a */
    private final zzgxv f31709a;

    public zzcvv(zzgxv zzgxv) {
        this.f31709a = zzgxv;
    }

    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((zzczu) this.f31709a).mo44512a().f35493A);
        } catch (JSONException unused) {
            return null;
        }
    }
}
