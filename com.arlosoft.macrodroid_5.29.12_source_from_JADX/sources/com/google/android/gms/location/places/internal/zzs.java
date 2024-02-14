package com.google.android.gms.location.places.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.location.places.PlacesOptions;

public final class zzs extends Api.AbstractClientBuilder<zzq, PlacesOptions> {
    /* renamed from: c */
    public final /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        PlacesOptions placesOptions = (PlacesOptions) obj;
        if (placesOptions == null) {
            placesOptions = new PlacesOptions.Builder().mo54262a();
        }
        return new zzq(context, looper, clientSettings, connectionCallbacks, onConnectionFailedListener, context.getPackageName(), placesOptions);
    }
}
