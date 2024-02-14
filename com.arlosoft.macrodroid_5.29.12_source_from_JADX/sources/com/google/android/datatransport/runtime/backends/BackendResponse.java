package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    /* renamed from: a */
    public static BackendResponse m1301a() {
        return new AutoValue_BackendResponse(Status.FATAL_ERROR, -1);
    }

    /* renamed from: d */
    public static BackendResponse m1302d() {
        return new AutoValue_BackendResponse(Status.INVALID_PAYLOAD, -1);
    }

    /* renamed from: e */
    public static BackendResponse m1303e(long j) {
        return new AutoValue_BackendResponse(Status.OK, j);
    }

    /* renamed from: f */
    public static BackendResponse m1304f() {
        return new AutoValue_BackendResponse(Status.TRANSIENT_ERROR, -1);
    }

    /* renamed from: b */
    public abstract long mo19476b();

    /* renamed from: c */
    public abstract Status mo19477c();
}
