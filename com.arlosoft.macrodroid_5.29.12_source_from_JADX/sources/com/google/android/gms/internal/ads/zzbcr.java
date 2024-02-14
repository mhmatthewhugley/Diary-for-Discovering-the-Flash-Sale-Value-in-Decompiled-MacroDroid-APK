package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzbcr {
    @Nullable

    /* renamed from: b */
    private static MessageDigest f26629b;

    /* renamed from: a */
    protected final Object f26630a = new Object();

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public final MessageDigest mo42482a() {
        synchronized (this.f26630a) {
            MessageDigest messageDigest = f26629b;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f26629b = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f26629b;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract byte[] mo42483b(String str);
}
