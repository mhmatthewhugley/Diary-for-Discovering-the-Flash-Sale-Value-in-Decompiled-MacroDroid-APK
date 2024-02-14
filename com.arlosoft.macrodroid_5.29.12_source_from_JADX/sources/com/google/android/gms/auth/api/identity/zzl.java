package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzl implements Api.ApiOptions.Optional {

    /* renamed from: a */
    private final String f2832a;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class zzc {
        private zzc() {
        }
    }

    /* renamed from: a */
    public final Bundle mo20943a() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.f2832a);
        return bundle;
    }

    /* renamed from: b */
    public final String mo20944b() {
        return this.f2832a;
    }

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof zzl;
    }

    public final int hashCode() {
        return Objects.m4471b(zzl.class);
    }
}
