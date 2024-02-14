package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzef */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzef extends zzgx {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final byte[] f39993e = new byte[0];

    zzef() {
        super(zzmd.class, zzmg.class, new zzed(zzau.class));
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ zzga m57176m(int i, int i2, int i3, zzbf zzbf, byte[] bArr, int i4) {
        zzoy zzoy;
        zzlw C = zzlx.m57617C();
        zzmi C2 = zzmj.m57669C();
        C2.mo49608o(4);
        C2.mo49609q(5);
        C2.mo49607n(zzacc.m56159t(bArr));
        zzmj zzmj = (zzmj) C2.mo49069f();
        zznw C3 = zznx.m57794C();
        C3.mo49661o(zzbf.mo49325b());
        C3.mo49662q(zzacc.m56159t(zzbf.mo49326c()));
        int d = zzbf.mo49327d() - 1;
        if (d == 0) {
            zzoy = zzoy.TINK;
        } else if (d == 1) {
            zzoy = zzoy.LEGACY;
        } else if (d != 2) {
            zzoy = zzoy.CRUNCHY;
        } else {
            zzoy = zzoy.RAW;
        }
        C3.mo49660n(zzoy);
        zzlt C4 = zzlu.m57610C();
        C4.mo49583n((zznx) C3.mo49069f());
        zzlz D = zzma.m57626D();
        D.mo49588o(zzmj);
        D.mo49587n((zzlu) C4.mo49069f());
        D.mo49589q(i3);
        C.mo49585n((zzma) D.mo49069f());
        return new zzga((zzlx) C.mo49069f(), i4);
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzee(this, zzlx.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzmd.m57641F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzmd zzmd = (zzmd) zzaek;
        if (!zzmd.mo49598H().mo48903D()) {
            zzqs.m57981c(zzmd.mo49596C(), 0);
            zzeo.m57194a(zzmd.mo49597G().mo49604D());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: k */
    public final /* synthetic */ zzaek mo49390k(zzaek zzaek) throws GeneralSecurityException {
        return ((zzmd) zzaek).mo49597G();
    }
}
