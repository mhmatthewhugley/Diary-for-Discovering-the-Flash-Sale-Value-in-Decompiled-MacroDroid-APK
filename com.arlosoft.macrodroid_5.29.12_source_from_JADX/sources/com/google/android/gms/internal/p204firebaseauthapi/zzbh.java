package com.google.android.gms.internal.p204firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzbh {

    /* renamed from: a */
    private final zzof f39912a;

    /* renamed from: b */
    private final zzjc f39913b = zzjc.f40202b;

    private zzbh(zzof zzof) {
        this.f39912a = zzof;
    }

    /* renamed from: a */
    static final zzbh m56950a(zzof zzof) throws GeneralSecurityException {
        m56952i(zzof);
        return new zzbh(zzof);
    }

    /* renamed from: h */
    public static final zzbh m56951h(zzfq zzfq, zzap zzap) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzmo a = zzfq.mo49413a();
        if (a == null || a.mo49615F().mo48893f() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            zzof H = zzof.m57829H(zzap.mo49299a(a.mo49615F().mo48904F(), bArr), zzacs.m56379a());
            m56952i(H);
            return new zzbh(H);
        } catch (zzadn unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: i */
    private static void m56952i(zzof zzof) throws GeneralSecurityException {
        if (zzof == null || zzof.mo49680C() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    public final zzbh mo49328b() throws GeneralSecurityException {
        if (this.f39912a != null) {
            zzoc E = zzof.m57827E();
            for (zzoe zzoe : this.f39912a.mo49683I()) {
                zzns D = zzoe.mo49676D();
                if (D.mo49657D() == zznr.ASYMMETRIC_PRIVATE) {
                    String H = D.mo49659H();
                    zzacc G = D.mo49658G();
                    zzax a = zzbz.m56996a(H);
                    if (a instanceof zzbw) {
                        zzns c = ((zzbw) a).mo49366c(G);
                        zzbz.m57001f(c);
                        zzod zzod = (zzod) zzoe.mo49089w();
                        zzod.mo49671n(c);
                        E.mo49667o((zzoe) zzod.mo49069f());
                    } else {
                        throw new GeneralSecurityException("manager for key type " + H + " is not a PrivateKeyManager");
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            E.mo49668q(this.f39912a.mo49681D());
            return new zzbh((zzof) E.mo49069f());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final zzof mo49329c() {
        return this.f39912a;
    }

    /* renamed from: d */
    public final zzok mo49330d() {
        return zzcb.m57015a(this.f39912a);
    }

    /* renamed from: e */
    public final Object mo49331e(Class cls) throws GeneralSecurityException {
        Class e = zzbz.m57000e(cls);
        if (e != null) {
            zzcb.m57016b(this.f39912a);
            zzbp zzbp = new zzbp(e, (zzbo) null);
            zzbp.mo49344c(this.f39913b);
            for (zzoe zzoe : this.f39912a.mo49683I()) {
                if (zzoe.mo49679L() == 3) {
                    Object g = zzbz.m57002g(zzoe.mo49676D(), e);
                    if (zzoe.mo49675C() == this.f39912a.mo49681D()) {
                        zzbp.mo49342a(g, zzoe);
                    } else {
                        zzbp.mo49343b(g, zzoe);
                    }
                }
            }
            return zzbz.m57006k(zzbp.mo49345d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    /* renamed from: f */
    public final void mo49332f(zzbj zzbj, zzap zzap) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzof zzof = this.f39912a;
        byte[] b = zzap.mo49300b(zzof.mo48861s(), bArr);
        try {
            if (zzof.m57829H(zzap.mo49299a(b, bArr), zzacs.m56379a()).equals(zzof)) {
                zzmn C = zzmo.m57682C();
                C.mo49613n(zzacc.m56159t(b));
                C.mo49614o(zzcb.m57015a(zzof));
                zzbj.mo49302b((zzmo) C.mo49069f());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzadn unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49333g(com.google.android.gms.internal.p204firebaseauthapi.zzbj r5) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            r4 = this;
            com.google.android.gms.internal.firebase-auth-api.zzof r0 = r4.f39912a
            java.util.List r0 = r0.mo49683I()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.zzoe r1 = (com.google.android.gms.internal.p204firebaseauthapi.zzoe) r1
            com.google.android.gms.internal.firebase-auth-api.zzns r2 = r1.mo49676D()
            com.google.android.gms.internal.firebase-auth-api.zznr r2 = r2.mo49657D()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = com.google.android.gms.internal.p204firebaseauthapi.zznr.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzns r2 = r1.mo49676D()
            com.google.android.gms.internal.firebase-auth-api.zznr r2 = r2.mo49657D()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = com.google.android.gms.internal.p204firebaseauthapi.zznr.SYMMETRIC
            if (r2 == r3) goto L_0x003b
            com.google.android.gms.internal.firebase-auth-api.zzns r2 = r1.mo49676D()
            com.google.android.gms.internal.firebase-auth-api.zznr r2 = r2.mo49657D()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = com.google.android.gms.internal.p204firebaseauthapi.zznr.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L_0x003b
            goto L_0x000a
        L_0x003b:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            com.google.android.gms.internal.firebase-auth-api.zzns r3 = r1.mo49676D()
            com.google.android.gms.internal.firebase-auth-api.zznr r3 = r3.mo49657D()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.zzns r1 = r1.mo49676D()
            java.lang.String r1 = r1.mo49659H()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L_0x0064:
            com.google.android.gms.internal.firebase-auth-api.zzof r0 = r4.f39912a
            r5.mo49301a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzbh.mo49333g(com.google.android.gms.internal.firebase-auth-api.zzbj):void");
    }

    public final String toString() {
        return zzcb.m57015a(this.f39912a).toString();
    }
}
