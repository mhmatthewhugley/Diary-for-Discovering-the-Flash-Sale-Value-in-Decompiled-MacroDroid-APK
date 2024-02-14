package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgnn extends ThreadLocal {
    zzgnn() {
    }

    /* renamed from: a */
    protected static final Cipher m52415a() {
        try {
            return (Cipher) zzgog.f36964e.mo47033a("AES/CTR/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m52415a();
    }
}
