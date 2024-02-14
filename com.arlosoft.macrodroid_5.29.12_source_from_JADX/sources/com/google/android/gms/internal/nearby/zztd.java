package com.google.android.gms.internal.nearby;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
final class zztd extends zztg {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zztd(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
        /*
            r1 = this;
            com.google.android.gms.internal.nearby.zztb r0 = new com.google.android.gms.internal.nearby.zztb
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r1.<init>(r0, r4)
            char[] r2 = r0.f45127b
            int r2 = r2.length
            r3 = 64
            if (r2 != r3) goto L_0x0017
            r2 = 1
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            com.google.android.gms.internal.nearby.zzsg.m62986d(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zztd.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53295a(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(appendable);
        int i3 = 0;
        zzsg.m62989g(0, i2, bArr.length);
        int i4 = i2;
        while (i4 >= 3) {
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i3] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
            appendable.append(this.f45137f.mo53290a(b >>> 18));
            appendable.append(this.f45137f.mo53290a((b >>> 12) & 63));
            appendable.append(this.f45137f.mo53290a((b >>> 6) & 63));
            appendable.append(this.f45137f.mo53290a(b & 63));
            i4 -= 3;
            i3 = i6 + 1;
        }
        if (i3 < i2) {
            mo53300f(appendable, bArr, i3, i2 - i3);
        }
    }
}
