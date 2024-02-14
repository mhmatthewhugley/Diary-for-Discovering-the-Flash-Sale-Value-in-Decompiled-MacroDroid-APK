package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzfv {

    /* renamed from: a */
    private final zzqv f40078a;

    /* renamed from: b */
    private final Class f40079b;

    /* synthetic */ zzfv(zzqv zzqv, Class cls, zzfu zzfu) {
        this.f40078a = zzqv;
        this.f40079b = cls;
    }

    /* renamed from: b */
    public static zzfv m57276b(zzft zzft, zzqv zzqv, Class cls) {
        return new zzfs(zzqv, cls, zzft);
    }

    /* renamed from: a */
    public abstract zzaw mo49415a(zzha zzha, zzca zzca) throws GeneralSecurityException;

    /* renamed from: c */
    public final zzqv mo49417c() {
        return this.f40078a;
    }

    /* renamed from: d */
    public final Class mo49418d() {
        return this.f40079b;
    }
}
