package com.google.android.gms.internal.mlkit_translate;

import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzap extends zzas {

    /* renamed from: h */
    final char[] f43117h = new char[512];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzap(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.gms.internal.mlkit_translate.zzao r4 = new com.google.android.gms.internal.mlkit_translate.zzao
            java.lang.String r5 = "0123456789ABCDEF"
            char[] r5 = r5.toCharArray()
            java.lang.String r0 = "base16()"
            r4.<init>(r0, r5)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = 512(0x200, float:7.175E-43)
            char[] r5 = new char[r5]
            r3.f43117h = r5
            char[] r5 = r4.f43111b
            int r5 = r5.length
            r0 = 0
            r1 = 16
            if (r5 != r1) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            com.google.android.gms.internal.mlkit_translate.zzj.m61890c(r5)
        L_0x0027:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 >= r5) goto L_0x0044
            char[] r5 = r3.f43117h
            int r1 = r0 >>> 4
            char r1 = r4.mo52055a(r1)
            r5[r0] = r1
            char[] r5 = r3.f43117h
            r1 = r0 | 256(0x100, float:3.59E-43)
            r2 = r0 & 15
            char r2 = r4.mo52055a(r2)
            r5[r1] = r2
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzap.<init>(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo52062a(byte[] bArr, CharSequence charSequence) throws zzar {
        Objects.requireNonNull(bArr);
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f43118f.mo52056b(charSequence.charAt(i)) << 4) | this.f43118f.mo52056b(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new zzar("Invalid input length " + charSequence.length());
    }
}
