package com.google.android.gms.internal.p202authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzq extends IStatusCallback.Stub {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39110a;

    zzq(zzn zzn, TaskCompletionSource taskCompletionSource) {
        this.f39110a = taskCompletionSource;
    }

    /* renamed from: j8 */
    public final void mo21356j8(Status status) {
        if (status.mo21294n2() == 6) {
            this.f39110a.mo56140d(ApiExceptionUtil.m4340a(status));
        } else {
            TaskUtil.m3877a(status, this.f39110a);
        }
    }
}
