package com.google.android.gms.location;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.location.zzaf;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzz;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class LocationServices {
    @NonNull

    /* renamed from: a */
    public static final Api<Api.ApiOptions.NoOptions> f45843a;
    @NonNull
    @Deprecated

    /* renamed from: b */
    public static final FusedLocationProviderApi f45844b = new zzz();
    @NonNull
    @Deprecated

    /* renamed from: c */
    public static final GeofencingApi f45845c = new zzaf();
    @NonNull
    @Deprecated

    /* renamed from: d */
    public static final SettingsApi f45846d = new zzbi();

    /* renamed from: e */
    private static final Api.ClientKey<zzaz> f45847e;

    /* renamed from: f */
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> f45848f;

    static {
        Api.ClientKey<zzaz> clientKey = new Api.ClientKey<>();
        f45847e = clientKey;
        zzbh zzbh = new zzbh();
        f45848f = zzbh;
        f45843a = new Api<>("LocationServices.API", zzbh, clientKey);
    }

    private LocationServices() {
    }

    @NonNull
    /* renamed from: a */
    public static GeofencingClient m64681a(@NonNull Context context) {
        return new GeofencingClient(context);
    }
}
