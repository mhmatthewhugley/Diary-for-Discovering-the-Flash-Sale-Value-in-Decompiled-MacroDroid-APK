package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzix */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzix implements zzbm {

    /* renamed from: a */
    private final zzbu f40196a;

    /* renamed from: b */
    private final zzjd f40197b;

    /* renamed from: c */
    private final zzjd f40198c;

    /* synthetic */ zzix(zzbu zzbu, zziw zziw) {
        zzjd zzjd;
        this.f40196a = zzbu;
        if (zzbu.mo49362f()) {
            zzje b = zzgm.m57301a().mo49428b();
            zzjj a = zzgj.m57299a(zzbu);
            this.f40197b = b.mo49427a(a, "mac", "compute");
            zzjd = b.mo49427a(a, "mac", "verify");
        } else {
            zzjd = zzgj.f40094a;
            this.f40197b = zzjd;
        }
        this.f40198c = zzjd;
    }

    /* renamed from: a */
    public final void mo49341a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzbq zzbq : this.f40196a.mo49361e(copyOf)) {
                if (zzbq.mo49349d().equals(zzoy.LEGACY)) {
                    bArr3 = zzpp.m57921c(bArr2, zziy.f40200b);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((zzbm) zzbq.mo49350e()).mo49341a(copyOfRange, bArr3);
                    zzbq.mo49346a();
                    return;
                } catch (GeneralSecurityException e) {
                    zziy.f40199a.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (zzbq zzbq2 : this.f40196a.mo49361e(zzas.f39898a)) {
                try {
                    ((zzbm) zzbq2.mo49350e()).mo49341a(bArr, bArr2);
                    zzbq2.mo49346a();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
