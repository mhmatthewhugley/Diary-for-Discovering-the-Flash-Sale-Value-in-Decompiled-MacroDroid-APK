package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class zzfui extends zzful implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient Map f36429f;

    /* renamed from: g */
    private transient int f36430g;

    protected zzfui(Map map) {
        zzfsx.m50940e(map.isEmpty());
        this.f36429f = map;
    }

    /* renamed from: k */
    static /* synthetic */ int m51003k(zzfui zzfui) {
        int i = zzfui.f36430g;
        zzfui.f36430g = i + 1;
        return i;
    }

    /* renamed from: l */
    static /* synthetic */ int m51004l(zzfui zzfui) {
        int i = zzfui.f36430g;
        zzfui.f36430g = i - 1;
        return i;
    }

    /* renamed from: m */
    static /* synthetic */ int m51005m(zzfui zzfui, int i) {
        int i2 = zzfui.f36430g + i;
        zzfui.f36430g = i2;
        return i2;
    }

    /* renamed from: n */
    static /* synthetic */ int m51006n(zzfui zzfui, int i) {
        int i2 = zzfui.f36430g - i;
        zzfui.f36430g = i2;
        return i2;
    }

    /* renamed from: x */
    static /* synthetic */ void m51008x(zzfui zzfui, Object obj) {
        Object obj2;
        try {
            obj2 = zzfui.f36429f.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfui.f36430g -= size;
        }
    }

    /* renamed from: a */
    public final boolean mo46316a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f36429f.get(obj);
        if (collection == null) {
            Collection h = mo46199h();
            if (h.add(obj2)) {
                this.f36430g++;
                this.f36429f.put(obj, h);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(obj2)) {
            return false;
        } else {
            this.f36430g++;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Collection mo46317b() {
        return new zzfuk(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Iterator mo46318c() {
        return new zzfts(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map mo46319d() {
        throw null;
    }

    /* renamed from: e */
    public final int mo46320e() {
        return this.f36430g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Set mo46321f() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract Collection mo46199h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Collection mo46200i(Collection collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Collection mo46201j(Object obj, Collection collection) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final List mo46322p(Object obj, List list, zzfuf zzfuf) {
        if (list instanceof RandomAccess) {
            return new zzfub(this, obj, list, zzfuf);
        }
        return new zzfuh(this, obj, list, zzfuf);
    }

    /* renamed from: q */
    public final void mo46323q() {
        for (Collection clear : this.f36429f.values()) {
            clear.clear();
        }
        this.f36429f.clear();
        this.f36430g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final Map mo46324v() {
        Map map = this.f36429f;
        if (map instanceof NavigableMap) {
            return new zzftz(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfuc(this, (SortedMap) map);
        }
        return new zzftv(this, map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final Set mo46325w() {
        Map map = this.f36429f;
        if (map instanceof NavigableMap) {
            return new zzfua(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfud(this, (SortedMap) map);
        }
        return new zzfty(this, map);
    }
}
