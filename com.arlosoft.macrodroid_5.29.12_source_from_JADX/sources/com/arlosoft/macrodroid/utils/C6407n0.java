package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.provider.Settings;

/* renamed from: com.arlosoft.macrodroid.utils.n0 */
/* compiled from: LocationUtils */
public class C6407n0 {
    /* renamed from: a */
    public static boolean m24663a(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
