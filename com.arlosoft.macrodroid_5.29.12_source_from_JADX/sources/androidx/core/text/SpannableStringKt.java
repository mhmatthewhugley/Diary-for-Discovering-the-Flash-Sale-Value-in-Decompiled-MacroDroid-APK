package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0001H\b\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\n\u001a\u001d\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\n¨\u0006\r"}, mo71668d2 = {"", "Landroid/text/Spannable;", "toSpannable", "Lja/u;", "clearSpans", "", "start", "end", "", "span", "set", "Lwa/e;", "range", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: SpannableString.kt */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        C13706o.m87929f(spannable, "<this>");
        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
        C13706o.m87928e(spans, "getSpans(start, end, T::class.java)");
        for (Object removeSpan : spans) {
            spannable.removeSpan(removeSpan);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        C13706o.m87929f(spannable, "<this>");
        C13706o.m87929f(obj, "span");
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        SpannableString valueOf = SpannableString.valueOf(charSequence);
        C13706o.m87928e(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final void set(Spannable spannable, C16788e eVar, Object obj) {
        C13706o.m87929f(spannable, "<this>");
        C13706o.m87929f(eVar, "range");
        C13706o.m87929f(obj, "span");
        spannable.setSpan(obj, eVar.getStart().intValue(), eVar.getEndInclusive().intValue(), 17);
    }
}
