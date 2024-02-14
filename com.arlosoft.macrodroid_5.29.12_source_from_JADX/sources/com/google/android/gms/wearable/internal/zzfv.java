package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzfv implements Result {

    /* renamed from: a */
    private final Status f48320a;

    /* renamed from: c */
    private final byte[] f48321c;

    public zzfv(Status status, int i, byte[] bArr) {
        this.f48320a = status;
        this.f48321c = bArr;
    }

    /* renamed from: a */
    public final byte[] mo56452a() {
        return this.f48321c;
    }

    public final Status getStatus() {
        return this.f48320a;
    }
}
