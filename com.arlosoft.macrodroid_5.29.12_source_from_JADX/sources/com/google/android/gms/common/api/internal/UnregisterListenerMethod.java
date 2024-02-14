package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class UnregisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a */
    private final ListenerHolder.ListenerKey f3242a;

    @KeepForSdk
    protected UnregisterListenerMethod(@NonNull ListenerHolder.ListenerKey<L> listenerKey) {
        this.f3242a = listenerKey;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public ListenerHolder.ListenerKey<L> mo21410a() {
        return this.f3242a;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public abstract void mo21411b(@NonNull A a, @NonNull TaskCompletionSource<Boolean> taskCompletionSource) throws RemoteException;
}
