package com.google.android.gms.internal.p202authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzy */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzy extends zzk {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39116a;

    zzy(zzu zzu, TaskCompletionSource taskCompletionSource) {
        this.f39116a = taskCompletionSource;
    }

    /* renamed from: Q0 */
    public final void mo48507Q0(Status status) {
        TaskUtil.m3877a(status, this.f39116a);
    }
}
