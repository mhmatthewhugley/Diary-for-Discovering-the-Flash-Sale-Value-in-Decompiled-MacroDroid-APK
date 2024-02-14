package com.arlosoft.macrodroid.utils;

import android.os.Build;

/* renamed from: com.arlosoft.macrodroid.utils.b1 */
/* compiled from: PendingIntentHelper.kt */
public final class C6368b1 {

    /* renamed from: a */
    public static final C6368b1 f14958a = new C6368b1();

    /* renamed from: b */
    public static final int f14959b;

    /* renamed from: c */
    public static final int f14960c;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        f14959b = i >= 23 ? 67108864 : 0;
        if (i >= 31) {
            i2 = 33554432;
        }
        f14960c = i2;
    }

    private C6368b1() {
    }
}
