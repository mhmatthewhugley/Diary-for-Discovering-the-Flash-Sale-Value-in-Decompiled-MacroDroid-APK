package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfer {
    @VisibleForTesting
    public zzfer() {
        try {
            zzgca.m51587a();
        } catch (GeneralSecurityException e) {
            zze.m2645k("Failed to Configure Aead. ".concat(e.toString()));
            zzt.m2904q().mo43503t(e, "CryptoUtils.registerAead");
        }
    }

    /* renamed from: a */
    public static final String m50027a() {
        zzgpt P = zzgpw.m52562P();
        try {
            zzgao.m51474b(zzgbf.m51527b(zzgbe.m51525a("AES128_GCM")), zzgam.m51471b(P));
        } catch (IOException | GeneralSecurityException e) {
            zze.m2645k("Failed to generate key".concat(e.toString()));
            zzt.m2904q().mo43503t(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(P.mo47098c().mo47109i(), 11);
        P.mo47099e();
        return encodeToString;
    }

    /* renamed from: b */
    public static final String m50028b(byte[] bArr, byte[] bArr2, String str, zzdxl zzdxl) {
        zzgbf c = m50029c(str);
        if (c == null) {
            return null;
        }
        try {
            byte[] a = ((zzgak) c.mo46686d(zzgak.class)).mo46654a(bArr, bArr2);
            zzdxl.mo45036a().put("ds", "1");
            return new String(a, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            zze.m2645k("Failed to decrypt ".concat(e.toString()));
            zzt.m2904q().mo43503t(e, "CryptoUtils.decrypt");
            zzdxl.mo45036a().put("dsf", e.toString());
            return null;
        }
    }

    /* renamed from: c */
    private static final zzgbf m50029c(String str) {
        try {
            return zzgao.m51473a(zzgal.m51469b(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            zze.m2645k("Failed to get keysethandle".concat(e.toString()));
            zzt.m2904q().mo43503t(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
