package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class ApiKey<O extends Api.ApiOptions> {

    /* renamed from: a */
    private final int f3146a;

    /* renamed from: b */
    private final Api f3147b;
    @Nullable

    /* renamed from: c */
    private final Api.ApiOptions f3148c;
    @Nullable

    /* renamed from: d */
    private final String f3149d;

    private ApiKey(Api api, @Nullable Api.ApiOptions apiOptions, @Nullable String str) {
        this.f3147b = api;
        this.f3148c = apiOptions;
        this.f3149d = str;
        this.f3146a = Objects.m4471b(api, apiOptions, str);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <O extends Api.ApiOptions> ApiKey<O> m3705a(@NonNull Api<O> api, @Nullable O o, @Nullable String str) {
        return new ApiKey<>(api, o, str);
    }

    @NonNull
    /* renamed from: b */
    public final String mo21304b() {
        return this.f3147b.mo21191d();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.m4470a(this.f3147b, apiKey.f3147b) && Objects.m4470a(this.f3148c, apiKey.f3148c) && Objects.m4470a(this.f3149d, apiKey.f3149d);
    }

    public final int hashCode() {
        return this.f3146a;
    }
}
