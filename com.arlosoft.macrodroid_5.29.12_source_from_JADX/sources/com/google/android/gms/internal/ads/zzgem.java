package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgem implements zzgny {

    /* renamed from: a */
    private final String f36729a;

    /* renamed from: b */
    private final int f36730b;

    /* renamed from: c */
    private zzgje f36731c;

    /* renamed from: d */
    private zzgig f36732d;

    /* renamed from: e */
    private int f36733e;

    /* renamed from: f */
    private zzgjq f36734f;

    zzgem(zzgmc zzgmc) throws GeneralSecurityException {
        String J = zzgmc.mo46978J();
        this.f36729a = J;
        if (J.equals(zzgca.f36679b)) {
            try {
                zzgjh I = zzgjh.m52071I(zzgmc.mo46977I(), zzgqq.m52900a());
                this.f36731c = (zzgje) zzgby.m51563d(zzgmc);
                this.f36730b = I.mo46883F();
            } catch (zzgrq e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (J.equals(zzgca.f36678a)) {
            try {
                zzgij H = zzgij.m51972H(zzgmc.mo46977I(), zzgqq.m52900a());
                this.f36732d = (zzgig) zzgby.m51563d(zzgmc);
                this.f36733e = H.mo46845I().mo46855F();
                this.f36730b = this.f36733e + H.mo46846J().mo46940F();
            } catch (zzgrq e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (J.equals(zzgdx.f36712a)) {
            try {
                zzgjt I2 = zzgjt.m52105I(zzgmc.mo46977I(), zzgqq.m52900a());
                this.f36734f = (zzgjq) zzgby.m51563d(zzgmc);
                this.f36730b = I2.mo46895F();
            } catch (zzgrq e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(J)));
        }
    }

    /* renamed from: b */
    public final zzgfi mo46752b(byte[] bArr) throws GeneralSecurityException {
        Class<zzgak> cls = zzgak.class;
        if (bArr.length != this.f36730b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f36729a.equals(zzgca.f36679b)) {
            zzgjd G = zzgje.m52060G();
            G.mo47339f(this.f36731c);
            G.mo46878n(zzgpw.m52565T(bArr, 0, this.f36730b));
            return new zzgfi((zzgak) zzgby.m51567h(this.f36729a, (zzgje) G.mo47341h(), cls));
        } else if (this.f36729a.equals(zzgca.f36678a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f36733e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f36733e, this.f36730b);
            zzgil G2 = zzgim.m51981G();
            G2.mo47339f(this.f36732d.mo46841J());
            G2.mo46847n(zzgpw.m52564R(copyOfRange));
            zzgkz G3 = zzgla.m52200G();
            G3.mo47339f(this.f36732d.mo46842K());
            G3.mo46932n(zzgpw.m52564R(copyOfRange2));
            zzgif G4 = zzgig.m51958G();
            G4.mo46839u(this.f36732d.mo46840F());
            G4.mo46837n((zzgim) G2.mo47341h());
            G4.mo46838o((zzgla) G3.mo47341h());
            return new zzgfi((zzgak) zzgby.m51567h(this.f36729a, (zzgig) G4.mo47341h(), cls));
        } else if (this.f36729a.equals(zzgdx.f36712a)) {
            zzgjp G5 = zzgjq.m52094G();
            G5.mo47339f(this.f36734f);
            G5.mo46890n(zzgpw.m52565T(bArr, 0, this.f36730b));
            return new zzgfi((zzgaq) zzgby.m51567h(this.f36729a, (zzgjq) G5.mo47341h(), zzgaq.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f36730b;
    }
}
