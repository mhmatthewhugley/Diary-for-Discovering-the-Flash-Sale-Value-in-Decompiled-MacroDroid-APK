package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzif */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzif extends zzgw {
    zzif(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo49368a(zzaek zzaek) throws GeneralSecurityException {
        zzmt zzmt = (zzmt) zzaek;
        int H = zzmt.mo49620H().mo49629H();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzmt.mo49621I().mo48904F(), "HMAC");
        int C = zzmt.mo49620H().mo49628C();
        int i = H - 2;
        if (i == 1) {
            return new zzqo(new zzqn("HMACSHA1", secretKeySpec), C);
        }
        if (i == 2) {
            return new zzqo(new zzqn("HMACSHA384", secretKeySpec), C);
        }
        if (i == 3) {
            return new zzqo(new zzqn("HMACSHA256", secretKeySpec), C);
        }
        if (i == 4) {
            return new zzqo(new zzqn("HMACSHA512", secretKeySpec), C);
        }
        if (i == 5) {
            return new zzqo(new zzqn("HMACSHA224", secretKeySpec), C);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
