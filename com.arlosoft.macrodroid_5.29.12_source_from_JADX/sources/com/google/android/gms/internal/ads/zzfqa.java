package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfqa implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ zzfqb f36252a;

    public /* synthetic */ zzfqa(zzfqb zzfqb) {
        this.f36252a = zzfqb;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        zzfqb zzfqb = this.f36252a;
        if (task.mo23717r()) {
            zzfqb.cancel(false);
        } else if (task.mo23719t()) {
            zzfqb.mo46080f(task.mo23715p());
        } else {
            Exception o = task.mo23714o();
            if (o != null) {
                zzfqb.mo46081g(o);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
