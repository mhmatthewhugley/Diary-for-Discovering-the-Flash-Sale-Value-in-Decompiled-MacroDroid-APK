package com.google.android.gms.cloudmessaging;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class zzw implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ Rpc f3015a;

    /* renamed from: c */
    public final /* synthetic */ String f3016c;

    /* renamed from: d */
    public final /* synthetic */ ScheduledFuture f3017d;

    public /* synthetic */ zzw(Rpc rpc, String str, ScheduledFuture scheduledFuture) {
        this.f3015a = rpc;
        this.f3016c = str;
        this.f3017d = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo21120a(Task task) {
        this.f3015a.mo21080e(this.f3016c, this.f3017d, task);
    }
}
