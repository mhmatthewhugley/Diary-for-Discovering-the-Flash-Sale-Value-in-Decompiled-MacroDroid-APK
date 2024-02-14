package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzrj extends zzpg {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f45061a;

    zzrj(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.f45061a = taskCompletionSource;
    }

    /* renamed from: X3 */
    public final void mo53103X3(zzqv zzqv) {
        TaskCompletionSource taskCompletionSource = this.f45061a;
        UwbComplexChannel.Builder builder = new UwbComplexChannel.Builder();
        builder.mo56056b(zzqv.zza());
        builder.mo56057c(zzqv.mo53205l2());
        taskCompletionSource.mo56139c(builder.mo56055a());
    }
}
