package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgbk {
    @Deprecated
    /* renamed from: a */
    public static final zzgbf m51541a(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgmk K = zzgmk.m52338K(bArr, zzgqq.m52900a());
            for (zzgmj zzgmj : K.mo46999L()) {
                if (zzgmj.mo46993G().mo46973M() == 2 || zzgmj.mo46993G().mo46973M() == 3 || zzgmj.mo46993G().mo46973M() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzgbf.m51526a(K);
        } catch (zzgrq unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
