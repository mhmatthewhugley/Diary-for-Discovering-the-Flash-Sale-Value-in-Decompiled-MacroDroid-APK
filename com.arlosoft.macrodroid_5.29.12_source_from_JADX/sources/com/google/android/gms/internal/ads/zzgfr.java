package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzgfr {

    /* renamed from: a */
    private final Class f36799a;

    /* renamed from: b */
    private final Map f36800b;

    /* renamed from: c */
    private final Class f36801c;

    @SafeVarargs
    protected zzgfr(Class cls, zzggf... zzggfArr) {
        this.f36799a = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            zzggf zzggf = zzggfArr[i];
            if (!hashMap.containsKey(zzggf.mo46791b())) {
                hashMap.put(zzggf.mo46791b(), zzggf);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzggf.mo46791b().getCanonicalName())));
            }
        }
        this.f36801c = zzggfArr[0].mo46791b();
        this.f36800b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public zzgfq mo46732a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract zzgso mo46733b(zzgpw zzgpw) throws zzgrq;

    /* renamed from: c */
    public abstract String mo46734c();

    /* renamed from: d */
    public abstract void mo46735d(zzgso zzgso) throws GeneralSecurityException;

    /* renamed from: e */
    public int mo46736e() {
        return 1;
    }

    /* renamed from: f */
    public abstract int mo46737f();

    /* renamed from: g */
    public final Class mo46777g() {
        return this.f36801c;
    }

    /* renamed from: h */
    public final Class mo46778h() {
        return this.f36799a;
    }

    /* renamed from: i */
    public final Object mo46779i(zzgso zzgso, Class cls) throws GeneralSecurityException {
        zzggf zzggf = (zzggf) this.f36800b.get(cls);
        if (zzggf != null) {
            return zzggf.mo46727a(zzgso);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    /* renamed from: j */
    public final Set mo46780j() {
        return this.f36800b.keySet();
    }
}
