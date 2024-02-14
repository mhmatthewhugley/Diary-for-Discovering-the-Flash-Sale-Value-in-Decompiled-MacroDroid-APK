package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgnz implements zzgar {

    /* renamed from: a */
    private final ECPrivateKey f36941a;

    /* renamed from: b */
    private final zzgob f36942b;

    /* renamed from: c */
    private final String f36943c;

    /* renamed from: d */
    private final byte[] f36944d;

    /* renamed from: e */
    private final zzgny f36945e;

    public zzgnz(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzgny zzgny) throws GeneralSecurityException {
        this.f36941a = eCPrivateKey;
        this.f36942b = new zzgob(eCPrivateKey);
        this.f36944d = bArr;
        this.f36943c = str;
        this.f36945e = zzgny;
    }
}
