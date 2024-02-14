package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfsa {
    /* renamed from: a */
    public static String m50909a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256);
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
