package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.CapabilityClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final /* synthetic */ class zzak implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ CapabilityClient.OnCapabilityChangedListener f48129a;

    /* renamed from: b */
    public final /* synthetic */ ListenerHolder f48130b;

    /* renamed from: c */
    public final /* synthetic */ IntentFilter[] f48131c;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        ((zzim) obj).mo56512u0(new zzhj((TaskCompletionSource) obj2), this.f48129a, this.f48130b, this.f48131c);
    }
}
