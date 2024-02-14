package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzap extends Api.AbstractClientBuilder {
    zzap() {
    }

    /* renamed from: d */
    public final /* synthetic */ Api.Client mo20952d(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        Api.ApiOptions.NoOptions noOptions = (Api.ApiOptions.NoOptions) obj;
        return new zzn(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings);
    }
}
