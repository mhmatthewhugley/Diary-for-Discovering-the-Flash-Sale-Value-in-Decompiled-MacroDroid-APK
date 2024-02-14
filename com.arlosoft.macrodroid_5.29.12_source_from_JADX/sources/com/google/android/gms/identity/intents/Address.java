package com.google.android.gms.identity.intents;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.identity.zze;

/* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
public final class Address {
    @NonNull

    /* renamed from: a */
    public static final Api<AddressOptions> f4065a;

    /* renamed from: b */
    static final Api.ClientKey<zze> f4066b;

    /* renamed from: c */
    private static final Api.AbstractClientBuilder<zze, AddressOptions> f4067c;

    /* compiled from: com.google.android.gms:play-services-identity@@17.0.1 */
    public static final class AddressOptions implements Api.ApiOptions.HasOptions {

        /* renamed from: a */
        public final int f4068a = 0;
    }

    static {
        Api.ClientKey<zze> clientKey = new Api.ClientKey<>();
        f4066b = clientKey;
        zza zza = new zza();
        f4067c = zza;
        f4065a = new Api<>("Address.API", zza, clientKey);
    }
}
