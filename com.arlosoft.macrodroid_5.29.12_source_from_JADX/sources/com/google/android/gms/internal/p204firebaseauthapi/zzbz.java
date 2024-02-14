package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbz {

    /* renamed from: a */
    private static final Logger f39934a = Logger.getLogger(zzbz.class.getName());

    /* renamed from: b */
    private static final AtomicReference f39935b = new AtomicReference(new zzbd());

    /* renamed from: c */
    private static final ConcurrentMap f39936c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap f39937d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap f39938e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f39939f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap f39940g = new ConcurrentHashMap();

    private zzbz() {
    }

    @Deprecated
    /* renamed from: a */
    public static zzax m56996a(String str) throws GeneralSecurityException {
        return ((zzbd) f39935b.get()).mo49317a(str);
    }

    /* renamed from: b */
    public static zzax m56997b(String str) throws GeneralSecurityException {
        return ((zzbd) f39935b.get()).mo49319c(str);
    }

    /* renamed from: c */
    public static synchronized zzns m56998c(zznx zznx) throws GeneralSecurityException {
        zzns f;
        synchronized (zzbz.class) {
            zzax b = m56997b(zznx.mo49665H());
            if (((Boolean) f39937d.get(zznx.mo49665H())).booleanValue()) {
                f = b.mo49310f(zznx.mo49664G());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zznx.mo49665H())));
            }
        }
        return f;
    }

    /* renamed from: d */
    public static synchronized zzaek m56999d(zznx zznx) throws GeneralSecurityException {
        zzaek e;
        synchronized (zzbz.class) {
            zzax b = m56997b(zznx.mo49665H());
            if (((Boolean) f39937d.get(zznx.mo49665H())).booleanValue()) {
                e = b.mo49309e(zznx.mo49664G());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zznx.mo49665H())));
            }
        }
        return e;
    }

    /* renamed from: e */
    public static Class m57000e(Class cls) {
        zzbv zzbv = (zzbv) f39939f.get(cls);
        if (zzbv == null) {
            return null;
        }
        return zzbv.zza();
    }

    @Deprecated
    /* renamed from: f */
    public static Object m57001f(zzns zzns) throws GeneralSecurityException {
        String H = zzns.mo49659H();
        return ((zzbd) f39935b.get()).mo49317a(H).mo49308d(zzns.mo49658G());
    }

    /* renamed from: g */
    public static Object m57002g(zzns zzns, Class cls) throws GeneralSecurityException {
        return m57003h(zzns.mo49659H(), zzns.mo49658G(), cls);
    }

    /* renamed from: h */
    public static Object m57003h(String str, zzacc zzacc, Class cls) throws GeneralSecurityException {
        return ((zzbd) f39935b.get()).mo49318b(str, cls).mo49308d(zzacc);
    }

    /* renamed from: i */
    public static Object m57004i(String str, zzaek zzaek, Class cls) throws GeneralSecurityException {
        return ((zzbd) f39935b.get()).mo49318b(str, cls).mo49306a(zzaek);
    }

    /* renamed from: j */
    public static Object m57005j(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return m57003h(str, zzacc.m56159t(bArr), cls);
    }

    /* renamed from: k */
    public static Object m57006k(zzbu zzbu, Class cls) throws GeneralSecurityException {
        zzbv zzbv = (zzbv) f39939f.get(cls);
        if (zzbv == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(zzbu.mo49359c().getName()));
        } else if (zzbv.zza().equals(zzbu.mo49359c())) {
            return zzbv.mo49363a(zzbu);
        } else {
            String obj = zzbv.zza().toString();
            String obj2 = zzbu.mo49359c().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    /* renamed from: l */
    static synchronized Map m57007l() {
        Map unmodifiableMap;
        synchronized (zzbz.class) {
            unmodifiableMap = Collections.unmodifiableMap(f39940g);
        }
        return unmodifiableMap;
    }

    /* renamed from: m */
    public static synchronized void m57008m(zzgx zzgx, zzgc zzgc, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            AtomicReference atomicReference = f39935b;
            zzbd zzbd = new zzbd((zzbd) atomicReference.get());
            zzbd.mo49320d(zzgx, zzgc);
            String d = zzgx.mo49376d();
            String d2 = zzgc.mo49376d();
            m57011p(d, zzgx.mo49373a().mo49371c(), true);
            m57011p(d2, Collections.emptyMap(), false);
            if (!((zzbd) atomicReference.get()).mo49322f(d)) {
                f39936c.put(d, new zzby(zzgx));
                m57012q(zzgx.mo49376d(), zzgx.mo49373a().mo49371c());
            }
            ConcurrentMap concurrentMap = f39937d;
            concurrentMap.put(d, Boolean.TRUE);
            concurrentMap.put(d2, Boolean.FALSE);
            atomicReference.set(zzbd);
        }
    }

    /* renamed from: n */
    public static synchronized void m57009n(zzgc zzgc, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            AtomicReference atomicReference = f39935b;
            zzbd zzbd = new zzbd((zzbd) atomicReference.get());
            zzbd.mo49321e(zzgc);
            String d = zzgc.mo49376d();
            m57011p(d, zzgc.mo49373a().mo49371c(), true);
            if (!((zzbd) atomicReference.get()).mo49322f(d)) {
                f39936c.put(d, new zzby(zzgc));
                m57012q(d, zzgc.mo49373a().mo49371c());
            }
            f39937d.put(d, Boolean.TRUE);
            atomicReference.set(zzbd);
        }
    }

    /* renamed from: o */
    public static synchronized void m57010o(zzbv zzbv) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            if (zzbv != null) {
                Class zzb = zzbv.zzb();
                ConcurrentMap concurrentMap = f39939f;
                if (concurrentMap.containsKey(zzb)) {
                    zzbv zzbv2 = (zzbv) concurrentMap.get(zzb);
                    if (!zzbv.getClass().getName().equals(zzbv2.getClass().getName())) {
                        f39934a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb.getName(), zzbv2.getClass().getName(), zzbv.getClass().getName()}));
                    }
                }
                concurrentMap.put(zzb, zzbv);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: p */
    private static synchronized void m57011p(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            if (z) {
                ConcurrentMap concurrentMap = f39937d;
                if (concurrentMap.containsKey(str)) {
                    if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((zzbd) f39935b.get()).mo49322f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f39940g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f39940g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.internal.firebase-auth-api.zzaek, java.lang.Object] */
    /* renamed from: q */
    private static void m57012q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f39940g.put((String) entry.getKey(), zzbf.m56944e(str, ((zzga) entry.getValue()).f40083a.mo48861s(), ((zzga) entry.getValue()).f40084b));
        }
    }
}
