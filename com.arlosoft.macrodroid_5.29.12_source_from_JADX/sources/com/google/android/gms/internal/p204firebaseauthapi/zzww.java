package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzo;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzww */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzww extends zzyb {

    /* renamed from: w */
    private final zzre f40573w;

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50016k(this.f40573w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        if (new zzo(this.f40631l).mo22799a() != 0) {
            mo50071k(new Status(17499));
        } else {
            mo50072l(this.f40631l.mo48757m2());
        }
    }

    public final String zza() {
        return "verifyPasswordResetCode";
    }
}
