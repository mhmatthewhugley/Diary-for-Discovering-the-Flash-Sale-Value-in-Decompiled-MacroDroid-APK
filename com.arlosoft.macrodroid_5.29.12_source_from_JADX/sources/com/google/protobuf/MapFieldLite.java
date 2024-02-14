package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private static final MapFieldLite f57003a;
    private boolean isMutable = true;

    static {
        MapFieldLite mapFieldLite = new MapFieldLite();
        f57003a = mapFieldLite;
        mapFieldLite.mo65326k();
    }

    private MapFieldLite() {
    }

    /* renamed from: a */
    static <K, V> int m80862a(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m80863b(next.getValue()) ^ m80863b(next.getKey());
        }
        return i;
    }

    /* renamed from: b */
    private static int m80863b(Object obj) {
        if (obj instanceof byte[]) {
            return Internal.m80735d((byte[]) obj);
        }
        if (!(obj instanceof Internal.EnumLite)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    private static void m80864c(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            Internal.m80732a(next);
            Internal.m80732a(map.get(next));
        }
    }

    /* renamed from: d */
    public static <K, V> MapFieldLite<K, V> m80865d() {
        return f57003a;
    }

    /* renamed from: e */
    private void m80866e() {
        if (!mo65324h()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private static boolean m80867f(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean m80868g(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m80867f(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.MapFieldLite.m80868g(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        m80866e();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m80868g(this, (Map) obj);
    }

    /* renamed from: h */
    public boolean mo65324h() {
        return this.isMutable;
    }

    public int hashCode() {
        return m80862a(this);
    }

    /* renamed from: k */
    public void mo65326k() {
        this.isMutable = false;
    }

    /* renamed from: l */
    public void mo65327l(MapFieldLite<K, V> mapFieldLite) {
        m80866e();
        if (!mapFieldLite.isEmpty()) {
            putAll(mapFieldLite);
        }
    }

    /* renamed from: n */
    public MapFieldLite<K, V> mo65328n() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    public V put(K k, V v) {
        m80866e();
        Internal.m80732a(k);
        Internal.m80732a(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m80866e();
        m80864c(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        m80866e();
        return super.remove(obj);
    }

    private MapFieldLite(Map<K, V> map) {
        super(map);
    }
}
