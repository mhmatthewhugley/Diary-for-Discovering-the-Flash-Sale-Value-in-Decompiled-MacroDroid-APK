package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzuo implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzup f40500a;

    zzuo(zzup zzup) {
        this.f40500a = zzup;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzzj zzzj = (zzzj) obj;
        zzzy zzzy = new zzzy(zzzj.mo50104b(), zzzj.mo50103a(), Long.valueOf(zzaaa.m55990a(zzzj.mo50103a())), "Bearer");
        zzup zzup = this.f40500a;
        zzup.f40503c.m58143o(zzzy, (String) null, (String) null, Boolean.FALSE, (zze) null, zzup.f40502b, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40500a.f40502b.mo49992h(zzai.m6170a(str));
    }
}
