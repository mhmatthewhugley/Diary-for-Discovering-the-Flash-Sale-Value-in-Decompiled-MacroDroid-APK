package com.google.android.gms.internal.p204firebaseauthapi;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzdu implements zzap {

    /* renamed from: b */
    private static final ThreadLocal f39980b = new zzdt();

    /* renamed from: a */
    private final SecretKey f39981a;

    public zzdu(byte[] bArr) throws GeneralSecurityException {
        zzqs.m57980b(bArr.length);
        this.f39981a = new SecretKeySpec(bArr, KeyPropertiesCompact.KEY_ALGORITHM_AES);
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (bArr.length >= 28) {
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                algorithmParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            } catch (ClassNotFoundException unused) {
                if (zzqr.m57978a()) {
                    algorithmParameterSpec = new IvParameterSpec(bArr, 0, 12);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            ThreadLocal threadLocal = f39980b;
            ((Cipher) threadLocal.get()).init(2, this.f39981a, algorithmParameterSpec);
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
