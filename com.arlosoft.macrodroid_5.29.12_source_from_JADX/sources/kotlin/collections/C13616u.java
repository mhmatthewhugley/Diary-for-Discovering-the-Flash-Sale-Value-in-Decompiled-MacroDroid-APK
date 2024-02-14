package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a \u0010\u0006\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\u0001\u001a\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001¨\u0006\t"}, mo71668d2 = {"T", "", "", "v", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "default", "u", "", "w", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.u */
/* compiled from: Iterables.kt */
class C13616u extends C13614t {
    /* renamed from: u */
    public static <T> int m87774u(Iterable<? extends T> iterable, int i) {
        C13706o.m87929f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: v */
    public static final <T> Integer m87775v(Iterable<? extends T> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    /* renamed from: w */
    public static <T> List<T> m87776w(Iterable<? extends Iterable<? extends T>> iterable) {
        C13706o.m87929f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable z : iterable) {
            boolean unused = C13624y.m87797z(arrayList, z);
        }
        return arrayList;
    }
}
