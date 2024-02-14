package p189x2;

import kotlin.jvm.internal.C13706o;

/* renamed from: x2.q */
/* compiled from: TaskerVariableHelper.kt */
public final class C10377q {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m40704d(String str) {
        return str.length() > 0 && Character.isDigit(str.charAt(str.length() - 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m40705e(String str) {
        return str.length() > 1 && !Character.isDigit(str.charAt(str.length() + -2)) && str.charAt(str.length() - 1) == '1';
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final String m40706f(String str) {
        int length = str.length();
        while (true) {
            length--;
            if (!Character.isDigit(str.charAt(length))) {
                break;
            }
        }
        if (length < 0) {
            return "";
        }
        String substring = str.substring(0, length + 1);
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
