package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final /* synthetic */ class zzhz implements zzft {

    /* renamed from: a */
    public static final /* synthetic */ zzhz f40149a = new zzhz();

    private /* synthetic */ zzhz() {
    }

    /* renamed from: a */
    public final zzaw mo49416a(zzha zzha, zzca zzca) {
        zzht zzht;
        int i = zzia.f40155f;
        if (((zzgy) zzha).mo49444g().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzjn F = zzjn.m57433F(((zzgy) zzha).mo49442e(), zzacs.m56379a());
                if (F.mo49516C() == 0) {
                    zzhs zzhs = new zzhs((zzhr) null);
                    zzhs.mo49466a(F.mo49518H().mo48893f());
                    zzhs.mo49467b(F.mo49517G().mo49524C());
                    zzoy c = ((zzgy) zzha).mo49440c();
                    zzoy zzoy = zzoy.UNKNOWN_PREFIX;
                    int ordinal = c.ordinal();
                    if (ordinal == 1) {
                        zzht = zzht.f40138b;
                    } else if (ordinal == 2) {
                        zzht = zzht.f40140d;
                    } else if (ordinal == 3) {
                        zzht = zzht.f40141e;
                    } else if (ordinal == 4) {
                        zzht = zzht.f40139c;
                    } else {
                        int zza = c.zza();
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza);
                    }
                    zzhs.mo49468c(zzht);
                    zzhv d = zzhs.mo49469d();
                    zzhl zzhl = new zzhl((zzhk) null);
                    zzhl.mo49462c(d);
                    zzhl.mo49460a(zzqw.m57989b(F.mo49518H().mo48904F(), zzca));
                    zzhl.mo49461b(((zzgy) zzha).mo49443f());
                    return zzhl.mo49463d();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzadn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
    }
}
