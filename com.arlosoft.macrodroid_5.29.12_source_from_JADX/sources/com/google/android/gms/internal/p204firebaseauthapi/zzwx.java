package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwx */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwx extends zzyb {

    /* renamed from: w */
    private final zzsg f40574w;

    public zzwx(zzaal zzaal) {
        super(8);
        Preconditions.m4488k(zzaal);
        this.f40574w = new zzsg(zzaal);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50030y(this.f40574w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
    }

    public final String zza() {
        return "verifyPhoneNumber";
    }
}
