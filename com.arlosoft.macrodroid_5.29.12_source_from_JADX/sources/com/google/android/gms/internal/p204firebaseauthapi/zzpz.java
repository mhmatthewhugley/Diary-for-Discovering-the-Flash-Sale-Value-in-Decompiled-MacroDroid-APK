package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpz {

    /* renamed from: b */
    private static final Logger f40321b = Logger.getLogger(zzpz.class.getName());

    /* renamed from: c */
    private static final List f40322c;

    /* renamed from: d */
    private static final boolean f40323d;

    /* renamed from: e */
    public static final zzpz f40324e = new zzpz(new zzqa());

    /* renamed from: f */
    public static final zzpz f40325f = new zzpz(new zzqe());

    /* renamed from: g */
    public static final zzpz f40326g = new zzpz(new zzqg());

    /* renamed from: h */
    public static final zzpz f40327h = new zzpz(new zzqf());

    /* renamed from: i */
    public static final zzpz f40328i = new zzpz(new zzqb());

    /* renamed from: j */
    public static final zzpz f40329j = new zzpz(new zzqd());

    /* renamed from: k */
    public static final zzpz f40330k = new zzpz(new zzqc());

    /* renamed from: a */
    private final zzqh f40331a;

    static {
        if (zzdw.m57155b()) {
            f40322c = m57946b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f40323d = false;
        } else if (zzqr.m57978a()) {
            f40322c = m57946b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f40323d = true;
        } else {
            f40322c = new ArrayList();
            f40323d = true;
        }
    }

    public zzpz(zzqh zzqh) {
        this.f40331a = zzqh;
    }

    /* renamed from: b */
    public static List m57946b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f40321b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object mo49715a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f40322c) {
            try {
                return this.f40331a.mo49717a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f40323d) {
            return this.f40331a.mo49717a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
