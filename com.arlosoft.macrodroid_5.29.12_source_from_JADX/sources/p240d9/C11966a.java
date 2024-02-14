package p240d9;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J/\u0010\b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\nJ%\u0010\u000b\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, mo71668d2 = {"Ld9/a;", "", "", "msgs", "Lja/u;", "c", "([Ljava/lang/Object;)V", "", "e", "d", "(Ljava/lang/Throwable;[Ljava/lang/Object;)V", "b", "", "a", "()Ljava/lang/String;", "method", "", "DEBUG", "Z", "getDEBUG", "()Z", "f", "(Z)V", "Ld9/a$a;", "externalLogger", "Ld9/a$a;", "getExternalLogger", "()Ld9/a$a;", "g", "(Ld9/a$a;)V", "<init>", "()V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: d9.a */
/* compiled from: LogCat.kt */
public final class C11966a {

    /* renamed from: a */
    public static final C11966a f58161a = new C11966a();

    /* renamed from: b */
    private static boolean f58162b;

    /* renamed from: c */
    private static C11967a f58163c;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J'\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\u0006J1\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002\"\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, mo71668d2 = {"Ld9/a$a;", "", "", "msgs", "Lja/u;", "log", "([Ljava/lang/Object;)V", "logError", "", "e", "logException", "(Ljava/lang/Throwable;[Ljava/lang/Object;)V", "common_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: d9.a$a */
    /* compiled from: LogCat.kt */
    public interface C11967a {
        void log(Object... objArr);

        void logError(Object... objArr);

        void logException(Throwable th, Object... objArr);
    }

    private C11966a() {
    }

    /* renamed from: a */
    private final String m82347a() {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        return className + ":" + methodName + ", " + fileName + ":" + lineNumber;
    }

    /* renamed from: b */
    public final void mo67379b(Object... objArr) {
        C13706o.m87929f(objArr, "msgs");
        List p = C13614t.m87754p(Arrays.copyOf(objArr, objArr.length));
        p.add(0, "LogCat");
        p.add(1, f58161a.m82347a());
        C11967a aVar = f58163c;
        if (aVar != null) {
            Object[] array = p.toArray(new Object[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            aVar.log(Arrays.copyOf(array, array.length));
        }
        if (f58162b) {
            C13614t.m87751m(Arrays.copyOf(objArr, objArr.length)).toString();
        }
    }

    /* renamed from: c */
    public final void mo67380c(Object... objArr) {
        C13706o.m87929f(objArr, "msgs");
        List p = C13614t.m87754p(Arrays.copyOf(objArr, objArr.length));
        p.add(0, "LogCat");
        p.add(1, f58161a.m82347a());
        C11967a aVar = f58163c;
        if (aVar != null) {
            Object[] array = p.toArray(new Object[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            aVar.logError(Arrays.copyOf(array, array.length));
        }
        if (f58162b) {
            Log.e("LogCat", C13614t.m87751m(Arrays.copyOf(objArr, objArr.length)).toString());
        }
    }

    /* renamed from: d */
    public final void mo67381d(Throwable th) {
        C13706o.m87929f(th, "e");
        mo67382e(th, th.getMessage());
    }

    /* renamed from: e */
    public final void mo67382e(Throwable th, Object... objArr) {
        C13706o.m87929f(objArr, "msgs");
        List p = C13614t.m87754p(Arrays.copyOf(objArr, objArr.length));
        p.add(0, "LogCat");
        p.add(1, f58161a.m82347a());
        C11967a aVar = f58163c;
        if (aVar != null) {
            Object[] array = p.toArray(new Object[0]);
            C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            aVar.logException(th, Arrays.copyOf(array, array.length));
        }
        if (f58162b) {
            Log.e("LogCat", C13614t.m87751m(Arrays.copyOf(objArr, objArr.length)).toString(), th);
        }
    }

    /* renamed from: f */
    public final void mo67383f(boolean z) {
        f58162b = z;
    }

    /* renamed from: g */
    public final void mo67384g(C11967a aVar) {
        f58163c = aVar;
    }
}
