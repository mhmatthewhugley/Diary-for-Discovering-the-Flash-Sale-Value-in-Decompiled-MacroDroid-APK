package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a7\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\t\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000\u001aG\u0010\u001a\u001a\u00020\u0017\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\b\u0010 \u001a\u00020\u001dH\u0001\u001a\b\u0010!\u001a\u00020\u001dH\u0001\"\u0019\u0010%\u001a\u00020\"*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"!\u0010(\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, mo71668d2 = {"T", "", "", "g", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "j", "elements", "m", "([Ljava/lang/Object;)Ljava/util/List;", "", "p", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "n", "(Ljava/lang/Object;)Ljava/util/List;", "o", "q", "", "", "fromIndex", "toIndex", "h", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "size", "Lja/u;", "r", "(III)V", "t", "s", "Lwa/e;", "k", "(Ljava/util/Collection;)Lwa/e;", "indices", "l", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.t */
/* compiled from: Collections.kt */
class C13614t extends C13612s {
    /* renamed from: f */
    public static <T> ArrayList<T> m87744f(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C13582g(tArr, true));
    }

    /* renamed from: g */
    public static final <T> Collection<T> m87745g(T[] tArr) {
        C13706o.m87929f(tArr, "<this>");
        return new C13582g(tArr, false);
    }

    /* renamed from: h */
    public static final <T extends Comparable<? super T>> int m87746h(List<? extends T> list, T t, int i, int i2) {
        C13706o.m87929f(list, "<this>");
        m87756r(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C15612b.m94865a((Comparable) list.get(i4), t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: i */
    public static /* synthetic */ int m87747i(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m87746h(list, comparable, i, i2);
    }

    /* renamed from: j */
    public static <T> List<T> m87748j() {
        return C13577d0.f61871a;
    }

    /* renamed from: k */
    public static C16788e m87749k(Collection<?> collection) {
        C13706o.m87929f(collection, "<this>");
        return new C16788e(0, collection.size() - 1);
    }

    /* renamed from: l */
    public static <T> int m87750l(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: m */
    public static <T> List<T> m87751m(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        return tArr.length > 0 ? C13593l.m87557d(tArr) : m87748j();
    }

    /* renamed from: n */
    public static <T> List<T> m87752n(T t) {
        return t != null ? C13612s.m87736e(t) : m87748j();
    }

    /* renamed from: o */
    public static <T> List<T> m87753o(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        return C13596m.m87634z(tArr);
    }

    /* renamed from: p */
    public static <T> List<T> m87754p(T... tArr) {
        C13706o.m87929f(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C13582g(tArr, true));
    }

    /* renamed from: q */
    public static <T> List<T> m87755q(List<? extends T> list) {
        C13706o.m87929f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return m87748j();
        }
        if (size != 1) {
            return list;
        }
        return C13612s.m87736e(list.get(0));
    }

    /* renamed from: r */
    private static final void m87756r(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    /* renamed from: s */
    public static void m87757s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: t */
    public static void m87758t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
