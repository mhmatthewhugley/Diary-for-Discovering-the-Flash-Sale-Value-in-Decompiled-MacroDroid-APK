package com.google.android.gms.internal.p203authapi;

import android.util.Base64;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.auth-api.zzba */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzba {

    /* renamed from: a */
    private static final Random f39145a = new Random();

    /* renamed from: a */
    public static String m55706a() {
        byte[] bArr = new byte[16];
        f39145a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
