package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzej */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzej implements zzau {

    /* renamed from: a */
    private final zzbu f39997a;

    /* renamed from: b */
    private final zzjd f39998b;

    public zzej(zzbu zzbu) {
        this.f39997a = zzbu;
        this.f39998b = zzbu.mo49362f() ? zzgm.m57301a().mo49428b().mo49427a(zzgj.m57299a(zzbu), "hybrid_decrypt", "decrypt") : zzgj.f40094a;
    }

    /* renamed from: a */
    public final byte[] mo49304a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzbq zzbq : this.f39997a.mo49361e(copyOfRange)) {
                try {
                    byte[] a = ((zzau) zzbq.mo49350e()).mo49304a(copyOfRange2, (byte[]) null);
                    zzbq.mo49346a();
                    int length2 = copyOfRange2.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    zzek.f39999a.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        for (zzbq zzbq2 : this.f39997a.mo49361e(zzas.f39898a)) {
            try {
                byte[] a2 = ((zzau) zzbq2.mo49350e()).mo49304a(bArr, (byte[]) null);
                zzbq2.mo49346a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
