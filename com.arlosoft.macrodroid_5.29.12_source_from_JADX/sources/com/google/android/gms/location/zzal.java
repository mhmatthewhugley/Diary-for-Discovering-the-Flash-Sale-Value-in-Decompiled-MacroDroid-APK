package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
final class zzal extends zzah {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f46076a;

    zzal(FusedLocationProviderClient fusedLocationProviderClient, TaskCompletionSource taskCompletionSource) {
        this.f46076a = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo50508a() {
    }

    /* renamed from: gb */
    public final void mo50509gb(zzaa zzaa) throws RemoteException {
        Status status = zzaa.getStatus();
        if (status == null) {
            this.f46076a.mo56140d(new ApiException(new Status(8, "Got null status from location service")));
        } else if (status.mo21294n2() == 0) {
            this.f46076a.mo56139c(Boolean.TRUE);
        } else {
            this.f46076a.mo56140d(ApiExceptionUtil.m4340a(status));
        }
    }
}
