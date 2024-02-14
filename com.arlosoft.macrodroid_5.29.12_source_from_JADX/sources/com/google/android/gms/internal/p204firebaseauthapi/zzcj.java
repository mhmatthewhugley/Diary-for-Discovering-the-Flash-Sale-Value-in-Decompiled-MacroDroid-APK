package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcj extends zzgc {
    zzcj() {
        super(zzjw.class, new zzch(zzap.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ zzga m57030k(int i, int i2, int i3, int i4, int i5, int i6) {
        zzke D = zzkf.m57497D();
        zzkh D2 = zzki.m57507D();
        D2.mo49546n(16);
        D.mo49543o((zzki) D2.mo49069f());
        D.mo49542n(i);
        zzmv D3 = zzmw.m57707D();
        zzmy D4 = zzmz.m57718D();
        D4.mo49627o(5);
        D4.mo49626n(i4);
        D3.mo49623o((zzmz) D4.mo49069f());
        D3.mo49622n(32);
        zzjy C = zzjz.m57473C();
        C.mo49531n((zzkf) D.mo49069f());
        C.mo49532o((zzmw) D3.mo49069f());
        return new zzga((zzjz) C.mo49069f(), i6);
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzci(this, zzjz.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzjw.m57463F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzjw zzjw = (zzjw) zzaek;
        zzqs.m57981c(zzjw.mo49528C(), 0);
        new zzcm();
        zzcm.m57044l(zzjw.mo49529G());
        new zzih();
        zzih.m57389l(zzjw.mo49530H());
    }

    /* renamed from: f */
    public final int mo49378f() {
        return 2;
    }
}
