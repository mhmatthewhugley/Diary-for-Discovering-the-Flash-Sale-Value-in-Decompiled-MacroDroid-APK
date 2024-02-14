package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzct implements DataApi {
    /* renamed from: a */
    public final PendingResult<DataApi.DataItemResult> mo56194a(GoogleApiClient googleApiClient, PutDataRequest putDataRequest) {
        return googleApiClient.mo21252h(new zzch(this, googleApiClient, putDataRequest));
    }
}
