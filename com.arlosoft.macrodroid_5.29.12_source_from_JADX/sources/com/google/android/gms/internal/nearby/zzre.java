package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzre implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzrs f45056a;

    /* renamed from: b */
    public final /* synthetic */ RangingSessionCallback f45057b;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzrs zzrs = this.f45056a;
        RangingSessionCallback rangingSessionCallback = this.f45057b;
        zzqk zzqk = new zzqk();
        zzqk.mo53185a(new zzrk(zzrs, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).mo21626I()).mo53092Mb(zzqk.mo53186b());
        zzrs.mo21233s(ListenerHolders.m3812b(rangingSessionCallback, RangingSessionCallback.class.getName()), 1305);
    }
}
