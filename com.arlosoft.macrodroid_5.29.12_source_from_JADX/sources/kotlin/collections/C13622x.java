package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a2\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0006¨\u0006\t"}, mo71668d2 = {"", "T", "", "Lja/u;", "x", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "y", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.x */
/* compiled from: MutableCollectionsJVM.kt */
class C13622x extends C13620w {
    /* renamed from: x */
    public static <T extends Comparable<? super T>> void m87780x(List<T> list) {
        C13706o.m87929f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: y */
    public static <T> void m87781y(List<T> list, Comparator<? super T> comparator) {
        C13706o.m87929f(list, "<this>");
        C13706o.m87929f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
