package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzrc implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzrs f45053a;

    /* renamed from: b */
    public final /* synthetic */ UwbAddress f45054b;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzrs zzrs = this.f45053a;
        UwbAddress uwbAddress = this.f45054b;
        zznx zznx = new zznx();
        zzqo zzqo = new zzqo();
        zzqo.mo53192a(uwbAddress.mo56046a());
        zznx.mo53053a(zzqo.mo53193b());
        zznx.mo53054b(new zzrk(zzrs, (TaskCompletionSource) obj2));
        ((zzos) ((zzqs) obj).mo21626I()).mo53094g8(zznx.mo53055c());
    }
}
