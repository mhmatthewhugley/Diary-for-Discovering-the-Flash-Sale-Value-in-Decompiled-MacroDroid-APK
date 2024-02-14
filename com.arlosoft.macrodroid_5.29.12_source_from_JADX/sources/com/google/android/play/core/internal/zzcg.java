package com.google.android.play.core.internal;

import android.util.Base64;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzcg {
    /* renamed from: a */
    public static String m70926a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256);
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
