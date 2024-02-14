package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ReverseNaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* renamed from: a */
    static final ReverseNaturalOrdering f17112a = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return f17112a;
    }

    /* renamed from: j */
    public <S extends Comparable<?>> Ordering<S> mo34739j() {
        return Ordering.m28521e();
    }

    /* renamed from: k */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.m5392s(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    /* renamed from: l */
    public <E extends Comparable<?>> E mo36265c(E e, E e2) {
        return (Comparable) NaturalOrdering.f17042d.mo36266d(e, e2);
    }

    /* renamed from: m */
    public <E extends Comparable<?>> E mo36266d(E e, E e2) {
        return (Comparable) NaturalOrdering.f17042d.mo36265c(e, e2);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
