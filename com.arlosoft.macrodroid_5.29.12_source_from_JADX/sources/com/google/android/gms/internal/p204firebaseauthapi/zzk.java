package com.google.android.gms.internal.p204firebaseauthapi;

import org.apache.commons.p353io.IOUtils;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzk extends zzj {
    zzk(char c) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        char[] cArr = {IOUtils.DIR_SEPARATOR_WINDOWS, 'u', 0, 0, 0, 0};
        int i = 46;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
