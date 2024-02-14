package com.google.android.gms.internal.places;

import com.google.android.gms.internal.places.zzbc;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

final class zzco<T> implements zzda<T> {

    /* renamed from: r */
    private static final int[] f45323r = new int[0];

    /* renamed from: s */
    private static final Unsafe f45324s = zzdy.m63692q();

    /* renamed from: a */
    private final int[] f45325a;

    /* renamed from: b */
    private final Object[] f45326b;

    /* renamed from: c */
    private final int f45327c;

    /* renamed from: d */
    private final int f45328d;

    /* renamed from: e */
    private final zzck f45329e;

    /* renamed from: f */
    private final boolean f45330f;

    /* renamed from: g */
    private final boolean f45331g;

    /* renamed from: h */
    private final boolean f45332h;

    /* renamed from: i */
    private final boolean f45333i;

    /* renamed from: j */
    private final int[] f45334j;

    /* renamed from: k */
    private final int f45335k;

    /* renamed from: l */
    private final int f45336l;

    /* renamed from: m */
    private final zzcs f45337m;

    /* renamed from: n */
    private final zzbu f45338n;

    /* renamed from: o */
    private final zzds<?, ?> f45339o;

    /* renamed from: p */
    private final zzar<?> f45340p;

    /* renamed from: q */
    private final zzcd f45341q;

    private zzco(int[] iArr, Object[] objArr, int i, int i2, zzck zzck, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzcs zzcs, zzbu zzbu, zzds<?, ?> zzds, zzar<?> zzar, zzcd zzcd) {
        this.f45325a = iArr;
        this.f45326b = objArr;
        this.f45327c = i;
        this.f45328d = i2;
        this.f45331g = zzck instanceof zzbc;
        this.f45332h = z;
        this.f45330f = zzar != null && zzar.mo53417g(zzck);
        this.f45333i = false;
        this.f45334j = iArr2;
        this.f45335k = i3;
        this.f45336l = i4;
        this.f45337m = zzcs;
        this.f45338n = zzbu;
        this.f45339o = zzds;
        this.f45340p = zzar;
        this.f45329e = zzck;
        this.f45341q = zzcd;
    }

    /* renamed from: A */
    private final void m63457A(T t, T t2, int i) {
        long l = (long) (m63479l(i) & 1048575);
        if (m63458B(t2, i)) {
            Object G = zzdy.m63667G(t, l);
            Object G2 = zzdy.m63667G(t2, l);
            if (G != null && G2 != null) {
                zzdy.m63682g(t, l, zzbd.m63343d(G, G2));
                m63462F(t, i);
            } else if (G2 != null) {
                zzdy.m63682g(t, l, G2);
                m63462F(t, i);
            }
        }
    }

    /* renamed from: B */
    private final boolean m63458B(T t, int i) {
        if (this.f45332h) {
            int l = m63479l(i);
            long j = (long) (l & 1048575);
            switch ((l & 267386880) >>> 20) {
                case 0:
                    return zzdy.m63666F(t, j) != 0.0d;
                case 1:
                    return zzdy.m63665E(t, j) != 0.0f;
                case 2:
                    return zzdy.m63663C(t, j) != 0;
                case 3:
                    return zzdy.m63663C(t, j) != 0;
                case 4:
                    return zzdy.m63661A(t, j) != 0;
                case 5:
                    return zzdy.m63663C(t, j) != 0;
                case 6:
                    return zzdy.m63661A(t, j) != 0;
                case 7:
                    return zzdy.m63664D(t, j);
                case 8:
                    Object G = zzdy.m63667G(t, j);
                    if (G instanceof String) {
                        return !((String) G).isEmpty();
                    }
                    if (G instanceof zzw) {
                        return !zzw.f45474a.equals(G);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zzdy.m63667G(t, j) != null;
                case 10:
                    return !zzw.f45474a.equals(zzdy.m63667G(t, j));
                case 11:
                    return zzdy.m63661A(t, j) != 0;
                case 12:
                    return zzdy.m63661A(t, j) != 0;
                case 13:
                    return zzdy.m63661A(t, j) != 0;
                case 14:
                    return zzdy.m63663C(t, j) != 0;
                case 15:
                    return zzdy.m63661A(t, j) != 0;
                case 16:
                    return zzdy.m63663C(t, j) != 0;
                case 17:
                    return zzdy.m63667G(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int m = m63480m(i);
            return (zzdy.m63661A(t, (long) (m & 1048575)) & (1 << (m >>> 20))) != 0;
        }
    }

    /* renamed from: C */
    private final boolean m63459C(T t, int i, int i2) {
        return zzdy.m63661A(t, (long) (m63480m(i2) & 1048575)) == i;
    }

    /* renamed from: D */
    private final boolean m63460D(T t, int i, int i2, int i3) {
        if (this.f45332h) {
            return m63458B(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: E */
    private static boolean m63461E(Object obj, int i, zzda zzda) {
        return zzda.mo53539e(zzdy.m63667G(obj, (long) (i & 1048575)));
    }

    /* renamed from: F */
    private final void m63462F(T t, int i) {
        if (!this.f45332h) {
            int m = m63480m(i);
            long j = (long) (m & 1048575);
            zzdy.m63680e(t, j, zzdy.m63661A(t, j) | (1 << (m >>> 20)));
        }
    }

    /* renamed from: G */
    private final void m63463G(T t, int i, int i2) {
        zzdy.m63680e(t, (long) (m63480m(i2) & 1048575), i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m63464H(T r19, com.google.android.gms.internal.places.zzel r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f45330f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.places.zzar<?> r3 = r0.f45340p
            com.google.android.gms.internal.places.zzav r3 = r3.mo53412b(r1)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r5 = r3.f45189a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo53422d()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.f45325a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f45324s
            r10 = 0
            r11 = 0
        L_0x002d:
            if (r10 >= r7) goto L_0x0494
            int r12 = r0.m63479l(r10)
            int[] r13 = r0.f45325a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f45332h
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x005d
            r4 = 17
            if (r15 > r4) goto L_0x005d
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0057
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            r6 = r13
        L_0x0057:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0060
        L_0x005d:
            r17 = r10
            r4 = 0
        L_0x0060:
            if (r5 == 0) goto L_0x007e
            com.google.android.gms.internal.places.zzar<?> r9 = r0.f45340p
            int r9 = r9.mo53411a(r5)
            if (r9 > r14) goto L_0x007e
            com.google.android.gms.internal.places.zzar<?> r9 = r0.f45340p
            r9.mo53414d(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007c
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0060
        L_0x007c:
            r5 = 0
            goto L_0x0060
        L_0x007e:
            r9 = r12 & r16
            long r9 = (long) r9
            r12 = r17
            switch(r15) {
                case 0: goto L_0x0485;
                case 1: goto L_0x0479;
                case 2: goto L_0x046d;
                case 3: goto L_0x0461;
                case 4: goto L_0x0455;
                case 5: goto L_0x0449;
                case 6: goto L_0x043d;
                case 7: goto L_0x0431;
                case 8: goto L_0x0425;
                case 9: goto L_0x0414;
                case 10: goto L_0x0405;
                case 11: goto L_0x03f8;
                case 12: goto L_0x03eb;
                case 13: goto L_0x03de;
                case 14: goto L_0x03d1;
                case 15: goto L_0x03c4;
                case 16: goto L_0x03b7;
                case 17: goto L_0x03a6;
                case 18: goto L_0x0396;
                case 19: goto L_0x0386;
                case 20: goto L_0x0376;
                case 21: goto L_0x0366;
                case 22: goto L_0x0356;
                case 23: goto L_0x0346;
                case 24: goto L_0x0336;
                case 25: goto L_0x0326;
                case 26: goto L_0x0317;
                case 27: goto L_0x0304;
                case 28: goto L_0x02f5;
                case 29: goto L_0x02e5;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02c5;
                case 32: goto L_0x02b5;
                case 33: goto L_0x02a5;
                case 34: goto L_0x0295;
                case 35: goto L_0x0285;
                case 36: goto L_0x0275;
                case 37: goto L_0x0265;
                case 38: goto L_0x0255;
                case 39: goto L_0x0245;
                case 40: goto L_0x0235;
                case 41: goto L_0x0225;
                case 42: goto L_0x0215;
                case 43: goto L_0x0205;
                case 44: goto L_0x01f5;
                case 45: goto L_0x01e5;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01c5;
                case 48: goto L_0x01b5;
                case 49: goto L_0x01a2;
                case 50: goto L_0x0199;
                case 51: goto L_0x018a;
                case 52: goto L_0x017b;
                case 53: goto L_0x016c;
                case 54: goto L_0x015d;
                case 55: goto L_0x014e;
                case 56: goto L_0x013f;
                case 57: goto L_0x0130;
                case 58: goto L_0x0121;
                case 59: goto L_0x0112;
                case 60: goto L_0x00ff;
                case 61: goto L_0x00ef;
                case 62: goto L_0x00e1;
                case 63: goto L_0x00d3;
                case 64: goto L_0x00c5;
                case 65: goto L_0x00b7;
                case 66: goto L_0x00a9;
                case 67: goto L_0x009b;
                case 68: goto L_0x0089;
                default: goto L_0x0086;
            }
        L_0x0086:
            r13 = 0
            goto L_0x0490
        L_0x0089:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.m63476i(r12)
            r2.mo53368N(r14, r4, r9)
            goto L_0x0086
        L_0x009b:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            long r9 = m63471O(r1, r9)
            r2.mo53380l(r14, r9)
            goto L_0x0086
        L_0x00a9:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            int r4 = m63470N(r1, r9)
            r2.mo53384p(r14, r4)
            goto L_0x0086
        L_0x00b7:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            long r9 = m63471O(r1, r9)
            r2.mo53375g(r14, r9)
            goto L_0x0086
        L_0x00c5:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            int r4 = m63470N(r1, r9)
            r2.mo53361G(r14, r4)
            goto L_0x0086
        L_0x00d3:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            int r4 = m63470N(r1, r9)
            r2.mo53363I(r14, r4)
            goto L_0x0086
        L_0x00e1:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            int r4 = m63470N(r1, r9)
            r2.mo53393x(r14, r4)
            goto L_0x0086
        L_0x00ef:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            r2.mo53391v(r14, r4)
            goto L_0x0086
        L_0x00ff:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.m63476i(r12)
            r2.mo53360F(r14, r4, r9)
            goto L_0x0086
        L_0x0112:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            java.lang.Object r4 = r8.getObject(r1, r9)
            m63490x(r14, r4, r2)
            goto L_0x0086
        L_0x0121:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            boolean r4 = m63472P(r1, r9)
            r2.mo53387r0(r14, r4)
            goto L_0x0086
        L_0x0130:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            int r4 = m63470N(r1, r9)
            r2.mo53386r(r14, r4)
            goto L_0x0086
        L_0x013f:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            long r9 = m63471O(r1, r9)
            r2.mo53392w(r14, r9)
            goto L_0x0086
        L_0x014e:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            int r4 = m63470N(r1, r9)
            r2.mo53390u(r14, r4)
            goto L_0x0086
        L_0x015d:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            long r9 = m63471O(r1, r9)
            r2.mo53377i(r14, r9)
            goto L_0x0086
        L_0x016c:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            long r9 = m63471O(r1, r9)
            r2.mo53395z(r14, r9)
            goto L_0x0086
        L_0x017b:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            float r4 = m63469M(r1, r9)
            r2.mo53378j(r14, r4)
            goto L_0x0086
        L_0x018a:
            boolean r4 = r0.m63459C(r1, r14, r12)
            if (r4 == 0) goto L_0x0086
            double r9 = m63468L(r1, r9)
            r2.mo53376h(r14, r9)
            goto L_0x0086
        L_0x0199:
            java.lang.Object r4 = r8.getObject(r1, r9)
            r0.m63492z(r2, r14, r4, r12)
            goto L_0x0086
        L_0x01a2:
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r10 = r0.m63476i(r12)
            com.google.android.gms.internal.places.zzdc.m63592j(r4, r9, r2, r10)
            goto L_0x0086
        L_0x01b5:
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 1
            com.google.android.gms.internal.places.zzdc.m63554B(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01c5:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63565M(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01d5:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63559G(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01e5:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63569Q(r4, r9, r2, r13)
            goto L_0x0086
        L_0x01f5:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63571S(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0205:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63563K(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0215:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63572T(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0225:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63567O(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0235:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63556D(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0245:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63561I(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0255:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63606x(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0265:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63598p(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0275:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63593k(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0285:
            r13 = 1
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63587e(r4, r9, r2, r13)
            goto L_0x0086
        L_0x0295:
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.places.zzdc.m63554B(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02a5:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63565M(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02b5:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63559G(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02c5:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63569Q(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02d5:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63571S(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02e5:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63563K(r4, r9, r2, r13)
            goto L_0x0490
        L_0x02f5:
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63591i(r4, r9, r2)
            goto L_0x0086
        L_0x0304:
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r10 = r0.m63476i(r12)
            com.google.android.gms.internal.places.zzdc.m63585d(r4, r9, r2, r10)
            goto L_0x0086
        L_0x0317:
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63583c(r4, r9, r2)
            goto L_0x0086
        L_0x0326:
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            r13 = 0
            com.google.android.gms.internal.places.zzdc.m63572T(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0336:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63567O(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0346:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63556D(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0356:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63561I(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0366:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63606x(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0376:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63598p(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0386:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63593k(r4, r9, r2, r13)
            goto L_0x0490
        L_0x0396:
            r13 = 0
            int[] r4 = r0.f45325a
            r4 = r4[r12]
            java.lang.Object r9 = r8.getObject(r1, r9)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63587e(r4, r9, r2, r13)
            goto L_0x0490
        L_0x03a6:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.m63476i(r12)
            r2.mo53368N(r14, r4, r9)
            goto L_0x0490
        L_0x03b7:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.mo53380l(r14, r9)
            goto L_0x0490
        L_0x03c4:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.mo53384p(r14, r4)
            goto L_0x0490
        L_0x03d1:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.mo53375g(r14, r9)
            goto L_0x0490
        L_0x03de:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.mo53361G(r14, r4)
            goto L_0x0490
        L_0x03eb:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.mo53363I(r14, r4)
            goto L_0x0490
        L_0x03f8:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.mo53393x(r14, r4)
            goto L_0x0490
        L_0x0405:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            r2.mo53391v(r14, r4)
            goto L_0x0490
        L_0x0414:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r9 = r0.m63476i(r12)
            r2.mo53360F(r14, r4, r9)
            goto L_0x0490
        L_0x0425:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            java.lang.Object r4 = r8.getObject(r1, r9)
            m63490x(r14, r4, r2)
            goto L_0x0490
        L_0x0431:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            boolean r4 = com.google.android.gms.internal.places.zzdy.m63664D(r1, r9)
            r2.mo53387r0(r14, r4)
            goto L_0x0490
        L_0x043d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.mo53386r(r14, r4)
            goto L_0x0490
        L_0x0449:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.mo53392w(r14, r9)
            goto L_0x0490
        L_0x0455:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            int r4 = r8.getInt(r1, r9)
            r2.mo53390u(r14, r4)
            goto L_0x0490
        L_0x0461:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.mo53377i(r14, r9)
            goto L_0x0490
        L_0x046d:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            long r9 = r8.getLong(r1, r9)
            r2.mo53395z(r14, r9)
            goto L_0x0490
        L_0x0479:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            float r4 = com.google.android.gms.internal.places.zzdy.m63665E(r1, r9)
            r2.mo53378j(r14, r4)
            goto L_0x0490
        L_0x0485:
            r13 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0490
            double r9 = com.google.android.gms.internal.places.zzdy.m63666F(r1, r9)
            r2.mo53376h(r14, r9)
        L_0x0490:
            int r10 = r12 + 3
            goto L_0x002d
        L_0x0494:
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.places.zzar<?> r4 = r0.f45340p
            r4.mo53414d(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a9
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0494
        L_0x04a9:
            r5 = 0
            goto L_0x0494
        L_0x04ab:
            com.google.android.gms.internal.places.zzds<?, ?> r3 = r0.f45339o
            m63491y(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.m63464H(java.lang.Object, com.google.android.gms.internal.places.zzel):void");
    }

    /* renamed from: I */
    private final void m63465I(T t, T t2, int i) {
        int l = m63479l(i);
        int i2 = this.f45325a[i];
        long j = (long) (l & 1048575);
        if (m63459C(t2, i2, i)) {
            Object G = zzdy.m63667G(t, j);
            Object G2 = zzdy.m63667G(t2, j);
            if (G != null && G2 != null) {
                zzdy.m63682g(t, j, zzbd.m63343d(G, G2));
                m63463G(t, i2, i);
            } else if (G2 != null) {
                zzdy.m63682g(t, j, G2);
                m63463G(t, i2, i);
            }
        }
    }

    /* renamed from: J */
    private final boolean m63466J(T t, T t2, int i) {
        return m63458B(t, i) == m63458B(t2, i);
    }

    /* renamed from: K */
    private static List<?> m63467K(Object obj, long j) {
        return (List) zzdy.m63667G(obj, j);
    }

    /* renamed from: L */
    private static <T> double m63468L(T t, long j) {
        return ((Double) zzdy.m63667G(t, j)).doubleValue();
    }

    /* renamed from: M */
    private static <T> float m63469M(T t, long j) {
        return ((Float) zzdy.m63667G(t, j)).floatValue();
    }

    /* renamed from: N */
    private static <T> int m63470N(T t, long j) {
        return ((Integer) zzdy.m63667G(t, j)).intValue();
    }

    /* renamed from: O */
    private static <T> long m63471O(T t, long j) {
        return ((Long) zzdy.m63667G(t, j)).longValue();
    }

    /* renamed from: P */
    private static <T> boolean m63472P(T t, long j) {
        return ((Boolean) zzdy.m63667G(t, j)).booleanValue();
    }

    /* renamed from: Q */
    private static zzdr m63473Q(Object obj) {
        zzbc zzbc = (zzbc) obj;
        zzdr zzdr = zzbc.zzih;
        if (zzdr != zzdr.m63623i()) {
            return zzdr;
        }
        zzdr j = zzdr.m63624j();
        zzbc.zzih = j;
        return j;
    }

    /* renamed from: R */
    private final int m63474R(int i, int i2) {
        if (i < this.f45327c || i > this.f45328d) {
            return -1;
        }
        return m63475S(i, i2);
    }

    /* renamed from: S */
    private final int m63475S(int i, int i2) {
        int length = (this.f45325a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f45325a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: i */
    private final zzda m63476i(int i) {
        int i2 = (i / 3) << 1;
        zzda zzda = (zzda) this.f45326b[i2];
        if (zzda != null) {
            return zzda;
        }
        zzda b = zzcv.m63517a().mo53547b((Class) this.f45326b[i2 + 1]);
        this.f45326b[i2] = b;
        return b;
    }

    /* renamed from: j */
    private final Object m63477j(int i) {
        return this.f45326b[(i / 3) << 1];
    }

    /* renamed from: k */
    private final zzbf m63478k(int i) {
        return (zzbf) this.f45326b[((i / 3) << 1) + 1];
    }

    /* renamed from: l */
    private final int m63479l(int i) {
        return this.f45325a[i + 1];
    }

    /* renamed from: m */
    private final int m63480m(int i) {
        return this.f45325a[i + 2];
    }

    /* renamed from: n */
    private final int m63481n(int i) {
        if (i < this.f45327c || i > this.f45328d) {
            return -1;
        }
        return m63475S(i, 0);
    }

    /* renamed from: o */
    private static <UT, UB> int m63482o(zzds<UT, UB> zzds, T t) {
        return zzds.mo53612j(zzds.mo53613k(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m63483p(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.places.zzr r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f45324s
            int[] r7 = r0.f45325a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018d;
                case 52: goto L_0x017d;
                case 53: goto L_0x016d;
                case 54: goto L_0x016d;
                case 55: goto L_0x015d;
                case 56: goto L_0x014e;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x015d;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x014e;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a1
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a1
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.places.zzda r2 = r0.m63476i(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.places.zzs.m63845f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f45466c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0055:
            java.lang.Object r3 = r11.f45466c
            java.lang.Object r3 = com.google.android.gms.internal.places.zzbd.m63343d(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0060:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r11)
            long r3 = r11.f45465b
            long r3 = com.google.android.gms.internal.places.zzai.m63091b(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0075:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r11)
            int r3 = r11.f45464a
            int r3 = com.google.android.gms.internal.places.zzai.m63093e(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x008a:
            if (r5 != 0) goto L_0x01a1
            int r3 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r11)
            int r4 = r11.f45464a
            com.google.android.gms.internal.places.zzbf r5 = r0.m63478k(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.mo53472a(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.places.zzdr r1 = m63473Q(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.mo53599f(r2, r4)
            r2 = r3
            goto L_0x01a2
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019d
        L_0x00b8:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63856q(r3, r4, r11)
            java.lang.Object r3 = r11.f45466c
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x00c5:
            if (r5 != r15) goto L_0x01a1
            com.google.android.gms.internal.places.zzda r2 = r0.m63476i(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.places.zzs.m63846g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f45466c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f45466c
            java.lang.Object r3 = com.google.android.gms.internal.places.zzbd.m63343d(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x00f3:
            if (r5 != r15) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r11)
            int r4 = r11.f45464a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.places.zzea.m63763h(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63367f()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.places.zzbd.f45276a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x0127:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r11)
            long r3 = r11.f45465b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x0140:
            if (r5 != r7) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63847h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x018a
        L_0x014e:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            long r2 = com.google.android.gms.internal.places.zzs.m63851l(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x019b
        L_0x015d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r11)
            int r3 = r11.f45464a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x016d:
            if (r5 != 0) goto L_0x01a1
            int r2 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r11)
            long r3 = r11.f45465b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019d
        L_0x017d:
            if (r5 != r7) goto L_0x01a1
            float r2 = com.google.android.gms.internal.places.zzs.m63854o(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x018a:
            int r2 = r4 + 4
            goto L_0x019d
        L_0x018d:
            r2 = 1
            if (r5 != r2) goto L_0x01a1
            double r2 = com.google.android.gms.internal.places.zzs.m63852m(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x019b:
            int r2 = r4 + 8
        L_0x019d:
            r12.putInt(r1, r13, r8)
            goto L_0x01a2
        L_0x01a1:
            r2 = r4
        L_0x01a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.m63483p(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.places.zzr):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0420 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x041f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x041f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e8  */
    /* renamed from: q */
    private final int m63484q(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.places.zzr r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f45324s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.places.zzbh r12 = (com.google.android.gms.internal.places.zzbh) r12
            boolean r13 = r12.mo53474N()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.places.zzbh r12 = r12.mo53396E(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x03a3;
                case 20: goto L_0x0362;
                case 21: goto L_0x0362;
                case 22: goto L_0x0348;
                case 23: goto L_0x0309;
                case 24: goto L_0x02ca;
                case 25: goto L_0x0273;
                case 26: goto L_0x01c0;
                case 27: goto L_0x01a6;
                case 28: goto L_0x014e;
                case 29: goto L_0x0348;
                case 30: goto L_0x0116;
                case 31: goto L_0x02ca;
                case 32: goto L_0x0309;
                case 33: goto L_0x00c9;
                case 34: goto L_0x007c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x03a3;
                case 37: goto L_0x0362;
                case 38: goto L_0x0362;
                case 39: goto L_0x0348;
                case 40: goto L_0x0309;
                case 41: goto L_0x02ca;
                case 42: goto L_0x0273;
                case 43: goto L_0x0348;
                case 44: goto L_0x0116;
                case 45: goto L_0x02ca;
                case 46: goto L_0x0309;
                case 47: goto L_0x00c9;
                case 48: goto L_0x007c;
                case 49: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x041f
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x041f
            com.google.android.gms.internal.places.zzda r1 = r15.m63476i(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.places.zzs.m63845f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f45466c
            r12.add(r8)
        L_0x005c:
            if (r4 >= r5) goto L_0x041f
            int r8 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r9 = r7.f45464a
            if (r2 != r9) goto L_0x041f
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.places.zzs.m63845f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f45466c
            r12.add(r8)
            goto L_0x005c
        L_0x007c:
            if (r6 != r13) goto L_0x00a0
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r2 = r7.f45464a
            int r2 = r2 + r1
        L_0x0087:
            if (r1 >= r2) goto L_0x0097
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r3, r1, r7)
            long r4 = r7.f45465b
            long r4 = com.google.android.gms.internal.places.zzai.m63091b(r4)
            r12.mo53505j(r4)
            goto L_0x0087
        L_0x0097:
            if (r1 != r2) goto L_0x009b
            goto L_0x0420
        L_0x009b:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x00a0:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r7)
            long r8 = r7.f45465b
            long r8 = com.google.android.gms.internal.places.zzai.m63091b(r8)
            r12.mo53505j(r8)
        L_0x00b1:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r7)
            long r8 = r7.f45465b
            long r8 = com.google.android.gms.internal.places.zzai.m63091b(r8)
            r12.mo53505j(r8)
            goto L_0x00b1
        L_0x00c9:
            if (r6 != r13) goto L_0x00ed
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r2 = r7.f45464a
            int r2 = r2 + r1
        L_0x00d4:
            if (r1 >= r2) goto L_0x00e4
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r4 = r7.f45464a
            int r4 = com.google.android.gms.internal.places.zzai.m63093e(r4)
            r12.mo53468f(r4)
            goto L_0x00d4
        L_0x00e4:
            if (r1 != r2) goto L_0x00e8
            goto L_0x0420
        L_0x00e8:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x00ed:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r4 = r7.f45464a
            int r4 = com.google.android.gms.internal.places.zzai.m63093e(r4)
            r12.mo53468f(r4)
        L_0x00fe:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r4 = r7.f45464a
            int r4 = com.google.android.gms.internal.places.zzai.m63093e(r4)
            r12.mo53468f(r4)
            goto L_0x00fe
        L_0x0116:
            if (r6 != r13) goto L_0x011d
            int r2 = com.google.android.gms.internal.places.zzs.m63848i(r3, r4, r12, r7)
            goto L_0x012e
        L_0x011d:
            if (r6 != 0) goto L_0x041f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.places.zzs.m63840a(r2, r3, r4, r5, r6, r7)
        L_0x012e:
            com.google.android.gms.internal.places.zzbc r1 = (com.google.android.gms.internal.places.zzbc) r1
            com.google.android.gms.internal.places.zzdr r3 = r1.zzih
            com.google.android.gms.internal.places.zzdr r4 = com.google.android.gms.internal.places.zzdr.m63623i()
            if (r3 != r4) goto L_0x0139
            r3 = 0
        L_0x0139:
            com.google.android.gms.internal.places.zzbf r4 = r15.m63478k(r8)
            com.google.android.gms.internal.places.zzds<?, ?> r5 = r0.f45339o
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdc.m63581b(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.places.zzdr r3 = (com.google.android.gms.internal.places.zzdr) r3
            if (r3 == 0) goto L_0x014b
            r1.zzih = r3
        L_0x014b:
            r1 = r2
            goto L_0x0420
        L_0x014e:
            if (r6 != r13) goto L_0x041f
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r4 = r7.f45464a
            if (r4 < 0) goto L_0x01a1
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019c
            if (r4 != 0) goto L_0x0164
            com.google.android.gms.internal.places.zzw r4 = com.google.android.gms.internal.places.zzw.f45474a
            r12.add(r4)
            goto L_0x016c
        L_0x0164:
            com.google.android.gms.internal.places.zzw r6 = com.google.android.gms.internal.places.zzw.m63867p(r3, r1, r4)
            r12.add(r6)
        L_0x016b:
            int r1 = r1 + r4
        L_0x016c:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r4 = r7.f45464a
            if (r4 < 0) goto L_0x0197
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0192
            if (r4 != 0) goto L_0x018a
            com.google.android.gms.internal.places.zzw r4 = com.google.android.gms.internal.places.zzw.f45474a
            r12.add(r4)
            goto L_0x016c
        L_0x018a:
            com.google.android.gms.internal.places.zzw r6 = com.google.android.gms.internal.places.zzw.m63867p(r3, r1, r4)
            r12.add(r6)
            goto L_0x016b
        L_0x0192:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x0197:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63363b()
            throw r1
        L_0x019c:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x01a1:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63363b()
            throw r1
        L_0x01a6:
            if (r6 != r13) goto L_0x041f
            com.google.android.gms.internal.places.zzda r1 = r15.m63476i(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.places.zzs.m63844e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0420
        L_0x01c0:
            if (r6 != r13) goto L_0x041f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0213
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r6 = r7.f45464a
            if (r6 < 0) goto L_0x020e
            if (r6 != 0) goto L_0x01db
            r12.add(r1)
            goto L_0x01e6
        L_0x01db:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.places.zzbd.f45276a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01e5:
            int r4 = r4 + r6
        L_0x01e6:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r8 = r7.f45464a
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r6, r7)
            int r6 = r7.f45464a
            if (r6 < 0) goto L_0x0209
            if (r6 != 0) goto L_0x01fe
            r12.add(r1)
            goto L_0x01e6
        L_0x01fe:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.places.zzbd.f45276a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01e5
        L_0x0209:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63363b()
            throw r1
        L_0x020e:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63363b()
            throw r1
        L_0x0213:
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r6 = r7.f45464a
            if (r6 < 0) goto L_0x026e
            if (r6 != 0) goto L_0x0221
            r12.add(r1)
            goto L_0x0234
        L_0x0221:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.places.zzea.m63763h(r3, r4, r8)
            if (r9 == 0) goto L_0x0269
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.places.zzbd.f45276a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0233:
            r4 = r8
        L_0x0234:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r8 = r7.f45464a
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r6, r7)
            int r6 = r7.f45464a
            if (r6 < 0) goto L_0x0264
            if (r6 != 0) goto L_0x024c
            r12.add(r1)
            goto L_0x0234
        L_0x024c:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.places.zzea.m63763h(r3, r4, r8)
            if (r9 == 0) goto L_0x025f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.places.zzbd.f45276a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0233
        L_0x025f:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63367f()
            throw r1
        L_0x0264:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63363b()
            throw r1
        L_0x0269:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63367f()
            throw r1
        L_0x026e:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63363b()
            throw r1
        L_0x0273:
            r1 = 0
            if (r6 != r13) goto L_0x029b
            com.google.android.gms.internal.places.zzu r12 = (com.google.android.gms.internal.places.zzu) r12
            int r2 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r4 = r7.f45464a
            int r4 = r4 + r2
        L_0x027f:
            if (r2 >= r4) goto L_0x0292
            int r2 = com.google.android.gms.internal.places.zzs.m63850k(r3, r2, r7)
            long r5 = r7.f45465b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x028d
            r5 = 1
            goto L_0x028e
        L_0x028d:
            r5 = 0
        L_0x028e:
            r12.mo53666d(r5)
            goto L_0x027f
        L_0x0292:
            if (r2 != r4) goto L_0x0296
            goto L_0x014b
        L_0x0296:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x029b:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzu r12 = (com.google.android.gms.internal.places.zzu) r12
            int r4 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r7)
            long r8 = r7.f45465b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ab
            r6 = 1
            goto L_0x02ac
        L_0x02ab:
            r6 = 0
        L_0x02ac:
            r12.mo53666d(r6)
        L_0x02af:
            if (r4 >= r5) goto L_0x041f
            int r6 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r8 = r7.f45464a
            if (r2 != r8) goto L_0x041f
            int r4 = com.google.android.gms.internal.places.zzs.m63850k(r3, r6, r7)
            long r8 = r7.f45465b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02c5
            r6 = 1
            goto L_0x02c6
        L_0x02c5:
            r6 = 0
        L_0x02c6:
            r12.mo53666d(r6)
            goto L_0x02af
        L_0x02ca:
            if (r6 != r13) goto L_0x02ea
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r2 = r7.f45464a
            int r2 = r2 + r1
        L_0x02d5:
            if (r1 >= r2) goto L_0x02e1
            int r4 = com.google.android.gms.internal.places.zzs.m63847h(r3, r1)
            r12.mo53468f(r4)
            int r1 = r1 + 4
            goto L_0x02d5
        L_0x02e1:
            if (r1 != r2) goto L_0x02e5
            goto L_0x0420
        L_0x02e5:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x02ea:
            if (r6 != r9) goto L_0x041f
            com.google.android.gms.internal.places.zzbe r12 = (com.google.android.gms.internal.places.zzbe) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63847h(r17, r18)
            r12.mo53468f(r1)
        L_0x02f5:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.m63847h(r3, r4)
            r12.mo53468f(r1)
            goto L_0x02f5
        L_0x0309:
            if (r6 != r13) goto L_0x0329
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r2 = r7.f45464a
            int r2 = r2 + r1
        L_0x0314:
            if (r1 >= r2) goto L_0x0320
            long r4 = com.google.android.gms.internal.places.zzs.m63851l(r3, r1)
            r12.mo53505j(r4)
            int r1 = r1 + 8
            goto L_0x0314
        L_0x0320:
            if (r1 != r2) goto L_0x0324
            goto L_0x0420
        L_0x0324:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x0329:
            if (r6 != r14) goto L_0x041f
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            long r8 = com.google.android.gms.internal.places.zzs.m63851l(r17, r18)
            r12.mo53505j(r8)
        L_0x0334:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            long r8 = com.google.android.gms.internal.places.zzs.m63851l(r3, r4)
            r12.mo53505j(r8)
            goto L_0x0334
        L_0x0348:
            if (r6 != r13) goto L_0x0350
            int r1 = com.google.android.gms.internal.places.zzs.m63848i(r3, r4, r12, r7)
            goto L_0x0420
        L_0x0350:
            if (r6 != 0) goto L_0x041f
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.places.zzs.m63840a(r20, r21, r22, r23, r24, r25)
            goto L_0x0420
        L_0x0362:
            if (r6 != r13) goto L_0x0382
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r2 = r7.f45464a
            int r2 = r2 + r1
        L_0x036d:
            if (r1 >= r2) goto L_0x0379
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r3, r1, r7)
            long r4 = r7.f45465b
            r12.mo53505j(r4)
            goto L_0x036d
        L_0x0379:
            if (r1 != r2) goto L_0x037d
            goto L_0x0420
        L_0x037d:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x0382:
            if (r6 != 0) goto L_0x041f
            com.google.android.gms.internal.places.zzby r12 = (com.google.android.gms.internal.places.zzby) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r7)
            long r8 = r7.f45465b
            r12.mo53505j(r8)
        L_0x038f:
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r3, r4, r7)
            long r8 = r7.f45465b
            r12.mo53505j(r8)
            goto L_0x038f
        L_0x03a3:
            if (r6 != r13) goto L_0x03c2
            com.google.android.gms.internal.places.zzbb r12 = (com.google.android.gms.internal.places.zzbb) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r2 = r7.f45464a
            int r2 = r2 + r1
        L_0x03ae:
            if (r1 >= r2) goto L_0x03ba
            float r4 = com.google.android.gms.internal.places.zzs.m63854o(r3, r1)
            r12.mo53441f(r4)
            int r1 = r1 + 4
            goto L_0x03ae
        L_0x03ba:
            if (r1 != r2) goto L_0x03bd
            goto L_0x0420
        L_0x03bd:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x03c2:
            if (r6 != r9) goto L_0x041f
            com.google.android.gms.internal.places.zzbb r12 = (com.google.android.gms.internal.places.zzbb) r12
            float r1 = com.google.android.gms.internal.places.zzs.m63854o(r17, r18)
            r12.mo53441f(r1)
        L_0x03cd:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            float r1 = com.google.android.gms.internal.places.zzs.m63854o(r3, r4)
            r12.mo53441f(r1)
            goto L_0x03cd
        L_0x03e1:
            if (r6 != r13) goto L_0x0400
            com.google.android.gms.internal.places.zzao r12 = (com.google.android.gms.internal.places.zzao) r12
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r3, r4, r7)
            int r2 = r7.f45464a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03f8
            double r4 = com.google.android.gms.internal.places.zzs.m63852m(r3, r1)
            r12.mo53399d(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03f8:
            if (r1 != r2) goto L_0x03fb
            goto L_0x0420
        L_0x03fb:
            com.google.android.gms.internal.places.zzbk r1 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r1
        L_0x0400:
            if (r6 != r14) goto L_0x041f
            com.google.android.gms.internal.places.zzao r12 = (com.google.android.gms.internal.places.zzao) r12
            double r8 = com.google.android.gms.internal.places.zzs.m63852m(r17, r18)
            r12.mo53399d(r8)
        L_0x040b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0420
            int r4 = com.google.android.gms.internal.places.zzs.m63849j(r3, r1, r7)
            int r6 = r7.f45464a
            if (r2 != r6) goto L_0x0420
            double r8 = com.google.android.gms.internal.places.zzs.m63852m(r3, r4)
            r12.mo53399d(r8)
            goto L_0x040b
        L_0x041f:
            r1 = r4
        L_0x0420:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.m63484q(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int m63485r(T r8, byte[] r9, int r10, int r11, int r12, long r13, com.google.android.gms.internal.places.zzr r15) throws java.io.IOException {
        /*
            r7 = this;
            sun.misc.Unsafe r0 = f45324s
            java.lang.Object r12 = r7.m63477j(r12)
            java.lang.Object r1 = r0.getObject(r8, r13)
            com.google.android.gms.internal.places.zzcd r2 = r7.f45341q
            boolean r2 = r2.mo53516f(r1)
            if (r2 == 0) goto L_0x0021
            com.google.android.gms.internal.places.zzcd r2 = r7.f45341q
            java.lang.Object r2 = r2.mo53515e(r12)
            com.google.android.gms.internal.places.zzcd r3 = r7.f45341q
            r3.mo53512b(r2, r1)
            r0.putObject(r8, r13, r2)
            r1 = r2
        L_0x0021:
            com.google.android.gms.internal.places.zzcd r8 = r7.f45341q
            com.google.android.gms.internal.places.zzcb r8 = r8.mo53513c(r12)
            com.google.android.gms.internal.places.zzcd r12 = r7.f45341q
            java.util.Map r12 = r12.mo53518h(r1)
            int r10 = com.google.android.gms.internal.places.zzs.m63849j(r9, r10, r15)
            int r13 = r15.f45464a
            if (r13 < 0) goto L_0x0097
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x0097
            int r13 = r13 + r10
            K r14 = r8.f45316b
            V r0 = r8.f45318d
        L_0x003e:
            if (r10 >= r13) goto L_0x008c
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x004c
            int r1 = com.google.android.gms.internal.places.zzs.m63843d(r10, r9, r1, r15)
            int r10 = r15.f45464a
        L_0x004c:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0072
            r4 = 2
            if (r1 == r4) goto L_0x0058
            goto L_0x0087
        L_0x0058:
            com.google.android.gms.internal.places.zzef r1 = r8.f45317c
            int r1 = r1.mo53649d()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.places.zzef r4 = r8.f45317c
            V r10 = r8.f45318d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m63486t(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.f45466c
            goto L_0x003e
        L_0x0072:
            com.google.android.gms.internal.places.zzef r1 = r8.f45315a
            int r1 = r1.mo53649d()
            if (r3 != r1) goto L_0x0087
            com.google.android.gms.internal.places.zzef r4 = r8.f45315a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = m63486t(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.f45466c
            goto L_0x003e
        L_0x0087:
            int r10 = com.google.android.gms.internal.places.zzs.m63842c(r10, r9, r2, r11, r15)
            goto L_0x003e
        L_0x008c:
            if (r10 != r13) goto L_0x0092
            r12.put(r14, r0)
            return r13
        L_0x0092:
            com.google.android.gms.internal.places.zzbk r8 = com.google.android.gms.internal.places.zzbk.m63366e()
            throw r8
        L_0x0097:
            com.google.android.gms.internal.places.zzbk r8 = com.google.android.gms.internal.places.zzbk.m63362a()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.m63485r(java.lang.Object, byte[], int, int, int, long, com.google.android.gms.internal.places.zzr):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r2 + 8;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m63486t(byte[] r1, int r2, int r3, com.google.android.gms.internal.places.zzef r4, java.lang.Class<?> r5, com.google.android.gms.internal.places.zzr r6) throws java.io.IOException {
        /*
            int[] r0 = com.google.android.gms.internal.places.zzcn.f45322a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = com.google.android.gms.internal.places.zzs.m63855p(r1, r2, r6)
            goto L_0x00ae
        L_0x0019:
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r1, r2, r6)
            long r2 = r6.f45465b
            long r2 = com.google.android.gms.internal.places.zzai.m63091b(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f45466c = r2
            goto L_0x00ae
        L_0x002b:
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r1, r2, r6)
            int r2 = r6.f45464a
            int r2 = com.google.android.gms.internal.places.zzai.m63093e(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f45466c = r2
            goto L_0x00ae
        L_0x003d:
            com.google.android.gms.internal.places.zzcv r4 = com.google.android.gms.internal.places.zzcv.m63517a()
            com.google.android.gms.internal.places.zzda r4 = r4.mo53547b(r5)
            int r1 = com.google.android.gms.internal.places.zzs.m63846g(r4, r1, r2, r3, r6)
            goto L_0x00ae
        L_0x004a:
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r1, r2, r6)
            long r2 = r6.f45465b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f45466c = r2
            goto L_0x00ae
        L_0x0057:
            int r1 = com.google.android.gms.internal.places.zzs.m63849j(r1, r2, r6)
            int r2 = r6.f45464a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f45466c = r2
            goto L_0x00ae
        L_0x0064:
            float r1 = com.google.android.gms.internal.places.zzs.m63854o(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f45466c = r1
            goto L_0x0084
        L_0x006f:
            long r3 = com.google.android.gms.internal.places.zzs.m63851l(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f45466c = r1
            goto L_0x0091
        L_0x007a:
            int r1 = com.google.android.gms.internal.places.zzs.m63847h(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f45466c = r1
        L_0x0084:
            int r1 = r2 + 4
            goto L_0x00ae
        L_0x0087:
            double r3 = com.google.android.gms.internal.places.zzs.m63852m(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f45466c = r1
        L_0x0091:
            int r1 = r2 + 8
            goto L_0x00ae
        L_0x0094:
            int r1 = com.google.android.gms.internal.places.zzs.m63856q(r1, r2, r6)
            goto L_0x00ae
        L_0x0099:
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r1, r2, r6)
            long r2 = r6.f45465b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            r2 = 1
            goto L_0x00a8
        L_0x00a7:
            r2 = 0
        L_0x00a8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f45466c = r2
        L_0x00ae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.m63486t(byte[], int, int, com.google.android.gms.internal.places.zzef, java.lang.Class, com.google.android.gms.internal.places.zzr):int");
    }

    /* renamed from: u */
    static <T> zzco<T> m63487u(Class<T> cls, zzci zzci, zzcs zzcs, zzbu zzbu, zzds<?, ?> zzds, zzar<?> zzar, zzcd zzcd) {
        int i;
        char c;
        int[] iArr;
        char c2;
        int i2;
        char c3;
        char c4;
        char c5;
        char c6;
        int i3;
        boolean z;
        int i4;
        zzcx zzcx;
        int i5;
        Class<?> cls2;
        int i6;
        String str;
        int i7;
        int i8;
        char c7;
        char c8;
        Field field;
        int i9;
        char charAt;
        int i10;
        Field field2;
        Field field3;
        int i11;
        char charAt2;
        int i12;
        char charAt3;
        int i13;
        char charAt4;
        int i14;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i20;
        char charAt10;
        int i21;
        char charAt11;
        int i22;
        char charAt12;
        int i23;
        char charAt13;
        char charAt14;
        zzci zzci2 = zzci;
        if (zzci2 instanceof zzcx) {
            zzcx zzcx2 = (zzcx) zzci2;
            char c9 = 0;
            boolean z2 = zzcx2.mo53532c() == zzbc.zze.f45271j;
            String d = zzcx2.mo53549d();
            int length = d.length();
            char charAt15 = d.charAt(0);
            if (charAt15 >= 55296) {
                char c10 = charAt15 & 8191;
                int i24 = 1;
                int i25 = 13;
                while (true) {
                    i = i24 + 1;
                    charAt14 = d.charAt(i24);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c10 |= (charAt14 & 8191) << i25;
                    i25 += 13;
                    i24 = i;
                }
                charAt15 = c10 | (charAt14 << i25);
            } else {
                i = 1;
            }
            int i26 = i + 1;
            char charAt16 = d.charAt(i);
            if (charAt16 >= 55296) {
                char c11 = charAt16 & 8191;
                int i27 = 13;
                while (true) {
                    i23 = i26 + 1;
                    charAt13 = d.charAt(i26);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c11 |= (charAt13 & 8191) << i27;
                    i27 += 13;
                    i26 = i23;
                }
                charAt16 = c11 | (charAt13 << i27);
                i26 = i23;
            }
            if (charAt16 == 0) {
                iArr = f45323r;
                c5 = 0;
                c4 = 0;
                c3 = 0;
                i2 = 0;
                c2 = 0;
                c = 0;
            } else {
                int i28 = i26 + 1;
                char charAt17 = d.charAt(i26);
                if (charAt17 >= 55296) {
                    char c12 = charAt17 & 8191;
                    int i29 = 13;
                    while (true) {
                        i22 = i28 + 1;
                        charAt12 = d.charAt(i28);
                        if (charAt12 < 55296) {
                            break;
                        }
                        c12 |= (charAt12 & 8191) << i29;
                        i29 += 13;
                        i28 = i22;
                    }
                    charAt17 = c12 | (charAt12 << i29);
                    i28 = i22;
                }
                int i30 = i28 + 1;
                char charAt18 = d.charAt(i28);
                if (charAt18 >= 55296) {
                    char c13 = charAt18 & 8191;
                    int i31 = 13;
                    while (true) {
                        i21 = i30 + 1;
                        charAt11 = d.charAt(i30);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c13 |= (charAt11 & 8191) << i31;
                        i31 += 13;
                        i30 = i21;
                    }
                    charAt18 = c13 | (charAt11 << i31);
                    i30 = i21;
                }
                int i32 = i30 + 1;
                c3 = d.charAt(i30);
                if (c3 >= 55296) {
                    char c14 = c3 & 8191;
                    int i33 = 13;
                    while (true) {
                        i20 = i32 + 1;
                        charAt10 = d.charAt(i32);
                        if (charAt10 < 55296) {
                            break;
                        }
                        c14 |= (charAt10 & 8191) << i33;
                        i33 += 13;
                        i32 = i20;
                    }
                    c3 = c14 | (charAt10 << i33);
                    i32 = i20;
                }
                int i34 = i32 + 1;
                char charAt19 = d.charAt(i32);
                if (charAt19 >= 55296) {
                    char c15 = charAt19 & 8191;
                    int i35 = 13;
                    while (true) {
                        i19 = i34 + 1;
                        charAt9 = d.charAt(i34);
                        if (charAt9 < 55296) {
                            break;
                        }
                        c15 |= (charAt9 & 8191) << i35;
                        i35 += 13;
                        i34 = i19;
                    }
                    charAt19 = c15 | (charAt9 << i35);
                    i34 = i19;
                }
                int i36 = i34 + 1;
                c2 = d.charAt(i34);
                if (c2 >= 55296) {
                    char c16 = c2 & 8191;
                    int i37 = 13;
                    while (true) {
                        i18 = i36 + 1;
                        charAt8 = d.charAt(i36);
                        if (charAt8 < 55296) {
                            break;
                        }
                        c16 |= (charAt8 & 8191) << i37;
                        i37 += 13;
                        i36 = i18;
                    }
                    c2 = c16 | (charAt8 << i37);
                    i36 = i18;
                }
                int i38 = i36 + 1;
                char charAt20 = d.charAt(i36);
                if (charAt20 >= 55296) {
                    char c17 = charAt20 & 8191;
                    int i39 = 13;
                    while (true) {
                        i17 = i38 + 1;
                        charAt7 = d.charAt(i38);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c17 |= (charAt7 & 8191) << i39;
                        i39 += 13;
                        i38 = i17;
                    }
                    charAt20 = c17 | (charAt7 << i39);
                    i38 = i17;
                }
                int i40 = i38 + 1;
                char charAt21 = d.charAt(i38);
                if (charAt21 >= 55296) {
                    char c18 = charAt21 & 8191;
                    int i41 = i40;
                    int i42 = 13;
                    while (true) {
                        i16 = i41 + 1;
                        charAt6 = d.charAt(i41);
                        if (charAt6 < 55296) {
                            break;
                        }
                        c18 |= (charAt6 & 8191) << i42;
                        i42 += 13;
                        i41 = i16;
                    }
                    charAt21 = c18 | (charAt6 << i42);
                    i14 = i16;
                } else {
                    i14 = i40;
                }
                int i43 = i14 + 1;
                char charAt22 = d.charAt(i14);
                if (charAt22 >= 55296) {
                    char c19 = charAt22 & 8191;
                    int i44 = i43;
                    int i45 = 13;
                    while (true) {
                        i15 = i44 + 1;
                        charAt5 = d.charAt(i44);
                        if (charAt5 < 55296) {
                            break;
                        }
                        c19 |= (charAt5 & 8191) << i45;
                        i45 += 13;
                        i44 = i15;
                    }
                    charAt22 = c19 | (charAt5 << i45);
                    i43 = i15;
                }
                int i46 = (charAt17 << 1) + charAt18;
                c4 = charAt19;
                i2 = i46;
                c = charAt22;
                c9 = charAt17;
                i26 = i43;
                char c20 = charAt20;
                iArr = new int[(charAt22 + charAt20 + charAt21)];
                c5 = c20;
            }
            Unsafe unsafe = f45324s;
            Object[] e = zzcx2.mo53550e();
            Class<?> cls3 = zzcx2.mo53531b().getClass();
            int i47 = i26;
            int[] iArr2 = new int[(c2 * 3)];
            Object[] objArr = new Object[(c2 << 1)];
            int i48 = c + c5;
            char c21 = c;
            int i49 = i47;
            int i50 = i48;
            int i51 = 0;
            int i52 = 0;
            while (i49 < length) {
                int i53 = i49 + 1;
                int charAt23 = d.charAt(i49);
                int i54 = length;
                if (charAt23 >= 55296) {
                    int i55 = charAt23 & 8191;
                    int i56 = i53;
                    int i57 = 13;
                    while (true) {
                        i13 = i56 + 1;
                        charAt4 = d.charAt(i56);
                        c6 = c;
                        if (charAt4 < 55296) {
                            break;
                        }
                        i55 |= (charAt4 & 8191) << i57;
                        i57 += 13;
                        i56 = i13;
                        c = c6;
                    }
                    charAt23 = i55 | (charAt4 << i57);
                    i3 = i13;
                } else {
                    c6 = c;
                    i3 = i53;
                }
                int i58 = i3 + 1;
                char charAt24 = d.charAt(i3);
                int i59 = i58;
                if (charAt24 >= 55296) {
                    char c22 = charAt24 & 8191;
                    int i60 = i59;
                    int i61 = 13;
                    while (true) {
                        i12 = i60 + 1;
                        charAt3 = d.charAt(i60);
                        z = z2;
                        if (charAt3 < 55296) {
                            break;
                        }
                        c22 |= (charAt3 & 8191) << i61;
                        i61 += 13;
                        i60 = i12;
                        z2 = z;
                    }
                    charAt24 = c22 | (charAt3 << i61);
                    i4 = i12;
                } else {
                    z = z2;
                    i4 = i59;
                }
                char c23 = charAt24 & 255;
                char c24 = c4;
                if ((charAt24 & 1024) != 0) {
                    iArr[i51] = i52;
                    i51++;
                }
                char c25 = c3;
                if (c23 >= '3') {
                    int i62 = i4 + 1;
                    char charAt25 = d.charAt(i4);
                    char c26 = 55296;
                    if (charAt25 >= 55296) {
                        char c27 = charAt25 & 8191;
                        int i63 = 13;
                        while (true) {
                            i11 = i62 + 1;
                            charAt2 = d.charAt(i62);
                            if (charAt2 < c26) {
                                break;
                            }
                            c27 |= (charAt2 & 8191) << i63;
                            i63 += 13;
                            i62 = i11;
                            c26 = 55296;
                        }
                        charAt25 = c27 | (charAt2 << i63);
                        i62 = i11;
                    }
                    int i64 = c23 - '3';
                    int i65 = i62;
                    if (i64 == 9 || i64 == 17) {
                        objArr[((i52 / 3) << 1) + 1] = e[i2];
                        i2++;
                    } else if (i64 == 12 && (charAt15 & 1) == 1) {
                        objArr[((i52 / 3) << 1) + 1] = e[i2];
                        i2++;
                    }
                    int i66 = charAt25 << 1;
                    Object obj = e[i66];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = m63489w(cls3, (String) obj);
                        e[i66] = field2;
                    }
                    zzcx = zzcx2;
                    String str2 = d;
                    i8 = (int) unsafe.objectFieldOffset(field2);
                    int i67 = i66 + 1;
                    Object obj2 = e[i67];
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = m63489w(cls3, (String) obj2);
                        e[i67] = field3;
                    }
                    cls2 = cls3;
                    i5 = i2;
                    i4 = i65;
                    str = str2;
                    i6 = 0;
                    i7 = (int) unsafe.objectFieldOffset(field3);
                    c7 = c9;
                } else {
                    zzcx = zzcx2;
                    String str3 = d;
                    int i68 = i2 + 1;
                    Field w = m63489w(cls3, (String) e[i2]);
                    if (c23 == 9 || c23 == 17) {
                        c8 = 1;
                        objArr[((i52 / 3) << 1) + 1] = w.getType();
                    } else {
                        if (c23 == 27 || c23 == '1') {
                            c8 = 1;
                            i10 = i68 + 1;
                            objArr[((i52 / 3) << 1) + 1] = e[i68];
                        } else if (c23 == 12 || c23 == 30 || c23 == ',') {
                            c8 = 1;
                            if ((charAt15 & 1) == 1) {
                                i10 = i68 + 1;
                                objArr[((i52 / 3) << 1) + 1] = e[i68];
                            }
                        } else {
                            if (c23 == '2') {
                                int i69 = c21 + 1;
                                iArr[c21] = i52;
                                int i70 = (i52 / 3) << 1;
                                int i71 = i68 + 1;
                                objArr[i70] = e[i68];
                                if ((charAt24 & 2048) != 0) {
                                    i68 = i71 + 1;
                                    objArr[i70 + 1] = e[i71];
                                    c21 = i69;
                                } else {
                                    i68 = i71;
                                    c8 = 1;
                                    c21 = i69;
                                }
                            }
                            c8 = 1;
                        }
                        i68 = i10;
                    }
                    i8 = (int) unsafe.objectFieldOffset(w);
                    if ((charAt15 & 1) != c8 || c23 > 17) {
                        i5 = i68;
                        c7 = c9;
                        cls2 = cls3;
                        str = str3;
                        i7 = 0;
                        i6 = 0;
                    } else {
                        int i72 = i4 + 1;
                        str = str3;
                        char charAt26 = str.charAt(i4);
                        if (charAt26 >= 55296) {
                            char c28 = charAt26 & 8191;
                            int i73 = 13;
                            while (true) {
                                i9 = i72 + 1;
                                charAt = str.charAt(i72);
                                if (charAt < 55296) {
                                    break;
                                }
                                c28 |= (charAt & 8191) << i73;
                                i73 += 13;
                                i72 = i9;
                            }
                            charAt26 = c28 | (charAt << i73);
                            i72 = i9;
                        }
                        int i74 = (c9 << 1) + (charAt26 / ' ');
                        Object obj3 = e[i74];
                        i5 = i68;
                        if (obj3 instanceof Field) {
                            field = (Field) obj3;
                        } else {
                            field = m63489w(cls3, (String) obj3);
                            e[i74] = field;
                        }
                        c7 = c9;
                        cls2 = cls3;
                        i7 = (int) unsafe.objectFieldOffset(field);
                        i6 = charAt26 % ' ';
                        i4 = i72;
                    }
                    if (c23 >= 18 && c23 <= '1') {
                        iArr[i50] = i8;
                        i50++;
                    }
                }
                int i75 = i52 + 1;
                iArr2[i52] = charAt23;
                int i76 = i75 + 1;
                iArr2[i75] = i8 | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (c23 << 20);
                i52 = i76 + 1;
                iArr2[i76] = (i6 << 20) | i7;
                c9 = c7;
                d = str;
                i49 = i4;
                cls3 = cls2;
                c4 = c24;
                length = i54;
                c = c6;
                z2 = z;
                c3 = c25;
                i2 = i5;
                zzcx2 = zzcx;
            }
            char c29 = c4;
            boolean z3 = z2;
            return new zzco(iArr2, objArr, c3, c4, zzcx2.mo53531b(), z2, false, iArr, c, i48, zzcs, zzbu, zzds, zzar, zzcd);
        }
        ((zzdl) zzci2).mo53532c();
        int i77 = zzbc.zze.f45271j;
        throw new NoSuchMethodError();
    }

    /* renamed from: v */
    private final <K, V, UT, UB> UB m63488v(int i, int i2, Map<K, V> map, zzbf zzbf, UB ub, zzds<UT, UB> zzds) {
        zzcb<?, ?> c = this.f45341q.mo53513c(m63477j(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!zzbf.mo53472a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzds.mo53608f();
                }
                zzae w = zzw.m63869w(zzcc.m63410a(c, next.getKey(), next.getValue()));
                try {
                    zzcc.m63411b(w.mo53308b(), c, next.getKey(), next.getValue());
                    zzds.mo53604b(ub, i2, w.mo53307a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: w */
    private static Field m63489w(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: x */
    private static void m63490x(int i, Object obj, zzel zzel) throws IOException {
        if (obj instanceof String) {
            zzel.mo53359E(i, (String) obj);
        } else {
            zzel.mo53391v(i, (zzw) obj);
        }
    }

    /* renamed from: y */
    private static <UT, UB> void m63491y(zzds<UT, UB> zzds, T t, zzel zzel) throws IOException {
        zzds.mo53605c(zzds.mo53613k(t), zzel);
    }

    /* renamed from: z */
    private final <K, V> void m63492z(zzel zzel, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzel.mo53382n(i, this.f45341q.mo53513c(m63477j(i2)), this.f45341q.mo53517g(obj));
        }
    }

    /* renamed from: a */
    public final void mo53535a(T t) {
        int i;
        int i2 = this.f45335k;
        while (true) {
            i = this.f45336l;
            if (i2 >= i) {
                break;
            }
            long l = (long) (m63479l(this.f45334j[i2]) & 1048575);
            Object G = zzdy.m63667G(t, l);
            if (G != null) {
                zzdy.m63682g(t, l, this.f45341q.mo53514d(G));
            }
            i2++;
        }
        int length = this.f45334j.length;
        while (i < length) {
            this.f45338n.mo53500a(t, (long) this.f45334j[i]);
            i++;
        }
        this.f45339o.mo53606d(t);
        if (this.f45330f) {
            this.f45340p.mo53416f(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo53536b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f45325a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.m63479l(r1)
            int[] r4 = r8.f45325a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0228
        L_0x0020:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m63471O(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m63470N(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m63471O(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m63470N(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m63470N(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m63470N(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = m63472P(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63345f(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m63470N(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m63471O(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = m63470N(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m63471O(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = m63471O(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = m63469M(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.m63459C(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = m63468L(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.m63663C(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.m63661A(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.m63663C(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.m63661A(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.m63661A(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.m63661A(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.places.zzdy.m63664D(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63345f(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.m63661A(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.m63663C(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.places.zzdy.m63661A(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.m63663C(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.places.zzdy.m63663C(r9, r5)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.places.zzdy.m63665E(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.places.zzdy.m63666F(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.places.zzbd.m63349j(r3)
        L_0x0227:
            int r2 = r2 + r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r8.f45339o
            java.lang.Object r0 = r0.mo53613k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f45330f
            if (r0 == 0) goto L_0x024a
            int r2 = r2 * 53
            com.google.android.gms.internal.places.zzar<?> r0 = r8.f45340p
            com.google.android.gms.internal.places.zzav r9 = r0.mo53412b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.mo53536b(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.places.zzdc.m63607y(com.google.android.gms.internal.places.zzdy.m63667G(r10, r6), com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63663C(r10, r6) == com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63661A(r10, r6) == com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63663C(r10, r6) == com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63661A(r10, r6) == com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63661A(r10, r6) == com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63661A(r10, r6) == com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.places.zzdc.m63607y(com.google.android.gms.internal.places.zzdy.m63667G(r10, r6), com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.places.zzdc.m63607y(com.google.android.gms.internal.places.zzdy.m63667G(r10, r6), com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.places.zzdc.m63607y(com.google.android.gms.internal.places.zzdy.m63667G(r10, r6), com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63664D(r10, r6) == com.google.android.gms.internal.places.zzdy.m63664D(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63661A(r10, r6) == com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63663C(r10, r6) == com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63661A(r10, r6) == com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63663C(r10, r6) == com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.places.zzdy.m63663C(r10, r6) == com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.places.zzdy.m63665E(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.places.zzdy.m63665E(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.places.zzdy.m63666F(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.places.zzdy.m63666F(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.places.zzdc.m63607y(com.google.android.gms.internal.places.zzdy.m63667G(r10, r6), com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)) != false) goto L_0x01c2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53537c(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f45325a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.m63479l(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.m63480m(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.places.zzdy.m63661A(r10, r4)
            int r4 = com.google.android.gms.internal.places.zzdy.m63661A(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.m63667G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.m63607y(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)
            boolean r3 = com.google.android.gms.internal.places.zzdc.m63607y(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.places.zzdy.m63667G(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)
            boolean r3 = com.google.android.gms.internal.places.zzdc.m63607y(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.m63667G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.m63607y(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.m63663C(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.m63661A(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.m63663C(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.m63661A(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.m63661A(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.m63661A(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.m63667G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.m63607y(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.m63667G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.m63607y(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.places.zzdy.m63667G(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r11, r6)
            boolean r4 = com.google.android.gms.internal.places.zzdc.m63607y(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.places.zzdy.m63664D(r10, r6)
            boolean r5 = com.google.android.gms.internal.places.zzdy.m63664D(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.m63661A(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.m63663C(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.places.zzdy.m63661A(r10, r6)
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.m63663C(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.places.zzdy.m63663C(r10, r6)
            long r6 = com.google.android.gms.internal.places.zzdy.m63663C(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.places.zzdy.m63665E(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.places.zzdy.m63665E(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.m63466J(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.places.zzdy.m63666F(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.places.zzdy.m63666F(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r9.f45339o
            java.lang.Object r0 = r0.mo53613k(r10)
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r9.f45339o
            java.lang.Object r2 = r2.mo53613k(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f45330f
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.places.zzar<?> r0 = r9.f45340p
            com.google.android.gms.internal.places.zzav r10 = r0.mo53412b(r10)
            com.google.android.gms.internal.places.zzar<?> r0 = r9.f45340p
            com.google.android.gms.internal.places.zzav r11 = r0.mo53412b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.mo53537c(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e2, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x020f, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022e, code lost:
        if (r0 == r15) goto L_0x0230;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53538d(T r28, byte[] r29, int r30, int r31, com.google.android.gms.internal.places.zzr r32) throws java.io.IOException {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            boolean r0 = r15.f45332h
            if (r0 == 0) goto L_0x025d
            sun.misc.Unsafe r9 = f45324s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = -1
            r2 = 0
        L_0x0017:
            if (r0 >= r13) goto L_0x0254
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.places.zzs.m63843d(r0, r12, r3, r11)
            int r3 = r11.f45464a
            r8 = r0
            r17 = r3
            goto L_0x002c
        L_0x0029:
            r17 = r0
            r8 = r3
        L_0x002c:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0039
            int r2 = r2 / 3
            int r0 = r15.m63474R(r7, r2)
            goto L_0x003d
        L_0x0039:
            int r0 = r15.m63481n(r7)
        L_0x003d:
            r4 = r0
            if (r4 != r10) goto L_0x004b
            r24 = r7
            r2 = r8
            r18 = r9
            r19 = 0
            r26 = -1
            goto L_0x0231
        L_0x004b:
            int[] r0 = r15.f45325a
            int r1 = r4 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r3 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r1 = (long) r0
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0167
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014e;
                case 1: goto L_0x013f;
                case 2: goto L_0x012d;
                case 3: goto L_0x012d;
                case 4: goto L_0x011f;
                case 5: goto L_0x010f;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00a3;
                case 11: goto L_0x011f;
                case 12: goto L_0x0094;
                case 13: goto L_0x00fe;
                case 14: goto L_0x010f;
                case 15: goto L_0x0081;
                case 16: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x01a4
        L_0x0066:
            if (r6 != 0) goto L_0x01a4
            int r6 = com.google.android.gms.internal.places.zzs.m63850k(r12, r8, r11)
            r19 = r1
            long r0 = r11.f45465b
            long r21 = com.google.android.gms.internal.places.zzai.m63091b(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x013d
        L_0x0081:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.places.zzs.m63849j(r12, r8, r11)
            int r1 = r11.f45464a
            int r1 = com.google.android.gms.internal.places.zzai.m63093e(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x0094:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.places.zzs.m63849j(r12, r8, r11)
            int r1 = r11.f45464a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x00a3:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            int r0 = com.google.android.gms.internal.places.zzs.m63856q(r12, r8, r11)
            java.lang.Object r1 = r11.f45466c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00b0:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            com.google.android.gms.internal.places.zzda r0 = r15.m63476i(r4)
            int r0 = com.google.android.gms.internal.places.zzs.m63846g(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c7
            java.lang.Object r1 = r11.f45466c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00c7:
            java.lang.Object r5 = r11.f45466c
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.m63343d(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00d1:
            r2 = r1
            if (r6 != r10) goto L_0x01a4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00de
            int r0 = com.google.android.gms.internal.places.zzs.m63853n(r12, r8, r11)
            goto L_0x00e2
        L_0x00de:
            int r0 = com.google.android.gms.internal.places.zzs.m63855p(r12, r8, r11)
        L_0x00e2:
            java.lang.Object r1 = r11.f45466c
            r9.putObject(r14, r2, r1)
            goto L_0x010b
        L_0x00e8:
            r2 = r1
            if (r6 != 0) goto L_0x01a4
            int r1 = com.google.android.gms.internal.places.zzs.m63850k(r12, r8, r11)
            long r5 = r11.f45465b
            r19 = 0
            int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r8 == 0) goto L_0x00f8
            goto L_0x00f9
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            com.google.android.gms.internal.places.zzdy.m63683h(r14, r2, r0)
            r0 = r1
            goto L_0x010b
        L_0x00fe:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a4
            int r0 = com.google.android.gms.internal.places.zzs.m63847h(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x010b:
            r2 = r4
            r1 = r7
            goto L_0x0251
        L_0x010f:
            r2 = r1
            if (r6 != r0) goto L_0x01a4
            long r5 = com.google.android.gms.internal.places.zzs.m63851l(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0159
        L_0x011f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r0 = com.google.android.gms.internal.places.zzs.m63849j(r12, r8, r11)
            int r1 = r11.f45464a
            r9.putInt(r14, r2, r1)
            goto L_0x015b
        L_0x012d:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015f
            int r6 = com.google.android.gms.internal.places.zzs.m63850k(r12, r8, r11)
            long r4 = r11.f45465b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x013d:
            r0 = r6
            goto L_0x015b
        L_0x013f:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015f
            float r0 = com.google.android.gms.internal.places.zzs.m63854o(r12, r8)
            com.google.android.gms.internal.places.zzdy.m63679d(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x015b
        L_0x014e:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015f
            double r0 = com.google.android.gms.internal.places.zzs.m63852m(r12, r8)
            com.google.android.gms.internal.places.zzdy.m63678c(r14, r2, r0)
        L_0x0159:
            int r0 = r8 + 8
        L_0x015b:
            r1 = r7
            r2 = r10
            goto L_0x0251
        L_0x015f:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01ab
        L_0x0167:
            r0 = 27
            if (r3 != r0) goto L_0x01af
            if (r6 != r10) goto L_0x01a4
            java.lang.Object r0 = r9.getObject(r14, r1)
            com.google.android.gms.internal.places.zzbh r0 = (com.google.android.gms.internal.places.zzbh) r0
            boolean r3 = r0.mo53474N()
            if (r3 != 0) goto L_0x018b
            int r3 = r0.size()
            if (r3 != 0) goto L_0x0182
            r3 = 10
            goto L_0x0184
        L_0x0182:
            int r3 = r3 << 1
        L_0x0184:
            com.google.android.gms.internal.places.zzbh r0 = r0.mo53396E(r3)
            r9.putObject(r14, r1, r0)
        L_0x018b:
            r5 = r0
            com.google.android.gms.internal.places.zzda r0 = r15.m63476i(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = com.google.android.gms.internal.places.zzs.m63844e(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0251
        L_0x01a4:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01ab:
            r26 = -1
            goto L_0x0212
        L_0x01af:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e5
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.m63484q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x01e5:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0214
            r7 = r30
            if (r7 != r10) goto L_0x0212
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.m63485r(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0241
            goto L_0x0230
        L_0x0212:
            r2 = r15
            goto L_0x0231
        L_0x0214:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.m63483p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0241
        L_0x0230:
            r2 = r0
        L_0x0231:
            com.google.android.gms.internal.places.zzdr r4 = m63473Q(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = com.google.android.gms.internal.places.zzs.m63841b(r0, r1, r2, r3, r4, r5)
        L_0x0241:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
        L_0x0251:
            r10 = -1
            goto L_0x0017
        L_0x0254:
            r4 = r13
            if (r0 != r4) goto L_0x0258
            return
        L_0x0258:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.m63366e()
            throw r0
        L_0x025d:
            r4 = r13
            r5 = 0
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r6 = r32
            r0.mo53544s(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.mo53538d(java.lang.Object, byte[], int, int, com.google.android.gms.internal.places.zzr):void");
    }

    /* renamed from: e */
    public final boolean mo53539e(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.f45335k) {
                return !this.f45330f || this.f45340p.mo53412b(t).mo53420c();
            }
            int i5 = this.f45334j[i3];
            int i6 = this.f45325a[i5];
            int l = m63479l(i5);
            if (!this.f45332h) {
                int i7 = this.f45325a[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = f45324s.getInt(t, (long) i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if (((268435456 & l) != 0) && !m63460D(t, i5, i4, i)) {
                return false;
            }
            int i9 = (267386880 & l) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (m63459C(t, i6, i5) && !m63461E(t, l, m63476i(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> g = this.f45341q.mo53517g(zzdy.m63667G(t, (long) (l & 1048575)));
                            if (!g.isEmpty()) {
                                if (this.f45341q.mo53513c(m63477j(i5)).f45317c.mo53648b() == zzem.MESSAGE) {
                                    zzda<?> zzda = null;
                                    Iterator<?> it = g.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (zzda == null) {
                                            zzda = zzcv.m63517a().mo53547b(next.getClass());
                                        }
                                        if (!zzda.mo53539e(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzdy.m63667G(t, (long) (l & 1048575));
                if (!list.isEmpty()) {
                    zzda i10 = m63476i(i5);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!i10.mo53539e(list.get(i11))) {
                            z = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (m63460D(t, i5, i4, i) && !m63461E(t, l, m63476i(i5))) {
                return false;
            }
            i3++;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0831, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x08fc, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x090d, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x0955, code lost:
        r6 = r6 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0a06, code lost:
        r6 = r6 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a2a, code lost:
        r5 = r5 + 3;
        r9 = r13;
        r8 = 1;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo53540f(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f45332h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x04f2
            sun.misc.Unsafe r2 = f45324s
            r12 = 0
            r13 = 0
        L_0x0016:
            int[] r14 = r0.f45325a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x04ea
            int r14 = r0.m63479l(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f45325a
            r3 = r3[r12]
            r14 = r14 & r7
            long r5 = (long) r14
            com.google.android.gms.internal.places.zzaw r14 = com.google.android.gms.internal.places.zzaw.DOUBLE_LIST_PACKED
            int r14 = r14.mo53428b()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.places.zzaw r14 = com.google.android.gms.internal.places.zzaw.SINT64_LIST_PACKED
            int r14 = r14.mo53428b()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f45325a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r7
            goto L_0x0042
        L_0x0041:
            r14 = 0
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x04d6;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04ba;
                case 3: goto L_0x04aa;
                case 4: goto L_0x049a;
                case 5: goto L_0x048e;
                case 6: goto L_0x0482;
                case 7: goto L_0x0476;
                case 8: goto L_0x0458;
                case 9: goto L_0x0444;
                case 10: goto L_0x0433;
                case 11: goto L_0x0424;
                case 12: goto L_0x0415;
                case 13: goto L_0x040a;
                case 14: goto L_0x03ff;
                case 15: goto L_0x03f0;
                case 16: goto L_0x03e1;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c1;
                case 19: goto L_0x03b8;
                case 20: goto L_0x03af;
                case 21: goto L_0x03a6;
                case 22: goto L_0x039d;
                case 23: goto L_0x0394;
                case 24: goto L_0x038b;
                case 25: goto L_0x0382;
                case 26: goto L_0x0379;
                case 27: goto L_0x036c;
                case 28: goto L_0x0363;
                case 29: goto L_0x035a;
                case 30: goto L_0x0350;
                case 31: goto L_0x0346;
                case 32: goto L_0x033c;
                case 33: goto L_0x0332;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0239;
                case 43: goto L_0x021b;
                case 44: goto L_0x01fd;
                case 45: goto L_0x01df;
                case 46: goto L_0x01c1;
                case 47: goto L_0x01a3;
                case 48: goto L_0x0185;
                case 49: goto L_0x0177;
                case 50: goto L_0x0167;
                case 51: goto L_0x0159;
                case 52: goto L_0x014d;
                case 53: goto L_0x013d;
                case 54: goto L_0x012d;
                case 55: goto L_0x011d;
                case 56: goto L_0x0111;
                case 57: goto L_0x0105;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00db;
                case 60: goto L_0x00c7;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a5;
                case 63: goto L_0x0095;
                case 64: goto L_0x0089;
                case 65: goto L_0x007d;
                case 66: goto L_0x006d;
                case 67: goto L_0x005d;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x04e4
        L_0x0047:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            com.google.android.gms.internal.places.zzck r5 = (com.google.android.gms.internal.places.zzck) r5
            com.google.android.gms.internal.places.zzda r6 = r0.m63476i(r12)
            int r3 = com.google.android.gms.internal.places.zzaj.m63101G(r3, r5, r6)
            goto L_0x03c9
        L_0x005d:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m63471O(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63113b0(r3, r5)
            goto L_0x03c9
        L_0x006d:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m63470N(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63125k0(r3, r5)
            goto L_0x03c9
        L_0x007d:
            boolean r5 = r0.m63459C(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63123i0(r3, r9)
            goto L_0x03c9
        L_0x0089:
            boolean r5 = r0.m63459C(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63131q0(r3, r11)
            goto L_0x03c9
        L_0x0095:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m63470N(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63133r0(r3, r5)
            goto L_0x03c9
        L_0x00a5:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m63470N(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63122h0(r3, r5)
            goto L_0x03c9
        L_0x00b5:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.m63102H(r3, r5)
            goto L_0x03c9
        L_0x00c7:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.m63476i(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.m63595m(r3, r5, r6)
            goto L_0x03c9
        L_0x00db:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.places.zzw
            if (r6 == 0) goto L_0x00f1
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.m63102H(r3, r5)
            goto L_0x03c9
        L_0x00f1:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.places.zzaj.m63138w(r3, r5)
            goto L_0x03c9
        L_0x00f9:
            boolean r5 = r0.m63459C(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63103I(r3, r8)
            goto L_0x03c9
        L_0x0105:
            boolean r5 = r0.m63459C(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63127n0(r3, r11)
            goto L_0x03c9
        L_0x0111:
            boolean r5 = r0.m63459C(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63120f0(r3, r9)
            goto L_0x03c9
        L_0x011d:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = m63470N(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63118e0(r3, r5)
            goto L_0x03c9
        L_0x012d:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m63471O(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63111Y(r3, r5)
            goto L_0x03c9
        L_0x013d:
            boolean r14 = r0.m63459C(r1, r3, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = m63471O(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63108S(r3, r5)
            goto L_0x03c9
        L_0x014d:
            boolean r5 = r0.m63459C(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63134s(r3, r4)
            goto L_0x03c9
        L_0x0159:
            boolean r5 = r0.m63459C(r1, r3, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.places.zzaj.m63132r(r3, r5)
            goto L_0x03c9
        L_0x0167:
            com.google.android.gms.internal.places.zzcd r14 = r0.f45341q
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            java.lang.Object r6 = r0.m63477j(r12)
            int r3 = r14.mo53511a(r3, r5, r6)
            goto L_0x03c9
        L_0x0177:
            java.util.List r5 = m63467K(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.m63476i(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.m63604v(r3, r5, r6)
            goto L_0x03c9
        L_0x0185:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63555C(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x0199
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0199:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x01a3:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63564L(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x01b7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01b7:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x01c1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63568P(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x01d5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01d5:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x01df:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63566N(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x01f3
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x01f3:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x01fd:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63558F(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x0211
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0211:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x021b:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63562J(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x022f
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x022f:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x0239:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63570R(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x024d
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x024d:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63566N(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x026b
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x026b:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63568P(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x0289
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x0289:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63560H(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x02a7
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02a7:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63608z(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x02c5
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02c5:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63605w(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x02e2
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02e2:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63566N(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x02ff
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x02ff:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r5 = r2.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.places.zzdc.m63568P(r5)
            if (r5 <= 0) goto L_0x04e4
            boolean r6 = r0.f45333i
            if (r6 == 0) goto L_0x031c
            long r14 = (long) r14
            r2.putInt(r1, r14, r5)
        L_0x031c:
            int r3 = com.google.android.gms.internal.places.zzaj.m63139w0(r3)
            int r6 = com.google.android.gms.internal.places.zzaj.m63143y0(r5)
        L_0x0324:
            int r3 = r3 + r6
            int r3 = r3 + r5
            goto L_0x03c9
        L_0x0328:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63575W(r3, r5, r11)
            goto L_0x03c9
        L_0x0332:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63580a0(r3, r5, r11)
            goto L_0x03c9
        L_0x033c:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63584c0(r3, r5, r11)
            goto L_0x03c9
        L_0x0346:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63582b0(r3, r5, r11)
            goto L_0x03c9
        L_0x0350:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63576X(r3, r5, r11)
            goto L_0x03c9
        L_0x035a:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63578Z(r3, r5, r11)
            goto L_0x03c9
        L_0x0363:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63603u(r3, r5)
            goto L_0x03c9
        L_0x036c:
            java.util.List r5 = m63467K(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.m63476i(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.m63597o(r3, r5, r6)
            goto L_0x03c9
        L_0x0379:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63596n(r3, r5)
            goto L_0x03c9
        L_0x0382:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63586d0(r3, r5, r11)
            goto L_0x03c9
        L_0x038b:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63582b0(r3, r5, r11)
            goto L_0x03c9
        L_0x0394:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63584c0(r3, r5, r11)
            goto L_0x03c9
        L_0x039d:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63577Y(r3, r5, r11)
            goto L_0x03c9
        L_0x03a6:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63574V(r3, r5, r11)
            goto L_0x03c9
        L_0x03af:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63573U(r3, r5, r11)
            goto L_0x03c9
        L_0x03b8:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63582b0(r3, r5, r11)
            goto L_0x03c9
        L_0x03c1:
            java.util.List r5 = m63467K(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzdc.m63584c0(r3, r5, r11)
        L_0x03c9:
            int r13 = r13 + r3
            goto L_0x04e4
        L_0x03cc:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            com.google.android.gms.internal.places.zzck r5 = (com.google.android.gms.internal.places.zzck) r5
            com.google.android.gms.internal.places.zzda r6 = r0.m63476i(r12)
            int r3 = com.google.android.gms.internal.places.zzaj.m63101G(r3, r5, r6)
            goto L_0x03c9
        L_0x03e1:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.places.zzdy.m63663C(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63113b0(r3, r5)
            goto L_0x03c9
        L_0x03f0:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63125k0(r3, r5)
            goto L_0x03c9
        L_0x03ff:
            boolean r5 = r0.m63458B(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63123i0(r3, r9)
            goto L_0x03c9
        L_0x040a:
            boolean r5 = r0.m63458B(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63131q0(r3, r11)
            goto L_0x03c9
        L_0x0415:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63133r0(r3, r5)
            goto L_0x03c9
        L_0x0424:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63122h0(r3, r5)
            goto L_0x03c9
        L_0x0433:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.m63102H(r3, r5)
            goto L_0x03c9
        L_0x0444:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            com.google.android.gms.internal.places.zzda r6 = r0.m63476i(r12)
            int r3 = com.google.android.gms.internal.places.zzdc.m63595m(r3, r5, r6)
            goto L_0x03c9
        L_0x0458:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            java.lang.Object r5 = com.google.android.gms.internal.places.zzdy.m63667G(r1, r5)
            boolean r6 = r5 instanceof com.google.android.gms.internal.places.zzw
            if (r6 == 0) goto L_0x046e
            com.google.android.gms.internal.places.zzw r5 = (com.google.android.gms.internal.places.zzw) r5
            int r3 = com.google.android.gms.internal.places.zzaj.m63102H(r3, r5)
            goto L_0x03c9
        L_0x046e:
            java.lang.String r5 = (java.lang.String) r5
            int r3 = com.google.android.gms.internal.places.zzaj.m63138w(r3, r5)
            goto L_0x03c9
        L_0x0476:
            boolean r5 = r0.m63458B(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63103I(r3, r8)
            goto L_0x03c9
        L_0x0482:
            boolean r5 = r0.m63458B(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63127n0(r3, r11)
            goto L_0x03c9
        L_0x048e:
            boolean r5 = r0.m63458B(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63120f0(r3, r9)
            goto L_0x03c9
        L_0x049a:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            int r5 = com.google.android.gms.internal.places.zzdy.m63661A(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63118e0(r3, r5)
            goto L_0x03c9
        L_0x04aa:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.places.zzdy.m63663C(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63111Y(r3, r5)
            goto L_0x03c9
        L_0x04ba:
            boolean r14 = r0.m63458B(r1, r12)
            if (r14 == 0) goto L_0x04e4
            long r5 = com.google.android.gms.internal.places.zzdy.m63663C(r1, r5)
            int r3 = com.google.android.gms.internal.places.zzaj.m63108S(r3, r5)
            goto L_0x03c9
        L_0x04ca:
            boolean r5 = r0.m63458B(r1, r12)
            if (r5 == 0) goto L_0x04e4
            int r3 = com.google.android.gms.internal.places.zzaj.m63134s(r3, r4)
            goto L_0x03c9
        L_0x04d6:
            boolean r5 = r0.m63458B(r1, r12)
            if (r5 == 0) goto L_0x04e4
            r5 = 0
            int r3 = com.google.android.gms.internal.places.zzaj.m63132r(r3, r5)
            goto L_0x03c9
        L_0x04e4:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x04ea:
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r0.f45339o
            int r1 = m63482o(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x04f2:
            sun.misc.Unsafe r2 = f45324s
            r3 = -1
            r5 = 0
            r6 = 0
            r12 = 0
        L_0x04f8:
            int[] r13 = r0.f45325a
            int r13 = r13.length
            if (r5 >= r13) goto L_0x0a32
            int r13 = r0.m63479l(r5)
            int[] r14 = r0.f45325a
            r15 = r14[r5]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r4 = r17 >>> 20
            r11 = 17
            if (r4 > r11) goto L_0x0523
            int r11 = r5 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r18 = r11 >>> 20
            int r18 = r8 << r18
            if (r14 == r3) goto L_0x0521
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            r3 = r14
        L_0x0521:
            r8 = r11
            goto L_0x0542
        L_0x0523:
            boolean r8 = r0.f45333i
            if (r8 == 0) goto L_0x053f
            com.google.android.gms.internal.places.zzaw r8 = com.google.android.gms.internal.places.zzaw.DOUBLE_LIST_PACKED
            int r8 = r8.mo53428b()
            if (r4 < r8) goto L_0x053f
            com.google.android.gms.internal.places.zzaw r8 = com.google.android.gms.internal.places.zzaw.SINT64_LIST_PACKED
            int r8 = r8.mo53428b()
            if (r4 > r8) goto L_0x053f
            int[] r8 = r0.f45325a
            int r9 = r5 + 2
            r8 = r8[r9]
            r8 = r8 & r7
            goto L_0x0540
        L_0x053f:
            r8 = 0
        L_0x0540:
            r18 = 0
        L_0x0542:
            r9 = r13 & r7
            long r9 = (long) r9
            switch(r4) {
                case 0: goto L_0x0a1a;
                case 1: goto L_0x0a09;
                case 2: goto L_0x09f6;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d4;
                case 5: goto L_0x09c7;
                case 6: goto L_0x09ba;
                case 7: goto L_0x09ae;
                case 8: goto L_0x0992;
                case 9: goto L_0x0980;
                case 10: goto L_0x0971;
                case 11: goto L_0x0964;
                case 12: goto L_0x0957;
                case 13: goto L_0x094c;
                case 14: goto L_0x0941;
                case 15: goto L_0x0934;
                case 16: goto L_0x0927;
                case 17: goto L_0x0914;
                case 18: goto L_0x08ff;
                case 19: goto L_0x08f1;
                case 20: goto L_0x08e5;
                case 21: goto L_0x08d9;
                case 22: goto L_0x08cd;
                case 23: goto L_0x08c1;
                case 24: goto L_0x08b5;
                case 25: goto L_0x08a9;
                case 26: goto L_0x089e;
                case 27: goto L_0x088f;
                case 28: goto L_0x0883;
                case 29: goto L_0x0876;
                case 30: goto L_0x0869;
                case 31: goto L_0x085c;
                case 32: goto L_0x084f;
                case 33: goto L_0x0842;
                case 34: goto L_0x0835;
                case 35: goto L_0x0815;
                case 36: goto L_0x07f8;
                case 37: goto L_0x07db;
                case 38: goto L_0x07be;
                case 39: goto L_0x07a0;
                case 40: goto L_0x0782;
                case 41: goto L_0x0764;
                case 42: goto L_0x0746;
                case 43: goto L_0x0728;
                case 44: goto L_0x070a;
                case 45: goto L_0x06ec;
                case 46: goto L_0x06ce;
                case 47: goto L_0x06b0;
                case 48: goto L_0x0692;
                case 49: goto L_0x0682;
                case 50: goto L_0x0672;
                case 51: goto L_0x0664;
                case 52: goto L_0x0657;
                case 53: goto L_0x0647;
                case 54: goto L_0x0637;
                case 55: goto L_0x0627;
                case 56: goto L_0x0619;
                case 57: goto L_0x060c;
                case 58: goto L_0x05ff;
                case 59: goto L_0x05e1;
                case 60: goto L_0x05cd;
                case 61: goto L_0x05bb;
                case 62: goto L_0x05ab;
                case 63: goto L_0x059b;
                case 64: goto L_0x058e;
                case 65: goto L_0x0580;
                case 66: goto L_0x0570;
                case 67: goto L_0x0560;
                case 68: goto L_0x054a;
                default: goto L_0x0548;
            }
        L_0x0548:
            goto L_0x090b
        L_0x054a:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.places.zzck r4 = (com.google.android.gms.internal.places.zzck) r4
            com.google.android.gms.internal.places.zzda r8 = r0.m63476i(r5)
            int r4 = com.google.android.gms.internal.places.zzaj.m63101G(r15, r4, r8)
            goto L_0x090a
        L_0x0560:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            long r8 = m63471O(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63113b0(r15, r8)
            goto L_0x090a
        L_0x0570:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            int r4 = m63470N(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63125k0(r15, r4)
            goto L_0x090a
        L_0x0580:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.m63123i0(r15, r8)
            goto L_0x090a
        L_0x058e:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.m63131q0(r15, r4)
            goto L_0x0955
        L_0x059b:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            int r4 = m63470N(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63133r0(r15, r4)
            goto L_0x090a
        L_0x05ab:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            int r4 = m63470N(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63122h0(r15, r4)
            goto L_0x090a
        L_0x05bb:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.m63102H(r15, r4)
            goto L_0x090a
        L_0x05cd:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r8 = r0.m63476i(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.m63595m(r15, r4, r8)
            goto L_0x090a
        L_0x05e1:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r8 = r4 instanceof com.google.android.gms.internal.places.zzw
            if (r8 == 0) goto L_0x05f7
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.m63102H(r15, r4)
            goto L_0x090a
        L_0x05f7:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.places.zzaj.m63138w(r15, r4)
            goto L_0x090a
        L_0x05ff:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            r4 = 1
            int r8 = com.google.android.gms.internal.places.zzaj.m63103I(r15, r4)
            goto L_0x0955
        L_0x060c:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.m63127n0(r15, r4)
            goto L_0x0955
        L_0x0619:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.m63120f0(r15, r8)
            goto L_0x090a
        L_0x0627:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            int r4 = m63470N(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63118e0(r15, r4)
            goto L_0x090a
        L_0x0637:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            long r8 = m63471O(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63111Y(r15, r8)
            goto L_0x090a
        L_0x0647:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            long r8 = m63471O(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63108S(r15, r8)
            goto L_0x090a
        L_0x0657:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.m63134s(r15, r4)
            goto L_0x0955
        L_0x0664:
            boolean r4 = r0.m63459C(r1, r15, r5)
            if (r4 == 0) goto L_0x090b
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.m63132r(r15, r8)
            goto L_0x090a
        L_0x0672:
            com.google.android.gms.internal.places.zzcd r4 = r0.f45341q
            java.lang.Object r8 = r2.getObject(r1, r9)
            java.lang.Object r9 = r0.m63477j(r5)
            int r4 = r4.mo53511a(r15, r8, r9)
            goto L_0x090a
        L_0x0682:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.places.zzda r8 = r0.m63476i(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.m63604v(r15, r4, r8)
            goto L_0x090a
        L_0x0692:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63555C(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x06a6
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x06a6:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x06b0:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63564L(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x06c4
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x06c4:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x06ce:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63568P(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x06e2
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x06e2:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x06ec:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63566N(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x0700
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x0700:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x070a:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63558F(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x071e
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x071e:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x0728:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63562J(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x073c
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x073c:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x0746:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63570R(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x075a
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x075a:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x0764:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63566N(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x0778
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x0778:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x0782:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63568P(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x0796
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x0796:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x07a0:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63560H(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x07b4
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x07b4:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x07be:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63608z(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x07d2
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x07d2:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x07db:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63605w(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x07ef
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x07ef:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x07f8:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63566N(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x080c
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x080c:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
            goto L_0x0831
        L_0x0815:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63568P(r4)
            if (r4 <= 0) goto L_0x090b
            boolean r9 = r0.f45333i
            if (r9 == 0) goto L_0x0829
            long r8 = (long) r8
            r2.putInt(r1, r8, r4)
        L_0x0829:
            int r8 = com.google.android.gms.internal.places.zzaj.m63139w0(r15)
            int r9 = com.google.android.gms.internal.places.zzaj.m63143y0(r4)
        L_0x0831:
            int r8 = r8 + r9
            int r8 = r8 + r4
            goto L_0x0955
        L_0x0835:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzdc.m63575W(r15, r4, r8)
            goto L_0x08fc
        L_0x0842:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63580a0(r15, r4, r8)
            goto L_0x08fc
        L_0x084f:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63584c0(r15, r4, r8)
            goto L_0x08fc
        L_0x085c:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63582b0(r15, r4, r8)
            goto L_0x08fc
        L_0x0869:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63576X(r15, r4, r8)
            goto L_0x08fc
        L_0x0876:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63578Z(r15, r4, r8)
            goto L_0x090a
        L_0x0883:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63603u(r15, r4)
            goto L_0x090a
        L_0x088f:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.places.zzda r8 = r0.m63476i(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.m63597o(r15, r4, r8)
            goto L_0x090a
        L_0x089e:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63596n(r15, r4)
            goto L_0x090a
        L_0x08a9:
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzdc.m63586d0(r15, r4, r8)
            goto L_0x08fc
        L_0x08b5:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63582b0(r15, r4, r8)
            goto L_0x08fc
        L_0x08c1:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63584c0(r15, r4, r8)
            goto L_0x08fc
        L_0x08cd:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63577Y(r15, r4, r8)
            goto L_0x08fc
        L_0x08d9:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63574V(r15, r4, r8)
            goto L_0x08fc
        L_0x08e5:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63573U(r15, r4, r8)
            goto L_0x08fc
        L_0x08f1:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63582b0(r15, r4, r8)
        L_0x08fc:
            int r6 = r6 + r4
            r4 = 1
            goto L_0x090d
        L_0x08ff:
            r8 = 0
            java.lang.Object r4 = r2.getObject(r1, r9)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.places.zzdc.m63584c0(r15, r4, r8)
        L_0x090a:
            int r6 = r6 + r4
        L_0x090b:
            r4 = 1
        L_0x090c:
            r8 = 0
        L_0x090d:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x0a2a
        L_0x0914:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.places.zzck r4 = (com.google.android.gms.internal.places.zzck) r4
            com.google.android.gms.internal.places.zzda r8 = r0.m63476i(r5)
            int r4 = com.google.android.gms.internal.places.zzaj.m63101G(r15, r4, r8)
            goto L_0x090a
        L_0x0927:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            long r8 = r2.getLong(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63113b0(r15, r8)
            goto L_0x090a
        L_0x0934:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63125k0(r15, r4)
            goto L_0x090a
        L_0x0941:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            r8 = 0
            int r4 = com.google.android.gms.internal.places.zzaj.m63123i0(r15, r8)
            goto L_0x090a
        L_0x094c:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            r4 = 0
            int r8 = com.google.android.gms.internal.places.zzaj.m63131q0(r15, r4)
        L_0x0955:
            int r6 = r6 + r8
            goto L_0x090b
        L_0x0957:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63133r0(r15, r4)
            goto L_0x090a
        L_0x0964:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            int r4 = r2.getInt(r1, r9)
            int r4 = com.google.android.gms.internal.places.zzaj.m63122h0(r15, r4)
            goto L_0x090a
        L_0x0971:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.m63102H(r15, r4)
            goto L_0x090a
        L_0x0980:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            com.google.android.gms.internal.places.zzda r8 = r0.m63476i(r5)
            int r4 = com.google.android.gms.internal.places.zzdc.m63595m(r15, r4, r8)
            goto L_0x090a
        L_0x0992:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            java.lang.Object r4 = r2.getObject(r1, r9)
            boolean r8 = r4 instanceof com.google.android.gms.internal.places.zzw
            if (r8 == 0) goto L_0x09a6
            com.google.android.gms.internal.places.zzw r4 = (com.google.android.gms.internal.places.zzw) r4
            int r4 = com.google.android.gms.internal.places.zzaj.m63102H(r15, r4)
            goto L_0x090a
        L_0x09a6:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.android.gms.internal.places.zzaj.m63138w(r15, r4)
            goto L_0x090a
        L_0x09ae:
            r4 = r12 & r18
            if (r4 == 0) goto L_0x090b
            r4 = 1
            int r8 = com.google.android.gms.internal.places.zzaj.m63103I(r15, r4)
            int r6 = r6 + r8
            goto L_0x090c
        L_0x09ba:
            r4 = 1
            r8 = r12 & r18
            if (r8 == 0) goto L_0x090c
            r8 = 0
            int r9 = com.google.android.gms.internal.places.zzaj.m63127n0(r15, r8)
            int r6 = r6 + r9
            goto L_0x090d
        L_0x09c7:
            r4 = 1
            r8 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x0a07
            int r9 = com.google.android.gms.internal.places.zzaj.m63120f0(r15, r13)
            goto L_0x0a06
        L_0x09d4:
            r4 = 1
            r8 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a07
            int r9 = r2.getInt(r1, r9)
            int r9 = com.google.android.gms.internal.places.zzaj.m63118e0(r15, r9)
            goto L_0x0a06
        L_0x09e5:
            r4 = 1
            r8 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a07
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.places.zzaj.m63111Y(r15, r9)
            goto L_0x0a06
        L_0x09f6:
            r4 = 1
            r8 = 0
            r13 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a07
            long r9 = r2.getLong(r1, r9)
            int r9 = com.google.android.gms.internal.places.zzaj.m63108S(r15, r9)
        L_0x0a06:
            int r6 = r6 + r9
        L_0x0a07:
            r9 = 0
            goto L_0x0a17
        L_0x0a09:
            r4 = 1
            r8 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0a07
            r9 = 0
            int r10 = com.google.android.gms.internal.places.zzaj.m63134s(r15, r9)
            int r6 = r6 + r10
        L_0x0a17:
            r10 = 0
            goto L_0x0a2a
        L_0x0a1a:
            r4 = 1
            r8 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x0a17
            r10 = 0
            int r15 = com.google.android.gms.internal.places.zzaj.m63132r(r15, r10)
            int r6 = r6 + r15
        L_0x0a2a:
            int r5 = r5 + 3
            r9 = r13
            r4 = 0
            r8 = 1
            r11 = 0
            goto L_0x04f8
        L_0x0a32:
            r8 = 0
            com.google.android.gms.internal.places.zzds<?, ?> r2 = r0.f45339o
            int r2 = m63482o(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f45330f
            if (r2 == 0) goto L_0x0a8c
            com.google.android.gms.internal.places.zzar<?> r2 = r0.f45340p
            com.google.android.gms.internal.places.zzav r1 = r2.mo53412b(r1)
            r11 = 0
        L_0x0a45:
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r2 = r1.f45189a
            int r2 = r2.mo53563k()
            if (r11 >= r2) goto L_0x0a65
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r2 = r1.f45189a
            java.util.Map$Entry r2 = r2.mo53557d(r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.places.zzax r3 = (com.google.android.gms.internal.places.zzax) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.places.zzav.m63280n(r3, r2)
            int r8 = r8 + r2
            int r11 = r11 + 1
            goto L_0x0a45
        L_0x0a65:
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r1.f45189a
            java.lang.Iterable r1 = r1.mo53564l()
            java.util.Iterator r1 = r1.iterator()
        L_0x0a6f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0a8b
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.places.zzax r3 = (com.google.android.gms.internal.places.zzax) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.places.zzav.m63280n(r3, r2)
            int r8 = r8 + r2
            goto L_0x0a6f
        L_0x0a8b:
            int r6 = r6 + r8
        L_0x0a8c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.mo53540f(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53541g(T r14, com.google.android.gms.internal.places.zzel r15) throws java.io.IOException {
        /*
            r13 = this;
            int r0 = r15.mo53385q()
            int r1 = com.google.android.gms.internal.places.zzbc.zze.f45274m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r13.f45339o
            m63491y(r0, r14, r15)
            boolean r0 = r13.f45330f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.places.zzar<?> r0 = r13.f45340p
            com.google.android.gms.internal.places.zzav r0 = r0.mo53412b(r14)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r0.f45189a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.mo53418a()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.f45325a
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.m63479l(r7)
            int[] r9 = r13.f45325a
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.places.zzar<?> r10 = r13.f45340p
            int r10 = r10.mo53411a(r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.places.zzar<?> r10 = r13.f45340p
            r10.mo53414d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.m63476i(r7)
            r15.mo53368N(r9, r8, r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m63471O(r14, r10)
            r15.mo53380l(r9, r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m63470N(r14, r10)
            r15.mo53384p(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m63471O(r14, r10)
            r15.mo53375g(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m63470N(r14, r10)
            r15.mo53361G(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m63470N(r14, r10)
            r15.mo53363I(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m63470N(r14, r10)
            r15.mo53393x(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            com.google.android.gms.internal.places.zzw r8 = (com.google.android.gms.internal.places.zzw) r8
            r15.mo53391v(r9, r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.m63476i(r7)
            r15.mo53360F(r9, r8, r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            m63490x(r9, r8, r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = m63472P(r14, r10)
            r15.mo53387r0(r9, r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m63470N(r14, r10)
            r15.mo53386r(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m63471O(r14, r10)
            r15.mo53392w(r9, r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = m63470N(r14, r10)
            r15.mo53390u(r9, r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m63471O(r14, r10)
            r15.mo53377i(r9, r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = m63471O(r14, r10)
            r15.mo53395z(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = m63469M(r14, r10)
            r15.mo53378j(r9, r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.m63459C(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = m63468L(r14, r10)
            r15.mo53376h(r9, r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            r13.m63492z(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzda r10 = r13.m63476i(r7)
            com.google.android.gms.internal.places.zzdc.m63592j(r9, r8, r15, r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63554B(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63565M(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63559G(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63569Q(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63571S(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63563K(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63572T(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63567O(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63556D(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63561I(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63606x(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63598p(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63593k(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63587e(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63554B(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63565M(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63559G(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63569Q(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63571S(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63563K(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63591i(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzda r10 = r13.m63476i(r7)
            com.google.android.gms.internal.places.zzdc.m63585d(r9, r8, r15, r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63583c(r9, r8, r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63572T(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63567O(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63556D(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63561I(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63606x(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63598p(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63593k(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.f45325a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.places.zzdc.m63587e(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.m63476i(r7)
            r15.mo53368N(r9, r8, r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r10)
            r15.mo53380l(r9, r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r10)
            r15.mo53384p(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r10)
            r15.mo53375g(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r10)
            r15.mo53361G(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r10)
            r15.mo53363I(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r10)
            r15.mo53393x(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            com.google.android.gms.internal.places.zzw r8 = (com.google.android.gms.internal.places.zzw) r8
            r15.mo53391v(r9, r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            com.google.android.gms.internal.places.zzda r10 = r13.m63476i(r7)
            r15.mo53360F(r9, r8, r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r10)
            m63490x(r9, r8, r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.places.zzdy.m63664D(r14, r10)
            r15.mo53387r0(r9, r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r10)
            r15.mo53386r(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r10)
            r15.mo53392w(r9, r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r10)
            r15.mo53390u(r9, r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r10)
            r15.mo53377i(r9, r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r10)
            r15.mo53395z(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.places.zzdy.m63665E(r14, r10)
            r15.mo53378j(r9, r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.m63458B(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.places.zzdy.m63666F(r14, r10)
            r15.mo53376h(r9, r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.places.zzar<?> r14 = r13.f45340p
            r14.mo53414d(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.f45332h
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.f45330f
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.places.zzar<?> r0 = r13.f45340p
            com.google.android.gms.internal.places.zzav r0 = r0.mo53412b(r14)
            com.google.android.gms.internal.places.zzdb<FieldDescriptorType, java.lang.Object> r1 = r0.f45189a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.mo53422d()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.f45325a
            int r7 = r7.length
            r8 = 0
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.m63479l(r8)
            int[] r10 = r13.f45325a
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            com.google.android.gms.internal.places.zzar<?> r11 = r13.f45340p
            int r11 = r11.mo53411a(r1)
            if (r11 > r10) goto L_0x0578
            com.google.android.gms.internal.places.zzar<?> r11 = r13.f45340p
            r11.mo53414d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.m63476i(r8)
            r15.mo53368N(r10, r9, r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m63471O(r14, r11)
            r15.mo53380l(r10, r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m63470N(r14, r11)
            r15.mo53384p(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m63471O(r14, r11)
            r15.mo53375g(r10, r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m63470N(r14, r11)
            r15.mo53361G(r10, r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m63470N(r14, r11)
            r15.mo53363I(r10, r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m63470N(r14, r11)
            r15.mo53393x(r10, r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            com.google.android.gms.internal.places.zzw r9 = (com.google.android.gms.internal.places.zzw) r9
            r15.mo53391v(r10, r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.m63476i(r8)
            r15.mo53360F(r10, r9, r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            m63490x(r10, r9, r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = m63472P(r14, r11)
            r15.mo53387r0(r10, r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m63470N(r14, r11)
            r15.mo53386r(r10, r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m63471O(r14, r11)
            r15.mo53392w(r10, r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = m63470N(r14, r11)
            r15.mo53390u(r10, r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m63471O(r14, r11)
            r15.mo53377i(r10, r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = m63471O(r14, r11)
            r15.mo53395z(r10, r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = m63469M(r14, r11)
            r15.mo53378j(r10, r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.m63459C(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = m63468L(r14, r11)
            r15.mo53376h(r10, r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            r13.m63492z(r15, r10, r9, r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r11 = r13.m63476i(r8)
            com.google.android.gms.internal.places.zzdc.m63592j(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63554B(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63565M(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63559G(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63569Q(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63571S(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63563K(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63572T(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63567O(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63556D(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63561I(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63606x(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63598p(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63593k(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63587e(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63554B(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63565M(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63559G(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63569Q(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63571S(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63563K(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63591i(r10, r9, r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzda r11 = r13.m63476i(r8)
            com.google.android.gms.internal.places.zzdc.m63585d(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63583c(r10, r9, r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63572T(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63567O(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63556D(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63561I(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63606x(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63598p(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63593k(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.f45325a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.places.zzdc.m63587e(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.m63476i(r8)
            r15.mo53368N(r10, r9, r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r11)
            r15.mo53380l(r10, r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r11)
            r15.mo53384p(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r11)
            r15.mo53375g(r10, r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r11)
            r15.mo53361G(r10, r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r11)
            r15.mo53363I(r10, r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r11)
            r15.mo53393x(r10, r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            com.google.android.gms.internal.places.zzw r9 = (com.google.android.gms.internal.places.zzw) r9
            r15.mo53391v(r10, r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            com.google.android.gms.internal.places.zzda r11 = r13.m63476i(r8)
            r15.mo53360F(r10, r9, r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.places.zzdy.m63667G(r14, r11)
            m63490x(r10, r9, r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.places.zzdy.m63664D(r14, r11)
            r15.mo53387r0(r10, r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r11)
            r15.mo53386r(r10, r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r11)
            r15.mo53392w(r10, r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.places.zzdy.m63661A(r14, r11)
            r15.mo53390u(r10, r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r11)
            r15.mo53377i(r10, r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.places.zzdy.m63663C(r14, r11)
            r15.mo53395z(r10, r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.places.zzdy.m63665E(r14, r11)
            r15.mo53378j(r10, r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.m63458B(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.places.zzdy.m63666F(r14, r11)
            r15.mo53376h(r10, r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            com.google.android.gms.internal.places.zzar<?> r2 = r13.f45340p
            r2.mo53414d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r13.f45339o
            m63491y(r0, r14, r15)
            return
        L_0x0a44:
            r13.m63464H(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.mo53541g(java.lang.Object, com.google.android.gms.internal.places.zzel):void");
    }

    /* renamed from: h */
    public final void mo53542h(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f45325a.length; i += 3) {
            int l = m63479l(i);
            long j = (long) (1048575 & l);
            int i2 = this.f45325a[i];
            switch ((l & 267386880) >>> 20) {
                case 0:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63678c(t, j, zzdy.m63666F(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 1:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63679d(t, j, zzdy.m63665E(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 2:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63681f(t, j, zzdy.m63663C(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 3:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63681f(t, j, zzdy.m63663C(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 4:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63680e(t, j, zzdy.m63661A(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 5:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63681f(t, j, zzdy.m63663C(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 6:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63680e(t, j, zzdy.m63661A(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 7:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63683h(t, j, zzdy.m63664D(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 8:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63682g(t, j, zzdy.m63667G(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 9:
                    m63457A(t, t2, i);
                    break;
                case 10:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63682g(t, j, zzdy.m63667G(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 11:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63680e(t, j, zzdy.m63661A(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 12:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63680e(t, j, zzdy.m63661A(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 13:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63680e(t, j, zzdy.m63661A(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 14:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63681f(t, j, zzdy.m63663C(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 15:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63680e(t, j, zzdy.m63661A(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 16:
                    if (!m63458B(t2, i)) {
                        break;
                    } else {
                        zzdy.m63681f(t, j, zzdy.m63663C(t2, j));
                        m63462F(t, i);
                        break;
                    }
                case 17:
                    m63457A(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f45338n.mo53501b(t, t2, j);
                    break;
                case 50:
                    zzdc.m63589g(this.f45341q, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m63459C(t2, i2, i)) {
                        break;
                    } else {
                        zzdy.m63682g(t, j, zzdy.m63667G(t2, j));
                        m63463G(t, i2, i);
                        break;
                    }
                case 60:
                    m63465I(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m63459C(t2, i2, i)) {
                        break;
                    } else {
                        zzdy.m63682g(t, j, zzdy.m63667G(t2, j));
                        m63463G(t, i2, i);
                        break;
                    }
                case 68:
                    m63465I(t, t2, i);
                    break;
            }
        }
        if (!this.f45332h) {
            zzdc.m63590h(this.f45339o, t, t2);
            if (this.f45330f) {
                zzdc.m63588f(this.f45340p, t, t2);
            }
        }
    }

    public final T newInstance() {
        return this.f45337m.mo53546a(this.f45329e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x036a, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03b3, code lost:
        if (r0 == r15) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0174, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0213, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0215, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r34;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x023f, code lost:
        r32 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02b6, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b8, code lost:
        r6 = r6 | r22;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02bc, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c0, code lost:
        r13 = r33;
        r11 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c6, code lost:
        r2 = r7;
        r19 = r9;
        r26 = r10;
        r7 = r32;
        r9 = r8;
        r32 = r11;
        r8 = r34;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo53544s(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.places.zzr r35) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            sun.misc.Unsafe r10 = f45324s
            r16 = 0
            r0 = r32
            r1 = -1
            r2 = 0
            r3 = 0
            r6 = 0
            r7 = -1
        L_0x0017:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x047f
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.places.zzs.m63843d(r0, r12, r3, r9)
            int r3 = r9.f45464a
            r4 = r0
            r5 = r3
            goto L_0x002d
        L_0x002b:
            r5 = r0
            r4 = r3
        L_0x002d:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x003a
            int r2 = r2 / r8
            int r1 = r15.m63474R(r3, r2)
            goto L_0x003e
        L_0x003a:
            int r1 = r15.m63481n(r3)
        L_0x003e:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004d
            r32 = r3
            r2 = r4
            r9 = r5
            r26 = r10
            r8 = r11
            r19 = 0
            goto L_0x03e1
        L_0x004d:
            int[] r1 = r15.f45325a
            int r19 = r2 + 1
            r8 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r8 & r19
            int r11 = r19 >>> 20
            r19 = r5
            r5 = r8 & r17
            long r12 = (long) r5
            r5 = 17
            r20 = r8
            if (r11 > r5) goto L_0x02d4
            int r5 = r2 + 2
            r1 = r1[r5]
            int r5 = r1 >>> 20
            r8 = 1
            int r22 = r8 << r5
            r1 = r1 & r17
            r5 = -1
            if (r1 == r7) goto L_0x007e
            if (r7 == r5) goto L_0x0078
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0078:
            long r6 = (long) r1
            int r6 = r10.getInt(r14, r6)
            r7 = r1
        L_0x007e:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x029e;
                case 1: goto L_0x0284;
                case 2: goto L_0x025e;
                case 3: goto L_0x025e;
                case 4: goto L_0x0243;
                case 5: goto L_0x021e;
                case 6: goto L_0x01fb;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01ae;
                case 9: goto L_0x0178;
                case 10: goto L_0x015d;
                case 11: goto L_0x0243;
                case 12: goto L_0x012b;
                case 13: goto L_0x01fb;
                case 14: goto L_0x021e;
                case 15: goto L_0x0110;
                case 16: goto L_0x00e3;
                case 17: goto L_0x0091;
                default: goto L_0x0082;
            }
        L_0x0082:
            r12 = r31
            r13 = r35
            r9 = r2
            r11 = r3
            r32 = r7
            r8 = r19
            r19 = -1
        L_0x008e:
            r7 = r4
            goto L_0x02c6
        L_0x0091:
            r8 = 3
            if (r0 != r8) goto L_0x00d7
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.places.zzda r0 = r15.m63476i(r2)
            r1 = r31
            r9 = r2
            r2 = r4
            r11 = r3
            r3 = r33
            r4 = r8
            r8 = r19
            r19 = -1
            r5 = r35
            int r0 = com.google.android.gms.internal.places.zzs.m63845f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00ba
            r5 = r35
            java.lang.Object r1 = r5.f45466c
            r10.putObject(r14, r12, r1)
            goto L_0x00c9
        L_0x00ba:
            r5 = r35
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r5.f45466c
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.m63343d(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00c9:
            r6 = r6 | r22
            r12 = r31
            r13 = r33
            r3 = r8
            r2 = r9
            r1 = r11
            r11 = r34
            r9 = r5
            goto L_0x0017
        L_0x00d7:
            r9 = r2
            r11 = r3
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            goto L_0x023f
        L_0x00e3:
            r5 = r35
            r9 = r2
            r11 = r3
            r8 = r19
            r19 = -1
            if (r0 != 0) goto L_0x010b
            r2 = r12
            r12 = r31
            int r13 = com.google.android.gms.internal.places.zzs.m63850k(r12, r4, r5)
            long r0 = r5.f45465b
            long r17 = com.google.android.gms.internal.places.zzai.m63091b(r0)
            r0 = r10
            r1 = r30
            r32 = r13
            r13 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r32
            goto L_0x02bc
        L_0x010b:
            r12 = r31
            r13 = r5
            goto L_0x023f
        L_0x0110:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.m63849j(r12, r4, r13)
            int r1 = r13.f45464a
            int r1 = com.google.android.gms.internal.places.zzai.m63093e(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x0174
        L_0x012b:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.m63849j(r12, r4, r13)
            int r1 = r13.f45464a
            com.google.android.gms.internal.places.zzbf r4 = r15.m63478k(r9)
            if (r4 == 0) goto L_0x0159
            boolean r4 = r4.mo53472a(r1)
            if (r4 == 0) goto L_0x014b
            goto L_0x0159
        L_0x014b:
            com.google.android.gms.internal.places.zzdr r2 = m63473Q(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo53599f(r8, r1)
            goto L_0x02bc
        L_0x0159:
            r10.putInt(r14, r2, r1)
            goto L_0x0174
        L_0x015d:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.m63856q(r12, r4, r13)
            java.lang.Object r1 = r13.f45466c
            r10.putObject(r14, r2, r1)
        L_0x0174:
            r6 = r6 | r22
            goto L_0x02bc
        L_0x0178:
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x01aa
            com.google.android.gms.internal.places.zzda r0 = r15.m63476i(r9)
            r5 = r33
            int r0 = com.google.android.gms.internal.places.zzs.m63846g(r0, r12, r4, r5, r13)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x019b
            java.lang.Object r1 = r13.f45466c
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x019b:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r13.f45466c
            java.lang.Object r1 = com.google.android.gms.internal.places.zzbd.m63343d(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x01aa:
            r5 = r33
            goto L_0x023f
        L_0x01ae:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 2
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x01c9
            int r0 = com.google.android.gms.internal.places.zzs.m63853n(r12, r4, r13)
            goto L_0x01cd
        L_0x01c9:
            int r0 = com.google.android.gms.internal.places.zzs.m63855p(r12, r4, r13)
        L_0x01cd:
            java.lang.Object r1 = r13.f45466c
            r10.putObject(r14, r2, r1)
            goto L_0x0213
        L_0x01d3:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != 0) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.m63850k(r12, r4, r13)
            r32 = r0
            long r0 = r13.f45465b
            r20 = 0
            int r4 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r4 == 0) goto L_0x01f2
            r0 = 1
            goto L_0x01f3
        L_0x01f2:
            r0 = 0
        L_0x01f3:
            com.google.android.gms.internal.places.zzdy.m63683h(r14, r2, r0)
            r6 = r6 | r22
            r0 = r32
            goto L_0x0215
        L_0x01fb:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            int r0 = com.google.android.gms.internal.places.zzs.m63847h(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0213:
            r6 = r6 | r22
        L_0x0215:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r11 = r34
            r13 = r5
            goto L_0x0017
        L_0x021e:
            r5 = r33
            r9 = r2
            r11 = r3
            r2 = r12
            r8 = r19
            r1 = 1
            r19 = -1
            r12 = r31
            r13 = r35
            if (r0 != r1) goto L_0x023f
            long r17 = com.google.android.gms.internal.places.zzs.m63851l(r12, r4)
            r0 = r10
            r1 = r30
            r32 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x02b6
        L_0x023f:
            r32 = r7
            goto L_0x008e
        L_0x0243:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02c6
            int r0 = com.google.android.gms.internal.places.zzs.m63849j(r12, r7, r13)
            int r1 = r13.f45464a
            r10.putInt(r14, r2, r1)
            goto L_0x02b8
        L_0x025e:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != 0) goto L_0x02c6
            int r7 = com.google.android.gms.internal.places.zzs.m63850k(r12, r7, r13)
            long r4 = r13.f45465b
            r0 = r10
            r1 = r30
            r0.putLong(r1, r2, r4)
            r6 = r6 | r22
            r0 = r7
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
            r7 = r32
            goto L_0x02c0
        L_0x0284:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02c6
            float r0 = com.google.android.gms.internal.places.zzs.m63854o(r12, r7)
            com.google.android.gms.internal.places.zzdy.m63679d(r14, r2, r0)
            int r0 = r7 + 4
            goto L_0x02b8
        L_0x029e:
            r9 = r2
            r11 = r3
            r32 = r7
            r2 = r12
            r8 = r19
            r1 = 1
            r19 = -1
            r12 = r31
            r13 = r35
            r7 = r4
            if (r0 != r1) goto L_0x02c6
            double r0 = com.google.android.gms.internal.places.zzs.m63852m(r12, r7)
            com.google.android.gms.internal.places.zzdy.m63678c(r14, r2, r0)
        L_0x02b6:
            int r0 = r7 + 8
        L_0x02b8:
            r6 = r6 | r22
            r7 = r32
        L_0x02bc:
            r3 = r8
            r2 = r9
            r1 = r11
            r9 = r13
        L_0x02c0:
            r13 = r33
            r11 = r34
            goto L_0x0017
        L_0x02c6:
            r2 = r7
            r19 = r9
            r26 = r10
            r7 = r32
            r9 = r8
            r32 = r11
            r8 = r34
            goto L_0x03e1
        L_0x02d4:
            r5 = r3
            r18 = r7
            r8 = r19
            r19 = -1
            r7 = r4
            r27 = r12
            r12 = r31
            r13 = r9
            r9 = r2
            r2 = r27
            r1 = 27
            if (r11 != r1) goto L_0x0339
            r1 = 2
            if (r0 != r1) goto L_0x032c
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.places.zzbh r0 = (com.google.android.gms.internal.places.zzbh) r0
            boolean r1 = r0.mo53474N()
            if (r1 != 0) goto L_0x0309
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0300
            r1 = 10
            goto L_0x0302
        L_0x0300:
            int r1 = r1 << 1
        L_0x0302:
            com.google.android.gms.internal.places.zzbh r0 = r0.mo53396E(r1)
            r10.putObject(r14, r2, r0)
        L_0x0309:
            r11 = r0
            com.google.android.gms.internal.places.zzda r0 = r15.m63476i(r9)
            r1 = r8
            r2 = r31
            r3 = r7
            r4 = r33
            r7 = r5
            r5 = r11
            r22 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.places.zzs.m63844e(r0, r1, r2, r3, r4, r5, r6)
            r11 = r34
            r1 = r7
            r3 = r8
            r2 = r9
            r9 = r13
            r7 = r18
            r6 = r22
            r13 = r33
            goto L_0x0017
        L_0x032c:
            r22 = r6
            r32 = r5
            r15 = r7
            r25 = r8
            r19 = r9
            r26 = r10
            goto L_0x03b6
        L_0x0339:
            r22 = r6
            r1 = 49
            if (r11 > r1) goto L_0x0388
            r6 = r20
            long r12 = (long) r6
            r6 = r0
            r0 = r29
            r1 = r30
            r23 = r2
            r2 = r31
            r3 = r7
            r4 = r33
            r32 = r5
            r5 = r8
            r20 = r6
            r6 = r32
            r15 = r7
            r7 = r20
            r25 = r8
            r8 = r9
            r19 = r9
            r26 = r10
            r9 = r12
            r12 = r34
            r12 = r23
            r14 = r35
            int r0 = r0.m63484q(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x036e
            goto L_0x03dd
        L_0x036e:
            r15 = r29
            r14 = r30
            r12 = r31
            r1 = r32
            r13 = r33
            r11 = r34
            r9 = r35
            r7 = r18
            r2 = r19
            r6 = r22
            r3 = r25
            r10 = r26
            goto L_0x0017
        L_0x0388:
            r23 = r2
            r32 = r5
            r15 = r7
            r25 = r8
            r19 = r9
            r26 = r10
            r6 = r20
            r20 = r0
            r0 = 50
            if (r11 != r0) goto L_0x03c0
            r7 = r20
            r0 = 2
            if (r7 != r0) goto L_0x03b6
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r23
            r8 = r35
            int r0 = r0.m63485r(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x036e
            goto L_0x03dd
        L_0x03b6:
            r8 = r34
            r2 = r15
        L_0x03b9:
            r7 = r18
            r6 = r22
            r9 = r25
            goto L_0x03e1
        L_0x03c0:
            r7 = r20
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r25
            r8 = r6
            r6 = r32
            r9 = r11
            r10 = r23
            r12 = r19
            r13 = r35
            int r0 = r0.m63483p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0463
        L_0x03dd:
            r8 = r34
            r2 = r0
            goto L_0x03b9
        L_0x03e1:
            if (r9 != r8) goto L_0x03ef
            if (r8 != 0) goto L_0x03e6
            goto L_0x03ef
        L_0x03e6:
            r10 = r29
            r13 = r30
            r0 = r7
            r1 = -1
            r7 = r2
            goto L_0x048d
        L_0x03ef:
            r10 = r29
            boolean r0 = r10.f45330f
            if (r0 == 0) goto L_0x043e
            r11 = r35
            com.google.android.gms.internal.places.zzap r0 = r11.f45467d
            com.google.android.gms.internal.places.zzap r1 = com.google.android.gms.internal.places.zzap.m63253b()
            if (r0 == r1) goto L_0x0439
            com.google.android.gms.internal.places.zzck r0 = r10.f45329e
            com.google.android.gms.internal.places.zzap r1 = r11.f45467d
            r12 = r32
            com.google.android.gms.internal.places.zzbc$zzf r0 = r1.mo53408c(r0, r12)
            if (r0 != 0) goto L_0x0429
            com.google.android.gms.internal.places.zzdr r4 = m63473Q(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.places.zzs.m63841b(r0, r1, r2, r3, r4, r5)
            r14 = r30
            r13 = r33
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r2 = r19
            r10 = r26
            r12 = r31
            goto L_0x0460
        L_0x0429:
            r13 = r30
            r0 = r13
            com.google.android.gms.internal.places.zzbc$zzc r0 = (com.google.android.gms.internal.places.zzbc.zzc) r0
            r0.mo53466t()
            com.google.android.gms.internal.places.zzav<java.lang.Object> r0 = r0.zzik
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0439:
            r13 = r30
            r12 = r32
            goto L_0x0444
        L_0x043e:
            r13 = r30
            r12 = r32
            r11 = r35
        L_0x0444:
            com.google.android.gms.internal.places.zzdr r4 = m63473Q(r30)
            r0 = r9
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.android.gms.internal.places.zzs.m63841b(r0, r1, r2, r3, r4, r5)
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r14 = r13
            r2 = r19
            r10 = r26
            r12 = r31
            r13 = r33
        L_0x0460:
            r11 = r8
            goto L_0x0017
        L_0x0463:
            r12 = r32
            r9 = r25
            r15 = r29
            r14 = r30
            r13 = r33
            r11 = r34
            r3 = r9
            r1 = r12
            r7 = r18
            r2 = r19
            r6 = r22
            r10 = r26
            r12 = r31
            r9 = r35
            goto L_0x0017
        L_0x047f:
            r22 = r6
            r18 = r7
            r26 = r10
            r8 = r11
            r13 = r14
            r10 = r15
            r7 = r0
            r9 = r3
            r0 = r18
            r1 = -1
        L_0x048d:
            if (r0 == r1) goto L_0x0495
            long r0 = (long) r0
            r2 = r26
            r2.putInt(r13, r0, r6)
        L_0x0495:
            r0 = 0
            int r1 = r10.f45335k
            r5 = r0
            r11 = r1
        L_0x049a:
            int r0 = r10.f45336l
            if (r11 >= r0) goto L_0x04ce
            int[] r0 = r10.f45334j
            r1 = r0[r11]
            com.google.android.gms.internal.places.zzds<?, ?> r6 = r10.f45339o
            int[] r0 = r10.f45325a
            r2 = r0[r1]
            int r0 = r10.m63479l(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.places.zzdy.m63667G(r13, r3)
            if (r0 != 0) goto L_0x04b6
            goto L_0x04c9
        L_0x04b6:
            com.google.android.gms.internal.places.zzbf r4 = r10.m63478k(r1)
            if (r4 != 0) goto L_0x04bd
            goto L_0x04c9
        L_0x04bd:
            com.google.android.gms.internal.places.zzcd r3 = r10.f45341q
            java.util.Map r3 = r3.mo53518h(r0)
            r0 = r29
            java.lang.Object r5 = r0.m63488v(r1, r2, r3, r4, r5, r6)
        L_0x04c9:
            com.google.android.gms.internal.places.zzdr r5 = (com.google.android.gms.internal.places.zzdr) r5
            int r11 = r11 + 1
            goto L_0x049a
        L_0x04ce:
            if (r5 == 0) goto L_0x04d5
            com.google.android.gms.internal.places.zzds<?, ?> r0 = r10.f45339o
            r0.mo53610h(r13, r5)
        L_0x04d5:
            if (r8 != 0) goto L_0x04e1
            r0 = r33
            if (r7 != r0) goto L_0x04dc
            goto L_0x04e7
        L_0x04dc:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.m63366e()
            throw r0
        L_0x04e1:
            r0 = r33
            if (r7 > r0) goto L_0x04e8
            if (r9 != r8) goto L_0x04e8
        L_0x04e7:
            return r7
        L_0x04e8:
            com.google.android.gms.internal.places.zzbk r0 = com.google.android.gms.internal.places.zzbk.m63366e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzco.mo53544s(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.places.zzr):int");
    }
}
