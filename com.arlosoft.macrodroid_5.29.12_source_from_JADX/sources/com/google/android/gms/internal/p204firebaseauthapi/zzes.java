package com.google.android.gms.internal.p204firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzes */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzes {

    /* renamed from: a */
    private final String f40013a;

    zzes(String str) {
        this.f40013a = str;
    }

    /* renamed from: f */
    private final byte[] m57201f(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        Mac mac = (Mac) zzpz.f40325f.mo49715a(this.f40013a);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, this.f40013a));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                int i4 = i3 + length;
                if (i4 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i2++;
                    i3 = i4;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    /* renamed from: g */
    private final byte[] m57202g(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) zzpz.f40325f.mo49715a(this.f40013a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f40013a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f40013a));
        }
        return mac.doFinal(bArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo49396a() throws GeneralSecurityException {
        return Mac.getInstance(this.f40013a).getMacLength();
    }

    /* renamed from: b */
    public final byte[] mo49397b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i) throws GeneralSecurityException {
        return m57201f(m57202g(zzff.m57241e("eae_prk", bArr2, bArr4), (byte[]) null), zzff.m57242f("shared_secret", bArr3, bArr4, i), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo49398c() throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            java.lang.String r0 = r5.f40013a
            int r1 = r0.hashCode()
            r2 = 984523022(0x3aaea10e, float:0.0013323145)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 984524074(0x3aaea52a, float:0.0013324369)
            if (r1 == r2) goto L_0x0022
            r2 = 984525777(0x3aaeabd1, float:0.0013326352)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "HmacSha512"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "HmacSha384"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "HmacSha256"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x004b
            if (r0 == r4) goto L_0x0048
            if (r0 != r3) goto L_0x0040
            byte[] r0 = com.google.android.gms.internal.p204firebaseauthapi.zzff.f40041h
            return r0
        L_0x0040:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Could not determine HPKE KDF ID"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            byte[] r0 = com.google.android.gms.internal.p204firebaseauthapi.zzff.f40040g
            return r0
        L_0x004b:
            byte[] r0 = com.google.android.gms.internal.p204firebaseauthapi.zzff.f40039f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p204firebaseauthapi.zzes.mo49398c():byte[]");
    }

    /* renamed from: d */
    public final byte[] mo49399d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) throws GeneralSecurityException {
        return m57201f(bArr, zzff.m57242f(str, bArr2, bArr3, i), i);
    }

    /* renamed from: e */
    public final byte[] mo49400e(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return m57202g(zzff.m57241e(str, bArr2, bArr3), bArr);
    }
}
