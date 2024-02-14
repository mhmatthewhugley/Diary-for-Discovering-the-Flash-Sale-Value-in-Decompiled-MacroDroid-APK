package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class zzlg extends LinkedHashMap {

    /* renamed from: a */
    private static final zzlg f41667a;
    private boolean zzb = true;

    static {
        zzlg zzlg = new zzlg();
        f41667a = zzlg;
        zzlg.zzb = false;
    }

    private zzlg() {
    }

    /* renamed from: a */
    public static zzlg m60589a() {
        return f41667a;
    }

    /* renamed from: f */
    private static int m60590f(Object obj) {
        if (obj instanceof byte[]) {
            return zzkn.m60539b((byte[]) obj);
        }
        if (!(obj instanceof zzkh)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private final void m60591g() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final zzlg mo51494b() {
        return isEmpty() ? new zzlg() : new zzlg(this);
    }

    /* renamed from: c */
    public final void mo51495c() {
        this.zzb = false;
    }

    public final void clear() {
        m60591g();
        super.clear();
    }

    /* renamed from: d */
    public final void mo51497d(zzlg zzlg) {
        m60591g();
        if (!zzlg.isEmpty()) {
            putAll(zzlg);
        }
    }

    /* renamed from: e */
    public final boolean mo51498e() {
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
            i += m60590f(entry.getValue()) ^ m60590f(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m60591g();
        zzkn.m60542e(obj);
        zzkn.m60542e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m60591g();
        for (Object next : map.keySet()) {
            zzkn.m60542e(next);
            zzkn.m60542e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m60591g();
        return super.remove(obj);
    }

    private zzlg(Map map) {
        super(map);
    }
}
