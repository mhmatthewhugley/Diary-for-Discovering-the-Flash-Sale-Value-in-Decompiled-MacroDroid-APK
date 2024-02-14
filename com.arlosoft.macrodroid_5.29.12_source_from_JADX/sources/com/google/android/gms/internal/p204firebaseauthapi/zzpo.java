package com.google.android.gms.internal.p204firebaseauthapi;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpo implements zzat {

    /* renamed from: c */
    private static final Collection f40298c = Arrays.asList(new Integer[]{64});

    /* renamed from: d */
    private static final byte[] f40299d = new byte[16];

    /* renamed from: a */
    private final zzql f40300a;

    /* renamed from: b */
    private final byte[] f40301b;

    public zzpo(byte[] bArr) throws GeneralSecurityException {
        if (zzdv.m57153a(1)) {
            Collection collection = f40298c;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.f40301b = Arrays.copyOfRange(bArr, i, length);
                this.f40300a = new zzql(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo49303a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length >= 16) {
            Cipher cipher = (Cipher) zzpz.f40324e.mo49715a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr4 = (byte[]) copyOfRange.clone();
            bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
            bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f40301b, KeyPropertiesCompact.KEY_ALGORITHM_AES), new IvParameterSpec(bArr4));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && zzqr.m57978a()) {
                doFinal = new byte[0];
            }
            byte[][] bArr5 = {bArr2, doFinal};
            byte[] a = this.f40300a.mo49512a(f40299d, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr6 = bArr5[i];
                if (bArr6 == null) {
                    bArr6 = new byte[0];
                }
                a = zzpp.m57922d(zziz.m57418b(a), this.f40300a.mo49512a(bArr6, 16));
            }
            byte[] bArr7 = bArr5[1];
            int length2 = bArr7.length;
            if (length2 >= 16) {
                int length3 = a.length;
                if (length2 >= length3) {
                    int i2 = length2 - length3;
                    bArr3 = Arrays.copyOf(bArr7, length2);
                    for (int i3 = 0; i3 < a.length; i3++) {
                        int i4 = i2 + i3;
                        bArr3[i4] = (byte) (bArr3[i4] ^ a[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = zzpp.m57922d(zziz.m57417a(bArr7), zziz.m57418b(a));
            }
            if (zzpp.m57920b(copyOfRange, this.f40300a.mo49512a(bArr3, 16))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
