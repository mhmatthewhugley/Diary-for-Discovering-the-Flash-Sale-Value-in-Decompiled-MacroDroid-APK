package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzfh implements zzey {

    /* renamed from: a */
    private final zzqv f40051a;

    /* renamed from: b */
    private final zzqv f40052b;

    private zzfh(byte[] bArr, byte[] bArr2) {
        this.f40051a = zzqv.m57986b(bArr);
        this.f40052b = zzqv.m57986b(bArr2);
    }

    /* renamed from: a */
    static zzfh m57246a(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        zzpx.m57935f(zzpx.m57940k(zzpx.m57941l(i), 1, bArr2), zzpx.m57938i(i, bArr));
        return new zzfh(bArr, bArr2);
    }

    public final zzqv zza() {
        return this.f40051a;
    }

    public final zzqv zzb() {
        return this.f40052b;
    }
}
