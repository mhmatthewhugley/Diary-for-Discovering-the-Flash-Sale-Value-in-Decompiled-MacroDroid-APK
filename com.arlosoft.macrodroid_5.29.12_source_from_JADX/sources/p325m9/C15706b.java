package p325m9;

import android.util.Log;
import androidx.annotation.Nullable;
import com.android.p023dx.p024cf.attrib.AttSourceFile;

/* renamed from: m9.b */
/* compiled from: Log */
public class C15706b {

    /* renamed from: a */
    private static int f65010a = 10;

    /* renamed from: b */
    private static boolean f65011b;

    /* renamed from: c */
    private static boolean f65012c;

    /* renamed from: d */
    public static String f65013d;

    /* renamed from: a */
    private static String m94973a(String str) {
        if (!f65011b) {
            return str;
        }
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[3];
        if (f65012c) {
            return String.format("[%s:%s] %s", new Object[]{stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()), str});
        }
        return String.format("[%s] %s", new Object[]{stackTraceElement.getMethodName(), str});
    }

    /* renamed from: b */
    static String m94974b(String str, Object... objArr) {
        if (objArr == null || objArr.length != 0) {
            str = String.format(str, objArr);
        }
        return m94973a(str);
    }

    /* renamed from: c */
    private static String m94975c() {
        String str = f65013d;
        if (str != null) {
            return str;
        }
        String fileName = new Throwable().getStackTrace()[2].getFileName();
        if (fileName == null) {
            return AttSourceFile.ATTRIBUTE_NAME;
        }
        return fileName.split("[.]")[0];
    }

    /* renamed from: d */
    public static boolean m94976d() {
        return f65010a <= 3;
    }

    /* renamed from: e */
    public static boolean m94977e() {
        return f65010a <= 6;
    }

    /* renamed from: f */
    public static boolean m94978f() {
        return f65010a <= 4;
    }

    /* renamed from: g */
    public static boolean m94979g() {
        return f65010a <= 2;
    }

    /* renamed from: h */
    public static boolean m94980h() {
        return f65010a <= 5;
    }

    /* renamed from: i */
    public static void m94981i(@Nullable String str) {
        f65013d = str;
    }

    /* renamed from: j */
    public static void m94982j(String str, Object... objArr) {
        if (m94979g()) {
            m94975c();
            m94974b(str, objArr);
        }
    }

    /* renamed from: k */
    public static void m94983k(String str, Object... objArr) {
        if (m94980h()) {
            Log.w(m94975c(), m94974b(str, objArr));
        }
    }

    /* renamed from: l */
    public static void m94984l(Throwable th, String str, Object... objArr) {
        if (m94977e()) {
            Log.wtf(m94975c(), m94974b(str, objArr), th);
        }
    }
}
