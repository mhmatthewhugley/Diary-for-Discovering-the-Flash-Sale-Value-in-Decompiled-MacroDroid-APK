package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzz implements FusedLocationProviderApi {
    /* renamed from: a */
    public final PendingResult<Status> mo50650a(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.mo21253i(new zzv(this, googleApiClient, locationListener));
    }

    /* renamed from: b */
    public final PendingResult<Status> mo50651b(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        Preconditions.m4489l(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient.mo21253i(new zzr(this, googleApiClient, locationRequest, locationListener));
    }
}
