package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzqp extends ThreadLocal {
    zzqp() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
