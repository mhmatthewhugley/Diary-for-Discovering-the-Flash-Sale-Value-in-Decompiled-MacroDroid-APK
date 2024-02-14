package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class ActivityRecognitionClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public ActivityRecognitionClient(@NonNull Context context) {
        super(context, LocationServices.f45843a, Api.ApiOptions.f3083b, GoogleApi.Settings.f3103c);
    }

    @NonNull
    /* renamed from: G */
    public Task<Void> mo54116G(@NonNull PendingIntent pendingIntent) {
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzh(pendingIntent)).mo21409e(2411).mo21405a());
    }

    @RequiresPermission("com.google.android.gms.permission.ACTIVITY_RECOGNITION")
    @NonNull
    /* renamed from: H */
    public Task<Void> mo54117H(@NonNull PendingIntent pendingIntent, @NonNull SleepSegmentRequest sleepSegmentRequest) {
        Preconditions.m4489l(pendingIntent, "PendingIntent must be specified.");
        return mo21230p(TaskApiCall.m3866c().mo21406b(new zzd(this, pendingIntent, sleepSegmentRequest)).mo21408d(zzu.f46119b).mo21409e(2410).mo21405a());
    }
}
