package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzir */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class zzir implements zzft {

    /* renamed from: a */
    public static final /* synthetic */ zzir f40186a = new zzir();

    private /* synthetic */ zzir() {
    }

    /* renamed from: a */
    public final zzaw mo49416a(zzha zzha, zzca zzca) {
        zzik zzik;
        zzil zzil;
        int i = zzis.f40192f;
        if (((zzgy) zzha).mo49444g().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzmt G = zzmt.m57697G(((zzgy) zzha).mo49442e(), zzacs.m56379a());
                if (G.mo49619C() == 0) {
                    zzij zzij = new zzij((zzii) null);
                    zzij.mo49483b(G.mo49621I().mo48893f());
                    zzij.mo49484c(G.mo49620H().mo49628C());
                    int H = G.mo49620H().mo49629H();
                    zzoy zzoy = zzoy.UNKNOWN_PREFIX;
                    int i2 = H - 2;
                    if (i2 == 1) {
                        zzik = zzik.f40168b;
                    } else if (i2 == 2) {
                        zzik = zzik.f40171e;
                    } else if (i2 == 3) {
                        zzik = zzik.f40170d;
                    } else if (i2 == 4) {
                        zzik = zzik.f40172f;
                    } else if (i2 == 5) {
                        zzik = zzik.f40169c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse HashType: " + zzmq.m57689a(H));
                    }
                    zzij.mo49482a(zzik);
                    zzoy c = ((zzgy) zzha).mo49440c();
                    int ordinal = c.ordinal();
                    if (ordinal == 1) {
                        zzil = zzil.f40174b;
                    } else if (ordinal == 2) {
                        zzil = zzil.f40176d;
                    } else if (ordinal == 3) {
                        zzil = zzil.f40177e;
                    } else if (ordinal == 4) {
                        zzil = zzil.f40175c;
                    } else {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + c.zza());
                    }
                    zzij.mo49485d(zzil);
                    zzin e = zzij.mo49486e();
                    zzic zzic = new zzic((zzib) null);
                    zzic.mo49480c(e);
                    zzic.mo49479b(zzqw.m57989b(G.mo49621I().mo48904F(), zzca));
                    zzic.mo49478a(((zzgy) zzha).mo49443f());
                    return zzic.mo49481d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzadn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacParameters.parseParameters");
        }
    }
}
