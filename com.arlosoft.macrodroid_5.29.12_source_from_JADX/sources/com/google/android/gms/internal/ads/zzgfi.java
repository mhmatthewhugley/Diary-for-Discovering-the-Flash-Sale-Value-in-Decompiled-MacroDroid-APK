package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgfi {

    /* renamed from: a */
    private final zzgak f36788a;

    /* renamed from: b */
    private final zzgaq f36789b;

    public zzgfi(zzgak zzgak) {
        this.f36788a = zzgak;
        this.f36789b = null;
    }

    public zzgfi(zzgaq zzgaq) {
        this.f36788a = null;
        this.f36789b = zzgaq;
    }

    /* renamed from: a */
    public final byte[] mo46771a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgak zzgak = this.f36788a;
        if (zzgak != null) {
            return zzgak.mo46655b(bArr, bArr2);
        }
        return this.f36789b.mo46660a(bArr, bArr2);
    }
}
