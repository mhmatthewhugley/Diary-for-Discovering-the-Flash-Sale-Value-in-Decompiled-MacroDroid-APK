package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgov implements zzgbj {

    /* renamed from: a */
    private final zzghu f36984a;

    /* renamed from: b */
    private final int f36985b;

    public zzgov(zzghu zzghu, int i) throws GeneralSecurityException {
        this.f36984a = zzghu;
        this.f36985b = i;
        if (i >= 10) {
            zzghu.mo46821a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo46693a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzgnv.m52432b(mo46694b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: b */
    public final byte[] mo46694b(byte[] bArr) throws GeneralSecurityException {
        return this.f36984a.mo46821a(bArr, this.f36985b);
    }
}
