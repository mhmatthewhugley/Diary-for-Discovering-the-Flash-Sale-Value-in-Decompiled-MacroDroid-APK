package com.google.android.gms.location;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public interface FusedLocationProviderApi {
    @NonNull
    /* renamed from: a */
    PendingResult<Status> mo50650a(@NonNull GoogleApiClient googleApiClient, @NonNull LocationListener locationListener);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @NonNull
    /* renamed from: b */
    PendingResult<Status> mo50651b(@NonNull GoogleApiClient googleApiClient, @NonNull LocationRequest locationRequest, @NonNull LocationListener locationListener);
}
