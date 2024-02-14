package kotlin.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u000f\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001aQ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\n\u0010\b\u001aa\u0010\r\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0010\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u000f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aI\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u001a\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u0013\u0010\u0014\u001a@\u0010\u0016\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001a4\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0015\u001aQ\u0010\u001a\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00152\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a=\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\u001c\u0010\b\u001aS\u0010\u001d\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\u0018*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\t*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00042\u0006\u0010\u0019\u001a\u00028\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a2\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001a2\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u001aI\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u0010!\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0002\u001a0\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¨\u0006$"}, mo71668d2 = {"K", "V", "", "i", "", "Lja/m;", "pairs", "l", "([Lja/m;)Ljava/util/Map;", "", "m", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "k", "([Lja/m;)Ljava/util/HashMap;", "key", "j", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lja/u;", "q", "(Ljava/util/Map;[Lja/m;)V", "", "p", "r", "M", "destination", "s", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "u", "v", "([Lja/m;Ljava/util/Map;)Ljava/util/Map;", "t", "w", "map", "o", "n", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/MapsKt")
/* renamed from: kotlin.collections.t0 */
/* compiled from: Maps.kt */
class C13615t0 extends C13613s0 {
    /* renamed from: i */
    public static <K, V> Map<K, V> m87759i() {
        C13579e0 e0Var = C13579e0.f61872a;
        C13706o.m87927d(e0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return e0Var;
    }

    /* renamed from: j */
    public static <K, V> V m87760j(Map<K, ? extends V> map, K k) {
        C13706o.m87929f(map, "<this>");
        return C13611r0.m87731a(map, k);
    }

    /* renamed from: k */
    public static <K, V> HashMap<K, V> m87761k(C13328m<? extends K, ? extends V>... mVarArr) {
        C13706o.m87929f(mVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C13613s0.m87740e(mVarArr.length));
        m87767q(hashMap, mVarArr);
        return hashMap;
    }

    /* renamed from: l */
    public static <K, V> Map<K, V> m87762l(C13328m<? extends K, ? extends V>... mVarArr) {
        C13706o.m87929f(mVarArr, "pairs");
        return mVarArr.length > 0 ? m87772v(mVarArr, new LinkedHashMap(C13613s0.m87740e(mVarArr.length))) : m87759i();
    }

    /* renamed from: m */
    public static <K, V> Map<K, V> m87763m(C13328m<? extends K, ? extends V>... mVarArr) {
        C13706o.m87929f(mVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13613s0.m87740e(mVarArr.length));
        m87767q(linkedHashMap, mVarArr);
        return linkedHashMap;
    }

    /* renamed from: n */
    public static final <K, V> Map<K, V> m87764n(Map<K, ? extends V> map) {
        C13706o.m87929f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m87759i();
        }
        if (size != 1) {
            return map;
        }
        return C13613s0.m87742g(map);
    }

    /* renamed from: o */
    public static <K, V> Map<K, V> m87765o(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C13706o.m87929f(map, "<this>");
        C13706o.m87929f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* renamed from: p */
    public static final <K, V> void m87766p(Map<? super K, ? super V> map, Iterable<? extends C13328m<? extends K, ? extends V>> iterable) {
        C13706o.m87929f(map, "<this>");
        C13706o.m87929f(iterable, "pairs");
        for (C13328m mVar : iterable) {
            map.put(mVar.mo70152a(), mVar.mo70153b());
        }
    }

    /* renamed from: q */
    public static final <K, V> void m87767q(Map<? super K, ? super V> map, C13328m<? extends K, ? extends V>[] mVarArr) {
        C13706o.m87929f(map, "<this>");
        C13706o.m87929f(mVarArr, "pairs");
        for (C13328m<? extends K, ? extends V> mVar : mVarArr) {
            map.put(mVar.mo70152a(), mVar.mo70153b());
        }
    }

    /* renamed from: r */
    public static <K, V> Map<K, V> m87768r(Iterable<? extends C13328m<? extends K, ? extends V>> iterable) {
        C13706o.m87929f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m87764n(m87769s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m87759i();
        }
        if (size != 1) {
            return m87769s(iterable, new LinkedHashMap(C13613s0.m87740e(collection.size())));
        }
        return C13613s0.m87741f((C13328m) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    /* renamed from: s */
    public static final <K, V, M extends Map<? super K, ? super V>> M m87769s(Iterable<? extends C13328m<? extends K, ? extends V>> iterable, M m) {
        C13706o.m87929f(iterable, "<this>");
        C13706o.m87929f(m, "destination");
        m87766p(m, iterable);
        return m;
    }

    /* renamed from: t */
    public static <K, V> Map<K, V> m87770t(Map<? extends K, ? extends V> map) {
        C13706o.m87929f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m87759i();
        }
        if (size != 1) {
            return m87773w(map);
        }
        return C13613s0.m87742g(map);
    }

    /* renamed from: u */
    public static <K, V> Map<K, V> m87771u(C13328m<? extends K, ? extends V>[] mVarArr) {
        C13706o.m87929f(mVarArr, "<this>");
        int length = mVarArr.length;
        if (length == 0) {
            return m87759i();
        }
        if (length != 1) {
            return m87772v(mVarArr, new LinkedHashMap(C13613s0.m87740e(mVarArr.length)));
        }
        return C13613s0.m87741f(mVarArr[0]);
    }

    /* renamed from: v */
    public static final <K, V, M extends Map<? super K, ? super V>> M m87772v(C13328m<? extends K, ? extends V>[] mVarArr, M m) {
        C13706o.m87929f(mVarArr, "<this>");
        C13706o.m87929f(m, "destination");
        m87767q(m, mVarArr);
        return m;
    }

    /* renamed from: w */
    public static <K, V> Map<K, V> m87773w(Map<? extends K, ? extends V> map) {
        C13706o.m87929f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
