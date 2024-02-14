package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class zzfvd extends zzfve implements Map {
    protected zzfvd() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public /* bridge */ /* synthetic */ Object mo45754b() {
        throw null;
    }

    public final void clear() {
        mo45757d().clear();
    }

    public boolean containsKey(Object obj) {
        return mo45757d().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo45757d().containsValue(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Map mo45757d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo46400e() {
        return zzfxi.m51242a(entrySet());
    }

    public Set entrySet() {
        return mo45757d().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || mo45757d().equals(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo46401f(Object obj) {
        zzfwd zzfwd = new zzfwd(entrySet().iterator());
        if (obj == null) {
            while (zzfwd.hasNext()) {
                if (zzfwd.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfwd.hasNext()) {
                if (obj.equals(zzfwd.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo46402g(Object obj) {
        return zzfwi.m51187b(this, obj);
    }

    public Object get(Object obj) {
        return mo45757d().get(obj);
    }

    public int hashCode() {
        return mo45757d().hashCode();
    }

    public boolean isEmpty() {
        return mo45757d().isEmpty();
    }

    public Set keySet() {
        return mo45757d().keySet();
    }

    public final Object put(Object obj, Object obj2) {
        return mo45757d().put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo45757d().putAll(map);
    }

    public final Object remove(Object obj) {
        return mo45757d().remove(obj);
    }

    public int size() {
        return mo45757d().size();
    }

    public final Collection values() {
        return mo45757d().values();
    }
}
