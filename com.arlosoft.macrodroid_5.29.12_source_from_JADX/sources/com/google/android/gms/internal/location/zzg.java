package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognitionApi;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public final class zzg implements ActivityRecognitionApi {
    /* renamed from: a */
    public final PendingResult<Status> mo50638a(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.mo21253i(new zze(this, googleApiClient, pendingIntent));
    }

    /* renamed from: b */
    public final PendingResult<Status> mo50639b(GoogleApiClient googleApiClient, long j, PendingIntent pendingIntent) {
        return googleApiClient.mo21253i(new zzd(this, googleApiClient, j, pendingIntent));
    }
}
