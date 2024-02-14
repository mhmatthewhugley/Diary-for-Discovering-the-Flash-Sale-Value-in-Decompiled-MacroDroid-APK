package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqc implements zzqh {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo49717a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyFactory.getInstance(str);
        }
        return KeyFactory.getInstance(str, provider);
    }
}
