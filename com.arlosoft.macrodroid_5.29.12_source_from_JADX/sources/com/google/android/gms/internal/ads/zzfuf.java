package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfuf extends AbstractCollection {

    /* renamed from: a */
    final Object f36422a;

    /* renamed from: c */
    Collection f36423c;

    /* renamed from: d */
    final zzfuf f36424d;

    /* renamed from: f */
    final Collection f36425f;

    /* renamed from: g */
    final /* synthetic */ zzfui f36426g;

    zzfuf(zzfui zzfui, Object obj, Collection collection, zzfuf zzfuf) {
        this.f36426g = zzfui;
        this.f36422a = obj;
        this.f36423c = collection;
        this.f36424d = zzfuf;
        this.f36425f = zzfuf == null ? null : zzfuf.f36423c;
    }

    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f36423c.isEmpty();
        boolean add = this.f36423c.add(obj);
        if (!add) {
            return add;
        }
        zzfui.m51003k(this.f36426g);
        if (!isEmpty) {
            return add;
        }
        mo46286c();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f36423c.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        zzfui.m51005m(this.f36426g, this.f36423c.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo46286c();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo46286c() {
        zzfuf zzfuf = this.f36424d;
        if (zzfuf != null) {
            zzfuf.mo46286c();
        } else {
            this.f36426g.f36429f.put(this.f36422a, this.f36423c);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f36423c.clear();
            zzfui.m51006n(this.f36426g, size);
            mo46290d();
        }
    }

    public final boolean contains(Object obj) {
        zzb();
        return this.f36423c.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f36423c.containsAll(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo46290d() {
        zzfuf zzfuf = this.f36424d;
        if (zzfuf != null) {
            zzfuf.mo46290d();
        } else if (this.f36423c.isEmpty()) {
            this.f36426g.f36429f.remove(this.f36422a);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f36423c.equals(obj);
    }

    public final int hashCode() {
        zzb();
        return this.f36423c.hashCode();
    }

    public final Iterator iterator() {
        zzb();
        return new zzfue(this);
    }

    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f36423c.remove(obj);
        if (remove) {
            zzfui.m51004l(this.f36426g);
            mo46290d();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f36423c.removeAll(collection);
        if (removeAll) {
            zzfui.m51005m(this.f36426g, this.f36423c.size() - size);
            mo46290d();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f36423c.retainAll(collection);
        if (retainAll) {
            zzfui.m51005m(this.f36426g, this.f36423c.size() - size);
            mo46290d();
        }
        return retainAll;
    }

    public final int size() {
        zzb();
        return this.f36423c.size();
    }

    public final String toString() {
        zzb();
        return this.f36423c.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        Collection collection;
        zzfuf zzfuf = this.f36424d;
        if (zzfuf != null) {
            zzfuf.zzb();
            if (this.f36424d.f36423c != this.f36425f) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f36423c.isEmpty() && (collection = (Collection) this.f36426g.f36429f.get(this.f36422a)) != null) {
            this.f36423c = collection;
        }
    }
}
