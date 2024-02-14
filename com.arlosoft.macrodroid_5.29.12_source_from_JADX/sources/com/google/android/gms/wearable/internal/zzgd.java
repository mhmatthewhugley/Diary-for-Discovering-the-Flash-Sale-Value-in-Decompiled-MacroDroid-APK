package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.NodeApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzgd implements NodeApi {
    /* renamed from: a */
    public final PendingResult<NodeApi.GetConnectedNodesResult> mo56223a(GoogleApiClient googleApiClient) {
        return googleApiClient.mo21252h(new zzga(this, googleApiClient));
    }
}
