package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.common.util.VisibleForTesting;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfms {
    @VisibleForTesting

    /* renamed from: c */
    protected static final byte[] f36120c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, Framer.STDIN_REQUEST_FRAME_PREFIX, -25, -62, 63, Framer.STDERR_FRAME_PREFIX, 108, -113, -103, 74};
    @VisibleForTesting

    /* renamed from: d */
    protected static final byte[] f36121d = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, Framer.STDIN_REQUEST_FRAME_PREFIX, -61, 57, -4, -4, -114, -63};

    /* renamed from: a */
    private final byte[] f36122a = f36121d;

    /* renamed from: b */
    private final byte[] f36123b = f36120c;

    /* renamed from: a */
    public final boolean mo45978a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] a = zzajj.m41586a(file.getAbsolutePath());
            if (a.length == 1) {
                byte[] digest = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256).digest(a[0][0].getEncoded());
                if (!Arrays.equals(this.f36123b, digest)) {
                    return !"user".equals(Build.TYPE) && Arrays.equals(this.f36122a, digest);
                }
                return true;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (zzajg e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
