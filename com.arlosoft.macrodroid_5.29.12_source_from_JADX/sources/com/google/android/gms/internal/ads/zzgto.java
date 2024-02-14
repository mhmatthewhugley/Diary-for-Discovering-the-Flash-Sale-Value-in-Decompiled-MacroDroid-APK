package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzgto implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f37269a;

    /* renamed from: c */
    private Object f37270c;

    /* renamed from: d */
    final /* synthetic */ zzgtu f37271d;

    zzgto(zzgtu zzgtu, Comparable comparable, Object obj) {
        this.f37271d = zzgtu;
        this.f37269a = comparable;
        this.f37270c = obj;
    }

    /* renamed from: d */
    private static final boolean m53317d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable mo47439b() {
        return this.f37269a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f37269a.compareTo(((zzgto) obj).f37269a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m53317d(this.f37269a, entry.getKey()) && m53317d(this.f37270c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f37269a;
    }

    public final Object getValue() {
        return this.f37270c;
    }

    public final int hashCode() {
        Comparable comparable = this.f37269a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f37270c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f37271d.m53327n();
        Object obj2 = this.f37270c;
        this.f37270c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f37269a);
        String valueOf2 = String.valueOf(this.f37270c);
        return valueOf + "=" + valueOf2;
    }
}
