package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\b¨\u0006\u0002"}, mo71668d2 = {"htmlEncode", "", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: String.kt */
public final class StringKt {
    public static final String htmlEncode(String str) {
        C13706o.m87929f(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        C13706o.m87928e(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
