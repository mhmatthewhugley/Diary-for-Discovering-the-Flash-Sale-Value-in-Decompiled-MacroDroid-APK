package com.google.android.gms.location;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
public class GeofencingClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public GeofencingClient(@NonNull Context context) {
        super(context, LocationServices.f45843a, Api.ApiOptions.f3083b, GoogleApi.Settings.f3103c);
    }

    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @NonNull
    /* renamed from: G */
    public Task<Void> mo54161G(@NonNull GeofencingRequest geofencingRequest, @NonNull PendingIntent pendingIntent) {
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzaq(geofencingRequest.mo54169m2(mo21239y()), pendingIntent)).mo21409e(2424).mo21405a());
    }

    @NonNull
    /* renamed from: H */
    public Task<Void> mo54162H(@NonNull List<String> list) {
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzas(list)).mo21409e(2425).mo21405a());
    }
}
