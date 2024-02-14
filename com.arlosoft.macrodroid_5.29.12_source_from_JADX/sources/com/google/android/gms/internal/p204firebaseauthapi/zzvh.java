package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvh extends zzyb {

    /* renamed from: w */
    private final zzqy f40534w;

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50013h(this.f40534w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        mo50072l((Object) null);
    }

    public final String zza() {
        return "applyActionCode";
    }
}
