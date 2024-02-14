package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class PendingResults {
    private PendingResults() {
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static <R extends Result> PendingResult<R> m3682a(@NonNull R r, @NonNull GoogleApiClient googleApiClient) {
        Preconditions.m4489l(r, "Result must not be null");
        Preconditions.m4479b(!r.getStatus().mo21297q2(), "Status code must not be SUCCESS");
        zag zag = new zag(googleApiClient, r);
        zag.mo21329l(r);
        return zag;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: b */
    public static PendingResult<Status> m3683b(@NonNull Status status, @NonNull GoogleApiClient googleApiClient) {
        Preconditions.m4489l(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.mo21329l(status);
        return statusPendingResult;
    }
}
