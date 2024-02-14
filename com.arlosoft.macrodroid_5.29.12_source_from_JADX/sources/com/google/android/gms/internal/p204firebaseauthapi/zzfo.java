package com.google.android.gms.internal.p204firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzfo implements zzap {

    /* renamed from: b */
    private static final String f40069b = "zzfo";

    /* renamed from: a */
    private final SecretKey f40070a;

    zzfo(String str, KeyStore keyStore) throws GeneralSecurityException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f40070a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: c */
    private static void m57261c() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: d */
    private final byte[] m57262d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f40070a, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: e */
    private final byte[] m57263e(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f40070a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    public final byte[] mo49299a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m57262d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f40069b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m57261c();
            return m57262d(bArr, bArr2);
        }
    }

    /* renamed from: b */
    public final byte[] mo49300b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            return m57263e(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f40069b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m57261c();
            return m57263e(bArr, bArr2);
        }
    }
}
