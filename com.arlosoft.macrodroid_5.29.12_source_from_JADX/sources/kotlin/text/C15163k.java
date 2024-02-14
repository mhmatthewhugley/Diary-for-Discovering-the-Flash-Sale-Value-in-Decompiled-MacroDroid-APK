package kotlin.text;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\n"}, mo71668d2 = {"Ljava/util/regex/Matcher;", "", "input", "Lkotlin/text/h;", "c", "Ljava/util/regex/MatchResult;", "", "groupIndex", "Lwa/e;", "d", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.text.k */
/* compiled from: Regex.kt */
public final class C15163k {
    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C15152h m93553c(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C15155i(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C16788e m93554d(MatchResult matchResult, int i) {
        return C16792h.m99549k(matchResult.start(i), matchResult.end(i));
    }
}
