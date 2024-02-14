package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.MessageClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzfq implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ MessageClient.OnMessageReceivedListener f48309a;

    /* renamed from: b */
    public final /* synthetic */ ListenerHolder f48310b;

    /* renamed from: c */
    public final /* synthetic */ IntentFilter[] f48311c;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ((zzim) obj).mo56515x0(new zzhj((TaskCompletionSource) obj2), this.f48309a, this.f48310b, this.f48311c);
    }
}
