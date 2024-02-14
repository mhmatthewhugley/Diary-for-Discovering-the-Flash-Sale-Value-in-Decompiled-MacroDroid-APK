package com.google.android.gms.internal.mlkit_translate;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import java.security.SecureRandom;
import java.util.Random;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzow {
    @VisibleForTesting

    /* renamed from: a */
    static final Random f44377a = new SecureRandom();

    /* renamed from: a */
    public static String m62103a() {
        byte[] bArr = new byte[17];
        f44377a.nextBytes(bArr);
        bArr[0] = (byte) ((bArr[0] & 15) | 112);
        String substring = Base64.encodeToString(bArr, 11).substring(0, 22);
        "Generated installation id: ".concat(String.valueOf(substring));
        return substring;
    }
}
