package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzun */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzun implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzxa f40498a;

    /* renamed from: b */
    final /* synthetic */ zzvf f40499b;

    zzun(zzvf zzvf, zzxa zzxa) {
        this.f40499b = zzvf;
        this.f40498a = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzabc zzabc = (zzabc) obj;
        this.f40499b.m58143o(new zzzy(zzabc.mo48835m2(), zzabc.mo48834l2(), Long.valueOf(zzabc.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzabc.mo48836n2()), (zze) null, this.f40498a, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40498a.mo49992h(zzai.m6170a(str));
    }
}
