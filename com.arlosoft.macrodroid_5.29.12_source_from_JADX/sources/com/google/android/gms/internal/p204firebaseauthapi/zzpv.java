package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpv */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzpv {

    /* renamed from: a */
    private final ECPrivateKey f40316a;

    public zzpv(ECPrivateKey eCPrivateKey) {
        this.f40316a = eCPrivateKey;
    }

    /* renamed from: a */
    public final byte[] mo49714a(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, int i2) throws GeneralSecurityException {
        int i3 = 1;
        byte[] c = zzpp.m57921c(bArr, zzpx.m57937h(this.f40316a, zzpx.m57940k(this.f40316a.getParams(), i2, bArr)));
        Mac mac = (Mac) zzpz.f40325f.mo49715a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr2 == null || bArr2.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr2, str));
            }
            byte[] doFinal = mac.doFinal(c);
            byte[] bArr4 = new byte[i];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr5 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update((byte[]) null);
                mac.update((byte) i3);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                int i5 = i4 + length;
                if (i5 < i) {
                    System.arraycopy(bArr5, 0, bArr4, i4, length);
                    i3++;
                    i4 = i5;
                } else {
                    System.arraycopy(bArr5, 0, bArr4, i4, i - i4);
                    return bArr4;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
