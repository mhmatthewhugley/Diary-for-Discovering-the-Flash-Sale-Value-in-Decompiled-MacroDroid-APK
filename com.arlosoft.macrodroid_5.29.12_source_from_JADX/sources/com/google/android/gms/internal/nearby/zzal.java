package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzal extends zzcx {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f44549a;

    zzal(zzax zzax, TaskCompletionSource taskCompletionSource) {
        this.f44549a = taskCompletionSource;
    }

    /* renamed from: w3 */
    public final void mo52526w3(Status status, DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        TaskUtil.m3880d(status, diagnosisKeysDataMapping, this.f44549a);
    }
}
