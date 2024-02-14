package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpu implements zzav {

    /* renamed from: a */
    private final zzpw f40312a;

    /* renamed from: b */
    private final String f40313b;

    /* renamed from: c */
    private final byte[] f40314c;

    /* renamed from: d */
    private final zzps f40315d;

    public zzpu(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzps zzps) throws GeneralSecurityException {
        zzpx.m57934e(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f40312a = new zzpw(eCPublicKey);
        this.f40314c = bArr;
        this.f40313b = str;
        this.f40315d = zzps;
    }
}
