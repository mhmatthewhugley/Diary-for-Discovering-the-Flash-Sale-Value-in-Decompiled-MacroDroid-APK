package com.google.android.gms.internal.p204firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzeu {

    /* renamed from: g */
    private static final byte[] f40014g = new byte[0];

    /* renamed from: a */
    private final zzet f40015a;

    /* renamed from: b */
    private final BigInteger f40016b;

    /* renamed from: c */
    private final byte[] f40017c;

    /* renamed from: d */
    private final byte[] f40018d;

    /* renamed from: e */
    private final byte[] f40019e;

    /* renamed from: f */
    private BigInteger f40020f = BigInteger.ZERO;

    private zzeu(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzet zzet) {
        this.f40019e = bArr;
        this.f40017c = bArr2;
        this.f40018d = bArr3;
        this.f40016b = bigInteger;
        this.f40015a = zzet;
    }

    /* renamed from: b */
    static zzeu m57209b(byte[] bArr, byte[] bArr2, zzex zzex, zzes zzes, zzet zzet, byte[] bArr3) throws GeneralSecurityException {
        zzes zzes2 = zzes;
        byte[] b = zzff.m57238b(zzex.zzb(), zzes.mo49398c(), zzet.zzb());
        byte[] bArr4 = zzff.f40045l;
        byte[] bArr5 = f40014g;
        byte[] c = zzpp.m57921c(zzff.f40034a, zzes2.mo49400e(bArr4, bArr5, "psk_id_hash", b), zzes2.mo49400e(bArr4, bArr3, "info_hash", b));
        zzes zzes3 = zzes;
        byte[] e = zzes2.mo49400e(bArr2, bArr5, "secret", b);
        byte[] bArr6 = c;
        byte[] bArr7 = b;
        byte[] d = zzes3.mo49399d(e, bArr6, "key", bArr7, zzet.zza());
        byte[] d2 = zzes3.mo49399d(e, bArr6, "base_nonce", bArr7, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new zzeu(bArr, d, d2, bigInteger.shiftLeft(96).subtract(bigInteger), zzet);
    }

    /* renamed from: c */
    private final synchronized byte[] m57210c() throws GeneralSecurityException {
        byte[] d;
        byte[] bArr = this.f40018d;
        byte[] byteArray = this.f40020f.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        d = zzpp.m57922d(bArr, byteArray);
        if (this.f40020f.compareTo(this.f40016b) < 0) {
            this.f40020f = this.f40020f.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo49401a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f40015a.mo49393a(this.f40017c, m57210c(), bArr, bArr2);
    }
}
