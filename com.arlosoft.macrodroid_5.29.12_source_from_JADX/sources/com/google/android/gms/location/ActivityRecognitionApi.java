package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

@Deprecated
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public interface ActivityRecognitionApi {
    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @NonNull
    /* renamed from: a */
    PendingResult<Status> mo50638a(@NonNull GoogleApiClient googleApiClient, @NonNull PendingIntent pendingIntent);

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @NonNull
    /* renamed from: b */
    PendingResult<Status> mo50639b(@NonNull GoogleApiClient googleApiClient, long j, @NonNull PendingIntent pendingIntent);
}
