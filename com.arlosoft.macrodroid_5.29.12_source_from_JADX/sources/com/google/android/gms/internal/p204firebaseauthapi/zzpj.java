package com.google.android.gms.internal.p204firebaseauthapi;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpj implements zzqk {

    /* renamed from: d */
    private static final ThreadLocal f40287d = new zzpi();

    /* renamed from: a */
    private final SecretKeySpec f40288a;

    /* renamed from: b */
    private final int f40289b;

    /* renamed from: c */
    private final int f40290c;

    public zzpj(byte[] bArr, int i) throws GeneralSecurityException {
        if (zzdv.m57153a(2)) {
            zzqs.m57980b(bArr.length);
            this.f40288a = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
            int blockSize = ((Cipher) f40287d.get()).getBlockSize();
            this.f40290c = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f40289b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: X */
    public final byte[] mo49711X(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f40289b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f40289b;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            Cipher cipher = (Cipher) f40287d.get();
            byte[] bArr4 = new byte[this.f40290c];
            System.arraycopy(bArr2, 0, bArr4, 0, this.f40289b);
            cipher.init(2, this.f40288a, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
