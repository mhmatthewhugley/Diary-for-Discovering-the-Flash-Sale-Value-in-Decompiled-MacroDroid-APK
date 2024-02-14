package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzep */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzep implements zzps {

    /* renamed from: a */
    private final String f40006a;

    /* renamed from: b */
    private final int f40007b;

    /* renamed from: c */
    private zzku f40008c;

    /* renamed from: d */
    private zzjw f40009d;

    /* renamed from: e */
    private int f40010e;

    /* renamed from: f */
    private zzlg f40011f;

    zzep(zznx zznx) throws GeneralSecurityException {
        String H = zznx.mo49665H();
        this.f40006a = H;
        if (H.equals(zzcc.f39944b)) {
            try {
                zzkx F = zzkx.m57556F(zznx.mo49664G(), zzacs.m56379a());
                this.f40008c = (zzku) zzbz.m56999d(zznx);
                this.f40007b = F.mo49565C();
            } catch (zzadn e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (H.equals(zzcc.f39943a)) {
            try {
                zzjz E = zzjz.m57475E(zznx.mo49664G(), zzacs.m56379a());
                this.f40009d = (zzjw) zzbz.m56999d(zznx);
                this.f40010e = E.mo49533F().mo49544C();
                this.f40007b = this.f40010e + E.mo49534G().mo49624C();
            } catch (zzadn e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (H.equals(zzea.f39985a)) {
            try {
                zzlj F2 = zzlj.m57590F(zznx.mo49664G(), zzacs.m56379a());
                this.f40011f = (zzlg) zzbz.m56999d(zznx);
                this.f40007b = F2.mo49578C();
            } catch (zzadn e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(H)));
        }
    }

    /* renamed from: b */
    public final zzfk mo49391b(byte[] bArr) throws GeneralSecurityException {
        Class<zzap> cls = zzap.class;
        if (bArr.length != this.f40007b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f40006a.equals(zzcc.f39944b)) {
            zzkt D = zzku.m57545D();
            D.mo49068e(this.f40008c);
            D.mo49560n(zzacc.m56160u(bArr, 0, this.f40007b));
            return new zzfk((zzap) zzbz.m57004i(this.f40006a, (zzku) D.mo49069f(), cls));
        } else if (this.f40006a.equals(zzcc.f39943a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f40010e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f40010e, this.f40007b);
            zzkb D2 = zzkc.m57484D();
            D2.mo49068e(this.f40009d.mo49529G());
            D2.mo49536n(zzacc.m56159t(copyOfRange));
            zzms D3 = zzmt.m57694D();
            D3.mo49068e(this.f40009d.mo49530H());
            D3.mo49616n(zzacc.m56159t(copyOfRange2));
            zzjv D4 = zzjw.m57461D();
            D4.mo49527q(this.f40009d.mo49528C());
            D4.mo49525n((zzkc) D2.mo49069f());
            D4.mo49526o((zzmt) D3.mo49069f());
            return new zzfk((zzap) zzbz.m57004i(this.f40006a, (zzjw) D4.mo49069f(), cls));
        } else if (this.f40006a.equals(zzea.f39985a)) {
            zzlf D5 = zzlg.m57579D();
            D5.mo49068e(this.f40011f);
            D5.mo49573n(zzacc.m56160u(bArr, 0, this.f40007b));
            return new zzfk((zzat) zzbz.m57004i(this.f40006a, (zzlg) D5.mo49069f(), zzat.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f40007b;
    }
}
