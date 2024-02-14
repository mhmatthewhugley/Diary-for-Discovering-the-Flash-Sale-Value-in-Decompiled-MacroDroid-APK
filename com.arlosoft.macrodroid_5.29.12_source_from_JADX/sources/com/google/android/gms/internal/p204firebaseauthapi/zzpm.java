package com.google.android.gms.internal.p204firebaseauthapi;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpm implements zzap {

    /* renamed from: e */
    private static final ThreadLocal f40291e = new zzpk();

    /* renamed from: f */
    private static final ThreadLocal f40292f = new zzpl();

    /* renamed from: a */
    private final byte[] f40293a;

    /* renamed from: b */
    private final byte[] f40294b;

    /* renamed from: c */
    private final SecretKeySpec f40295c;

    /* renamed from: d */
    private final int f40296d;

    public zzpm(byte[] bArr, int i) throws GeneralSecurityException {
        if (!zzdv.m57153a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i == 12 || i == 16) {
            this.f40296d = i;
            zzqs.m57980b(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
            this.f40295c = secretKeySpec;
            Cipher cipher = (Cipher) f40291e.get();
            cipher.init(1, secretKeySpec);
            byte[] c = m57911c(cipher.doFinal(new byte[16]));
            this.f40293a = c;
            this.f40294b = m57911c(c);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    /* renamed from: c */
    private static byte[] m57911c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    /* renamed from: d */
    private final byte[] m57912d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2;
        int length;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m57913e(bArr3, this.f40293a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                doFinal[i6] = (byte) (doFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            doFinal = cipher.doFinal(doFinal);
            i5 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            bArr2 = m57913e(copyOfRange, this.f40293a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f40294b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                copyOf[i4] = (byte) (copyOf[i4] ^ copyOfRange[i4]);
                i4++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(m57913e(doFinal, bArr2));
    }

    /* renamed from: e */
    private static byte[] m57913e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.f40296d) - 16;
        if (i >= 0) {
            Cipher cipher = (Cipher) f40291e.get();
            cipher.init(1, this.f40295c);
            Cipher cipher2 = cipher;
            byte[] d = m57912d(cipher2, 0, bArr, 0, this.f40296d);
            byte[] d2 = m57912d(cipher2, 1, bArr2, 0, 0);
            byte[] d3 = m57912d(cipher, 2, bArr, this.f40296d, i);
            int i2 = length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[i2 + i3] ^ d2[i3]) ^ d[i3]) ^ d3[i3]));
            }
            if (b == 0) {
                Cipher cipher3 = (Cipher) f40292f.get();
                cipher3.init(1, this.f40295c, new IvParameterSpec(d));
                return cipher3.doFinal(bArr, this.f40296d, i);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
