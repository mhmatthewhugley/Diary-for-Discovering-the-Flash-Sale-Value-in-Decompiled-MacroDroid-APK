package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcgp;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class WorkManagerUtil extends zzbq {
    /* renamed from: Jb */
    private static void m2508Jb(Context context) {
        try {
            WorkManager.initialize(context.getApplicationContext(), new Configuration.Builder().build());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        m2508Jb(context);
        try {
            WorkManager instance = WorkManager.getInstance(context);
            instance.cancelAllWorkByTag("offline_ping_sender_work");
            instance.enqueue((WorkRequest) (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(OfflinePingSender.class).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build())).addTag("offline_ping_sender_work")).build());
        } catch (IllegalStateException e) {
            zzcgp.m45230h("Failed to instantiate WorkManager.", e);
        }
    }

    public final boolean zzf(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2) {
        Context context = (Context) ObjectWrapper.m5050A1(iObjectWrapper);
        m2508Jb(context);
        Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        try {
            WorkManager.getInstance(context).enqueue((WorkRequest) (OneTimeWorkRequest) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) ((OneTimeWorkRequest.Builder) new OneTimeWorkRequest.Builder(OfflineNotificationPoster.class).setConstraints(build)).setInputData(new Data.Builder().putString("uri", str).putString("gws_query_id", str2).build())).addTag("offline_notification_work")).build());
            return true;
        } catch (IllegalStateException e) {
            zzcgp.m45230h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
