package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzful implements zzfwj {

    /* renamed from: a */
    private transient Set f36432a;

    /* renamed from: c */
    private transient Collection f36433c;

    /* renamed from: d */
    private transient Map f36434d;

    zzful() {
    }

    /* renamed from: a */
    public boolean mo46316a(Object obj, Object obj2) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Collection mo46317b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Iterator mo46318c() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Map mo46319d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfwj)) {
            return false;
        }
        return mo46341u().equals(((zzfwj) obj).mo46341u());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract Set mo46321f();

    /* renamed from: g */
    public final Set mo46337g() {
        Set set = this.f36432a;
        if (set != null) {
            return set;
        }
        Set f = mo46321f();
        this.f36432a = f;
        return f;
    }

    public final int hashCode() {
        return mo46341u().hashCode();
    }

    /* renamed from: r */
    public final Collection mo46339r() {
        Collection collection = this.f36433c;
        if (collection != null) {
            return collection;
        }
        Collection b = mo46317b();
        this.f36433c = b;
        return b;
    }

    public final String toString() {
        return mo46341u().toString();
    }

    /* renamed from: u */
    public final Map mo46341u() {
        Map map = this.f36434d;
        if (map != null) {
            return map;
        }
        Map d = mo46319d();
        this.f36434d = d;
        return d;
    }
}
