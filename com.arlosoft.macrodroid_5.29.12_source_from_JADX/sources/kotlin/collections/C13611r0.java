package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo71668d2 = {"K", "V", "", "key", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/MapsKt")
/* renamed from: kotlin.collections.r0 */
/* compiled from: MapWithDefault.kt */
class C13611r0 {
    /* renamed from: a */
    public static final <K, V> V m87731a(Map<K, ? extends V> map, K k) {
        C13706o.m87929f(map, "<this>");
        if (map instanceof C13607p0) {
            return ((C13607p0) map).mo71867J(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }
}
