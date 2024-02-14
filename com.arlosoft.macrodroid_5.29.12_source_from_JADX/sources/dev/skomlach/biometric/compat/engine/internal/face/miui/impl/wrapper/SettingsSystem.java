package dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper;

import android.content.ContentResolver;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006J*\u0010\r\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006R\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/wrapper/SettingsSystem;", "", "()V", "clazz", "Ljava/lang/Class;", "getIntForUser", "", "cr", "Landroid/content/ContentResolver;", "name", "", "def", "userHandle", "getStringForUser", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: SettingsSystem.kt */
public final class SettingsSystem {
    public static final SettingsSystem INSTANCE = new SettingsSystem();
    private static Class<?> clazz;

    static {
        try {
            clazz = Class.forName("android.provider.Settings$System");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private SettingsSystem() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r5 = java.lang.Integer.TYPE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getIntForUser(android.content.ContentResolver r11, java.lang.String r12, int r13, int r14) {
        /*
            r10 = this;
            java.lang.Class<?> r0 = clazz     // Catch:{ all -> 0x0043 }
            r1 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.String r2 = "getIntForUser"
            r3 = 4
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0043 }
            java.lang.Class<android.content.ContentResolver> r5 = android.content.ContentResolver.class
            r6 = 0
            r4[r6] = r5     // Catch:{ all -> 0x0043 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r7 = 1
            r4[r7] = r5     // Catch:{ all -> 0x0043 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0043 }
            r8 = 2
            r4[r8] = r5     // Catch:{ all -> 0x0043 }
            r9 = 3
            r4[r9] = r5     // Catch:{ all -> 0x0043 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x0043 }
            r2[r6] = r11     // Catch:{ all -> 0x0043 }
            r2[r7] = r12     // Catch:{ all -> 0x0043 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0043 }
            r2[r8] = r11     // Catch:{ all -> 0x0043 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0043 }
            r2[r9] = r11     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch:{ all -> 0x0043 }
        L_0x0038:
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.C13706o.m87927d(r1, r11)     // Catch:{ all -> 0x0043 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0043 }
            int r13 = r1.intValue()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.SettingsSystem.getIntForUser(android.content.ContentResolver, java.lang.String, int, int):int");
    }

    public final String getStringForUser(ContentResolver contentResolver, String str, String str2, int i) {
        Method method;
        Class<String> cls = String.class;
        C13706o.m87929f(str2, "def");
        try {
            Class<?> cls2 = clazz;
            Object obj = null;
            if (!(cls2 == null || (method = cls2.getMethod("getStringForUser", new Class[]{ContentResolver.class, cls, cls, Integer.TYPE})) == null)) {
                obj = method.invoke((Object) null, new Object[]{contentResolver, str, str2, Integer.valueOf(i)});
            }
            C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.String");
            return (String) obj;
        } catch (Throwable unused) {
            return str2;
        }
    }
}
