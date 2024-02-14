package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzra implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzrs f45050a;

    /* renamed from: b */
    public final /* synthetic */ UwbAddress f45051b;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzrs zzrs = this.f45050a;
        UwbAddress uwbAddress = this.f45051b;
        zzqc zzqc = new zzqc();
        zzqo zzqo = new zzqo();
        zzqo.mo53192a(uwbAddress.mo56046a());
        zzqc.mo53168a(zzqo.mo53193b());
        zzqc.mo53169b(new zzrk(zzrs, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).mo21626I()).mo53090Kb(zzqc.mo53170c());
    }
}
