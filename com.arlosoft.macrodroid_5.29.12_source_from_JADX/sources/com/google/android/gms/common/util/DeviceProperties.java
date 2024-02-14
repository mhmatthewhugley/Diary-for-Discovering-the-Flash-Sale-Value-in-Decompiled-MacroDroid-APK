package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class DeviceProperties {
    @Nullable

    /* renamed from: a */
    private static Boolean f3932a;
    @Nullable

    /* renamed from: b */
    private static Boolean f3933b;
    @Nullable

    /* renamed from: c */
    private static Boolean f3934c;
    @Nullable

    /* renamed from: d */
    private static Boolean f3935d;
    @Nullable

    /* renamed from: e */
    private static Boolean f3936e;
    @Nullable

    /* renamed from: f */
    private static Boolean f3937f;

    private DeviceProperties() {
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m4875a(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3936e == null) {
            boolean z = false;
            if (PlatformVersion.m4904i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            f3936e = Boolean.valueOf(z);
        }
        return f3936e.booleanValue();
    }

    @KeepForSdk
    /* renamed from: b */
    public static boolean m4876b(@NonNull Context context) {
        if (f3937f == null) {
            boolean z = false;
            if (PlatformVersion.m4907l() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            f3937f = Boolean.valueOf(z);
        }
        return f3937f.booleanValue();
    }

    @KeepForSdk
    /* renamed from: c */
    public static boolean m4877c(@NonNull Context context) {
        if (f3934c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            f3934c = Boolean.valueOf(z);
        }
        return f3934c.booleanValue();
    }

    @KeepForSdk
    /* renamed from: d */
    public static boolean m4878d(@NonNull Context context) {
        return m4882h(context);
    }

    @KeepForSdk
    /* renamed from: e */
    public static boolean m4879e() {
        int i = GooglePlayServicesUtilLight.f3065a;
        return "user".equals(Build.TYPE);
    }

    @KeepForSdk
    /* renamed from: f */
    public static boolean m4880f(@NonNull Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f3932a == null) {
            boolean z = false;
            if (PlatformVersion.m4900e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            f3932a = Boolean.valueOf(z);
        }
        return f3932a.booleanValue();
    }

    @KeepForSdk
    /* renamed from: g */
    public static boolean m4881g(@NonNull Context context) {
        if (m4880f(context) && !PlatformVersion.m4903h()) {
            return true;
        }
        if (m4882h(context)) {
            return !PlatformVersion.m4904i() || PlatformVersion.m4907l();
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m4882h(@NonNull Context context) {
        if (f3933b == null) {
            boolean z = false;
            if (PlatformVersion.m4901f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            f3933b = Boolean.valueOf(z);
        }
        return f3933b.booleanValue();
    }

    /* renamed from: i */
    public static boolean m4883i(@NonNull Context context) {
        if (f3935d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            f3935d = Boolean.valueOf(z);
        }
        return f3935d.booleanValue();
    }
}
