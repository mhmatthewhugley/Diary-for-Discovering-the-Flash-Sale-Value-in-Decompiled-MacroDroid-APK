package com.google.android.gms.nearby.uwb;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zze implements Api.ApiOptions.HasOptions {

    /* renamed from: a */
    private final int f47853a;

    /* renamed from: c */
    private final boolean f47854c;

    /* renamed from: a */
    public final int mo56062a() {
        return this.f47853a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zze = (zze) obj;
        boolean z = zze.f47854c;
        return Objects.m4470a(Integer.valueOf(this.f47853a), Integer.valueOf(zze.f47853a)) && Objects.m4470a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f47853a), Boolean.FALSE, null);
    }
}
