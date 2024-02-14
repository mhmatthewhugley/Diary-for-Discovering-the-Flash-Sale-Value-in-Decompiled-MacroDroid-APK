package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgby {

    /* renamed from: a */
    private static final Logger f36669a = Logger.getLogger(zzgby.class.getName());

    /* renamed from: b */
    private static final AtomicReference f36670b = new AtomicReference(new zzgbb());

    /* renamed from: c */
    private static final ConcurrentMap f36671c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap f36672d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap f36673e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f36674f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap f36675g = new ConcurrentHashMap();

    private zzgby() {
    }

    @Deprecated
    /* renamed from: a */
    public static zzgan m51560a(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap concurrentMap = f36673e;
            Locale locale = Locale.US;
            zzgan zzgan = (zzgan) concurrentMap.get(str.toLowerCase(locale));
            if (zzgan != null) {
                return zzgan;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static zzgau m51561b(String str) throws GeneralSecurityException {
        return ((zzgbb) f36670b.get()).mo46675b(str);
    }

    /* renamed from: c */
    public static synchronized zzglx m51562c(zzgmc zzgmc) throws GeneralSecurityException {
        zzglx f;
        synchronized (zzgby.class) {
            zzgau b = m51561b(zzgmc.mo46978J());
            if (((Boolean) f36672d.get(zzgmc.mo46978J())).booleanValue()) {
                f = b.mo46667f(zzgmc.mo46977I());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgmc.mo46978J())));
            }
        }
        return f;
    }

    /* renamed from: d */
    public static synchronized zzgso m51563d(zzgmc zzgmc) throws GeneralSecurityException {
        zzgso e;
        synchronized (zzgby.class) {
            zzgau b = m51561b(zzgmc.mo46978J());
            if (((Boolean) f36672d.get(zzgmc.mo46978J())).booleanValue()) {
                e = b.mo46666e(zzgmc.mo46977I());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgmc.mo46978J())));
            }
        }
        return e;
    }

    /* renamed from: e */
    public static Class m51564e(Class cls) {
        zzgbv zzgbv = (zzgbv) f36674f.get(cls);
        if (zzgbv == null) {
            return null;
        }
        return zzgbv.zza();
    }

    /* renamed from: f */
    public static Object m51565f(zzglx zzglx, Class cls) throws GeneralSecurityException {
        return m51566g(zzglx.mo46972J(), zzglx.mo46971I(), cls);
    }

    /* renamed from: g */
    public static Object m51566g(String str, zzgpw zzgpw, Class cls) throws GeneralSecurityException {
        return ((zzgbb) f36670b.get()).mo46674a(str, cls).mo46663b(zzgpw);
    }

    /* renamed from: h */
    public static Object m51567h(String str, zzgso zzgso, Class cls) throws GeneralSecurityException {
        return ((zzgbb) f36670b.get()).mo46674a(str, cls).mo46665d(zzgso);
    }

    /* renamed from: i */
    public static Object m51568i(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return m51566g(str, zzgpw.m52564R(bArr), cls);
    }

    /* renamed from: j */
    public static Object m51569j(zzgbu zzgbu, Class cls) throws GeneralSecurityException {
        zzgbv zzgbv = (zzgbv) f36674f.get(cls);
        if (zzgbv == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(zzgbu.mo46712c().getName()));
        } else if (zzgbv.zza().equals(zzgbu.mo46712c())) {
            return zzgbv.mo46716a(zzgbu);
        } else {
            String obj = zzgbv.zza().toString();
            String obj2 = zzgbu.mo46712c().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    /* renamed from: k */
    static synchronized Map m51570k() {
        Map unmodifiableMap;
        synchronized (zzgby.class) {
            unmodifiableMap = Collections.unmodifiableMap(f36675g);
        }
        return unmodifiableMap;
    }

    /* renamed from: l */
    public static synchronized void m51571l(zzggg zzggg, zzgfr zzgfr, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            AtomicReference atomicReference = f36670b;
            zzgbb zzgbb = new zzgbb((zzgbb) atomicReference.get());
            zzgbb.mo46676c(zzggg, zzgfr);
            String c = zzggg.mo46734c();
            String c2 = zzgfr.mo46734c();
            m51575p(c, zzggg.mo46732a().mo46730c(), true);
            m51575p(c2, Collections.emptyMap(), false);
            if (!((zzgbb) atomicReference.get()).mo46679f(c)) {
                f36671c.put(c, new zzgbx(zzggg));
                m51576q(zzggg.mo46734c(), zzggg.mo46732a().mo46730c());
            }
            ConcurrentMap concurrentMap = f36672d;
            concurrentMap.put(c, Boolean.TRUE);
            concurrentMap.put(c2, Boolean.FALSE);
            atomicReference.set(zzgbb);
        }
    }

    /* renamed from: m */
    public static synchronized void m51572m(zzgau zzgau, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            if (zzgau != null) {
                try {
                    AtomicReference atomicReference = f36670b;
                    zzgbb zzgbb = new zzgbb((zzgbb) atomicReference.get());
                    zzgbb.mo46677d(zzgau);
                    if (zzgds.m51728a(1)) {
                        String c = zzgau.mo46664c();
                        m51575p(c, Collections.emptyMap(), z);
                        f36672d.put(c, Boolean.valueOf(z));
                        atomicReference.set(zzgbb);
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: n */
    public static synchronized void m51573n(zzgfr zzgfr, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            AtomicReference atomicReference = f36670b;
            zzgbb zzgbb = new zzgbb((zzgbb) atomicReference.get());
            zzgbb.mo46678e(zzgfr);
            String c = zzgfr.mo46734c();
            m51575p(c, zzgfr.mo46732a().mo46730c(), true);
            if (!((zzgbb) atomicReference.get()).mo46679f(c)) {
                f36671c.put(c, new zzgbx(zzgfr));
                m51576q(c, zzgfr.mo46732a().mo46730c());
            }
            f36672d.put(c, Boolean.TRUE);
            atomicReference.set(zzgbb);
        }
    }

    /* renamed from: o */
    public static synchronized void m51574o(zzgbv zzgbv) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            if (zzgbv != null) {
                Class zzb = zzgbv.zzb();
                ConcurrentMap concurrentMap = f36674f;
                if (concurrentMap.containsKey(zzb)) {
                    zzgbv zzgbv2 = (zzgbv) concurrentMap.get(zzb);
                    if (!zzgbv.getClass().getName().equals(zzgbv2.getClass().getName())) {
                        f36669a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb.getName(), zzgbv2.getClass().getName(), zzgbv.getClass().getName()}));
                    }
                }
                concurrentMap.put(zzb, zzgbv);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: p */
    private static synchronized void m51575p(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzgby.class) {
            if (z) {
                ConcurrentMap concurrentMap = f36672d;
                if (concurrentMap.containsKey(str)) {
                    if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((zzgbb) f36670b.get()).mo46679f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f36675g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f36675g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.internal.ads.zzgso, java.lang.Object] */
    /* renamed from: q */
    private static void m51576q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f36675g.put((String) entry.getKey(), zzgbd.m51520e(str, ((zzgfp) entry.getValue()).f36796a.mo47050p(), ((zzgfp) entry.getValue()).f36797b));
        }
    }
}
