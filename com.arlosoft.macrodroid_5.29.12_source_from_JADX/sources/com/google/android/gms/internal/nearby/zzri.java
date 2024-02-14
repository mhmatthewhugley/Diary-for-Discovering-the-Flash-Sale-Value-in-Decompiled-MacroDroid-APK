package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzri extends zzpd {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f45060a;

    zzri(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.f45060a = taskCompletionSource;
    }

    /* renamed from: x7 */
    public final void mo53102x7(zzqq zzqq) {
        this.f45060a.mo56139c(new UwbAddress(zzqq.mo53196m2()));
    }
}
