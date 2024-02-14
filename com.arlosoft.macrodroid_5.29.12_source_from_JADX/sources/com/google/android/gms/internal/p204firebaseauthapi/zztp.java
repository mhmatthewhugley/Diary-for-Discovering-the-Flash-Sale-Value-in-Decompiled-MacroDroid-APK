package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zztp implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzxa f40438a;

    /* renamed from: b */
    final /* synthetic */ zzvf f40439b;

    zztp(zzvf zzvf, zzxa zzxa) {
        this.f40439b = zzvf;
        this.f40438a = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzabf zzabf = (zzabf) obj;
        if (zzabf.mo48846f()) {
            this.f40438a.mo49990f(new zztm(zzabf.mo48843c(), zzabf.mo48845e(), (zze) null));
            return;
        }
        this.f40439b.m58143o(new zzzy(zzabf.mo48844d(), zzabf.mo48842b(), Long.valueOf(zzabf.mo48841a()), "Bearer"), (String) null, (String) null, Boolean.FALSE, (zze) null, this.f40438a, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40438a.mo49992h(zzai.m6170a(str));
    }
}
