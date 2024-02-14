package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;
import p370qa.C16265l;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000.\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a/\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a&\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a;\u0010\u000e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a*\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b\u001a;\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, mo71668d2 = {"T", "", "", "elements", "", "z", "", "A", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "E", "", "Lkotlin/Function1;", "predicate", "predicateResultToRemove", "B", "(Ljava/lang/Iterable;Lqa/l;Z)Z", "", "D", "C", "(Ljava/util/List;Lqa/l;Z)Z", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.y */
/* compiled from: MutableCollections.kt */
class C13624y extends C13622x {
    /* renamed from: A */
    public static <T> boolean m87792A(Collection<? super T> collection, T[] tArr) {
        C13706o.m87929f(collection, "<this>");
        C13706o.m87929f(tArr, "elements");
        return collection.addAll(C13593l.m87557d(tArr));
    }

    /* renamed from: B */
    private static final <T> boolean m87793B(Iterable<? extends T> iterable, C16265l<? super T, Boolean> lVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: C */
    private static final <T> boolean m87794C(List<T> list, C16265l<? super T, Boolean> lVar, boolean z) {
        if (!(list instanceof RandomAccess)) {
            C13706o.m87927d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m87793B(C13698j0.m87902b(list), lVar, z);
        }
        C13603n0 i = new C16788e(0, C13614t.m87750l(list)).iterator();
        int i2 = 0;
        while (i.hasNext()) {
            int nextInt = i.nextInt();
            T t = list.get(nextInt);
            if (lVar.invoke(t).booleanValue() != z) {
                if (i2 != nextInt) {
                    list.set(i2, t);
                }
                i2++;
            }
        }
        if (i2 >= list.size()) {
            return false;
        }
        int l = C13614t.m87750l(list);
        if (i2 > l) {
            return true;
        }
        while (true) {
            list.remove(l);
            if (l == i2) {
                return true;
            }
            l--;
        }
    }

    /* renamed from: D */
    public static <T> boolean m87795D(List<T> list, C16265l<? super T, Boolean> lVar) {
        C13706o.m87929f(list, "<this>");
        C13706o.m87929f(lVar, "predicate");
        return m87794C(list, lVar, true);
    }

    /* renamed from: E */
    public static final <T> boolean m87796E(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C13706o.m87929f(collection, "<this>");
        C13706o.m87929f(iterable, "elements");
        return C13698j0.m87901a(collection).retainAll(C13606p.m87639a(iterable, collection));
    }

    /* renamed from: z */
    public static <T> boolean m87797z(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C13706o.m87929f(collection, "<this>");
        C13706o.m87929f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
