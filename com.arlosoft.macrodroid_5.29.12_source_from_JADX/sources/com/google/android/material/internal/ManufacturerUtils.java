package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ManufacturerUtils {
    private ManufacturerUtils() {
    }

    /* renamed from: a */
    public static boolean m68719a() {
        return m68720b() || m68722d();
    }

    /* renamed from: b */
    public static boolean m68720b() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("lge");
    }

    /* renamed from: c */
    public static boolean m68721c() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }

    /* renamed from: d */
    public static boolean m68722d() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("samsung");
    }
}
