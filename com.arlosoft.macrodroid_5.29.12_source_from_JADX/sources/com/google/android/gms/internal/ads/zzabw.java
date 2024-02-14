package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzabw implements zzzi {

    /* renamed from: a */
    private final zzef f23881a = new zzef(6);

    /* renamed from: b */
    private zzzl f23882b;

    /* renamed from: c */
    private int f23883c;

    /* renamed from: d */
    private int f23884d;

    /* renamed from: e */
    private int f23885e;

    /* renamed from: f */
    private long f23886f = -1;
    @Nullable

    /* renamed from: g */
    private zzadt f23887g;

    /* renamed from: h */
    private zzzj f23888h;

    /* renamed from: i */
    private zzabz f23889i;
    @Nullable

    /* renamed from: j */
    private zzafq f23890j;

    /* renamed from: b */
    private final int m41024b(zzzj zzzj) throws IOException {
        this.f23881a.mo45227c(2);
        ((zzyy) zzzj).mo48454j(this.f23881a.mo45232h(), 0, 2, false);
        return this.f23881a.mo45247w();
    }

    /* renamed from: c */
    private final void m41025c() {
        m41026e(new zzbp[0]);
        zzzl zzzl = this.f23882b;
        Objects.requireNonNull(zzzl);
        zzzl.mo41255j0();
        this.f23882b.mo41254h(new zzaak(-9223372036854775807L, 0));
        this.f23883c = 6;
    }

    /* renamed from: e */
    private final void m41026e(zzbp... zzbpArr) {
        zzzl zzzl = this.f23882b;
        Objects.requireNonNull(zzzl);
        zzaap k = zzzl.mo41256k(1024, 4);
        zzad zzad = new zzad();
        zzad.mo41332h0("image/jpeg");
        zzad.mo41337m(new zzbq(-9223372036854775807L, zzbpArr));
        k.mo41214d(zzad.mo41349y());
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        if (m41024b(zzzj) != 65496) {
            return false;
        }
        int b = m41024b(zzzj);
        this.f23884d = b;
        if (b == 65504) {
            this.f23881a.mo45227c(2);
            zzyy zzyy = (zzyy) zzzj;
            zzyy.mo48454j(this.f23881a.mo45232h(), 0, 2, false);
            zzyy.mo48458o(this.f23881a.mo45247w() - 2, false);
            b = m41024b(zzzj);
            this.f23884d = b;
        }
        if (b == 65505) {
            zzyy zzyy2 = (zzyy) zzzj;
            zzyy2.mo48458o(2, false);
            this.f23881a.mo45227c(6);
            zzyy2.mo48454j(this.f23881a.mo45232h(), 0, 6, false);
            if (this.f23881a.mo45217A() == 1165519206 && this.f23881a.mo45247w() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f23882b = zzzl;
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        if (j == 0) {
            this.f23883c = 0;
            this.f23890j = null;
        } else if (this.f23883c == 5) {
            zzafq zzafq = this.f23890j;
            Objects.requireNonNull(zzafq);
            zzafq.mo41229g(j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x015e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r24, com.google.android.gms.internal.ads.zzaai r25) throws java.io.IOException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            int r3 = r0.f23883c
            r4 = 4
            r5 = 2
            r6 = 1
            r7 = -1
            r9 = 0
            if (r3 == 0) goto L_0x018d
            if (r3 == r6) goto L_0x016f
            r10 = -1
            if (r3 == r5) goto L_0x00ac
            r5 = 5
            if (r3 == r4) goto L_0x004c
            if (r3 == r5) goto L_0x0024
            r1 = 6
            if (r3 != r1) goto L_0x001e
            return r10
        L_0x001e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0024:
            com.google.android.gms.internal.ads.zzabz r3 = r0.f23889i
            if (r3 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzzj r3 = r0.f23888h
            if (r1 == r3) goto L_0x0037
        L_0x002c:
            r0.f23888h = r1
            com.google.android.gms.internal.ads.zzabz r3 = new com.google.android.gms.internal.ads.zzabz
            long r4 = r0.f23886f
            r3.<init>(r1, r4)
            r0.f23889i = r3
        L_0x0037:
            com.google.android.gms.internal.ads.zzafq r1 = r0.f23890j
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzabz r3 = r0.f23889i
            int r1 = r1.mo41230h(r3, r2)
            if (r1 != r6) goto L_0x004b
            long r3 = r2.f23733a
            long r5 = r0.f23886f
            long r3 = r3 + r5
            r2.f23733a = r3
        L_0x004b:
            return r1
        L_0x004c:
            long r3 = r24.mo41252c()
            long r7 = r0.f23886f
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x00a9
            com.google.android.gms.internal.ads.zzef r2 = r0.f23881a
            byte[] r2 = r2.mo45232h()
            boolean r2 = r1.mo48454j(r2, r9, r6, r6)
            if (r2 != 0) goto L_0x0066
            r23.m41025c()
            goto L_0x00a8
        L_0x0066:
            r24.mo48452h()
            com.google.android.gms.internal.ads.zzafq r2 = r0.f23890j
            if (r2 != 0) goto L_0x0074
            com.google.android.gms.internal.ads.zzafq r2 = new com.google.android.gms.internal.ads.zzafq
            r2.<init>(r9)
            r0.f23890j = r2
        L_0x0074:
            com.google.android.gms.internal.ads.zzabz r2 = new com.google.android.gms.internal.ads.zzabz
            long r3 = r0.f23886f
            r2.<init>(r1, r3)
            r0.f23889i = r2
            com.google.android.gms.internal.ads.zzafq r1 = r0.f23890j
            boolean r1 = r1.mo41227a(r2)
            if (r1 == 0) goto L_0x00a5
            com.google.android.gms.internal.ads.zzafq r1 = r0.f23890j
            com.google.android.gms.internal.ads.zzacb r2 = new com.google.android.gms.internal.ads.zzacb
            long r3 = r0.f23886f
            com.google.android.gms.internal.ads.zzzl r7 = r0.f23882b
            java.util.Objects.requireNonNull(r7)
            r2.<init>(r3, r7)
            r1.mo41228d(r2)
            com.google.android.gms.internal.ads.zzbp[] r1 = new com.google.android.gms.internal.ads.zzbp[r6]
            com.google.android.gms.internal.ads.zzadt r2 = r0.f23887g
            java.util.Objects.requireNonNull(r2)
            r1[r9] = r2
            r0.m41026e(r1)
            r0.f23883c = r5
            goto L_0x00a8
        L_0x00a5:
            r23.m41025c()
        L_0x00a8:
            return r9
        L_0x00a9:
            r2.f23733a = r7
            return r6
        L_0x00ac:
            int r2 = r0.f23884d
            r3 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r3) goto L_0x0164
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            int r3 = r0.f23885e
            r2.<init>((int) r3)
            byte[] r3 = r2.mo45232h()
            int r4 = r0.f23885e
            r6 = r1
            com.google.android.gms.internal.ads.zzyy r6 = (com.google.android.gms.internal.ads.zzyy) r6
            r6.mo48453i(r3, r9, r4, r9)
            com.google.android.gms.internal.ads.zzadt r3 = r0.f23887g
            if (r3 != 0) goto L_0x0162
            java.lang.String r3 = r2.mo45220D(r9)
            java.lang.String r4 = "http://ns.adobe.com/xap/1.0/"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0162
            java.lang.String r2 = r2.mo45220D(r9)
            if (r2 == 0) goto L_0x0162
            long r3 = r24.mo41253d()
            int r6 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00e7
        L_0x00e4:
            r1 = 0
            goto L_0x015a
        L_0x00e7:
            com.google.android.gms.internal.ads.zzaby r2 = com.google.android.gms.internal.ads.zzacc.m41041a(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x00e4
        L_0x00ee:
            java.util.List r6 = r2.f23896b
            int r6 = r6.size()
            if (r6 >= r5) goto L_0x00f7
            goto L_0x00e4
        L_0x00f7:
            java.util.List r5 = r2.f23896b
            int r5 = r5.size()
            int r5 = r5 + r10
            r11 = r7
            r13 = r11
            r17 = r13
            r19 = r17
            r6 = 0
        L_0x0105:
            if (r5 < 0) goto L_0x0140
            java.util.List r10 = r2.f23896b
            java.lang.Object r10 = r10.get(r5)
            com.google.android.gms.internal.ads.zzabx r10 = (com.google.android.gms.internal.ads.zzabx) r10
            java.lang.String r15 = r10.f23891a
            java.lang.String r1 = "video/mp4"
            boolean r1 = r1.equals(r15)
            r1 = r1 | r6
            if (r5 != 0) goto L_0x0120
            long r9 = r10.f23894d
            long r3 = r3 - r9
            r9 = 0
            goto L_0x0124
        L_0x0120:
            long r9 = r10.f23893c
            long r9 = r3 - r9
        L_0x0124:
            r21 = r3
            r3 = r9
            r9 = r21
            if (r1 == 0) goto L_0x0135
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x0135
            long r19 = r9 - r3
            r17 = r3
            r6 = 0
            goto L_0x0136
        L_0x0135:
            r6 = r1
        L_0x0136:
            if (r5 != 0) goto L_0x0139
            r13 = r9
        L_0x0139:
            if (r5 != 0) goto L_0x013c
            r11 = r3
        L_0x013c:
            int r5 = r5 + -1
            r9 = 0
            goto L_0x0105
        L_0x0140:
            int r1 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0151
            goto L_0x00e4
        L_0x0151:
            com.google.android.gms.internal.ads.zzadt r1 = new com.google.android.gms.internal.ads.zzadt
            long r2 = r2.f23895a
            r10 = r1
            r15 = r2
            r10.<init>(r11, r13, r15, r17, r19)
        L_0x015a:
            r0.f23887g = r1
            if (r1 == 0) goto L_0x0162
            long r1 = r1.f24010f
            r0.f23886f = r1
        L_0x0162:
            r3 = 0
            goto L_0x016c
        L_0x0164:
            int r2 = r0.f23885e
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r3 = 0
            r1.mo48459p(r2, r3)
        L_0x016c:
            r0.f23883c = r3
            return r3
        L_0x016f:
            r3 = 0
            com.google.android.gms.internal.ads.zzef r2 = r0.f23881a
            r2.mo45227c(r5)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23881a
            byte[] r2 = r2.mo45232h()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48453i(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.zzef r1 = r0.f23881a
            int r1 = r1.mo45247w()
            int r1 = r1 + -2
            r0.f23885e = r1
            r0.f23883c = r5
            return r3
        L_0x018d:
            r3 = 0
            com.google.android.gms.internal.ads.zzef r2 = r0.f23881a
            r2.mo45227c(r5)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23881a
            byte[] r2 = r2.mo45232h()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48453i(r2, r3, r5, r3)
            com.google.android.gms.internal.ads.zzef r1 = r0.f23881a
            int r1 = r1.mo45247w()
            r0.f23884d = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01b8
            long r1 = r0.f23886f
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01b4
            r0.f23883c = r4
            goto L_0x01c9
        L_0x01b4:
            r23.m41025c()
            goto L_0x01c9
        L_0x01b8:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01c2
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01c9
        L_0x01c2:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01c9
            r0.f23883c = r6
        L_0x01c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabw.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }
}
