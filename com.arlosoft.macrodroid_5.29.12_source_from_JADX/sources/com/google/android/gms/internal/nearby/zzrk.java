package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zzrk extends zzpa {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f45062a;

    zzrk(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.f45062a = taskCompletionSource;
    }

    /* renamed from: G */
    public final void mo53101G(int i) {
        if (i == 42004) {
            this.f45062a.mo56138b(new SecurityException("Missing UWB_RANGING permission"));
        } else if (i != 0) {
            this.f45062a.mo56138b(new ApiException(new Status(i, UwbStatusCodes.m66558b(i))));
        } else {
            this.f45062a.mo56139c(null);
        }
    }
}
