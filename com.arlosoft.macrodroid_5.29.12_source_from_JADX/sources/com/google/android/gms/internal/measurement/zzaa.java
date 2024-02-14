package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class zzaa {

    /* renamed from: a */
    private String f41174a;

    /* renamed from: b */
    private final long f41175b;

    /* renamed from: c */
    private final Map f41176c;

    public zzaa(String str, long j, Map map) {
        this.f41174a = str;
        this.f41175b = j;
        HashMap hashMap = new HashMap();
        this.f41176c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long mo50679a() {
        return this.f41175b;
    }

    /* renamed from: b */
    public final zzaa clone() {
        return new zzaa(this.f41174a, this.f41175b, new HashMap(this.f41176c));
    }

    /* renamed from: c */
    public final Object mo50681c(String str) {
        if (this.f41176c.containsKey(str)) {
            return this.f41176c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String mo50683d() {
        return this.f41174a;
    }

    /* renamed from: e */
    public final Map mo50684e() {
        return this.f41176c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaa = (zzaa) obj;
        if (this.f41175b == zzaa.f41175b && this.f41174a.equals(zzaa.f41174a)) {
            return this.f41176c.equals(zzaa.f41176c);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo50686f(String str) {
        this.f41174a = str;
    }

    /* renamed from: g */
    public final void mo50687g(String str, Object obj) {
        if (obj == null) {
            this.f41176c.remove(str);
        } else {
            this.f41176c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f41174a.hashCode();
        long j = this.f41175b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f41176c.hashCode();
    }

    public final String toString() {
        String str = this.f41174a;
        long j = this.f41175b;
        String obj = this.f41176c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
