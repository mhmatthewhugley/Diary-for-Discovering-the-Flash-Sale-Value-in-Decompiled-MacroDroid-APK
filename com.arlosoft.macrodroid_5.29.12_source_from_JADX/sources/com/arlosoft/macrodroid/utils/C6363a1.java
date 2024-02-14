package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.os.Build;
import com.arlosoft.macrodroid.settings.C5163j2;

/* renamed from: com.arlosoft.macrodroid.utils.a1 */
/* compiled from: OverlayUtils */
public class C6363a1 {
    /* renamed from: a */
    public static int m24607a() {
        return Build.VERSION.SDK_INT < 26 ? 2003 : 2038;
    }

    /* renamed from: b */
    public static int m24608b(Context context) {
        return C5163j2.m19979H1(context) ? m24609c() : m24607a();
    }

    /* renamed from: c */
    public static int m24609c() {
        return Build.VERSION.SDK_INT < 26 ? 2010 : 2038;
    }
}
