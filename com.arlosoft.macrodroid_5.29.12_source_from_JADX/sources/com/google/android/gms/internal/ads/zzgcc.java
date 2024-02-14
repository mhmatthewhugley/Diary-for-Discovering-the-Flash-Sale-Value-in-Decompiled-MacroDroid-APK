package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgcc implements zzgak {

    /* renamed from: a */
    private final zzgbu f36683a;

    /* renamed from: b */
    private final zzghn f36684b;

    /* renamed from: c */
    private final zzghn f36685c;

    /* synthetic */ zzgcc(zzgbu zzgbu, zzgcb zzgcb) {
        zzghn zzghn;
        this.f36683a = zzgbu;
        if (zzgbu.mo46715f()) {
            zzgho b = zzgfx.m51847a().mo46782b();
            zzght a = zzgfu.m51845a(zzgbu);
            this.f36684b = b.mo46781a(a, "aead", "encrypt");
            zzghn = b.mo46781a(a, "aead", "decrypt");
        } else {
            zzghn = zzgfu.f36802a;
            this.f36684b = zzghn;
        }
        this.f36685c = zzghn;
    }

    /* renamed from: a */
    public final byte[] mo46654a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgbo zzgbo : this.f36683a.mo46714e(copyOf)) {
                try {
                    byte[] a = ((zzgak) zzgbo.mo46701c()).mo46654a(copyOfRange, bArr2);
                    zzgbo.mo46699a();
                    int length2 = copyOfRange.length;
                    return a;
                } catch (GeneralSecurityException e) {
                    zzgcd.f36686a.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzgbo zzgbo2 : this.f36683a.mo46714e(zzgap.f36622a)) {
            try {
                byte[] a2 = ((zzgak) zzgbo2.mo46701c()).mo46654a(bArr, bArr2);
                zzgbo2.mo46699a();
                return a2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    /* renamed from: b */
    public final byte[] mo46655b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] c = zzgnv.m52433c(this.f36683a.mo46710a().mo46702d(), ((zzgak) this.f36683a.mo46710a().mo46701c()).mo46655b(bArr, bArr2));
            this.f36683a.mo46710a().mo46699a();
            int length = bArr.length;
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
