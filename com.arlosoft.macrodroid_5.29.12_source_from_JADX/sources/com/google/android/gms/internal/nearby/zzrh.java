package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzrh extends zzou {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f45059a;

    zzrh(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.f45059a = taskCompletionSource;
    }

    /* renamed from: W3 */
    public final void mo53097W3(zzps zzps) {
        this.f45059a.mo56139c(new RangingCapabilities(zzps.mo53131a(), zzps.mo53134l2(), zzps.mo53135m2(), zzps.zza()));
    }
}
