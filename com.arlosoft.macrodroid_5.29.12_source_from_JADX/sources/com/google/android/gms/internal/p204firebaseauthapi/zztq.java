package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zztq implements zzyg {

    /* renamed from: a */
    final /* synthetic */ EmailAuthCredential f40440a;

    /* renamed from: b */
    final /* synthetic */ zzxa f40441b;

    /* renamed from: c */
    final /* synthetic */ zzvf f40442c;

    zztq(zzvf zzvf, EmailAuthCredential emailAuthCredential, zzxa zzxa) {
        this.f40442c = zzvf;
        this.f40440a = emailAuthCredential;
        this.f40441b = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        this.f40442c.m58142n(new zzzg(this.f40440a, ((zzzy) obj).mo50147m2()), this.f40441b);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40441b.mo49992h(zzai.m6170a(str));
    }
}
