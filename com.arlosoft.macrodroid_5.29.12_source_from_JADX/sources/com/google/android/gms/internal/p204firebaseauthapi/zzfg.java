package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzfg implements zzex {

    /* renamed from: a */
    private final zzes f40049a;

    /* renamed from: b */
    private final int f40050b;

    private zzfg(zzes zzes, int i) {
        this.f40049a = zzes;
        this.f40050b = i;
    }

    /* renamed from: b */
    static zzfg m57244b(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 == 0) {
            return new zzfg(new zzes("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new zzfg(new zzes("HmacSha512"), 3);
        }
        return new zzfg(new zzes("HmacSha384"), 2);
    }

    /* renamed from: a */
    public final byte[] mo49402a(byte[] bArr, zzey zzey) throws GeneralSecurityException {
        byte[] h = zzpx.m57937h(zzpx.m57938i(this.f40050b, zzey.zza().mo49722c()), zzpx.m57940k(zzpx.m57941l(this.f40050b), 1, bArr));
        byte[] c = zzpp.m57921c(bArr, zzey.zzb().mo49722c());
        byte[] d = zzff.m57240d(zzb());
        zzes zzes = this.f40049a;
        return zzes.mo49397b((byte[]) null, h, "eae_prk", c, "shared_secret", d, zzes.mo49396a());
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.f40050b - 1;
        if (i == 0) {
            return zzff.f40036c;
        }
        if (i != 1) {
            return zzff.f40038e;
        }
        return zzff.f40037d;
    }
}
