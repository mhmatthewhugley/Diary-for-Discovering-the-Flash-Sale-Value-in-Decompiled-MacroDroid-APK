package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class BatchResult implements Result {

    /* renamed from: a */
    private final Status f3089a;

    /* renamed from: c */
    private final PendingResult[] f3090c;

    BatchResult(Status status, PendingResult[] pendingResultArr) {
        this.f3089a = status;
        this.f3090c = pendingResultArr;
    }

    @NonNull
    public Status getStatus() {
        return this.f3089a;
    }
}
