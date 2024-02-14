package com.google.android.gms.search;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.icing.zzav;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzb extends Api.AbstractClientBuilder<zzav, Api.ApiOptions.NoOptions> {
    zzb() {
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        return new zzav(context, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }
}
