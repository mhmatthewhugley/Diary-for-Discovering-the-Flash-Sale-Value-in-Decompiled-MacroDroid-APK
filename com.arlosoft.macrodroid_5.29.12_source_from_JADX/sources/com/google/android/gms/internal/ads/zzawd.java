package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawd {

    /* renamed from: a */
    private static final int f25980a = zzbar.m42991g("vide");

    /* renamed from: b */
    private static final int f25981b = zzbar.m42991g("soun");

    /* renamed from: c */
    private static final int f25982c = zzbar.m42991g("text");

    /* renamed from: d */
    private static final int f25983d = zzbar.m42991g("sbtl");

    /* renamed from: e */
    private static final int f25984e = zzbar.m42991g("subt");

    /* renamed from: f */
    private static final int f25985f = zzbar.m42991g("clcp");

    /* renamed from: g */
    private static final int f25986g = zzbar.m42991g("cenc");

    /* renamed from: h */
    private static final int f25987h = zzbar.m42991g("meta");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r11v16, types: [java.util.List] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0554: MOVE  (r6v19 java.lang.String) = (r44v0 java.lang.String)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0558  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x05a6  */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x07d5  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0827  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0830 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x0831  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c1  */
    /* renamed from: a */
    public static com.google.android.gms.internal.ads.zzawo m42643a(com.google.android.gms.internal.ads.zzavu r50, com.google.android.gms.internal.ads.zzavv r51, long r52, com.google.android.gms.internal.ads.zzauv r54, boolean r55) throws com.google.android.gms.internal.ads.zzasz {
        /*
            r0 = r50
            r15 = r54
            int r1 = com.google.android.gms.internal.ads.zzavw.f25866F
            com.google.android.gms.internal.ads.zzavu r1 = r0.mo42132d(r1)
            int r2 = com.google.android.gms.internal.ads.zzavw.f25890T
            com.google.android.gms.internal.ads.zzavv r2 = r1.mo42133e(r2)
            com.google.android.gms.internal.ads.zzbak r2 = r2.f25855P0
            r14 = 16
            r2.mo42336v(r14)
            int r2 = r2.mo42319e()
            int r3 = f25981b
            r4 = 4
            r11 = -1
            if (r2 != r3) goto L_0x0023
            r10 = 1
            goto L_0x0043
        L_0x0023:
            int r3 = f25980a
            if (r2 != r3) goto L_0x0029
            r10 = 2
            goto L_0x0043
        L_0x0029:
            int r3 = f25982c
            if (r2 == r3) goto L_0x0042
            int r3 = f25983d
            if (r2 == r3) goto L_0x0042
            int r3 = f25984e
            if (r2 == r3) goto L_0x0042
            int r3 = f25985f
            if (r2 != r3) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r3 = f25987h
            if (r2 != r3) goto L_0x0040
            r10 = 4
            goto L_0x0043
        L_0x0040:
            r10 = -1
            goto L_0x0043
        L_0x0042:
            r10 = 3
        L_0x0043:
            r8 = 0
            if (r10 != r11) goto L_0x0047
            return r8
        L_0x0047:
            int r2 = com.google.android.gms.internal.ads.zzavw.f25886P
            com.google.android.gms.internal.ads.zzavv r2 = r0.mo42133e(r2)
            com.google.android.gms.internal.ads.zzbak r2 = r2.f25855P0
            r7 = 8
            r2.mo42336v(r7)
            int r3 = r2.mo42319e()
            int r3 = com.google.android.gms.internal.ads.zzavw.m42634b(r3)
            if (r3 != 0) goto L_0x0061
            r5 = 8
            goto L_0x0063
        L_0x0061:
            r5 = 16
        L_0x0063:
            r2.mo42337w(r5)
            int r5 = r2.mo42319e()
            r2.mo42337w(r4)
            int r6 = r2.mo42317c()
            if (r3 != 0) goto L_0x0075
            r12 = 4
            goto L_0x0077
        L_0x0075:
            r12 = 8
        L_0x0077:
            r9 = 0
        L_0x0078:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 >= r12) goto L_0x009c
            byte[] r13 = r2.f26406a
            int r24 = r6 + r9
            byte r13 = r13[r24]
            if (r13 == r11) goto L_0x0099
            if (r3 != 0) goto L_0x0090
            long r12 = r2.mo42327m()
            goto L_0x0094
        L_0x0090:
            long r12 = r2.mo42328n()
        L_0x0094:
            int r3 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r3 != 0) goto L_0x00a1
            goto L_0x009f
        L_0x0099:
            int r9 = r9 + 1
            goto L_0x0078
        L_0x009c:
            r2.mo42337w(r12)
        L_0x009f:
            r12 = r21
        L_0x00a1:
            r2.mo42337w(r14)
            int r3 = r2.mo42319e()
            int r6 = r2.mo42319e()
            r2.mo42337w(r4)
            int r9 = r2.mo42319e()
            int r2 = r2.mo42319e()
            r4 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            if (r3 != 0) goto L_0x00d1
            if (r6 != r4) goto L_0x00d0
            if (r9 != r14) goto L_0x00cc
            if (r2 != 0) goto L_0x00c6
            r2 = 90
            goto L_0x00f1
        L_0x00c6:
            r3 = 0
            r6 = 65536(0x10000, float:9.18355E-41)
            r9 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00d1
        L_0x00cc:
            r3 = 0
            r6 = 65536(0x10000, float:9.18355E-41)
            goto L_0x00d1
        L_0x00d0:
            r3 = 0
        L_0x00d1:
            if (r3 != 0) goto L_0x00e4
            if (r6 != r14) goto L_0x00e1
            if (r9 != r4) goto L_0x00dc
            if (r2 != 0) goto L_0x00dd
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00f1
        L_0x00dc:
            r4 = r9
        L_0x00dd:
            r3 = 0
            r6 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00e5
        L_0x00e1:
            r4 = r9
            r3 = 0
            goto L_0x00e5
        L_0x00e4:
            r4 = r9
        L_0x00e5:
            if (r3 != r14) goto L_0x00f0
            if (r6 != 0) goto L_0x00f0
            if (r4 != 0) goto L_0x00f0
            if (r2 != r14) goto L_0x00f0
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00f1
        L_0x00f0:
            r2 = 0
        L_0x00f1:
            com.google.android.gms.internal.ads.zzawc r14 = new com.google.android.gms.internal.ads.zzawc
            r14.<init>(r5, r12, r2)
            int r2 = (r52 > r21 ? 1 : (r52 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x0103
            long r2 = r14.f25978b
            r26 = r2
            r2 = r51
            goto L_0x0107
        L_0x0103:
            r2 = r51
            r26 = r52
        L_0x0107:
            com.google.android.gms.internal.ads.zzbak r2 = r2.f25855P0
            r2.mo42336v(r7)
            int r3 = r2.mo42319e()
            int r3 = com.google.android.gms.internal.ads.zzavw.m42634b(r3)
            if (r3 != 0) goto L_0x0119
            r3 = 8
            goto L_0x011b
        L_0x0119:
            r3 = 16
        L_0x011b:
            r2.mo42337w(r3)
            long r32 = r2.mo42327m()
            int r2 = (r26 > r21 ? 1 : (r26 == r21 ? 0 : -1))
            if (r2 != 0) goto L_0x0129
            r26 = r21
            goto L_0x0134
        L_0x0129:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r32
            long r2 = com.google.android.gms.internal.ads.zzbar.m42994j(r26, r28, r30)
            r26 = r2
        L_0x0134:
            int r2 = com.google.android.gms.internal.ads.zzavw.f25868G
            com.google.android.gms.internal.ads.zzavu r2 = r1.mo42132d(r2)
            int r3 = com.google.android.gms.internal.ads.zzavw.f25870H
            com.google.android.gms.internal.ads.zzavu r2 = r2.mo42132d(r3)
            int r3 = com.google.android.gms.internal.ads.zzavw.f25889S
            com.google.android.gms.internal.ads.zzavv r1 = r1.mo42133e(r3)
            com.google.android.gms.internal.ads.zzbak r1 = r1.f25855P0
            r1.mo42336v(r7)
            int r3 = r1.mo42319e()
            int r3 = com.google.android.gms.internal.ads.zzavw.m42634b(r3)
            if (r3 != 0) goto L_0x0158
            r4 = 8
            goto L_0x015a
        L_0x0158:
            r4 = 16
        L_0x015a:
            r1.mo42337w(r4)
            long r4 = r1.mo42327m()
            if (r3 != 0) goto L_0x0165
            r3 = 4
            goto L_0x0167
        L_0x0165:
            r3 = 8
        L_0x0167:
            r1.mo42337w(r3)
            int r1 = r1.mo42324j()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r6 = r1 >> 10
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            int r6 = r1 >> 5
            r6 = r6 & 31
            int r6 = r6 + 96
            char r6 = (char) r6
            r3.append(r6)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r3.append(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = r3.toString()
            android.util.Pair r13 = android.util.Pair.create(r1, r3)
            int r1 = com.google.android.gms.internal.ads.zzavw.f25891U
            com.google.android.gms.internal.ads.zzavv r1 = r2.mo42133e(r1)
            com.google.android.gms.internal.ads.zzbak r12 = r1.f25855P0
            int r21 = r14.f25977a
            int r22 = r14.f25979c
            java.lang.Object r1 = r13.second
            r9 = r1
            java.lang.String r9 = (java.lang.String) r9
            r1 = 12
            r12.mo42336v(r1)
            int r6 = r12.mo42319e()
            com.google.android.gms.internal.ads.zzavz r5 = new com.google.android.gms.internal.ads.zzavz
            r5.<init>(r6)
            r4 = 0
        L_0x01bf:
            if (r4 >= r6) goto L_0x07b9
            int r3 = r12.mo42317c()
            int r2 = r12.mo42319e()
            if (r2 <= 0) goto L_0x01cf
            r24 = r10
            r1 = 1
            goto L_0x01d2
        L_0x01cf:
            r24 = r10
            r1 = 0
        L_0x01d2:
            java.lang.String r10 = "childAtomSize should be positive"
            com.google.android.gms.internal.ads.zzbac.m42925d(r1, r10)
            int r1 = r12.mo42319e()
            int r7 = com.google.android.gms.internal.ads.zzavw.f25900c
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25902d
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25897a0
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25919l0
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25904e
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25906f
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25908g
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25877K0
            if (r1 == r7) goto L_0x05b8
            int r7 = com.google.android.gms.internal.ads.zzavw.f25879L0
            if (r1 != r7) goto L_0x0201
            goto L_0x05b8
        L_0x0201:
            int r7 = com.google.android.gms.internal.ads.zzavw.f25914j
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25899b0
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25924o
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25928q
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25932s
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25938v
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25934t
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25936u
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25945y0
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25947z0
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25920m
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25922n
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25916k
            if (r1 == r7) goto L_0x0301
            int r7 = com.google.android.gms.internal.ads.zzavw.f25885O0
            if (r1 != r7) goto L_0x023b
            goto L_0x0301
        L_0x023b:
            int r7 = com.google.android.gms.internal.ads.zzavw.f25917k0
            if (r1 == r7) goto L_0x0272
            int r10 = com.google.android.gms.internal.ads.zzavw.f25937u0
            if (r1 == r10) goto L_0x0272
            int r10 = com.google.android.gms.internal.ads.zzavw.f25939v0
            if (r1 == r10) goto L_0x0272
            int r10 = com.google.android.gms.internal.ads.zzavw.f25941w0
            if (r1 == r10) goto L_0x0272
            int r10 = com.google.android.gms.internal.ads.zzavw.f25943x0
            if (r1 != r10) goto L_0x0250
            goto L_0x0272
        L_0x0250:
            int r7 = com.google.android.gms.internal.ads.zzavw.f25883N0
            if (r1 != r7) goto L_0x0260
            java.lang.String r1 = java.lang.Integer.toString(r21)
            java.lang.String r7 = "application/x-camera-motion"
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42373j(r1, r7, r8, r11, r15)
            r5.f25959b = r1
        L_0x0260:
            r29 = r2
            r23 = r3
            r35 = r4
            r2 = r5
            r31 = r6
            r34 = r9
            r0 = r12
            r46 = r13
            r17 = r14
            goto L_0x035e
        L_0x0272:
            int r10 = r3 + 16
            r12.mo42336v(r10)
            java.lang.String r10 = "application/ttml+xml"
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 != r7) goto L_0x0285
            r18 = r8
            r7 = r10
        L_0x0283:
            r10 = 1
            goto L_0x02ba
        L_0x0285:
            int r7 = com.google.android.gms.internal.ads.zzavw.f25937u0
            if (r1 != r7) goto L_0x029a
            int r1 = r2 + -16
            byte[] r7 = new byte[r1]
            r10 = 0
            r12.mo42331q(r7, r10, r1)
            java.util.List r1 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r18 = r1
            goto L_0x0283
        L_0x029a:
            int r7 = com.google.android.gms.internal.ads.zzavw.f25939v0
            if (r1 != r7) goto L_0x02a4
            java.lang.String r1 = "application/x-mp4-vtt"
            r7 = r1
            r18 = r8
            goto L_0x0283
        L_0x02a4:
            int r7 = com.google.android.gms.internal.ads.zzavw.f25941w0
            if (r1 != r7) goto L_0x02ae
            r18 = r8
            r7 = r10
            r29 = r19
            goto L_0x0283
        L_0x02ae:
            int r7 = com.google.android.gms.internal.ads.zzavw.f25943x0
            if (r1 != r7) goto L_0x02fb
            r10 = 1
            r5.f25961d = r10
            java.lang.String r1 = "application/x-mp4-cea-608"
            r7 = r1
            r18 = r8
        L_0x02ba:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r31 = 0
            r34 = -1
            r35 = 0
            r36 = -1
            r51 = r13
            r13 = r2
            r2 = r7
            r7 = r3
            r3 = r31
            r37 = r4
            r4 = r34
            r38 = r5
            r5 = r35
            r31 = r6
            r6 = r9
            r39 = r7
            r7 = r36
            r8 = r54
            r40 = r9
            r9 = r29
            r0 = -1
            r11 = r18
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42374k(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            r11 = r38
            r11.f25959b = r1
            r46 = r51
            r2 = r11
            r0 = r12
            r29 = r13
            r17 = r14
            r35 = r37
            r23 = r39
            goto L_0x035c
        L_0x02fb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0301:
            r39 = r3
            r37 = r4
            r11 = r5
            r31 = r6
            r40 = r9
            r51 = r13
            r0 = -1
            r13 = r2
            r9 = r39
            int r3 = r9 + 16
            r12.mo42336v(r3)
            r2 = 6
            if (r55 == 0) goto L_0x0322
            int r3 = r12.mo42324j()
            r12.mo42337w(r2)
            r8 = 8
            goto L_0x0328
        L_0x0322:
            r8 = 8
            r12.mo42337w(r8)
            r3 = 0
        L_0x0328:
            if (r3 == 0) goto L_0x0366
            r7 = 1
            if (r3 != r7) goto L_0x032f
            r6 = 2
            goto L_0x0368
        L_0x032f:
            r6 = 2
            if (r3 != r6) goto L_0x0350
            r2 = 16
            r12.mo42337w(r2)
            long r2 = r12.mo42326l()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r2 = java.lang.Math.round(r2)
            int r3 = (int) r2
            int r2 = r12.mo42323i()
            r4 = 20
            r12.mo42337w(r4)
            r5 = 16
            goto L_0x037f
        L_0x0350:
            r46 = r51
            r23 = r9
            r2 = r11
            r0 = r12
            r29 = r13
            r17 = r14
            r35 = r37
        L_0x035c:
            r34 = r40
        L_0x035e:
            r16 = 0
            r18 = 3
            r28 = -1
            goto L_0x079a
        L_0x0366:
            r6 = 2
            r7 = 1
        L_0x0368:
            int r4 = r12.mo42324j()
            r12.mo42337w(r2)
            int r2 = r12.mo42322h()
            if (r3 != r7) goto L_0x037b
            r5 = 16
            r12.mo42337w(r5)
            goto L_0x037d
        L_0x037b:
            r5 = 16
        L_0x037d:
            r3 = r2
            r2 = r4
        L_0x037f:
            int r4 = r12.mo42317c()
            int r5 = com.google.android.gms.internal.ads.zzavw.f25899b0
            if (r1 != r5) goto L_0x0391
            r5 = r37
            int r1 = m42647e(r12, r9, r13, r11, r5)
            r12.mo42336v(r4)
            goto L_0x0393
        L_0x0391:
            r5 = r37
        L_0x0393:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25924o
            java.lang.String r0 = "audio/raw"
            if (r1 != r6) goto L_0x039c
            java.lang.String r1 = "audio/ac3"
            goto L_0x03e5
        L_0x039c:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25928q
            if (r1 != r6) goto L_0x03a3
            java.lang.String r1 = "audio/eac3"
            goto L_0x03e5
        L_0x03a3:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25932s
            if (r1 != r6) goto L_0x03aa
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x03e5
        L_0x03aa:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25934t
            if (r1 == r6) goto L_0x03e3
            int r6 = com.google.android.gms.internal.ads.zzavw.f25936u
            if (r1 != r6) goto L_0x03b3
            goto L_0x03e3
        L_0x03b3:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25938v
            if (r1 != r6) goto L_0x03ba
            java.lang.String r1 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03e5
        L_0x03ba:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25945y0
            if (r1 != r6) goto L_0x03c1
            java.lang.String r1 = "audio/3gpp"
            goto L_0x03e5
        L_0x03c1:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25947z0
            if (r1 != r6) goto L_0x03c8
            java.lang.String r1 = "audio/amr-wb"
            goto L_0x03e5
        L_0x03c8:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25920m
            if (r1 == r6) goto L_0x03e1
            int r6 = com.google.android.gms.internal.ads.zzavw.f25922n
            if (r1 != r6) goto L_0x03d1
            goto L_0x03e1
        L_0x03d1:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25916k
            if (r1 != r6) goto L_0x03d8
            java.lang.String r1 = "audio/mpeg"
            goto L_0x03e5
        L_0x03d8:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25885O0
            if (r1 != r6) goto L_0x03df
            java.lang.String r1 = "audio/alac"
            goto L_0x03e5
        L_0x03df:
            r1 = 0
            goto L_0x03e5
        L_0x03e1:
            r1 = r0
            goto L_0x03e5
        L_0x03e3:
            java.lang.String r1 = "audio/vnd.dts.hd"
        L_0x03e5:
            r6 = r1
            r28 = r2
            r29 = r3
            r30 = 0
        L_0x03ec:
            int r1 = r4 - r9
            if (r1 >= r13) goto L_0x053f
            r12.mo42336v(r4)
            int r3 = r12.mo42319e()
            if (r3 <= 0) goto L_0x03fb
            r1 = 1
            goto L_0x03fc
        L_0x03fb:
            r1 = 0
        L_0x03fc:
            com.google.android.gms.internal.ads.zzbac.m42925d(r1, r10)
            int r1 = r12.mo42319e()
            int r2 = com.google.android.gms.internal.ads.zzavw.f25876K
            if (r1 == r2) goto L_0x04be
            if (r55 == 0) goto L_0x040f
            int r7 = com.google.android.gms.internal.ads.zzavw.f25918l
            if (r1 != r7) goto L_0x040f
            goto L_0x04be
        L_0x040f:
            int r2 = com.google.android.gms.internal.ads.zzavw.f25926p
            if (r1 != r2) goto L_0x0437
            int r1 = r4 + 8
            r12.mo42336v(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r7 = r40
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzati.m42419b(r12, r1, r7, r15)
            r11.f25959b = r1
        L_0x0424:
            r43 = r5
            r44 = r6
            r34 = r7
            r45 = r9
            r15 = r10
            r35 = r13
            r17 = 2
            r25 = 16
            r13 = r11
        L_0x0434:
            r11 = 0
            goto L_0x04b9
        L_0x0437:
            r7 = r40
            int r2 = com.google.android.gms.internal.ads.zzavw.f25930r
            if (r1 != r2) goto L_0x044d
            int r1 = r4 + 8
            r12.mo42336v(r1)
            java.lang.String r1 = java.lang.Integer.toString(r21)
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzati.m42420c(r12, r1, r7, r15)
            r11.f25959b = r1
            goto L_0x0424
        L_0x044d:
            int r2 = com.google.android.gms.internal.ads.zzavw.f25940w
            if (r1 != r2) goto L_0x0492
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r34 = 0
            r35 = -1
            r36 = -1
            r37 = 0
            r38 = 0
            r2 = r6
            r41 = r3
            r3 = r34
            r42 = r4
            r4 = r35
            r43 = r5
            r25 = 16
            r5 = r36
            r44 = r6
            r17 = 2
            r6 = r28
            r34 = r7
            r15 = 1
            r7 = r29
            r8 = r37
            r45 = r9
            r9 = r54
            r15 = r10
            r10 = r38
            r35 = r13
            r13 = r11
            r11 = r34
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42370g(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.f25959b = r1
        L_0x048d:
            r3 = r41
            r4 = r42
            goto L_0x0434
        L_0x0492:
            r41 = r3
            r42 = r4
            r43 = r5
            r44 = r6
            r34 = r7
            r45 = r9
            r15 = r10
            r35 = r13
            r17 = 2
            r25 = 16
            r13 = r11
            int r2 = com.google.android.gms.internal.ads.zzavw.f25885O0
            if (r1 != r2) goto L_0x048d
            r3 = r41
            byte[] r1 = new byte[r3]
            r4 = r42
            r12.mo42336v(r4)
            r11 = 0
            r12.mo42331q(r1, r11, r3)
            r30 = r1
        L_0x04b9:
            r6 = r44
            r10 = -1
            goto L_0x052d
        L_0x04be:
            r43 = r5
            r44 = r6
            r45 = r9
            r15 = r10
            r35 = r13
            r34 = r40
            r17 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            if (r1 != r2) goto L_0x04d4
            r1 = r4
        L_0x04d2:
            r10 = -1
            goto L_0x04f7
        L_0x04d4:
            int r1 = r12.mo42317c()
        L_0x04d8:
            int r2 = r1 - r4
            if (r2 >= r3) goto L_0x04f5
            r12.mo42336v(r1)
            int r2 = r12.mo42319e()
            if (r2 <= 0) goto L_0x04e7
            r9 = 1
            goto L_0x04e8
        L_0x04e7:
            r9 = 0
        L_0x04e8:
            com.google.android.gms.internal.ads.zzbac.m42925d(r9, r15)
            int r5 = r12.mo42319e()
            int r6 = com.google.android.gms.internal.ads.zzavw.f25876K
            if (r5 == r6) goto L_0x04d2
            int r1 = r1 + r2
            goto L_0x04d8
        L_0x04f5:
            r1 = -1
            goto L_0x04d2
        L_0x04f7:
            if (r1 == r10) goto L_0x052b
            android.util.Pair r1 = m42648f(r12, r1)
            java.lang.Object r2 = r1.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.second
            r30 = r1
            byte[] r30 = (byte[]) r30
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0529
            android.util.Pair r1 = com.google.android.gms.internal.ads.zzbad.m42928a(r30)
            java.lang.Object r5 = r1.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r28 = r1
            r6 = r2
            r29 = r5
            goto L_0x052d
        L_0x0529:
            r6 = r2
            goto L_0x052d
        L_0x052b:
            r6 = r44
        L_0x052d:
            int r4 = r4 + r3
            r11 = r13
            r10 = r15
            r40 = r34
            r13 = r35
            r5 = r43
            r9 = r45
            r7 = 1
            r8 = 8
            r15 = r54
            goto L_0x03ec
        L_0x053f:
            r43 = r5
            r44 = r6
            r45 = r9
            r35 = r13
            r34 = r40
            r10 = -1
            r17 = 2
            r25 = 16
            r13 = r11
            r11 = 0
            com.google.android.gms.internal.ads.zzasw r1 = r13.f25959b
            if (r1 != 0) goto L_0x05a6
            r6 = r44
            if (r6 == 0) goto L_0x05a6
            boolean r0 = r0.equals(r6)
            r15 = 1
            if (r15 == r0) goto L_0x0561
            r8 = -1
            goto L_0x0562
        L_0x0561:
            r8 = 2
        L_0x0562:
            java.lang.String r1 = java.lang.Integer.toString(r21)
            if (r30 != 0) goto L_0x056a
            r0 = 0
            goto L_0x056e
        L_0x056a:
            java.util.List r0 = java.util.Collections.singletonList(r30)
        L_0x056e:
            r3 = 0
            r4 = -1
            r5 = -1
            r9 = -1
            r18 = -1
            r23 = 0
            r30 = 0
            r2 = r6
            r6 = r28
            r7 = r29
            r28 = -1
            r10 = r18
            r18 = 0
            r11 = r0
            r0 = r12
            r12 = r54
            r46 = r51
            r47 = r13
            r48 = r35
            r16 = 0
            r13 = r23
            r17 = r14
            r14 = r34
            r15 = r30
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42371h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r14 = r47
            r14.f25959b = r1
            r2 = r14
            r35 = r43
            r23 = r45
            goto L_0x0796
        L_0x05a6:
            r46 = r51
            r0 = r12
            r17 = r14
            r16 = 0
            r28 = -1
            r2 = r13
            r29 = r35
            r35 = r43
            r23 = r45
            goto L_0x0798
        L_0x05b8:
            r48 = r2
            r45 = r3
            r43 = r4
            r31 = r6
            r34 = r9
            r15 = r10
            r0 = r12
            r46 = r13
            r17 = r14
            r16 = 0
            r28 = -1
            r14 = r5
            r13 = r45
            int r3 = r13 + 16
            r0.mo42336v(r3)
            r12 = 16
            r0.mo42337w(r12)
            int r6 = r0.mo42324j()
            int r7 = r0.mo42324j()
            r2 = 50
            r0.mo42337w(r2)
            int r2 = r0.mo42317c()
            int r3 = com.google.android.gms.internal.ads.zzavw.f25897a0
            if (r1 != r3) goto L_0x05fa
            r11 = r43
            r10 = r48
            int r1 = m42647e(r0, r13, r10, r14, r11)
            r0.mo42336v(r2)
            goto L_0x05fe
        L_0x05fa:
            r11 = r43
            r10 = r48
        L_0x05fe:
            r3 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 0
            r9 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r25 = -1
        L_0x0609:
            int r5 = r2 - r13
            if (r5 >= r10) goto L_0x0756
            r0.mo42336v(r2)
            int r5 = r0.mo42317c()
            int r8 = r0.mo42319e()
            if (r8 != 0) goto L_0x0624
            int r8 = r0.mo42317c()
            int r8 = r8 - r13
            if (r8 != r10) goto L_0x0623
            goto L_0x0756
        L_0x0623:
            r8 = 0
        L_0x0624:
            if (r8 <= 0) goto L_0x0628
            r12 = 1
            goto L_0x0629
        L_0x0628:
            r12 = 0
        L_0x0629:
            com.google.android.gms.internal.ads.zzbac.m42925d(r12, r15)
            int r12 = r0.mo42319e()
            r48 = r10
            int r10 = com.google.android.gms.internal.ads.zzavw.f25872I
            if (r12 != r10) goto L_0x0656
            if (r3 != 0) goto L_0x063a
            r9 = 1
            goto L_0x063b
        L_0x063a:
            r9 = 0
        L_0x063b:
            com.google.android.gms.internal.ads.zzbac.m42926e(r9)
            int r5 = r5 + 8
            r0.mo42336v(r5)
            com.google.android.gms.internal.ads.zzbas r3 = com.google.android.gms.internal.ads.zzbas.m43002a(r0)
            java.util.List r9 = r3.f26426a
            int r5 = r3.f26427b
            r14.f25960c = r5
            if (r4 != 0) goto L_0x0653
            float r3 = r3.f26428c
            r18 = r3
        L_0x0653:
            java.lang.String r3 = "video/avc"
            goto L_0x0673
        L_0x0656:
            int r10 = com.google.android.gms.internal.ads.zzavw.f25874J
            if (r12 != r10) goto L_0x067a
            if (r3 != 0) goto L_0x065e
            r9 = 1
            goto L_0x065f
        L_0x065e:
            r9 = 0
        L_0x065f:
            com.google.android.gms.internal.ads.zzbac.m42926e(r9)
            int r5 = r5 + 8
            r0.mo42336v(r5)
            com.google.android.gms.internal.ads.zzbay r3 = com.google.android.gms.internal.ads.zzbay.m43008a(r0)
            java.util.List r9 = r3.f26444a
            int r3 = r3.f26445b
            r14.f25960c = r3
            java.lang.String r3 = "video/hevc"
        L_0x0673:
            r29 = r1
        L_0x0675:
            r5 = 2
            r10 = 1
            r12 = 3
            goto L_0x074d
        L_0x067a:
            int r10 = com.google.android.gms.internal.ads.zzavw.f25881M0
            if (r12 != r10) goto L_0x0690
            if (r3 != 0) goto L_0x0682
            r3 = 1
            goto L_0x0683
        L_0x0682:
            r3 = 0
        L_0x0683:
            com.google.android.gms.internal.ads.zzbac.m42926e(r3)
            int r3 = com.google.android.gms.internal.ads.zzavw.f25877K0
            if (r1 != r3) goto L_0x068d
            java.lang.String r3 = "video/x-vnd.on2.vp8"
            goto L_0x0673
        L_0x068d:
            java.lang.String r3 = "video/x-vnd.on2.vp9"
            goto L_0x0673
        L_0x0690:
            int r10 = com.google.android.gms.internal.ads.zzavw.f25910h
            if (r12 != r10) goto L_0x069f
            if (r3 != 0) goto L_0x0698
            r3 = 1
            goto L_0x0699
        L_0x0698:
            r3 = 0
        L_0x0699:
            com.google.android.gms.internal.ads.zzbac.m42926e(r3)
            java.lang.String r3 = "video/3gpp"
            goto L_0x0673
        L_0x069f:
            int r10 = com.google.android.gms.internal.ads.zzavw.f25876K
            if (r12 != r10) goto L_0x06bf
            if (r3 != 0) goto L_0x06a7
            r9 = 1
            goto L_0x06a8
        L_0x06a7:
            r9 = 0
        L_0x06a8:
            com.google.android.gms.internal.ads.zzbac.m42926e(r9)
            android.util.Pair r3 = m42648f(r0, r5)
            java.lang.Object r5 = r3.first
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.second
            byte[] r3 = (byte[]) r3
            java.util.List r9 = java.util.Collections.singletonList(r3)
            r29 = r1
            r3 = r5
            goto L_0x0675
        L_0x06bf:
            int r10 = com.google.android.gms.internal.ads.zzavw.f25915j0
            if (r12 != r10) goto L_0x06d8
            int r5 = r5 + 8
            r0.mo42336v(r5)
            int r4 = r0.mo42323i()
            float r4 = (float) r4
            int r5 = r0.mo42323i()
            float r5 = (float) r5
            float r18 = r4 / r5
            r29 = r1
            r4 = 1
            goto L_0x0675
        L_0x06d8:
            int r10 = com.google.android.gms.internal.ads.zzavw.f25873I0
            if (r12 != r10) goto L_0x070e
            int r10 = r5 + 8
        L_0x06de:
            int r12 = r10 - r5
            if (r12 >= r8) goto L_0x0703
            r0.mo42336v(r10)
            int r12 = r0.mo42319e()
            r29 = r1
            int r1 = r0.mo42319e()
            r51 = r4
            int r4 = com.google.android.gms.internal.ads.zzavw.f25875J0
            if (r1 != r4) goto L_0x06fd
            byte[] r1 = r0.f26406a
            int r12 = r12 + r10
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r10, r12)
            goto L_0x0708
        L_0x06fd:
            int r10 = r10 + r12
            r4 = r51
            r1 = r29
            goto L_0x06de
        L_0x0703:
            r29 = r1
            r51 = r4
            r1 = 0
        L_0x0708:
            r4 = r51
            r23 = r1
            goto L_0x0675
        L_0x070e:
            r29 = r1
            r51 = r4
            int r1 = com.google.android.gms.internal.ads.zzavw.f25871H0
            if (r12 != r1) goto L_0x0748
            int r1 = r0.mo42321g()
            r12 = 3
            r0.mo42337w(r12)
            if (r1 != 0) goto L_0x0745
            int r1 = r0.mo42321g()
            if (r1 == 0) goto L_0x073e
            r10 = 1
            r5 = 2
            if (r1 == r10) goto L_0x0739
            if (r1 == r5) goto L_0x0734
            if (r1 == r12) goto L_0x072f
            goto L_0x074b
        L_0x072f:
            r4 = r51
            r25 = 3
            goto L_0x074d
        L_0x0734:
            r4 = r51
            r25 = 2
            goto L_0x074d
        L_0x0739:
            r4 = r51
            r25 = 1
            goto L_0x074d
        L_0x073e:
            r5 = 2
            r10 = 1
            r4 = r51
            r25 = 0
            goto L_0x074d
        L_0x0745:
            r5 = 2
            r10 = 1
            goto L_0x074b
        L_0x0748:
            r5 = 2
            r10 = 1
            r12 = 3
        L_0x074b:
            r4 = r51
        L_0x074d:
            int r2 = r2 + r8
            r1 = r29
            r10 = r48
            r12 = 16
            goto L_0x0609
        L_0x0756:
            r48 = r10
            r5 = 2
            r10 = 1
            r12 = 3
            if (r3 == 0) goto L_0x0791
            java.lang.String r1 = java.lang.Integer.toString(r21)
            r4 = 0
            r8 = -1
            r15 = -1
            r29 = -1082130432(0xffffffffbf800000, float:-1.0)
            r30 = 0
            r2 = r3
            r3 = r4
            r4 = r8
            r8 = 2
            r5 = r15
            r15 = 2
            r8 = r29
            r29 = r48
            r10 = r22
            r35 = r11
            r11 = r18
            r18 = 3
            r36 = 16
            r12 = r23
            r23 = r13
            r13 = r25
            r49 = r14
            r14 = r30
            r15 = r54
            com.google.android.gms.internal.ads.zzasw r1 = com.google.android.gms.internal.ads.zzasw.m42375l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = r49
            r2.f25959b = r1
            goto L_0x079c
        L_0x0791:
            r35 = r11
            r23 = r13
            r2 = r14
        L_0x0796:
            r29 = r48
        L_0x0798:
            r18 = 3
        L_0x079a:
            r36 = 16
        L_0x079c:
            int r3 = r23 + r29
            r0.mo42336v(r3)
            int r4 = r35 + 1
            r15 = r54
            r12 = r0
            r5 = r2
            r14 = r17
            r10 = r24
            r6 = r31
            r9 = r34
            r13 = r46
            r7 = 8
            r8 = 0
            r11 = -1
            r0 = r50
            goto L_0x01bf
        L_0x07b9:
            r2 = r5
            r24 = r10
            r46 = r13
            r17 = r14
            r16 = 0
            int r0 = com.google.android.gms.internal.ads.zzavw.f25887Q
            r1 = r50
            com.google.android.gms.internal.ads.zzavu r0 = r1.mo42132d(r0)
            if (r0 == 0) goto L_0x0827
            int r1 = com.google.android.gms.internal.ads.zzavw.f25888R
            com.google.android.gms.internal.ads.zzavv r0 = r0.mo42133e(r1)
            if (r0 != 0) goto L_0x07d5
            goto L_0x0827
        L_0x07d5:
            com.google.android.gms.internal.ads.zzbak r0 = r0.f25855P0
            r1 = 8
            r0.mo42336v(r1)
            int r1 = r0.mo42319e()
            int r1 = com.google.android.gms.internal.ads.zzavw.m42634b(r1)
            int r3 = r0.mo42323i()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r13 = 0
        L_0x07ed:
            if (r13 >= r3) goto L_0x0820
            r6 = 1
            if (r1 != r6) goto L_0x07f7
            long r7 = r0.mo42328n()
            goto L_0x07fb
        L_0x07f7:
            long r7 = r0.mo42327m()
        L_0x07fb:
            r4[r13] = r7
            if (r1 != r6) goto L_0x0804
            long r7 = r0.mo42326l()
            goto L_0x0809
        L_0x0804:
            int r7 = r0.mo42319e()
            long r7 = (long) r7
        L_0x0809:
            r5[r13] = r7
            short r7 = r0.mo42330p()
            if (r7 != r6) goto L_0x0818
            r7 = 2
            r0.mo42337w(r7)
            int r13 = r13 + 1
            goto L_0x07ed
        L_0x0818:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0820:
            android.util.Pair r0 = android.util.Pair.create(r4, r5)
            r1 = r0
            r0 = 0
            goto L_0x082c
        L_0x0827:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x082c:
            com.google.android.gms.internal.ads.zzasw r3 = r2.f25959b
            if (r3 != 0) goto L_0x0831
            return r0
        L_0x0831:
            com.google.android.gms.internal.ads.zzawo r0 = new com.google.android.gms.internal.ads.zzawo
            int r16 = r17.f25977a
            r3 = r46
            java.lang.Object r3 = r3.first
            java.lang.Long r3 = (java.lang.Long) r3
            long r18 = r3.longValue()
            com.google.android.gms.internal.ads.zzasw r3 = r2.f25959b
            int r4 = r2.f25961d
            com.google.android.gms.internal.ads.zzawp[] r5 = r2.f25958a
            int r2 = r2.f25960c
            java.lang.Object r6 = r1.first
            r28 = r6
            long[] r28 = (long[]) r28
            java.lang.Object r1 = r1.second
            r29 = r1
            long[] r29 = (long[]) r29
            r15 = r0
            r17 = r24
            r20 = r32
            r22 = r26
            r24 = r3
            r25 = r4
            r26 = r5
            r27 = r2
            r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawd.m42643a(com.google.android.gms.internal.ads.zzavu, com.google.android.gms.internal.ads.zzavv, long, com.google.android.gms.internal.ads.zzauv, boolean):com.google.android.gms.internal.ads.zzawo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ac  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0174 A[LOOP:5: B:57:0x0174->B:58:0x0176, LOOP_START, PHI: r14 r15 r22 r25 
      PHI: (r14v4 int) = (r14v2 int), (r14v11 int) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r15v5 int) = (r15v3 int), (r15v11 int) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v6 int) = (r22v5 int), (r22v9 int) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v4 long) = (r25v3 long), (r25v6 long) binds: [B:56:0x0172, B:58:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0238  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzawr m42644b(com.google.android.gms.internal.ads.zzawo r42, com.google.android.gms.internal.ads.zzavu r43, com.google.android.gms.internal.ads.zzavd r44) throws com.google.android.gms.internal.ads.zzasz {
        /*
            r0 = r42
            r1 = r43
            r2 = r44
            int r3 = com.google.android.gms.internal.ads.zzavw.f25929q0
            com.google.android.gms.internal.ads.zzavv r3 = r1.mo42133e(r3)
            if (r3 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.zzawa r4 = new com.google.android.gms.internal.ads.zzawa
            r4.<init>(r3)
            goto L_0x0021
        L_0x0014:
            int r3 = com.google.android.gms.internal.ads.zzavw.f25931r0
            com.google.android.gms.internal.ads.zzavv r3 = r1.mo42133e(r3)
            if (r3 == 0) goto L_0x04cf
            com.google.android.gms.internal.ads.zzawb r4 = new com.google.android.gms.internal.ads.zzawb
            r4.<init>(r3)
        L_0x0021:
            int r3 = r4.zza()
            r5 = 0
            if (r3 != 0) goto L_0x0038
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            long[] r7 = new long[r5]
            int[] r8 = new int[r5]
            r9 = 0
            long[] r10 = new long[r5]
            int[] r11 = new int[r5]
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            return r0
        L_0x0038:
            int r6 = com.google.android.gms.internal.ads.zzavw.f25933s0
            com.google.android.gms.internal.ads.zzavv r6 = r1.mo42133e(r6)
            if (r6 != 0) goto L_0x0048
            int r6 = com.google.android.gms.internal.ads.zzavw.f25935t0
            com.google.android.gms.internal.ads.zzavv r6 = r1.mo42133e(r6)
            r8 = 1
            goto L_0x0049
        L_0x0048:
            r8 = 0
        L_0x0049:
            com.google.android.gms.internal.ads.zzbak r6 = r6.f25855P0
            int r9 = com.google.android.gms.internal.ads.zzavw.f25927p0
            com.google.android.gms.internal.ads.zzavv r9 = r1.mo42133e(r9)
            com.google.android.gms.internal.ads.zzbak r9 = r9.f25855P0
            int r10 = com.google.android.gms.internal.ads.zzavw.f25921m0
            com.google.android.gms.internal.ads.zzavv r10 = r1.mo42133e(r10)
            com.google.android.gms.internal.ads.zzbak r10 = r10.f25855P0
            int r11 = com.google.android.gms.internal.ads.zzavw.f25923n0
            com.google.android.gms.internal.ads.zzavv r11 = r1.mo42133e(r11)
            r12 = 0
            if (r11 == 0) goto L_0x0067
            com.google.android.gms.internal.ads.zzbak r11 = r11.f25855P0
            goto L_0x0068
        L_0x0067:
            r11 = r12
        L_0x0068:
            int r13 = com.google.android.gms.internal.ads.zzavw.f25925o0
            com.google.android.gms.internal.ads.zzavv r1 = r1.mo42133e(r13)
            if (r1 == 0) goto L_0x0073
            com.google.android.gms.internal.ads.zzbak r1 = r1.f25855P0
            goto L_0x0074
        L_0x0073:
            r1 = r12
        L_0x0074:
            com.google.android.gms.internal.ads.zzavx r13 = new com.google.android.gms.internal.ads.zzavx
            r13.<init>(r9, r6, r8)
            r6 = 12
            r10.mo42336v(r6)
            int r8 = r10.mo42323i()
            r9 = -1
            int r8 = r8 + r9
            int r14 = r10.mo42323i()
            int r15 = r10.mo42323i()
            if (r1 == 0) goto L_0x0096
            r1.mo42336v(r6)
            int r16 = r1.mo42323i()
            goto L_0x0098
        L_0x0096:
            r16 = 0
        L_0x0098:
            if (r11 == 0) goto L_0x00ab
            r11.mo42336v(r6)
            int r6 = r11.mo42323i()
            if (r6 <= 0) goto L_0x00a9
            int r12 = r11.mo42323i()
            int r12 = r12 + r9
            goto L_0x00ad
        L_0x00a9:
            r11 = r12
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            r12 = -1
        L_0x00ad:
            boolean r17 = r4.mo42138a()
            r18 = 0
            if (r17 == 0) goto L_0x015c
            com.google.android.gms.internal.ads.zzasw r5 = r0.f26084f
            java.lang.String r5 = r5.f25527o
            java.lang.String r9 = "audio/raw"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x015c
            if (r8 != 0) goto L_0x015c
            if (r16 != 0) goto L_0x015b
            if (r6 != 0) goto L_0x015b
            int r1 = r13.f25949a
            long[] r5 = new long[r1]
            int[] r6 = new int[r1]
        L_0x00cd:
            boolean r8 = r13.mo42137a()
            if (r8 == 0) goto L_0x00de
            int r8 = r13.f25950b
            long r9 = r13.f25952d
            r5[r8] = r9
            int r9 = r13.f25951c
            r6[r8] = r9
            goto L_0x00cd
        L_0x00de:
            int r4 = r4.zzb()
            long r8 = (long) r15
            r10 = 8192(0x2000, float:1.14794E-41)
            int r10 = r10 / r4
            r11 = 0
            r12 = 0
        L_0x00e8:
            if (r11 >= r1) goto L_0x00f4
            r13 = r6[r11]
            int r13 = com.google.android.gms.internal.ads.zzbar.m42988d(r13, r10)
            int r12 = r12 + r13
            int r11 = r11 + 1
            goto L_0x00e8
        L_0x00f4:
            long[] r11 = new long[r12]
            int[] r13 = new int[r12]
            long[] r14 = new long[r12]
            int[] r12 = new int[r12]
            r15 = 0
            r16 = 0
            r20 = 0
            r21 = 0
        L_0x0103:
            if (r15 >= r1) goto L_0x0152
            r22 = r6[r15]
            r23 = r5[r15]
            r7 = r16
            r40 = r20
            r20 = r1
            r1 = r40
            r41 = r22
            r22 = r5
            r5 = r41
        L_0x0117:
            if (r5 <= 0) goto L_0x0143
            int r16 = java.lang.Math.min(r10, r5)
            r11[r21] = r23
            r25 = r6
            int r6 = r4 * r16
            r13[r21] = r6
            int r7 = java.lang.Math.max(r7, r6)
            r26 = r7
            long r6 = (long) r1
            long r6 = r6 * r8
            r14[r21] = r6
            r6 = 1
            r12[r21] = r6
            r6 = r13[r21]
            long r6 = (long) r6
            long r23 = r23 + r6
            int r1 = r1 + r16
            int r5 = r5 - r16
            int r21 = r21 + 1
            r6 = r25
            r7 = r26
            goto L_0x0117
        L_0x0143:
            r25 = r6
            int r15 = r15 + 1
            r16 = r7
            r5 = r22
            r40 = r20
            r20 = r1
            r1 = r40
            goto L_0x0103
        L_0x0152:
            r4 = r0
            r15 = r12
            r12 = r13
            r13 = r16
            r27 = r18
            goto L_0x02a0
        L_0x015b:
            r8 = 0
        L_0x015c:
            long[] r5 = new long[r3]
            int[] r7 = new int[r3]
            long[] r9 = new long[r3]
            r20 = r6
            int[] r6 = new int[r3]
            r25 = r18
            r27 = r25
            r0 = 0
            r2 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0172:
            if (r2 >= r3) goto L_0x0214
        L_0x0174:
            if (r22 != 0) goto L_0x018e
            boolean r22 = r13.mo42137a()
            com.google.android.gms.internal.ads.zzbac.m42926e(r22)
            r24 = r14
            r29 = r15
            long r14 = r13.f25952d
            r25 = r14
            int r14 = r13.f25951c
            r22 = r14
            r14 = r24
            r15 = r29
            goto L_0x0174
        L_0x018e:
            r24 = r14
            r29 = r15
            if (r1 == 0) goto L_0x01aa
        L_0x0194:
            if (r21 != 0) goto L_0x01a7
            if (r16 <= 0) goto L_0x01a3
            int r21 = r1.mo42323i()
            int r23 = r1.mo42319e()
            int r16 = r16 + -1
            goto L_0x0194
        L_0x01a3:
            r14 = -1
            r21 = 0
            goto L_0x01a8
        L_0x01a7:
            r14 = -1
        L_0x01a8:
            int r21 = r21 + -1
        L_0x01aa:
            r14 = r23
            r5[r2] = r25
            int r15 = r4.zzb()
            r7[r2] = r15
            if (r15 <= r0) goto L_0x01bb
            r23 = r5
            r0 = r15
            r15 = r4
            goto L_0x01be
        L_0x01bb:
            r15 = r4
            r23 = r5
        L_0x01be:
            long r4 = (long) r14
            long r4 = r27 + r4
            r9[r2] = r4
            if (r11 != 0) goto L_0x01c7
            r4 = 1
            goto L_0x01c8
        L_0x01c7:
            r4 = 0
        L_0x01c8:
            r6[r2] = r4
            if (r2 != r12) goto L_0x01da
            r4 = 1
            r6[r2] = r4
            int r20 = r20 + -1
            if (r20 <= 0) goto L_0x01da
            int r4 = r11.mo42323i()
            r5 = -1
            int r4 = r4 + r5
            r12 = r4
        L_0x01da:
            r4 = r29
            r29 = r6
            long r5 = (long) r4
            long r27 = r27 + r5
            int r5 = r24 + -1
            if (r5 != 0) goto L_0x01f5
            if (r8 <= 0) goto L_0x01f2
            int r4 = r10.mo42323i()
            int r5 = r10.mo42323i()
            int r8 = r8 + -1
            goto L_0x01fa
        L_0x01f2:
            r5 = r4
            r4 = 0
            goto L_0x01fa
        L_0x01f5:
            r40 = r5
            r5 = r4
            r4 = r40
        L_0x01fa:
            r6 = r7[r2]
            r24 = r4
            r30 = r5
            long r4 = (long) r6
            long r25 = r25 + r4
            int r22 = r22 + -1
            int r2 = r2 + 1
            r4 = r15
            r5 = r23
            r6 = r29
            r15 = r30
            r23 = r14
            r14 = r24
            goto L_0x0172
        L_0x0214:
            r23 = r5
            r29 = r6
            r24 = r14
            if (r21 != 0) goto L_0x021e
            r2 = 1
            goto L_0x021f
        L_0x021e:
            r2 = 0
        L_0x021f:
            com.google.android.gms.internal.ads.zzbac.m42924c(r2)
        L_0x0222:
            if (r16 <= 0) goto L_0x0236
            int r2 = r1.mo42323i()
            if (r2 != 0) goto L_0x022c
            r2 = 1
            goto L_0x022d
        L_0x022c:
            r2 = 0
        L_0x022d:
            com.google.android.gms.internal.ads.zzbac.m42924c(r2)
            r1.mo42319e()
            int r16 = r16 + -1
            goto L_0x0222
        L_0x0236:
            if (r20 != 0) goto L_0x0258
            if (r24 != 0) goto L_0x024f
            if (r22 != 0) goto L_0x0248
            if (r8 == 0) goto L_0x0244
            r1 = 0
            r2 = 0
            r4 = r42
            r5 = r0
            goto L_0x0256
        L_0x0244:
            r4 = r42
            r5 = r0
            goto L_0x0299
        L_0x0248:
            r1 = 0
            r4 = r42
            r5 = r0
            r2 = r22
            goto L_0x0256
        L_0x024f:
            r4 = r42
            r5 = r0
            r2 = r22
            r1 = r24
        L_0x0256:
            r0 = 0
            goto L_0x0261
        L_0x0258:
            r4 = r42
            r5 = r0
            r0 = r20
            r2 = r22
            r1 = r24
        L_0x0261:
            int r6 = r4.f26079a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Inconsistent stbl box for track "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r6 = ": remainingSynchronizationSamples "
            r10.append(r6)
            r10.append(r0)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = "AtomParsers"
            android.util.Log.w(r1, r0)
        L_0x0299:
            r13 = r5
            r12 = r7
            r14 = r9
            r11 = r23
            r15 = r29
        L_0x02a0:
            long[] r0 = r4.f26087i
            if (r0 == 0) goto L_0x04b6
            boolean r5 = r44.mo42110a()
            if (r5 == 0) goto L_0x02ac
            goto L_0x04b6
        L_0x02ac:
            int r5 = r0.length
            r6 = 1
            if (r5 != r6) goto L_0x0338
            int r5 = r4.f26080b
            if (r5 != r6) goto L_0x0338
            int r5 = r14.length
            r6 = 2
            if (r5 < r6) goto L_0x0338
            long[] r6 = r4.f26088j
            r7 = 0
            r8 = r6[r7]
            r29 = r0[r7]
            long r1 = r4.f26081c
            r22 = r8
            long r7 = r4.f26082d
            r31 = r1
            r33 = r7
            long r0 = com.google.android.gms.internal.ads.zzbar.m42994j(r29, r31, r33)
            long r8 = r22 + r0
            r0 = 0
            r1 = r14[r0]
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 > 0) goto L_0x0338
            r0 = 1
            r6 = r14[r0]
            int r0 = (r22 > r6 ? 1 : (r22 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0338
            r0 = -1
            int r5 = r5 + r0
            r5 = r14[r5]
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0338
            int r0 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r0 > 0) goto L_0x0338
            long r29 = r22 - r1
            com.google.android.gms.internal.ads.zzasw r0 = r4.f26084f
            int r0 = r0.f25513J
            long r0 = (long) r0
            long r5 = r4.f26081c
            r31 = r0
            r33 = r5
            long r0 = com.google.android.gms.internal.ads.zzbar.m42994j(r29, r31, r33)
            long r29 = r27 - r8
            com.google.android.gms.internal.ads.zzasw r2 = r4.f26084f
            int r2 = r2.f25513J
            long r5 = (long) r2
            long r7 = r4.f26081c
            r31 = r5
            r33 = r7
            long r5 = com.google.android.gms.internal.ads.zzbar.m42994j(r29, r31, r33)
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L_0x0315
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0338
            r0 = r18
        L_0x0315:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0338
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0321
            goto L_0x0338
        L_0x0321:
            int r1 = (int) r0
            r0 = r44
            r0.f25733a = r1
            int r1 = (int) r5
            r0.f25734b = r1
            long r0 = r4.f26081c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzbar.m42998n(r14, r2, r0)
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x0338:
            long[] r0 = r4.f26087i
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto L_0x036b
            r17 = 0
            r1 = r0[r17]
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x036b
            r0 = 0
        L_0x0347:
            int r1 = r14.length
            if (r0 >= r1) goto L_0x0364
            r1 = r14[r0]
            long[] r3 = r4.f26088j
            r5 = r3[r17]
            long r18 = r1 - r5
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r4.f26081c
            r22 = r1
            long r1 = com.google.android.gms.internal.ads.zzbar.m42994j(r18, r20, r22)
            r14[r0] = r1
            int r0 = r0 + 1
            r17 = 0
            goto L_0x0347
        L_0x0364:
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x036b:
            int r0 = r4.f26080b
            r1 = 1
            if (r0 != r1) goto L_0x0372
            r6 = 1
            goto L_0x0373
        L_0x0372:
            r6 = 0
        L_0x0373:
            r0 = 0
            r1 = 0
            r2 = 0
            r7 = 0
        L_0x0377:
            long[] r5 = r4.f26087i
            int r8 = r5.length
            r9 = -1
            if (r7 >= r8) goto L_0x03b9
            long[] r8 = r4.f26088j
            r43 = r12
            r16 = r13
            r12 = r8[r7]
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x03b0
            r25 = r5[r7]
            long r8 = r4.f26081c
            r5 = r11
            long r10 = r4.f26082d
            r27 = r8
            r29 = r10
            long r8 = com.google.android.gms.internal.ads.zzbar.m42994j(r25, r27, r29)
            r10 = 1
            int r11 = com.google.android.gms.internal.ads.zzbar.m42986b(r14, r12, r10, r10)
            long r12 = r12 + r8
            r8 = 0
            int r9 = com.google.android.gms.internal.ads.zzbar.m42986b(r14, r12, r6, r8)
            int r8 = r9 - r11
            int r0 = r0 + r8
            if (r1 == r11) goto L_0x03ab
            r1 = 1
            goto L_0x03ac
        L_0x03ab:
            r1 = 0
        L_0x03ac:
            r1 = r1 | r2
            r2 = r1
            r1 = r9
            goto L_0x03b1
        L_0x03b0:
            r5 = r11
        L_0x03b1:
            int r7 = r7 + 1
            r12 = r43
            r11 = r5
            r13 = r16
            goto L_0x0377
        L_0x03b9:
            r5 = r11
            r43 = r12
            r16 = r13
            if (r0 == r3) goto L_0x03c2
            r1 = 1
            goto L_0x03c3
        L_0x03c2:
            r1 = 0
        L_0x03c3:
            r1 = r1 | r2
            if (r1 == 0) goto L_0x03c9
            long[] r2 = new long[r0]
            goto L_0x03ca
        L_0x03c9:
            r2 = r5
        L_0x03ca:
            if (r1 == 0) goto L_0x03cf
            int[] r3 = new int[r0]
            goto L_0x03d1
        L_0x03cf:
            r3 = r43
        L_0x03d1:
            r7 = 1
            if (r7 != r1) goto L_0x03d6
            r13 = 0
            goto L_0x03d8
        L_0x03d6:
            r13 = r16
        L_0x03d8:
            if (r1 == 0) goto L_0x03dd
            int[] r7 = new int[r0]
            goto L_0x03de
        L_0x03dd:
            r7 = r15
        L_0x03de:
            long[] r0 = new long[r0]
            r28 = r13
            r12 = r18
            r8 = 0
            r11 = 0
        L_0x03e6:
            long[] r9 = r4.f26087i
            int r10 = r9.length
            if (r8 >= r10) goto L_0x048b
            long[] r10 = r4.f26088j
            r29 = r12
            r12 = r10[r8]
            r31 = r9[r8]
            r9 = -1
            int r16 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x0473
            long r9 = r4.f26081c
            r16 = r7
            r24 = r8
            long r7 = r4.f26082d
            r18 = r31
            r20 = r9
            r22 = r7
            long r7 = com.google.android.gms.internal.ads.zzbar.m42994j(r18, r20, r22)
            r9 = 1
            int r10 = com.google.android.gms.internal.ads.zzbar.m42986b(r14, r12, r9, r9)
            long r7 = r7 + r12
            r9 = 0
            int r7 = com.google.android.gms.internal.ads.zzbar.m42986b(r14, r7, r6, r9)
            if (r1 == 0) goto L_0x042a
            int r8 = r7 - r10
            java.lang.System.arraycopy(r5, r10, r2, r11, r8)
            r9 = r43
            java.lang.System.arraycopy(r9, r10, r3, r11, r8)
            r27 = r6
            r6 = r16
            java.lang.System.arraycopy(r15, r10, r6, r11, r8)
            goto L_0x0430
        L_0x042a:
            r9 = r43
            r27 = r6
            r6 = r16
        L_0x0430:
            r8 = r28
        L_0x0432:
            if (r10 >= r7) goto L_0x046c
            r20 = 1000000(0xf4240, double:4.940656E-318)
            r33 = r5
            r16 = r6
            long r5 = r4.f26082d
            r18 = r29
            r22 = r5
            long r5 = com.google.android.gms.internal.ads.zzbar.m42994j(r18, r20, r22)
            r18 = r14[r10]
            long r34 = r18 - r12
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r43 = r12
            long r12 = r4.f26081c
            r38 = r12
            long r12 = com.google.android.gms.internal.ads.zzbar.m42994j(r34, r36, r38)
            long r5 = r5 + r12
            r0[r11] = r5
            if (r1 == 0) goto L_0x0461
            r5 = r3[r11]
            if (r5 <= r8) goto L_0x0461
            r8 = r9[r10]
        L_0x0461:
            int r11 = r11 + 1
            int r10 = r10 + 1
            r12 = r43
            r6 = r16
            r5 = r33
            goto L_0x0432
        L_0x046c:
            r33 = r5
            r16 = r6
            r28 = r8
            goto L_0x047d
        L_0x0473:
            r9 = r43
            r33 = r5
            r27 = r6
            r16 = r7
            r24 = r8
        L_0x047d:
            long r12 = r29 + r31
            int r8 = r24 + 1
            r43 = r9
            r7 = r16
            r6 = r27
            r5 = r33
            goto L_0x03e6
        L_0x048b:
            r15 = r7
            r5 = 0
            r17 = 0
        L_0x048f:
            int r1 = r15.length
            if (r5 >= r1) goto L_0x049c
            if (r17 != 0) goto L_0x049e
            r1 = r15[r5]
            r4 = 1
            r17 = r1 & 1
            int r5 = r5 + 1
            goto L_0x048f
        L_0x049c:
            if (r17 == 0) goto L_0x04ae
        L_0x049e:
            com.google.android.gms.internal.ads.zzawr r1 = new com.google.android.gms.internal.ads.zzawr
            r25 = r1
            r26 = r2
            r27 = r3
            r29 = r0
            r30 = r15
            r25.<init>(r26, r27, r28, r29, r30)
            return r1
        L_0x04ae:
            com.google.android.gms.internal.ads.zzasz r0 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r1 = "The edited sample sequence does not contain a sync sample."
            r0.<init>(r1)
            throw r0
        L_0x04b6:
            r33 = r11
            r9 = r12
            r16 = r13
            long r0 = r4.f26081c
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.google.android.gms.internal.ads.zzbar.m42998n(r14, r2, r0)
            com.google.android.gms.internal.ads.zzawr r0 = new com.google.android.gms.internal.ads.zzawr
            r10 = r0
            r11 = r33
            r12 = r9
            r13 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            return r0
        L_0x04cf:
            com.google.android.gms.internal.ads.zzasz r0 = new com.google.android.gms.internal.ads.zzasz
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawd.m42644b(com.google.android.gms.internal.ads.zzawo, com.google.android.gms.internal.ads.zzavu, com.google.android.gms.internal.ads.zzavd):com.google.android.gms.internal.ads.zzawr");
    }

    /* renamed from: c */
    public static zzaxh m42645c(zzavv zzavv, boolean z) {
        if (z) {
            return null;
        }
        zzbak zzbak = zzavv.f25855P0;
        zzbak.mo42336v(8);
        while (zzbak.mo42315a() >= 8) {
            int c = zzbak.mo42317c();
            int e = zzbak.mo42319e();
            if (zzbak.mo42319e() == zzavw.f25859B0) {
                zzbak.mo42336v(c);
                int i = c + e;
                zzbak.mo42337w(12);
                while (zzbak.mo42317c() < i) {
                    int c2 = zzbak.mo42317c();
                    int e2 = zzbak.mo42319e();
                    if (zzbak.mo42319e() == zzavw.f25861C0) {
                        zzbak.mo42336v(c2);
                        int i2 = c2 + e2;
                        zzbak.mo42337w(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzbak.mo42317c() < i2) {
                            zzaxg a = zzawj.m42659a(zzbak);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return null;
                        }
                        return new zzaxh((List) arrayList);
                    }
                    zzbak.mo42337w(e2 - 8);
                }
                return null;
            }
            zzbak.mo42337w(e - 8);
        }
        return null;
    }

    /* renamed from: d */
    private static int m42646d(zzbak zzbak) {
        int g = zzbak.mo42321g();
        int i = g & 127;
        while ((g & 128) == 128) {
            g = zzbak.mo42321g();
            i = (i << 7) | (g & 127);
        }
        return i;
    }

    /* renamed from: e */
    private static int m42647e(zzbak zzbak, int i, int i2, zzavz zzavz, int i3) {
        zzbak zzbak2 = zzbak;
        int c = zzbak.mo42317c();
        while (true) {
            boolean z = false;
            if (c - i >= i2) {
                return 0;
            }
            zzbak.mo42336v(c);
            int e = zzbak.mo42319e();
            zzbac.m42925d(e > 0, "childAtomSize should be positive");
            if (zzbak.mo42319e() == zzavw.f25893W) {
                int i4 = c + 8;
                Pair pair = null;
                Integer num = null;
                zzawp zzawp = null;
                boolean z2 = false;
                while (i4 - c < e) {
                    zzbak.mo42336v(i4);
                    int e2 = zzbak.mo42319e();
                    int e3 = zzbak.mo42319e();
                    if (e3 == zzavw.f25901c0) {
                        num = Integer.valueOf(zzbak.mo42319e());
                    } else if (e3 == zzavw.f25894X) {
                        zzbak.mo42337w(4);
                        z2 = zzbak.mo42319e() == f25986g;
                    } else if (e3 == zzavw.f25895Y) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= e2) {
                                zzawp = null;
                                break;
                            }
                            zzbak.mo42336v(i5);
                            int e4 = zzbak.mo42319e();
                            if (zzbak.mo42319e() == zzavw.f25896Z) {
                                zzbak.mo42337w(6);
                                boolean z3 = zzbak.mo42321g() == 1;
                                int g = zzbak.mo42321g();
                                byte[] bArr = new byte[16];
                                zzbak.mo42331q(bArr, 0, 16);
                                zzawp = new zzawp(z3, g, bArr);
                            } else {
                                i5 += e4;
                            }
                        }
                    }
                    i4 += e2;
                }
                if (z2) {
                    zzbac.m42925d(num != null, "frma atom is mandatory");
                    if (zzawp != null) {
                        z = true;
                    }
                    zzbac.m42925d(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzawp);
                }
                if (pair != null) {
                    zzavz.f25958a[i3] = (zzawp) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            zzavz zzavz2 = zzavz;
            c += e;
        }
    }

    /* renamed from: f */
    private static Pair m42648f(zzbak zzbak, int i) {
        zzbak.mo42336v(i + 12);
        zzbak.mo42337w(1);
        m42646d(zzbak);
        zzbak.mo42337w(2);
        int g = zzbak.mo42321g();
        if ((g & 128) != 0) {
            zzbak.mo42337w(2);
        }
        if ((g & 64) != 0) {
            zzbak.mo42337w(zzbak.mo42324j());
        }
        if ((g & 32) != 0) {
            zzbak.mo42337w(2);
        }
        zzbak.mo42337w(1);
        m42646d(zzbak);
        int g2 = zzbak.mo42321g();
        String str = null;
        if (g2 == 32) {
            str = "video/mp4v-es";
        } else if (g2 == 33) {
            str = "video/avc";
        } else if (g2 != 35) {
            if (g2 != 64) {
                if (g2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (g2 == 165) {
                    str = "audio/ac3";
                } else if (g2 != 166) {
                    switch (g2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (g2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzbak.mo42337w(12);
        zzbak.mo42337w(1);
        int d = m42646d(zzbak);
        byte[] bArr = new byte[d];
        zzbak.mo42331q(bArr, 0, d);
        return Pair.create(str, bArr);
    }
}
