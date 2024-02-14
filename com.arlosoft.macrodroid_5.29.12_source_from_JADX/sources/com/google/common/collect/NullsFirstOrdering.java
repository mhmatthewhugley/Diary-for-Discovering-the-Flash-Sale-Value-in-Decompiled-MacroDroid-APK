package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Ordering<? super T> ordering;

    NullsFirstOrdering(Ordering<? super T> ordering2) {
        this.ordering = ordering2;
    }

    public int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.ordering.compare(t, t2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.ordering.equals(((NullsFirstOrdering) obj).ordering);
        }
        return false;
    }

    /* renamed from: f */
    public <S extends T> Ordering<S> mo36235f() {
        return this;
    }

    /* renamed from: g */
    public <S extends T> Ordering<S> mo36236g() {
        return this.ordering.mo36236g();
    }

    public int hashCode() {
        return this.ordering.hashCode() ^ 957692532;
    }

    /* renamed from: j */
    public <S extends T> Ordering<S> mo34739j() {
        return this.ordering.mo34739j().mo36236g();
    }

    public String toString() {
        String valueOf = String.valueOf(this.ordering);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append(valueOf);
        sb.append(".nullsFirst()");
        return sb.toString();
    }
}
