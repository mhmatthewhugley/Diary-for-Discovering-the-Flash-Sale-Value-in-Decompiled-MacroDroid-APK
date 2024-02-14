package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgog {

    /* renamed from: b */
    private static final Logger f36961b = Logger.getLogger(zzgog.class.getName());

    /* renamed from: c */
    private static final List f36962c;

    /* renamed from: d */
    private static final boolean f36963d;

    /* renamed from: e */
    public static final zzgog f36964e = new zzgog(new zzgoh());

    /* renamed from: f */
    public static final zzgog f36965f = new zzgog(new zzgol());

    /* renamed from: g */
    public static final zzgog f36966g = new zzgog(new zzgon());

    /* renamed from: h */
    public static final zzgog f36967h = new zzgog(new zzgom());

    /* renamed from: i */
    public static final zzgog f36968i = new zzgog(new zzgoi());

    /* renamed from: j */
    public static final zzgog f36969j = new zzgog(new zzgok());

    /* renamed from: k */
    public static final zzgog f36970k = new zzgog(new zzgoj());

    /* renamed from: a */
    private final zzgoo f36971a;

    static {
        if (zzgdt.m51730b()) {
            f36962c = m52459b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f36963d = false;
        } else if (zzgoy.m52493b()) {
            f36962c = m52459b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f36963d = true;
        } else {
            f36962c = new ArrayList();
            f36963d = true;
        }
    }

    public zzgog(zzgoo zzgoo) {
        this.f36971a = zzgoo;
    }

    /* renamed from: b */
    public static List m52459b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f36961b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object mo47033a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f36962c) {
            try {
                return this.f36971a.mo47034a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f36963d) {
            return this.f36971a.mo47034a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
