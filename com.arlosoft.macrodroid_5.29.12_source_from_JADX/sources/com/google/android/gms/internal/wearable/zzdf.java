package com.google.android.gms.internal.wearable;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdf<T> implements zzdn<T> {

    /* renamed from: p */
    private static final int[] f45670p = new int[0];

    /* renamed from: q */
    private static final Unsafe f45671q = zzeo.m64500l();

    /* renamed from: a */
    private final int[] f45672a;

    /* renamed from: b */
    private final Object[] f45673b;

    /* renamed from: c */
    private final int f45674c;

    /* renamed from: d */
    private final int f45675d;

    /* renamed from: e */
    private final zzdc f45676e;

    /* renamed from: f */
    private final boolean f45677f;

    /* renamed from: g */
    private final boolean f45678g;

    /* renamed from: h */
    private final int[] f45679h;

    /* renamed from: i */
    private final int f45680i;

    /* renamed from: j */
    private final int f45681j;

    /* renamed from: k */
    private final zzcq f45682k;

    /* renamed from: l */
    private final zzee f45683l;

    /* renamed from: m */
    private final zzbk f45684m;

    /* renamed from: n */
    private final zzdh f45685n;

    /* renamed from: o */
    private final zzcx f45686o;

    private zzdf(int[] iArr, Object[] objArr, int i, int i2, zzdc zzdc, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzdh zzdh, zzcq zzcq, zzee zzee, zzbk zzbk, zzcx zzcx, byte[] bArr) {
        zzdc zzdc2 = zzdc;
        zzbk zzbk2 = zzbk;
        this.f45672a = iArr;
        this.f45673b = objArr;
        this.f45674c = i;
        this.f45675d = i2;
        this.f45678g = z;
        boolean z3 = false;
        if (zzbk2 != null && zzbk2.mo53915c(zzdc)) {
            z3 = true;
        }
        this.f45677f = z3;
        this.f45679h = iArr2;
        this.f45680i = i3;
        this.f45681j = i4;
        this.f45685n = zzdh;
        this.f45682k = zzcq;
        this.f45683l = zzee;
        this.f45684m = zzbk2;
        this.f45676e = zzdc2;
        this.f45686o = zzcx;
    }

    /* renamed from: A */
    static zzdf m64292A(Class cls, zzcz zzcz, zzdh zzdh, zzcq zzcq, zzee zzee, zzbk zzbk, zzcx zzcx) {
        if (zzcz instanceof zzdm) {
            return m64293B((zzdm) zzcz, zzdh, zzcq, zzee, zzbk, zzcx);
        }
        zzeb zzeb = (zzeb) zzcz;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.wearable.zzdf m64293B(com.google.android.gms.internal.wearable.zzdm r34, com.google.android.gms.internal.wearable.zzdh r35, com.google.android.gms.internal.wearable.zzcq r36, com.google.android.gms.internal.wearable.zzee r37, com.google.android.gms.internal.wearable.zzbk r38, com.google.android.gms.internal.wearable.zzcx r39) {
        /*
            int r0 = r34.mo53993a()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo54006b()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f45670p
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f45671q
            java.lang.Object[] r17 = r34.mo54007c()
            com.google.android.gms.internal.wearable.zzdc r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m64305m(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m64305m(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m64305m(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m64305m(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.wearable.zzdf r0 = new com.google.android.gms.internal.wearable.zzdf
            r4 = r0
            com.google.android.gms.internal.wearable.zzdc r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzdf.m64293B(com.google.android.gms.internal.wearable.zzdm, com.google.android.gms.internal.wearable.zzdh, com.google.android.gms.internal.wearable.zzcq, com.google.android.gms.internal.wearable.zzee, com.google.android.gms.internal.wearable.zzbk, com.google.android.gms.internal.wearable.zzcx):com.google.android.gms.internal.wearable.zzdf");
    }

    /* renamed from: C */
    private static double m64294C(Object obj, long j) {
        return ((Double) zzeo.m64499k(obj, j)).doubleValue();
    }

    /* renamed from: D */
    private static float m64295D(Object obj, long j) {
        return ((Float) zzeo.m64499k(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030c, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030d, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030e, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037d, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0488, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0503, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0504, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x052d, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x053b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x054a, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054e, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019e, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01be, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m64296E(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f45671q
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000f:
            int[] r9 = r0.f45672a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0555
            int r9 = r0.m64301i(r5)
            int[] r10 = r0.f45672a
            r11 = r10[r5]
            int r12 = m64300h(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0039
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x053f;
                case 1: goto L_0x0530;
                case 2: goto L_0x051a;
                case 3: goto L_0x0506;
                case 4: goto L_0x04f0;
                case 5: goto L_0x04e4;
                case 6: goto L_0x04d8;
                case 7: goto L_0x04ca;
                case 8: goto L_0x049f;
                case 9: goto L_0x048c;
                case 10: goto L_0x046f;
                case 11: goto L_0x045a;
                case 12: goto L_0x0445;
                case 13: goto L_0x0438;
                case 14: goto L_0x042b;
                case 15: goto L_0x0411;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03e3;
                case 18: goto L_0x03d5;
                case 19: goto L_0x03c9;
                case 20: goto L_0x03bd;
                case 21: goto L_0x03b1;
                case 22: goto L_0x03a5;
                case 23: goto L_0x0399;
                case 24: goto L_0x038d;
                case 25: goto L_0x0381;
                case 26: goto L_0x0373;
                case 27: goto L_0x0364;
                case 28: goto L_0x0359;
                case 29: goto L_0x034d;
                case 30: goto L_0x0341;
                case 31: goto L_0x0335;
                case 32: goto L_0x0329;
                case 33: goto L_0x031d;
                case 34: goto L_0x0311;
                case 35: goto L_0x02f8;
                case 36: goto L_0x02e3;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b9;
                case 39: goto L_0x02a4;
                case 40: goto L_0x028f;
                case 41: goto L_0x0279;
                case 42: goto L_0x0263;
                case 43: goto L_0x024d;
                case 44: goto L_0x0237;
                case 45: goto L_0x0221;
                case 46: goto L_0x020b;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01df;
                case 49: goto L_0x01cf;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a2;
                case 53: goto L_0x018a;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0152;
                case 57: goto L_0x0145;
                case 58: goto L_0x0136;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00d7;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009d;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x037e
        L_0x0042:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.wearable.zzdc r3 = (com.google.android.gms.internal.wearable.zzdc) r3
            com.google.android.gms.internal.wearable.zzdn r4 = r0.m64303k(r5)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64096y(r11, r3, r4)
            goto L_0x037d
        L_0x0058:
            boolean r10 = r0.m64316x(r1, r11, r5)
            if (r10 == 0) goto L_0x037e
            long r3 = m64302j(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.wearable.zzbe.m64091a(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64092b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037e
        L_0x0074:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m64298G(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030d
        L_0x008f:
            boolean r3 = r0.m64316x(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x01be
        L_0x009d:
            boolean r3 = r0.m64316x(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x01ae
        L_0x00ab:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m64298G(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64097z(r3)
            goto L_0x030d
        L_0x00c1:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m64298G(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030d
        L_0x00d7:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.wearable.zzaw r3 = (com.google.android.gms.internal.wearable.zzaw) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = r3.mo53831f()
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
        L_0x00f1:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030e
        L_0x00f5:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.wearable.zzdn r4 = r0.m64303k(r5)
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64367O(r11, r3, r4)
            goto L_0x037d
        L_0x0109:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.wearable.zzaw
            if (r4 == 0) goto L_0x0128
            com.google.android.gms.internal.wearable.zzaw r3 = (com.google.android.gms.internal.wearable.zzaw) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = r3.mo53831f()
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x00f1
        L_0x0128:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64089C(r3)
            goto L_0x030d
        L_0x0136:
            boolean r3 = r0.m64316x(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            int r3 = r3 + r14
            goto L_0x037d
        L_0x0145:
            boolean r3 = r0.m64316x(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x01ae
        L_0x0152:
            boolean r3 = r0.m64316x(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x01be
        L_0x015f:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m64298G(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64097z(r3)
            goto L_0x030d
        L_0x0175:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m64302j(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r9)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64092b(r3)
            goto L_0x019e
        L_0x018a:
            boolean r9 = r0.m64316x(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m64302j(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r9)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64092b(r3)
        L_0x019e:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037e
        L_0x01a2:
            boolean r3 = r0.m64316x(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
        L_0x01ae:
            int r3 = r3 + 4
            goto L_0x037d
        L_0x01b2:
            boolean r3 = r0.m64316x(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
        L_0x01be:
            int r3 = r3 + 8
            goto L_0x037d
        L_0x01c2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m64304l(r5)
            com.google.android.gms.internal.wearable.zzcx.m64274a(r11, r3, r4)
            goto L_0x037e
        L_0x01cf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.zzdn r4 = r0.m64303k(r5)
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64362J(r11, r3, r4)
            goto L_0x037d
        L_0x01df:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64372T(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64370R(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x020b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64361I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x0221:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64359G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x0237:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64357E(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x024d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64375W(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x0263:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64354B(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64359G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x028f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64361I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x02a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64364L(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x02b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64377Y(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x02ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64366N(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x02e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64359G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x030c
        L_0x02f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64361I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64090D(r11)
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
        L_0x030c:
            int r4 = r4 + r9
        L_0x030d:
            int r4 = r4 + r3
        L_0x030e:
            int r6 = r6 + r4
            goto L_0x037e
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64371S(r11, r3, r9)
            goto L_0x037d
        L_0x031d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64369Q(r11, r3, r9)
            goto L_0x037d
        L_0x0329:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64360H(r11, r3, r9)
            goto L_0x037d
        L_0x0335:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64358F(r11, r3, r9)
            goto L_0x037d
        L_0x0341:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64356D(r11, r3, r9)
            goto L_0x037d
        L_0x034d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64374V(r11, r3, r9)
            goto L_0x037d
        L_0x0359:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64355C(r11, r3)
            goto L_0x037d
        L_0x0364:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.wearable.zzdn r4 = r0.m64303k(r5)
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64368P(r11, r3, r4)
            goto L_0x037d
        L_0x0373:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64373U(r11, r3)
        L_0x037d:
            int r6 = r6 + r3
        L_0x037e:
            r12 = 0
            goto L_0x054e
        L_0x0381:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64403y(r11, r3, r12)
            goto L_0x03e0
        L_0x038d:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64358F(r11, r3, r12)
            goto L_0x03e0
        L_0x0399:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64360H(r11, r3, r12)
            goto L_0x03e0
        L_0x03a5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64363K(r11, r3, r12)
            goto L_0x03e0
        L_0x03b1:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64376X(r11, r3, r12)
            goto L_0x03e0
        L_0x03bd:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64365M(r11, r3, r12)
            goto L_0x03e0
        L_0x03c9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64358F(r11, r3, r12)
            goto L_0x03e0
        L_0x03d5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64360H(r11, r3, r12)
        L_0x03e0:
            int r6 = r6 + r3
            goto L_0x054e
        L_0x03e3:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.wearable.zzdc r3 = (com.google.android.gms.internal.wearable.zzdc) r3
            com.google.android.gms.internal.wearable.zzdn r4 = r0.m64303k(r5)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64096y(r11, r3, r4)
            goto L_0x03e0
        L_0x03f7:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.wearable.zzbe.m64091a(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64092b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054e
        L_0x0411:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x0503
        L_0x042b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x054a
        L_0x0438:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x053b
        L_0x0445:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64097z(r3)
            goto L_0x0503
        L_0x045a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x0503
        L_0x046f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.wearable.zzaw r3 = (com.google.android.gms.internal.wearable.zzaw) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = r3.mo53831f()
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
        L_0x0488:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0504
        L_0x048c:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.wearable.zzdn r4 = r0.m64303k(r5)
            int r3 = com.google.android.gms.internal.wearable.zzdp.m64367O(r11, r3, r4)
            goto L_0x03e0
        L_0x049f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.wearable.zzaw
            if (r4 == 0) goto L_0x04bd
            com.google.android.gms.internal.wearable.zzaw r3 = (com.google.android.gms.internal.wearable.zzaw) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = r3.mo53831f()
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x0488
        L_0x04bd:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64089C(r3)
            goto L_0x0503
        L_0x04ca:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            int r3 = r3 + r14
            goto L_0x03e0
        L_0x04d8:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x053b
        L_0x04e4:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
            goto L_0x054a
        L_0x04f0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64097z(r3)
        L_0x0503:
            int r4 = r4 + r3
        L_0x0504:
            int r6 = r6 + r4
            goto L_0x054e
        L_0x0506:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r9)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64092b(r3)
            goto L_0x052d
        L_0x051a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.wearable.zzbe.m64091a(r9)
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64092b(r3)
        L_0x052d:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054e
        L_0x0530:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
        L_0x053b:
            int r3 = r3 + 4
            goto L_0x03e0
        L_0x053f:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.wearable.zzbe.m64091a(r3)
        L_0x054a:
            int r3 = r3 + 8
            goto L_0x03e0
        L_0x054e:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x0555:
            com.google.android.gms.internal.wearable.zzee r2 = r0.f45683l
            java.lang.Object r3 = r2.mo54046c(r1)
            int r2 = r2.mo54044a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f45677f
            if (r2 != 0) goto L_0x0565
            return r6
        L_0x0565:
            com.google.android.gms.internal.wearable.zzbk r2 = r0.f45684m
            r2.mo53913a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzdf.m64296E(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m64297F(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f45671q
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f45672a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m64301i(r2)
            int r5 = m64300h(r4)
            int[] r6 = r11.f45672a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.wearable.zzbp r4 = com.google.android.gms.internal.wearable.zzbp.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.wearable.zzbp r4 = com.google.android.gms.internal.wearable.zzbp.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f45672a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            com.google.android.gms.internal.wearable.zzdc r4 = (com.google.android.gms.internal.wearable.zzdc) r4
            com.google.android.gms.internal.wearable.zzdn r5 = r11.m64303k(r2)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64096y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m64316x(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m64302j(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64092b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m64298G(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m64298G(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64097z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m64298G(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            com.google.android.gms.internal.wearable.zzaw r4 = (com.google.android.gms.internal.wearable.zzaw) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = r4.mo53831f()
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            com.google.android.gms.internal.wearable.zzdn r5 = r11.m64303k(r2)
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64367O(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.wearable.zzaw
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.wearable.zzaw r4 = (com.google.android.gms.internal.wearable.zzaw) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = r4.mo53831f()
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64089C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m64298G(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64097z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m64302j(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r6)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64092b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m64302j(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r6)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64092b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m64316x(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.lang.Object r5 = r11.m64304l(r2)
            com.google.android.gms.internal.wearable.zzcx.m64274a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.wearable.zzdn r5 = r11.m64303k(r2)
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64362J(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64372T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64370R(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64361I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64359G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64357E(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64375W(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64354B(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64359G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64361I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64364L(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64377Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64366N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64359G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64361I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64090D(r6)
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64371S(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64369Q(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64360H(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64358F(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64356D(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64374V(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64355C(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.wearable.zzdn r5 = r11.m64303k(r2)
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64368P(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64373U(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64403y(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64358F(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64360H(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64363K(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64376X(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64365M(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64358F(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64360H(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            com.google.android.gms.internal.wearable.zzdc r4 = (com.google.android.gms.internal.wearable.zzdc) r4
            com.google.android.gms.internal.wearable.zzdn r5 = r11.m64303k(r2)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64096y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m64313u(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.wearable.zzeo.m64497i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64092b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.wearable.zzeo.m64496h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.wearable.zzeo.m64496h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64097z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.wearable.zzeo.m64496h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            com.google.android.gms.internal.wearable.zzaw r4 = (com.google.android.gms.internal.wearable.zzaw) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = r4.mo53831f()
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            com.google.android.gms.internal.wearable.zzdn r5 = r11.m64303k(r2)
            int r4 = com.google.android.gms.internal.wearable.zzdp.m64367O(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.wearable.zzeo.m64499k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.wearable.zzaw
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.wearable.zzaw r4 = (com.google.android.gms.internal.wearable.zzaw) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = r4.mo53831f()
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64089C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.wearable.zzeo.m64496h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.wearable.zzbe.m64091a(r5)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64097z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.wearable.zzeo.m64497i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r6)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64092b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.wearable.zzeo.m64497i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.wearable.zzbe.m64091a(r6)
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64092b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m64313u(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.wearable.zzbe.m64091a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.wearable.zzee r0 = r11.f45683l
            java.lang.Object r12 = r0.mo54046c(r12)
            int r12 = r0.mo54044a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzdf.m64297F(java.lang.Object):int");
    }

    /* renamed from: G */
    private static int m64298G(Object obj, long j) {
        return ((Integer) zzeo.m64499k(obj, j)).intValue();
    }

    /* renamed from: H */
    private final int m64299H(int i) {
        return this.f45672a[i + 2];
    }

    /* renamed from: h */
    private static int m64300h(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: i */
    private final int m64301i(int i) {
        return this.f45672a[i + 1];
    }

    /* renamed from: j */
    private static long m64302j(Object obj, long j) {
        return ((Long) zzeo.m64499k(obj, j)).longValue();
    }

    /* renamed from: k */
    private final zzdn m64303k(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzdn zzdn = (zzdn) this.f45673b[i3];
        if (zzdn != null) {
            return zzdn;
        }
        zzdn b = zzdk.m64336a().mo54003b((Class) this.f45673b[i3 + 1]);
        this.f45673b[i3] = b;
        return b;
    }

    /* renamed from: l */
    private final Object m64304l(int i) {
        int i2 = i / 3;
        return this.f45673b[i2 + i2];
    }

    /* renamed from: m */
    private static Field m64305m(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: n */
    private final void m64306n(Object obj, Object obj2, int i) {
        long i2 = (long) (m64301i(i) & 1048575);
        if (m64313u(obj2, i)) {
            Object k = zzeo.m64499k(obj, i2);
            Object k2 = zzeo.m64499k(obj2, i2);
            if (k != null && k2 != null) {
                zzeo.m64512x(obj, i2, zzcd.m64228g(k, k2));
                m64308p(obj, i);
            } else if (k2 != null) {
                zzeo.m64512x(obj, i2, k2);
                m64308p(obj, i);
            }
        }
    }

    /* renamed from: o */
    private final void m64307o(Object obj, Object obj2, int i) {
        int i2 = m64301i(i);
        int i3 = this.f45672a[i];
        long j = (long) (i2 & 1048575);
        if (m64316x(obj2, i3, i)) {
            Object k = m64316x(obj, i3, i) ? zzeo.m64499k(obj, j) : null;
            Object k2 = zzeo.m64499k(obj2, j);
            if (k != null && k2 != null) {
                zzeo.m64512x(obj, j, zzcd.m64228g(k, k2));
                m64309q(obj, i3, i);
            } else if (k2 != null) {
                zzeo.m64512x(obj, j, k2);
                m64309q(obj, i3, i);
            }
        }
    }

    /* renamed from: p */
    private final void m64308p(Object obj, int i) {
        int H = m64299H(i);
        long j = (long) (1048575 & H);
        if (j != 1048575) {
            zzeo.m64510v(obj, j, (1 << (H >>> 20)) | zzeo.m64496h(obj, j));
        }
    }

    /* renamed from: q */
    private final void m64309q(Object obj, int i, int i2) {
        zzeo.m64510v(obj, (long) (m64299H(i2) & 1048575), i);
    }

    /* renamed from: r */
    private final void m64310r(Object obj, zzew zzew) throws IOException {
        int i;
        Object obj2 = obj;
        zzew zzew2 = zzew;
        if (!this.f45677f) {
            int length = this.f45672a.length;
            Unsafe unsafe = f45671q;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int i6 = m64301i(i3);
                int[] iArr = this.f45672a;
                int i7 = iArr[i3];
                int h = m64300h(i6);
                if (h <= 17) {
                    int i8 = iArr[i3 + 2];
                    int i9 = i8 & i2;
                    if (i9 != i5) {
                        i4 = unsafe.getInt(obj2, (long) i9);
                        i5 = i9;
                    }
                    i = 1 << (i8 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (i6 & i2);
                switch (h) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            zzew2.mo53889l(i7, zzeo.m64494f(obj2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            zzew2.mo53903y(i7, zzeo.m64495g(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            zzew2.mo53887j(i7, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            zzew2.mo53871C(i7, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            zzew2.mo53894p0(i7, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            zzew2.mo53883f(i7, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            zzew2.mo53897s(i7, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            zzew2.mo53885h(i7, zzeo.m64485B(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m64318z(i7, unsafe.getObject(obj2, j), zzew2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            zzew2.mo53874F(i7, unsafe.getObject(obj2, j), m64303k(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            zzew2.mo53875G(i7, (zzaw) unsafe.getObject(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            zzew2.mo53895q(i7, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            zzew2.mo53901w(i7, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            zzew2.mo53890m(i7, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            zzew2.mo53898t(i7, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            zzew2.mo53900v(i7, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            zzew2.mo53893p(i7, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            zzew2.mo53876H(i7, unsafe.getObject(obj2, j), m64303k(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        zzdp.m64386h(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 19:
                        zzdp.m64390l(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 20:
                        zzdp.m64393o(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 21:
                        zzdp.m64401w(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 22:
                        zzdp.m64392n(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 23:
                        zzdp.m64389k(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 24:
                        zzdp.m64388j(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 25:
                        zzdp.m64384f(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        continue;
                    case 26:
                        zzdp.m64399u(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2);
                        break;
                    case 27:
                        zzdp.m64394p(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, m64303k(i3));
                        break;
                    case 28:
                        zzdp.m64385g(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2);
                        break;
                    case 29:
                        zzdp.m64400v(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        break;
                    case 30:
                        zzdp.m64387i(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        break;
                    case 31:
                        zzdp.m64395q(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        break;
                    case 32:
                        zzdp.m64396r(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        break;
                    case 33:
                        zzdp.m64397s(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        break;
                    case 34:
                        zzdp.m64398t(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, false);
                        break;
                    case 35:
                        zzdp.m64386h(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 36:
                        zzdp.m64390l(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 37:
                        zzdp.m64393o(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 38:
                        zzdp.m64401w(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 39:
                        zzdp.m64392n(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 40:
                        zzdp.m64389k(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 41:
                        zzdp.m64388j(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 42:
                        zzdp.m64384f(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 43:
                        zzdp.m64400v(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 44:
                        zzdp.m64387i(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 45:
                        zzdp.m64395q(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 46:
                        zzdp.m64396r(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 47:
                        zzdp.m64397s(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 48:
                        zzdp.m64398t(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, true);
                        break;
                    case 49:
                        zzdp.m64391m(this.f45672a[i3], (List) unsafe.getObject(obj2, j), zzew2, m64303k(i3));
                        break;
                    case 50:
                        m64311s(zzew2, i7, unsafe.getObject(obj2, j), i3);
                        break;
                    case 51:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53889l(i7, m64294C(obj2, j));
                            break;
                        }
                        break;
                    case 52:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53903y(i7, m64295D(obj2, j));
                            break;
                        }
                        break;
                    case 53:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53887j(i7, m64302j(obj2, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53871C(i7, m64302j(obj2, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53894p0(i7, m64298G(obj2, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53883f(i7, m64302j(obj2, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53897s(i7, m64298G(obj2, j));
                            break;
                        }
                        break;
                    case 58:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53885h(i7, m64317y(obj2, j));
                            break;
                        }
                        break;
                    case 59:
                        if (m64316x(obj2, i7, i3)) {
                            m64318z(i7, unsafe.getObject(obj2, j), zzew2);
                            break;
                        }
                        break;
                    case 60:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53874F(i7, unsafe.getObject(obj2, j), m64303k(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53875G(i7, (zzaw) unsafe.getObject(obj2, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53895q(i7, m64298G(obj2, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53901w(i7, m64298G(obj2, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53890m(i7, m64298G(obj2, j));
                            break;
                        }
                        break;
                    case 65:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53898t(i7, m64302j(obj2, j));
                            break;
                        }
                        break;
                    case 66:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53900v(i7, m64298G(obj2, j));
                            break;
                        }
                        break;
                    case 67:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53893p(i7, m64302j(obj2, j));
                            break;
                        }
                        break;
                    case 68:
                        if (m64316x(obj2, i7, i3)) {
                            zzew2.mo53876H(i7, unsafe.getObject(obj2, j), m64303k(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzee zzee = this.f45683l;
            zzee.mo54050g(zzee.mo54046c(obj2), zzew2);
            return;
        }
        this.f45684m.mo53913a(obj2);
        throw null;
    }

    /* renamed from: s */
    private final void m64311s(zzew zzew, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzcv zzcv = (zzcv) m64304l(i2);
            throw null;
        }
    }

    /* renamed from: t */
    private final boolean m64312t(Object obj, Object obj2, int i) {
        return m64313u(obj, i) == m64313u(obj2, i);
    }

    /* renamed from: u */
    private final boolean m64313u(Object obj, int i) {
        int H = m64299H(i);
        long j = (long) (H & 1048575);
        if (j != 1048575) {
            return (zzeo.m64496h(obj, j) & (1 << (H >>> 20))) != 0;
        }
        int i2 = m64301i(i);
        long j2 = (long) (i2 & 1048575);
        switch (m64300h(i2)) {
            case 0:
                return Double.doubleToRawLongBits(zzeo.m64494f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzeo.m64495g(obj, j2)) != 0;
            case 2:
                return zzeo.m64497i(obj, j2) != 0;
            case 3:
                return zzeo.m64497i(obj, j2) != 0;
            case 4:
                return zzeo.m64496h(obj, j2) != 0;
            case 5:
                return zzeo.m64497i(obj, j2) != 0;
            case 6:
                return zzeo.m64496h(obj, j2) != 0;
            case 7:
                return zzeo.m64485B(obj, j2);
            case 8:
                Object k = zzeo.m64499k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                }
                if (k instanceof zzaw) {
                    return !zzaw.f45541a.equals(k);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzeo.m64499k(obj, j2) != null;
            case 10:
                return !zzaw.f45541a.equals(zzeo.m64499k(obj, j2));
            case 11:
                return zzeo.m64496h(obj, j2) != 0;
            case 12:
                return zzeo.m64496h(obj, j2) != 0;
            case 13:
                return zzeo.m64496h(obj, j2) != 0;
            case 14:
                return zzeo.m64497i(obj, j2) != 0;
            case 15:
                return zzeo.m64496h(obj, j2) != 0;
            case 16:
                return zzeo.m64497i(obj, j2) != 0;
            case 17:
                return zzeo.m64499k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: v */
    private final boolean m64314v(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? m64313u(obj, i) : (i3 & i4) != 0;
    }

    /* renamed from: w */
    private static boolean m64315w(Object obj, int i, zzdn zzdn) {
        return zzdn.mo54000e(zzeo.m64499k(obj, (long) (i & 1048575)));
    }

    /* renamed from: x */
    private final boolean m64316x(Object obj, int i, int i2) {
        return zzeo.m64496h(obj, (long) (m64299H(i2) & 1048575)) == i;
    }

    /* renamed from: y */
    private static boolean m64317y(Object obj, long j) {
        return ((Boolean) zzeo.m64499k(obj, j)).booleanValue();
    }

    /* renamed from: z */
    private static final void m64318z(int i, Object obj, zzew zzew) throws IOException {
        if (obj instanceof String) {
            zzew.mo53886i(i, (String) obj);
        } else {
            zzew.mo53875G(i, (zzaw) obj);
        }
    }

    /* renamed from: a */
    public final int mo53996a(Object obj) {
        return this.f45678g ? m64297F(obj) : m64296E(obj);
    }

    /* renamed from: b */
    public final void mo53997b(Object obj, zzew zzew) throws IOException {
        if (!this.f45678g) {
            m64310r(obj, zzew);
        } else if (!this.f45677f) {
            int length = this.f45672a.length;
            for (int i = 0; i < length; i += 3) {
                int i2 = m64301i(i);
                int i3 = this.f45672a[i];
                switch (m64300h(i2)) {
                    case 0:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53889l(i3, zzeo.m64494f(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53903y(i3, zzeo.m64495g(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53887j(i3, zzeo.m64497i(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53871C(i3, zzeo.m64497i(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53894p0(i3, zzeo.m64496h(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53883f(i3, zzeo.m64497i(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53897s(i3, zzeo.m64496h(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53885h(i3, zzeo.m64485B(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            m64318z(i3, zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew);
                            break;
                        }
                    case 9:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53874F(i3, zzeo.m64499k(obj, (long) (i2 & 1048575)), m64303k(i));
                            break;
                        }
                    case 10:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53875G(i3, (zzaw) zzeo.m64499k(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53895q(i3, zzeo.m64496h(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53901w(i3, zzeo.m64496h(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53890m(i3, zzeo.m64496h(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53898t(i3, zzeo.m64497i(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53900v(i3, zzeo.m64496h(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53893p(i3, zzeo.m64497i(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m64313u(obj, i)) {
                            break;
                        } else {
                            zzew.mo53876H(i3, zzeo.m64499k(obj, (long) (i2 & 1048575)), m64303k(i));
                            break;
                        }
                    case 18:
                        zzdp.m64386h(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 19:
                        zzdp.m64390l(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 20:
                        zzdp.m64393o(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 21:
                        zzdp.m64401w(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 22:
                        zzdp.m64392n(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 23:
                        zzdp.m64389k(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 24:
                        zzdp.m64388j(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 25:
                        zzdp.m64384f(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 26:
                        zzdp.m64399u(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew);
                        break;
                    case 27:
                        zzdp.m64394p(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, m64303k(i));
                        break;
                    case 28:
                        zzdp.m64385g(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew);
                        break;
                    case 29:
                        zzdp.m64400v(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 30:
                        zzdp.m64387i(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 31:
                        zzdp.m64395q(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 32:
                        zzdp.m64396r(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 33:
                        zzdp.m64397s(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 34:
                        zzdp.m64398t(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, false);
                        break;
                    case 35:
                        zzdp.m64386h(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 36:
                        zzdp.m64390l(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 37:
                        zzdp.m64393o(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 38:
                        zzdp.m64401w(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 39:
                        zzdp.m64392n(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 40:
                        zzdp.m64389k(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 41:
                        zzdp.m64388j(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 42:
                        zzdp.m64384f(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 43:
                        zzdp.m64400v(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 44:
                        zzdp.m64387i(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 45:
                        zzdp.m64395q(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 46:
                        zzdp.m64396r(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 47:
                        zzdp.m64397s(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 48:
                        zzdp.m64398t(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, true);
                        break;
                    case 49:
                        zzdp.m64391m(i3, (List) zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew, m64303k(i));
                        break;
                    case 50:
                        m64311s(zzew, i3, zzeo.m64499k(obj, (long) (i2 & 1048575)), i);
                        break;
                    case 51:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53889l(i3, m64294C(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53903y(i3, m64295D(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53887j(i3, m64302j(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53871C(i3, m64302j(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53894p0(i3, m64298G(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53883f(i3, m64302j(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53897s(i3, m64298G(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53885h(i3, m64317y(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            m64318z(i3, zzeo.m64499k(obj, (long) (i2 & 1048575)), zzew);
                            break;
                        }
                    case 60:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53874F(i3, zzeo.m64499k(obj, (long) (i2 & 1048575)), m64303k(i));
                            break;
                        }
                    case 61:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53875G(i3, (zzaw) zzeo.m64499k(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53895q(i3, m64298G(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53901w(i3, m64298G(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53890m(i3, m64298G(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53898t(i3, m64302j(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53900v(i3, m64298G(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53893p(i3, m64302j(obj, (long) (i2 & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m64316x(obj, i3, i)) {
                            break;
                        } else {
                            zzew.mo53876H(i3, zzeo.m64499k(obj, (long) (i2 & 1048575)), m64303k(i));
                            break;
                        }
                }
            }
            zzee zzee = this.f45683l;
            zzee.mo54050g(zzee.mo54046c(obj), zzew);
        } else {
            this.f45684m.mo53913a(obj);
            throw null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo53998c(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f45672a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m64301i(r1)
            int[] r4 = r8.f45672a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m64300h(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m64302j(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m64298G(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m64302j(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m64298G(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m64298G(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m64298G(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m64317y(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64222a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m64298G(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m64302j(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m64298G(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m64302j(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m64302j(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m64295D(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m64316x(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m64294C(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.wearable.zzeo.m64497i(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.wearable.zzeo.m64496h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.wearable.zzeo.m64497i(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.wearable.zzeo.m64496h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.wearable.zzeo.m64496h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.wearable.zzeo.m64496h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.wearable.zzeo.m64499k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.wearable.zzeo.m64485B(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64222a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.wearable.zzeo.m64496h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.wearable.zzeo.m64497i(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.wearable.zzeo.m64496h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.wearable.zzeo.m64497i(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.wearable.zzeo.m64497i(r9, r5)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.wearable.zzeo.m64495g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.wearable.zzeo.m64494f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.wearable.zzcd.m64224c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.wearable.zzee r0 = r8.f45683l
            java.lang.Object r0 = r0.mo54046c(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f45677f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.wearable.zzbk r0 = r8.f45684m
            r0.mo53913a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzdf.mo53998c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final void mo53999d(Object obj) {
        int i;
        int i2 = this.f45680i;
        while (true) {
            i = this.f45681j;
            if (i2 >= i) {
                break;
            }
            long i3 = (long) (m64301i(this.f45679h[i2]) & 1048575);
            Object k = zzeo.m64499k(obj, i3);
            if (k != null) {
                ((zzcw) k).mo53983b();
                zzeo.m64512x(obj, i3, k);
            }
            i2++;
        }
        int length = this.f45679h.length;
        while (i < length) {
            this.f45682k.mo53972a(obj, (long) this.f45679h[i]);
            i++;
        }
        this.f45683l.mo54048e(obj);
        if (this.f45677f) {
            this.f45684m.mo53914b(obj);
        }
    }

    /* renamed from: e */
    public final boolean mo54000e(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f45680i) {
            int i6 = this.f45679h[i5];
            int i7 = this.f45672a[i6];
            int i8 = m64301i(i6);
            int i9 = this.f45672a[i6 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i3) {
                if (i10 != 1048575) {
                    i4 = f45671q.getInt(obj2, (long) i10);
                }
                i = i4;
                i2 = i10;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & i8) != 0 && !m64314v(obj, i6, i2, i, i11)) {
                return false;
            }
            int h = m64300h(i8);
            if (h != 9 && h != 17) {
                if (h != 27) {
                    if (h == 60 || h == 68) {
                        if (m64316x(obj2, i7, i6) && !m64315w(obj2, i8, m64303k(i6))) {
                            return false;
                        }
                    } else if (h != 49) {
                        if (h == 50 && !((zzcw) zzeo.m64499k(obj2, (long) (i8 & 1048575))).isEmpty()) {
                            zzcv zzcv = (zzcv) m64304l(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzeo.m64499k(obj2, (long) (i8 & 1048575));
                if (!list.isEmpty()) {
                    zzdn k = m64303k(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!k.mo54000e(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m64314v(obj, i6, i2, i, i11) && !m64315w(obj2, i8, m64303k(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f45677f) {
            return true;
        }
        this.f45684m.mo53913a(obj2);
        throw null;
    }

    /* renamed from: f */
    public final void mo54001f(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f45672a.length; i += 3) {
            int i2 = m64301i(i);
            long j = (long) (1048575 & i2);
            int i3 = this.f45672a[i];
            switch (m64300h(i2)) {
                case 0:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64508t(obj, j, zzeo.m64494f(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 1:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64509u(obj, j, zzeo.m64495g(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 2:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64511w(obj, j, zzeo.m64497i(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 3:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64511w(obj, j, zzeo.m64497i(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 4:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64510v(obj, j, zzeo.m64496h(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 5:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64511w(obj, j, zzeo.m64497i(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 6:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64510v(obj, j, zzeo.m64496h(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 7:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64506r(obj, j, zzeo.m64485B(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 8:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64512x(obj, j, zzeo.m64499k(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 9:
                    m64306n(obj, obj2, i);
                    break;
                case 10:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64512x(obj, j, zzeo.m64499k(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 11:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64510v(obj, j, zzeo.m64496h(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 12:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64510v(obj, j, zzeo.m64496h(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 13:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64510v(obj, j, zzeo.m64496h(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 14:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64511w(obj, j, zzeo.m64497i(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 15:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64510v(obj, j, zzeo.m64496h(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 16:
                    if (!m64313u(obj2, i)) {
                        break;
                    } else {
                        zzeo.m64511w(obj, j, zzeo.m64497i(obj2, j));
                        m64308p(obj, i);
                        break;
                    }
                case 17:
                    m64306n(obj, obj2, i);
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
                    this.f45682k.mo53973b(obj, obj2, j);
                    break;
                case 50:
                    zzdp.m64404z(this.f45686o, obj, obj2, j);
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
                    if (!m64316x(obj2, i3, i)) {
                        break;
                    } else {
                        zzeo.m64512x(obj, j, zzeo.m64499k(obj2, j));
                        m64309q(obj, i3, i);
                        break;
                    }
                case 60:
                    m64307o(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m64316x(obj2, i3, i)) {
                        break;
                    } else {
                        zzeo.m64512x(obj, j, zzeo.m64499k(obj2, j));
                        m64309q(obj, i3, i);
                        break;
                    }
                case 68:
                    m64307o(obj, obj2, i);
                    break;
            }
        }
        zzdp.m64382d(this.f45683l, obj, obj2);
        if (this.f45677f) {
            zzdp.m64381c(this.f45684m, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo54002g(Object obj, Object obj2) {
        boolean z;
        int length = this.f45672a.length;
        for (int i = 0; i < length; i += 3) {
            int i2 = m64301i(i);
            long j = (long) (i2 & 1048575);
            switch (m64300h(i2)) {
                case 0:
                    if (m64312t(obj, obj2, i) && Double.doubleToLongBits(zzeo.m64494f(obj, j)) == Double.doubleToLongBits(zzeo.m64494f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m64312t(obj, obj2, i) && Float.floatToIntBits(zzeo.m64495g(obj, j)) == Float.floatToIntBits(zzeo.m64495g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m64312t(obj, obj2, i) && zzeo.m64497i(obj, j) == zzeo.m64497i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m64312t(obj, obj2, i) && zzeo.m64497i(obj, j) == zzeo.m64497i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m64312t(obj, obj2, i) && zzeo.m64496h(obj, j) == zzeo.m64496h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m64312t(obj, obj2, i) && zzeo.m64497i(obj, j) == zzeo.m64497i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m64312t(obj, obj2, i) && zzeo.m64496h(obj, j) == zzeo.m64496h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m64312t(obj, obj2, i) && zzeo.m64485B(obj, j) == zzeo.m64485B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m64312t(obj, obj2, i) && zzdp.m64402x(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m64312t(obj, obj2, i) && zzdp.m64402x(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m64312t(obj, obj2, i) && zzdp.m64402x(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m64312t(obj, obj2, i) && zzeo.m64496h(obj, j) == zzeo.m64496h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m64312t(obj, obj2, i) && zzeo.m64496h(obj, j) == zzeo.m64496h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m64312t(obj, obj2, i) && zzeo.m64496h(obj, j) == zzeo.m64496h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m64312t(obj, obj2, i) && zzeo.m64497i(obj, j) == zzeo.m64497i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m64312t(obj, obj2, i) && zzeo.m64496h(obj, j) == zzeo.m64496h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m64312t(obj, obj2, i) && zzeo.m64497i(obj, j) == zzeo.m64497i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m64312t(obj, obj2, i) && zzdp.m64402x(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j))) {
                        continue;
                    }
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
                    z = zzdp.m64402x(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j));
                    break;
                case 50:
                    z = zzdp.m64402x(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long H = (long) (m64299H(i) & 1048575);
                    if (zzeo.m64496h(obj, H) == zzeo.m64496h(obj2, H) && zzdp.m64402x(zzeo.m64499k(obj, j), zzeo.m64499k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f45683l.mo54046c(obj).equals(this.f45683l.mo54046c(obj2))) {
            return false;
        }
        if (!this.f45677f) {
            return true;
        }
        this.f45684m.mo53913a(obj);
        this.f45684m.mo53913a(obj2);
        throw null;
    }
}
