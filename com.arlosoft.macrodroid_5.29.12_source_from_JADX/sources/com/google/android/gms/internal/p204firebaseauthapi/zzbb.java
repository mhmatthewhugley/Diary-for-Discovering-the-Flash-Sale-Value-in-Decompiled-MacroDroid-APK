package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzbb implements zzbc {

    /* renamed from: a */
    final /* synthetic */ zzgx f39903a;

    /* renamed from: b */
    final /* synthetic */ zzgc f39904b;

    zzbb(zzgx zzgx, zzgc zzgc) {
        this.f39903a = zzgx;
        this.f39904b = zzgc;
    }

    /* renamed from: a */
    public final Class mo49312a() {
        return this.f39903a.getClass();
    }

    /* renamed from: b */
    public final Set mo49313b() {
        return this.f39903a.mo49425j();
    }

    /* renamed from: c */
    public final zzax mo49314c(Class cls) throws GeneralSecurityException {
        try {
            return new zzbx(this.f39903a, this.f39904b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    /* renamed from: d */
    public final Class mo49315d() {
        return this.f39904b.getClass();
    }

    public final zzax zzb() {
        zzgx zzgx = this.f39903a;
        return new zzbx(zzgx, this.f39904b, zzgx.mo49422g());
    }
}
