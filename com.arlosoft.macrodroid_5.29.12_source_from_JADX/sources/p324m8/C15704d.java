package p324m8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;
import p297ja.C13337s;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\u001a.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u001aQ\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u000b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000\u001a\u0018\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0004H\u0000¨\u0006\u0013"}, mo71668d2 = {"K", "V", "Lm8/a;", "b", "", "e", "", "Lja/m;", "pairs", "a", "([Lja/m;)Lm8/a;", "bimap", "", "other", "", "c", "map", "", "d", "kotlinx-bimap"}, mo71669k = 5, mo71670mv = {1, 4, 0}, mo71673xs = "com/uchuhimo/collections/BiMapsKt")
/* renamed from: m8.d */
/* compiled from: BiMaps.kt */
final /* synthetic */ class C15704d {

    /* renamed from: a */
    private static final C15702b<Object, Object> f65009a = new C15702b<>(C13615t0.m87759i(), C13615t0.m87759i());

    /* renamed from: a */
    public static final <K, V> C15701a<K, V> m94965a(C13328m<? extends K, ? extends V>... mVarArr) {
        C13706o.m87930g(mVarArr, "pairs");
        return C15703c.m94964e(C13615t0.m87771u(mVarArr));
    }

    /* renamed from: b */
    public static final <K, V> C15701a<K, V> m94966b() {
        C15702b<Object, Object> bVar = f65009a;
        if (bVar != null) {
            return bVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.uchuhimo.collections.BiMap<K, V>");
    }

    /* renamed from: c */
    public static final boolean m94967c(C15701a<?, ?> aVar, Object obj) {
        C13706o.m87930g(aVar, "bimap");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof C15701a) || ((C15701a) obj).size() != aVar.size()) {
            return false;
        }
        for (Map.Entry next : aVar.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (value == null) {
                Map map = (Map) obj;
                if (map.get(key) != null || !map.containsKey(key)) {
                    return false;
                }
            } else if (!C13706o.m87924a(value, ((Map) obj).get(key))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final int m94968d(Map<?, ?> map) {
        C13706o.m87930g(map, "map");
        int i = 0;
        for (Map.Entry hashCode : map.entrySet()) {
            i += hashCode.hashCode();
        }
        return i;
    }

    /* renamed from: e */
    public static final <K, V> C15701a<K, V> m94969e(Map<K, ? extends V> map) {
        C13706o.m87930g(map, "$receiver");
        if (!(!map.isEmpty())) {
            return C15703c.m94961b();
        }
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(C13337s.m85692a(entry.getValue(), entry.getKey()));
        }
        return new C15702b(map, C13615t0.m87768r(arrayList));
    }
}
