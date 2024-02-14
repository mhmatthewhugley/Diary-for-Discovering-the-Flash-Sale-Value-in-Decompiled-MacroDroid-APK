package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgcs extends zzgfr {
    zzgcs() {
        super(zzgjk.class, new zzgcq(zzgak.class));
    }

    /* renamed from: k */
    public static void m51646k(boolean z) throws GeneralSecurityException {
        if (m51648m()) {
            zzgby.m51573n(new zzgcs(), true);
        }
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ zzgfp m51647l(int i, int i2) {
        zzgjm G = zzgjn.m52086G();
        G.mo46888n(i);
        return new zzgfp((zzgjn) G.mo47341h(), i2);
    }

    /* renamed from: m */
    private static boolean m51648m() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final zzgfq mo46732a() {
        return new zzgcr(this, zzgjn.class);
    }

    /* renamed from: b */
    public final /* synthetic */ zzgso mo46733b(zzgpw zzgpw) throws zzgrq {
        return zzgjk.m52079I(zzgpw, zzgqq.m52900a());
    }

    /* renamed from: c */
    public final String mo46734c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo46735d(zzgso zzgso) throws GeneralSecurityException {
        zzgjk zzgjk = (zzgjk) zzgso;
        zzgoz.m52495b(zzgjk.mo46886F(), 0);
        zzgoz.m52494a(zzgjk.mo46887J().mo47083m());
    }

    /* renamed from: f */
    public final int mo46737f() {
        return 3;
    }
}
