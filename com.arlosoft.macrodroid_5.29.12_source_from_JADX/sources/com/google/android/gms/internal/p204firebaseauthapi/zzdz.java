package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdz */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzdz extends zzgc {
    zzdz() {
        super(zzlg.class, new zzdx(zzat.class));
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzdy(this, zzlj.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzlg.m57581F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzlg zzlg = (zzlg) zzaek;
        zzqs.m57981c(zzlg.mo49575C(), 0);
        if (zzlg.mo49576G().mo48893f() != 64) {
            int f = zzlg.mo49576G().mo48893f();
            throw new InvalidKeyException("invalid key size: " + f + ". Valid keys must have 64 bytes.");
        }
    }
}
