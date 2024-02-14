package com.google.android.gms.internal.icing;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzdy<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    private static final zzdy f40909a;
    private boolean zza = true;

    static {
        zzdy zzdy = new zzdy();
        f40909a = zzdy;
        zzdy.zza = false;
    }

    private zzdy() {
    }

    /* renamed from: e */
    private static int m58857e(Object obj) {
        if (obj instanceof byte[]) {
            return zzdh.m58822g((byte[]) obj);
        }
        if (!(obj instanceof zzde)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    private final void m58858f() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final void mo50342a(zzdy<K, V> zzdy) {
        m58858f();
        if (!zzdy.isEmpty()) {
            putAll(zzdy);
        }
    }

    /* renamed from: b */
    public final zzdy<K, V> mo50343b() {
        return isEmpty() ? new zzdy<>() : new zzdy<>(this);
    }

    /* renamed from: c */
    public final void mo50344c() {
        this.zza = false;
    }

    public final void clear() {
        m58858f();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo50346d() {
        return this.zza;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m58857e(entry.getValue()) ^ m58857e(entry.getKey());
        }
        return i;
    }

    public final V put(K k, V v) {
        m58858f();
        zzdh.m58816a(k);
        zzdh.m58816a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m58858f();
        for (Object next : map.keySet()) {
            zzdh.m58816a(next);
            zzdh.m58816a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m58858f();
        return super.remove(obj);
    }

    private zzdy(Map<K, V> map) {
        super(map);
    }
}
