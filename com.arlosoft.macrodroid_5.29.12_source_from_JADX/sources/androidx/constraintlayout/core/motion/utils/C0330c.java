package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: androidx.constraintlayout.core.motion.utils.c */
/* compiled from: TypedValues */
public final /* synthetic */ class C0330c {
    static {
        String str = TypedValues.Cycle.NAME;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m387a(java.lang.String r2) {
        /*
            r2.hashCode()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1310311125: goto L_0x00cc;
                case -1249320806: goto L_0x00c0;
                case -1249320805: goto L_0x00b4;
                case -1249320804: goto L_0x00a8;
                case -1225497657: goto L_0x009b;
                case -1225497656: goto L_0x008e;
                case -1225497655: goto L_0x0082;
                case -1001078227: goto L_0x0077;
                case -987906986: goto L_0x006a;
                case -987906985: goto L_0x005d;
                case -908189618: goto L_0x0050;
                case -908189617: goto L_0x0043;
                case 92909918: goto L_0x0036;
                case 579057826: goto L_0x0029;
                case 803192288: goto L_0x001c;
                case 1941332754: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r2 = -1
            goto L_0x00d7
        L_0x000e:
            java.lang.String r0 = "visibility"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0018
            goto L_0x000b
        L_0x0018:
            r2 = 15
            goto L_0x00d7
        L_0x001c:
            java.lang.String r0 = "pathRotate"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0025
            goto L_0x000b
        L_0x0025:
            r2 = 14
            goto L_0x00d7
        L_0x0029:
            java.lang.String r0 = "curveFit"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0032
            goto L_0x000b
        L_0x0032:
            r2 = 13
            goto L_0x00d7
        L_0x0036:
            java.lang.String r0 = "alpha"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x003f
            goto L_0x000b
        L_0x003f:
            r2 = 12
            goto L_0x00d7
        L_0x0043:
            java.lang.String r0 = "scaleY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x004c
            goto L_0x000b
        L_0x004c:
            r2 = 11
            goto L_0x00d7
        L_0x0050:
            java.lang.String r0 = "scaleX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0059
            goto L_0x000b
        L_0x0059:
            r2 = 10
            goto L_0x00d7
        L_0x005d:
            java.lang.String r0 = "pivotY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0066
            goto L_0x000b
        L_0x0066:
            r2 = 9
            goto L_0x00d7
        L_0x006a:
            java.lang.String r0 = "pivotX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0073
            goto L_0x000b
        L_0x0073:
            r2 = 8
            goto L_0x00d7
        L_0x0077:
            java.lang.String r0 = "progress"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0080
            goto L_0x000b
        L_0x0080:
            r2 = 7
            goto L_0x00d7
        L_0x0082:
            java.lang.String r0 = "translationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x008c
            goto L_0x000b
        L_0x008c:
            r2 = 6
            goto L_0x00d7
        L_0x008e:
            java.lang.String r0 = "translationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0099
            goto L_0x000b
        L_0x0099:
            r2 = 5
            goto L_0x00d7
        L_0x009b:
            java.lang.String r0 = "translationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00a6
            goto L_0x000b
        L_0x00a6:
            r2 = 4
            goto L_0x00d7
        L_0x00a8:
            java.lang.String r0 = "rotationZ"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00b2
            goto L_0x000b
        L_0x00b2:
            r2 = 3
            goto L_0x00d7
        L_0x00b4:
            java.lang.String r0 = "rotationY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00be
            goto L_0x000b
        L_0x00be:
            r2 = 2
            goto L_0x00d7
        L_0x00c0:
            java.lang.String r0 = "rotationX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00ca
            goto L_0x000b
        L_0x00ca:
            r2 = 1
            goto L_0x00d7
        L_0x00cc:
            java.lang.String r0 = "easing"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x00d6
            goto L_0x000b
        L_0x00d6:
            r2 = 0
        L_0x00d7:
            switch(r2) {
                case 0: goto L_0x0108;
                case 1: goto L_0x0105;
                case 2: goto L_0x0102;
                case 3: goto L_0x00ff;
                case 4: goto L_0x00fc;
                case 5: goto L_0x00f9;
                case 6: goto L_0x00f6;
                case 7: goto L_0x00f3;
                case 8: goto L_0x00f0;
                case 9: goto L_0x00ed;
                case 10: goto L_0x00ea;
                case 11: goto L_0x00e7;
                case 12: goto L_0x00e4;
                case 13: goto L_0x00e1;
                case 14: goto L_0x00de;
                case 15: goto L_0x00db;
                default: goto L_0x00da;
            }
        L_0x00da:
            return r1
        L_0x00db:
            r2 = 402(0x192, float:5.63E-43)
            return r2
        L_0x00de:
            r2 = 416(0x1a0, float:5.83E-43)
            return r2
        L_0x00e1:
            r2 = 401(0x191, float:5.62E-43)
            return r2
        L_0x00e4:
            r2 = 403(0x193, float:5.65E-43)
            return r2
        L_0x00e7:
            r2 = 312(0x138, float:4.37E-43)
            return r2
        L_0x00ea:
            r2 = 311(0x137, float:4.36E-43)
            return r2
        L_0x00ed:
            r2 = 314(0x13a, float:4.4E-43)
            return r2
        L_0x00f0:
            r2 = 313(0x139, float:4.39E-43)
            return r2
        L_0x00f3:
            r2 = 315(0x13b, float:4.41E-43)
            return r2
        L_0x00f6:
            r2 = 306(0x132, float:4.29E-43)
            return r2
        L_0x00f9:
            r2 = 305(0x131, float:4.27E-43)
            return r2
        L_0x00fc:
            r2 = 304(0x130, float:4.26E-43)
            return r2
        L_0x00ff:
            r2 = 310(0x136, float:4.34E-43)
            return r2
        L_0x0102:
            r2 = 309(0x135, float:4.33E-43)
            return r2
        L_0x0105:
            r2 = 308(0x134, float:4.32E-43)
            return r2
        L_0x0108:
            r2 = 420(0x1a4, float:5.89E-43)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C0330c.m387a(java.lang.String):int");
    }

    /* renamed from: b */
    public static int m388b(int i) {
        if (i == 100) {
            return 2;
        }
        if (i == 101) {
            return 8;
        }
        if (i == 416) {
            return 4;
        }
        if (i == 420 || i == 421) {
            return 8;
        }
        switch (i) {
            case 304:
            case 305:
            case 306:
            case 307:
            case 308:
            case 309:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 315:
                return 4;
            default:
                switch (i) {
                    case 401:
                    case 402:
                        return 2;
                    case 403:
                        return 4;
                    default:
                        switch (i) {
                            case 423:
                            case 424:
                            case TypedValues.Cycle.TYPE_WAVE_PHASE:
                                return 4;
                            default:
                                return -1;
                        }
                }
        }
    }
}
