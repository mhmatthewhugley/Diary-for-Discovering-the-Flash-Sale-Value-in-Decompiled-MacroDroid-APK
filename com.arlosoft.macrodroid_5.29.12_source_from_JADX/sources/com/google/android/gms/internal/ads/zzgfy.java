package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgfy {

    /* renamed from: b */
    private static final zzgfy f36806b = new zzgfy();

    /* renamed from: a */
    private final AtomicReference f36807a = new AtomicReference(new zzggp(new zzggj(), (zzggo) null));

    /* renamed from: a */
    public static zzgfy m51849a() {
        return f36806b;
    }

    /* renamed from: b */
    public final synchronized void mo46783b(zzgfl zzgfl) throws GeneralSecurityException {
        zzggj zzggj = new zzggj((zzggp) this.f36807a.get());
        zzggj.mo46792a(zzgfl);
        this.f36807a.set(new zzggp(zzggj, (zzggo) null));
    }

    /* renamed from: c */
    public final synchronized void mo46784c(zzgfo zzgfo) throws GeneralSecurityException {
        zzggj zzggj = new zzggj((zzggp) this.f36807a.get());
        zzggj.mo46793b(zzgfo);
        this.f36807a.set(new zzggp(zzggj, (zzggo) null));
    }

    /* renamed from: d */
    public final synchronized void mo46785d(zzggb zzggb) throws GeneralSecurityException {
        zzggj zzggj = new zzggj((zzggp) this.f36807a.get());
        zzggj.mo46794c(zzggb);
        this.f36807a.set(new zzggp(zzggj, (zzggo) null));
    }

    /* renamed from: e */
    public final synchronized void mo46786e(zzgge zzgge) throws GeneralSecurityException {
        zzggj zzggj = new zzggj((zzggp) this.f36807a.get());
        zzggj.mo46795d(zzgge);
        this.f36807a.set(new zzggp(zzggj, (zzggo) null));
    }
}
