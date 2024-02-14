package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13680b0;
import kotlin.jvm.internal.C13698j0;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\u001a0\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¨\u0006\u0006"}, mo71668d2 = {"T", "K", "Lkotlin/collections/g0;", "", "", "a", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/GroupingKt")
/* renamed from: kotlin.collections.i0 */
/* compiled from: GroupingJVM.kt */
class C13588i0 {
    /* renamed from: a */
    public static <T, K> Map<K, Integer> m87549a(C13583g0<T, ? extends K> g0Var) {
        C13706o.m87929f(g0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = g0Var.mo30406b();
        while (b.hasNext()) {
            Object a = g0Var.mo30405a(b.next());
            Object obj = linkedHashMap.get(a);
            if (obj == null && !linkedHashMap.containsKey(a)) {
                obj = new C13680b0();
            }
            C13680b0 b0Var = (C13680b0) obj;
            b0Var.element++;
            linkedHashMap.put(a, b0Var);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C13706o.m87927d(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda-4>");
            C13698j0.m87905e(entry).setValue(Integer.valueOf(((C13680b0) entry.getValue()).element));
        }
        return C13698j0.m87904d(linkedHashMap);
    }
}
