package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzat */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class zzat implements RemoteCall {

    /* renamed from: a */
    private final zzao f39131a;

    /* renamed from: b */
    private final GetSignInIntentRequest f39132b;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzao zzao = this.f39131a;
        GetSignInIntentRequest getSignInIntentRequest = this.f39132b;
        ((zzai) ((zzaw) obj).mo21626I()).mo48513f8(new zzax(zzao, (TaskCompletionSource) obj2), (GetSignInIntentRequest) Preconditions.m4488k(getSignInIntentRequest));
    }
}
