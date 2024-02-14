package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzqo implements zzbm {

    /* renamed from: a */
    private final zzjk f40344a;

    /* renamed from: b */
    private final int f40345b;

    public zzqo(zzjk zzjk, int i) throws GeneralSecurityException {
        this.f40344a = zzjk;
        this.f40345b = i;
        if (i >= 10) {
            zzjk.mo49512a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo49341a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzpp.m57920b(this.f40344a.mo49512a(bArr2, this.f40345b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
