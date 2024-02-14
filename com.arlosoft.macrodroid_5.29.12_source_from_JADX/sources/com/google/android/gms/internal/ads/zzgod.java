package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgod {

    /* renamed from: a */
    private final ECPublicKey f36957a;

    public zzgod(ECPublicKey eCPublicKey) {
        this.f36957a = eCPublicKey;
    }

    /* renamed from: a */
    public final zzgoc mo47032a(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        KeyPair c = zzgoe.m52446c(this.f36957a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) c.getPublic();
        byte[] g = zzgoe.m52450g((ECPrivateKey) c.getPrivate(), this.f36957a);
        byte[] l = zzgoe.m52455l(eCPublicKey.getParams().getCurve(), i2, eCPublicKey.getW());
        int i3 = 1;
        byte[] c2 = zzgnv.m52433c(l, g);
        Mac mac = (Mac) zzgog.f36965f.mo47033a(str);
        if (i <= mac.getMacLength() * 255) {
            if (bArr == null || bArr.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr, str));
            }
            byte[] doFinal = mac.doFinal(c2);
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(doFinal, str));
            byte[] bArr4 = new byte[0];
            int i4 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i3);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i5 = i4 + length;
                if (i5 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i4, length);
                    i3++;
                    i4 = i5;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i4, i - i4);
                    return new zzgoc(l, bArr3);
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }
}
