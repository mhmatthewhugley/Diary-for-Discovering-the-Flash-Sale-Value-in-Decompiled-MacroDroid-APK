package com.google.android.gms.location;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzbt implements BaseImplementation.ResultHolder<LocationSettingsResult> {

    /* renamed from: a */
    private final TaskCompletionSource<LocationSettingsResponse> f46096a;

    public zzbt(TaskCompletionSource<LocationSettingsResponse> taskCompletionSource) {
        this.f46096a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) obj;
        Status status = locationSettingsResult.getStatus();
        if (status.mo21297q2()) {
            this.f46096a.mo56139c(new LocationSettingsResponse(locationSettingsResult));
        } else if (status.mo21296p2()) {
            this.f46096a.mo56138b(new ResolvableApiException(status));
        } else {
            this.f46096a.mo56138b(new ApiException(status));
        }
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f46096a.mo56138b(new ApiException(status));
    }
}
