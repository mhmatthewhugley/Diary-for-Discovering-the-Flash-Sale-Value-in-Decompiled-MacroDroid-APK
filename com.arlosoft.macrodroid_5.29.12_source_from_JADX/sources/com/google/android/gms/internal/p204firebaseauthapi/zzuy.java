package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzuy implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzxa f40518a;

    /* renamed from: b */
    final /* synthetic */ zzvf f40519b;

    zzuy(zzvf zzvf, zzxa zzxa) {
        this.f40519b = zzvf;
        this.f40518a = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzaba zzaba = (zzaba) obj;
        if (!zzaba.mo48830l()) {
            zzvf.m58148t(this.f40519b, zzaba, this.f40518a, this);
        } else {
            this.f40518a.mo49990f(new zztm(zzaba.mo48824f(), zzaba.mo48829k(), zzaba.mo48820b()));
        }
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40518a.mo49992h(zzai.m6170a(str));
    }
}
