package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgfh implements zzgew {

    /* renamed from: a */
    private final zzgpc f36786a;

    /* renamed from: b */
    private final zzgpc f36787b;

    private zzgfh(byte[] bArr, byte[] bArr2) {
        this.f36786a = zzgpc.m52501a(bArr);
        this.f36787b = zzgpc.m52501a(bArr2);
    }

    /* renamed from: a */
    static zzgfh m51822a(byte[] bArr) throws GeneralSecurityException {
        return new zzgfh(bArr, zzgpa.m52498c(bArr));
    }
}
