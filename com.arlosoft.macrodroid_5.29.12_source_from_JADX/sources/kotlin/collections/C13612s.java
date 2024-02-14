package kotlin.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p307ka.C13425b;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\t\u001a\u00020\bH\u0001\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001\u001a3\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, mo71668d2 = {"T", "element", "", "e", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "c", "", "capacity", "d", "builder", "a", "", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.s */
/* compiled from: CollectionsJVM.kt */
class C13612s {
    /* renamed from: a */
    public static <E> List<E> m87732a(List<E> list) {
        C13706o.m87929f(list, "builder");
        return ((C13425b) list).mo70893l();
    }

    /* renamed from: b */
    public static final <T> Object[] m87733b(T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        C13706o.m87929f(tArr, "<this>");
        if (z && C13706o.m87924a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C13706o.m87928e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    /* renamed from: c */
    public static <E> List<E> m87734c() {
        return new C13425b();
    }

    /* renamed from: d */
    public static <E> List<E> m87735d(int i) {
        return new C13425b(i);
    }

    /* renamed from: e */
    public static <T> List<T> m87736e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C13706o.m87928e(singletonList, "singletonList(element)");
        return singletonList;
    }
}
