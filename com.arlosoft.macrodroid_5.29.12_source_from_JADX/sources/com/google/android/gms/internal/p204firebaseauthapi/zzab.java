package com.google.android.gms.internal.p204firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzab */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzab extends zzad {

    /* renamed from: p */
    final /* synthetic */ zzp f39562p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzab(zzac zzac, zzaf zzaf, CharSequence charSequence, zzp zzp) {
        super(zzaf, charSequence);
        this.f39562p = zzp;
    }

    /* renamed from: c */
    public final int mo48817c(int i) {
        return ((zzs) this.f39562p).f40382a.end();
    }

    /* renamed from: d */
    public final int mo48818d(int i) {
        if (((zzs) this.f39562p).f40382a.find(i)) {
            return ((zzs) this.f39562p).f40382a.start();
        }
        return -1;
    }
}
