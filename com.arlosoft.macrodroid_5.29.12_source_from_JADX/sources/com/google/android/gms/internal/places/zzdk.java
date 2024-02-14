package com.google.android.gms.internal.places;

import java.util.Map;

final class zzdk implements Comparable, Map.Entry {

    /* renamed from: a */
    private final Comparable f45378a;

    /* renamed from: c */
    private Object f45379c;

    /* renamed from: d */
    private final /* synthetic */ zzdb f45380d;

    zzdk(zzdb zzdb, Map.Entry entry) {
        this(zzdb, (Comparable) entry.getKey(), entry.getValue());
    }

    /* renamed from: b */
    private static boolean m63614b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((zzdk) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m63614b(this.f45378a, entry.getKey()) && m63614b(this.f45379c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f45378a;
    }

    public final Object getValue() {
        return this.f45379c;
    }

    public final int hashCode() {
        Comparable comparable = this.f45378a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f45379c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f45380d.m63542n();
        Object obj2 = this.f45379c;
        this.f45379c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f45378a);
        String valueOf2 = String.valueOf(this.f45379c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    zzdk(zzdb zzdb, Comparable comparable, Object obj) {
        this.f45380d = zzdb;
        this.f45378a = comparable;
        this.f45379c = obj;
    }
}
