package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgns implements zzgak {

    /* renamed from: a */
    private final zzgdi f36933a;

    public zzgns(byte[] bArr) throws GeneralSecurityException {
        if (zzgds.m51728a(2)) {
            this.f36933a = new zzgdi(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo46654a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f36933a.mo46740a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    /* renamed from: b */
    public final byte[] mo46655b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f36933a.mo46741b(zzgox.m52491a(12), bArr, bArr2);
    }
}
