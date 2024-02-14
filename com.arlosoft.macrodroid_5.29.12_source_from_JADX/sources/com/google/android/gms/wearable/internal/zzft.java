package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.MessageApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzft implements BaseImplementation.ResultHolder {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f48318a;

    zzft(zzfw zzfw, TaskCompletionSource taskCompletionSource) {
        this.f48318a = taskCompletionSource;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        MessageApi.SendMessageResult sendMessageResult = (MessageApi.SendMessageResult) obj;
        if (sendMessageResult.getStatus().mo21297q2()) {
            this.f48318a.mo56139c(Integer.valueOf(sendMessageResult.mo56212f()));
        } else {
            this.f48318a.mo56138b(ApiExceptionUtil.m4340a(sendMessageResult.getStatus()));
        }
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        this.f48318a.mo56138b(ApiExceptionUtil.m4340a(status));
    }
}
