package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzts */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzts implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzyf f40445a;

    /* renamed from: b */
    final /* synthetic */ zzxa f40446b;

    /* renamed from: c */
    final /* synthetic */ zzzy f40447c;

    /* renamed from: d */
    final /* synthetic */ zzaao f40448d;

    /* renamed from: e */
    final /* synthetic */ zzvf f40449e;

    zzts(zzvf zzvf, zzyf zzyf, zzxa zzxa, zzzy zzzy, zzaao zzaao) {
        this.f40449e = zzvf;
        this.f40445a = zzyf;
        this.f40446b = zzxa;
        this.f40447c = zzzy;
        this.f40448d = zzaao;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        List l2 = ((zzzp) obj).mo50108l2();
        if (l2 == null || l2.isEmpty()) {
            this.f40445a.mo49911o("No users");
        } else {
            zzvf.m58150v(this.f40449e, this.f40446b, this.f40447c, (zzzr) l2.get(0), this.f40448d, this.f40445a);
        }
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40445a.mo49911o(str);
    }
}
