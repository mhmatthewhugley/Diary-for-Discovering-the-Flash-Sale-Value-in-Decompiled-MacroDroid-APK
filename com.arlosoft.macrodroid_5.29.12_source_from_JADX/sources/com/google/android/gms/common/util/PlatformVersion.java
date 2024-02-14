package com.google.android.gms.common.util;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 14)
    /* renamed from: a */
    public static boolean m4896a() {
        return true;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 16)
    /* renamed from: b */
    public static boolean m4897b() {
        return true;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 18)
    /* renamed from: c */
    public static boolean m4898c() {
        return true;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 19)
    /* renamed from: d */
    public static boolean m4899d() {
        return true;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 20)
    /* renamed from: e */
    public static boolean m4900e() {
        return true;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 21)
    /* renamed from: f */
    public static boolean m4901f() {
        return true;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 23)
    /* renamed from: g */
    public static boolean m4902g() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 24)
    /* renamed from: h */
    public static boolean m4903h() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 26)
    /* renamed from: i */
    public static boolean m4904i() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 28)
    /* renamed from: j */
    public static boolean m4905j() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 29)
    /* renamed from: k */
    public static boolean m4906k() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 30)
    /* renamed from: l */
    public static boolean m4907l() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    @ChecksSdkIntAtLeast(api = 31)
    /* renamed from: m */
    public static boolean m4908m() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
