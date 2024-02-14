package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\u001a\u0018\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0002\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¨\u0006\u0007"}, mo71668d2 = {"T", "", "", "b", "", "source", "a", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.collections.p */
/* compiled from: BrittleContainsOptimization.kt */
public final class C13606p {
    /* renamed from: a */
    public static final <T> Collection<T> m87639a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C13608q.f61890b ? C13566b0.m87400D0(iterable) : C13566b0.m87402F0(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return m87640b(collection) ? C13566b0.m87400D0(iterable) : collection;
    }

    /* renamed from: b */
    private static final <T> boolean m87640b(Collection<? extends T> collection) {
        return C13608q.f61890b && collection.size() > 2 && (collection instanceof ArrayList);
    }
}
