package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzgsi extends LinkedHashMap {

    /* renamed from: a */
    private static final zzgsi f37214a;
    private boolean zzb = true;

    static {
        zzgsi zzgsi = new zzgsi();
        f37214a = zzgsi;
        zzgsi.zzb = false;
    }

    private zzgsi() {
    }

    /* renamed from: a */
    public static zzgsi m53087a() {
        return f37214a;
    }

    /* renamed from: f */
    private static int m53088f(Object obj) {
        if (obj instanceof byte[]) {
            return zzgro.m53024b((byte[]) obj);
        }
        if (!(obj instanceof zzgrg)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private final void m53089g() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final zzgsi mo47397b() {
        return isEmpty() ? new zzgsi() : new zzgsi(this);
    }

    /* renamed from: c */
    public final void mo47398c() {
        this.zzb = false;
    }

    public final void clear() {
        m53089g();
        super.clear();
    }

    /* renamed from: d */
    public final void mo47400d(zzgsi zzgsi) {
        m53089g();
        if (!zzgsi.isEmpty()) {
            putAll(zzgsi);
        }
    }

    /* renamed from: e */
    public final boolean mo47401e() {
        return this.zzb;
    }

    public final Set entrySet() {
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
            i += m53088f(entry.getValue()) ^ m53088f(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m53089g();
        zzgro.m53027e(obj);
        zzgro.m53027e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m53089g();
        for (Object next : map.keySet()) {
            zzgro.m53027e(next);
            zzgro.m53027e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m53089g();
        return super.remove(obj);
    }

    private zzgsi(Map map) {
        super(map);
    }
}
