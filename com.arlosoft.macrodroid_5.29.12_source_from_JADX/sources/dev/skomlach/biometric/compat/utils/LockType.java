package dev.skomlach.biometric.compat.utils;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserHandle;
import dev.skomlach.common.contextprovider.C12104a;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/LockType;", "", "()V", "FLAG_BIOMETRIC_WEAK_LIVELINESS", "", "LOCK_BIOMETRIC_WEAK_FLAGS", "", "PASSWORD_TYPE_ALTERNATE_KEY", "PASSWORD_TYPE_KEY", "appContext", "Landroid/content/Context;", "isBiometricEnabledInSettings", "", "context", "type", "isBiometricWeakEnabled", "isBiometricWeakLivelinessEnabled", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: LockType.kt */
public final class LockType {
    public static final int FLAG_BIOMETRIC_WEAK_LIVELINESS = 1;
    public static final LockType INSTANCE = new LockType();
    private static final String LOCK_BIOMETRIC_WEAK_FLAGS = "lock_biometric_weak_flags";
    private static final String PASSWORD_TYPE_ALTERNATE_KEY = "lockscreen.password_type_alternate";
    private static final String PASSWORD_TYPE_KEY = "lockscreen.password_type";
    private static final Context appContext = C12104a.f58372a.mo68283g();

    private LockType() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[Catch:{ all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050 A[Catch:{ all -> 0x009f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isBiometricEnabledInSettings(android.content.Context r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.String r0 = "name"
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C13706o.m87929f(r11, r1)
            java.lang.String r1 = "type"
            kotlin.jvm.internal.C13706o.m87929f(r12, r1)
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x009f }
            r2.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r3 = "content://settings/secure"
            android.net.Uri r5 = android.net.Uri.parse(r3)     // Catch:{ all -> 0x009f }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ all -> 0x009f }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x009f }
            r4 = 1
            if (r3 == 0) goto L_0x0085
            r3.moveToFirst()     // Catch:{ all -> 0x009f }
        L_0x002a:
            boolean r5 = r3.isAfterLast()     // Catch:{ all -> 0x009f }
            if (r5 != 0) goto L_0x0082
            int r5 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x009f }
            boolean r6 = r3.isNull(r5)     // Catch:{ all -> 0x009f }
            if (r6 != 0) goto L_0x007e
            java.lang.String r5 = r3.getString(r5)     // Catch:{ all -> 0x009f }
            if (r5 == 0) goto L_0x0049
            int r6 = r5.length()     // Catch:{ all -> 0x009f }
            if (r6 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r6 = 0
            goto L_0x004a
        L_0x0049:
            r6 = 1
        L_0x004a:
            if (r6 == 0) goto L_0x0050
            r3.moveToNext()     // Catch:{ all -> 0x009f }
            goto L_0x002a
        L_0x0050:
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)     // Catch:{ all -> 0x009f }
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch:{ all -> 0x009f }
            java.lang.String r7 = "ROOT"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)     // Catch:{ all -> 0x009f }
            java.lang.String r6 = r5.toLowerCase(r6)     // Catch:{ all -> 0x009f }
            java.lang.String r7 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)     // Catch:{ all -> 0x009f }
            r7 = 0
            r8 = 2
            boolean r9 = kotlin.text.C15177w.m93663N(r6, r12, r1, r8, r7)     // Catch:{ all -> 0x009f }
            if (r9 == 0) goto L_0x007e
            java.lang.String r9 = "_unl"
            boolean r9 = kotlin.text.C15177w.m93663N(r6, r9, r1, r8, r7)     // Catch:{ all -> 0x009f }
            if (r9 == 0) goto L_0x007e
            java.lang.String r9 = "_enable"
            boolean r6 = kotlin.text.C15177w.m93663N(r6, r9, r1, r8, r7)     // Catch:{ all -> 0x009f }
            if (r6 == 0) goto L_0x007e
            r2.add(r5)     // Catch:{ all -> 0x009f }
        L_0x007e:
            r3.moveToNext()     // Catch:{ all -> 0x009f }
            goto L_0x002a
        L_0x0082:
            r3.close()     // Catch:{ all -> 0x009f }
        L_0x0085:
            java.util.Iterator r12 = r2.iterator()     // Catch:{ all -> 0x009f }
        L_0x0089:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x009f }
            if (r0 == 0) goto L_0x009f
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x009f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x009f }
            dev.skomlach.biometric.compat.utils.SettingsHelper r2 = dev.skomlach.biometric.compat.utils.SettingsHelper.INSTANCE     // Catch:{ all -> 0x009f }
            r3 = -1
            int r0 = r2.getInt(r11, r0, r3)     // Catch:{ all -> 0x009f }
            if (r0 <= 0) goto L_0x0089
            return r4
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.LockType.isBiometricEnabledInSettings(android.content.Context, java.lang.String):boolean");
    }

    public final boolean isBiometricWeakEnabled(Context context) {
        int i;
        C13706o.m87929f(context, "context");
        try {
            Class<?> cls = Class.forName("com.android.internal.widget.LockPatternUtils");
            Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{appContext});
            if (Build.VERSION.SDK_INT < 23) {
                Integer valueOf = Integer.valueOf(cls.getMethod("getActivePasswordQuality", new Class[0]).invoke(newInstance, new Object[0]).toString());
                C13706o.m87928e(valueOf, "valueOf(method.invoke(lockUtils).toString())");
                i = valueOf.intValue();
            } else {
                Class cls2 = Integer.TYPE;
                Method method = cls.getMethod("getActivePasswordQuality", new Class[]{cls2});
                Object invoke = UserHandle.class.getMethod("getUserId", new Class[]{cls2}).invoke((Object) null, new Object[]{Integer.valueOf(Process.myUid())});
                C13706o.m87927d(invoke, "null cannot be cast to non-null type kotlin.Int");
                Integer valueOf2 = Integer.valueOf(method.invoke(newInstance, new Object[]{Integer.valueOf(((Integer) invoke).intValue())}).toString());
                C13706o.m87928e(valueOf2, "valueOf(method.invoke(lo…tils, userid).toString())");
                i = valueOf2.intValue();
            }
            if (i == 32768) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return isBiometricEnabledInSettings(context);
        }
    }

    public final boolean isBiometricWeakLivelinessEnabled(Context context) {
        C13706o.m87929f(context, "context");
        return (SettingsHelper.INSTANCE.getLong(context, LOCK_BIOMETRIC_WEAK_FLAGS, 0) & 1) != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046 A[Catch:{ all -> 0x00af }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isBiometricEnabledInSettings(android.content.Context r12) {
        /*
            r11 = this;
            java.lang.String r0 = "name"
            r1 = 1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00af }
            r3.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "content://settings/secure"
            android.net.Uri r6 = android.net.Uri.parse(r4)     // Catch:{ all -> 0x00af }
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch:{ all -> 0x00af }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00af }
            if (r4 == 0) goto L_0x0095
            r4.moveToFirst()     // Catch:{ all -> 0x00af }
        L_0x0020:
            boolean r5 = r4.isAfterLast()     // Catch:{ all -> 0x00af }
            if (r5 != 0) goto L_0x0092
            int r5 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x00af }
            boolean r6 = r4.isNull(r5)     // Catch:{ all -> 0x00af }
            if (r6 != 0) goto L_0x008e
            java.lang.String r5 = r4.getString(r5)     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x003f
            int r6 = r5.length()     // Catch:{ all -> 0x00af }
            if (r6 != 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r6 = 0
            goto L_0x0040
        L_0x003f:
            r6 = 1
        L_0x0040:
            if (r6 == 0) goto L_0x0046
            r4.moveToNext()     // Catch:{ all -> 0x00af }
            goto L_0x0020
        L_0x0046:
            kotlin.jvm.internal.C13706o.m87928e(r5, r0)     // Catch:{ all -> 0x00af }
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch:{ all -> 0x00af }
            java.lang.String r7 = "ROOT"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)     // Catch:{ all -> 0x00af }
            java.lang.String r6 = r5.toLowerCase(r6)     // Catch:{ all -> 0x00af }
            java.lang.String r7 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.C13706o.m87928e(r6, r7)     // Catch:{ all -> 0x00af }
            java.lang.String r7 = "fingerprint"
            r8 = 0
            r9 = 2
            boolean r7 = kotlin.text.C15177w.m93663N(r6, r7, r2, r9, r8)     // Catch:{ all -> 0x00af }
            if (r7 != 0) goto L_0x007b
            java.lang.String r7 = "face"
            boolean r7 = kotlin.text.C15177w.m93663N(r6, r7, r2, r9, r8)     // Catch:{ all -> 0x00af }
            if (r7 != 0) goto L_0x007b
            java.lang.String r7 = "iris"
            boolean r7 = kotlin.text.C15177w.m93663N(r6, r7, r2, r9, r8)     // Catch:{ all -> 0x00af }
            if (r7 != 0) goto L_0x007b
            java.lang.String r7 = "biometric"
            boolean r7 = kotlin.text.C15177w.m93663N(r6, r7, r2, r9, r8)     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x008e
        L_0x007b:
            java.lang.String r7 = "_unl"
            boolean r7 = kotlin.text.C15177w.m93663N(r6, r7, r2, r9, r8)     // Catch:{ all -> 0x00af }
            if (r7 == 0) goto L_0x008e
            java.lang.String r7 = "_enable"
            boolean r6 = kotlin.text.C15177w.m93663N(r6, r7, r2, r9, r8)     // Catch:{ all -> 0x00af }
            if (r6 == 0) goto L_0x008e
            r3.add(r5)     // Catch:{ all -> 0x00af }
        L_0x008e:
            r4.moveToNext()     // Catch:{ all -> 0x00af }
            goto L_0x0020
        L_0x0092:
            r4.close()     // Catch:{ all -> 0x00af }
        L_0x0095:
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x00af }
        L_0x0099:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x00af }
            if (r3 == 0) goto L_0x00b0
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x00af }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00af }
            dev.skomlach.biometric.compat.utils.SettingsHelper r4 = dev.skomlach.biometric.compat.utils.SettingsHelper.INSTANCE     // Catch:{ all -> 0x00af }
            r5 = -1
            int r3 = r4.getInt(r12, r3, r5)     // Catch:{ all -> 0x00af }
            if (r3 <= 0) goto L_0x0099
            return r1
        L_0x00af:
        L_0x00b0:
            dev.skomlach.biometric.compat.utils.SettingsHelper r0 = dev.skomlach.biometric.compat.utils.SettingsHelper.INSTANCE
            java.lang.String r3 = "lockscreen.password_type"
            r4 = 0
            long r6 = r0.getLong(r12, r3, r4)
            java.lang.String r3 = "lockscreen.password_type_alternate"
            long r3 = r0.getLong(r12, r3, r4)
            r8 = 32768(0x8000, double:1.61895E-319)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x00cd
            int r12 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x00cc
            goto L_0x00cd
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.LockType.isBiometricEnabledInSettings(android.content.Context):boolean");
    }
}
