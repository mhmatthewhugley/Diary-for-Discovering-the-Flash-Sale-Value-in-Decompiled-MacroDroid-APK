package com.google.android.gms.common.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class TelemetryLoggingOptions implements Api.ApiOptions.Optional {
    @NonNull

    /* renamed from: c */
    public static final TelemetryLoggingOptions f3683c = m4510a().mo21739a();
    @Nullable

    /* renamed from: a */
    private final String f3684a;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Builder {
        @Nullable

        /* renamed from: a */
        private String f3685a;

        private Builder() {
        }

        /* synthetic */ Builder(zaac zaac) {
        }

        @NonNull
        @KeepForSdk
        /* renamed from: a */
        public TelemetryLoggingOptions mo21739a() {
            return new TelemetryLoggingOptions(this.f3685a, (zaad) null);
        }

        @NonNull
        @KeepForSdk
        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder mo21740b(@Nullable String str) {
            this.f3685a = str;
            return this;
        }
    }

    /* synthetic */ TelemetryLoggingOptions(String str, zaad zaad) {
        this.f3684a = str;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static Builder m4510a() {
        return new Builder((zaac) null);
    }

    @NonNull
    /* renamed from: b */
    public final Bundle mo21736b() {
        Bundle bundle = new Bundle();
        String str = this.f3684a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TelemetryLoggingOptions)) {
            return false;
        }
        return Objects.m4470a(this.f3684a, ((TelemetryLoggingOptions) obj).f3684a);
    }

    public final int hashCode() {
        return Objects.m4471b(this.f3684a);
    }
}
