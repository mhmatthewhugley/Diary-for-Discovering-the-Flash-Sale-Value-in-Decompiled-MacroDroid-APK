package com.google.android.gms.internal.mlkit_translate;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Random;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzrd {

    /* renamed from: a */
    private static final int[] f44509a = {0, 0, 1, 2, 4, 8, 16};
    @VisibleForTesting

    /* renamed from: b */
    public static final Random f44510b = new SecureRandom();
    @VisibleForTesting

    /* renamed from: c */
    public static final zzra f44511c = zzra.f44508a;

    /* renamed from: a */
    public static boolean m62241a(zzrc zzrc) throws InterruptedException {
        int[] iArr = f44509a;
        int i = 0;
        while (i < 7) {
            int i2 = iArr[i];
            if (i2 > 0) {
                int i3 = i2 * 60000;
                Thread.sleep((long) ((i3 / 2) + f44510b.nextInt(i3)));
            }
            try {
                if (zzrc.zza()) {
                    return true;
                }
                i++;
            } catch (InterruptedException e) {
                Log.i("MLK ExponentialBackoff", "retryWithRandomizedExponentialBackoff: interrupted");
                throw e;
            } catch (zzrb | IOException e2) {
                Log.e("MLK ExponentialBackoff", "retryWithRandomizedExponentialBackoff: ".concat(String.valueOf(e2.getMessage())), e2);
            }
        }
        return false;
    }
}
