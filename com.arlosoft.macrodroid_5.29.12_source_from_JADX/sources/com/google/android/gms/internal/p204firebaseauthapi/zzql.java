package com.google.android.gms.internal.p204firebaseauthapi;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzql implements zzjk {

    /* renamed from: a */
    private final SecretKey f40336a;

    /* renamed from: b */
    private final byte[] f40337b;

    /* renamed from: c */
    private final byte[] f40338c;

    public zzql(byte[] bArr) throws GeneralSecurityException {
        zzqs.m57980b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
        this.f40336a = secretKeySpec;
        Cipher b = m57970b();
        b.init(1, secretKeySpec);
        byte[] b2 = zziz.m57418b(b.doFinal(new byte[16]));
        this.f40337b = b2;
        this.f40338c = zziz.m57418b(b2);
    }

    /* renamed from: b */
    private static Cipher m57970b() throws GeneralSecurityException {
        if (zzdv.m57153a(1)) {
            return (Cipher) zzpz.f40324e.mo49715a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo49512a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m57970b();
            b.init(1, this.f40336a);
            int length = bArr.length;
            int max = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
            if (max * 16 == length) {
                bArr2 = zzpp.m57923e(bArr, (max - 1) * 16, this.f40337b, 0, 16);
            } else {
                bArr2 = zzpp.m57922d(zziz.m57417a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f40338c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(zzpp.m57923e(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(zzpp.m57922d(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
