package com.google.firebase.firestore.util;

import android.util.Log;

public class Logger {

    /* renamed from: a */
    private static Level f54784a = Level.WARN;

    /* renamed from: com.google.firebase.firestore.util.Logger$1 */
    static /* synthetic */ class C112501 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54785a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.firebase.firestore.util.Logger$Level[] r0 = com.google.firebase.firestore.util.Logger.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54785a = r0
                com.google.firebase.firestore.util.Logger$Level r1 = com.google.firebase.firestore.util.Logger.Level.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54785a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.util.Logger$Level r1 = com.google.firebase.firestore.util.Logger.Level.WARN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54785a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.util.Logger$Level r1 = com.google.firebase.firestore.util.Logger.Level.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.util.Logger.C112501.<clinit>():void");
        }
    }

    public enum Level {
        DEBUG,
        WARN,
        NONE
    }

    /* renamed from: a */
    public static void m76508a(String str, String str2, Object... objArr) {
        m76509b(Level.DEBUG, str, str2, objArr);
    }

    /* renamed from: b */
    private static void m76509b(Level level, String str, String str2, Object... objArr) {
        if (level.ordinal() >= f54784a.ordinal()) {
            String str3 = String.format("(%s) [%s]: ", new Object[]{"22.1.2", str}) + String.format(str2, objArr);
            int i = C112501.f54785a[level.ordinal()];
            if (i == 1) {
                Log.i("Firestore", str3);
            } else if (i == 2) {
                Log.w("Firestore", str3);
            } else if (i == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    /* renamed from: c */
    public static boolean m76510c() {
        return f54784a.ordinal() >= Level.DEBUG.ordinal();
    }

    /* renamed from: d */
    public static void m76511d(String str, String str2, Object... objArr) {
        m76509b(Level.WARN, str, str2, objArr);
    }
}
