package dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper;

import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.lang.reflect.Field;
import kotlin.Metadata;

@Metadata(mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/wrapper/MiuiBuild;", "", "()V", "DEVICE", "", "getDEVICE", "()Ljava/lang/String;", "setDEVICE", "(Ljava/lang/String;)V", "IS_INTERNATIONAL_BUILD", "", "getIS_INTERNATIONAL_BUILD", "()Z", "setIS_INTERNATIONAL_BUILD", "(Z)V", "clazz", "Ljava/lang/Class;", "region", "getRegion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: MiuiBuild.kt */
public final class MiuiBuild {
    private static String DEVICE;
    public static final MiuiBuild INSTANCE = new MiuiBuild();
    private static boolean IS_INTERNATIONAL_BUILD;
    private static Class<?> clazz;

    static {
        Field field;
        try {
            Class<?> cls = Class.forName("miui.os.Build");
            clazz = cls;
            Field field2 = cls.getField("IS_INTERNATIONAL_BUILD");
            Object obj = null;
            IS_INTERNATIONAL_BUILD = field2 != null ? field2.getBoolean((Object) null) : false;
            Class<?> cls2 = clazz;
            if (!(cls2 == null || (field = cls2.getField("DEVICE")) == null)) {
                obj = field.get((Object) null);
            }
            DEVICE = (String) obj;
        } catch (ClassNotFoundException | NoSuchFieldException unused) {
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private MiuiBuild() {
    }

    public final String getDEVICE() {
        return DEVICE;
    }

    public final boolean getIS_INTERNATIONAL_BUILD() {
        return IS_INTERNATIONAL_BUILD;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0005, code lost:
        r1 = r1.getMethod("getRegion", new java.lang.Class[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getRegion() {
        /*
            r5 = this;
            r0 = 0
            java.lang.Class<?> r1 = clazz     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0017
            java.lang.String r2 = "getRegion"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x001c }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0017
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch:{ all -> 0x001c }
            goto L_0x0018
        L_0x0017:
            r1 = r0
        L_0x0018:
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x001c }
            r0 = r1
            goto L_0x0022
        L_0x001c:
            r1 = move-exception
            dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl r2 = dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl.INSTANCE
            r2.mo68218e((java.lang.Throwable) r1)
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper.MiuiBuild.getRegion():java.lang.String");
    }

    public final void setDEVICE(String str) {
        DEVICE = str;
    }

    public final void setIS_INTERNATIONAL_BUILD(boolean z) {
        IS_INTERNATIONAL_BUILD = z;
    }
}
