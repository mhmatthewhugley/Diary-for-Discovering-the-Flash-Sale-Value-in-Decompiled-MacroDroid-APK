package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataItem;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzcq implements DataApi.DataItemResult {

    /* renamed from: a */
    private final Status f48217a;

    /* renamed from: c */
    private final DataItem f48218c;

    public zzcq(Status status, DataItem dataItem) {
        this.f48217a = status;
        this.f48218c = dataItem;
    }

    public final Status getStatus() {
        return this.f48217a;
    }

    /* renamed from: j0 */
    public final DataItem mo56195j0() {
        return this.f48218c;
    }
}
