package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzq implements Result {

    /* renamed from: a */
    private final Status f39244a;

    public zzq(Status status) {
        this.f39244a = status;
    }

    public final Status getStatus() {
        return this.f39244a;
    }
}
