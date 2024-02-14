package dev.skomlach.biometric.compat.engine.internal.face.miui.impl.wrapper;

import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006J\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/engine/internal/face/miui/impl/wrapper/FeatureParser;", "", "()V", "clazz", "Ljava/lang/Class;", "getBoolean", "", "s", "", "def", "getStringArray", "", "(Ljava/lang/String;)[Ljava/lang/String;", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: FeatureParser.kt */
public final class FeatureParser {
    public static final FeatureParser INSTANCE = new FeatureParser();
    private static Class<?> clazz;

    static {
        try {
            clazz = Class.forName("miui.util.FeatureParser");
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
        }
    }

    private FeatureParser() {
    }

    public final boolean getBoolean(String str, boolean z) {
        Method method;
        try {
            Class<?> cls = clazz;
            Object obj = null;
            if (!(cls == null || (method = cls.getMethod("getBoolean", new Class[]{Boolean.TYPE})) == null)) {
                obj = method.invoke((Object) null, new Object[]{str});
            }
            C13706o.m87927d(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return ((Boolean) obj).booleanValue();
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return z;
        }
    }

    public final String[] getStringArray(String str) {
        Object obj;
        Method method;
        try {
            Class<?> cls = clazz;
            if (cls == null || (method = cls.getMethod("getStringArray", new Class[]{String.class})) == null) {
                obj = null;
            } else {
                obj = method.invoke((Object) null, new Object[]{str});
            }
            return (String[]) obj;
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return null;
        }
    }
}
