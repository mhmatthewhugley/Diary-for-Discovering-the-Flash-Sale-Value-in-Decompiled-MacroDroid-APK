package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzva */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzva implements zzyg {

    /* renamed from: a */
    final /* synthetic */ UserProfileChangeRequest f40522a;

    /* renamed from: b */
    final /* synthetic */ zzxa f40523b;

    /* renamed from: c */
    final /* synthetic */ zzvf f40524c;

    zzva(zzvf zzvf, UserProfileChangeRequest userProfileChangeRequest, zzxa zzxa) {
        this.f40524c = zzvf;
        this.f40522a = userProfileChangeRequest;
        this.f40523b = zzxa;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzzy zzzy = (zzzy) obj;
        zzaao zzaao = new zzaao();
        zzaao.mo48781d(zzzy.mo50147m2());
        if (this.f40522a.mo22718m2() || this.f40522a.mo22719p0() != null) {
            zzaao.mo48779b(this.f40522a.mo22719p0());
        }
        if (this.f40522a.mo22716a() || this.f40522a.mo22717l2() != null) {
            zzaao.mo48784g(this.f40522a.zza());
        }
        zzvf.m58149u(this.f40524c, this.f40523b, zzzy, zzaao, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40523b.mo49992h(zzai.m6170a(str));
    }
}
