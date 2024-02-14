package com.google.firebase.messaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* renamed from: com.google.firebase.messaging.b0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11300b0 implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ ScheduledFuture f55085a;

    public /* synthetic */ C11300b0(ScheduledFuture scheduledFuture) {
        this.f55085a = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        this.f55085a.cancel(false);
    }
}
