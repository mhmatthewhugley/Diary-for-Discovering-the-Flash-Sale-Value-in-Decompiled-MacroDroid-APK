package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;
import p307ka.C13428d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a2\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\u001a \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0001\u001a(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\t\u001a\u00020\bH\u0001\u001a4\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0001\u001a@\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\r\u001a2\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0000\u001a\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0001¨\u0006\u0014"}, mo71668d2 = {"K", "V", "Lja/m;", "pair", "", "f", "", "c", "", "capacity", "d", "builder", "b", "Ljava/util/Comparator;", "comparator", "Ljava/util/SortedMap;", "h", "g", "expectedSize", "e", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/MapsKt")
/* renamed from: kotlin.collections.s0 */
/* compiled from: MapsJVM.kt */
class C13613s0 extends C13611r0 {
    /* renamed from: b */
    public static <K, V> Map<K, V> m87737b(Map<K, V> map) {
        C13706o.m87929f(map, "builder");
        return ((C13428d) map).mo70929i();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m87738c() {
        return new C13428d();
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m87739d(int i) {
        return new C13428d(i);
    }

    /* renamed from: e */
    public static int m87740e(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: f */
    public static <K, V> Map<K, V> m87741f(C13328m<? extends K, ? extends V> mVar) {
        C13706o.m87929f(mVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(mVar.mo70154c(), mVar.mo70155d());
        C13706o.m87928e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: g */
    public static final <K, V> Map<K, V> m87742g(Map<? extends K, ? extends V> map) {
        C13706o.m87929f(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C13706o.m87928e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* renamed from: h */
    public static <K, V> SortedMap<K, V> m87743h(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        C13706o.m87929f(map, "<this>");
        C13706o.m87929f(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
