package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: androidx.constraintlayout.core.motion.utils.g */
/* compiled from: TypedValues */
public final /* synthetic */ class C0334g {
    static {
        String str = TypedValues.Transition.NAME;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m394a(java.lang.String r2) {
        /*
            r2.hashCode()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1996906958: goto L_0x005c;
                case -1992012396: goto L_0x0051;
                case -1357874275: goto L_0x0046;
                case -1298065308: goto L_0x003b;
                case 3707: goto L_0x002f;
                case 3151786: goto L_0x0024;
                case 1310733335: goto L_0x0019;
                case 1839260940: goto L_0x000e;
                default: goto L_0x000b;
            }
        L_0x000b:
            r2 = -1
            goto L_0x0067
        L_0x000e:
            java.lang.String r0 = "staggered"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0017
            goto L_0x000b
        L_0x0017:
            r2 = 7
            goto L_0x0067
        L_0x0019:
            java.lang.String r0 = "pathMotionArc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0022
            goto L_0x000b
        L_0x0022:
            r2 = 6
            goto L_0x0067
        L_0x0024:
            java.lang.String r0 = "from"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x002d
            goto L_0x000b
        L_0x002d:
            r2 = 5
            goto L_0x0067
        L_0x002f:
            java.lang.String r0 = "to"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0039
            goto L_0x000b
        L_0x0039:
            r2 = 4
            goto L_0x0067
        L_0x003b:
            java.lang.String r0 = "autoTransition"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0044
            goto L_0x000b
        L_0x0044:
            r2 = 3
            goto L_0x0067
        L_0x0046:
            java.lang.String r0 = "motionInterpolator"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x004f
            goto L_0x000b
        L_0x004f:
            r2 = 2
            goto L_0x0067
        L_0x0051:
            java.lang.String r0 = "duration"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x005a
            goto L_0x000b
        L_0x005a:
            r2 = 1
            goto L_0x0067
        L_0x005c:
            java.lang.String r0 = "transitionFlags"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0066
            goto L_0x000b
        L_0x0066:
            r2 = 0
        L_0x0067:
            switch(r2) {
                case 0: goto L_0x0080;
                case 1: goto L_0x007d;
                case 2: goto L_0x007a;
                case 3: goto L_0x0077;
                case 4: goto L_0x0074;
                case 5: goto L_0x0071;
                case 6: goto L_0x006e;
                case 7: goto L_0x006b;
                default: goto L_0x006a;
            }
        L_0x006a:
            return r1
        L_0x006b:
            r2 = 706(0x2c2, float:9.9E-43)
            return r2
        L_0x006e:
            r2 = 509(0x1fd, float:7.13E-43)
            return r2
        L_0x0071:
            r2 = 701(0x2bd, float:9.82E-43)
            return r2
        L_0x0074:
            r2 = 702(0x2be, float:9.84E-43)
            return r2
        L_0x0077:
            r2 = 704(0x2c0, float:9.87E-43)
            return r2
        L_0x007a:
            r2 = 705(0x2c1, float:9.88E-43)
            return r2
        L_0x007d:
            r2 = 700(0x2bc, float:9.81E-43)
            return r2
        L_0x0080:
            r2 = 707(0x2c3, float:9.91E-43)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.C0334g.m394a(java.lang.String):int");
    }

    /* renamed from: b */
    public static int m395b(int i) {
        if (i == 509) {
            return 2;
        }
        switch (i) {
            case TypedValues.Transition.TYPE_DURATION:
                return 2;
            case TypedValues.Transition.TYPE_FROM:
            case TypedValues.Transition.TYPE_TO:
                return 8;
            default:
                switch (i) {
                    case TypedValues.Transition.TYPE_INTERPOLATOR:
                    case TypedValues.Transition.TYPE_TRANSITION_FLAGS:
                        return 8;
                    case TypedValues.Transition.TYPE_STAGGERED:
                        return 4;
                    default:
                        return -1;
                }
        }
    }
}
