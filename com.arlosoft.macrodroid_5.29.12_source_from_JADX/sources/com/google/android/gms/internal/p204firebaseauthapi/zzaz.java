package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
class zzaz implements zzax {

    /* renamed from: a */
    private final zzgc f39900a;

    /* renamed from: b */
    private final Class f39901b;

    public zzaz(zzgc zzgc, Class cls) {
        if (zzgc.mo49425j().contains(cls) || Void.class.equals(cls)) {
            this.f39900a = zzgc;
            this.f39901b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzgc.toString(), cls.getName()}));
    }

    /* renamed from: g */
    private final zzay m56915g() {
        return new zzay(this.f39900a.mo49373a());
    }

    /* renamed from: h */
    private final Object m56916h(zzaek zzaek) throws GeneralSecurityException {
        if (!Void.class.equals(this.f39901b)) {
            this.f39900a.mo49377e(zzaek);
            return this.f39900a.mo49424i(zzaek, this.f39901b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final Object mo49306a(zzaek zzaek) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.f39900a.mo49423h().getName());
        if (this.f39900a.mo49423h().isInstance(zzaek)) {
            return m56916h(zzaek);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: b */
    public final String mo49307b() {
        return this.f39900a.mo49376d();
    }

    /* renamed from: d */
    public final Object mo49308d(zzacc zzacc) throws GeneralSecurityException {
        try {
            return m56916h(this.f39900a.mo49375c(zzacc));
        } catch (zzadn e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f39900a.mo49423h().getName()), e);
        }
    }

    /* renamed from: e */
    public final zzaek mo49309e(zzacc zzacc) throws GeneralSecurityException {
        try {
            return m56915g().mo49311a(zzacc);
        } catch (zzadn e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f39900a.mo49373a().mo49421e().getName()), e);
        }
    }

    /* renamed from: f */
    public final zzns mo49310f(zzacc zzacc) throws GeneralSecurityException {
        try {
            zzaek a = m56915g().mo49311a(zzacc);
            zznp C = zzns.m57780C();
            C.mo49653o(this.f39900a.mo49376d());
            C.mo49654q(a.mo48860l());
            C.mo49652n(this.f39900a.mo49374b());
            return (zzns) C.mo49069f();
        } catch (zzadn e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
