package com.google.android.gms.internal.nearby;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zztc extends zztg {

    /* renamed from: h */
    final char[] f45134h = new char[512];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zztc(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            com.google.android.gms.internal.nearby.zztb r4 = new com.google.android.gms.internal.nearby.zztb
            java.lang.String r5 = "0123456789ABCDEF"
            char[] r5 = r5.toCharArray()
            java.lang.String r0 = "base16()"
            r4.<init>(r0, r5)
            r5 = 0
            r3.<init>(r4, r5)
            r5 = 512(0x200, float:7.175E-43)
            char[] r5 = new char[r5]
            r3.f45134h = r5
            char[] r5 = r4.f45127b
            int r5 = r5.length
            r0 = 0
            r1 = 16
            if (r5 != r1) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            com.google.android.gms.internal.nearby.zzsg.m62986d(r5)
        L_0x0027:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 >= r5) goto L_0x0044
            char[] r5 = r3.f45134h
            int r1 = r0 >>> 4
            char r1 = r4.mo53290a(r1)
            r5[r0] = r1
            char[] r5 = r3.f45134h
            r1 = r0 | 256(0x100, float:3.59E-43)
            r2 = r0 & 15
            char r2 = r4.mo53290a(r2)
            r5[r1] = r2
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zztc.<init>(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53295a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(appendable);
        zzsg.m62989g(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3] & 255;
            appendable.append(this.f45134h[b]);
            appendable.append(this.f45134h[b | 256]);
        }
    }
}
