package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpt */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpt implements zzau {

    /* renamed from: g */
    private static final byte[] f40305g = new byte[0];

    /* renamed from: a */
    private final ECPrivateKey f40306a;

    /* renamed from: b */
    private final zzpv f40307b;

    /* renamed from: c */
    private final String f40308c;

    /* renamed from: d */
    private final byte[] f40309d;

    /* renamed from: e */
    private final zzps f40310e;

    /* renamed from: f */
    private final int f40311f;

    public zzpt(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzps zzps) throws GeneralSecurityException {
        this.f40306a = eCPrivateKey;
        this.f40307b = new zzpv(eCPrivateKey);
        this.f40309d = bArr;
        this.f40308c = str;
        this.f40311f = i;
        this.f40310e = zzps;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo49304a(byte[] r10, byte[] r11) throws java.security.GeneralSecurityException {
        /*
            r9 = this;
            java.security.interfaces.ECPrivateKey r11 = r9.f40306a
            java.security.spec.ECParameterSpec r11 = r11.getParams()
            java.security.spec.EllipticCurve r11 = r11.getCurve()
            int r0 = r9.f40311f
            int r11 = com.google.android.gms.internal.p204firebaseauthapi.zzpx.m57930a(r11)
            int r0 = r0 + -1
            if (r0 == 0) goto L_0x001a
            r1 = 2
            if (r0 == r1) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            int r11 = r11 + r11
            goto L_0x001d
        L_0x001a:
            int r11 = r11 + r11
        L_0x001b:
            int r11 = r11 + 1
        L_0x001d:
            int r0 = r10.length
            if (r0 < r11) goto L_0x0049
            r1 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r10, r1, r11)
            com.google.android.gms.internal.firebase-auth-api.zzpv r2 = r9.f40307b
            java.lang.String r4 = r9.f40308c
            byte[] r5 = r9.f40309d
            com.google.android.gms.internal.firebase-auth-api.zzps r1 = r9.f40310e
            int r7 = r1.zza()
            int r8 = r9.f40311f
            r6 = 0
            byte[] r1 = r2.mo49714a(r3, r4, r5, r6, r7, r8)
            com.google.android.gms.internal.firebase-auth-api.zzps r2 = r9.f40310e
            com.google.android.gms.internal.firebase-auth-api.zzfk r1 = r2.mo49391b(r1)
            byte[] r10 = java.util.Arrays.copyOfRange(r10, r11, r0)
            byte[] r11 = f40305g
            byte[] r10 = r1.mo49406a(r10, r11)
            return r10
        L_0x0049:
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "ciphertext too short"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzpt.mo49304a(byte[], byte[]):byte[]");
    }
}
