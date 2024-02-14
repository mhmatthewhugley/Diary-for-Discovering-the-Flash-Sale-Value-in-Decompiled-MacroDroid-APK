package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzgaw implements zzgau {

    /* renamed from: a */
    private final zzgfr f36624a;

    /* renamed from: b */
    private final Class f36625b;

    public zzgaw(zzgfr zzgfr, Class cls) {
        if (zzgfr.mo46780j().contains(cls) || Void.class.equals(cls)) {
            this.f36624a = zzgfr;
            this.f36625b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzgfr.toString(), cls.getName()}));
    }

    /* renamed from: g */
    private final zzgav m51484g() {
        return new zzgav(this.f36624a.mo46732a());
    }

    /* renamed from: h */
    private final Object m51485h(zzgso zzgso) throws GeneralSecurityException {
        if (!Void.class.equals(this.f36625b)) {
            this.f36624a.mo46735d(zzgso);
            return this.f36624a.mo46779i(zzgso, this.f36625b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: a */
    public final Class mo46662a() {
        return this.f36625b;
    }

    /* renamed from: b */
    public final Object mo46663b(zzgpw zzgpw) throws GeneralSecurityException {
        try {
            return m51485h(this.f36624a.mo46733b(zzgpw));
        } catch (zzgrq e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f36624a.mo46778h().getName()), e);
        }
    }

    /* renamed from: c */
    public final String mo46664c() {
        return this.f36624a.mo46734c();
    }

    /* renamed from: d */
    public final Object mo46665d(zzgso zzgso) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.f36624a.mo46778h().getName());
        if (this.f36624a.mo46778h().isInstance(zzgso)) {
            return m51485h(zzgso);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: e */
    public final zzgso mo46666e(zzgpw zzgpw) throws GeneralSecurityException {
        try {
            return m51484g().mo46668a(zzgpw);
        } catch (zzgrq e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f36624a.mo46732a().mo46776e().getName()), e);
        }
    }

    /* renamed from: f */
    public final zzglx mo46667f(zzgpw zzgpw) throws GeneralSecurityException {
        try {
            zzgso a = m51484g().mo46668a(zzgpw);
            zzglw F = zzglx.m52285F();
            F.mo46968n(this.f36624a.mo46734c());
            F.mo46969o(a.mo47051t());
            F.mo46970u(this.f36624a.mo46737f());
            return (zzglx) F.mo47341h();
        } catch (zzgrq e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
