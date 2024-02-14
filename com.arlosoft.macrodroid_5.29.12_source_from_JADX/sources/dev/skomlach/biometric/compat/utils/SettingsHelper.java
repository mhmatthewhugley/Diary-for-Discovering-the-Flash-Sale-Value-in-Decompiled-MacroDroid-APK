package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\fJ\"\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\fH\u0002J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/SettingsHelper;", "", "()V", "getInt", "", "context", "Landroid/content/Context;", "secureSettingKey", "", "defaultValue", "getIntInternal", "getLong", "", "getLongInternal", "getString", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: SettingsHelper.kt */
public final class SettingsHelper {
    public static final SettingsHelper INSTANCE = new SettingsHelper();

    private SettingsHelper() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|(1:3)|4|5|(1:7)|8|9|(1:11)(1:12)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int getIntInternal(android.content.Context r2, java.lang.String r3, int r4) {
        /*
            r1 = this;
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ all -> 0x000b }
            int r0 = android.provider.Settings.Secure.getInt(r0, r3)     // Catch:{ all -> 0x000b }
            if (r0 == r4) goto L_0x000b
            return r0
        L_0x000b:
            android.content.ContentResolver r0 = r2.getContentResolver()     // Catch:{ all -> 0x0016 }
            int r0 = android.provider.Settings.System.getInt(r0, r3)     // Catch:{ all -> 0x0016 }
            if (r0 == r4) goto L_0x0016
            return r0
        L_0x0016:
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0021 }
            int r2 = android.provider.Settings.Global.getInt(r2, r3)     // Catch:{ all -> 0x0021 }
            if (r2 == r4) goto L_0x0021
            return r2
        L_0x0021:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.SettingsHelper.getIntInternal(android.content.Context, java.lang.String, int):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|(1:4)|5|6|7|(1:9)|10|11|12|(1:14)(1:15)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long getLongInternal(android.content.Context r4, java.lang.String r5, long r6) {
        /*
            r3 = this;
            android.content.ContentResolver r0 = r4.getContentResolver()     // Catch:{ all -> 0x000d }
            long r0 = android.provider.Settings.Secure.getLong(r0, r5)     // Catch:{ all -> 0x000d }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x000d
            return r0
        L_0x000d:
            android.content.ContentResolver r0 = r4.getContentResolver()     // Catch:{ all -> 0x001a }
            long r0 = android.provider.Settings.System.getLong(r0, r5)     // Catch:{ all -> 0x001a }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0027 }
            long r4 = android.provider.Settings.Global.getLong(r4, r5)     // Catch:{ all -> 0x0027 }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0027
            return r4
        L_0x0027:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.SettingsHelper.getLongInternal(android.content.Context, java.lang.String, long):long");
    }

    public final int getInt(Context context, String str, int i) {
        C13706o.m87929f(context, "context");
        return (int) getLong(context, str, (long) i);
    }

    public final long getLong(Context context, String str, long j) {
        C13706o.m87929f(context, "context");
        long longInternal = getLongInternal(context, str, j);
        return longInternal == j ? (long) getIntInternal(context, str, (int) j) : longInternal;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|(2:4|5)|6|7|(2:9|10)|(3:11|12|(2:14|15))|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[Catch:{ all -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c A[Catch:{ all -> 0x0030 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getString(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = "result"
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C13706o.m87929f(r4, r1)
            java.lang.String r1 = "defaultValue"
            kotlin.jvm.internal.C13706o.m87929f(r6, r1)
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch:{ all -> 0x001e }
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r5)     // Catch:{ all -> 0x001e }
            boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r6, r1)     // Catch:{ all -> 0x001e }
            if (r2 != 0) goto L_0x001e
            kotlin.jvm.internal.C13706o.m87928e(r1, r0)     // Catch:{ all -> 0x001e }
            return r1
        L_0x001e:
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = android.provider.Settings.System.getString(r1, r5)     // Catch:{ all -> 0x0030 }
            boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r6, r1)     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0030
            kotlin.jvm.internal.C13706o.m87928e(r1, r0)     // Catch:{ all -> 0x0030 }
            return r1
        L_0x0030:
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = android.provider.Settings.Global.getString(r4, r5)     // Catch:{ all -> 0x0042 }
            boolean r5 = kotlin.jvm.internal.C13706o.m87924a(r6, r4)     // Catch:{ all -> 0x0042 }
            if (r5 != 0) goto L_0x0042
            kotlin.jvm.internal.C13706o.m87928e(r4, r0)     // Catch:{ all -> 0x0042 }
            return r4
        L_0x0042:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.SettingsHelper.getString(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }
}
