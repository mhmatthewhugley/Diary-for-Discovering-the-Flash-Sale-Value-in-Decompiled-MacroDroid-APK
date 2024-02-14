package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzggu extends zzgfr {
    zzggu() {
        super(zzghx.class, new zzggs(zzgbj.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m51882m(zzgid zzgid) throws GeneralSecurityException {
        if (zzgid.mo46836F() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzgid.mo46836F() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m51883n(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzggt(this, zzgia.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzghx.m51925I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzghx zzghx = (zzghx) zzgso;
        zzgoz.m52495b(zzghx.mo46825F(), 0);
        m51883n(zzghx.mo46827K().mo47083m());
        m51882m(zzghx.mo46826J());
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
