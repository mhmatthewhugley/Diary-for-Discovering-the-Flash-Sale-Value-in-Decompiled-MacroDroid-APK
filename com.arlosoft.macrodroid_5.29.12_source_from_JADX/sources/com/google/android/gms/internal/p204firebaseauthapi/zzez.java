package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzez */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzez {
    /* renamed from: a */
    static zzet m57216a(zznh zznh) throws GeneralSecurityException {
        if (zznh.mo49635F() == 3) {
            return new zzeq(16);
        }
        if (zznh.mo49635F() == 4) {
            return new zzeq(32);
        }
        if (zznh.mo49635F() == 5) {
            return new zzer();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    /* renamed from: b */
    static zzex m57217b(zznh zznh) throws GeneralSecurityException {
        if (zznh.mo49637H() == 3) {
            return new zzfi(new zzes("HmacSha256"));
        }
        if (zznh.mo49637H() == 4) {
            return zzfg.m57244b(1);
        }
        if (zznh.mo49637H() == 5) {
            return zzfg.m57244b(2);
        }
        if (zznh.mo49637H() == 6) {
            return zzfg.m57244b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    /* renamed from: c */
    static zzes m57218c(zznh zznh) {
        if (zznh.mo49636G() == 3) {
            return new zzes("HmacSha256");
        }
        if (zznh.mo49636G() == 4) {
            return new zzes("HmacSha384");
        }
        if (zznh.mo49636G() == 5) {
            return new zzes("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
