package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbyv;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class OfflinePingSender extends Worker {

    /* renamed from: a */
    private final zzbyv f2051a;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f2051a = zzaw.m1916a().mo19880k(context, new zzbvh());
    }

    @NonNull
    public final ListenableWorker.Result doWork() {
        try {
            this.f2051a.mo43228c();
            return ListenableWorker.Result.success();
        } catch (RemoteException unused) {
            return ListenableWorker.Result.failure();
        }
    }
}
