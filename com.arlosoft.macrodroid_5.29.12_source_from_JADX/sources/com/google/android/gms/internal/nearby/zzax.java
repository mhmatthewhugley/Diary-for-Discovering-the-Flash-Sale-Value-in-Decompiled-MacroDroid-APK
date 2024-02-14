package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationClient;
import com.google.android.gms.nearby.zza;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzax extends GoogleApi implements ExposureNotificationClient {

    /* renamed from: k */
    private static final Api f44561k = new Api("Nearby.EXPOSURE_NOTIFICATION_API", new zzap(), new Api.ClientKey());

    /* renamed from: l */
    private static final long f44562l;

    /* renamed from: m */
    private static final long f44563m;

    /* renamed from: n */
    public static final /* synthetic */ int f44564n = 0;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f44562l = timeUnit.toMillis(2);
        f44563m = timeUnit.toMillis(60);
    }

    /* renamed from: H */
    private final Task m62304H(DiagnosisKeyFileProvider diagnosisKeyFileProvider, ExposureConfiguration exposureConfiguration, String str) {
        return zzfd.m62442a(mo21235u(TaskApiCall.m3866c().mo21406b(new zzaf(this, exposureConfiguration, diagnosisKeyFileProvider, str)).mo21408d(zza.f47887o).mo21405a()), f44563m);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final /* synthetic */ Task mo52535G(List list, ExposureConfiguration exposureConfiguration, String str, Task task) throws Exception {
        if (((Long) task.mo23715p()).longValue() >= 17203704004L) {
            return m62304H(new DiagnosisKeyFileProvider(list), exposureConfiguration, str);
        }
        return mo21235u(TaskApiCall.m3866c().mo21406b(new zzah(this, list, exposureConfiguration, str)).mo21408d(zza.f47880h).mo21405a());
    }
}
