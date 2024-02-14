package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.internal.zzim;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzh extends Api.AbstractClientBuilder {
    zzh() {
    }

    /* renamed from: c */
    public final /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Wearable.WearableOptions wearableOptions = (Wearable.WearableOptions) obj;
        return new zzim(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }
}
