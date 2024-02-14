package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzpi extends ThreadLocal {
    zzpi() {
    }

    /* renamed from: a */
    protected static final Cipher m57907a() {
        try {
            return (Cipher) zzpz.f40324e.mo49715a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m57907a();
    }
}
