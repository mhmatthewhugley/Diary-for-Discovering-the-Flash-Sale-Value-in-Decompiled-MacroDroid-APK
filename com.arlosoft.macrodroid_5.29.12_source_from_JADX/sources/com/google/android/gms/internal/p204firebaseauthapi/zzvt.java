package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

@VisibleForTesting
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvt extends zzyb {

    /* renamed from: w */
    private final EmailAuthCredential f40545w;

    public zzvt(EmailAuthCredential emailAuthCredential) {
        super(2);
        this.f40545w = (EmailAuthCredential) Preconditions.m4489l(emailAuthCredential, "credential cannot be null");
    }

    /* renamed from: a */
    public final void mo49944a(TaskCompletionSource taskCompletionSource, zzxb zzxb) {
        this.f40641v = new zzya(this, taskCompletionSource);
        EmailAuthCredential emailAuthCredential = this.f40545w;
        emailAuthCredential.mo22582o2(this.f40623d);
        zzxb.mo50004E(new zzss(emailAuthCredential), this.f40621b);
    }

    /* renamed from: b */
    public final void mo49945b() {
        zzx i = zzwy.m58269i(this.f40622c, this.f40629j);
        ((zzg) this.f40624e).mo22787a(this.f40628i, i);
        mo50072l(new zzr(i));
    }

    public final String zza() {
        return "linkEmailAuthCredential";
    }
}
