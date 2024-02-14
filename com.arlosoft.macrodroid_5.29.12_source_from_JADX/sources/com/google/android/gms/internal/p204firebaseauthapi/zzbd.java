package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzbd {

    /* renamed from: b */
    private static final Logger f39905b = Logger.getLogger(zzbd.class.getName());

    /* renamed from: a */
    private final ConcurrentMap f39906a;

    zzbd() {
        this.f39906a = new ConcurrentHashMap();
    }

    /* renamed from: g */
    private final zzax m56935g(String str, Class cls) throws GeneralSecurityException {
        zzbc h = m56936h(str);
        if (cls == null) {
            return h.zzb();
        }
        if (h.mo49313b().contains(cls)) {
            return h.mo49314c(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(h.mo49312a());
        Set<Class> b = h.mo49313b();
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

    /* renamed from: h */
    private final synchronized zzbc m56936h(String str) throws GeneralSecurityException {
        if (this.f39906a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbc) this.f39906a.get(str);
    }

    /* renamed from: i */
    private final synchronized void m56937i(zzbc zzbc, boolean z) throws GeneralSecurityException {
        String b = zzbc.zzb().mo49307b();
        zzbc zzbc2 = (zzbc) this.f39906a.get(b);
        if (zzbc2 != null) {
            if (!zzbc2.mo49312a().equals(zzbc.mo49312a())) {
                f39905b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(b));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{b, zzbc2.mo49312a().getName(), zzbc.mo49312a().getName()}));
            }
        }
        if (!z) {
            this.f39906a.putIfAbsent(b, zzbc);
        } else {
            this.f39906a.put(b, zzbc);
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: a */
    public final zzax mo49317a(String str) throws GeneralSecurityException {
        return m56935g(str, (Class) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final zzax mo49318b(String str, Class cls) throws GeneralSecurityException {
        return m56935g(str, cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzax mo49319c(String str) throws GeneralSecurityException {
        return m56936h(str).zzb();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo49320d(zzgx zzgx, zzgc zzgc) throws GeneralSecurityException {
        Class d;
        int f = zzgc.mo49378f();
        if (!zzdv.m57153a(1)) {
            String valueOf = String.valueOf(zzgx.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzdv.m57153a(f)) {
            String d2 = zzgx.mo49376d();
            String d3 = zzgc.mo49376d();
            if (!(!this.f39906a.containsKey(d2) || ((zzbc) this.f39906a.get(d2)).mo49315d() == null || (d = ((zzbc) this.f39906a.get(d2)).mo49315d()) == null)) {
                if (!d.getName().equals(zzgc.getClass().getName())) {
                    Logger logger = f39905b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d2 + " with inconsistent public key type " + d3);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzgx.getClass().getName(), d.getName(), zzgc.getClass().getName()}));
                }
            }
            m56937i(new zzbb(zzgx, zzgc), true);
            m56937i(new zzba(zzgc), false);
        } else {
            String valueOf2 = String.valueOf(zzgc.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo49321e(zzgc zzgc) throws GeneralSecurityException {
        if (zzdv.m57153a(zzgc.mo49378f())) {
            m56937i(new zzba(zzgc), false);
        } else {
            String valueOf = String.valueOf(zzgc.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo49322f(String str) {
        return this.f39906a.containsKey(str);
    }

    zzbd(zzbd zzbd) {
        this.f39906a = new ConcurrentHashMap(zzbd.f39906a);
    }
}
