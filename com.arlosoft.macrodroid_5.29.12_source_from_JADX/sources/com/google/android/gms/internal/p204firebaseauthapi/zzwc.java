package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwc extends zzyb {
    public zzwc() {
        super(2);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50027v(new zzsa(this.f40623d.mo22643C2()), this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        ((zzg) this.f40624e).mo22787a(this.f40628i, zzwy.m58269i(this.f40622c, this.f40629j));
        mo50072l((Object) null);
    }

    public final String zza() {
        return "reload";
    }
}
