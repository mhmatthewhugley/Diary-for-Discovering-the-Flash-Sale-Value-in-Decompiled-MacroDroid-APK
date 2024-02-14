package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.DataClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzcy implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ DataClient.OnDataChangedListener f48229a;

    /* renamed from: b */
    public final /* synthetic */ ListenerHolder f48230b;

    /* renamed from: c */
    public final /* synthetic */ IntentFilter[] f48231c;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ((zzim) obj).mo56514w0(new zzhj((TaskCompletionSource) obj2), this.f48229a, this.f48230b, this.f48231c);
    }
}
