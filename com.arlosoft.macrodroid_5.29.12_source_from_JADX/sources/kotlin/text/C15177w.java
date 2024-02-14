package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.sequences.C15118h;
import org.apache.commons.p353io.IOUtils;
import p297ja.C13328m;
import p297ja.C13337s;
import p370qa.C16265l;
import p370qa.C16269p;
import p424wa.C16785c;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\u001a\u0016\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0005\u001a\u001c\u0010\n\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\r\u001a\u00020\f\u001a\u001c\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0000\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0000\u001a\u001c\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u0000\u001a\u001c\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u0000\u001a\u001c\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0000\u001a\u0012\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0005\u001a\u0012\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0005\u001a4\u0010 \u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0000\u001a\u001c\u0010\"\u001a\u00020\u001e*\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a\u001c\u0010#\u001a\u00020\u001e*\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a\u001c\u0010$\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a\u001c\u0010%\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a&\u0010'\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a&\u0010(\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a=\u0010+\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010,\u001aG\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0018\u00010/*\u00020\u00052\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000-2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001eH\u0002¢\u0006\u0004\b0\u00101\u001a&\u00102\u001a\u00020\u0007*\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a&\u00104\u001a\u00020\u0007*\u00020\u00052\u0006\u00103\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a&\u00105\u001a\u00020\u0007*\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a&\u00106\u001a\u00020\u0007*\u00020\u00052\u0006\u00103\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u001a\u001f\u00107\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002\u001a\u001f\u00108\u001a\u00020\u001e*\u00020\u00052\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002\u001a?\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0;*\u00020\u00052\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010=\u001aG\u0010?\u001a\b\u0012\u0004\u0012\u00020\f0;*\u00020\u00052\u000e\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000>2\b\b\u0002\u0010&\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010@\u001a\u0010\u0010B\u001a\u00020A2\u0006\u0010:\u001a\u00020\u0007H\u0000\u001a?\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00000;*\u00020\u00052\u0012\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000>\"\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010:\u001a\u00020\u0007¢\u0006\u0004\bC\u0010D\u001a?\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000E*\u00020\u00052\u0012\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000>\"\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010:\u001a\u00020\u0007¢\u0006\u0004\bF\u0010G\u001a0\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00000E*\u00020\u00052\n\u00109\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010:\u001a\u00020\u0007\u001a1\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00000E*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\bI\u0010J\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000;*\u00020\u0005\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00000E*\u00020\u0005\"\u0015\u0010O\u001a\u00020\f*\u00020\u00058F¢\u0006\u0006\u001a\u0004\bM\u0010N\"\u0015\u0010R\u001a\u00020\u0007*\u00020\u00058F¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, mo71668d2 = {"", "", "", "chars", "S0", "", "R0", "", "length", "padChar", "j0", "k0", "Lwa/e;", "range", "E0", "delimiter", "missingDelimiterValue", "L0", "M0", "F0", "G0", "P0", "J0", "prefix", "q0", "suffix", "r0", "thisOffset", "other", "otherOffset", "", "ignoreCase", "p0", "char", "A0", "O", "B0", "P", "startIndex", "b0", "g0", "endIndex", "last", "X", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lja/m;", "S", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lja/m;", "V", "string", "W", "c0", "d0", "L", "K", "delimiters", "limit", "Lkotlin/sequences/h;", "l0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/h;", "", "m0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/h;", "Lja/u;", "s0", "y0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/h;", "", "u0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "t0", "v0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "h0", "i0", "T", "(Ljava/lang/CharSequence;)Lwa/e;", "indices", "U", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.text.w */
/* compiled from: Strings.kt */
class C15177w extends C15176v {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "", "currentIndex", "Lja/m;", "a", "(Ljava/lang/CharSequence;I)Lja/m;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.w$a */
    /* compiled from: Strings.kt */
    static final class C15178a extends C13708q implements C16269p<CharSequence, Integer, C13328m<? extends Integer, ? extends Integer>> {
        final /* synthetic */ char[] $delimiters;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15178a(char[] cArr, boolean z) {
            super(2);
            this.$delimiters = cArr;
            this.$ignoreCase = z;
        }

        /* renamed from: a */
        public final C13328m<Integer, Integer> mo74474a(CharSequence charSequence, int i) {
            C13706o.m87929f(charSequence, "$this$$receiver");
            int b0 = C15177w.m93683b0(charSequence, this.$delimiters, i, this.$ignoreCase);
            if (b0 < 0) {
                return null;
            }
            return C13337s.m85692a(Integer.valueOf(b0), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo74474a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo71668d2 = {"", "", "currentIndex", "Lja/m;", "a", "(Ljava/lang/CharSequence;I)Lja/m;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.w$b */
    /* compiled from: Strings.kt */
    static final class C15179b extends C13708q implements C16269p<CharSequence, Integer, C13328m<? extends Integer, ? extends Integer>> {
        final /* synthetic */ List<String> $delimitersList;
        final /* synthetic */ boolean $ignoreCase;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15179b(List<String> list, boolean z) {
            super(2);
            this.$delimitersList = list;
            this.$ignoreCase = z;
        }

        /* renamed from: a */
        public final C13328m<Integer, Integer> mo74475a(CharSequence charSequence, int i) {
            C13706o.m87929f(charSequence, "$this$$receiver");
            C13328m J = C15177w.m93673S(charSequence, this.$delimitersList, i, this.$ignoreCase, false);
            if (J != null) {
                return C13337s.m85692a(J.mo70154c(), Integer.valueOf(((String) J.mo70155d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo74475a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Lwa/e;", "it", "", "a", "(Lwa/e;)Ljava/lang/String;"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.text.w$c */
    /* compiled from: Strings.kt */
    static final class C15180c extends C13708q implements C16265l<C16788e, String> {
        final /* synthetic */ CharSequence $this_splitToSequence;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C15180c(CharSequence charSequence) {
            super(1);
            this.$this_splitToSequence = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C16788e eVar) {
            C13706o.m87929f(eVar, "it");
            return C15177w.m93650E0(this.$this_splitToSequence, eVar);
        }
    }

    /* renamed from: A0 */
    public static final boolean m93646A0(CharSequence charSequence, char c, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        return charSequence.length() > 0 && C15146c.m93522d(charSequence.charAt(0), c, z);
    }

    /* renamed from: B0 */
    public static final boolean m93647B0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C15176v.m93634I((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m93697p0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: C0 */
    public static /* synthetic */ boolean m93648C0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93646A0(charSequence, c, z);
    }

    /* renamed from: D0 */
    public static /* synthetic */ boolean m93649D0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93647B0(charSequence, charSequence2, z);
    }

    /* renamed from: E0 */
    public static final String m93650E0(CharSequence charSequence, C16788e eVar) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(eVar, "range");
        return charSequence.subSequence(eVar.getStart().intValue(), eVar.getEndInclusive().intValue() + 1).toString();
    }

    /* renamed from: F0 */
    public static final String m93651F0(String str, char c, String str2) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "missingDelimiterValue");
        int Z = m93681Z(str, c, 0, false, 6, (Object) null);
        if (Z == -1) {
            return str2;
        }
        String substring = str.substring(Z + 1, str.length());
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: G0 */
    public static String m93652G0(String str, String str2, String str3) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "delimiter");
        C13706o.m87929f(str3, "missingDelimiterValue");
        int a0 = m93682a0(str, str2, 0, false, 6, (Object) null);
        if (a0 == -1) {
            return str3;
        }
        String substring = str.substring(a0 + str2.length(), str.length());
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: H0 */
    public static /* synthetic */ String m93653H0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m93651F0(str, c, str2);
    }

    /* renamed from: I0 */
    public static /* synthetic */ String m93654I0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m93652G0(str, str2, str3);
    }

    /* renamed from: J0 */
    public static final String m93656J0(String str, char c, String str2) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "missingDelimiterValue");
        int e0 = m93686e0(str, c, 0, false, 6, (Object) null);
        if (e0 == -1) {
            return str2;
        }
        String substring = str.substring(e0 + 1, str.length());
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: K */
    public static final boolean m93657K(CharSequence charSequence, char c, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        return m93681Z(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: K0 */
    public static /* synthetic */ String m93658K0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m93656J0(str, c, str2);
    }

    /* renamed from: L */
    public static boolean m93659L(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m93682a0(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m93680Y(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L0 */
    public static final String m93660L0(String str, char c, String str2) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "missingDelimiterValue");
        int Z = m93681Z(str, c, 0, false, 6, (Object) null);
        if (Z == -1) {
            return str2;
        }
        String substring = str.substring(0, Z);
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: M */
    public static /* synthetic */ boolean m93661M(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93657K(charSequence, c, z);
    }

    /* renamed from: M0 */
    public static final String m93662M0(String str, String str2, String str3) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "delimiter");
        C13706o.m87929f(str3, "missingDelimiterValue");
        int a0 = m93682a0(str, str2, 0, false, 6, (Object) null);
        if (a0 == -1) {
            return str3;
        }
        String substring = str.substring(0, a0);
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: N */
    public static /* synthetic */ boolean m93663N(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93659L(charSequence, charSequence2, z);
    }

    /* renamed from: N0 */
    public static /* synthetic */ String m93664N0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m93660L0(str, c, str2);
    }

    /* renamed from: O */
    public static final boolean m93665O(CharSequence charSequence, char c, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        return charSequence.length() > 0 && C15146c.m93522d(charSequence.charAt(m93676U(charSequence)), c, z);
    }

    /* renamed from: O0 */
    public static /* synthetic */ String m93666O0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m93662M0(str, str2, str3);
    }

    /* renamed from: P */
    public static final boolean m93667P(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C15176v.m93640u((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m93697p0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: P0 */
    public static String m93668P0(String str, String str2, String str3) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(str2, "delimiter");
        C13706o.m87929f(str3, "missingDelimiterValue");
        int f0 = m93687f0(str, str2, 0, false, 6, (Object) null);
        if (f0 == -1) {
            return str3;
        }
        String substring = str.substring(0, f0);
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: Q */
    public static /* synthetic */ boolean m93669Q(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93665O(charSequence, c, z);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ String m93670Q0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m93668P0(str, str2, str3);
    }

    /* renamed from: R */
    public static /* synthetic */ boolean m93671R(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m93667P(charSequence, charSequence2, z);
    }

    /* renamed from: R0 */
    public static CharSequence m93672R0(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C15145b.m93521c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public static final C13328m<Integer, String> m93673S(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        T t;
        T t2;
        if (z || collection.size() != 1) {
            C16785c eVar = !z2 ? new C16788e(C16792h.m99540b(i, 0), charSequence.length()) : C16792h.m99547i(C16792h.m99542d(i, m93676U(charSequence)), 0);
            if (charSequence instanceof String) {
                int d = eVar.mo79764d();
                int f = eVar.mo79766f();
                int h = eVar.mo79767h();
                if ((h > 0 && d <= f) || (h < 0 && f <= d)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str = (String) t2;
                            if (C15176v.m93644y(str, 0, (String) charSequence, d, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) t2;
                        if (str2 == null) {
                            if (d == f) {
                                break;
                            }
                            d += h;
                        } else {
                            return C13337s.m85692a(Integer.valueOf(d), str2);
                        }
                    }
                }
            } else {
                int d2 = eVar.mo79764d();
                int f2 = eVar.mo79766f();
                int h2 = eVar.mo79767h();
                if ((h2 > 0 && d2 <= f2) || (h2 < 0 && f2 <= d2)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            String str3 = (String) t;
                            if (m93697p0(str3, 0, charSequence, d2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) t;
                        if (str4 == null) {
                            if (d2 == f2) {
                                break;
                            }
                            d2 += h2;
                        } else {
                            return C13337s.m85692a(Integer.valueOf(d2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C13566b0.m87445t0(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int a0 = !z2 ? m93682a0(charSequence2, str6, i2, false, 4, (Object) null) : m93687f0(charSequence2, str6, i2, false, 4, (Object) null);
        if (a0 < 0) {
            return null;
        }
        return C13337s.m85692a(Integer.valueOf(a0), str5);
    }

    /* renamed from: S0 */
    public static String m93674S0(String str, char... cArr) {
        Object obj;
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!C13596m.m87624u(cArr, str.charAt(i))) {
                obj = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    /* renamed from: T */
    public static C16788e m93675T(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        return new C16788e(0, charSequence.length() - 1);
    }

    /* renamed from: U */
    public static int m93676U(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: V */
    public static final int m93677V(CharSequence charSequence, char c, int i, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m93683b0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: W */
    public static final int m93678W(CharSequence charSequence, String str, int i, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m93680Y(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: X */
    private static final int m93679X(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C16785c cVar;
        if (!z2) {
            cVar = new C16788e(C16792h.m99540b(i, 0), C16792h.m99542d(i2, charSequence.length()));
        } else {
            cVar = C16792h.m99547i(C16792h.m99542d(i, m93676U(charSequence)), C16792h.m99540b(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int d = cVar.mo79764d();
            int f = cVar.mo79766f();
            int h = cVar.mo79767h();
            if ((h <= 0 || d > f) && (h >= 0 || f > d)) {
                return -1;
            }
            while (true) {
                if (m93697p0(charSequence2, 0, charSequence, d, charSequence2.length(), z)) {
                    return d;
                }
                if (d == f) {
                    return -1;
                }
                d += h;
            }
        } else {
            int d2 = cVar.mo79764d();
            int f2 = cVar.mo79766f();
            int h2 = cVar.mo79767h();
            if ((h2 <= 0 || d2 > f2) && (h2 >= 0 || f2 > d2)) {
                return -1;
            }
            while (true) {
                if (C15176v.m93644y((String) charSequence2, 0, (String) charSequence, d2, charSequence2.length(), z)) {
                    return d2;
                }
                if (d2 == f2) {
                    return -1;
                }
                d2 += h2;
            }
        }
    }

    /* renamed from: Y */
    static /* synthetic */ int m93680Y(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m93679X(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: Z */
    public static /* synthetic */ int m93681Z(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93677V(charSequence, c, i, z);
    }

    /* renamed from: a0 */
    public static /* synthetic */ int m93682a0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93678W(charSequence, str, i, z);
    }

    /* renamed from: b0 */
    public static final int m93683b0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C13603n0 i2 = new C16788e(C16792h.m99540b(i, 0), m93676U(charSequence)).iterator();
            while (i2.hasNext()) {
                int nextInt = i2.nextInt();
                char charAt = charSequence.charAt(nextInt);
                int length = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C15146c.m93522d(cArr[i3], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return nextInt;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C13596m.m87596U(cArr), i);
    }

    /* renamed from: c0 */
    public static final int m93684c0(CharSequence charSequence, char c, int i, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m93688g0(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: d0 */
    public static final int m93685d0(CharSequence charSequence, String str, int i, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(str, TypedValues.Custom.S_STRING);
        if (z || !(charSequence instanceof String)) {
            return m93679X(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: e0 */
    public static /* synthetic */ int m93686e0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m93676U(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93684c0(charSequence, c, i, z);
    }

    /* renamed from: f0 */
    public static /* synthetic */ int m93687f0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m93676U(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m93685d0(charSequence, str, i, z);
    }

    /* renamed from: g0 */
    public static final int m93688g0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int d = C16792h.m99542d(i, m93676U(charSequence)); -1 < d; d--) {
                char charAt = charSequence.charAt(d);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C15146c.m93522d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return d;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C13596m.m87596U(cArr), i);
    }

    /* renamed from: h0 */
    public static final C15118h<String> m93689h0(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        return m93707z0(charSequence, new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: i0 */
    public static final List<String> m93690i0(CharSequence charSequence) {
        C13706o.m87929f(charSequence, "<this>");
        return C15132p.m93480D(m93689h0(charSequence));
    }

    /* renamed from: j0 */
    public static final CharSequence m93691j0(CharSequence charSequence, int i, char c) {
        C13706o.m87929f(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            C13603n0 i2 = new C16788e(1, i - charSequence.length()).iterator();
            while (i2.hasNext()) {
                i2.nextInt();
                sb.append(c);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    /* renamed from: k0 */
    public static String m93692k0(String str, int i, char c) {
        C13706o.m87929f(str, "<this>");
        return m93691j0(str, i, c).toString();
    }

    /* renamed from: l0 */
    private static final C15118h<C16788e> m93693l0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m93700s0(i2);
        return new C15148e(charSequence, i, i2, new C15178a(cArr, z));
    }

    /* renamed from: m0 */
    private static final C15118h<C16788e> m93694m0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m93700s0(i2);
        return new C15148e(charSequence, i, i2, new C15179b(C13593l.m87557d(strArr), z));
    }

    /* renamed from: n0 */
    static /* synthetic */ C15118h m93695n0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m93693l0(charSequence, cArr, i, z, i2);
    }

    /* renamed from: o0 */
    static /* synthetic */ C15118h m93696o0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m93694m0(charSequence, strArr, i, z, i2);
    }

    /* renamed from: p0 */
    public static final boolean m93697p0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C15146c.m93522d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q0 */
    public static String m93698q0(String str, CharSequence charSequence) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(charSequence, "prefix");
        if (!m93649D0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C13706o.m87928e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: r0 */
    public static String m93699r0(String str, CharSequence charSequence) {
        C13706o.m87929f(str, "<this>");
        C13706o.m87929f(charSequence, "suffix");
        if (!m93671R(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C13706o.m87928e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: s0 */
    public static final void m93700s0(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: t0 */
    public static final List<String> m93701t0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(cArr, "delimiters");
        if (cArr.length == 1) {
            return m93703v0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C16788e> k = C15132p.m93482k(m93695n0(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C13616u.m87774u(k, 10));
        for (C16788e E0 : k) {
            arrayList.add(m93650E0(charSequence, E0));
        }
        return arrayList;
    }

    /* renamed from: u0 */
    public static final List<String> m93702u0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m93703v0(charSequence, str, z, i);
            }
        }
        Iterable<C16788e> k = C15132p.m93482k(m93696o0(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C13616u.m87774u(k, 10));
        for (C16788e E0 : k) {
            arrayList.add(m93650E0(charSequence, E0));
        }
        return arrayList;
    }

    /* renamed from: v0 */
    private static final List<String> m93703v0(CharSequence charSequence, String str, boolean z, int i) {
        m93700s0(i);
        int i2 = 0;
        int W = m93678W(charSequence, str, 0, z);
        if (W == -1 || i == 1) {
            return C13612s.m87736e(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = C16792h.m99542d(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, W).toString());
            i2 = str.length() + W;
            if ((z2 && arrayList.size() == i - 1) || (W = m93678W(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, W).toString());
            i2 = str.length() + W;
            break;
        } while ((W = m93678W(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: w0 */
    public static /* synthetic */ List m93704w0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m93701t0(charSequence, cArr, z, i);
    }

    /* renamed from: x0 */
    public static /* synthetic */ List m93705x0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m93702u0(charSequence, strArr, z, i);
    }

    /* renamed from: y0 */
    public static final C15118h<String> m93706y0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C13706o.m87929f(charSequence, "<this>");
        C13706o.m87929f(strArr, "delimiters");
        return C15132p.m93494w(m93696o0(charSequence, strArr, 0, z, i, 2, (Object) null), new C15180c(charSequence));
    }

    /* renamed from: z0 */
    public static /* synthetic */ C15118h m93707z0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m93706y0(charSequence, strArr, z, i);
    }
}
