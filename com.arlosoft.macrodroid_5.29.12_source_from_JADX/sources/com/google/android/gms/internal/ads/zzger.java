package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzger {

    /* renamed from: g */
    private static final byte[] f36737g = new byte[0];

    /* renamed from: a */
    private final zzgeq f36738a;

    /* renamed from: b */
    private final BigInteger f36739b;

    /* renamed from: c */
    private final byte[] f36740c;

    /* renamed from: d */
    private final byte[] f36741d;

    /* renamed from: e */
    private final byte[] f36742e;

    /* renamed from: f */
    private BigInteger f36743f = BigInteger.ZERO;

    private zzger(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgeq zzgeq) {
        this.f36742e = bArr;
        this.f36740c = bArr2;
        this.f36741d = bArr3;
        this.f36739b = bigInteger;
        this.f36738a = zzgeq;
    }

    /* renamed from: c */
    static zzger m51780c(byte[] bArr, byte[] bArr2, zzgeu zzgeu, zzgep zzgep, zzgeq zzgeq, byte[] bArr3) throws GeneralSecurityException {
        zzgep zzgep2 = zzgep;
        byte[] b = zzgfd.m51813b(zzgeu.zzb(), zzgep.mo46759c(), zzgeq.zzb());
        byte[] bArr4 = zzgfd.f36777l;
        byte[] bArr5 = f36737g;
        byte[] c = zzgnv.m52433c(zzgfd.f36766a, zzgep2.mo46761e(bArr4, bArr5, "psk_id_hash", b), zzgep2.mo46761e(bArr4, bArr3, "info_hash", b));
        zzgep zzgep3 = zzgep;
        byte[] e = zzgep2.mo46761e(bArr2, bArr5, "secret", b);
        byte[] bArr6 = c;
        byte[] bArr7 = b;
        byte[] d = zzgep3.mo46760d(e, bArr6, "key", bArr7, zzgeq.zza());
        byte[] d2 = zzgep3.mo46760d(e, bArr6, "base_nonce", bArr7, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new zzger(bArr, d, d2, bigInteger.shiftLeft(96).subtract(bigInteger), zzgeq);
    }

    /* renamed from: d */
    private final synchronized byte[] m51781d() throws GeneralSecurityException {
        byte[] d;
        byte[] bArr = this.f36741d;
        byte[] byteArray = this.f36743f.toByteArray();
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
        d = zzgnv.m52434d(bArr, byteArray);
        if (this.f36743f.compareTo(this.f36739b) < 0) {
            this.f36743f = this.f36743f.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo46762a() {
        return this.f36742e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo46763b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f36738a.mo46754a(this.f36740c, m51781d(), bArr, bArr2);
    }
}
