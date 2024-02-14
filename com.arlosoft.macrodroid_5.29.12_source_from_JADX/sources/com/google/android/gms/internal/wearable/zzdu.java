package com.google.android.gms.internal.wearable;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzdu implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f45709a;

    /* renamed from: c */
    private Object f45710c;

    /* renamed from: d */
    final /* synthetic */ zzea f45711d;

    zzdu(zzea zzea, Comparable comparable, Object obj) {
        this.f45711d = zzea;
        this.f45709a = comparable;
        this.f45710c = obj;
    }

    /* renamed from: d */
    private static final boolean m64408d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable mo54013b() {
        return this.f45709a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f45709a.compareTo(((zzdu) obj).f45709a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m64408d(this.f45709a, entry.getKey()) && m64408d(this.f45710c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f45709a;
    }

    public final Object getValue() {
        return this.f45710c;
    }

    public final int hashCode() {
        Comparable comparable = this.f45709a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f45710c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f45711d.m64418n();
        Object obj2 = this.f45710c;
        this.f45710c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f45709a);
        String valueOf2 = String.valueOf(this.f45710c);
        return valueOf + "=" + valueOf2;
    }
}
