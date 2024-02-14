package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class zzu implements Continuation {

    /* renamed from: a */
    public final /* synthetic */ Rpc f3012a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f3013b;

    public /* synthetic */ zzu(Rpc rpc, Bundle bundle) {
        this.f3012a = rpc;
        this.f3013b = bundle;
    }

    /* renamed from: a */
    public final Object mo21119a(Task task) {
        return this.f3012a.mo21079c(this.f3013b, task);
    }
}
