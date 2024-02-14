package com.arlosoft.macrodroid.common;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import p148q0.C8151a;

/* renamed from: com.arlosoft.macrodroid.common.f1 */
/* compiled from: SimpleEncryption */
public class C4012f1 {

    /* renamed from: a */
    private SecretKey f10395a;

    public C4012f1() {
        try {
            this.f10395a = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec("B1U2M4P5O6O8P9O1L2O3O5P".getBytes("UTF-8")));
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("SimpleEncryption: Failed to generate encryption key: " + e.getMessage()));
        }
    }

    /* renamed from: a */
    public String mo27914a(String str) throws Exception {
        byte[] decode = Base64.decode(str, 0);
        Cipher instance = Cipher.getInstance("DES");
        instance.init(2, this.f10395a);
        return new String(instance.doFinal(decode));
    }

    /* renamed from: b */
    public String mo27915b(String str) throws Exception {
        byte[] bytes = str.getBytes("UTF-8");
        Cipher instance = Cipher.getInstance("DES");
        instance.init(1, this.f10395a);
        return Base64.encodeToString(instance.doFinal(bytes), 0);
    }
}
