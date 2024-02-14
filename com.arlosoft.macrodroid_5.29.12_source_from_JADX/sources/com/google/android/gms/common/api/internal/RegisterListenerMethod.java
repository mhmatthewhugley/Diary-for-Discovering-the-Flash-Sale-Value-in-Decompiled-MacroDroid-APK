package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.tasks.TaskCompletionSource;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class RegisterListenerMethod<A extends Api.AnyClient, L> {

    /* renamed from: a */
    private final ListenerHolder f3220a;
    @Nullable

    /* renamed from: b */
    private final Feature[] f3221b;

    /* renamed from: c */
    private final boolean f3222c;

    /* renamed from: d */
    private final int f3223d;

    @KeepForSdk
    protected RegisterListenerMethod(@NonNull ListenerHolder<L> listenerHolder, @Nullable Feature[] featureArr, boolean z, int i) {
        this.f3220a = listenerHolder;
        this.f3221b = featureArr;
        this.f3222c = z;
        this.f3223d = i;
    }

    @KeepForSdk
    /* renamed from: a */
    public void mo21389a() {
        this.f3220a.mo21375a();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public ListenerHolder.ListenerKey<L> mo21390b() {
        return this.f3220a.mo21376b();
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public Feature[] mo21391c() {
        return this.f3221b;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: d */
    public abstract void mo21392d(@NonNull A a, @NonNull TaskCompletionSource<Void> taskCompletionSource) throws RemoteException;

    /* renamed from: e */
    public final int mo21393e() {
        return this.f3223d;
    }

    /* renamed from: f */
    public final boolean mo21394f() {
        return this.f3222c;
    }
}
