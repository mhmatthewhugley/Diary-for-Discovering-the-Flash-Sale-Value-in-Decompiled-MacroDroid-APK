package com.google.android.gms.internal.ads;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzans implements Runnable {
    private zzans() {
    }

    /* synthetic */ zzans(zzanr zzanr) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzant.f24986b = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
            countDownLatch = zzant.f24989e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzant.f24989e;
        } catch (Throwable th) {
            zzant.f24989e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
