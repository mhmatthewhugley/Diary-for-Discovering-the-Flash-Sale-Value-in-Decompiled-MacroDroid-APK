package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class AllEqualOrdering extends Ordering<Object> implements Serializable {

    /* renamed from: a */
    static final AllEqualOrdering f16452a = new AllEqualOrdering();
    private static final long serialVersionUID = 0;

    AllEqualOrdering() {
    }

    private Object readResolve() {
        return f16452a;
    }

    /* renamed from: b */
    public <E> ImmutableList<E> mo34737b(Iterable<E> iterable) {
        return ImmutableList.m27308q(iterable);
    }

    public int compare(Object obj, Object obj2) {
        return 0;
    }

    /* renamed from: j */
    public <S> Ordering<S> mo34739j() {
        return this;
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
