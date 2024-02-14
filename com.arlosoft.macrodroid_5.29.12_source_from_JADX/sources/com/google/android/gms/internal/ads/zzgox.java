package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgox {

    /* renamed from: a */
    private static final ThreadLocal f36986a = new zzgow();

    /* renamed from: a */
    public static byte[] m52491a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f36986a.get()).nextBytes(bArr);
        return bArr;
    }
}
