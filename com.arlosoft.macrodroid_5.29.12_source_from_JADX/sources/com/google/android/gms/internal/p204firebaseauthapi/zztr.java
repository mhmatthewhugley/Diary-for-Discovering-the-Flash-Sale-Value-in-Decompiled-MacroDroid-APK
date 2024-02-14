package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zztr implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzxa f40443a;

    /* renamed from: b */
    final /* synthetic */ zzvf f40444b;

    zztr(zzvf zzvf, zzxa zzxa) {
        this.f40444b = zzvf;
        this.f40443a = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzzh zzzh = (zzzh) obj;
        if (zzzh.mo50100f()) {
            this.f40443a.mo49990f(new zztm(zzzh.mo50097c(), zzzh.mo50099e(), (zze) null));
            return;
        }
        this.f40444b.m58143o(new zzzy(zzzh.mo50098d(), zzzh.mo50096b(), Long.valueOf(zzzh.mo50095a()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzzh.mo50101g()), (zze) null, this.f40443a, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40443a.mo49992h(zzai.m6170a(str));
    }
}
