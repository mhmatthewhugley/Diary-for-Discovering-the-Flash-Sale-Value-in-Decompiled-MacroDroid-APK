package com.google.android.gms.internal.p203authapi;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zzar */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
final /* synthetic */ class zzar implements RemoteCall {

    /* renamed from: a */
    private final zzao f39129a;

    /* renamed from: b */
    private final BeginSignInRequest f39130b;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzao zzao = this.f39129a;
        BeginSignInRequest beginSignInRequest = this.f39130b;
        ((zzai) ((zzaw) obj).mo21626I()).mo48514rb(new zzav(zzao, (TaskCompletionSource) obj2), (BeginSignInRequest) Preconditions.m4488k(beginSignInRequest));
    }
}
