package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqb implements zzqh {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo49717a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
