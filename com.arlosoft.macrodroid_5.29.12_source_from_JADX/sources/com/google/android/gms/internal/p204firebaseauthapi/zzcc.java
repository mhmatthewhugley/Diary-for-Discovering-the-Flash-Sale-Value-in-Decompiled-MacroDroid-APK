package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcc */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzcc {

    /* renamed from: a */
    public static final String f39943a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";

    /* renamed from: b */
    public static final String f39944b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated

    /* renamed from: c */
    public static final zzpb f39945c;
    @Deprecated

    /* renamed from: d */
    public static final zzpb f39946d;
    @Deprecated

    /* renamed from: e */
    public static final zzpb f39947e;

    static {
        new zzcj();
        new zzcs();
        new zzcv();
        new zzcp();
        new zzdb();
        new zzdf();
        new zzcy();
        new zzdi();
        zzpb D = zzpb.m57891D();
        f39945c = D;
        f39946d = D;
        f39947e = D;
        try {
            m57017a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m57017a() throws GeneralSecurityException {
        zzbz.m57010o(new zzcg());
        zzit.m57409a();
        zzbz.m57009n(new zzcj(), true);
        zzbz.m57009n(new zzcs(), true);
        if (!zzdw.m57155b()) {
            zzbz.m57009n(new zzcp(), true);
            zzcv.m57079k(true);
            zzbz.m57009n(new zzcy(), true);
            zzbz.m57009n(new zzdb(), true);
            zzbz.m57009n(new zzdf(), true);
            zzbz.m57009n(new zzdi(), true);
        }
    }
}
