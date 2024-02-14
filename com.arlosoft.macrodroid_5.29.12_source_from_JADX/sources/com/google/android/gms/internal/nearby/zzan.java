package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzan extends zzdt {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44551a;

    zzan(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.f44551a = taskCompletionSource;
    }

    /* renamed from: z6 */
    public final void mo52527z6(Status status, PackageConfiguration packageConfiguration) {
        TaskUtil.m3880d(status, packageConfiguration, this.f44551a);
    }
}
