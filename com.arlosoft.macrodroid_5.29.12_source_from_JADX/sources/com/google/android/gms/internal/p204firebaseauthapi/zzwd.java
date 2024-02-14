package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwd extends zzyb {
    @NonNull

    /* renamed from: w */
    private final zzsc f40554w;

    public zzwd(String str, @Nullable ActionCodeSettings actionCodeSettings) {
        super(6);
        Preconditions.m4485h(str, "token cannot be null or empty");
        this.f40554w = new zzsc(str, actionCodeSettings);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50028w(this.f40554w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        mo50072l((Object) null);
    }

    public final String zza() {
        return "sendEmailVerification";
    }
}
