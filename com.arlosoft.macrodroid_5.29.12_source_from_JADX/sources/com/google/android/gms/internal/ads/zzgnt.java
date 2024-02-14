package com.google.android.gms.internal.ads;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgnt implements zzgaq {

    /* renamed from: c */
    private static final Collection f36934c = Arrays.asList(new Integer[]{64});

    /* renamed from: d */
    private static final byte[] f36935d = new byte[16];

    /* renamed from: a */
    private final zzgos f36936a;

    /* renamed from: b */
    private final byte[] f36937b;

    public zzgnt(byte[] bArr) throws GeneralSecurityException {
        if (zzgds.m51728a(1)) {
            Collection collection = f36934c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.f36937b = Arrays.copyOfRange(bArr, i, length);
                this.f36936a = new zzgos(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo46660a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) zzgog.f36964e.mo47033a("AES/CTR/NoPadding");
            byte[][] bArr4 = {bArr2, bArr};
            byte[] a = this.f36936a.mo46821a(f36935d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr5 = bArr4[i];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a = zzgnv.m52434d(zzgnu.m52430b(a), this.f36936a.mo46821a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length = bArr6.length;
            if (length >= 16) {
                int length2 = a.length;
                if (length >= length2) {
                    int i2 = length - length2;
                    bArr3 = Arrays.copyOf(bArr6, length);
                    for (int i3 = 0; i3 < a.length; i3++) {
                        int i4 = i2 + i3;
                        bArr3[i4] = (byte) (bArr3[i4] ^ a[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = zzgnv.m52434d(zzgnu.m52429a(bArr6), zzgnu.m52430b(a));
            }
            byte[] a2 = this.f36936a.mo46821a(bArr3, 16);
            byte[] bArr7 = (byte[]) a2.clone();
            bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
            bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f36937b, KeyPropertiesCompact.KEY_ALGORITHM_AES), new IvParameterSpec(bArr7));
            return zzgnv.m52433c(a2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
