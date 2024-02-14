package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzcr implements DataApi.DeleteDataItemsResult {

    /* renamed from: a */
    private final Status f48219a;

    /* renamed from: c */
    private final int f48220c;

    public zzcr(Status status, int i) {
        this.f48219a = status;
        this.f48220c = i;
    }

    /* renamed from: I0 */
    public final int mo56197I0() {
        return this.f48220c;
    }

    public final Status getStatus() {
        return this.f48219a;
    }
}
