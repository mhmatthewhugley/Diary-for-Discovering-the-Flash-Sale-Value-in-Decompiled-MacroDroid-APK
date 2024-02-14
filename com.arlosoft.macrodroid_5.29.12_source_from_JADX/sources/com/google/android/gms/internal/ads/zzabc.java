package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzabc implements zzzi {

    /* renamed from: a */
    private final zzef f23792a = new zzef(12);

    /* renamed from: b */
    private final zzabb f23793b = new zzabb((zzaba) null);

    /* renamed from: c */
    private int f23794c;

    /* renamed from: d */
    private zzzl f23795d = new zzzg();

    /* renamed from: e */
    private zzabd f23796e;

    /* renamed from: f */
    private long f23797f = -9223372036854775807L;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzabf[] f23798g = new zzabf[0];

    /* renamed from: h */
    private long f23799h;
    @Nullable

    /* renamed from: i */
    private zzabf f23800i;

    /* renamed from: j */
    private int f23801j = -1;

    /* renamed from: k */
    private long f23802k = -1;

    /* renamed from: l */
    private long f23803l = -1;

    /* renamed from: m */
    private int f23804m;

    /* renamed from: n */
    private boolean f23805n;

    @Nullable
    /* renamed from: c */
    private final zzabf m40970c(int i) {
        for (zzabf zzabf : this.f23798g) {
            if (zzabf.mo41239g(i)) {
                return zzabf;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo41227a(zzzj zzzj) throws IOException {
        ((zzyy) zzzj).mo48454j(this.f23792a.mo45232h(), 0, 12, false);
        this.f23792a.mo45230f(0);
        if (this.f23792a.mo45239o() != 1179011410) {
            return false;
        }
        this.f23792a.mo45231g(4);
        if (this.f23792a.mo45239o() == 541677121) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo41228d(zzzl zzzl) {
        this.f23794c = 0;
        this.f23795d = zzzl;
        this.f23799h = -1;
    }

    /* renamed from: g */
    public final void mo41229g(long j, long j2) {
        int i;
        this.f23799h = -1;
        this.f23800i = null;
        for (zzabf f : this.f23798g) {
            f.mo41238f(j);
        }
        if (j != 0) {
            i = 6;
        } else if (this.f23798g.length == 0) {
            this.f23794c = 0;
            return;
        } else {
            i = 3;
        }
        this.f23794c = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo41230h(com.google.android.gms.internal.ads.zzzj r23, com.google.android.gms.internal.ads.zzaai r24) throws java.io.IOException {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            long r2 = r0.f23799h
            r4 = -1
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x002e
            long r8 = r23.mo41252c()
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0028
            r10 = 262144(0x40000, double:1.295163E-318)
            long r10 = r10 + r8
            int r12 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            r10 = r1
            com.google.android.gms.internal.ads.zzyy r10 = (com.google.android.gms.internal.ads.zzyy) r10
            long r2 = r2 - r8
            int r3 = (int) r2
            r10.mo48459p(r3, r7)
            goto L_0x002e
        L_0x0028:
            r8 = r24
            r8.f23733a = r2
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            r0.f23799h = r4
            if (r2 == 0) goto L_0x0034
            return r6
        L_0x0034:
            int r2 = r0.f23794c
            r3 = 12
            r8 = 0
            if (r2 == 0) goto L_0x03ad
            r9 = 1819436136(0x6c726468, float:1.1721368E27)
            r10 = 1414744396(0x5453494c, float:3.62987127E12)
            r11 = 2
            if (r2 == r6) goto L_0x0350
            r12 = 3
            if (r2 == r11) goto L_0x022e
            r9 = 6
            r11 = 1769369453(0x69766f6d, float:1.8620122E25)
            r13 = 4
            r16 = 8
            r14 = 16
            if (r2 == r12) goto L_0x0199
            r4 = 5
            r5 = 8
            if (r2 == r13) goto L_0x0169
            if (r2 == r4) goto L_0x00e7
            long r12 = r23.mo41252c()
            long r14 = r0.f23803l
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0066
            r7 = -1
            goto L_0x00e6
        L_0x0066:
            com.google.android.gms.internal.ads.zzabf r2 = r0.f23800i
            if (r2 == 0) goto L_0x0075
            boolean r1 = r2.mo41240h(r1)
            if (r1 != 0) goto L_0x0072
            goto L_0x00e6
        L_0x0072:
            r0.f23800i = r8
            return r7
        L_0x0075:
            long r8 = r23.mo41252c()
            r12 = 1
            long r8 = r8 & r12
            int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x0086
            r2 = r1
            com.google.android.gms.internal.ads.zzyy r2 = (com.google.android.gms.internal.ads.zzyy) r2
            r2.mo48459p(r6, r7)
        L_0x0086:
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            byte[] r2 = r2.mo45232h()
            r4 = r1
            com.google.android.gms.internal.ads.zzyy r4 = (com.google.android.gms.internal.ads.zzyy) r4
            r4.mo48454j(r2, r7, r3, r7)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            r2.mo45230f(r7)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            int r2 = r2.mo45239o()
            if (r2 != r10) goto L_0x00b6
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            r2.mo45230f(r5)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            int r2 = r2.mo45239o()
            if (r2 != r11) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r3 = 8
        L_0x00af:
            r4.mo48459p(r3, r7)
            r23.mo48452h()
            goto L_0x00e6
        L_0x00b6:
            com.google.android.gms.internal.ads.zzef r3 = r0.f23792a
            int r3 = r3.mo45239o()
            r6 = 1263424842(0x4b4e554a, float:1.352225E7)
            if (r2 != r6) goto L_0x00cc
            long r1 = r23.mo41252c()
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.f23799h = r1
            goto L_0x00e6
        L_0x00cc:
            r4.mo48459p(r5, r7)
            r23.mo48452h()
            com.google.android.gms.internal.ads.zzabf r2 = r0.m40970c(r2)
            if (r2 != 0) goto L_0x00e1
            long r1 = r23.mo41252c()
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f23799h = r1
            goto L_0x00e6
        L_0x00e1:
            r2.mo41237e(r3)
            r0.f23800i = r2
        L_0x00e6:
            return r7
        L_0x00e7:
            com.google.android.gms.internal.ads.zzef r2 = new com.google.android.gms.internal.ads.zzef
            int r3 = r0.f23804m
            r2.<init>((int) r3)
            byte[] r3 = r2.mo45232h()
            int r4 = r0.f23804m
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48453i(r3, r7, r4, r7)
            int r1 = r2.mo45233i()
            if (r1 >= r14) goto L_0x0102
            r18 = 0
            goto L_0x011e
        L_0x0102:
            int r1 = r2.mo45235k()
            r2.mo45231g(r5)
            int r3 = r2.mo45239o()
            long r4 = r0.f23802k
            long r10 = (long) r3
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0117
            r18 = 0
            goto L_0x011b
        L_0x0117:
            long r4 = r4 + r16
            r18 = r4
        L_0x011b:
            r2.mo45230f(r1)
        L_0x011e:
            int r1 = r2.mo45233i()
            if (r1 < r14) goto L_0x0146
            int r1 = r2.mo45239o()
            int r3 = r2.mo45239o()
            int r4 = r2.mo45239o()
            long r4 = (long) r4
            long r4 = r4 + r18
            r2.mo45239o()
            com.google.android.gms.internal.ads.zzabf r1 = r0.m40970c(r1)
            if (r1 == 0) goto L_0x011e
            r3 = r3 & r14
            if (r3 != r14) goto L_0x0142
            r1.mo41234b(r4)
        L_0x0142:
            r1.mo41236d()
            goto L_0x011e
        L_0x0146:
            com.google.android.gms.internal.ads.zzabf[] r1 = r0.f23798g
            int r2 = r1.length
            r3 = 0
        L_0x014a:
            if (r3 >= r2) goto L_0x0154
            r4 = r1[r3]
            r4.mo41235c()
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0154:
            r0.f23805n = r6
            com.google.android.gms.internal.ads.zzzl r1 = r0.f23795d
            com.google.android.gms.internal.ads.zzaaz r2 = new com.google.android.gms.internal.ads.zzaaz
            long r3 = r0.f23797f
            r2.<init>(r0, r3)
            r1.mo41254h(r2)
            r0.f23794c = r9
            long r1 = r0.f23802k
            r0.f23799h = r1
            return r7
        L_0x0169:
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            byte[] r2 = r2.mo45232h()
            r3 = r1
            com.google.android.gms.internal.ads.zzyy r3 = (com.google.android.gms.internal.ads.zzyy) r3
            r3.mo48453i(r2, r7, r5, r7)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            r2.mo45230f(r7)
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            int r2 = r2.mo45239o()
            com.google.android.gms.internal.ads.zzef r3 = r0.f23792a
            int r3 = r3.mo45239o()
            r5 = 829973609(0x31786469, float:3.6145826E-9)
            if (r2 != r5) goto L_0x0190
            r0.f23794c = r4
            r0.f23804m = r3
            goto L_0x0198
        L_0x0190:
            long r1 = r23.mo41252c()
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f23799h = r1
        L_0x0198:
            return r7
        L_0x0199:
            long r13 = r0.f23802k
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x01ab
            long r4 = r23.mo41252c()
            int r8 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x01a8
            goto L_0x01ab
        L_0x01a8:
            r0.f23799h = r13
            return r7
        L_0x01ab:
            com.google.android.gms.internal.ads.zzef r4 = r0.f23792a
            byte[] r4 = r4.mo45232h()
            r5 = r1
            com.google.android.gms.internal.ads.zzyy r5 = (com.google.android.gms.internal.ads.zzyy) r5
            r5.mo48454j(r4, r7, r3, r7)
            r23.mo48452h()
            com.google.android.gms.internal.ads.zzef r4 = r0.f23792a
            r4.mo45230f(r7)
            com.google.android.gms.internal.ads.zzabb r4 = r0.f23793b
            com.google.android.gms.internal.ads.zzef r5 = r0.f23792a
            r4.mo41232a(r5)
            com.google.android.gms.internal.ads.zzef r4 = r0.f23792a
            int r4 = r4.mo45239o()
            com.google.android.gms.internal.ads.zzabb r5 = r0.f23793b
            int r8 = r5.f23789a
            r12 = 1179011410(0x46464952, float:12690.33)
            if (r8 != r12) goto L_0x01db
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48459p(r3, r7)
            return r7
        L_0x01db:
            if (r8 != r10) goto L_0x0221
            if (r4 == r11) goto L_0x01e0
            goto L_0x0221
        L_0x01e0:
            long r3 = r23.mo41252c()
            r0.f23802k = r3
            int r5 = r5.f23790b
            long r10 = (long) r5
            long r3 = r3 + r10
            long r3 = r3 + r16
            r0.f23803l = r3
            boolean r5 = r0.f23805n
            if (r5 != 0) goto L_0x0215
            com.google.android.gms.internal.ads.zzabd r5 = r0.f23796e
            java.util.Objects.requireNonNull(r5)
            int r5 = r5.f23807b
            r2 = 16
            r5 = r5 & r2
            if (r5 == r2) goto L_0x020f
            com.google.android.gms.internal.ads.zzzl r2 = r0.f23795d
            com.google.android.gms.internal.ads.zzaak r3 = new com.google.android.gms.internal.ads.zzaak
            long r4 = r0.f23797f
            r10 = 0
            r3.<init>(r4, r10)
            r2.mo41254h(r3)
            r0.f23805n = r6
            goto L_0x0215
        L_0x020f:
            r2 = 4
            r0.f23794c = r2
            r0.f23799h = r3
            return r7
        L_0x0215:
            long r1 = r23.mo41252c()
            r3 = 12
            long r1 = r1 + r3
            r0.f23799h = r1
            r0.f23794c = r9
            return r7
        L_0x0221:
            long r1 = r23.mo41252c()
            int r3 = r5.f23790b
            long r3 = (long) r3
            long r1 = r1 + r3
            long r1 = r1 + r16
            r0.f23799h = r1
            return r7
        L_0x022e:
            int r2 = r0.f23801j
            int r2 = r2 + -4
            com.google.android.gms.internal.ads.zzef r3 = new com.google.android.gms.internal.ads.zzef
            r3.<init>((int) r2)
            byte[] r4 = r3.mo45232h()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48453i(r4, r7, r2, r7)
            com.google.android.gms.internal.ads.zzabg r1 = com.google.android.gms.internal.ads.zzabg.m40988b(r9, r3)
            int r2 = r1.zza()
            if (r2 != r9) goto L_0x0335
            java.lang.Class<com.google.android.gms.internal.ads.zzabd> r2 = com.google.android.gms.internal.ads.zzabd.class
            com.google.android.gms.internal.ads.zzaay r2 = r1.mo41241a(r2)
            com.google.android.gms.internal.ads.zzabd r2 = (com.google.android.gms.internal.ads.zzabd) r2
            if (r2 == 0) goto L_0x032d
            r0.f23796e = r2
            int r3 = r2.f23808c
            long r3 = (long) r3
            int r2 = r2.f23806a
            long r9 = (long) r2
            long r3 = r3 * r9
            r0.f23797f = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.android.gms.internal.ads.zzfvn r1 = r1.f23826a
            int r3 = r1.size()
            r4 = 0
            r14 = 0
        L_0x026d:
            if (r4 >= r3) goto L_0x031a
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.ads.zzaay r5 = (com.google.android.gms.internal.ads.zzaay) r5
            int r9 = r5.zza()
            r10 = 1819440243(0x6c727473, float:1.17243986E27)
            if (r9 != r10) goto L_0x0313
            com.google.android.gms.internal.ads.zzabg r5 = (com.google.android.gms.internal.ads.zzabg) r5
            int r9 = r14 + 1
            java.lang.Class<com.google.android.gms.internal.ads.zzabe> r10 = com.google.android.gms.internal.ads.zzabe.class
            com.google.android.gms.internal.ads.zzaay r10 = r5.mo41241a(r10)
            com.google.android.gms.internal.ads.zzabe r10 = (com.google.android.gms.internal.ads.zzabe) r10
            java.lang.Class<com.google.android.gms.internal.ads.zzabh> r13 = com.google.android.gms.internal.ads.zzabh.class
            com.google.android.gms.internal.ads.zzaay r13 = r5.mo41241a(r13)
            com.google.android.gms.internal.ads.zzabh r13 = (com.google.android.gms.internal.ads.zzabh) r13
            java.lang.String r15 = "AviExtractor"
            if (r10 != 0) goto L_0x029f
            java.lang.String r5 = "Missing Stream Header"
            com.google.android.gms.internal.ads.zzdw.m48255e(r15, r5)
        L_0x029b:
            r23 = r9
            goto L_0x030c
        L_0x029f:
            if (r13 != 0) goto L_0x02a7
            java.lang.String r5 = "Missing Stream Format"
            com.google.android.gms.internal.ads.zzdw.m48255e(r15, r5)
            goto L_0x029b
        L_0x02a7:
            int r15 = r10.f23812d
            r23 = r9
            long r8 = (long) r15
            int r15 = r10.f23810b
            long r11 = (long) r15
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = r11 * r15
            int r11 = r10.f23811c
            long r11 = (long) r11
            r16 = r8
            r20 = r11
            long r8 = com.google.android.gms.internal.ads.zzen.m49165g0(r16, r18, r20)
            com.google.android.gms.internal.ads.zzaf r11 = r13.f23828a
            com.google.android.gms.internal.ads.zzad r12 = r11.mo41422b()
            r12.mo41329g(r14)
            int r13 = r10.f23813e
            if (r13 == 0) goto L_0x02cf
            r12.mo41336l(r13)
        L_0x02cf:
            java.lang.Class<com.google.android.gms.internal.ads.zzabi> r13 = com.google.android.gms.internal.ads.zzabi.class
            com.google.android.gms.internal.ads.zzaay r5 = r5.mo41241a(r13)
            com.google.android.gms.internal.ads.zzabi r5 = (com.google.android.gms.internal.ads.zzabi) r5
            if (r5 == 0) goto L_0x02de
            java.lang.String r5 = r5.f23829a
            r12.mo41334j(r5)
        L_0x02de:
            java.lang.String r5 = r11.f24213l
            int r5 = com.google.android.gms.internal.ads.zzbt.m44089b(r5)
            if (r5 == r6) goto L_0x02ed
            r11 = 2
            if (r5 != r11) goto L_0x02eb
            r15 = 2
            goto L_0x02ee
        L_0x02eb:
            r8 = 0
            goto L_0x030c
        L_0x02ed:
            r15 = r5
        L_0x02ee:
            com.google.android.gms.internal.ads.zzzl r5 = r0.f23795d
            com.google.android.gms.internal.ads.zzaap r5 = r5.mo41256k(r14, r15)
            com.google.android.gms.internal.ads.zzaf r11 = r12.mo41349y()
            r5.mo41214d(r11)
            com.google.android.gms.internal.ads.zzabf r11 = new com.google.android.gms.internal.ads.zzabf
            int r10 = r10.f23812d
            r13 = r11
            r16 = r8
            r18 = r10
            r19 = r5
            r13.<init>(r14, r15, r16, r18, r19)
            r0.f23797f = r8
            r8 = r11
        L_0x030c:
            if (r8 == 0) goto L_0x0311
            r2.add(r8)
        L_0x0311:
            r14 = r23
        L_0x0313:
            int r4 = r4 + 1
            r8 = 0
            r11 = 2
            r12 = 3
            goto L_0x026d
        L_0x031a:
            com.google.android.gms.internal.ads.zzabf[] r1 = new com.google.android.gms.internal.ads.zzabf[r7]
            java.lang.Object[] r1 = r2.toArray(r1)
            com.google.android.gms.internal.ads.zzabf[] r1 = (com.google.android.gms.internal.ads.zzabf[]) r1
            r0.f23798g = r1
            com.google.android.gms.internal.ads.zzzl r1 = r0.f23795d
            r1.mo41255j0()
            r1 = 3
            r0.f23794c = r1
            return r7
        L_0x032d:
            java.lang.String r1 = "AviHeader not found"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x0335:
            r2 = r8
            int r1 = r1.zza()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected header list type "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x0350:
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            byte[] r2 = r2.mo45232h()
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48453i(r2, r7, r3, r7)
            com.google.android.gms.internal.ads.zzef r1 = r0.f23792a
            r1.mo45230f(r7)
            com.google.android.gms.internal.ads.zzabb r1 = r0.f23793b
            com.google.android.gms.internal.ads.zzef r2 = r0.f23792a
            r1.mo41232a(r2)
            int r3 = r1.f23789a
            if (r3 != r10) goto L_0x0396
            int r2 = r2.mo45239o()
            r1.f23791c = r2
            com.google.android.gms.internal.ads.zzabb r1 = r0.f23793b
            int r2 = r1.f23791c
            if (r2 != r9) goto L_0x037f
            int r1 = r1.f23790b
            r0.f23801j = r1
            r1 = 2
            r0.f23794c = r1
            return r7
        L_0x037f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "hdrl expected, found: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x0396:
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "LIST expected, found: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        L_0x03ad:
            r2 = r8
            boolean r4 = r22.mo41227a(r23)
            if (r4 == 0) goto L_0x03bc
            com.google.android.gms.internal.ads.zzyy r1 = (com.google.android.gms.internal.ads.zzyy) r1
            r1.mo48459p(r3, r7)
            r0.f23794c = r6
            return r7
        L_0x03bc:
            java.lang.String r1 = "AVI Header List not found"
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.m44135a(r1, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabc.mo41230h(com.google.android.gms.internal.ads.zzzj, com.google.android.gms.internal.ads.zzaai):int");
    }
}
