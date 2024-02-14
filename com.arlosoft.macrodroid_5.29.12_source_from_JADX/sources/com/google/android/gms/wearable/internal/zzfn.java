package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.MessageClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzfn implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.RpcService f48304a;

    /* renamed from: b */
    public final /* synthetic */ ListenerHolder f48305b;

    /* renamed from: c */
    public final /* synthetic */ IntentFilter[] f48306c;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ((zzim) obj).mo56516y0(new zzhj((TaskCompletionSource) obj2), this.f48304a, this.f48305b, this.f48306c);
    }
}
