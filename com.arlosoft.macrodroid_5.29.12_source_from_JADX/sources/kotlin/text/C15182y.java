package kotlin.text;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\r\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0012\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\n"}, mo71668d2 = {"", "", "V0", "W0", "", "", "n", "T0", "U0", "X0", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.y */
/* compiled from: _Strings.kt */
class C15182y extends C15181x {
    /* renamed from: T0 */
    public static final String m93711T0(String str, int i) {
        C13706o.m87929f(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(C16792h.m99542d(i, str.length()));
            C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: U0 */
    public static String m93712U0(String str, int i) {
        C13706o.m87929f(str, "<this>");
        if (i >= 0) {
            return m93715X0(str, C16792h.m99540b(str.length() - i, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    /* renamed from: V0 */
    public static char m93713V0(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(0);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: W0 */
    public static char m93714W0(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(C15177w.m93676U(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: X0 */
    public static String m93715X0(String str, int i) {
        C13706o.m87929f(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, C16792h.m99542d(i, str.length()));
            C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
