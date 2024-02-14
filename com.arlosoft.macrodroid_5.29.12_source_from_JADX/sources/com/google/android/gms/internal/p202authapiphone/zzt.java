package com.google.android.gms.internal.p202authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzt */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
final class zzt extends zze {

    /* renamed from: a */
    private final /* synthetic */ TaskCompletionSource f39112a;

    zzt(zzn zzn, TaskCompletionSource taskCompletionSource) {
        this.f39112a = taskCompletionSource;
    }

    /* renamed from: Y1 */
    public final void mo48500Y1(Status status, int i) {
        TaskUtil.m3878b(status, Integer.valueOf(i), this.f39112a);
    }
}
