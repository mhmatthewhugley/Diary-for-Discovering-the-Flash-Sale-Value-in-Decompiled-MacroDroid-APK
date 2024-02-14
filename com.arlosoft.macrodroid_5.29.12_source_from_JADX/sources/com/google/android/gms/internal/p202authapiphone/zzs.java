package com.google.android.gms.internal.p202authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzs */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzs extends zzg {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39111a;

    zzs(zzn zzn, TaskCompletionSource taskCompletionSource) {
        this.f39111a = taskCompletionSource;
    }

    /* renamed from: Z0 */
    public final void mo48501Z0(Status status, boolean z) {
        TaskUtil.m3878b(status, Boolean.valueOf(z), this.f39111a);
    }
}
