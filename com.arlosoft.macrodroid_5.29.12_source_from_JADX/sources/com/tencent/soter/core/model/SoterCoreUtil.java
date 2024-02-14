package com.tencent.soter.core.model;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;

public class SoterCoreUtil {
    public static long getCurrentTicks() {
        return System.nanoTime();
    }

    public static String getMessageDigest(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
            instance.update(bArr);
            char[] cArr2 = new char[(r1 * 2)];
            int i = 0;
            for (byte b : instance.digest()) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isNullOrNil(String str) {
        return str == null || str.length() <= 0;
    }

    public static String nullAsNil(String str) {
        return str == null ? "" : str;
    }

    public static long ticksToNowInMs(long j) {
        return ((System.nanoTime() - j) / 1000) / 1000;
    }

    public static boolean isNullOrNil(byte[] bArr) {
        return bArr == null || bArr.length <= 0;
    }

    public static boolean isNullOrNil(int[] iArr) {
        return iArr == null || iArr.length <= 0;
    }
}
