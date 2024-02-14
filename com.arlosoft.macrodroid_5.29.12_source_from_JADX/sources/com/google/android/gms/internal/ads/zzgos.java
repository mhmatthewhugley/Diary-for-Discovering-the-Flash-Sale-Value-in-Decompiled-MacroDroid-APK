package com.google.android.gms.internal.ads;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgos implements zzghu {

    /* renamed from: a */
    private final SecretKey f36976a;

    /* renamed from: b */
    private final byte[] f36977b;

    /* renamed from: c */
    private final byte[] f36978c;

    public zzgos(byte[] bArr) throws GeneralSecurityException {
        zzgoz.m52494a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
        this.f36976a = secretKeySpec;
        Cipher b = m52483b();
        b.init(1, secretKeySpec);
        byte[] b2 = zzgnu.m52430b(b.doFinal(new byte[16]));
        this.f36977b = b2;
        this.f36978c = zzgnu.m52430b(b2);
    }

    /* renamed from: b */
    private static Cipher m52483b() throws GeneralSecurityException {
        if (zzgds.m51728a(1)) {
            return (Cipher) zzgog.f36964e.mo47033a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo46821a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m52483b();
            b.init(1, this.f36976a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = zzgnv.m52435e(bArr, (max - 1) * 16, this.f36977b, 0, 16);
            } else {
                bArr2 = zzgnv.m52434d(zzgnu.m52429a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f36978c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(zzgnv.m52435e(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(zzgnv.m52434d(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
