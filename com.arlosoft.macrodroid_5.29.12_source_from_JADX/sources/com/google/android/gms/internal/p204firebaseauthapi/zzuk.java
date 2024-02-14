package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzuk implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzul f40493a;

    zzuk(zzul zzul) {
        this.f40493a = zzul;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        zzabj zzabj = (zzabj) obj;
        if (TextUtils.isEmpty(zzabj.mo48854a()) || TextUtils.isEmpty(zzabj.mo48855b())) {
            this.f40493a.f40495b.mo49992h(zzai.m6170a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        zzzy zzzy = new zzzy(zzabj.mo48855b(), zzabj.mo48854a(), Long.valueOf(zzaaa.m55990a(zzabj.mo48854a())), "Bearer");
        zzul zzul = this.f40493a;
        zzul.f40496c.m58143o(zzzy, (String) null, (String) null, Boolean.FALSE, (zze) null, zzul.f40495b, this);
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40493a.f40495b.mo49992h(zzai.m6170a(str));
    }
}
