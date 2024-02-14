package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzo;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvi extends zzyb {

    /* renamed from: w */
    private final zzre f40535w;

    public zzvi(String str, @Nullable String str2) {
        super(4);
        Preconditions.m4485h(str, "code cannot be null or empty");
        this.f40535w = new zzre(str, str2);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50016k(this.f40535w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        mo50072l(new zzo(this.f40631l));
    }

    public final String zza() {
        return "checkActionCode";
    }
}
