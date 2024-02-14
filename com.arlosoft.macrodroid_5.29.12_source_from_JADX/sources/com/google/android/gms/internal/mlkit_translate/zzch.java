package com.google.android.gms.internal.mlkit_translate;

import java.util.Map;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzch implements Map.Entry {

    /* renamed from: a */
    zzch f43179a;

    /* renamed from: c */
    zzch f43180c;

    /* renamed from: d */
    zzch f43181d;

    /* renamed from: f */
    zzch f43182f;

    /* renamed from: g */
    zzch f43183g;

    /* renamed from: o */
    final Object f43184o;

    /* renamed from: p */
    Object f43185p;

    /* renamed from: s */
    int f43186s;

    zzch() {
        this.f43184o = null;
        this.f43183g = this;
        this.f43182f = this;
    }

    zzch(zzch zzch, Object obj, zzch zzch2, zzch zzch3) {
        this.f43179a = zzch;
        this.f43184o = obj;
        this.f43186s = 1;
        this.f43182f = zzch2;
        this.f43183g = zzch3;
        zzch3.f43182f = this;
        zzch2.f43183g = this;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f43184o;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f43185p;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (!obj3.equals(entry.getValue())) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final Object getKey() {
        return this.f43184o;
    }

    public final Object getValue() {
        return this.f43185p;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f43184o;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        Object obj2 = this.f43185p;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i ^ i2;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.f43185p;
        this.f43185p = obj;
        return obj2;
    }

    public final String toString() {
        return this.f43184o + "=" + this.f43185p;
    }
}
