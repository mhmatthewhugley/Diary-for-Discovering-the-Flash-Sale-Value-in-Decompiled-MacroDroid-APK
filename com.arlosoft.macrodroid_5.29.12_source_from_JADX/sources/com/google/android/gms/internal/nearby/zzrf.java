package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.nearby.uwb.zze;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzrf extends Api.AbstractClientBuilder {
    zzrf() {
    }

    /* renamed from: d */
    public final /* synthetic */ Api.Client mo20952d(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        return new zzqs(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, (zze) obj);
    }
}
