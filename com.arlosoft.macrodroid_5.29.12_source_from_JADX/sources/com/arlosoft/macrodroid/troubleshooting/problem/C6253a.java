package com.arlosoft.macrodroid.troubleshooting.problem;

import android.app.AppOpsManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.troubleshooting.problem.a */
/* compiled from: PermissionChecker.kt */
public final class C6253a {

    /* renamed from: a */
    private final Context f14804a;

    public C6253a(Context context) {
        C13706o.m87929f(context, "context");
        this.f14804a = context;
    }

    /* renamed from: a */
    public final boolean mo32266a() {
        return C4061t1.m15992f0(this.f14804a);
    }

    /* renamed from: b */
    public final boolean mo32267b() {
        ComponentName componentName = new ComponentName(this.f14804a, MacroDroidDeviceAdminReceiver.class);
        Object systemService = this.f14804a.getSystemService("device_policy");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
        return ((DevicePolicyManager) systemService).isAdminActive(componentName);
    }

    /* renamed from: c */
    public final boolean mo32268c() {
        return Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(this.f14804a);
    }

    /* renamed from: d */
    public final boolean mo32269d() {
        return C4061t1.m15990e0(this.f14804a);
    }

    /* renamed from: e */
    public final boolean mo32270e() {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(this.f14804a.getContentResolver(), "location_mode") != 0) {
                z = true;
            }
            return z;
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: f */
    public final boolean mo32271f() {
        String string = Settings.Secure.getString(this.f14804a.getContentResolver(), "enabled_notification_listeners");
        if (string == null) {
            return false;
        }
        String packageName = MacroDroidApplication.f9883I.mo27303b().getPackageName();
        C13706o.m87928e(packageName, "MacroDroidApplication.instance.packageName");
        if (C15177w.m93663N(string, packageName, false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo32272g(String str) {
        C13706o.m87929f(str, "permission");
        return ContextCompat.checkSelfPermission(this.f14804a, str) == 0;
    }

    /* renamed from: h */
    public final boolean mo32273h() {
        return C4061t1.m15996h0(this.f14804a);
    }

    /* renamed from: i */
    public final boolean mo32274i() {
        try {
            PackageManager packageManager = this.f14804a.getPackageManager();
            C13706o.m87928e(packageManager, "context.packageManager");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f14804a.getPackageName(), 0);
            C13706o.m87928e(applicationInfo, "packageManager.getApplic…o(context.packageName, 0)");
            Object systemService = this.f14804a.getSystemService("appops");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.app.AppOpsManager");
            if (((AppOpsManager) systemService).checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) == 0) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final boolean mo32275j() {
        return C4061t1.m15994g0(this.f14804a);
    }

    /* renamed from: k */
    public final boolean mo32276k() {
        return Build.VERSION.SDK_INT < 23 || Settings.System.canWrite(this.f14804a);
    }
}
