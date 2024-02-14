package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzba */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzba implements zzbc {

    /* renamed from: a */
    final /* synthetic */ zzgc f39902a;

    zzba(zzgc zzgc) {
        this.f39902a = zzgc;
    }

    /* renamed from: a */
    public final Class mo49312a() {
        return this.f39902a.getClass();
    }

    /* renamed from: b */
    public final Set mo49313b() {
        return this.f39902a.mo49425j();
    }

    /* renamed from: c */
    public final zzax mo49314c(Class cls) throws GeneralSecurityException {
        try {
            return new zzaz(this.f39902a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final Class mo49315d() {
        return null;
    }

    public final zzax zzb() {
        zzgc zzgc = this.f39902a;
        return new zzaz(zzgc, zzgc.mo49422g());
    }
}
