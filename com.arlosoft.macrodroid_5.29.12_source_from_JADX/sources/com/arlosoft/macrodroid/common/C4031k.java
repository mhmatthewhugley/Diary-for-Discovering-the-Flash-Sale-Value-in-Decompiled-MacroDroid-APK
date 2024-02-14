package com.arlosoft.macrodroid.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import android.provider.Settings;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.settings.C5163j2;
import java.lang.reflect.Method;

/* renamed from: com.arlosoft.macrodroid.common.k */
/* compiled from: ApplicationChecker */
public class C4031k {
    /* renamed from: a */
    private static String m15901a(String str) {
        try {
            return MacroDroidApplication.m14845u().getPackageManager().getPackageInfo(str, 1).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (Exception e) {
            C4878b.m18868g("Could not get appVersion for: " + str + " :" + e.toString());
            return null;
        }
    }

    /* renamed from: b */
    private static int m15902b(String str) {
        try {
            return MacroDroidApplication.m14845u().getPackageManager().getPackageInfo(str, 1).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            C4878b.m18868g("Could not get getAppVersionCode for: " + str + " :" + e.toString());
            return 0;
        }
    }

    /* renamed from: c */
    private static ComponentName m15903c(Context context) {
        try {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("myUserId", new Class[0]);
            declaredMethod.setAccessible(true);
            Integer num = (Integer) declaredMethod.invoke((Object) null, new Object[0]);
            if (num != null) {
                Object newInstance = Class.forName("com.android.internal.app.AssistUtils").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
                Method declaredMethod2 = newInstance.getClass().getDeclaredMethod("getAssistComponentForUser", new Class[]{Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return (ComponentName) declaredMethod2.invoke(newInstance, new Object[]{num});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: d */
    public static int m15904d() {
        return m15902b("com.arlosoft.macrodroid.helper");
    }

    /* renamed from: e */
    public static String m15905e() {
        return m15901a("com.arlosoft.macrodroid.helper");
    }

    /* renamed from: f */
    private static boolean m15906f(String str) {
        try {
            MacroDroidApplication.m14845u().getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m15907g() {
        return m15906f("stericson.busybox");
    }

    /* renamed from: h */
    public static boolean m15908h(Context context) {
        if (C5163j2.m20215n0(context)) {
            return true;
        }
        ComponentName c = m15903c(context);
        if (c != null && c.getPackageName().equals(context.getPackageName())) {
            return true;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "assistant");
        if (string == null || !string.startsWith(context.getPackageName())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m15909i() {
        return m15906f("com.arlosoft.macrodroid.settingshelper") || m15906f("com.arlosoft.macrodroid.helper");
    }

    /* renamed from: j */
    public static boolean m15910j() {
        return m15906f("com.arlosoft.macrodroid.helper");
    }

    /* renamed from: k */
    public static boolean m15911k() {
        return m15906f("com.getpebble.android") || m15906f("com.getpebble.android.basalt");
    }

    /* renamed from: l */
    public static boolean m15912l() {
        return m15906f("com.getpebble.android.basalt");
    }

    /* renamed from: m */
    public static boolean m15913m() {
        return m15906f("com.android.vending");
    }

    /* renamed from: n */
    public static boolean m15914n() {
        return m15906f("com.intangibleobject.securesettings.plugin");
    }
}
