package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzan */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class zzan implements RemoteCall {

    /* renamed from: a */
    private final zzak f39122a;

    /* renamed from: b */
    private final SavePasswordRequest f39123b;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzak zzak = this.f39122a;
        SavePasswordRequest savePasswordRequest = this.f39123b;
        ((zzac) ((zzab) obj).mo21626I()).mo48509w9(new zzap(zzak, (TaskCompletionSource) obj2), (SavePasswordRequest) Preconditions.m4488k(savePasswordRequest));
    }
}
