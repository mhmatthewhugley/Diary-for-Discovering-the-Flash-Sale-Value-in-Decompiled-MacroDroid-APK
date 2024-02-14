package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Build;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzdl {

    /* renamed from: c */
    private static final ThreadLocal f39973c = new zzdk();

    /* renamed from: a */
    private final SecretKey f39974a;

    /* renamed from: b */
    private final boolean f39975b;

    public zzdl(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (zzdv.m57153a(2)) {
            zzqs.m57980b(bArr.length);
            this.f39974a = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
            this.f39975b = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo49381a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        int i = 12;
        if (bArr.length == 12) {
            boolean z = this.f39975b;
            int i2 = true != z ? 16 : 28;
            int length = bArr2.length;
            if (length < i2) {
                throw new GeneralSecurityException("ciphertext too short");
            } else if (!z || ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                if (!zzqr.m57978a() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) {
                    algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
                } else {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                }
                ThreadLocal threadLocal = f39973c;
                ((Cipher) threadLocal.get()).init(2, this.f39974a, algorithmParameterSpec);
                boolean z2 = this.f39975b;
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
}
