package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzvb implements zzyg {

    /* renamed from: a */
    final /* synthetic */ String f40525a;

    /* renamed from: b */
    final /* synthetic */ zzxa f40526b;

    /* renamed from: c */
    final /* synthetic */ zzvf f40527c;

    zzvb(zzvf zzvf, String str, zzxa zzxa) {
        this.f40527c = zzvf;
        this.f40525a = str;
        this.f40526b = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzzy zzzy = (zzzy) obj;
        zzaao zzaao = new zzaao();
        zzaao.mo48781d(zzzy.mo50147m2());
        zzaao.mo48780c(this.f40525a);
        zzvf.m58149u(this.f40527c, this.f40526b, zzzy, zzaao, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40526b.mo49992h(zzai.m6170a(str));
    }
}
