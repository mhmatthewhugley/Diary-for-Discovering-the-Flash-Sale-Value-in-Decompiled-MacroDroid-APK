package com.google.android.gms.internal.base;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
final class zan {
    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    /* renamed from: a */
    static boolean m55862a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
