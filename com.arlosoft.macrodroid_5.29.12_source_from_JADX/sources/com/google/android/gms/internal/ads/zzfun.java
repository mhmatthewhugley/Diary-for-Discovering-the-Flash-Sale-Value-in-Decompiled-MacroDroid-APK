package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class zzfun extends AbstractCollection {

    /* renamed from: a */
    final Collection f36435a;

    /* renamed from: c */
    final zzfsy f36436c;

    zzfun(Collection collection, zzfsy zzfsy) {
        this.f36435a = collection;
        this.f36436c = zzfsy;
    }

    public final boolean add(Object obj) {
        zzfsx.m50940e(this.f36436c.mo45704a(obj));
        return this.f36435a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object a : collection) {
            zzfsx.m50940e(this.f36436c.mo45704a(a));
        }
        return this.f36435a.addAll(collection);
    }

    public final void clear() {
        zzfvt.m51171a(this.f36435a, this.f36436c);
    }

    public final boolean contains(Object obj) {
        if (zzfuo.m51032a(this.f36435a, obj)) {
            return this.f36436c.mo45704a(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        Collection<Object> collection = this.f36435a;
        zzfsy zzfsy = this.f36436c;
        zzfsx.m50938c(zzfsy, "predicate");
        int i = 0;
        for (Object a : collection) {
            if (!zzfsy.mo45704a(a)) {
                i++;
            } else if (i != -1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.f36435a.iterator();
        zzfsy zzfsy = this.f36436c;
        Objects.requireNonNull(it);
        Objects.requireNonNull(zzfsy);
        return new zzfvu(it, zzfsy);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.f36435a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.f36435a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f36436c.mo45704a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.f36435a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f36436c.mo45704a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object a : this.f36435a) {
            if (this.f36436c.mo45704a(a)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfvx.m51177c(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfvx.m51177c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
