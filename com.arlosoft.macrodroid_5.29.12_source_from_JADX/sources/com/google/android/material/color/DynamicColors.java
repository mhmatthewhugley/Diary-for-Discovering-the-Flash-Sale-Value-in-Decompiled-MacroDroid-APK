package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C10462R;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DynamicColors {

    /* renamed from: a */
    private static final int[] f49095a = {C10462R.attr.dynamicColorThemeOverlay};

    /* renamed from: b */
    private static final DeviceSupportCondition f49096b;

    /* renamed from: c */
    private static final DeviceSupportCondition f49097c;

    /* renamed from: d */
    private static final Map<String, DeviceSupportCondition> f49098d;

    /* renamed from: e */
    private static final Map<String, DeviceSupportCondition> f49099e;

    /* renamed from: f */
    private static final Precondition f49100f = new Precondition() {
        /* renamed from: a */
        public boolean mo57537a(@NonNull Activity activity, int i) {
            return true;
        }
    };

    private interface DeviceSupportCondition {
        boolean isSupported();
    }

    private static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private final int f49102a;

        /* renamed from: c */
        private final Precondition f49103c;

        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        public void onActivityPaused(@NonNull Activity activity) {
        }

        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            DynamicColors.m68096b(activity, this.f49102a, this.f49103c);
        }

        public void onActivityResumed(@NonNull Activity activity) {
        }

        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        public void onActivityStarted(@NonNull Activity activity) {
        }

        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    public interface Precondition {
        /* renamed from: a */
        boolean mo57537a(@NonNull Activity activity, @StyleRes int i);
    }

    static {
        C105171 r0 = new DeviceSupportCondition() {
            public boolean isSupported() {
                return true;
            }
        };
        f49096b = r0;
        C105182 r1 = new DeviceSupportCondition() {

            /* renamed from: a */
            private Long f49101a;

            public boolean isSupported() {
                if (this.f49101a == null) {
                    try {
                        Method declaredMethod = Build.class.getDeclaredMethod("getLong", new Class[]{String.class});
                        declaredMethod.setAccessible(true);
                        this.f49101a = Long.valueOf(((Long) declaredMethod.invoke((Object) null, new Object[]{"ro.build.version.oneui"})).longValue());
                    } catch (Exception unused) {
                        this.f49101a = -1L;
                    }
                }
                if (this.f49101a.longValue() >= 40100) {
                    return true;
                }
                return false;
            }
        };
        f49097c = r1;
        HashMap hashMap = new HashMap();
        hashMap.put("oppo", r0);
        hashMap.put("realme", r0);
        hashMap.put("oneplus", r0);
        hashMap.put("vivo", r0);
        hashMap.put("xiaomi", r0);
        hashMap.put("motorola", r0);
        hashMap.put("itel", r0);
        hashMap.put("tecno mobile limited", r0);
        hashMap.put("infinix mobility limited", r0);
        hashMap.put("hmd global", r0);
        hashMap.put("sharp", r0);
        hashMap.put("sony", r0);
        hashMap.put("tcl", r0);
        hashMap.put("lenovo", r0);
        hashMap.put("lge", r0);
        hashMap.put("google", r0);
        hashMap.put("robolectric", r0);
        hashMap.put("samsung", r1);
        f49098d = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", r0);
        hashMap2.put("jio", r0);
        f49099e = Collections.unmodifiableMap(hashMap2);
    }

    private DynamicColors() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m68096b(@NonNull Activity activity, @StyleRes int i, @NonNull Precondition precondition) {
        if (m68098d()) {
            if (i == 0) {
                i = m68097c(activity);
            }
            if (i != 0 && precondition.mo57537a(activity, i)) {
                activity.setTheme(i);
            }
        }
    }

    /* renamed from: c */
    private static int m68097c(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f49095a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    @ChecksSdkIntAtLeast(api = 31)
    /* renamed from: d */
    public static boolean m68098d() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        DeviceSupportCondition deviceSupportCondition = f49098d.get(Build.MANUFACTURER.toLowerCase());
        if (deviceSupportCondition == null) {
            deviceSupportCondition = f49099e.get(Build.BRAND.toLowerCase());
        }
        if (deviceSupportCondition == null || !deviceSupportCondition.isSupported()) {
            return false;
        }
        return true;
    }
}
