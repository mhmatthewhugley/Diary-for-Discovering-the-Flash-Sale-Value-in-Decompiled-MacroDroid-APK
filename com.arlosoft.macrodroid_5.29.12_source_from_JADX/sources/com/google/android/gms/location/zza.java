package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.location.zzaz;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zza extends Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> {
    zza() {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        return new zzaz(context, looper, connectionCallbacks, onConnectionFailedListener, "activity_recognition", ClientSettings.m4412a(context));
    }
}
