package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.DataItemAsset;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzdg extends DataBufferRef implements DataItemAsset {
    public zzdg(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: S */
    public final String mo56198S() {
        return mo21557d("asset_key");
    }

    public final String getId() {
        return mo21557d("asset_id");
    }
}
