package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzavs {

    /* renamed from: a */
    private final zzbak f25846a = new zzbak(8);

    /* renamed from: b */
    private int f25847b;

    /* renamed from: b */
    private final long m42622b(zzauy zzauy) throws IOException, InterruptedException {
        int i = 0;
        zzauy.mo42099g(this.f25846a.f26406a, 0, 1, false);
        byte b = this.f25846a.f26406a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        zzauy.mo42099g(this.f25846a.f26406a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f25846a.f26406a[i] & 255) + (i4 << 8);
        }
        this.f25847b += i3 + 1;
        return (long) i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r0 = m42622b(r14);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42128a(com.google.android.gms.internal.ads.zzauy r14) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            long r0 = r14.mo42095c()
            r2 = 1024(0x400, double:5.06E-321)
            r4 = -1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0012
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r2 = r0
        L_0x0012:
            int r3 = (int) r2
            com.google.android.gms.internal.ads.zzbak r2 = r13.f25846a
            byte[] r2 = r2.f26406a
            r4 = 0
            r5 = 4
            r14.mo42099g(r2, r4, r5, r4)
            com.google.android.gms.internal.ads.zzbak r2 = r13.f25846a
            long r7 = r2.mo42327m()
            r13.f25847b = r5
        L_0x0024:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            r2 = 1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x004c
            int r5 = r13.f25847b
            int r5 = r5 + r2
            r13.f25847b = r5
            if (r5 != r3) goto L_0x0034
            return r4
        L_0x0034:
            com.google.android.gms.internal.ads.zzbak r5 = r13.f25846a
            byte[] r5 = r5.f26406a
            r14.mo42099g(r5, r4, r2, r4)
            r2 = 8
            long r7 = r7 << r2
            r9 = -256(0xffffffffffffff00, double:NaN)
            long r7 = r7 & r9
            com.google.android.gms.internal.ads.zzbak r2 = r13.f25846a
            byte[] r2 = r2.f26406a
            byte r2 = r2[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r9 = (long) r2
            long r7 = r7 | r9
            goto L_0x0024
        L_0x004c:
            long r7 = r13.m42622b(r14)
            int r3 = r13.f25847b
            long r9 = (long) r3
            r11 = -9223372036854775808
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0091
            if (r6 != 0) goto L_0x005c
            goto L_0x0063
        L_0x005c:
            long r5 = r9 + r7
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x0063
            goto L_0x0091
        L_0x0063:
            int r0 = r13.f25847b
            long r0 = (long) r0
            long r5 = r9 + r7
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x008e
            long r0 = r13.m42622b(r14)
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0075
            return r4
        L_0x0075:
            long r0 = r13.m42622b(r14)
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x008d
            if (r3 == 0) goto L_0x0063
            int r3 = (int) r0
            r14.mo42098f(r3, r4)
            int r3 = r13.f25847b
            long r5 = (long) r3
            long r5 = r5 + r0
            int r0 = (int) r5
            r13.f25847b = r0
            goto L_0x0063
        L_0x008d:
            return r4
        L_0x008e:
            if (r3 != 0) goto L_0x0091
            return r2
        L_0x0091:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavs.mo42128a(com.google.android.gms.internal.ads.zzauy):boolean");
    }
}
