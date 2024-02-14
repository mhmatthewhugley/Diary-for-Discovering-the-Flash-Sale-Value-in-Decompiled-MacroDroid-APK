package com.google.firebase.appindexing.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zze extends Api.AbstractClientBuilder<zzf, Api.ApiOptions.NoOptions> {
    zze() {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        return new zzf(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }
}