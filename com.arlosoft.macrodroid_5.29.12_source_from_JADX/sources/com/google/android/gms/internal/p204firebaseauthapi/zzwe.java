package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.ActionCodeSettings;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwe */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzwe extends zzyb {
    @NonNull

    /* renamed from: w */
    private final zzse f40555w;

    /* renamed from: x */
    private final String f40556x;

    public zzwe(String str, ActionCodeSettings actionCodeSettings, @Nullable String str2, String str3) {
        super(4);
        Preconditions.m4485h(str, "email cannot be null or empty");
        this.f40555w = new zzse(str, actionCodeSettings, str2);
        this.f40556x = str3;
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50029x(this.f40555w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        mo50072l((Object) null);
    }

    public final String zza() {
        return this.f40556x;
    }
}
