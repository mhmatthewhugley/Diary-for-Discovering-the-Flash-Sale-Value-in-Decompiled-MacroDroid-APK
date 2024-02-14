package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zacl extends UnregisterListenerMethod {

    /* renamed from: b */
    final /* synthetic */ RegistrationMethods.Builder f3420b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zacl(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.f3420b = builder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo21411b(Api.AnyClient anyClient, TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException {
        this.f3420b.f3228b.mo21401a(anyClient, taskCompletionSource);
    }
}
