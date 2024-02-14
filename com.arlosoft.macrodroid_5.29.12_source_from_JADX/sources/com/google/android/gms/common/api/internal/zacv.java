package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zacv extends TaskApiCall {

    /* renamed from: d */
    final /* synthetic */ TaskApiCall.Builder f3435d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zacv(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.f3435d = builder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo20779d(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.f3435d.f3238a.mo21401a(anyClient, taskCompletionSource);
    }
}
