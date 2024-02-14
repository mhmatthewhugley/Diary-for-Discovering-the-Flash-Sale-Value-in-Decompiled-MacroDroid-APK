package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhq */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzhq extends zzgc {
    zzhq() {
        super(zzjn.class, new zzho(zzbm.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m57358m(zzjt zzjt) throws GeneralSecurityException {
        if (zzjt.mo49524C() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzjt.mo49524C() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m57359n(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzhp(this, zzjq.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzjn.m57433F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzjn zzjn = (zzjn) zzaek;
        zzqs.m57981c(zzjn.mo49516C(), 0);
        m57359n(zzjn.mo49518H().mo48893f());
        m57358m(zzjn.mo49517G());
    }
}
