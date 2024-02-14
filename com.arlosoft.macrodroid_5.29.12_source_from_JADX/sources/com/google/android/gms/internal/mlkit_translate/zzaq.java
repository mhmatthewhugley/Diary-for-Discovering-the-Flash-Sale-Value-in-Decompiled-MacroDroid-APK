package com.google.android.gms.internal.mlkit_translate;

import java.util.Objects;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzaq extends zzas {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzaq(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.gms.internal.mlkit_translate.zzao r0 = new com.google.android.gms.internal.mlkit_translate.zzao
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.f43111b
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.gms.internal.mlkit_translate.zzj.m61890c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzaq.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo52062a(byte[] bArr, CharSequence charSequence) throws zzar {
        Objects.requireNonNull(bArr);
        CharSequence c = mo52064c(charSequence);
        if (this.f43118f.mo52057c(c.length())) {
            int i = 0;
            int i2 = 0;
            while (i < c.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int b = (this.f43118f.mo52056b(c.charAt(i)) << 18) | (this.f43118f.mo52056b(c.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (b >>> 16);
                if (i4 < c.length()) {
                    int i6 = i4 + 1;
                    int b2 = b | (this.f43118f.mo52056b(c.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((b2 >>> 8) & 255);
                    if (i6 < c.length()) {
                        bArr[i7] = (byte) ((b2 | this.f43118f.mo52056b(c.charAt(i6))) & 255);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        throw new zzar("Invalid input length " + c.length());
    }
}
