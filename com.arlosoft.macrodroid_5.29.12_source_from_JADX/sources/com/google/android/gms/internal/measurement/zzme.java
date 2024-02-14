package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzme implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f41711a;

    /* renamed from: c */
    private Object f41712c;

    /* renamed from: d */
    final /* synthetic */ zzmk f41713d;

    zzme(zzmk zzmk, Comparable comparable, Object obj) {
        this.f41713d = zzmk;
        this.f41711a = comparable;
        this.f41712c = obj;
    }

    /* renamed from: d */
    private static final boolean m60756d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable mo51528b() {
        return this.f41711a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f41711a.compareTo(((zzme) obj).f41711a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m60756d(this.f41711a, entry.getKey()) && m60756d(this.f41712c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f41711a;
    }

    public final Object getValue() {
        return this.f41712c;
    }

    public final int hashCode() {
        Comparable comparable = this.f41711a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f41712c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f41713d.m60766n();
        Object obj2 = this.f41712c;
        this.f41712c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f41711a);
        String valueOf2 = String.valueOf(this.f41712c);
        return valueOf + "=" + valueOf2;
    }
}
