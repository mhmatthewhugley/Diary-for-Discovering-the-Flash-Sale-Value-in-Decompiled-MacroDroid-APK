package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzghb extends zzggf {
    zzghb(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo46727a(zzgso zzgso) throws GeneralSecurityException {
        zzgla zzgla = (zzgla) zzgso;
        int K = zzgla.mo46936K().mo46945K();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgla.mo46937L().mo47109i(), "HMAC");
        int F = zzgla.mo46936K().mo46944F();
        int i = K - 2;
        if (i == 1) {
            return new zzgov(new zzgou("HMACSHA1", secretKeySpec), F);
        }
        if (i == 2) {
            return new zzgov(new zzgou("HMACSHA384", secretKeySpec), F);
        }
        if (i == 3) {
            return new zzgov(new zzgou("HMACSHA256", secretKeySpec), F);
        }
        if (i == 4) {
            return new zzgov(new zzgou("HMACSHA512", secretKeySpec), F);
        }
        if (i == 5) {
            return new zzgov(new zzgou("HMACSHA224", secretKeySpec), F);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
