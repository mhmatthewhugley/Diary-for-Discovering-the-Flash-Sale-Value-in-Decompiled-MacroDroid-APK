package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzui */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzui implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzyg f40487a;

    /* renamed from: b */
    final /* synthetic */ zzzy f40488b;

    /* renamed from: c */
    final /* synthetic */ zzuj f40489c;

    zzui(zzuj zzuj, zzyg zzyg, zzzy zzzy) {
        this.f40489c = zzuj;
        this.f40487a = zzyg;
        this.f40488b = zzzy;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        List l2 = ((zzzp) obj).mo50108l2();
        if (l2 == null || l2.isEmpty()) {
            this.f40487a.mo49911o("No users.");
            return;
        }
        zzaao zzaao = new zzaao();
        zzaao.mo48781d(this.f40488b.mo50147m2());
        zzaao.mo48778a(this.f40489c.f40490a);
        zzuj zzuj = this.f40489c;
        zzvf.m58150v(zzuj.f40492c, zzuj.f40491b, this.f40488b, (zzzr) l2.get(0), zzaao, this.f40487a);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40489c.f40491b.mo49992h(zzai.m6170a(str));
    }
}
