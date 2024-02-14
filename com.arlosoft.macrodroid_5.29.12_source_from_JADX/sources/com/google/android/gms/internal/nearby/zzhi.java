package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzhi implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzih f44723a;

    /* renamed from: b */
    public final /* synthetic */ String f44724b;

    /* renamed from: c */
    public final /* synthetic */ ListenerHolder f44725c;

    /* renamed from: d */
    public final /* synthetic */ DiscoveryOptions f44726d;

    public /* synthetic */ zzhi(zzih zzih, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) {
        this.f44723a = zzih;
        this.f44724b = str;
        this.f44725c = listenerHolder;
        this.f44726d = discoveryOptions;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzih zzih = this.f44723a;
        ((zzgy) obj).mo52748s0(new zzif(zzih, (TaskCompletionSource) obj2), this.f44724b, this.f44725c, this.f44726d);
    }
}
