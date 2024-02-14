package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class zzf implements Api.ApiOptions.Optional {

    /* renamed from: a */
    private final String f2831a;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class zzc {
        private zzc() {
        }
    }

    /* renamed from: a */
    public final Bundle mo20930a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f2831a);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof zzf;
    }

    public int hashCode() {
        return Objects.m4471b(zzf.class);
    }
}
