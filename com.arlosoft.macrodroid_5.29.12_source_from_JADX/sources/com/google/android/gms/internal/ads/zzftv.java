package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzftv extends zzfwh {

    /* renamed from: f */
    final transient Map f36403f;

    /* renamed from: g */
    final /* synthetic */ zzfui f36404g;

    zzftv(zzfui zzfui, Map map) {
        this.f36404g = zzfui;
        this.f36403f = map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo46209a() {
        return new zzftt(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Map.Entry mo46210c(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfvj(key, this.f36404g.mo46201j(key, (Collection) entry.getValue()));
    }

    public final void clear() {
        Map map = this.f36403f;
        zzfui zzfui = this.f36404g;
        if (map == zzfui.f36429f) {
            zzfui.mo46323q();
        } else {
            zzfvx.m51176b(new zzftu(this));
        }
    }

    public final boolean containsKey(Object obj) {
        Map map = this.f36403f;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || this.f36403f.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfwi.m51186a(this.f36403f, obj);
        if (collection == null) {
            return null;
        }
        return this.f36404g.mo46201j(obj, collection);
    }

    public final int hashCode() {
        return this.f36403f.hashCode();
    }

    public Set keySet() {
        return this.f36404g.mo46337g();
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f36403f.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection h = this.f36404g.mo46199h();
        h.addAll(collection);
        zzfui.m51006n(this.f36404g, collection.size());
        collection.clear();
        return h;
    }

    public final int size() {
        return this.f36403f.size();
    }

    public final String toString() {
        return this.f36403f.toString();
    }
}
