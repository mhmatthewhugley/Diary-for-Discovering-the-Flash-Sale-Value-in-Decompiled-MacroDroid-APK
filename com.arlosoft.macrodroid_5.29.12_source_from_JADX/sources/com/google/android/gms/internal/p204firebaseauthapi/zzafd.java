package com.google.android.gms.internal.p204firebaseauthapi;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafd */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzafd implements Map.Entry, Comparable {

    /* renamed from: a */
    private final Comparable f39823a;

    /* renamed from: c */
    private Object f39824c;

    /* renamed from: d */
    final /* synthetic */ zzafj f39825d;

    zzafd(zzafj zzafj, Comparable comparable, Object obj) {
        this.f39825d = zzafj;
        this.f39823a = comparable;
        this.f39824c = obj;
    }

    /* renamed from: d */
    private static final boolean m56726d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public final Comparable mo49161b() {
        return this.f39823a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f39823a.compareTo(((zzafd) obj).f39823a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m56726d(this.f39823a, entry.getKey()) && m56726d(this.f39824c, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f39823a;
    }

    public final Object getValue() {
        return this.f39824c;
    }

    public final int hashCode() {
        Comparable comparable = this.f39823a;
        int i = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f39824c;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f39825d.m56736n();
        Object obj2 = this.f39824c;
        this.f39824c = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f39823a);
        String valueOf2 = String.valueOf(this.f39824c);
        return valueOf + "=" + valueOf2;
    }
}
