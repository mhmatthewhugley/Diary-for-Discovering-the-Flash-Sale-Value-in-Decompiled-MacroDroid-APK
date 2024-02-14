package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzcf implements zzap {

    /* renamed from: a */
    private final zzbu f39956a;

    /* renamed from: b */
    private final zzjd f39957b;

    /* renamed from: c */
    private final zzjd f39958c;

    /* synthetic */ zzcf(zzbu zzbu, zzce zzce) {
        zzjd zzjd;
        this.f39956a = zzbu;
        if (zzbu.mo49362f()) {
            zzje b = zzgm.m57301a().mo49428b();
            zzjj a = zzgj.m57299a(zzbu);
            this.f39957b = b.mo49427a(a, "aead", "encrypt");
            zzjd = b.mo49427a(a, "aead", "decrypt");
        } else {
            zzjd = zzgj.f40094a;
            this.f39957b = zzjd;
        }
        this.f39958c = zzjd;
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzbq zzbq : this.f39956a.mo49361e(copyOf)) {
                try {
                    byte[] a = ((zzap) zzbq.mo49350e()).mo49299a(copyOfRange, bArr2);
                    zzbq.mo49346a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    zzcg.f39959a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzbq zzbq2 : this.f39956a.mo49361e(zzas.f39898a)) {
            try {
                byte[] a2 = ((zzap) zzbq2.mo49350e()).mo49299a(bArr, bArr2);
                zzbq2.mo49346a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
