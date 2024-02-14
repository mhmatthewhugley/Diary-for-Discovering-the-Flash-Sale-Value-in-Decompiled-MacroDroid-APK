package com.google.android.gms.tasks;

import com.google.android.gms.internal.tasks.zza;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final /* synthetic */ class zzy implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ zza f48058a;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f48059c;

    /* renamed from: d */
    public final /* synthetic */ zzb f48060d;

    /* renamed from: a */
    public final void mo21120a(Task task) {
        zza zza = this.f48058a;
        TaskCompletionSource taskCompletionSource = this.f48059c;
        zzb zzb = this.f48060d;
        zza.removeCallbacksAndMessages((Object) null);
        if (task.mo23719t()) {
            taskCompletionSource.mo56141e(task.mo23715p());
        } else if (task.mo23717r()) {
            zzb.mo56144c();
        } else {
            Exception o = task.mo23714o();
            o.getClass();
            taskCompletionSource.mo56140d(o);
        }
    }
}
