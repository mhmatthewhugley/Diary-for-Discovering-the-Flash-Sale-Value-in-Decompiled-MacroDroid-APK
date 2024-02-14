package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzaff {

    /* renamed from: a */
    private static final byte[] f24243a = zzen.m49127B("OpusHead");

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r3 != 13) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r3 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair m41238a(com.google.android.gms.internal.ads.zzaew r11) {
        /*
            com.google.android.gms.internal.ads.zzef r11 = r11.f24179b
            r0 = 8
            r11.mo45230f(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000a:
            int r4 = r11.mo45233i()
            if (r4 < r0) goto L_0x00df
            int r4 = r11.mo45235k()
            int r5 = r11.mo45237m()
            int r6 = r11.mo45237m()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L_0x0075
            r11.mo45230f(r4)
            int r2 = r4 + r5
            r11.mo45231g(r0)
            m41241d(r11)
        L_0x002c:
            int r6 = r11.mo45235k()
            if (r6 >= r2) goto L_0x0073
            int r6 = r11.mo45235k()
            int r7 = r11.mo45237m()
            int r8 = r11.mo45237m()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L_0x006e
            r11.mo45230f(r6)
            int r6 = r6 + r7
            r11.mo45231g(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x004f:
            int r7 = r11.mo45235k()
            if (r7 >= r6) goto L_0x005f
            com.google.android.gms.internal.ads.zzbp r7 = com.google.android.gms.internal.ads.zzafm.m41275a(r11)
            if (r7 == 0) goto L_0x004f
            r2.add(r7)
            goto L_0x004f
        L_0x005f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            com.google.android.gms.internal.ads.zzbq r6 = new com.google.android.gms.internal.ads.zzbq
            r6.<init>((java.util.List) r2)
            r2 = r6
            goto L_0x00d9
        L_0x006e:
            int r6 = r6 + r7
            r11.mo45230f(r6)
            goto L_0x002c
        L_0x0073:
            r2 = r1
            goto L_0x00d9
        L_0x0075:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto L_0x00d9
            r11.mo45230f(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.mo45231g(r6)
        L_0x0084:
            int r7 = r11.mo45235k()
            if (r7 >= r3) goto L_0x00d8
            int r7 = r11.mo45235k()
            int r8 = r11.mo45237m()
            int r9 = r11.mo45237m()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto L_0x00d3
            r3 = 14
            if (r8 >= r3) goto L_0x00a0
            goto L_0x00d8
        L_0x00a0:
            r3 = 5
            r11.mo45231g(r3)
            int r3 = r11.mo45243s()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto L_0x00b1
            r6 = 13
            if (r3 == r6) goto L_0x00b5
            goto L_0x00d8
        L_0x00b1:
            if (r3 != r6) goto L_0x00b5
            r7 = 1131413504(0x43700000, float:240.0)
        L_0x00b5:
            r3 = 1
            r11.mo45231g(r3)
            int r6 = r11.mo45243s()
            com.google.android.gms.internal.ads.zzbq r8 = new com.google.android.gms.internal.ads.zzbq
            com.google.android.gms.internal.ads.zzbp[] r3 = new com.google.android.gms.internal.ads.zzbp[r3]
            com.google.android.gms.internal.ads.zzadw r9 = new com.google.android.gms.internal.ads.zzadw
            r9.<init>((float) r7, (int) r6)
            r6 = 0
            r3[r6] = r9
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.<init>(r6, r3)
            r3 = r8
            goto L_0x00d9
        L_0x00d3:
            int r7 = r7 + r8
            r11.mo45230f(r7)
            goto L_0x0084
        L_0x00d8:
            r3 = r1
        L_0x00d9:
            int r4 = r4 + r5
            r11.mo45230f(r4)
            goto L_0x000a
        L_0x00df:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.m41238a(com.google.android.gms.internal.ads.zzaew):android.util.Pair");
    }

    @Nullable
    /* renamed from: b */
    public static zzbq m41239b(zzaev zzaev) {
        zzadq zzadq;
        zzaew d = zzaev.mo41416d(1751411826);
        zzaew d2 = zzaev.mo41416d(1801812339);
        zzaew d3 = zzaev.mo41416d(1768715124);
        if (d == null || d2 == null || d3 == null || m41244g(d.f24179b) != 1835299937) {
            return null;
        }
        zzef zzef = d2.f24179b;
        zzef.mo45230f(12);
        int m = zzef.mo45237m();
        String[] strArr = new String[m];
        for (int i = 0; i < m; i++) {
            int m2 = zzef.mo45237m();
            zzef.mo45231g(4);
            strArr[i] = zzef.mo45222F(m2 - 8, zzfsk.f36339c);
        }
        zzef zzef2 = d3.f24179b;
        zzef2.mo45230f(8);
        ArrayList arrayList = new ArrayList();
        while (zzef2.mo45233i() > 8) {
            int k = zzef2.mo45235k();
            int m3 = zzef2.mo45237m();
            int m4 = zzef2.mo45237m() - 1;
            if (m4 < 0 || m4 >= m) {
                zzdw.m48255e("AtomParsers", "Skipped metadata with unknown key index: " + m4);
            } else {
                String str = strArr[m4];
                int i2 = k + m3;
                int i3 = zzafm.f24299b;
                while (true) {
                    int k2 = zzef2.mo45235k();
                    if (k2 >= i2) {
                        zzadq = null;
                        break;
                    }
                    int m5 = zzef2.mo45237m();
                    if (zzef2.mo45237m() == 1684108385) {
                        int m6 = zzef2.mo45237m();
                        int m7 = zzef2.mo45237m();
                        int i4 = m5 - 16;
                        byte[] bArr = new byte[i4];
                        zzef2.mo45226b(bArr, 0, i4);
                        zzadq = new zzadq(str, bArr, m7, m6);
                        break;
                    }
                    zzef2.mo45230f(k2 + m5);
                }
                if (zzadq != null) {
                    arrayList.add(zzadq);
                }
            }
            zzef2.mo45230f(k + m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq((List) arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        if (r7 == 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0669, code lost:
        if (r1 != 3) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0762, code lost:
        if (r25 == null) goto L_0x0779;
     */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x07df  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x07ea  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x07f1  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x07f5  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x082a  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x09e1  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0aa8 A[LOOP:12: B:475:0x0aa8->B:479:0x0ab2, LOOP_START, PHI: r23 
      PHI: (r23v6 int) = (r23v5 int), (r23v7 int) binds: [B:474:0x0aa6, B:479:0x0ab2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0abb  */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0b06  */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0b1b  */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0b1e  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x0b79  */
    /* JADX WARNING: Removed duplicated region for block: B:505:0x0b97  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:594:0x0e0c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:623:0x0aa1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a0  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m41240c(com.google.android.gms.internal.ads.zzaev r58, com.google.android.gms.internal.ads.zzzx r59, long r60, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzx r62, boolean r63, boolean r64, com.google.android.gms.internal.ads.zzfsm r65) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r0 = r58
            r1 = r59
            r12 = r62
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List r2 = r0.f24178d
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0e19
            java.util.List r2 = r0.f24178d
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            com.google.android.gms.internal.ads.zzaev r11 = (com.google.android.gms.internal.ads.zzaev) r11
            int r2 = r11.f24180a
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r0 = r13
            r31 = r15
            goto L_0x0e0e
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzaew r2 = r0.mo41416d(r2)
            java.util.Objects.requireNonNull(r2)
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzaev r3 = r11.mo41415c(r10)
            java.util.Objects.requireNonNull(r3)
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzaew r4 = r3.mo41416d(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzef r4 = r4.f24179b
            int r4 = m41244g(r4)
            int r9 = m41242e(r4)
            java.lang.String r6 = "AtomParsers"
            r31 = r15
            r5 = -1
            if (r9 != r5) goto L_0x0062
            r0 = r65
            r14 = r6
            r2 = r11
            r32 = r13
            r3 = 2
        L_0x005f:
            r8 = 0
            goto L_0x0822
        L_0x0062:
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.zzaew r4 = r11.mo41416d(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzef r4 = r4.f24179b
            r8 = 8
            r4.mo45230f(r8)
            int r21 = r4.mo45237m()
            int r21 = com.google.android.gms.internal.ads.zzaex.m41221a(r21)
            if (r21 != 0) goto L_0x0080
            r10 = 8
            goto L_0x0082
        L_0x0080:
            r10 = 16
        L_0x0082:
            r4.mo45231g(r10)
            int r10 = r4.mo45237m()
            r8 = 4
            r4.mo45231g(r8)
            int r25 = r4.mo45235k()
            if (r21 != 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r8 = 8
        L_0x0096:
            r7 = 0
        L_0x0097:
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 >= r8) goto L_0x00bd
            byte[] r30 = r4.mo45232h()
            int r32 = r25 + r7
            byte r14 = r30[r32]
            if (r14 == r5) goto L_0x00ba
            if (r21 != 0) goto L_0x00af
            long r7 = r4.mo45217A()
            goto L_0x00b3
        L_0x00af:
            long r7 = r4.mo45218B()
        L_0x00b3:
            r14 = 0
            int r21 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r21 != 0) goto L_0x00c2
            goto L_0x00c0
        L_0x00ba:
            int r7 = r7 + 1
            goto L_0x0097
        L_0x00bd:
            r4.mo45231g(r8)
        L_0x00c0:
            r7 = r28
        L_0x00c2:
            r14 = 16
            r4.mo45231g(r14)
            int r15 = r4.mo45237m()
            int r5 = r4.mo45237m()
            r14 = 4
            r4.mo45231g(r14)
            int r14 = r4.mo45237m()
            int r4 = r4.mo45237m()
            r0 = 65536(0x10000, float:9.18355E-41)
            r25 = r6
            r6 = -65536(0xffffffffffff0000, float:NaN)
            if (r15 != 0) goto L_0x00f4
            if (r5 != r0) goto L_0x00f3
            if (r14 != r6) goto L_0x00f1
            if (r4 != 0) goto L_0x00ec
            r0 = 90
            goto L_0x0113
        L_0x00ec:
            r5 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00f3
        L_0x00f1:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00f3:
            r15 = 0
        L_0x00f4:
            if (r15 != 0) goto L_0x0106
            if (r5 != r6) goto L_0x0103
            if (r14 != r0) goto L_0x00ff
            if (r4 != 0) goto L_0x0100
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0113
        L_0x00ff:
            r0 = r14
        L_0x0100:
            r5 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x0104
        L_0x0103:
            r0 = r14
        L_0x0104:
            r15 = 0
            goto L_0x0107
        L_0x0106:
            r0 = r14
        L_0x0107:
            if (r15 != r6) goto L_0x0112
            if (r5 != 0) goto L_0x0112
            if (r0 != 0) goto L_0x0112
            if (r4 != r6) goto L_0x0112
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0113
        L_0x0112:
            r0 = 0
        L_0x0113:
            com.google.android.gms.internal.ads.zzafe r14 = new com.google.android.gms.internal.ads.zzafe
            r14.<init>(r10, r7, r0)
            int r0 = (r60 > r28 ? 1 : (r60 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0123
            long r4 = r14.f24241b
            r35 = r4
            goto L_0x0125
        L_0x0123:
            r35 = r60
        L_0x0125:
            com.google.android.gms.internal.ads.zzef r0 = r2.f24179b
            r2 = 8
            r0.mo45230f(r2)
            int r4 = r0.mo45237m()
            int r4 = com.google.android.gms.internal.ads.zzaex.m41221a(r4)
            if (r4 != 0) goto L_0x0139
            r8 = 8
            goto L_0x013b
        L_0x0139:
            r8 = 16
        L_0x013b:
            r0.mo45231g(r8)
            long r41 = r0.mo45217A()
            int r0 = (r35 > r28 ? 1 : (r35 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0147
            goto L_0x0152
        L_0x0147:
            r37 = 1000000(0xf4240, double:4.940656E-318)
            r39 = r41
            long r4 = com.google.android.gms.internal.ads.zzen.m49165g0(r35, r37, r39)
            r28 = r4
        L_0x0152:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzaev r2 = r3.mo41415c(r0)
            java.util.Objects.requireNonNull(r2)
            r8 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzaev r2 = r2.mo41415c(r8)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.zzaew r3 = r3.mo41416d(r4)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzef r3 = r3.f24179b
            android.util.Pair r15 = m41246i(r3)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.zzaew r2 = r2.mo41416d(r3)
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.ads.zzef r10 = r2.f24179b
            int r7 = r14.f24240a
            int r6 = r14.f24242c
            java.lang.Object r2 = r15.second
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r4 = 12
            r10.mo45230f(r4)
            int r3 = r10.mo45237m()
            com.google.android.gms.internal.ads.zzafb r2 = new com.google.android.gms.internal.ads.zzafb
            r2.<init>(r3)
            r0 = 0
        L_0x019e:
            if (r0 >= r3) goto L_0x07bf
            r32 = r13
            int r13 = r10.mo45235k()
            int r1 = r10.mo45237m()
            if (r1 <= 0) goto L_0x01ae
            r4 = 1
            goto L_0x01af
        L_0x01ae:
            r4 = 0
        L_0x01af:
            java.lang.String r8 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzm.m55540b(r4, r8)
            int r4 = r10.mo45237m()
            r8 = 1635148593(0x61766331, float:2.840654E20)
            r24 = r3
            r3 = 1701733238(0x656e6376, float:7.035987E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1635148595(0x61766333, float:2.8406544E20)
            if (r4 == r8) goto L_0x03a9
            if (r4 == r3) goto L_0x03a9
            r8 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 == r8) goto L_0x03a9
            r8 = 1836070006(0x6d703476, float:4.646239E27)
            if (r4 == r8) goto L_0x03a9
            r8 = 1752589105(0x68766331, float:4.6541277E24)
            if (r4 == r8) goto L_0x03a9
            r8 = 1751479857(0x68657631, float:4.3344087E24)
            if (r4 == r8) goto L_0x03a9
            r8 = 1932670515(0x73323633, float:1.4119387E31)
            if (r4 == r8) goto L_0x03a9
            r8 = 1211250227(0x48323633, float:182488.8)
            if (r4 == r8) goto L_0x03a9
            r8 = 1987063864(0x76703038, float:1.21789965E33)
            if (r4 == r8) goto L_0x03a9
            r8 = 1987063865(0x76703039, float:1.2178997E33)
            if (r4 == r8) goto L_0x03a9
            r8 = 1635135537(0x61763031, float:2.8383572E20)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685479798(0x64766176, float:1.8179687E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685479729(0x64766131, float:1.817961E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685481573(0x64766865, float:1.8181686E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685481521(0x64766831, float:1.8181627E22)
            if (r4 != r8) goto L_0x020c
            goto L_0x03a9
        L_0x020c:
            r3 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353315(0x64747363, float:1.803728E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353317(0x64747365, float:1.8037282E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353320(0x64747368, float:1.8037286E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353324(0x6474736c, float:1.803729E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353336(0x64747378, float:1.8037304E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r4 == r3) goto L_0x036a
            r3 = 1935767394(0x73617762, float:1.7863284E31)
            if (r4 == r3) goto L_0x036a
            r3 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1936684916(0x736f7774, float:1.89725E31)
            if (r4 == r3) goto L_0x036a
            r3 = 1953984371(0x74776f73, float:7.841539E31)
            if (r4 == r3) goto L_0x036a
            r3 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r4 == r3) goto L_0x036a
            r3 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r4 == r3) goto L_0x036a
            r3 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r4 == r3) goto L_0x036a
            r3 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r4 == r3) goto L_0x036a
            r3 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r4 != r3) goto L_0x028b
            goto L_0x036a
        L_0x028b:
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r4 == r3) goto L_0x02e0
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 == r3) goto L_0x02e0
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 == r3) goto L_0x02e0
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 == r3) goto L_0x02e0
            r3 = 1664495672(0x63363038, float:3.360782E21)
            if (r4 != r3) goto L_0x02a5
            goto L_0x02e0
        L_0x02a5:
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r4 != r3) goto L_0x02b1
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            m41251n(r10, r3, r13, r7, r2)
            goto L_0x02c9
        L_0x02b1:
            r3 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r4 != r3) goto L_0x02c9
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            r3.mo41329g(r7)
            java.lang.String r4 = "application/x-camera-motion"
            r3.mo41343s(r4)
            com.google.android.gms.internal.ads.zzaf r3 = r3.mo41349y()
            r2.f24229b = r3
        L_0x02c9:
            r17 = r0
            r38 = r1
            r4 = r2
            r16 = r5
            r2 = r6
            r1 = r7
            r18 = r9
            r44 = r11
            r40 = r13
            r21 = r14
            r19 = r15
            r14 = r25
            goto L_0x0365
        L_0x02e0:
            int r3 = r13 + 16
            r10.mo45230f(r3)
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 != r3) goto L_0x02f9
            java.lang.String r3 = "application/ttml+xml"
        L_0x02f1:
            r30 = r6
            r22 = r9
            r8 = r35
            r4 = 0
            goto L_0x0335
        L_0x02f9:
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 != r3) goto L_0x0318
            int r3 = r1 + -16
            byte[] r4 = new byte[r3]
            r8 = 0
            r10.mo45226b(r4, r8, r3)
            com.google.android.gms.internal.ads.zzfvn r3 = com.google.android.gms.internal.ads.zzfvn.m51136z(r4)
            java.lang.String r4 = "application/x-quicktime-tx3g"
            r30 = r6
            r22 = r9
            r8 = r35
            r56 = r4
            r4 = r3
            r3 = r56
            goto L_0x0335
        L_0x0318:
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 != r3) goto L_0x0320
            java.lang.String r3 = "application/x-mp4-vtt"
            goto L_0x02f1
        L_0x0320:
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 != r3) goto L_0x032f
            java.lang.String r3 = "application/ttml+xml"
            r30 = r6
            r22 = r9
            r4 = 0
            r8 = 0
            goto L_0x0335
        L_0x032f:
            r8 = 1
            r2.f24231d = r8
            java.lang.String r3 = "application/x-mp4-cea-608"
            goto L_0x02f1
        L_0x0335:
            com.google.android.gms.internal.ads.zzad r6 = new com.google.android.gms.internal.ads.zzad
            r6.<init>()
            r6.mo41329g(r7)
            r6.mo41343s(r3)
            r6.mo41335k(r5)
            r6.mo41347w(r8)
            r6.mo41333i(r4)
            com.google.android.gms.internal.ads.zzaf r3 = r6.mo41349y()
            r2.f24229b = r3
            r17 = r0
            r38 = r1
            r4 = r2
            r16 = r5
            r1 = r7
            r44 = r11
            r40 = r13
            r21 = r14
            r19 = r15
            r18 = r22
            r14 = r25
            r2 = r30
        L_0x0365:
            r3 = 2
            r5 = -1
            r15 = r10
            goto L_0x0799
        L_0x036a:
            r30 = r6
            r22 = r9
            r9 = r2
            r2 = r10
            r3 = r4
            r6 = 12
            r8 = 2
            r4 = r13
            r16 = r5
            r6 = -1
            r5 = r1
            r21 = r14
            r19 = r15
            r14 = r25
            r15 = r30
            r6 = r7
            r43 = r7
            r15 = 16
            r7 = r16
            r8 = r64
            r17 = r9
            r18 = r22
            r9 = r62
            r15 = r10
            r10 = r17
            r44 = r11
            r11 = r0
            m41250m(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r38 = r1
            r40 = r13
            r4 = r17
            r2 = r30
            r1 = r43
            r3 = 2
            r5 = -1
            r17 = r0
            goto L_0x0799
        L_0x03a9:
            r17 = r2
            r16 = r5
            r30 = r6
            r43 = r7
            r18 = r9
            r44 = r11
            r21 = r14
            r19 = r15
            r14 = r25
            r15 = r10
            int r2 = r13 + 16
            r15.mo45230f(r2)
            r2 = 16
            r15.mo45231g(r2)
            int r5 = r15.mo45247w()
            int r6 = r15.mo45247w()
            r7 = 50
            r15.mo45231g(r7)
            int r7 = r15.mo45235k()
            if (r4 != r3) goto L_0x040d
            android.util.Pair r4 = m41247j(r15, r13, r1)
            if (r4 == 0) goto L_0x0403
            java.lang.Object r3 = r4.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r12 != 0) goto L_0x03ed
            r9 = r17
            r8 = 0
            goto L_0x03f9
        L_0x03ed:
            java.lang.Object r8 = r4.second
            com.google.android.gms.internal.ads.zzafw r8 = (com.google.android.gms.internal.ads.zzafw) r8
            java.lang.String r8 = r8.f24349b
            com.google.android.gms.internal.ads.zzx r8 = r12.mo48362b(r8)
            r9 = r17
        L_0x03f9:
            com.google.android.gms.internal.ads.zzafw[] r10 = r9.f24228a
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.zzafw r4 = (com.google.android.gms.internal.ads.zzafw) r4
            r10[r0] = r4
            r4 = r3
            goto L_0x0409
        L_0x0403:
            r9 = r17
            r8 = r12
            r4 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x0409:
            r15.mo45230f(r7)
            goto L_0x0410
        L_0x040d:
            r9 = r17
            r8 = r12
        L_0x0410:
            r3 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 != r3) goto L_0x041d
            java.lang.String r3 = "video/mpeg"
            r56 = r4
            r4 = r3
            r3 = r56
            goto L_0x0427
        L_0x041d:
            r3 = 1211250227(0x48323633, float:182488.8)
            if (r4 != r3) goto L_0x0425
            java.lang.String r4 = "video/3gpp"
            goto L_0x0427
        L_0x0425:
            r3 = r4
            r4 = 0
        L_0x0427:
            r10 = 1065353216(0x3f800000, float:1.0)
            r17 = r0
            r0 = r7
            r36 = r8
            r2 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r10 = -1
            r11 = 0
            r20 = -1
            r22 = -1
            r23 = -1
            r25 = 0
            r26 = 0
            r37 = 0
            r7 = r4
            r4 = 0
        L_0x0441:
            int r12 = r0 - r13
            if (r12 >= r1) goto L_0x0701
            r15.mo45230f(r0)
            int r12 = r15.mo45235k()
            int r38 = r15.mo45237m()
            if (r38 != 0) goto L_0x046a
            int r38 = r15.mo45235k()
            r39 = r10
            int r10 = r38 - r13
            if (r10 != r1) goto L_0x0468
            r38 = r1
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            goto L_0x070d
        L_0x0468:
            r10 = 0
            goto L_0x046e
        L_0x046a:
            r39 = r10
            r10 = r38
        L_0x046e:
            if (r10 <= 0) goto L_0x0476
            r38 = r1
            r40 = r13
            r1 = 1
            goto L_0x047b
        L_0x0476:
            r38 = r1
            r40 = r13
            r1 = 0
        L_0x047b:
            java.lang.String r13 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzm.m55540b(r1, r13)
            int r1 = r15.mo45237m()
            r13 = 1635148611(0x61766343, float:2.8406573E20)
            if (r1 != r13) goto L_0x04b7
            if (r7 != 0) goto L_0x048d
            r1 = 1
            goto L_0x048e
        L_0x048d:
            r1 = 0
        L_0x048e:
            r13 = 0
            com.google.android.gms.internal.ads.zzzm.m55540b(r1, r13)
            int r12 = r12 + 8
            r15.mo45230f(r12)
            com.google.android.gms.internal.ads.zzyn r1 = com.google.android.gms.internal.ads.zzyn.m55435a(r15)
            java.util.List r2 = r1.f38981a
            int r7 = r1.f38982b
            r9.f24230c = r7
            if (r4 != 0) goto L_0x04a5
            float r8 = r1.f38985e
        L_0x04a5:
            java.lang.String r1 = r1.f38986f
            java.lang.String r7 = "video/avc"
        L_0x04a9:
            r37 = r2
            r45 = r3
            r55 = r5
            r50 = r6
            r47 = r9
            r3 = 2
            r2 = r1
            goto L_0x06f0
        L_0x04b7:
            r13 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r13) goto L_0x04dd
            if (r7 != 0) goto L_0x04c0
            r1 = 1
            goto L_0x04c1
        L_0x04c0:
            r1 = 0
        L_0x04c1:
            r2 = 0
            com.google.android.gms.internal.ads.zzzm.m55540b(r1, r2)
            int r12 = r12 + 8
            r15.mo45230f(r12)
            com.google.android.gms.internal.ads.zzzy r1 = com.google.android.gms.internal.ads.zzzy.m55582a(r15)
            java.util.List r2 = r1.f39066a
            int r7 = r1.f39067b
            r9.f24230c = r7
            if (r4 != 0) goto L_0x04d8
            float r8 = r1.f39068c
        L_0x04d8:
            java.lang.String r1 = r1.f39069d
            java.lang.String r7 = "video/hevc"
            goto L_0x04a9
        L_0x04dd:
            r13 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r13) goto L_0x06d1
            r13 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 != r13) goto L_0x04e9
            goto L_0x06d1
        L_0x04e9:
            r13 = 1987076931(0x76706343, float:1.21891066E33)
            if (r1 != r13) goto L_0x0502
            if (r7 != 0) goto L_0x04f2
            r1 = 1
            goto L_0x04f3
        L_0x04f2:
            r1 = 0
        L_0x04f3:
            r7 = 0
            com.google.android.gms.internal.ads.zzzm.m55540b(r1, r7)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r3 != r1) goto L_0x04ff
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x0512
        L_0x04ff:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x0512
        L_0x0502:
            r13 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r13) goto L_0x051e
            if (r7 != 0) goto L_0x050b
            r1 = 1
            goto L_0x050c
        L_0x050b:
            r1 = 0
        L_0x050c:
            r7 = 0
            com.google.android.gms.internal.ads.zzzm.m55540b(r1, r7)
            java.lang.String r1 = "video/av01"
        L_0x0512:
            r7 = r1
        L_0x0513:
            r45 = r3
            r55 = r5
            r50 = r6
            r47 = r9
        L_0x051b:
            r3 = 2
            goto L_0x06f0
        L_0x051e:
            r13 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r1 != r13) goto L_0x0541
            if (r25 != 0) goto L_0x0529
            java.nio.ByteBuffer r25 = m41249l()
        L_0x0529:
            r1 = r25
            r12 = 21
            r1.position(r12)
            short r12 = r15.mo45223G()
            r1.putShort(r12)
            short r12 = r15.mo45223G()
            r1.putShort(r12)
            r25 = r1
            goto L_0x0513
        L_0x0541:
            r13 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r1 != r13) goto L_0x05bc
            if (r25 != 0) goto L_0x054c
            java.nio.ByteBuffer r25 = m41249l()
        L_0x054c:
            r1 = r25
            short r12 = r15.mo45223G()
            short r13 = r15.mo45223G()
            r45 = r3
            short r3 = r15.mo45223G()
            r46 = r4
            short r4 = r15.mo45223G()
            r47 = r9
            short r9 = r15.mo45223G()
            r48 = r11
            short r11 = r15.mo45223G()
            r49 = r8
            short r8 = r15.mo45223G()
            r50 = r6
            short r6 = r15.mo45223G()
            long r51 = r15.mo45217A()
            long r53 = r15.mo45217A()
            r55 = r5
            r5 = 1
            r1.position(r5)
            r1.putShort(r9)
            r1.putShort(r11)
            r1.putShort(r12)
            r1.putShort(r13)
            r1.putShort(r3)
            r1.putShort(r4)
            r1.putShort(r8)
            r1.putShort(r6)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r51 / r3
            int r4 = (int) r3
            short r3 = (short) r4
            r1.putShort(r3)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r53 / r3
            int r4 = (int) r3
            short r3 = (short) r4
            r1.putShort(r3)
            r25 = r1
        L_0x05b4:
            r4 = r46
            r11 = r48
        L_0x05b8:
            r8 = r49
            goto L_0x051b
        L_0x05bc:
            r45 = r3
            r46 = r4
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            r48 = r11
            r3 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r3) goto L_0x05dc
            if (r7 != 0) goto L_0x05d3
            r1 = 1
            goto L_0x05d4
        L_0x05d3:
            r1 = 0
        L_0x05d4:
            r3 = 0
            com.google.android.gms.internal.ads.zzzm.m55540b(r1, r3)
            java.lang.String r1 = "video/3gpp"
            r7 = r1
            goto L_0x05b4
        L_0x05dc:
            r3 = 0
            r4 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r4) goto L_0x0605
            if (r7 != 0) goto L_0x05e6
            r1 = 1
            goto L_0x05e7
        L_0x05e6:
            r1 = 0
        L_0x05e7:
            com.google.android.gms.internal.ads.zzzm.m55540b(r1, r3)
            com.google.android.gms.internal.ads.zzaez r1 = m41248k(r15, r12)
            java.lang.String r3 = r1.f24190a
            byte[] r4 = r1.f24191b
            if (r4 == 0) goto L_0x05fd
            com.google.android.gms.internal.ads.zzfvn r12 = com.google.android.gms.internal.ads.zzfvn.m51136z(r4)
            goto L_0x05ff
        L_0x05fd:
            r12 = r37
        L_0x05ff:
            r26 = r1
            r7 = r3
            r37 = r12
            goto L_0x05b4
        L_0x0605:
            r3 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r3) goto L_0x0621
            int r12 = r12 + 8
            r15.mo45230f(r12)
            int r1 = r15.mo45246v()
            float r1 = (float) r1
            int r3 = r15.mo45246v()
            float r3 = (float) r3
            float r1 = r1 / r3
            r8 = r1
            r11 = r48
            r3 = 2
            r4 = 1
            goto L_0x06f0
        L_0x0621:
            r3 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r3) goto L_0x064e
            int r1 = r12 + 8
        L_0x0628:
            int r3 = r1 - r12
            if (r3 >= r10) goto L_0x0648
            r15.mo45230f(r1)
            int r3 = r15.mo45237m()
            int r4 = r15.mo45237m()
            r5 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r4 != r5) goto L_0x0646
            byte[] r4 = r15.mo45232h()
            int r3 = r3 + r1
            byte[] r8 = java.util.Arrays.copyOfRange(r4, r1, r3)
            goto L_0x0649
        L_0x0646:
            int r1 = r1 + r3
            goto L_0x0628
        L_0x0648:
            r8 = 0
        L_0x0649:
            r11 = r8
            r4 = r46
            goto L_0x05b8
        L_0x064e:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            if (r1 != r3) goto L_0x067b
            int r1 = r15.mo45243s()
            r4 = 3
            r15.mo45231g(r4)
            if (r1 != 0) goto L_0x0674
            int r1 = r15.mo45243s()
            if (r1 == 0) goto L_0x0671
            r3 = 1
            if (r1 == r3) goto L_0x066e
            r3 = 2
            if (r1 == r3) goto L_0x066c
            if (r1 == r4) goto L_0x0677
            goto L_0x0675
        L_0x066c:
            r4 = 2
            goto L_0x0677
        L_0x066e:
            r3 = 2
            r4 = 1
            goto L_0x0677
        L_0x0671:
            r3 = 2
            r4 = 0
            goto L_0x0677
        L_0x0674:
            r3 = 2
        L_0x0675:
            r4 = r39
        L_0x0677:
            r39 = r4
            goto L_0x06ea
        L_0x067b:
            r3 = 2
            r4 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r1 != r4) goto L_0x06ea
            int r1 = r15.mo45237m()
            r4 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 == r4) goto L_0x069e
            r4 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r4) goto L_0x0690
            goto L_0x069e
        L_0x0690:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaex.m41222b(r1)
            java.lang.String r4 = "Unsupported color type: "
            java.lang.String r1 = r4.concat(r1)
            com.google.android.gms.internal.ads.zzdw.m48255e(r14, r1)
            goto L_0x06ea
        L_0x069e:
            int r1 = r15.mo45247w()
            int r4 = r15.mo45247w()
            r15.mo45231g(r3)
            r5 = 19
            if (r10 != r5) goto L_0x06bb
            int r6 = r15.mo45243s()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x06b7
            r5 = 1
            goto L_0x06b8
        L_0x06b7:
            r5 = 0
        L_0x06b8:
            r10 = 19
            goto L_0x06bc
        L_0x06bb:
            r5 = 0
        L_0x06bc:
            int r1 = com.google.android.gms.internal.ads.zzq.m54582a(r1)
            r6 = 1
            if (r6 == r5) goto L_0x06c5
            r5 = 2
            goto L_0x06c6
        L_0x06c5:
            r5 = 1
        L_0x06c6:
            int r4 = com.google.android.gms.internal.ads.zzq.m54583b(r4)
            r23 = r1
            r20 = r4
            r22 = r5
            goto L_0x06ea
        L_0x06d1:
            r45 = r3
            r46 = r4
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            r48 = r11
            r3 = 2
            com.google.android.gms.internal.ads.zzze r1 = com.google.android.gms.internal.ads.zzze.m55505a(r15)
            if (r1 == 0) goto L_0x06ea
            java.lang.String r2 = r1.f39035a
            java.lang.String r7 = "video/dolby-vision"
        L_0x06ea:
            r4 = r46
            r11 = r48
            r8 = r49
        L_0x06f0:
            int r0 = r0 + r10
            r1 = r38
            r10 = r39
            r13 = r40
            r3 = r45
            r9 = r47
            r6 = r50
            r5 = r55
            goto L_0x0441
        L_0x0701:
            r38 = r1
            r55 = r5
            r50 = r6
            r49 = r8
            r47 = r9
            r39 = r10
        L_0x070d:
            r48 = r11
            r40 = r13
            r3 = 2
            if (r7 != 0) goto L_0x071d
            r2 = r30
            r1 = r43
            r4 = r47
            r5 = -1
            goto L_0x0799
        L_0x071d:
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r1 = r43
            r0.mo41329g(r1)
            r0.mo41343s(r7)
            r0.mo41328f0(r2)
            r2 = r55
            r0.mo41348x(r2)
            r2 = r50
            r0.mo41327f(r2)
            r8 = r49
            r0.mo41340p(r8)
            r2 = r30
            r0.mo41342r(r2)
            r11 = r48
            r0.mo41341q(r11)
            r4 = r39
            r0.mo41346v(r4)
            r4 = r37
            r0.mo41333i(r4)
            r8 = r36
            r0.mo41320b(r8)
            r4 = r23
            r5 = -1
            if (r4 != r5) goto L_0x0765
            r6 = r22
            r7 = r20
            if (r6 != r5) goto L_0x0769
            if (r7 != r5) goto L_0x0769
            if (r25 == 0) goto L_0x0779
            goto L_0x0769
        L_0x0765:
            r7 = r20
            r6 = r22
        L_0x0769:
            com.google.android.gms.internal.ads.zzq r8 = new com.google.android.gms.internal.ads.zzq
            if (r25 == 0) goto L_0x0772
            byte[] r9 = r25.array()
            goto L_0x0773
        L_0x0772:
            r9 = 0
        L_0x0773:
            r8.<init>(r4, r6, r7, r9)
            r0.mo41330g0(r8)
        L_0x0779:
            if (r26 == 0) goto L_0x0791
            long r6 = r26.f24192c
            int r4 = com.google.android.gms.internal.ads.zzfxs.m51256c(r6)
            r0.mo41324d0(r4)
            long r6 = r26.f24193d
            int r4 = com.google.android.gms.internal.ads.zzfxs.m51256c(r6)
            r0.mo41339o(r4)
        L_0x0791:
            com.google.android.gms.internal.ads.zzaf r0 = r0.mo41349y()
            r4 = r47
            r4.f24229b = r0
        L_0x0799:
            int r13 = r40 + r38
            r15.mo45230f(r13)
            int r0 = r17 + 1
            r12 = r62
            r7 = r1
            r6 = r2
            r2 = r4
            r25 = r14
            r10 = r15
            r5 = r16
            r9 = r18
            r15 = r19
            r14 = r21
            r3 = r24
            r13 = r32
            r11 = r44
            r4 = 12
            r8 = 1937007212(0x7374626c, float:1.9362132E31)
            r1 = r59
            goto L_0x019e
        L_0x07bf:
            r4 = r2
            r18 = r9
            r44 = r11
            r32 = r13
            r21 = r14
            r19 = r15
            r14 = r25
            r3 = 2
            r5 = -1
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r44
            com.google.android.gms.internal.ads.zzaev r0 = r2.mo41415c(r0)
            if (r0 == 0) goto L_0x07ea
            android.util.Pair r0 = m41245h(r0)
            if (r0 == 0) goto L_0x07ea
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r30 = r0
            goto L_0x07ed
        L_0x07ea:
            r1 = 0
            r30 = 0
        L_0x07ed:
            com.google.android.gms.internal.ads.zzaf r0 = r4.f24229b
            if (r0 != 0) goto L_0x07f5
            r0 = r65
            goto L_0x005f
        L_0x07f5:
            com.google.android.gms.internal.ads.zzafv r8 = new com.google.android.gms.internal.ads.zzafv
            int r17 = r21.f24240a
            r0 = r19
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r19 = r0.longValue()
            com.google.android.gms.internal.ads.zzaf r0 = r4.f24229b
            int r6 = r4.f24231d
            com.google.android.gms.internal.ads.zzafw[] r7 = r4.f24228a
            int r4 = r4.f24230c
            r16 = r8
            r21 = r41
            r23 = r28
            r25 = r0
            r26 = r6
            r27 = r7
            r28 = r4
            r29 = r1
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r0 = r65
        L_0x0822:
            java.lang.Object r1 = r0.apply(r8)
            com.google.android.gms.internal.ads.zzafv r1 = (com.google.android.gms.internal.ads.zzafv) r1
            if (r1 == 0) goto L_0x0e0c
            r4 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzaev r2 = r2.mo41415c(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzaev r2 = r2.mo41415c(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzaev r2 = r2.mo41415c(r4)
            java.util.Objects.requireNonNull(r2)
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.zzaew r4 = r2.mo41416d(r4)
            if (r4 == 0) goto L_0x0859
            com.google.android.gms.internal.ads.zzafc r6 = new com.google.android.gms.internal.ads.zzafc
            com.google.android.gms.internal.ads.zzaf r7 = r1.f24342f
            r6.<init>(r4, r7)
            goto L_0x0867
        L_0x0859:
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.zzaew r4 = r2.mo41416d(r4)
            if (r4 == 0) goto L_0x0e04
            com.google.android.gms.internal.ads.zzafd r6 = new com.google.android.gms.internal.ads.zzafd
            r6.<init>(r4)
        L_0x0867:
            int r4 = r6.zzb()
            if (r4 != 0) goto L_0x088e
            com.google.android.gms.internal.ads.zzafy r2 = new com.google.android.gms.internal.ads.zzafy
            r3 = 0
            long[] r4 = new long[r3]
            int[] r5 = new int[r3]
            r19 = 0
            long[] r6 = new long[r3]
            int[] r7 = new int[r3]
            r22 = 0
            r15 = r2
            r16 = r1
            r17 = r4
            r18 = r5
            r20 = r6
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x088a:
            r0 = r32
            goto L_0x0e00
        L_0x088e:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.zzaew r7 = r2.mo41416d(r7)
            if (r7 != 0) goto L_0x08a4
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.zzaew r7 = r2.mo41416d(r7)
            java.util.Objects.requireNonNull(r7)
            r8 = r7
            r7 = 1
            goto L_0x08a6
        L_0x08a4:
            r8 = r7
            r7 = 0
        L_0x08a6:
            com.google.android.gms.internal.ads.zzef r8 = r8.f24179b
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.zzaew r9 = r2.mo41416d(r9)
            java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.ads.zzef r9 = r9.f24179b
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.zzaew r10 = r2.mo41416d(r10)
            java.util.Objects.requireNonNull(r10)
            com.google.android.gms.internal.ads.zzef r10 = r10.f24179b
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.zzaew r11 = r2.mo41416d(r11)
            if (r11 == 0) goto L_0x08cc
            com.google.android.gms.internal.ads.zzef r11 = r11.f24179b
            goto L_0x08cd
        L_0x08cc:
            r11 = 0
        L_0x08cd:
            r12 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.zzaew r2 = r2.mo41416d(r12)
            if (r2 == 0) goto L_0x08d9
            com.google.android.gms.internal.ads.zzef r2 = r2.f24179b
            goto L_0x08da
        L_0x08d9:
            r2 = 0
        L_0x08da:
            com.google.android.gms.internal.ads.zzaey r12 = new com.google.android.gms.internal.ads.zzaey
            r12.<init>(r9, r8, r7)
            r7 = 12
            r10.mo45230f(r7)
            int r8 = r10.mo45246v()
            int r8 = r8 + r5
            int r9 = r10.mo45246v()
            int r13 = r10.mo45246v()
            if (r2 == 0) goto L_0x08fb
            r2.mo45230f(r7)
            int r15 = r2.mo45246v()
            goto L_0x08fc
        L_0x08fb:
            r15 = 0
        L_0x08fc:
            if (r11 == 0) goto L_0x0910
            r11.mo45230f(r7)
            int r7 = r11.mo45246v()
            if (r7 <= 0) goto L_0x090e
            int r16 = r11.mo45246v()
            int r16 = r16 + -1
            goto L_0x0913
        L_0x090e:
            r11 = 0
            goto L_0x0911
        L_0x0910:
            r7 = 0
        L_0x0911:
            r16 = -1
        L_0x0913:
            int r3 = r6.zza()
            com.google.android.gms.internal.ads.zzaf r0 = r1.f24342f
            java.lang.String r0 = r0.f24213l
            if (r3 == r5) goto L_0x09bf
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0935
            java.lang.String r5 = "audio/g711-mlaw"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0935
            java.lang.String r5 = "audio/g711-alaw"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x09bf
        L_0x0935:
            if (r8 != 0) goto L_0x09bf
            if (r15 != 0) goto L_0x09be
            if (r7 != 0) goto L_0x09be
            int r0 = r12.f24181a
            long[] r2 = new long[r0]
            int[] r5 = new int[r0]
        L_0x0941:
            boolean r6 = r12.mo41420a()
            if (r6 == 0) goto L_0x0952
            int r6 = r12.f24182b
            long r7 = r12.f24184d
            r2[r6] = r7
            int r7 = r12.f24183c
            r5[r6] = r7
            goto L_0x0941
        L_0x0952:
            long r6 = (long) r13
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r3
            r9 = 0
            r10 = 0
        L_0x0958:
            if (r9 >= r0) goto L_0x0964
            r11 = r5[r9]
            int r11 = com.google.android.gms.internal.ads.zzen.m49140O(r11, r8)
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L_0x0958
        L_0x0964:
            long[] r9 = new long[r10]
            int[] r11 = new int[r10]
            long[] r12 = new long[r10]
            int[] r10 = new int[r10]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0971:
            if (r13 >= r0) goto L_0x09b2
            r17 = r5[r13]
            r20 = r2[r13]
            r56 = r17
            r17 = r0
            r0 = r56
        L_0x097d:
            if (r0 <= 0) goto L_0x09a9
            int r18 = java.lang.Math.min(r8, r0)
            r9[r16] = r20
            r22 = r2
            int r2 = r3 * r18
            r11[r16] = r2
            int r15 = java.lang.Math.max(r15, r2)
            r23 = r3
            long r2 = (long) r14
            long r2 = r2 * r6
            r12[r16] = r2
            r2 = 1
            r10[r16] = r2
            r2 = r11[r16]
            long r2 = (long) r2
            long r20 = r20 + r2
            int r14 = r14 + r18
            int r0 = r0 - r18
            int r16 = r16 + 1
            r2 = r22
            r3 = r23
            goto L_0x097d
        L_0x09a9:
            r22 = r2
            r23 = r3
            int r13 = r13 + 1
            r0 = r17
            goto L_0x0971
        L_0x09b2:
            long r2 = (long) r14
            long r6 = r6 * r2
            r2 = r9
            r14 = r10
            r3 = r11
            r13 = r12
            r12 = r15
            r15 = r1
            r0 = r6
            goto L_0x0b6b
        L_0x09be:
            r8 = 0
        L_0x09bf:
            long[] r0 = new long[r4]
            int[] r3 = new int[r4]
            long[] r5 = new long[r4]
            r17 = r7
            int[] r7 = new int[r4]
            r22 = r1
            r18 = r9
            r1 = r13
            r23 = r15
            r15 = r16
            r9 = 0
            r13 = 0
            r20 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r16 = r8
            r8 = 0
        L_0x09df:
            if (r8 >= r4) goto L_0x0aa1
            r29 = r25
            r25 = 1
        L_0x09e5:
            if (r20 != 0) goto L_0x0a0a
            boolean r25 = r12.mo41420a()
            if (r25 == 0) goto L_0x0a02
            r26 = r10
            r36 = r11
            long r10 = r12.f24184d
            r37 = r4
            int r4 = r12.f24183c
            r20 = r4
            r29 = r10
            r10 = r26
            r11 = r36
            r4 = r37
            goto L_0x09e5
        L_0x0a02:
            r37 = r4
            r26 = r10
            r36 = r11
            r4 = 0
            goto L_0x0a12
        L_0x0a0a:
            r37 = r4
            r26 = r10
            r36 = r11
            r4 = r20
        L_0x0a12:
            if (r25 != 0) goto L_0x0a2c
            java.lang.String r1 = "Unexpected end of chunk data"
            com.google.android.gms.internal.ads.zzdw.m48255e(r14, r1)
            long[] r0 = java.util.Arrays.copyOf(r0, r8)
            int[] r3 = java.util.Arrays.copyOf(r3, r8)
            long[] r5 = java.util.Arrays.copyOf(r5, r8)
            int[] r7 = java.util.Arrays.copyOf(r7, r8)
            r4 = r8
            goto L_0x0aa3
        L_0x0a2c:
            if (r2 == 0) goto L_0x0a44
        L_0x0a2e:
            if (r24 != 0) goto L_0x0a41
            if (r23 <= 0) goto L_0x0a3d
            int r24 = r2.mo45246v()
            int r13 = r2.mo45237m()
            int r23 = r23 + -1
            goto L_0x0a2e
        L_0x0a3d:
            r10 = -1
            r24 = 0
            goto L_0x0a42
        L_0x0a41:
            r10 = -1
        L_0x0a42:
            int r24 = r24 + -1
        L_0x0a44:
            r0[r8] = r29
            int r10 = r6.mo41428a()
            r3[r8] = r10
            if (r10 <= r9) goto L_0x0a4f
            r9 = r10
        L_0x0a4f:
            long r10 = (long) r13
            long r10 = r27 + r10
            r5[r8] = r10
            if (r36 != 0) goto L_0x0a58
            r10 = 1
            goto L_0x0a59
        L_0x0a58:
            r10 = 0
        L_0x0a59:
            r7[r8] = r10
            if (r8 != r15) goto L_0x0a6e
            r10 = 1
            r7[r8] = r10
            int r17 = r17 + -1
            if (r17 <= 0) goto L_0x0a6e
            java.util.Objects.requireNonNull(r36)
            int r10 = r36.mo45246v()
            r11 = -1
            int r10 = r10 + r11
            r15 = r10
        L_0x0a6e:
            long r10 = (long) r1
            long r27 = r27 + r10
            int r10 = r18 + -1
            if (r10 != 0) goto L_0x0a88
            if (r16 <= 0) goto L_0x0a85
            int r1 = r26.mo45246v()
            int r10 = r26.mo45237m()
            int r16 = r16 + -1
            r18 = r1
            r1 = r10
            goto L_0x0a8a
        L_0x0a85:
            r18 = 0
            goto L_0x0a8a
        L_0x0a88:
            r18 = r10
        L_0x0a8a:
            r10 = r3[r8]
            long r10 = (long) r10
            long r10 = r29 + r10
            r21 = -1
            int r20 = r4 + -1
            int r8 = r8 + 1
            r4 = r37
            r56 = r10
            r10 = r26
            r25 = r56
            r11 = r36
            goto L_0x09df
        L_0x0aa1:
            r37 = r4
        L_0x0aa3:
            long r10 = (long) r13
            long r10 = r27 + r10
            if (r2 == 0) goto L_0x0ab8
        L_0x0aa8:
            if (r23 <= 0) goto L_0x0ab8
            int r1 = r2.mo45246v()
            if (r1 == 0) goto L_0x0ab2
            r1 = 0
            goto L_0x0ab9
        L_0x0ab2:
            r2.mo45237m()
            int r23 = r23 + -1
            goto L_0x0aa8
        L_0x0ab8:
            r1 = 1
        L_0x0ab9:
            if (r17 != 0) goto L_0x0b06
            if (r18 != 0) goto L_0x0afa
            if (r20 != 0) goto L_0x0aef
            if (r16 != 0) goto L_0x0ae5
            if (r24 != 0) goto L_0x0ada
            if (r1 != 0) goto L_0x0ad0
            r16 = r0
            r15 = r22
            r1 = 0
            r2 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            r13 = 0
            goto L_0x0b14
        L_0x0ad0:
            r16 = r0
            r17 = r3
            r18 = r4
            r15 = r22
            goto L_0x0b61
        L_0x0ada:
            r16 = r0
            r15 = r22
            r13 = r24
            r2 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            goto L_0x0b14
        L_0x0ae5:
            r12 = r16
            r15 = r22
            r13 = r24
            r2 = 0
            r6 = 0
            r8 = 0
            goto L_0x0b12
        L_0x0aef:
            r12 = r16
            r8 = r20
            r15 = r22
            r13 = r24
            r2 = 0
            r6 = 0
            goto L_0x0b12
        L_0x0afa:
            r12 = r16
            r6 = r18
            r8 = r20
            r15 = r22
            r13 = r24
            r2 = 0
            goto L_0x0b12
        L_0x0b06:
            r12 = r16
            r2 = r17
            r6 = r18
            r8 = r20
            r15 = r22
            r13 = r24
        L_0x0b12:
            r16 = r0
        L_0x0b14:
            int r0 = r15.f24337a
            r17 = r3
            r3 = 1
            if (r3 == r1) goto L_0x0b1e
            java.lang.String r1 = ", ctts invalid"
            goto L_0x0b20
        L_0x0b1e:
            java.lang.String r1 = ""
        L_0x0b20:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r18 = r4
            java.lang.String r4 = "Inconsistent stbl box for track "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ": remainingSynchronizationSamples "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r3.append(r0)
            r3.append(r8)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r3.append(r0)
            r3.append(r13)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r14, r0)
        L_0x0b61:
            r13 = r5
            r14 = r7
            r12 = r9
            r0 = r10
            r2 = r16
            r3 = r17
            r4 = r18
        L_0x0b6b:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r15.f24339c
            r5 = r0
            long r22 = com.google.android.gms.internal.ads.zzen.m49165g0(r5, r7, r9)
            long[] r5 = r15.f24344h
            if (r5 != 0) goto L_0x0b97
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r15.f24339c
            com.google.android.gms.internal.ads.zzen.m49179r(r13, r0, r4)
            com.google.android.gms.internal.ads.zzafy r0 = new com.google.android.gms.internal.ads.zzafy
            r10 = r15
            r15 = r0
            r16 = r10
            r17 = r2
            r18 = r3
            r19 = r12
            r20 = r13
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x0b94:
            r2 = r0
            goto L_0x088a
        L_0x0b97:
            r10 = r15
            int r6 = r5.length
            r7 = 1
            if (r6 != r7) goto L_0x0c3e
            int r6 = r10.f24338b
            if (r6 != r7) goto L_0x0c3e
            int r6 = r13.length
            r7 = 2
            if (r6 < r7) goto L_0x0c3e
            long[] r6 = r10.f24345i
            java.util.Objects.requireNonNull(r6)
            r7 = 0
            r15 = r6[r7]
            r17 = r5[r7]
            long r5 = r10.f24339c
            long r7 = r10.f24340d
            r19 = r5
            r21 = r7
            long r5 = com.google.android.gms.internal.ads.zzen.m49165g0(r17, r19, r21)
            long r17 = r15 + r5
            r5 = r13
            r6 = r0
            r8 = r15
            r19 = r4
            r4 = r10
            r10 = r17
            boolean r5 = m41252o(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x0c3b
            r5 = 0
            r6 = r13[r5]
            long r20 = r15 - r6
            com.google.android.gms.internal.ads.zzaf r5 = r4.f24342f
            int r5 = r5.f24227z
            long r5 = (long) r5
            long r7 = r4.f24339c
            r22 = r5
            r24 = r7
            long r5 = com.google.android.gms.internal.ads.zzen.m49165g0(r20, r22, r24)
            long r20 = r0 - r17
            com.google.android.gms.internal.ads.zzaf r7 = r4.f24342f
            int r7 = r7.f24227z
            long r7 = (long) r7
            long r9 = r4.f24339c
            r22 = r7
            r24 = r9
            long r7 = com.google.android.gms.internal.ads.zzen.m49165g0(r20, r22, r24)
            r9 = 0
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x0bfb
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0c3b
            r5 = 0
        L_0x0bfb:
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0c3b
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0c3b
            int r0 = (int) r5
            r5 = r59
            r5.f39064a = r0
            int r0 = (int) r7
            r5.f39065b = r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r4.f24339c
            com.google.android.gms.internal.ads.zzen.m49179r(r13, r0, r6)
            long[] r0 = r4.f24344h
            r1 = 0
            r6 = r0[r1]
            long r10 = r4.f24340d
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r22 = com.google.android.gms.internal.ads.zzen.m49165g0(r6, r8, r10)
            com.google.android.gms.internal.ads.zzafy r0 = new com.google.android.gms.internal.ads.zzafy
            r15 = r0
            r16 = r4
            r17 = r2
            r18 = r3
            r19 = r12
            r20 = r13
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0b94
        L_0x0c3b:
            r5 = r59
            goto L_0x0c43
        L_0x0c3e:
            r5 = r59
            r19 = r4
            r4 = r10
        L_0x0c43:
            long[] r6 = r4.f24344h
            int r7 = r6.length
            r8 = 1
            if (r7 != r8) goto L_0x0c93
            r8 = 0
            r9 = r6[r8]
            r6 = 0
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x0c92
            long[] r6 = r4.f24345i
            java.util.Objects.requireNonNull(r6)
            r9 = r6[r8]
            r8 = 0
        L_0x0c5a:
            int r6 = r13.length
            if (r8 >= r6) goto L_0x0c71
            r6 = r13[r8]
            long r15 = r6 - r9
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r4.f24339c
            r19 = r6
            long r6 = com.google.android.gms.internal.ads.zzen.m49165g0(r15, r17, r19)
            r13[r8] = r6
            int r8 = r8 + 1
            goto L_0x0c5a
        L_0x0c71:
            long r6 = r4.f24339c
            long r15 = r0 - r9
            r17 = 1000000(0xf4240, double:4.940656E-318)
            r19 = r6
            long r22 = com.google.android.gms.internal.ads.zzen.m49165g0(r15, r17, r19)
            com.google.android.gms.internal.ads.zzafy r0 = new com.google.android.gms.internal.ads.zzafy
            r15 = r0
            r16 = r4
            r17 = r2
            r18 = r3
            r19 = r12
            r20 = r13
            r21 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0b94
        L_0x0c92:
            r7 = 1
        L_0x0c93:
            int r0 = r4.f24338b
            r1 = 1
            if (r0 != r1) goto L_0x0c9a
            r0 = 1
            goto L_0x0c9b
        L_0x0c9a:
            r0 = 0
        L_0x0c9b:
            int[] r1 = new int[r7]
            int[] r6 = new int[r7]
            long[] r7 = r4.f24345i
            java.util.Objects.requireNonNull(r7)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0ca8:
            long[] r15 = r4.f24344h
            int r5 = r15.length
            if (r8 >= r5) goto L_0x0d14
            r5 = r2
            r16 = r3
            r2 = r7[r8]
            r17 = -1
            int r20 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r20 == 0) goto L_0x0cfe
            r21 = r15[r8]
            r17 = r11
            r15 = r12
            long r11 = r4.f24339c
            r18 = r9
            r20 = r10
            long r9 = r4.f24340d
            r23 = r11
            r25 = r9
            long r9 = com.google.android.gms.internal.ads.zzen.m49165g0(r21, r23, r25)
            r11 = 1
            int r12 = com.google.android.gms.internal.ads.zzen.m49139N(r13, r2, r11, r11)
            r1[r8] = r12
            long r2 = r2 + r9
            r9 = 0
            int r2 = com.google.android.gms.internal.ads.zzen.m49137L(r13, r2, r0, r9)
            r6[r8] = r2
        L_0x0cdc:
            r2 = r1[r8]
            r3 = r6[r8]
            if (r2 >= r3) goto L_0x0ced
            r10 = r14[r2]
            r10 = r10 & r11
            if (r10 != 0) goto L_0x0ced
            int r2 = r2 + 1
            r1[r8] = r2
            r11 = 1
            goto L_0x0cdc
        L_0x0ced:
            int r10 = r3 - r2
            int r10 = r18 + r10
            r11 = r20
            if (r11 == r2) goto L_0x0cf7
            r2 = 1
            goto L_0x0cf8
        L_0x0cf7:
            r2 = 0
        L_0x0cf8:
            r2 = r17 | r2
            r17 = r2
            r11 = r3
            goto L_0x0d07
        L_0x0cfe:
            r18 = r9
            r17 = r11
            r15 = r12
            r9 = 0
            r11 = r10
            r10 = r18
        L_0x0d07:
            int r8 = r8 + 1
            r2 = r5
            r9 = r10
            r10 = r11
            r12 = r15
            r3 = r16
            r11 = r17
            r5 = r59
            goto L_0x0ca8
        L_0x0d14:
            r5 = r2
            r16 = r3
            r10 = r9
            r17 = r11
            r15 = r12
            r2 = r19
            r9 = 0
            if (r10 == r2) goto L_0x0d22
            r7 = 1
            goto L_0x0d23
        L_0x0d22:
            r7 = 0
        L_0x0d23:
            r0 = r17 | r7
            if (r0 == 0) goto L_0x0d2a
            long[] r2 = new long[r10]
            goto L_0x0d2b
        L_0x0d2a:
            r2 = r5
        L_0x0d2b:
            if (r0 == 0) goto L_0x0d30
            int[] r3 = new int[r10]
            goto L_0x0d32
        L_0x0d30:
            r3 = r16
        L_0x0d32:
            r7 = 1
            if (r7 != r0) goto L_0x0d37
            r8 = 0
            goto L_0x0d38
        L_0x0d37:
            r8 = r15
        L_0x0d38:
            if (r0 == 0) goto L_0x0d3d
            int[] r7 = new int[r10]
            goto L_0x0d3e
        L_0x0d3d:
            r7 = r14
        L_0x0d3e:
            long[] r10 = new long[r10]
            r12 = r8
            r8 = 0
            r11 = 0
            r23 = 0
        L_0x0d45:
            long[] r15 = r4.f24344h
            int r15 = r15.length
            if (r8 >= r15) goto L_0x0ddb
            long[] r15 = r4.f24345i
            r25 = r15[r8]
            r15 = r1[r8]
            r9 = r6[r8]
            if (r0 == 0) goto L_0x0d66
            r27 = r1
            int r1 = r9 - r15
            java.lang.System.arraycopy(r5, r15, r2, r11, r1)
            r28 = r5
            r5 = r16
            java.lang.System.arraycopy(r5, r15, r3, r11, r1)
            java.lang.System.arraycopy(r14, r15, r7, r11, r1)
            goto L_0x0d6c
        L_0x0d66:
            r27 = r1
            r28 = r5
            r5 = r16
        L_0x0d6c:
            if (r15 >= r9) goto L_0x0db6
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r1 = r6
            r29 = r7
            long r6 = r4.f24340d
            r17 = r23
            r21 = r6
            long r6 = com.google.android.gms.internal.ads.zzen.m49165g0(r17, r19, r21)
            r16 = r13[r15]
            r18 = r13
            r19 = r14
            long r13 = r16 - r25
            r16 = r1
            r30 = r2
            r1 = 0
            long r33 = java.lang.Math.max(r1, r13)
            r35 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r4.f24339c
            r37 = r13
            long r13 = com.google.android.gms.internal.ads.zzen.m49165g0(r33, r35, r37)
            long r6 = r6 + r13
            r10[r11] = r6
            if (r0 == 0) goto L_0x0da7
            r6 = r3[r11]
            if (r6 <= r12) goto L_0x0da7
            r6 = r5[r15]
            r12 = r6
        L_0x0da7:
            int r11 = r11 + 1
            int r15 = r15 + 1
            r6 = r16
            r13 = r18
            r14 = r19
            r7 = r29
            r2 = r30
            goto L_0x0d6c
        L_0x0db6:
            r30 = r2
            r16 = r6
            r29 = r7
            r18 = r13
            r19 = r14
            r1 = 0
            long[] r6 = r4.f24344h
            r13 = r6[r8]
            long r23 = r23 + r13
            int r8 = r8 + 1
            r6 = r16
            r13 = r18
            r14 = r19
            r1 = r27
            r2 = r30
            r9 = 0
            r16 = r5
            r5 = r28
            goto L_0x0d45
        L_0x0ddb:
            r30 = r2
            r29 = r7
            long r0 = r4.f24340d
            r19 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r23
            r21 = r0
            long r22 = com.google.android.gms.internal.ads.zzen.m49165g0(r17, r19, r21)
            com.google.android.gms.internal.ads.zzafy r2 = new com.google.android.gms.internal.ads.zzafy
            r15 = r2
            r16 = r4
            r17 = r30
            r18 = r3
            r19 = r12
            r20 = r10
            r21 = r29
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x088a
        L_0x0e00:
            r0.add(r2)
            goto L_0x0e0e
        L_0x0e04:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r1)
            throw r0
        L_0x0e0c:
            r0 = r32
        L_0x0e0e:
            int r15 = r31 + 1
            r1 = r59
            r12 = r62
            r13 = r0
            r0 = r58
            goto L_0x000c
        L_0x0e19:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.m41240c(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzzx, long, com.google.android.gms.internal.ads.zzx, boolean, boolean, com.google.android.gms.internal.ads.zzfsm):java.util.List");
    }

    /* renamed from: d */
    public static void m41241d(zzef zzef) {
        int k = zzef.mo45235k();
        zzef.mo45231g(4);
        if (zzef.mo45237m() != 1751411826) {
            k += 4;
        }
        zzef.mo45230f(k);
    }

    /* renamed from: e */
    private static int m41242e(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: f */
    private static int m41243f(zzef zzef) {
        int s = zzef.mo45243s();
        int i = s & 127;
        while ((s & 128) == 128) {
            s = zzef.mo45243s();
            i = (i << 7) | (s & 127);
        }
        return i;
    }

    /* renamed from: g */
    private static int m41244g(zzef zzef) {
        zzef.mo45230f(16);
        return zzef.mo45237m();
    }

    @Nullable
    /* renamed from: h */
    private static Pair m41245h(zzaev zzaev) {
        zzaew d = zzaev.mo41416d(1701606260);
        if (d == null) {
            return null;
        }
        zzef zzef = d.f24179b;
        zzef.mo45230f(8);
        int a = zzaex.m41221a(zzef.mo45237m());
        int v = zzef.mo45246v();
        long[] jArr = new long[v];
        long[] jArr2 = new long[v];
        int i = 0;
        while (i < v) {
            jArr[i] = a == 1 ? zzef.mo45218B() : zzef.mo45217A();
            jArr2[i] = a == 1 ? zzef.mo45250z() : (long) zzef.mo45237m();
            if (zzef.mo45223G() == 1) {
                zzef.mo45231g(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: i */
    private static Pair m41246i(zzef zzef) {
        int i = 8;
        zzef.mo45230f(8);
        int a = zzaex.m41221a(zzef.mo45237m());
        zzef.mo45231g(a == 0 ? 8 : 16);
        long A = zzef.mo45217A();
        if (a == 0) {
            i = 4;
        }
        zzef.mo45231g(i);
        int w = zzef.mo45247w();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((w >> 10) & 31) + 96));
        sb.append((char) (((w >> 5) & 31) + 96));
        sb.append((char) ((w & 31) + 96));
        return Pair.create(Long.valueOf(A), sb.toString());
    }

    @Nullable
    /* renamed from: j */
    private static Pair m41247j(zzef zzef, int i, int i2) throws zzbu {
        Pair pair;
        Integer num;
        zzafw zzafw;
        int i3;
        int i4;
        byte[] bArr;
        zzef zzef2 = zzef;
        int k = zzef.mo45235k();
        while (k - i < i2) {
            zzef2.mo45230f(k);
            int m = zzef.mo45237m();
            boolean z = true;
            zzzm.m55540b(m > 0, "childAtomSize must be positive");
            if (zzef.mo45237m() == 1936289382) {
                int i5 = k + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - k < m) {
                    zzef2.mo45230f(i5);
                    int m2 = zzef.mo45237m();
                    int m3 = zzef.mo45237m();
                    if (m3 == 1718775137) {
                        num2 = Integer.valueOf(zzef.mo45237m());
                    } else if (m3 == 1935894637) {
                        zzef2.mo45231g(4);
                        str = zzef2.mo45222F(4, zzfsk.f36339c);
                    } else if (m3 == 1935894633) {
                        i6 = i5;
                        i7 = m2;
                    }
                    i5 += m2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzzm.m55540b(num2 != null, "frma atom is mandatory");
                    zzzm.m55540b(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzafw = null;
                            break;
                        }
                        zzef2.mo45230f(i8);
                        int m4 = zzef.mo45237m();
                        if (zzef.mo45237m() == 1952804451) {
                            int m5 = zzef.mo45237m();
                            zzef2.mo45231g(1);
                            if (zzaex.m41221a(m5) == 0) {
                                zzef2.mo45231g(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int s = zzef.mo45243s();
                                i4 = s & 15;
                                i3 = (s & 240) >> 4;
                            }
                            boolean z2 = zzef.mo45243s() == 1;
                            int s2 = zzef.mo45243s();
                            byte[] bArr2 = new byte[16];
                            zzef2.mo45226b(bArr2, 0, 16);
                            if (!z2 || s2 != 0) {
                                bArr = null;
                            } else {
                                int s3 = zzef.mo45243s();
                                byte[] bArr3 = new byte[s3];
                                zzef2.mo45226b(bArr3, 0, s3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzafw = new zzafw(z2, str, s2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += m4;
                        }
                    }
                    if (zzafw == null) {
                        z = false;
                    }
                    zzzm.m55540b(z, "tenc atom is mandatory");
                    int i9 = zzen.f34500a;
                    pair = Pair.create(num, zzafw);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            k += m;
        }
        return null;
    }

    /* renamed from: k */
    private static zzaez m41248k(zzef zzef, int i) {
        zzef.mo45230f(i + 12);
        zzef.mo45231g(1);
        m41243f(zzef);
        zzef.mo45231g(2);
        int s = zzef.mo45243s();
        if ((s & 128) != 0) {
            zzef.mo45231g(2);
        }
        if ((s & 64) != 0) {
            zzef.mo45231g(zzef.mo45243s());
        }
        if ((s & 32) != 0) {
            zzef.mo45231g(2);
        }
        zzef.mo45231g(1);
        m41243f(zzef);
        String d = zzbt.m44091d(zzef.mo45243s());
        if ("audio/mpeg".equals(d) || "audio/vnd.dts".equals(d) || "audio/vnd.dts.hd".equals(d)) {
            return new zzaez(d, (byte[]) null, -1, -1);
        }
        zzef.mo45231g(4);
        long A = zzef.mo45217A();
        long A2 = zzef.mo45217A();
        zzef.mo45231g(1);
        int f = m41243f(zzef);
        byte[] bArr = new byte[f];
        zzef.mo45226b(bArr, 0, f);
        return new zzaez(d, bArr, A2 <= 0 ? -1 : A2, A > 0 ? A : -1);
    }

    /* renamed from: l */
    private static ByteBuffer m41249l() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARNING: Removed duplicated region for block: B:169:0x039c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016b  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m41250m(com.google.android.gms.internal.ads.zzef r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzx r31, com.google.android.gms.internal.ads.zzafb r32, int r33) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r0 = r24
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r31
            r6 = r32
            int r7 = r1 + 16
            r0.mo45230f(r7)
            r7 = 6
            if (r30 == 0) goto L_0x001e
            int r9 = r24.mo45247w()
            r0.mo45231g(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.mo45231g(r9)
            r9 = 0
        L_0x0024:
            r10 = 20
            r11 = 16
            r12 = 2
            r13 = 1
            if (r9 == 0) goto L_0x004b
            if (r9 != r13) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            if (r9 != r12) goto L_0x004a
            r0.mo45231g(r11)
            long r14 = r24.mo45250z()
            double r14 = java.lang.Double.longBitsToDouble(r14)
            long r14 = java.lang.Math.round(r14)
            int r7 = (int) r14
            int r9 = r24.mo45246v()
            r0.mo45231g(r10)
            r15 = 0
            goto L_0x0069
        L_0x004a:
            return
        L_0x004b:
            int r14 = r24.mo45247w()
            r0.mo45231g(r7)
            int r7 = r24.mo45244t()
            int r15 = r24.mo45235k()
            int r15 = r15 + -4
            r0.mo45230f(r15)
            int r15 = r24.mo45237m()
            if (r9 != r13) goto L_0x0068
            r0.mo45231g(r11)
        L_0x0068:
            r9 = r14
        L_0x0069:
            int r11 = r24.mo45235k()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r12 = r25
            if (r12 != r14) goto L_0x009c
            android.util.Pair r12 = m41247j(r0, r1, r2)
            if (r12 == 0) goto L_0x0098
            java.lang.Object r14 = r12.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r5 != 0) goto L_0x0086
            r5 = 0
            goto L_0x0090
        L_0x0086:
            java.lang.Object r13 = r12.second
            com.google.android.gms.internal.ads.zzafw r13 = (com.google.android.gms.internal.ads.zzafw) r13
            java.lang.String r13 = r13.f24349b
            com.google.android.gms.internal.ads.zzx r5 = r5.mo48362b(r13)
        L_0x0090:
            com.google.android.gms.internal.ads.zzafw[] r13 = r6.f24228a
            java.lang.Object r12 = r12.second
            com.google.android.gms.internal.ads.zzafw r12 = (com.google.android.gms.internal.ads.zzafw) r12
            r13[r33] = r12
        L_0x0098:
            r0.mo45230f(r11)
            r12 = r14
        L_0x009c:
            r13 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r19 = "audio/raw"
            java.lang.String r10 = "audio/ac4"
            if (r12 != r13) goto L_0x00ad
            java.lang.String r19 = "audio/ac3"
        L_0x00aa:
            r12 = -1
            goto L_0x015f
        L_0x00ad:
            r13 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r13) goto L_0x00b5
            java.lang.String r19 = "audio/eac3"
            goto L_0x00aa
        L_0x00b5:
            r13 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r13) goto L_0x00bd
            r19 = r10
            goto L_0x00aa
        L_0x00bd:
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r13) goto L_0x00c5
            java.lang.String r19 = "audio/vnd.dts"
            goto L_0x00aa
        L_0x00c5:
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r13) goto L_0x015b
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r13) goto L_0x00d1
            goto L_0x015b
        L_0x00d1:
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r13) goto L_0x00d9
            java.lang.String r19 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00aa
        L_0x00d9:
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r13) goto L_0x00e1
            java.lang.String r19 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00aa
        L_0x00e1:
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r13) goto L_0x00e9
            java.lang.String r19 = "audio/3gpp"
            goto L_0x00aa
        L_0x00e9:
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r13) goto L_0x00f1
            java.lang.String r19 = "audio/amr-wb"
            goto L_0x00aa
        L_0x00f1:
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 == r13) goto L_0x0159
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r12 != r13) goto L_0x00fc
            goto L_0x0159
        L_0x00fc:
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r13) goto L_0x0104
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x015f
        L_0x0104:
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r13) goto L_0x0155
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r13) goto L_0x010f
            goto L_0x0155
        L_0x010f:
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r13) goto L_0x0117
            java.lang.String r19 = "audio/mha1"
            goto L_0x00aa
        L_0x0117:
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r13) goto L_0x011f
            java.lang.String r19 = "audio/mhm1"
            goto L_0x00aa
        L_0x011f:
            if (r12 != r14) goto L_0x0124
            java.lang.String r19 = "audio/alac"
            goto L_0x00aa
        L_0x0124:
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r13) goto L_0x012d
            java.lang.String r19 = "audio/g711-alaw"
            goto L_0x00aa
        L_0x012d:
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r13) goto L_0x0136
            java.lang.String r19 = "audio/g711-mlaw"
            goto L_0x00aa
        L_0x0136:
            r13 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r12 != r13) goto L_0x013f
            java.lang.String r19 = "audio/opus"
            goto L_0x00aa
        L_0x013f:
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r13) goto L_0x0148
            java.lang.String r19 = "audio/flac"
            goto L_0x00aa
        L_0x0148:
            r13 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r13) goto L_0x0151
            java.lang.String r19 = "audio/true-hd"
            goto L_0x00aa
        L_0x0151:
            r12 = -1
            r19 = 0
            goto L_0x015f
        L_0x0155:
            java.lang.String r19 = "audio/mpeg"
            goto L_0x00aa
        L_0x0159:
            r12 = 2
            goto L_0x015f
        L_0x015b:
            java.lang.String r19 = "audio/vnd.dts.hd"
            goto L_0x00aa
        L_0x015f:
            r13 = r19
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0167:
            int r8 = r11 - r1
            if (r8 >= r2) goto L_0x0396
            r0.mo45230f(r11)
            int r8 = r24.mo45237m()
            if (r8 <= 0) goto L_0x0176
            r14 = 1
            goto L_0x0177
        L_0x0176:
            r14 = 0
        L_0x0177:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzm.m55540b(r14, r1)
            int r14 = r24.mo45237m()
            r2 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r14 != r2) goto L_0x01a1
            int r1 = r8 + -13
            byte[] r2 = new byte[r1]
            int r14 = r11 + 13
            r0.mo45230f(r14)
            r14 = 0
            r0.mo45226b(r2, r14, r1)
            com.google.android.gms.internal.ads.zzfvn r21 = com.google.android.gms.internal.ads.zzfvn.m51136z(r2)
            r22 = r12
        L_0x0198:
            r12 = 0
            r14 = 20
            r17 = 2
            r18 = 1
            goto L_0x038a
        L_0x01a1:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r14 == r2) goto L_0x0353
            if (r30 == 0) goto L_0x01f8
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r14 != r2) goto L_0x01f8
            int r2 = r24.mo45235k()
            if (r2 < r11) goto L_0x01b8
            r22 = r2
            r2 = 0
            r14 = 1
            goto L_0x01bc
        L_0x01b8:
            r22 = r2
            r2 = 0
            r14 = 0
        L_0x01bc:
            com.google.android.gms.internal.ads.zzzm.m55540b(r14, r2)
            r2 = r22
        L_0x01c1:
            int r14 = r2 - r11
            if (r14 >= r8) goto L_0x01eb
            r0.mo45230f(r2)
            int r14 = r24.mo45237m()
            if (r14 <= 0) goto L_0x01d2
            r22 = r12
            r12 = 1
            goto L_0x01d5
        L_0x01d2:
            r22 = r12
            r12 = 0
        L_0x01d5:
            com.google.android.gms.internal.ads.zzzm.m55540b(r12, r1)
            int r12 = r24.mo45237m()
            r23 = r1
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r12 == r1) goto L_0x01e9
            int r2 = r2 + r14
            r12 = r22
            r1 = r23
            goto L_0x01c1
        L_0x01e9:
            r1 = -1
            goto L_0x01ef
        L_0x01eb:
            r22 = r12
            r1 = -1
            r2 = -1
        L_0x01ef:
            r12 = 0
            r14 = 20
            r17 = 2
            r18 = 1
            goto L_0x035e
        L_0x01f8:
            r22 = r12
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r14 != r1) goto L_0x0212
            int r1 = r11 + 8
            r0.mo45230f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzyj.m55429c(r0, r1, r4, r5)
            r6.f24229b = r1
        L_0x020e:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0198
        L_0x0212:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r14 != r1) goto L_0x0227
            int r1 = r11 + 8
            r0.mo45230f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzyj.m55430d(r0, r1, r4, r5)
            r6.f24229b = r1
            goto L_0x020e
        L_0x0227:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r14 != r1) goto L_0x026b
            int r1 = r11 + 8
            r0.mo45230f(r1)
            java.lang.String r1 = java.lang.Integer.toString(r28)
            int r2 = com.google.android.gms.internal.ads.zzym.f38980b
            r2 = 1
            r0.mo45231g(r2)
            int r12 = r24.mo45243s()
            r12 = r12 & 32
            int r12 = r12 >> 5
            if (r2 == r12) goto L_0x0249
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x024c
        L_0x0249:
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x024c:
            com.google.android.gms.internal.ads.zzad r12 = new com.google.android.gms.internal.ads.zzad
            r12.<init>()
            r12.mo41331h(r1)
            r12.mo41343s(r10)
            r1 = 2
            r12.mo41326e0(r1)
            r12.mo41344t(r2)
            r12.mo41320b(r5)
            r12.mo41335k(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r12.mo41349y()
            r6.f24229b = r1
            goto L_0x020e
        L_0x026b:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r14 != r1) goto L_0x028d
            if (r15 <= 0) goto L_0x0276
            r7 = r15
            r9 = 2
            goto L_0x0198
        L_0x0276:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.m44135a(r0, r1)
            throw r0
        L_0x028d:
            r1 = 0
            r2 = 1684305011(0x64647473, float:1.6856995E22)
            if (r14 != r2) goto L_0x02b2
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            r2.mo41329g(r3)
            r2.mo41343s(r13)
            r2.mo41326e0(r9)
            r2.mo41344t(r7)
            r2.mo41320b(r5)
            r2.mo41335k(r4)
            com.google.android.gms.internal.ads.zzaf r2 = r2.mo41349y()
            r6.f24229b = r2
            goto L_0x020e
        L_0x02b2:
            r2 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r14 != r2) goto L_0x02d0
            int r2 = r8 + -8
            byte[] r12 = f24243a
            int r14 = r12.length
            int r14 = r14 + r2
            byte[] r14 = java.util.Arrays.copyOf(r12, r14)
            int r1 = r11 + 8
            r0.mo45230f(r1)
            int r1 = r12.length
            r0.mo45226b(r14, r1, r2)
            java.util.List r21 = com.google.android.gms.internal.ads.zzaag.m40919a(r14)
            goto L_0x0198
        L_0x02d0:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r14 != r1) goto L_0x0303
            int r1 = r8 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r12 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r12
            r12 = 76
            r18 = 1
            r2[r18] = r12
            r12 = 97
            r17 = 2
            r2[r17] = r12
            r12 = 3
            r14 = 67
            r2[r12] = r14
            int r12 = r11 + 12
            r0.mo45230f(r12)
            r12 = 4
            r0.mo45226b(r2, r12, r1)
            com.google.android.gms.internal.ads.zzfvn r21 = com.google.android.gms.internal.ads.zzfvn.m51136z(r2)
        L_0x02fe:
            r12 = 0
            r14 = 20
            goto L_0x038a
        L_0x0303:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r17 = 2
            r18 = 1
            if (r14 != r1) goto L_0x02fe
            int r2 = r8 + -12
            byte[] r7 = new byte[r2]
            int r9 = r11 + 12
            r0.mo45230f(r9)
            r12 = 0
            r0.mo45226b(r7, r12, r2)
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            r2.<init>((byte[]) r7)
            r9 = 9
            r2.mo45230f(r9)
            int r9 = r2.mo45243s()
            r14 = 20
            r2.mo45230f(r14)
            int r2 = r2.mo45246v()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r9)
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.zzfvn r21 = com.google.android.gms.internal.ads.zzfvn.m51136z(r7)
            r7 = r9
            r9 = r2
            goto L_0x038a
        L_0x0353:
            r22 = r12
            r12 = 0
            r14 = 20
            r17 = 2
            r18 = 1
            r2 = r11
            r1 = -1
        L_0x035e:
            if (r2 == r1) goto L_0x038a
            com.google.android.gms.internal.ads.zzaez r2 = m41248k(r0, r2)
            java.lang.String r13 = r2.f24190a
            byte[] r16 = r2.f24191b
            if (r16 == 0) goto L_0x0388
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0382
            com.google.android.gms.internal.ads.zzyf r1 = com.google.android.gms.internal.ads.zzyg.m55423a(r16)
            int r7 = r1.f38958a
            int r9 = r1.f38959b
            java.lang.String r1 = r1.f38960c
            r20 = r1
        L_0x0382:
            com.google.android.gms.internal.ads.zzfvn r1 = com.google.android.gms.internal.ads.zzfvn.m51136z(r16)
            r21 = r1
        L_0x0388:
            r19 = r2
        L_0x038a:
            int r11 = r11 + r8
            r1 = r26
            r2 = r27
            r12 = r22
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0167
        L_0x0396:
            r22 = r12
            com.google.android.gms.internal.ads.zzaf r0 = r6.f24229b
            if (r0 != 0) goto L_0x03e2
            if (r13 == 0) goto L_0x03e2
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r0.mo41329g(r3)
            r0.mo41343s(r13)
            r1 = r20
            r0.mo41328f0(r1)
            r0.mo41326e0(r9)
            r0.mo41344t(r7)
            r8 = r22
            r0.mo41338n(r8)
            r1 = r21
            r0.mo41333i(r1)
            r0.mo41320b(r5)
            r0.mo41335k(r4)
            if (r19 == 0) goto L_0x03dc
            long r1 = r19.f24192c
            int r1 = com.google.android.gms.internal.ads.zzfxs.m51256c(r1)
            r0.mo41324d0(r1)
            long r1 = r19.f24193d
            int r1 = com.google.android.gms.internal.ads.zzfxs.m51256c(r1)
            r0.mo41339o(r1)
        L_0x03dc:
            com.google.android.gms.internal.ads.zzaf r0 = r0.mo41349y()
            r6.f24229b = r0
        L_0x03e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaff.m41250m(com.google.android.gms.internal.ads.zzef, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzx, com.google.android.gms.internal.ads.zzafb, int):void");
    }

    /* renamed from: n */
    private static void m41251n(zzef zzef, int i, int i2, int i3, zzafb zzafb) {
        zzef.mo45230f(i2 + 16);
        zzef.mo45220D(0);
        String D = zzef.mo45220D(0);
        if (D != null) {
            zzad zzad = new zzad();
            zzad.mo41329g(i3);
            zzad.mo41343s(D);
            zzafb.f24229b = zzad.mo41349y();
        }
    }

    /* renamed from: o */
    private static boolean m41252o(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        int P = zzen.m49141P(4, 0, i);
        int P2 = zzen.m49141P(length - 4, 0, i);
        if (jArr[0] > j2 || j2 >= jArr[P] || jArr[P2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }
}
