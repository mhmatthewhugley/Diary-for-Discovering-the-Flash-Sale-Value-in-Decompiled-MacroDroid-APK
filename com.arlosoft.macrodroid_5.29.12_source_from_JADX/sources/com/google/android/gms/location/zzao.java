package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
class zzao extends zzah {

    /* renamed from: a */
    private final TaskCompletionSource<Void> f46078a;

    public zzao(TaskCompletionSource<Void> taskCompletionSource) {
        this.f46078a = taskCompletionSource;
    }

    /* renamed from: a */
    public void mo50508a() {
    }

    /* renamed from: gb */
    public final void mo50509gb(zzaa zzaa) {
        TaskUtil.m3877a(zzaa.getStatus(), this.f46078a);
    }
}
