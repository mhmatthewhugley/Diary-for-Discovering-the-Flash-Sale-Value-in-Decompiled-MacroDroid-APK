package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final /* synthetic */ class zzd implements RemoteCall {

    /* renamed from: a */
    private final ActivityRecognitionClient f46103a;

    /* renamed from: b */
    private final PendingIntent f46104b;

    /* renamed from: c */
    private final SleepSegmentRequest f46105c;

    zzd(ActivityRecognitionClient activityRecognitionClient, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.f46103a = activityRecognitionClient;
        this.f46104b = pendingIntent;
        this.f46105c = sleepSegmentRequest;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ActivityRecognitionClient activityRecognitionClient = this.f46103a;
        ((zzam) ((zzaz) obj).mo21626I()).mo50531tb(this.f46104b, this.f46105c, new zzi(activityRecognitionClient, (TaskCompletionSource) obj2));
    }
}
