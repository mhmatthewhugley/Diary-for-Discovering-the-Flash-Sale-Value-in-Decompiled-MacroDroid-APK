package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcv extends zzgc {
    zzcv() {
        super(zzla.class, new zzct(zzap.class));
    }

    /* renamed from: k */
    public static void m57079k(boolean z) throws GeneralSecurityException {
        if (m57081m()) {
            zzbz.m57009n(new zzcv(), true);
        }
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ zzga m57080l(int i, int i2) {
        zzlc D = zzld.m57571D();
        D.mo49571n(i);
        return new zzga((zzld) D.mo49069f(), i2);
    }

    /* renamed from: m */
    private static boolean m57081m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final zzgb mo49373a() {
        return new zzcu(this, zzld.class);
    }

    /* renamed from: b */
    public final zznr mo49374b() {
        return zznr.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ zzaek mo49375c(zzacc zzacc) throws zzadn {
        return zzla.m57564F(zzacc, zzacs.m56379a());
    }

    /* renamed from: d */
    public final String mo49376d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo49377e(zzaek zzaek) throws GeneralSecurityException {
        zzla zzla = (zzla) zzaek;
        zzqs.m57981c(zzla.mo49569C(), 0);
        zzqs.m57980b(zzla.mo49570G().mo48893f());
    }
}
