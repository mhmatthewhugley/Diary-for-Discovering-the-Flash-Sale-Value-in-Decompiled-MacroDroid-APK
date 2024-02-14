package com.google.android.gms.common.internal.service;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class Common {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    public static final Api.ClientKey<zah> f3686a;
    @NonNull
    @KeepForSdk

    /* renamed from: b */
    public static final Api<Api.ApiOptions.NoOptions> f3687b;

    /* renamed from: c */
    private static final Api.AbstractClientBuilder f3688c;

    /* renamed from: d */
    public static final zae f3689d = new zae();

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        f3686a = clientKey;
        zab zab = new zab();
        f3688c = zab;
        f3687b = new Api<>("Common.API", zab, clientKey);
    }
}
