package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zack extends RegisterListenerMethod {

    /* renamed from: e */
    final /* synthetic */ RegistrationMethods.Builder f3419e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zack(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.f3419e = builder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo21392d(Api.AnyClient anyClient, TaskCompletionSource<Void> taskCompletionSource) throws RemoteException {
        this.f3419e.f3227a.mo21401a(anyClient, taskCompletionSource);
    }
}
