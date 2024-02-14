package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaee */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzaee extends LinkedHashMap {

    /* renamed from: a */
    private static final zzaee f39777a;
    private boolean zzb = true;

    static {
        zzaee zzaee = new zzaee();
        f39777a = zzaee;
        zzaee.zzb = false;
    }

    private zzaee() {
    }

    /* renamed from: a */
    public static zzaee m56513a() {
        return f39777a;
    }

    /* renamed from: f */
    private static int m56514f(Object obj) {
        if (obj instanceof byte[]) {
            return zzadl.m56458b((byte[]) obj);
        }
        if (!(obj instanceof zzadh)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private final void m56515g() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final zzaee mo49125b() {
        return isEmpty() ? new zzaee() : new zzaee(this);
    }

    /* renamed from: c */
    public final void mo49126c() {
        this.zzb = false;
    }

    public final void clear() {
        m56515g();
        super.clear();
    }

    /* renamed from: d */
    public final void mo49128d(zzaee zzaee) {
        m56515g();
        if (!zzaee.isEmpty()) {
            putAll(zzaee);
        }
    }

    /* renamed from: e */
    public final boolean mo49129e() {
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
            i += m56514f(entry.getValue()) ^ m56514f(entry.getKey());
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        m56515g();
        zzadl.m56461e(obj);
        zzadl.m56461e(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        m56515g();
        for (Object next : map.keySet()) {
            zzadl.m56461e(next);
            zzadl.m56461e(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        m56515g();
        return super.remove(obj);
    }

    private zzaee(Map map) {
        super(map);
    }
}
