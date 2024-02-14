package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzgb {

    /* renamed from: a */
    private final Class f40085a;

    public zzgb(Class cls) {
        this.f40085a = cls;
    }

    /* renamed from: a */
    public abstract zzaek mo49369a(zzaek zzaek) throws GeneralSecurityException;

    /* renamed from: b */
    public abstract zzaek mo49370b(zzacc zzacc) throws zzadn;

    /* renamed from: c */
    public Map mo49371c() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    /* renamed from: d */
    public abstract void mo49372d(zzaek zzaek) throws GeneralSecurityException;

    /* renamed from: e */
    public final Class mo49421e() {
        return this.f40085a;
    }
}
