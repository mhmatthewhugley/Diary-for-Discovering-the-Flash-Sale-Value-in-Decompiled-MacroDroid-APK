package p412v7;

import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: v7.b */
/* compiled from: LogSupport */
public class C16720b {

    /* renamed from: a */
    private static boolean f67650a = false;

    /* renamed from: b */
    private static Logger f67651b = Logger.getLogger("javax.activation");

    /* renamed from: c */
    private static final Level f67652c = Level.FINE;

    static {
        try {
            f67650a = Boolean.getBoolean("javax.activation.debug");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m99260a() {
        return f67650a || f67651b.isLoggable(f67652c);
    }

    /* renamed from: b */
    public static void m99261b(String str) {
        if (f67650a) {
            System.out.println(str);
        }
        f67651b.log(f67652c, str);
    }

    /* renamed from: c */
    public static void m99262c(String str, Throwable th) {
        if (f67650a) {
            PrintStream printStream = System.out;
            printStream.println(str + "; Exception: " + th);
        }
        f67651b.log(f67652c, str, th);
    }
}
