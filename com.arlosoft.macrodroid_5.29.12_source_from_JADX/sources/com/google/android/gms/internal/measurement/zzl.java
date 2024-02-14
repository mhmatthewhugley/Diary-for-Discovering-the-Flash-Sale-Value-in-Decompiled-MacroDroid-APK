package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzl extends zzam {

    /* renamed from: c */
    private final zzab f41658c;

    public zzl(zzab zzab) {
        this.f41658c = zzab;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.zzap mo50702c(java.lang.String r17, com.google.android.gms.internal.measurement.zzg r18, java.util.List r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.hashCode()
            r6 = 4
            r7 = 3
            java.lang.String r8 = "setEventName"
            java.lang.String r9 = "setParamValue"
            java.lang.String r10 = "getParams"
            java.lang.String r11 = "getParamValue"
            java.lang.String r12 = "getTimestamp"
            java.lang.String r13 = "getEventName"
            r14 = 2
            r15 = 1
            r5 = 0
            switch(r4) {
                case 21624207: goto L_0x0049;
                case 45521504: goto L_0x0041;
                case 146575578: goto L_0x0039;
                case 700587132: goto L_0x0031;
                case 920706790: goto L_0x0029;
                case 1570616835: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0051
        L_0x0021:
            boolean r4 = r1.equals(r8)
            if (r4 == 0) goto L_0x0051
            r4 = 4
            goto L_0x0052
        L_0x0029:
            boolean r4 = r1.equals(r9)
            if (r4 == 0) goto L_0x0051
            r4 = 5
            goto L_0x0052
        L_0x0031:
            boolean r4 = r1.equals(r10)
            if (r4 == 0) goto L_0x0051
            r4 = 2
            goto L_0x0052
        L_0x0039:
            boolean r4 = r1.equals(r11)
            if (r4 == 0) goto L_0x0051
            r4 = 1
            goto L_0x0052
        L_0x0041:
            boolean r4 = r1.equals(r12)
            if (r4 == 0) goto L_0x0051
            r4 = 3
            goto L_0x0052
        L_0x0049:
            boolean r4 = r1.equals(r13)
            if (r4 == 0) goto L_0x0051
            r4 = 0
            goto L_0x0052
        L_0x0051:
            r4 = -1
        L_0x0052:
            if (r4 == 0) goto L_0x0134
            if (r4 == r15) goto L_0x0114
            if (r4 == r14) goto L_0x00e1
            if (r4 == r7) goto L_0x00c9
            if (r4 == r6) goto L_0x008d
            r6 = 5
            if (r4 == r6) goto L_0x0064
            com.google.android.gms.internal.measurement.zzap r1 = super.mo50702c(r17, r18, r19)
            return r1
        L_0x0064:
            com.google.android.gms.internal.measurement.zzh.m60250h(r9, r14, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.mo51055b(r1)
            java.lang.String r1 = r1.mo50707g()
            java.lang.Object r3 = r3.get(r15)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            com.google.android.gms.internal.measurement.zzap r2 = r2.mo51055b(r3)
            com.google.android.gms.internal.measurement.zzab r3 = r0.f41658c
            com.google.android.gms.internal.measurement.zzaa r3 = r3.mo50691b()
            java.lang.Object r4 = com.google.android.gms.internal.measurement.zzh.m60248f(r2)
            r3.mo50687g(r1, r4)
            return r2
        L_0x008d:
            com.google.android.gms.internal.measurement.zzh.m60250h(r8, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.mo51055b(r1)
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.f41197i
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.zzap r2 = com.google.android.gms.internal.measurement.zzap.f41198j
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.zzab r2 = r0.f41658c
            com.google.android.gms.internal.measurement.zzaa r2 = r2.mo50691b()
            java.lang.String r3 = r1.mo50707g()
            r2.mo50686f(r3)
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.mo50707g()
            r2.<init>(r1)
            return r2
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Illegal event name"
            r1.<init>(r2)
            throw r1
        L_0x00c9:
            com.google.android.gms.internal.measurement.zzh.m60250h(r12, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.f41658c
            com.google.android.gms.internal.measurement.zzaa r1 = r1.mo50691b()
            com.google.android.gms.internal.measurement.zzah r2 = new com.google.android.gms.internal.measurement.zzah
            long r3 = r1.mo50679a()
            double r3 = (double) r3
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r2.<init>(r1)
            return r2
        L_0x00e1:
            com.google.android.gms.internal.measurement.zzh.m60250h(r10, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.f41658c
            com.google.android.gms.internal.measurement.zzaa r1 = r1.mo50691b()
            java.util.Map r1 = r1.mo50684e()
            com.google.android.gms.internal.measurement.zzam r2 = new com.google.android.gms.internal.measurement.zzam
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x00fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0113
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r1.get(r4)
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzi.m60292b(r5)
            r2.mo50710i(r4, r5)
            goto L_0x00fb
        L_0x0113:
            return r2
        L_0x0114:
            com.google.android.gms.internal.measurement.zzh.m60250h(r11, r15, r3)
            java.lang.Object r1 = r3.get(r5)
            com.google.android.gms.internal.measurement.zzap r1 = (com.google.android.gms.internal.measurement.zzap) r1
            com.google.android.gms.internal.measurement.zzap r1 = r2.mo51055b(r1)
            java.lang.String r1 = r1.mo50707g()
            com.google.android.gms.internal.measurement.zzab r2 = r0.f41658c
            com.google.android.gms.internal.measurement.zzaa r2 = r2.mo50691b()
            java.lang.Object r1 = r2.mo50681c(r1)
            com.google.android.gms.internal.measurement.zzap r1 = com.google.android.gms.internal.measurement.zzi.m60292b(r1)
            return r1
        L_0x0134:
            com.google.android.gms.internal.measurement.zzh.m60250h(r13, r5, r3)
            com.google.android.gms.internal.measurement.zzab r1 = r0.f41658c
            com.google.android.gms.internal.measurement.zzaa r1 = r1.mo50691b()
            com.google.android.gms.internal.measurement.zzat r2 = new com.google.android.gms.internal.measurement.zzat
            java.lang.String r1 = r1.mo50683d()
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzl.mo50702c(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }
}
