package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfvq implements Map, Serializable {

    /* renamed from: a */
    private transient zzfvs f36480a;

    /* renamed from: c */
    private transient zzfvs f36481c;

    /* renamed from: d */
    private transient zzfvi f36482d;

    zzfvq() {
    }

    /* renamed from: c */
    public static zzfvq m51147c(Map map) {
        Set entrySet = map.entrySet();
        zzfvp zzfvp = new zzfvp(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfvp.mo46448b(entrySet);
        return zzfvp.mo46449c();
    }

    /* renamed from: d */
    public static zzfvq m51148d() {
        return zzfxb.f36520p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract zzfvi mo46450a();

    /* renamed from: b */
    public final zzfvi values() {
        zzfvi zzfvi = this.f36482d;
        if (zzfvi != null) {
            return zzfvi;
        }
        zzfvi a = mo46450a();
        this.f36482d = a;
        return a;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract zzfvs mo46455e();

    public final boolean equals(Object obj) {
        return zzfwi.m51187b(this, obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract zzfvs mo46458f();

    /* renamed from: g */
    public final zzfvs entrySet() {
        zzfvs zzfvs = this.f36480a;
        if (zzfvs != null) {
            return zzfvs;
        }
        zzfvs e = mo46455e();
        this.f36480a = e;
        return e;
    }

    public abstract Object get(Object obj);

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: h */
    public final zzfvs keySet() {
        zzfvs zzfvs = this.f36481c;
        if (zzfvs != null) {
            return zzfvs;
        }
        zzfvs f = mo46458f();
        this.f36481c = f;
        return f;
    }

    public final int hashCode() {
        return zzfxi.m51242a(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfum.m51030a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, FileUtils.ONE_GB));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
