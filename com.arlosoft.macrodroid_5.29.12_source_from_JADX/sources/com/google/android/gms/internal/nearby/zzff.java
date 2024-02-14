package com.google.android.gms.internal.nearby;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzff {

    /* renamed from: a */
    private final Class f44622a;
    @Nullable

    /* renamed from: b */
    private final Api.ApiOptions f44623b = null;

    zzff(GoogleApi googleApi, @Nullable Api.ApiOptions apiOptions) {
        this.f44622a = googleApi.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzff) || !Objects.m4470a(this.f44622a, ((zzff) obj).f44622a) || !Objects.m4470a((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.m4471b(this.f44622a, null);
    }
}
