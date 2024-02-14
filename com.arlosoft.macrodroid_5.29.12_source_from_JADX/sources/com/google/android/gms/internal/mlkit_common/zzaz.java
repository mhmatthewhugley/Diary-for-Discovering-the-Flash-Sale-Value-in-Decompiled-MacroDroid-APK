package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.5.0 */
final class zzaz extends zzar {

    /* renamed from: p */
    static final zzar f41962p = new zzaz((Object) null, new Object[0], 0);

    /* renamed from: f */
    private final transient Object f41963f;

    /* renamed from: g */
    final transient Object[] f41964g;

    /* renamed from: o */
    private final transient int f41965o;

    private zzaz(Object obj, Object[] objArr, int i) {
        this.f41963f = obj;
        this.f41964g = objArr;
        this.f41965o = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.mlkit_common.zzaz m61192g(int r16, java.lang.Object[] r17, com.google.android.gms.internal.mlkit_common.zzaq r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto L_0x000d
            com.google.android.gms.internal.mlkit_common.zzar r0 = f41962p
            com.google.android.gms.internal.mlkit_common.zzaz r0 = (com.google.android.gms.internal.mlkit_common.zzaz) r0
            return r0
        L_0x000d:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L_0x0025
            r0 = r1[r4]
            r0.getClass()
            r2 = r1[r5]
            r2.getClass()
            com.google.android.gms.internal.mlkit_common.zzaf.m61142a(r0, r2)
            com.google.android.gms.internal.mlkit_common.zzaz r0 = new com.google.android.gms.internal.mlkit_common.zzaz
            r0.<init>(r3, r1, r5)
            return r0
        L_0x0025:
            int r6 = r1.length
            int r6 = r6 >> r5
            java.lang.String r7 = "index"
            com.google.android.gms.internal.mlkit_common.zzac.m61134b(r0, r6, r7)
            r6 = 2
            int r7 = java.lang.Math.max(r0, r6)
            r8 = 751619276(0x2ccccccc, float:5.8207657E-12)
            r9 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r8) goto L_0x004f
            int r8 = r7 + -1
            int r8 = java.lang.Integer.highestOneBit(r8)
            int r8 = r8 + r8
            r9 = r8
        L_0x0040:
            double r10 = (double) r9
            r12 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r10 = r10 * r12
            double r12 = (double) r7
            int r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0051
            int r9 = r9 + r9
            goto L_0x0040
        L_0x004f:
            if (r7 >= r9) goto L_0x01e1
        L_0x0051:
            if (r0 != r5) goto L_0x0064
            r7 = r1[r4]
            r7.getClass()
            r8 = r1[r5]
            r8.getClass()
            com.google.android.gms.internal.mlkit_common.zzaf.m61142a(r7, r8)
        L_0x0060:
            r5 = 2
        L_0x0061:
            r7 = 1
            goto L_0x01b4
        L_0x0064:
            int r7 = r9 + -1
            r8 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r9 > r8) goto L_0x00da
            byte[] r8 = new byte[r9]
            java.util.Arrays.fill(r8, r11)
            r9 = 0
            r11 = 0
        L_0x0073:
            if (r9 >= r0) goto L_0x00c6
            int r12 = r9 + r9
            int r13 = r11 + r11
            r14 = r1[r12]
            r14.getClass()
            r12 = r12 ^ r5
            r12 = r1[r12]
            r12.getClass()
            com.google.android.gms.internal.mlkit_common.zzaf.m61142a(r14, r12)
            int r15 = r14.hashCode()
            int r15 = com.google.android.gms.internal.mlkit_common.zzah.m61144a(r15)
        L_0x008f:
            r15 = r15 & r7
            byte r6 = r8[r15]
            r5 = 255(0xff, float:3.57E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x00a5
            byte r5 = (byte) r13
            r8[r15] = r5
            if (r11 >= r9) goto L_0x00a2
            r1[r13] = r14
            r5 = r13 ^ 1
            r1[r5] = r12
        L_0x00a2:
            int r11 = r11 + 1
            goto L_0x00bc
        L_0x00a5:
            r5 = r1[r6]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x00c1
            r3 = r6 ^ 1
            com.google.android.gms.internal.mlkit_common.zzap r5 = new com.google.android.gms.internal.mlkit_common.zzap
            r6 = r1[r3]
            r6.getClass()
            r5.<init>(r14, r12, r6)
            r1[r3] = r12
            r3 = r5
        L_0x00bc:
            int r9 = r9 + 1
            r5 = 1
            r6 = 2
            goto L_0x0073
        L_0x00c1:
            int r15 = r15 + 1
            r5 = 1
            r6 = 2
            goto L_0x008f
        L_0x00c6:
            if (r11 != r0) goto L_0x00ca
            r3 = r8
            goto L_0x0060
        L_0x00ca:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r4] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r3
        L_0x00d8:
            r3 = r5
            goto L_0x0060
        L_0x00da:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r9 > r5) goto L_0x014b
            short[] r5 = new short[r9]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r8 = 0
        L_0x00e6:
            if (r6 >= r0) goto L_0x0137
            int r9 = r6 + r6
            int r11 = r8 + r8
            r12 = r1[r9]
            r12.getClass()
            r13 = 1
            r9 = r9 ^ r13
            r9 = r1[r9]
            r9.getClass()
            com.google.android.gms.internal.mlkit_common.zzaf.m61142a(r12, r9)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.mlkit_common.zzah.m61144a(r13)
        L_0x0103:
            r13 = r13 & r7
            short r14 = r5[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x011a
            short r14 = (short) r11
            r5[r13] = r14
            if (r8 >= r6) goto L_0x0117
            r1[r11] = r12
            r11 = r11 ^ 1
            r1[r11] = r9
        L_0x0117:
            int r8 = r8 + 1
            goto L_0x0131
        L_0x011a:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0134
            r3 = r14 ^ 1
            com.google.android.gms.internal.mlkit_common.zzap r11 = new com.google.android.gms.internal.mlkit_common.zzap
            r13 = r1[r3]
            r13.getClass()
            r11.<init>(r12, r9, r13)
            r1[r3] = r9
            r3 = r11
        L_0x0131:
            int r6 = r6 + 1
            goto L_0x00e6
        L_0x0134:
            int r13 = r13 + 1
            goto L_0x0103
        L_0x0137:
            if (r8 != r0) goto L_0x013a
            goto L_0x01a3
        L_0x013a:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r8 = 1
            r6[r8] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
            goto L_0x0061
        L_0x014b:
            r8 = 1
            int[] r5 = new int[r9]
            java.util.Arrays.fill(r5, r11)
            r6 = 0
            r9 = 0
        L_0x0153:
            if (r6 >= r0) goto L_0x01a1
            int r12 = r6 + r6
            int r13 = r9 + r9
            r14 = r1[r12]
            r14.getClass()
            r12 = r12 ^ r8
            r8 = r1[r12]
            r8.getClass()
            com.google.android.gms.internal.mlkit_common.zzaf.m61142a(r14, r8)
            int r12 = r14.hashCode()
            int r12 = com.google.android.gms.internal.mlkit_common.zzah.m61144a(r12)
        L_0x016f:
            r12 = r12 & r7
            r15 = r5[r12]
            if (r15 != r11) goto L_0x0181
            r5[r12] = r13
            if (r9 >= r6) goto L_0x017e
            r1[r13] = r14
            r12 = r13 ^ 1
            r1[r12] = r8
        L_0x017e:
            int r9 = r9 + 1
            goto L_0x0198
        L_0x0181:
            r11 = r1[r15]
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x019d
            r3 = r15 ^ 1
            com.google.android.gms.internal.mlkit_common.zzap r11 = new com.google.android.gms.internal.mlkit_common.zzap
            r12 = r1[r3]
            r12.getClass()
            r11.<init>(r14, r8, r12)
            r1[r3] = r8
            r3 = r11
        L_0x0198:
            int r6 = r6 + 1
            r8 = 1
            r11 = -1
            goto L_0x0153
        L_0x019d:
            int r12 = r12 + 1
            r11 = -1
            goto L_0x016f
        L_0x01a1:
            if (r9 != r0) goto L_0x01a5
        L_0x01a3:
            goto L_0x00d8
        L_0x01a5:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
        L_0x01b4:
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01db
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r5]
            com.google.android.gms.internal.mlkit_common.zzap r0 = (com.google.android.gms.internal.mlkit_common.zzap) r0
            if (r2 == 0) goto L_0x01d6
            r2.f41946c = r0
            r0 = r3[r4]
            r2 = r3[r7]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L_0x01db
        L_0x01d6:
            java.lang.IllegalArgumentException r0 = r0.mo51760a()
            throw r0
        L_0x01db:
            com.google.android.gms.internal.mlkit_common.zzaz r2 = new com.google.android.gms.internal.mlkit_common.zzaz
            r2.<init>(r3, r1, r0)
            return r2
        L_0x01e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "collection too large"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzaz.m61192g(int, java.lang.Object[], com.google.android.gms.internal.mlkit_common.zzaq):com.google.android.gms.internal.mlkit_common.zzaz");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final zzak mo51763a() {
        return new zzay(this.f41964g, 1, this.f41965o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final zzas mo51768d() {
        return new zzaw(this, this.f41964g, 0, this.f41965o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final zzas mo51769e() {
        return new zzax(this, new zzay(this.f41964g, 0, this.f41965o));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f41963f
            java.lang.Object[] r1 = r9.f41964g
            int r2 = r9.f41965o
            r3 = 0
            if (r10 != 0) goto L_0x000c
        L_0x0009:
            r10 = r3
            goto L_0x009c
        L_0x000c:
            r4 = 1
            if (r2 != r4) goto L_0x0022
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0009
            r10 = r1[r4]
            r10.getClass()
            goto L_0x009c
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0009
        L_0x0025:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L_0x0051
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.mlkit_common.zzah.m61144a(r0)
        L_0x0038:
            r0 = r0 & r6
            byte r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0041
            goto L_0x0009
        L_0x0041:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x004e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x004e:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0051:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L_0x007d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = com.google.android.gms.internal.mlkit_common.zzah.m61144a(r0)
        L_0x0063:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L_0x006d
            goto L_0x0009
        L_0x006d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.mlkit_common.zzah.m61144a(r6)
        L_0x0089:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L_0x0090
            goto L_0x0009
        L_0x0090:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L_0x009c:
            if (r10 != 0) goto L_0x009f
            return r3
        L_0x009f:
            return r10
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzaz.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f41965o;
    }
}
