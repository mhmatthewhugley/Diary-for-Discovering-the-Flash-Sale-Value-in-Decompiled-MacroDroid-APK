package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzbct {
    @VisibleForTesting

    /* renamed from: a */
    ByteArrayOutputStream f26631a = new ByteArrayOutputStream(4096);
    @VisibleForTesting

    /* renamed from: b */
    Base64OutputStream f26632b = new Base64OutputStream(this.f26631a, 10);

    public final String toString() {
        try {
            this.f26632b.close();
        } catch (IOException e) {
            zzcgp.m45227e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.f26631a.close();
            return this.f26631a.toString();
        } catch (IOException e2) {
            zzcgp.m45227e("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.f26631a = null;
            this.f26632b = null;
        }
    }
}
