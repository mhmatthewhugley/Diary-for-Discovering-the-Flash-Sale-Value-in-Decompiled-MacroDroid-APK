package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.nearby.connection.ConnectionsOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzis extends Api.AbstractClientBuilder {
    zzis() {
    }

    /* renamed from: c */
    public final /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zzgy(context, looper, clientSettings, (ConnectionsOptions) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
