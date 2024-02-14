package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwv extends zzyb {

    /* renamed from: w */
    private final zzti f40572w;

    public zzwv(String str, String str2, ActionCodeSettings actionCodeSettings) {
        super(6);
        Preconditions.m4484g(str);
        Preconditions.m4484g(str2);
        Preconditions.m4488k(actionCodeSettings);
        this.f40572w = new zzti(str, str2, actionCodeSettings);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50012f(this.f40572w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        mo50072l((Object) null);
    }

    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }
}
