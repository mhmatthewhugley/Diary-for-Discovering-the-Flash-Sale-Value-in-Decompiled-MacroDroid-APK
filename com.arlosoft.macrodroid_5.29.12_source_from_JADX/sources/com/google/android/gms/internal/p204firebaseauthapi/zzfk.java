package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzfk {

    /* renamed from: a */
    private final zzap f40056a;

    /* renamed from: b */
    private final zzat f40057b;

    public zzfk(zzap zzap) {
        this.f40056a = zzap;
        this.f40057b = null;
    }

    public zzfk(zzat zzat) {
        this.f40056a = null;
        this.f40057b = zzat;
    }

    /* renamed from: a */
    public final byte[] mo49406a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzap zzap = this.f40056a;
        if (zzap != null) {
            return zzap.mo49299a(bArr, bArr2);
        }
        return this.f40057b.mo49303a(bArr, bArr2);
    }
}
