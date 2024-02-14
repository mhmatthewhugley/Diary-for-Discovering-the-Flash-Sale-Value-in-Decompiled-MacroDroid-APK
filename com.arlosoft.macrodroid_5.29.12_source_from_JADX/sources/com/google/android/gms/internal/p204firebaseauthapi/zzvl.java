package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzan;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvl extends zzyb {
    public zzvl() {
        super(5);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50019n(new zzrk(this.f40623d.mo22643C2()), this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        ((zzan) this.f40624e).zza();
        mo50072l((Object) null);
    }

    public final String zza() {
        return "delete";
    }
}
