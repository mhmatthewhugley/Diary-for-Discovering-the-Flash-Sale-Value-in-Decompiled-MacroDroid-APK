package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class zzgc {

    /* renamed from: a */
    private final Class f40086a;

    /* renamed from: b */
    private final Map f40087b;

    /* renamed from: c */
    private final Class f40088c;

    @SafeVarargs
    protected zzgc(Class cls, zzgw... zzgwArr) {
        this.f40086a = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            zzgw zzgw = zzgwArr[i];
            if (!hashMap.containsKey(zzgw.mo49438b())) {
                hashMap.put(zzgw.mo49438b(), zzgw);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgw.mo49438b().getCanonicalName())));
            }
        }
        this.f40088c = zzgwArr[0].mo49438b();
        this.f40087b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public zzgb mo49373a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    /* renamed from: b */
    public abstract zznr mo49374b();

    /* renamed from: c */
    public abstract zzaek mo49375c(zzacc zzacc) throws zzadn;

    /* renamed from: d */
    public abstract String mo49376d();

    /* renamed from: e */
    public abstract void mo49377e(zzaek zzaek) throws GeneralSecurityException;

    /* renamed from: f */
    public int mo49378f() {
        return 1;
    }

    /* renamed from: g */
    public final Class mo49422g() {
        return this.f40088c;
    }

    /* renamed from: h */
    public final Class mo49423h() {
        return this.f40086a;
    }

    /* renamed from: i */
    public final Object mo49424i(zzaek zzaek, Class cls) throws GeneralSecurityException {
        zzgw zzgw = (zzgw) this.f40087b.get(cls);
        if (zzgw != null) {
            return zzgw.mo49368a(zzaek);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    /* renamed from: j */
    public final Set mo49425j() {
        return this.f40087b.keySet();
    }
}
