package p349ob;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C13592k0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;
import p327mb.C15719c;
import p336nb.C15766a;
import p370qa.C16265l;

/* renamed from: ob.g */
/* compiled from: JvmNameResolverBase.kt */
public class C15837g implements C15719c {

    /* renamed from: d */
    public static final C15838a f65283d = new C15838a((C13695i) null);

    /* renamed from: e */
    private static final String f65284e;

    /* renamed from: f */
    private static final List<String> f65285f;

    /* renamed from: g */
    private static final Map<String, Integer> f65286g;

    /* renamed from: a */
    private final String[] f65287a;

    /* renamed from: b */
    private final Set<Integer> f65288b;

    /* renamed from: c */
    private final List<C15766a.C15777e.C15780c> f65289c;

    /* renamed from: ob.g$a */
    /* compiled from: JvmNameResolverBase.kt */
    public static final class C15838a {
        private C15838a() {
        }

        public /* synthetic */ C15838a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: ob.g$b */
    /* compiled from: JvmNameResolverBase.kt */
    public /* synthetic */ class C15839b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65290a;

        static {
            int[] iArr = new int[C15766a.C15777e.C15780c.C15783c.values().length];
            iArr[C15766a.C15777e.C15780c.C15783c.f65157a.ordinal()] = 1;
            iArr[C15766a.C15777e.C15780c.C15783c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            iArr[C15766a.C15777e.C15780c.C15783c.DESC_TO_CLASS_ID.ordinal()] = 3;
            f65290a = iArr;
        }
    }

    static {
        String g0 = C13566b0.m87432g0(C13614t.m87751m('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
        f65284e = g0;
        List<String> m = C13614t.m87751m(g0 + "/Any", g0 + "/Nothing", g0 + "/Unit", g0 + "/Throwable", g0 + "/Number", g0 + "/Byte", g0 + "/Double", g0 + "/Float", g0 + "/Int", g0 + "/Long", g0 + "/Short", g0 + "/Boolean", g0 + "/Char", g0 + "/CharSequence", g0 + "/String", g0 + "/Comparable", g0 + "/Enum", g0 + "/Array", g0 + "/ByteArray", g0 + "/DoubleArray", g0 + "/FloatArray", g0 + "/IntArray", g0 + "/LongArray", g0 + "/ShortArray", g0 + "/BooleanArray", g0 + "/CharArray", g0 + "/Cloneable", g0 + "/Annotation", g0 + "/collections/Iterable", g0 + "/collections/MutableIterable", g0 + "/collections/Collection", g0 + "/collections/MutableCollection", g0 + "/collections/List", g0 + "/collections/MutableList", g0 + "/collections/Set", g0 + "/collections/MutableSet", g0 + "/collections/Map", g0 + "/collections/MutableMap", g0 + "/collections/Map.Entry", g0 + "/collections/MutableMap.MutableEntry", g0 + "/collections/Iterator", g0 + "/collections/MutableIterator", g0 + "/collections/ListIterator", g0 + "/collections/MutableListIterator");
        f65285f = m;
        Iterable<C13592k0> M0 = C13566b0.m87411M0(m);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C16792h.m99540b(C13613s0.m87740e(C13616u.m87774u(M0, 10)), 16));
        for (C13592k0 k0Var : M0) {
            linkedHashMap.put((String) k0Var.mo71845d(), Integer.valueOf(k0Var.mo71844c()));
        }
        f65286g = linkedHashMap;
    }

    public C15837g(String[] strArr, Set<Integer> set, List<C15766a.C15777e.C15780c> list) {
        C13706o.m87929f(strArr, "strings");
        C13706o.m87929f(set, "localNameIndices");
        C13706o.m87929f(list, "records");
        this.f65287a = strArr;
        this.f65288b = set;
        this.f65289c = list;
    }

    /* renamed from: a */
    public boolean mo75163a(int i) {
        return this.f65288b.contains(Integer.valueOf(i));
    }

    /* renamed from: b */
    public String mo75164b(int i) {
        return getString(i);
    }

    public String getString(int i) {
        String str;
        int i2 = i;
        C15766a.C15777e.C15780c cVar = this.f65289c.get(i2);
        if (cVar.mo75488T()) {
            str = cVar.mo75481L();
        } else {
            if (cVar.mo75486Q()) {
                List<String> list = f65285f;
                int size = list.size();
                int G = cVar.mo75477G();
                if (G >= 0 && G < size) {
                    str = list.get(cVar.mo75477G());
                }
            }
            str = this.f65287a[i2];
        }
        if (cVar.mo75483N() >= 2) {
            List<Integer> O = cVar.mo75484O();
            C13706o.m87928e(O, "substringIndexList");
            Integer num = O.get(0);
            Integer num2 = O.get(1);
            C13706o.m87928e(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                C13706o.m87928e(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    C13706o.m87928e(str, TypedValues.Custom.S_STRING);
                    str = str.substring(num.intValue(), num2.intValue());
                    C13706o.m87928e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (cVar.mo75479I() >= 2) {
            List<Integer> J = cVar.mo75480J();
            C13706o.m87928e(J, "replaceCharList");
            C13706o.m87928e(str2, TypedValues.Custom.S_STRING);
            str2 = C15176v.m93629D(str2, (char) J.get(0).intValue(), (char) J.get(1).intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        C15766a.C15777e.C15780c.C15783c F = cVar.mo75476F();
        if (F == null) {
            F = C15766a.C15777e.C15780c.C15783c.f65157a;
        }
        int i3 = C15839b.f65290a[F.ordinal()];
        if (i3 == 2) {
            C13706o.m87928e(str3, TypedValues.Custom.S_STRING);
            str3 = C15176v.m93629D(str3, '$', FilenameUtils.EXTENSION_SEPARATOR, false, 4, (Object) null);
        } else if (i3 == 3) {
            if (str3.length() >= 2) {
                C13706o.m87928e(str3, TypedValues.Custom.S_STRING);
                str3 = str3.substring(1, str3.length() - 1);
                C13706o.m87928e(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String str4 = str3;
            C13706o.m87928e(str4, TypedValues.Custom.S_STRING);
            str3 = C15176v.m93629D(str4, '$', FilenameUtils.EXTENSION_SEPARATOR, false, 4, (Object) null);
        }
        C13706o.m87928e(str3, TypedValues.Custom.S_STRING);
        return str3;
    }
}
