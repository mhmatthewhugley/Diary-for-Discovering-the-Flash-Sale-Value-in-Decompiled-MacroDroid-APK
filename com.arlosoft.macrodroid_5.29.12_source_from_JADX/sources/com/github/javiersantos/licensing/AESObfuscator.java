package com.github.javiersantos.licensing;

import com.github.javiersantos.licensing.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public class AESObfuscator implements Obfuscator {

    /* renamed from: b */
    private static final byte[] f16201b = {16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* renamed from: a */
    private Cipher f16202a;

    /* renamed from: a */
    public String mo34315a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            Cipher cipher = this.f16202a;
            return Base64.m26188e(cipher.doFinal(("com.github.javiersantos.licensing.AESObfuscator-1|" + str2 + str).getBytes("UTF-8")));
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            throw new RuntimeException("Invalid environment", e);
        }
    }
}
