package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfrp implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ zzfry f36305a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f36306c;

    public /* synthetic */ zzfrp(zzfry zzfry, TaskCompletionSource taskCompletionSource) {
        this.f36305a = zzfry;
        this.f36306c = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        this.f36305a.mo46155q(this.f36306c, task);
    }
}
