package com.google.android.gms.internal.icing;

import java.util.Map;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzew implements Map.Entry, Comparable<zzew> {

    /* renamed from: a */
    private final Comparable f40953a;

    /* renamed from: c */
    private Object f40954c;

    /* renamed from: d */
    final /* synthetic */ zzez f40955d;

    zzew(zzez zzez, Comparable comparable, Object obj) {
        this.f40955d = zzez;
        this.f40953a = comparable;
        this.f40954c = obj;
    }

    /* renamed from: d */
    private static final boolean m58991d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable mo50372b() {
        return this.f40953a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f40953a.compareTo(((zzew) obj).f40953a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m58991d(this.f40953a, entry.getKey()) && m58991d(this.f40954c, entry.getValue());
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f40953a;
    }

    public final Object getValue() {
        return this.f40954c;
    }

    public final int hashCode() {
        Comparable comparable = this.f40953a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f40954c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f40955d.m59000m();
        Object obj2 = this.f40954c;
        this.f40954c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f40953a);
        String valueOf2 = String.valueOf(this.f40954c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
