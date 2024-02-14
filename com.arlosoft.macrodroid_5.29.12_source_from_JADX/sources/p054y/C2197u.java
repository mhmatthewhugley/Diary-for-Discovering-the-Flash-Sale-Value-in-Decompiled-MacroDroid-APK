package p054y;

/* renamed from: y.u */
/* compiled from: MaskParser */
class C2197u {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r1.equals("s") == false) goto L_0x0062;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p050v.C2122g m9023a(p055z.C2205c r11, com.airbnb.lottie.C1463d r12) throws java.io.IOException {
        /*
            r11.mo24400e()
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = 0
        L_0x0008:
            boolean r5 = r11.mo24404h()
            if (r5 == 0) goto L_0x00d4
            java.lang.String r5 = r11.mo24408o()
            r5.hashCode()
            int r6 = r5.hashCode()
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = -1
            switch(r6) {
                case 111: goto L_0x0043;
                case 3588: goto L_0x0038;
                case 104433: goto L_0x002d;
                case 3357091: goto L_0x0022;
                default: goto L_0x0020;
            }
        L_0x0020:
            r6 = -1
            goto L_0x004d
        L_0x0022:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x0020
        L_0x002b:
            r6 = 3
            goto L_0x004d
        L_0x002d:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0036
            goto L_0x0020
        L_0x0036:
            r6 = 2
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x0041
            goto L_0x0020
        L_0x0041:
            r6 = 1
            goto L_0x004d
        L_0x0043:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x004c
            goto L_0x0020
        L_0x004c:
            r6 = 0
        L_0x004d:
            switch(r6) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00c2;
                case 3: goto L_0x0054;
                default: goto L_0x0050;
            }
        L_0x0050:
            r11.mo24414x()
            goto L_0x0008
        L_0x0054:
            java.lang.String r1 = r11.mo24409p()
            r1.hashCode()
            int r6 = r1.hashCode()
            switch(r6) {
                case 97: goto L_0x0083;
                case 105: goto L_0x0078;
                case 110: goto L_0x006d;
                case 115: goto L_0x0064;
                default: goto L_0x0062;
            }
        L_0x0062:
            r7 = -1
            goto L_0x008d
        L_0x0064:
            java.lang.String r6 = "s"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x008d
            goto L_0x0062
        L_0x006d:
            java.lang.String r6 = "n"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0076
            goto L_0x0062
        L_0x0076:
            r7 = 2
            goto L_0x008d
        L_0x0078:
            java.lang.String r6 = "i"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0081
            goto L_0x0062
        L_0x0081:
            r7 = 1
            goto L_0x008d
        L_0x0083:
            java.lang.String r6 = "a"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x008c
            goto L_0x0062
        L_0x008c:
            r7 = 0
        L_0x008d:
            switch(r7) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00b5;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00ad;
                default: goto L_0x0090;
            }
        L_0x0090:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            p001a0.C0006d.m32c(r1)
            v.g$a r1 = p050v.C2122g.C2123a.MASK_MODE_ADD
            goto L_0x0008
        L_0x00ad:
            v.g$a r1 = p050v.C2122g.C2123a.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00b1:
            v.g$a r1 = p050v.C2122g.C2123a.MASK_MODE_NONE
            goto L_0x0008
        L_0x00b5:
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r12.mo17052a(r1)
            v.g$a r1 = p050v.C2122g.C2123a.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00be:
            v.g$a r1 = p050v.C2122g.C2123a.MASK_MODE_ADD
            goto L_0x0008
        L_0x00c2:
            boolean r4 = r11.mo24405i()
            goto L_0x0008
        L_0x00c8:
            u.h r2 = p054y.C2171d.m8971k(r11, r12)
            goto L_0x0008
        L_0x00ce:
            u.d r3 = p054y.C2171d.m8968h(r11, r12)
            goto L_0x0008
        L_0x00d4:
            r11.mo24402g()
            v.g r11 = new v.g
            r11.<init>(r1, r2, r3, r4)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p054y.C2197u.m9023a(z.c, com.airbnb.lottie.d):v.g");
    }
}
