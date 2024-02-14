package kotlin.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0006"}, mo71668d2 = {"K", "V", "", "", "Lja/m;", "x", "kotlin-stdlib"}, mo71669k = 5, mo71670mv = {1, 7, 1}, mo71673xs = "kotlin/collections/MapsKt")
/* renamed from: kotlin.collections.v0 */
/* compiled from: _Maps.kt */
class C13619v0 extends C13617u0 {
    /* renamed from: x */
    public static <K, V> List<C13328m<K, V>> m87777x(Map<? extends K, ? extends V> map) {
        C13706o.m87929f(map, "<this>");
        if (map.size() == 0) {
            return C13614t.m87748j();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C13614t.m87748j();
        }
        Map.Entry next = it.next();
        if (!it.hasNext()) {
            return C13612s.m87736e(new C13328m(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C13328m(next.getKey(), next.getValue()));
        do {
            Map.Entry next2 = it.next();
            arrayList.add(new C13328m(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
