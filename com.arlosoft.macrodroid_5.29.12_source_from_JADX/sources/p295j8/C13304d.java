package p295j8;

import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import p276h8.C12406a;

/* renamed from: j8.d */
/* compiled from: PermissionCompat */
public final class C13304d {

    /* renamed from: j8.d$a */
    /* compiled from: PermissionCompat */
    public enum C13305a {
        NOT_GRANTED_BY_MANIFEST,
        NOT_GRANTED_BY_USER,
        GRANTED
    }

    @NonNull
    /* renamed from: a */
    public static C13305a m85636a(@NonNull Context context, @Size(min = 1) @NonNull String str) {
        C12406a.m83260d(context, "context");
        C12406a.m83259c(str, "permissionName");
        if (C13301a.m85633a(23)) {
            return m85638c(context, str);
        }
        return m85637b(context, str);
    }

    @NonNull
    /* renamed from: b */
    private static C13305a m85637b(@NonNull Context context, @Size(min = 1) @NonNull String str) {
        C12406a.m83260d(context, "context");
        C12406a.m83259c(str, "permissionName");
        if (-1 == context.getPackageManager().checkPermission(str, context.getPackageName())) {
            return C13305a.NOT_GRANTED_BY_MANIFEST;
        }
        return C13305a.GRANTED;
    }

    @NonNull
    /* renamed from: c */
    private static C13305a m85638c(@NonNull Context context, @Size(min = 1) @NonNull String str) {
        C12406a.m83260d(context, "context");
        C12406a.m83259c(str, "permissionName");
        if (m85640e(context, str)) {
            return C13305a.GRANTED;
        }
        if (m85639d(context, str)) {
            return C13305a.NOT_GRANTED_BY_USER;
        }
        return C13305a.NOT_GRANTED_BY_MANIFEST;
    }

    /* renamed from: d */
    private static boolean m85639d(@NonNull Context context, @Size(min = 1) @NonNull String str) {
        C12406a.m83260d(context, "context");
        C12406a.m83259c(str, "permissionName");
        String[] strArr = C13302b.m85634a(context, 4096).requestedPermissions;
        if (strArr != null) {
            for (String equals : strArr) {
                if (str.equals(equals)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m85640e(@NonNull Context context, @Size(min = 1) @NonNull String str) {
        C12406a.m83260d(context, "context");
        C12406a.m83259c(str, "permissionName");
        if (!"android.permission.WRITE_SETTINGS".equals(str) || "com.twofortyfouram.test.context.FeatureContextWrapper".equals(context.getClass().getName())) {
            if (!"android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS".equals(str) || "com.twofortyfouram.test.context.FeatureContextWrapper".equals(context.getClass().getName())) {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
                return false;
            } else if (((PowerManager) context.getSystemService(PowerManager.class)).isIgnoringBatteryOptimizations(context.getPackageName())) {
                return true;
            } else {
                return false;
            }
        } else if (Settings.System.canWrite(context)) {
            return true;
        } else {
            return false;
        }
    }
}
