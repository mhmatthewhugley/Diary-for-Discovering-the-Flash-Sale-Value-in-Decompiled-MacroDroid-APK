package com.google.android.gms.internal.ads;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgdi {

    /* renamed from: c */
    private static final ThreadLocal f36700c = new zzgdh();

    /* renamed from: a */
    private final SecretKey f36701a;

    /* renamed from: b */
    private final boolean f36702b;

    public zzgdi(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (zzgds.m51728a(2)) {
            zzgoz.m52494a(bArr.length);
            this.f36701a = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
            this.f36702b = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m51699c(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        if (!zzgoy.m52493b() || zzgoy.m52492a() > 19) {
            return new GCMParameterSpec(128, bArr, 0, 12);
        }
        return new IvParameterSpec(bArr, 0, 12);
    }

    /* renamed from: a */
    public final byte[] mo46740a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i = 12;
        if (bArr.length == 12) {
            boolean z = this.f36702b;
            int i2 = true != z ? 16 : 28;
            int length = bArr2.length;
            if (length < i2) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                AlgorithmParameterSpec c = m51699c(bArr, 0, 12);
                ThreadLocal threadLocal = f36700c;
                ((Cipher) threadLocal.get()).init(2, this.f36701a, c);
                if (!(bArr3 == null || bArr3.length == 0)) {
                    ((Cipher) threadLocal.get()).updateAAD(bArr3);
                }
                boolean z2 = this.f36702b;
                if (true != z2) {
                    i = 0;
                }
                if (z2) {
                    length -= 12;
                }
                return ((Cipher) threadLocal.get()).doFinal(bArr2, i, length);
            } else {
                throw new GeneralSecurityException("iv does not match prepended iv");
            }
        } else {
            throw new GeneralSecurityException("iv is wrong size");
        }
    }

    /* renamed from: b */
    public final byte[] mo46741b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z = this.f36702b;
                byte[] bArr4 = new byte[(z ? length + 28 : length + 16)];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec c = m51699c(bArr, 0, 12);
                ThreadLocal threadLocal = f36700c;
                ((Cipher) threadLocal.get()).init(1, this.f36701a, c);
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr4, true != this.f36702b ? 0 : 12);
                if (doFinal == length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
