package com.arlosoft.macrodroid.utils;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: com.arlosoft.macrodroid.utils.f0 */
/* compiled from: GPS */
public class C6379f0 {

    /* renamed from: a */
    private static StringBuilder f14970a = new StringBuilder(20);

    /* renamed from: a */
    public static final synchronized String m24626a(double d) {
        String sb;
        synchronized (C6379f0.class) {
            double abs = Math.abs(d);
            int i = (int) abs;
            double d2 = (abs * 60.0d) - (((double) i) * 60.0d);
            int i2 = (int) d2;
            f14970a.setLength(0);
            f14970a.append(i);
            f14970a.append("/1,");
            f14970a.append(i2);
            f14970a.append("/1,");
            f14970a.append((int) (((d2 * 60.0d) - (((double) i2) * 60.0d)) * 1000.0d));
            f14970a.append("/1000");
            sb = f14970a.toString();
        }
        return sb;
    }

    /* renamed from: b */
    public static String m24627b(double d) {
        return d < 0.0d ? ExifInterface.LATITUDE_SOUTH : "N";
    }

    /* renamed from: c */
    public static String m24628c(double d) {
        return d < 0.0d ? ExifInterface.LONGITUDE_WEST : ExifInterface.LONGITUDE_EAST;
    }
}
