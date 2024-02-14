package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzus */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzus implements zzyg {

    /* renamed from: a */
    final /* synthetic */ zzyg f40507a;

    /* renamed from: b */
    final /* synthetic */ zzzy f40508b;

    /* renamed from: c */
    final /* synthetic */ zzut f40509c;

    zzus(zzut zzut, zzyg zzyg, zzzy zzzy) {
        this.f40509c = zzut;
        this.f40507a = zzyg;
        this.f40508b = zzzy;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo49910c(Object obj) {
        List l2 = ((zzzp) obj).mo50108l2();
        if (l2 == null || l2.isEmpty()) {
            this.f40507a.mo49911o("No users");
        } else {
            this.f40509c.f40510a.mo49993i(this.f40508b, (zzzr) l2.get(0));
        }
    }

    /* renamed from: o */
    public final void mo49911o(@Nullable String str) {
        this.f40507a.mo49911o(str);
    }
}
