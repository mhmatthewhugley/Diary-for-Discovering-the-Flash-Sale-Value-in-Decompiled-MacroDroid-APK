package com.google.api.client.extensions.android;

import android.os.Build;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;

@Beta
public class AndroidUtils {
    private AndroidUtils() {
    }

    /* renamed from: a */
    public static void m71646a(int i) {
        Preconditions.m72715c(m71647b(i), "running on Android SDK level %s but requires minimum %s", Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf(i));
    }

    /* renamed from: b */
    public static boolean m71647b(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
