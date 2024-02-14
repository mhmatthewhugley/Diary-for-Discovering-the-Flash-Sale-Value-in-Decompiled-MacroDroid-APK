package com.google.android.gms.internal.ads;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgno implements zzgor {

    /* renamed from: d */
    private static final ThreadLocal f36923d = new zzgnn();

    /* renamed from: a */
    private final SecretKeySpec f36924a;

    /* renamed from: b */
    private final int f36925b;

    /* renamed from: c */
    private final int f36926c;

    public zzgno(byte[] bArr, int i) throws GeneralSecurityException {
        if (zzgds.m51728a(2)) {
            zzgoz.m52494a(bArr.length);
            this.f36924a = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
            int blockSize = ((Cipher) f36923d.get()).getBlockSize();
            this.f36926c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f36925b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    private final void m52416a(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f36923d.get();
        byte[] bArr4 = new byte[this.f36926c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f36925b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f36924a, ivParameterSpec);
        } else {
            cipher.init(2, this.f36924a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    /* renamed from: X */
    public final byte[] mo47025X(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f36925b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f36925b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            m52416a(bArr, i2, i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo47026b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f36925b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = zzgox.m52491a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f36925b);
            m52416a(bArr, 0, length, bArr2, this.f36925b, a, true);
            return bArr2;
        }
        int i2 = this.f36925b;
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i2));
    }
}
