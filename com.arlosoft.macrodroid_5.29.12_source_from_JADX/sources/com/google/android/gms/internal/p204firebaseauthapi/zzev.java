package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzev */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzev implements zzau {

    /* renamed from: f */
    private static final byte[] f40021f = new byte[0];

    /* renamed from: a */
    private final zzey f40022a;

    /* renamed from: b */
    private final zzex f40023b;

    /* renamed from: c */
    private final zzet f40024c;

    /* renamed from: d */
    private final int f40025d;

    /* renamed from: e */
    private final zzes f40026e;

    private zzev(zzey zzey, zzex zzex, zzes zzes, zzet zzet, int i, byte[] bArr) {
        this.f40022a = zzey;
        this.f40023b = zzex;
        this.f40026e = zzes;
        this.f40024c = zzet;
        this.f40025d = i;
    }

    /* renamed from: b */
    static zzev m57212b(zznk zznk) throws GeneralSecurityException {
        int i;
        zzey zzey;
        if (!zznk.mo49644L()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zznk.mo49642G().mo49651M()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zznk.mo49643H().mo48903D()) {
            zznh D = zznk.mo49642G().mo49649D();
            zzex b = zzez.m57217b(D);
            zzes c = zzez.m57218c(D);
            zzet a = zzez.m57216a(D);
            int H = D.mo49637H();
            int i2 = H - 2;
            if (i2 == 1) {
                i = 32;
            } else if (i2 == 2) {
                i = 65;
            } else if (i2 == 3) {
                i = 97;
            } else if (i2 == 4) {
                i = 133;
            } else {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zznb.m57726a(H)));
            }
            int H2 = zznk.mo49642G().mo49649D().mo49637H() - 2;
            if (H2 == 1) {
                zzey = zzfj.m57248a(zznk.mo49643H().mo48904F());
            } else if (H2 == 2 || H2 == 3 || H2 == 4) {
                zzey = zzfh.m57246a(zznk.mo49643H().mo48904F(), zznk.mo49642G().mo49650I().mo48904F(), zzff.m57243g(zznk.mo49642G().mo49649D().mo49637H()));
            } else {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            return new zzev(zzey, b, c, a, i, (byte[]) null);
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }

    /* renamed from: a */
    public final byte[] mo49304a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f40025d;
        if (length >= i) {
            byte[] copyOf = Arrays.copyOf(bArr, i);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f40025d, length);
            zzey zzey = this.f40022a;
            zzex zzex = this.f40023b;
            zzes zzes = this.f40026e;
            zzet zzet = this.f40024c;
            return zzeu.m57209b(copyOf, zzex.mo49402a(copyOf, zzey), zzex, zzes, zzet, new byte[0]).mo49401a(copyOfRange, f40021f);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
