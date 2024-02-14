package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzrm implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ Runnable f45065a;

    public /* synthetic */ zzrm(Runnable runnable) {
        this.f45065a = runnable;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzqs zzqs = (zzqs) obj;
        this.f45065a.run();
        ((TaskCompletionSource) obj2).mo56139c(null);
    }
}
