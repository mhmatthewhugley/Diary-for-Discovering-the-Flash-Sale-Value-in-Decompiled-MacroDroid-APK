package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzghi implements zzgbj {

    /* renamed from: a */
    private final zzgbu f36841a;

    /* renamed from: b */
    private final zzghn f36842b;

    /* renamed from: c */
    private final zzghn f36843c;

    /* synthetic */ zzghi(zzgbu zzgbu, zzghh zzghh) {
        zzghn zzghn;
        this.f36841a = zzgbu;
        if (zzgbu.mo46715f()) {
            zzgho b = zzgfx.m51847a().mo46782b();
            zzght a = zzgfu.m51845a(zzgbu);
            this.f36842b = b.mo46781a(a, "mac", "compute");
            zzghn = b.mo46781a(a, "mac", "verify");
        } else {
            zzghn = zzgfu.f36802a;
            this.f36842b = zzghn;
        }
        this.f36843c = zzghn;
    }

    /* renamed from: a */
    public final void mo46693a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgbo zzgbo : this.f36841a.mo46714e(copyOf)) {
                if (zzgbo.mo46704f() == 4) {
                    bArr3 = zzgnv.m52433c(bArr2, zzghj.f36845b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((zzgbj) zzgbo.mo46701c()).mo46693a(copyOfRange, bArr3);
                    zzgbo.mo46699a();
                    return;
                } catch (GeneralSecurityException e) {
                    zzghj.f36844a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (zzgbo zzgbo2 : this.f36841a.mo46714e(zzgap.f36622a)) {
                try {
                    ((zzgbj) zzgbo2.mo46701c()).mo46693a(bArr, bArr2);
                    zzgbo2.mo46699a();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    /* renamed from: b */
    public final byte[] mo46694b(byte[] bArr) throws GeneralSecurityException {
        if (this.f36841a.mo46710a().mo46704f() == 4) {
            bArr = zzgnv.m52433c(bArr, zzghj.f36845b);
        }
        try {
            byte[] c = zzgnv.m52433c(this.f36841a.mo46710a().mo46702d(), ((zzgbj) this.f36841a.mo46710a().mo46701c()).mo46694b(bArr));
            this.f36841a.mo46710a().mo46699a();
            return c;
        } catch (GeneralSecurityException e) {
            throw e;
        }
    }
}
