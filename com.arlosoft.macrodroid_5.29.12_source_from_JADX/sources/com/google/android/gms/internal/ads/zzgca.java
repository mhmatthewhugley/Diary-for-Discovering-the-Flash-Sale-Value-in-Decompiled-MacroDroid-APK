package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgca {

    /* renamed from: a */
    public static final String f36678a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f36679b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final zzgng f36680c;
    @Deprecated

    /* renamed from: d */
    public static final zzgng f36681d;
    @Deprecated

    /* renamed from: e */
    public static final zzgng f36682e;

    static {
        new zzgcg();
        new zzgcp();
        new zzgcs();
        new zzgcm();
        new zzgcy();
        new zzgdc();
        new zzgcv();
        new zzgdf();
        zzgng G = zzgng.m52398G();
        f36680c = G;
        f36681d = G;
        f36682e = G;
        try {
            m51587a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m51587a() throws GeneralSecurityException {
        zzgby.m51574o(new zzgcd());
        zzghe.m51905a();
        zzgby.m51573n(new zzgcg(), true);
        zzgby.m51573n(new zzgcp(), true);
        if (!zzgdt.m51730b()) {
            zzgby.m51573n(new zzgcm(), true);
            zzgcs.m51646k(true);
            zzgby.m51573n(new zzgcv(), true);
            zzgby.m51573n(new zzgcy(), true);
            zzgby.m51573n(new zzgdc(), true);
            zzgby.m51573n(new zzgdf(), true);
        }
    }
}
