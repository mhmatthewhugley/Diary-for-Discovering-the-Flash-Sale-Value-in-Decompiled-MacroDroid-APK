package kotlin.collections;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¨\u0006\f"}, mo71668d2 = {"T", "", "d", "", "elements", "g", "([Ljava/lang/Object;)Ljava/util/Set;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "e", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "f", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.z0 */
/* compiled from: Sets.kt */
class C13627z0 extends C13625y0 {
    /* renamed from: d */
    public static <T> Set<T> m87806d() {
        return C13581f0.f61873a;
    }

    /* renamed from: e */
    public static <T> LinkedHashSet<T> m87807e(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        return (LinkedHashSet) C13596m.m87603b0(tArr, new LinkedHashSet(C13613s0.m87740e(tArr.length)));
    }

    /* renamed from: f */
    public static final <T> Set<T> m87808f(Set<? extends T> set) {
        C13706o.m87929f(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return m87806d();
        }
        if (size != 1) {
            return set;
        }
        return C13625y0.m87800c(set.iterator().next());
    }

    /* renamed from: g */
    public static <T> Set<T> m87809g(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        return tArr.length > 0 ? C13596m.m87627v0(tArr) : m87806d();
    }
}
