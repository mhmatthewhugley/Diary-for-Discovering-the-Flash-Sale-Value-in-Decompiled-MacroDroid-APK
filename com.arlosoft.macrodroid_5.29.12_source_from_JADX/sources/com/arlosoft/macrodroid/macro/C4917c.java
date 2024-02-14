package com.arlosoft.macrodroid.macro;

import android.content.Context;
import com.arlosoft.macrodroid.C2300a;

/* renamed from: com.arlosoft.macrodroid.macro.c */
/* compiled from: DamnYouPirates */
public class C4917c {

    /* renamed from: a */
    private static boolean f12363a = false;

    /* renamed from: b */
    private static boolean f12364b = false;

    /* renamed from: a */
    public static boolean m18992a(Context context) {
        if (f12363a) {
            return true;
        }
        if (f12364b) {
            return false;
        }
        f12364b = true;
        if (!C2300a.m9540a(context)) {
            return false;
        }
        f12363a = true;
        return true;
    }
}
