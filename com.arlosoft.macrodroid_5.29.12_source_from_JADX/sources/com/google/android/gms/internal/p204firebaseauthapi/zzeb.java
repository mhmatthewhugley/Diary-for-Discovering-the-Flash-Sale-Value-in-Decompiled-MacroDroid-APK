package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzeb implements zzat {

    /* renamed from: a */
    private final zzbu f39988a;

    /* renamed from: b */
    private final zzjd f39989b;

    /* renamed from: c */
    private final zzjd f39990c;

    public zzeb(zzbu zzbu) {
        zzjd zzjd;
        this.f39988a = zzbu;
        if (zzbu.mo49362f()) {
            zzje b = zzgm.m57301a().mo49428b();
            zzjj a = zzgj.m57299a(zzbu);
            this.f39989b = b.mo49427a(a, "daead", "encrypt");
            zzjd = b.mo49427a(a, "daead", "decrypt");
        } else {
            zzjd = zzgj.f40094a;
            this.f39989b = zzjd;
        }
        this.f39990c = zzjd;
    }

    /* renamed from: a */
    public final byte[] mo49303a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzbq zzbq : this.f39988a.mo49361e(copyOf)) {
                try {
                    byte[] a = ((zzat) zzbq.mo49350e()).mo49303a(copyOfRange, bArr2);
                    zzbq.mo49346a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    zzec.f39991a.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzbq zzbq2 : this.f39988a.mo49361e(zzas.f39898a)) {
            try {
                byte[] a2 = ((zzat) zzbq2.mo49350e()).mo49303a(bArr, bArr2);
                zzbq2.mo49346a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
