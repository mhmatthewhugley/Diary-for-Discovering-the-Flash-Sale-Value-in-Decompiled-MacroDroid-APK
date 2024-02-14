package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzp implements Result {

    /* renamed from: a */
    private final Status f39243a;

    public zzp(Status status) {
        this.f39243a = status;
    }

    public final Status getStatus() {
        return this.f39243a;
    }
}
