package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfxg extends zzfxf implements SortedSet {
    zzfxg(SortedSet sortedSet, zzfsy zzfsy) {
        super(sortedSet, zzfsy);
    }

    public final Comparator comparator() {
        return ((SortedSet) this.f36435a).comparator();
    }

    public final Object first() {
        Iterator it = this.f36435a.iterator();
        zzfsy zzfsy = this.f36436c;
        Objects.requireNonNull(it);
        Objects.requireNonNull(zzfsy);
        while (it.hasNext()) {
            Object next = it.next();
            if (zzfsy.mo45704a(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public final SortedSet headSet(Object obj) {
        return new zzfxg(((SortedSet) this.f36435a).headSet(obj), this.f36436c);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f36435a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f36436c.mo45704a(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new zzfxg(((SortedSet) this.f36435a).subSet(obj, obj2), this.f36436c);
    }

    public final SortedSet tailSet(Object obj) {
        return new zzfxg(((SortedSet) this.f36435a).tailSet(obj), this.f36436c);
    }
}
