package kotlin.text;

import kotlin.Metadata;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¨\u0006\b"}, mo71668d2 = {"", "", "c", "char", "", "radix", "b", "a", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/text/CharsKt")
/* renamed from: kotlin.text.b */
/* compiled from: CharJVM.kt */
class C15145b {
    /* renamed from: a */
    public static int m93519a(int i) {
        if (new C16788e(2, 36).mo79775k(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C16788e(2, 36));
    }

    /* renamed from: b */
    public static final int m93520b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static boolean m93521c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
