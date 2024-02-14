package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzak;
import com.google.android.gms.internal.auth.zzar;

@KeepForSdk
public final class AuthProxy {

    /* renamed from: a */
    private static final Api.ClientKey<zzak> f2681a;

    /* renamed from: b */
    private static final Api.AbstractClientBuilder<zzak, AuthProxyOptions> f2682b;
    @KeepForSdk

    /* renamed from: c */
    public static final Api<AuthProxyOptions> f2683c;
    @KeepForSdk

    /* renamed from: d */
    public static final ProxyApi f2684d = new zzar();

    static {
        Api.ClientKey<zzak> clientKey = new Api.ClientKey<>();
        f2681a = clientKey;
        zza zza = new zza();
        f2682b = zza;
        f2683c = new Api<>("Auth.PROXY_API", zza, clientKey);
    }
}
