package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvc implements zzyg {

    /* renamed from: a */
    final /* synthetic */ String f40528a;

    /* renamed from: b */
    final /* synthetic */ zzxa f40529b;

    /* renamed from: c */
    final /* synthetic */ zzvf f40530c;

    zzvc(zzvf zzvf, String str, zzxa zzxa) {
        this.f40530c = zzvf;
        this.f40528a = str;
        this.f40529b = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzzy zzzy = (zzzy) obj;
        String m2 = zzzy.mo50147m2();
        zzaao zzaao = new zzaao();
        zzaao.mo48781d(m2);
        zzaao.mo48783f(this.f40528a);
        zzvf.m58149u(this.f40530c, this.f40529b, zzzy, zzaao, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40529b.mo49992h(zzai.m6170a(str));
    }
}
