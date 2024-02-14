package com.google.api.client.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

public final class SecurityUtils {
    private SecurityUtils() {
    }

    /* renamed from: a */
    public static Signature m72721a() throws NoSuchAlgorithmException {
        return Signature.getInstance("SHA1withRSA");
    }

    /* renamed from: b */
    public static Signature m72722b() throws NoSuchAlgorithmException {
        return Signature.getInstance("SHA256withRSA");
    }

    /* renamed from: c */
    public static byte[] m72723c(Signature signature, PrivateKey privateKey, byte[] bArr) throws InvalidKeyException, SignatureException {
        signature.initSign(privateKey);
        signature.update(bArr);
        return signature.sign();
    }
}
