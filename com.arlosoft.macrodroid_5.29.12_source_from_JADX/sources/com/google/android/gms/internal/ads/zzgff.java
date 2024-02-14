package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgff implements zzgew {

    /* renamed from: a */
    private final zzgpc f36783a;

    /* renamed from: b */
    private final zzgpc f36784b;

    private zzgff(byte[] bArr, byte[] bArr2) {
        this.f36783a = zzgpc.m52501a(bArr);
        this.f36784b = zzgpc.m52501a(bArr2);
    }

    /* renamed from: a */
    static zzgff m51820a(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        zzgoe.m52448e(zzgoe.m52453j(zzgoe.m52454k(i), 1, bArr2), zzgoe.m52451h(i, bArr));
        return new zzgff(bArr, bArr2);
    }
}
