package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.IStatusCallback;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class StatusCallback extends IStatusCallback.Stub {
    @KeepForSdk

    /* renamed from: a */
    private final BaseImplementation.ResultHolder<Status> f3234a;

    @KeepForSdk
    public StatusCallback(@NonNull BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f3234a = resultHolder;
    }

    @KeepForSdk
    /* renamed from: j8 */
    public void mo21356j8(@NonNull Status status) {
        this.f3234a.mo21038a(status);
    }
}
