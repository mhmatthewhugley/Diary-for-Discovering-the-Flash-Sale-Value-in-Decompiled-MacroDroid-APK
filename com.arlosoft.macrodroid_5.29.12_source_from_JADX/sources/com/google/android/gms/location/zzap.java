package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
abstract class zzap implements RemoteCall<zzaz, TaskCompletionSource<Boolean>> {

    /* renamed from: a */
    private boolean f46079a = true;

    protected zzap() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo54383b() {
        return this.f46079a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo54384c(boolean z) {
        this.f46079a = false;
    }
}
