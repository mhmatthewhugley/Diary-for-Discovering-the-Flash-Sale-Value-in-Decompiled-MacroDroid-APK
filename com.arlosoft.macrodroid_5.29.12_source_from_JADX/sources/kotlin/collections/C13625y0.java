package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p307ka.C13442j;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010#\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0001\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0001¨\u0006\f"}, mo71668d2 = {"T", "element", "", "c", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "capacity", "", "b", "builder", "a", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/SetsKt")
/* renamed from: kotlin.collections.y0 */
/* compiled from: SetsJVM.kt */
class C13625y0 {
    /* renamed from: a */
    public static <E> Set<E> m87798a(Set<E> set) {
        C13706o.m87929f(set, "builder");
        return ((C13442j) set).mo71002d();
    }

    /* renamed from: b */
    public static <E> Set<E> m87799b(int i) {
        return new C13442j(i);
    }

    /* renamed from: c */
    public static <T> Set<T> m87800c(T t) {
        Set<T> singleton = Collections.singleton(t);
        C13706o.m87928e(singleton, "singleton(element)");
        return singleton;
    }
}
