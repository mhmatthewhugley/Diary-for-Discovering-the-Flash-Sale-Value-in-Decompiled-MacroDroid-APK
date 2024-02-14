package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvs */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvs extends zzyb {

    /* renamed from: w */
    private final PhoneAuthCredential f40544w;

    public zzvs(PhoneAuthCredential phoneAuthCredential) {
        super(2);
        this.f40544w = (PhoneAuthCredential) Preconditions.m4489l(phoneAuthCredential, "credential cannot be null");
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        zzxb.mo50026u(new zzry(this.f40623d.mo22643C2(), this.f40544w), this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        zzx i = zzwy.m58269i(this.f40622c, this.f40629j);
        ((zzg) this.f40624e).mo22787a(this.f40628i, i);
        mo50072l(new zzr(i));
    }

    public final String zza() {
        return "linkPhoneAuthCredential";
    }
}