package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class zzyc implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzye f40642a;

    /* renamed from: c */
    public final /* synthetic */ zzyd f40643c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f40644d;

    public /* synthetic */ zzyc(zzye zzye, zzyd zzyd, TaskCompletionSource taskCompletionSource) {
        this.f40642a = zzye;
        this.f40643c = zzyd;
        this.f40644d = taskCompletionSource;
    }

    public final void run() {
        this.f40643c.mo49944a(this.f40644d, this.f40642a.f40645a);
    }
}
