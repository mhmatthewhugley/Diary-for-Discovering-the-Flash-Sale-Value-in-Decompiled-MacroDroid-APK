package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzub */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzub implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzxa f40469a;

    /* renamed from: b */
    final /* synthetic */ zzvf f40470b;

    zzub(zzvf zzvf, zzxa zzxa) {
        this.f40470b = zzvf;
        this.f40469a = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzabh zzabh = (zzabh) obj;
        this.f40470b.m58143o(new zzzy(zzabh.mo48851d(), zzabh.mo48849b(), Long.valueOf(zzabh.mo48848a()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzabh.mo48853f()), (zze) null, this.f40469a, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40469a.mo49992h(zzai.m6170a(str));
    }
}
