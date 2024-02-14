package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvk extends zzyb {
    @NonNull

    /* renamed from: w */
    final zzri f40537w;

    public zzvk(String str, String str2, @Nullable String str3) {
        super(2);
        Preconditions.m4485h(str, "email cannot be null or empty");
        Preconditions.m4485h(str2, "password cannot be null or empty");
        this.f40537w = new zzri(str, str2, str3);
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50018m(this.f40537w, this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        zzx i = zzwy.m58269i(this.f40622c, this.f40629j);
        ((zzg) this.f40624e).mo22787a(this.f40628i, i);
        mo50072l(new zzr(i));
    }

    public final String zza() {
        return "createUserWithEmailAndPassword";
    }
}
