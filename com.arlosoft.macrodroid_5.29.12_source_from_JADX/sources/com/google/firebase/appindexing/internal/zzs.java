package com.google.firebase.appindexing.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.icing.zzaa;
import com.google.android.gms.internal.icing.zzae;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
abstract class zzs extends TaskApiCall<zzae, Void> implements BaseImplementation.ResultHolder<Status> {

    /* renamed from: d */
    protected TaskCompletionSource<Void> f53879d;

    zzs() {
        super((Feature[]) null, false, 9004);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21038a(Object obj) {
        Status status = (Status) obj;
        if (status.mo21297q2()) {
            this.f53879d.mo56139c(null);
        } else {
            this.f53879d.mo56138b(zzaf.m74511a(status, "User Action indexing error, please try again."));
        }
    }

    /* renamed from: b */
    public final void mo21321b(Status status) {
        Preconditions.m4479b(!status.mo21297q2(), "Failed result must not be success.");
        String o2 = status.mo21295o2();
        if (o2 == null) {
            o2 = "";
        }
        this.f53879d.mo56138b(zzaf.m74511a(status, o2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo20779d(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f53879d = taskCompletionSource;
        mo62035h((zzaa) ((zzae) anyClient).mo21626I());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo62035h(zzaa zzaa) throws RemoteException;
}
