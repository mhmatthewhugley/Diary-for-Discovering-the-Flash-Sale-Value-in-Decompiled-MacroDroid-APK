package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzuc implements zzyg {

    /* renamed from: a */
    final /* synthetic */ String f40471a;

    /* renamed from: b */
    final /* synthetic */ String f40472b;

    /* renamed from: c */
    final /* synthetic */ zzxa f40473c;

    /* renamed from: d */
    final /* synthetic */ zzvf f40474d;

    zzuc(zzvf zzvf, String str, String str2, zzxa zzxa) {
        this.f40474d = zzvf;
        this.f40471a = str;
        this.f40472b = str2;
        this.f40473c = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzzy zzzy = (zzzy) obj;
        zzaao zzaao = new zzaao();
        zzaao.mo48781d(zzzy.mo50147m2());
        zzaao.mo48780c(this.f40471a);
        zzaao.mo48783f(this.f40472b);
        zzvf.m58149u(this.f40474d, this.f40473c, zzzy, zzaao, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40473c.mo49992h(zzai.m6170a(str));
    }
}
