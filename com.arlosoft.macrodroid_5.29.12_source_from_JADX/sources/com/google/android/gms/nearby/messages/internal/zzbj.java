package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.nearby.messages.MessagesOptions;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzbj extends Api.AbstractClientBuilder {
    zzbj() {
    }

    /* renamed from: b */
    public final int mo21194b() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public final /* synthetic */ Api.Client mo20768c(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zzai(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, (MessagesOptions) obj);
    }
}
