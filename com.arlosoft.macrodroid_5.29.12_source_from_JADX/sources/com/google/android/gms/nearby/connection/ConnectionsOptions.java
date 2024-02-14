package com.google.android.gms.nearby.connection;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public class ConnectionsOptions implements Api.ApiOptions.Optional {
    @Nullable

    /* renamed from: a */
    private final String f47429a;

    /* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
    public static class Builder {
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionsOptions)) {
            return false;
        }
        String str = ((ConnectionsOptions) obj).f47429a;
        return Objects.m4470a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Objects.m4471b(null);
    }
}
