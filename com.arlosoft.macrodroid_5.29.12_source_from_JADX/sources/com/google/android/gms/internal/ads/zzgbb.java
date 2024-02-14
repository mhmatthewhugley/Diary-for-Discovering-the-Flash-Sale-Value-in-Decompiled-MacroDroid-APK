package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgbb {

    /* renamed from: b */
    private static final Logger f36638b = Logger.getLogger(zzgbb.class.getName());

    /* renamed from: a */
    private final ConcurrentMap f36639a;

    zzgbb() {
        this.f36639a = new ConcurrentHashMap();
    }

    /* renamed from: g */
    private final synchronized zzgba m51512g(String str) throws GeneralSecurityException {
        if (this.f36639a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzgba) this.f36639a.get(str);
    }

    /* renamed from: h */
    private final synchronized void m51513h(zzgba zzgba, boolean z) throws GeneralSecurityException {
        String c = zzgba.zzb().mo46664c();
        zzgba zzgba2 = (zzgba) this.f36639a.get(c);
        if (zzgba2 != null) {
            if (!zzgba2.mo46669a().equals(zzgba.mo46669a())) {
                f36638b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(c));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{c, zzgba2.mo46669a().getName(), zzgba.mo46669a().getName()}));
            }
        }
        if (!z) {
            this.f36639a.putIfAbsent(c, zzgba);
        } else {
            this.f36639a.put(c, zzgba);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzgau mo46674a(String str, Class cls) throws GeneralSecurityException {
        zzgba g = m51512g(str);
        if (g.mo46670b().contains(cls)) {
            return g.mo46671c(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g.mo46669a());
        Set<Class> b = g.mo46670b();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : b) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzgau mo46675b(String str) throws GeneralSecurityException {
        return m51512g(str).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo46676c(zzggg zzggg, zzgfr zzgfr) throws GeneralSecurityException {
        Class d;
        int e = zzgfr.mo46736e();
        if (!zzgds.m51728a(1)) {
            String valueOf = String.valueOf(zzggg.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzgds.m51728a(e)) {
            String c = zzggg.mo46734c();
            String c2 = zzgfr.mo46734c();
            if (!(!this.f36639a.containsKey(c) || ((zzgba) this.f36639a.get(c)).mo46672d() == null || (d = ((zzgba) this.f36639a.get(c)).mo46672d()) == null)) {
                if (!d.getName().equals(zzgfr.getClass().getName())) {
                    Logger logger = f36638b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + c + " with inconsistent public key type " + c2);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzggg.getClass().getName(), d.getName(), zzgfr.getClass().getName()}));
                }
            }
            m51513h(new zzgaz(zzggg, zzgfr), true);
            m51513h(new zzgay(zzgfr), false);
        } else {
            String valueOf2 = String.valueOf(zzgfr.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo46677d(zzgau zzgau) throws GeneralSecurityException {
        if (zzgds.m51728a(1)) {
            m51513h(new zzgax(zzgau), false);
        } else {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo46678e(zzgfr zzgfr) throws GeneralSecurityException {
        if (zzgds.m51728a(zzgfr.mo46736e())) {
            m51513h(new zzgay(zzgfr), false);
        } else {
            String valueOf = String.valueOf(zzgfr.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo46679f(String str) {
        return this.f36639a.containsKey(str);
    }

    zzgbb(zzgbb zzgbb) {
        this.f36639a = new ConcurrentHashMap(zzgbb.f36639a);
    }
}
