package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.view.OrientationEventListener;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.utils.z0 */
/* compiled from: PortraitOrientationListener.kt */
public final class C6462z0 extends OrientationEventListener {

    /* renamed from: a */
    private final C6463a f15088a;

    /* renamed from: b */
    private int f15089b = -1;

    /* renamed from: com.arlosoft.macrodroid.utils.z0$a */
    /* compiled from: PortraitOrientationListener.kt */
    public interface C6463a {
        /* renamed from: a */
        void mo27017a(boolean z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6462z0(Context context, int i, C6463a aVar) {
        super(context, i);
        C13706o.m87929f(aVar, "orientationChangedListener");
        this.f15088a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto L_0x0004
            return
        L_0x0004:
            r1 = 330(0x14a, float:4.62E-43)
            r2 = 1
            r3 = 0
            if (r1 > r5) goto L_0x0010
            r1 = 361(0x169, float:5.06E-43)
            if (r5 >= r1) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            if (r1 != 0) goto L_0x0030
            if (r5 < 0) goto L_0x001b
            r1 = 31
            if (r5 >= r1) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r1 == 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            r1 = 150(0x96, float:2.1E-43)
            if (r1 > r5) goto L_0x0029
            r1 = 211(0xd3, float:2.96E-43)
            if (r5 >= r1) goto L_0x0029
            r5 = 1
            goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x002e
            r5 = 1
            goto L_0x0031
        L_0x002e:
            r5 = -1
            goto L_0x0031
        L_0x0030:
            r5 = 0
        L_0x0031:
            if (r5 == r0) goto L_0x0042
            int r0 = r4.f15089b
            if (r0 == r5) goto L_0x0042
            r4.f15089b = r5
            com.arlosoft.macrodroid.utils.z0$a r0 = r4.f15088a
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            r0.mo27017a(r2)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.utils.C6462z0.onOrientationChanged(int):void");
    }
}
