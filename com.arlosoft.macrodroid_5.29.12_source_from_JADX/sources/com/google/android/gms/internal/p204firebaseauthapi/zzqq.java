package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqq {

    /* renamed from: a */
    private static final ThreadLocal f40346a = new zzqp();

    /* renamed from: a */
    public static byte[] m57977a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f40346a.get()).nextBytes(bArr);
        return bArr;
    }
}
