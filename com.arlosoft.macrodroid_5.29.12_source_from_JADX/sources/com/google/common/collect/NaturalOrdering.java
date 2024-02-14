package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* renamed from: d */
    static final NaturalOrdering f17042d = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private transient Ordering<Comparable<?>> f17043a;

    /* renamed from: c */
    private transient Ordering<Comparable<?>> f17044c;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f17042d;
    }

    /* renamed from: f */
    public <S extends Comparable<?>> Ordering<S> mo36235f() {
        Ordering<Comparable<?>> ordering = this.f17043a;
        if (ordering != null) {
            return ordering;
        }
        Ordering<Comparable<?>> f = super.mo36235f();
        this.f17043a = f;
        return f;
    }

    /* renamed from: g */
    public <S extends Comparable<?>> Ordering<S> mo36236g() {
        Ordering<Comparable<?>> ordering = this.f17044c;
        if (ordering != null) {
            return ordering;
        }
        Ordering<Comparable<?>> g = super.mo36236g();
        this.f17044c = g;
        return g;
    }

    /* renamed from: j */
    public <S extends Comparable<?>> Ordering<S> mo34739j() {
        return ReverseNaturalOrdering.f17112a;
    }

    /* renamed from: k */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.m5392s(comparable);
        Preconditions.m5392s(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
