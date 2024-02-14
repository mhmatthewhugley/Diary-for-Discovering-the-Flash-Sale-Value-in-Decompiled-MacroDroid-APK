package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import org.apache.commons.p353io.IOUtils;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000b2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, mo71668d2 = {"", "marginPrefix", "g", "newIndent", "e", "f", "d", "", "c", "(Ljava/lang/String;)I", "indent", "Lkotlin/Function1;", "b", "(Ljava/lang/String;)Lqa/l;", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.o */
/* compiled from: Indent.kt */
class C15167o extends C15166n {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.o$a */
    /* compiled from: Indent.kt */
    static final class C15168a extends C13708q implements C16265l<String, String> {

        /* renamed from: a */
        public static final C15168a f64380a = new C15168a();

        C15168a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C13706o.m87929f(str, "line");
            return str;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo71668d2 = {"", "line", "a", "(Ljava/lang/String;)Ljava/lang/String;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.o$b */
    /* compiled from: Indent.kt */
    static final class C15169b extends C13708q implements C16265l<String, String> {
        final /* synthetic */ String $indent;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15169b(String str) {
            super(1);
            this.$indent = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C13706o.m87929f(str, "line");
            return this.$indent + str;
        }
    }

    /* renamed from: b */
    private static final C16265l<String, String> m93610b(String str) {
        if (str.length() == 0) {
            return C15168a.f64380a;
        }
        return new C15169b(str);
    }

    /* renamed from: c */
    private static final int m93611c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C15145b.m93521c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m93612d(String str, String str2) {
        String invoke;
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "newIndent");
        List<String> i0 = C15177w.m93690i0(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : i0) {
            if (!C15176v.m93643x((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m93611c(c)));
        }
        Integer num = (Integer) C13566b0.m87438m0(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * i0.size());
        C16265l<String, String> b = m93610b(str2);
        int l = C13614t.m87750l(i0);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : i0) {
            int i2 = i + 1;
            if (i < 0) {
                C13614t.m87758t();
            }
            String str3 = (String) next2;
            if ((i == 0 || i == l) && C15176v.m93643x(str3)) {
                str3 = null;
            } else {
                String T0 = C15182y.m93711T0(str3, intValue);
                if (!(T0 == null || (invoke = b.invoke(T0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        String sb = ((StringBuilder) C13566b0.m87430e0(arrayList3, new StringBuilder(length), IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 124, (Object) null)).toString();
        C13706o.m87928e(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: e */
    public static final String m93613e(String str, String str2, String str3) {
        int i;
        String invoke;
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "newIndent");
        C13706o.m87929f(str3, "marginPrefix");
        if (!C15176v.m93643x(str3)) {
            List<String> i0 = C15177w.m93690i0(str);
            int length = str.length() + (str2.length() * i0.size());
            C16265l<String, String> b = m93610b(str2);
            int l = C13614t.m87750l(i0);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T next : i0) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C13614t.m87758t();
                }
                String str4 = (String) next;
                String str5 = null;
                if ((i2 == 0 || i2 == l) && C15176v.m93643x(str4)) {
                    str4 = null;
                } else {
                    int length2 = str4.length();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length2) {
                            i = -1;
                            break;
                        } else if (!C15145b.m93521c(str4.charAt(i4))) {
                            i = i4;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i != -1) {
                        int i5 = i;
                        if (C15176v.m93633H(str4, str3, i, false, 4, (Object) null)) {
                            C13706o.m87927d(str4, "null cannot be cast to non-null type java.lang.String");
                            str5 = str4.substring(i5 + str3.length());
                            C13706o.m87928e(str5, "this as java.lang.String).substring(startIndex)");
                        }
                    }
                    if (!(str5 == null || (invoke = b.invoke(str5)) == null)) {
                        str4 = invoke;
                    }
                }
                if (str4 != null) {
                    arrayList.add(str4);
                }
                i2 = i3;
            }
            String sb = ((StringBuilder) C13566b0.m87430e0(arrayList, new StringBuilder(length), IOUtils.LINE_SEPARATOR_UNIX, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 124, (Object) null)).toString();
            C13706o.m87928e(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: f */
    public static String m93614f(String str) {
        C13706o.m87929f(str, "<this>");
        return m93612d(str, "");
    }

    /* renamed from: g */
    public static final String m93615g(String str, String str2) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "marginPrefix");
        return m93613e(str, "", str2);
    }

    /* renamed from: h */
    public static /* synthetic */ String m93616h(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m93615g(str, str2);
    }
}
