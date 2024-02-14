package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzfj implements zzey {

    /* renamed from: a */
    private final zzqv f40054a;

    /* renamed from: b */
    private final zzqv f40055b;

    private zzfj(byte[] bArr, byte[] bArr2) {
        this.f40054a = zzqv.m57986b(bArr);
        this.f40055b = zzqv.m57986b(bArr2);
    }

    /* renamed from: a */
    static zzfj m57248a(byte[] bArr) throws GeneralSecurityException {
        return new zzfj(bArr, zzqt.m57983b(bArr));
    }

    public final zzqv zza() {
        return this.f40054a;
    }

    public final zzqv zzb() {
        return this.f40055b;
    }
}
