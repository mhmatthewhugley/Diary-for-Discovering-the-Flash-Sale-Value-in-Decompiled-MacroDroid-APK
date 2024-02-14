package dev.skomlach.biometric.compat.utils.logging;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007J/\u0010\u0005\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\bJ%\u0010\t\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\t\u0010\u0006R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/logging/BiometricLoggerImpl;", "", "", "msgs", "Lja/u;", "e", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Throwable;[Ljava/lang/Object;)V", "d", "", "DEBUG", "Z", "getDEBUG", "()Z", "setDEBUG", "(Z)V", "Ldev/skomlach/biometric/compat/utils/logging/BiometricLoggerImpl$ExternalLogger;", "externalLogger", "Ldev/skomlach/biometric/compat/utils/logging/BiometricLoggerImpl$ExternalLogger;", "getExternalLogger", "()Ldev/skomlach/biometric/compat/utils/logging/BiometricLoggerImpl$ExternalLogger;", "setExternalLogger", "(Ldev/skomlach/biometric/compat/utils/logging/BiometricLoggerImpl$ExternalLogger;)V", "", "getMethod", "()Ljava/lang/String;", "method", "<init>", "()V", "ExternalLogger", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: BiometricLoggerImpl.kt */
public final class BiometricLoggerImpl {
    private static boolean DEBUG;
    public static final BiometricLoggerImpl INSTANCE = new BiometricLoggerImpl();
    private static ExternalLogger externalLogger;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\u0006J1\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/logging/BiometricLoggerImpl$ExternalLogger;", "", "", "msgs", "Lja/u;", "log", "([Ljava/lang/Object;)V", "logError", "", "e", "logException", "(Ljava/lang/Throwable;[Ljava/lang/Object;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: BiometricLoggerImpl.kt */
    public interface ExternalLogger {
        void log(Object... objArr);

        void logError(Object... objArr);

        void logException(Throwable th, Object... objArr);
    }

    private BiometricLoggerImpl() {
    }

    private final String getMethod() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        return className + ":" + methodName + ", " + fileName + ":" + lineNumber;
    }

    /* renamed from: d */
    public final void mo68217d(Object... objArr) {
        C13706o.m87929f(objArr, "msgs");
        List p = C13614t.m87754p(Arrays.copyOf(objArr, objArr.length));
        p.add(0, "BiometricLogging");
        p.add(1, INSTANCE.getMethod());
        ExternalLogger externalLogger2 = externalLogger;
        if (externalLogger2 != null) {
            Object[] array = p.toArray(new Object[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            externalLogger2.log(Arrays.copyOf(array, array.length));
        }
        if (DEBUG) {
            C13614t.m87751m(Arrays.copyOf(objArr, objArr.length)).toString();
        }
    }

    /* renamed from: e */
    public final void mo68220e(Object... objArr) {
        C13706o.m87929f(objArr, "msgs");
        List p = C13614t.m87754p(Arrays.copyOf(objArr, objArr.length));
        p.add(0, "BiometricLogging");
        p.add(1, INSTANCE.getMethod());
        ExternalLogger externalLogger2 = externalLogger;
        if (externalLogger2 != null) {
            Object[] array = p.toArray(new Object[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            externalLogger2.logError(Arrays.copyOf(array, array.length));
        }
        if (DEBUG) {
            Log.e("BiometricLogging", C13614t.m87751m(Arrays.copyOf(objArr, objArr.length)).toString());
        }
    }

    public final boolean getDEBUG() {
        return DEBUG;
    }

    public final ExternalLogger getExternalLogger() {
        return externalLogger;
    }

    public final void setDEBUG(boolean z) {
        DEBUG = z;
    }

    public final void setExternalLogger(ExternalLogger externalLogger2) {
        externalLogger = externalLogger2;
    }

    /* renamed from: e */
    public final void mo68218e(Throwable th) {
        C13706o.m87929f(th, "e");
        mo68219e(th, th.getMessage());
    }

    /* renamed from: e */
    public final void mo68219e(Throwable th, Object... objArr) {
        C13706o.m87929f(objArr, "msgs");
        List p = C13614t.m87754p(Arrays.copyOf(objArr, objArr.length));
        p.add(0, "BiometricLogging");
        p.add(1, INSTANCE.getMethod());
        ExternalLogger externalLogger2 = externalLogger;
        if (externalLogger2 != null) {
            Object[] array = p.toArray(new Object[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            externalLogger2.logException(th, Arrays.copyOf(array, array.length));
        }
        if (DEBUG) {
            Log.e("BiometricLogging", C13614t.m87751m(Arrays.copyOf(objArr, objArr.length)).toString(), th);
        }
    }
}
