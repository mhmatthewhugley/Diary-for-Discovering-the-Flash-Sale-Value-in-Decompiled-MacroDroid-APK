package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzda extends DataClient.GetFdForAssetResponse {

    /* renamed from: a */
    private final DataApi.GetFdForAssetResult f48237a;

    zzda(DataApi.GetFdForAssetResult getFdForAssetResult) {
        this.f48237a = getFdForAssetResult;
    }

    public final void release() {
        this.f48237a.release();
    }
}
