package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class StatusPendingResult extends BasePendingResult<Status> {
    @KeepForSdk
    public StatusPendingResult(@NonNull GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Result mo21036h(@NonNull Status status) {
        return status;
    }
}
