package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzew */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzew implements zzav {

    /* renamed from: a */
    private final zznn f40027a;

    /* renamed from: b */
    private final zzex f40028b;

    /* renamed from: c */
    private final zzet f40029c;

    /* renamed from: d */
    private final zzes f40030d;

    private zzew(zznn zznn, zzex zzex, zzes zzes, zzet zzet, byte[] bArr) {
        this.f40027a = zznn;
        this.f40028b = zzex;
        this.f40030d = zzes;
        this.f40029c = zzet;
    }

    /* renamed from: a */
    static zzew m57214a(zznn zznn) throws GeneralSecurityException {
        if (!zznn.mo49650I().mo48903D()) {
            zznh D = zznn.mo49649D();
            return new zzew(zznn, zzez.m57217b(D), zzez.m57218c(D), zzez.m57216a(D), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
