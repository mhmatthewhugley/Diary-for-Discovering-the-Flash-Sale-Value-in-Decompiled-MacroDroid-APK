package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzuz implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzxa f40520a;

    /* renamed from: b */
    final /* synthetic */ zzvf f40521b;

    zzuz(zzvf zzvf, zzxa zzxa) {
        this.f40521b = zzvf;
        this.f40520a = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzaar zzaar = (zzaar) obj;
        this.f40521b.m58143o(new zzzy(zzaar.mo48798c(), zzaar.mo48797b(), Long.valueOf(zzaar.mo48796a()), "Bearer"), (String) null, (String) null, Boolean.TRUE, (zze) null, this.f40520a, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40520a.mo49992h(zzai.m6170a(str));
    }
}
