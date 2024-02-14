package p054y;

import com.android.p023dx.rop.code.RegisterSpec;
import p055z.C2205c;

/* renamed from: y.h0 */
/* compiled from: ShapeStrokeParser */
class C2180h0 {

    /* renamed from: a */
    private static C2205c.C2206a f6790a = C2205c.C2206a.m9050a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C2205c.C2206a f6791b = C2205c.C2206a.m9050a("n", RegisterSpec.PREFIX);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p050v.C2134p m8983a(p055z.C2205c r18, com.airbnb.lottie.C1463d r19) throws java.io.IOException {
        /*
            r0 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1 = 0
            r4 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0012:
            boolean r13 = r18.mo24404h()
            if (r13 == 0) goto L_0x00fc
            z.c$a r13 = f6790a
            int r13 = r0.mo24412v(r13)
            r14 = 1
            switch(r13) {
                case 0: goto L_0x00f4;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00e4;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00cd;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00ad;
                case 8: goto L_0x0028;
                default: goto L_0x0022;
            }
        L_0x0022:
            r2 = r19
            r18.mo24414x()
            goto L_0x0012
        L_0x0028:
            r18.mo24399c()
        L_0x002b:
            boolean r13 = r18.mo24404h()
            if (r13 == 0) goto L_0x0099
            r18.mo24400e()
            r13 = 0
            r15 = 0
        L_0x0036:
            boolean r16 = r18.mo24404h()
            if (r16 == 0) goto L_0x0057
            z.c$a r2 = f6791b
            int r2 = r0.mo24412v(r2)
            if (r2 == 0) goto L_0x0052
            if (r2 == r14) goto L_0x004d
            r18.mo24413w()
            r18.mo24414x()
            goto L_0x0036
        L_0x004d:
            u.b r15 = p054y.C2171d.m8965e(r18, r19)
            goto L_0x0036
        L_0x0052:
            java.lang.String r13 = r18.mo24409p()
            goto L_0x0036
        L_0x0057:
            r18.mo24402g()
            r13.hashCode()
            int r17 = r13.hashCode()
            switch(r17) {
                case 100: goto L_0x007c;
                case 103: goto L_0x0071;
                case 111: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            r2 = -1
            goto L_0x0086
        L_0x0066:
            java.lang.String r2 = "o"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x006f
            goto L_0x0064
        L_0x006f:
            r2 = 2
            goto L_0x0086
        L_0x0071:
            java.lang.String r2 = "g"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x007a
            goto L_0x0064
        L_0x007a:
            r2 = 1
            goto L_0x0086
        L_0x007c:
            java.lang.String r2 = "d"
            boolean r2 = r13.equals(r2)
            if (r2 != 0) goto L_0x0085
            goto L_0x0064
        L_0x0085:
            r2 = 0
        L_0x0086:
            switch(r2) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0090;
                case 2: goto L_0x008c;
                default: goto L_0x0089;
            }
        L_0x0089:
            r2 = r19
            goto L_0x002b
        L_0x008c:
            r2 = r19
            r5 = r15
            goto L_0x002b
        L_0x0090:
            r2 = r19
            r2.mo17071t(r14)
            r3.add(r15)
            goto L_0x002b
        L_0x0099:
            r2 = r19
            r18.mo24401f()
            int r13 = r3.size()
            if (r13 != r14) goto L_0x0012
            java.lang.Object r13 = r3.get(r1)
            r3.add(r13)
            goto L_0x0012
        L_0x00ad:
            r2 = r19
            boolean r11 = r18.mo24405i()
            goto L_0x0012
        L_0x00b5:
            r2 = r19
            double r13 = r18.mo24406j()
            float r10 = (float) r13
            goto L_0x0012
        L_0x00be:
            r2 = r19
            v.p$c[] r9 = p050v.C2134p.C2137c.values()
            int r13 = r18.mo24407m()
            int r13 = r13 - r14
            r9 = r9[r13]
            goto L_0x0012
        L_0x00cd:
            r2 = r19
            v.p$b[] r8 = p050v.C2134p.C2136b.values()
            int r13 = r18.mo24407m()
            int r13 = r13 - r14
            r8 = r8[r13]
            goto L_0x0012
        L_0x00dc:
            r2 = r19
            u.d r12 = p054y.C2171d.m8968h(r18, r19)
            goto L_0x0012
        L_0x00e4:
            r2 = r19
            u.b r7 = p054y.C2171d.m8965e(r18, r19)
            goto L_0x0012
        L_0x00ec:
            r2 = r19
            u.a r6 = p054y.C2171d.m8963c(r18, r19)
            goto L_0x0012
        L_0x00f4:
            r2 = r19
            java.lang.String r4 = r18.mo24409p()
            goto L_0x0012
        L_0x00fc:
            if (r12 != 0) goto L_0x0113
            u.d r0 = new u.d
            b0.a r1 = new b0.a
            r2 = 100
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>(r2)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.<init>(r1)
            r12 = r0
        L_0x0113:
            v.p r13 = new v.p
            r0 = r13
            r1 = r4
            r2 = r5
            r4 = r6
            r5 = r12
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p054y.C2180h0.m8983a(z.c, com.airbnb.lottie.d):v.p");
    }
}
