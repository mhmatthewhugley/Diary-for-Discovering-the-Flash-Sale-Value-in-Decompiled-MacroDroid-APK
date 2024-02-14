package com.google.android.gms.internal.wearable;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public final class zzcw extends LinkedHashMap {

    /* renamed from: a */
    private static final zzcw f45666a;
    private boolean zzb = true;

    static {
        zzcw zzcw = new zzcw();
        f45666a = zzcw;
        zzcw.zzb = false;
    }

    private zzcw() {
    }

    /* renamed from: e */
    private static int m64268e(Object obj) {
        if (obj instanceof byte[]) {
            return zzcd.m64223b((byte[]) obj);
        }
        if (!(obj instanceof zzbx)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    private final void m64269f() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public final zzcw mo53982a() {
        return isEmpty() ? new zzcw() : new zzcw(this);
    }

    /* renamed from: b */
    public final void mo53983b() {
        this.zzb = false;
    }

    /* renamed from: c */
    public final void mo53984c(zzcw zzcw) {
        m64269f();
        if (!zzcw.isEmpty()) {
            putAll(zzcw);
        }
    }

    public final void clear() {
        m64269f();
        super.clear();
    }

    /* renamed from: d */
    public final boolean mo53986d() {
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
            i += m64268e(entry.getValue()) ^ m64268e(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m64269f();
        zzcd.m64226e(obj);
        zzcd.m64226e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m64269f();
        for (Object next : map.keySet()) {
            zzcd.m64226e(next);
            zzcd.m64226e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m64269f();
        return super.remove(obj);
    }

    private zzcw(Map map) {
        super(map);
    }
}
