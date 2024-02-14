package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    final Equivalence<E> elementEquivalence;

    public boolean equals(Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.elementEquivalence.equals(((PairwiseEquivalence) obj).elementEquivalence);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo22141a(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.elementEquivalence.mo22143d(it.next(), it2.next())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo22142b(Iterable<T> iterable) {
        int i = 78721;
        for (T e : iterable) {
            i = (i * 24943) + this.elementEquivalence.mo22144e(e);
        }
        return i;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public String toString() {
        String valueOf = String.valueOf(this.elementEquivalence);
        StringBuilder sb = new StringBuilder(valueOf.length() + 11);
        sb.append(valueOf);
        sb.append(".pairwise()");
        return sb.toString();
    }
}
