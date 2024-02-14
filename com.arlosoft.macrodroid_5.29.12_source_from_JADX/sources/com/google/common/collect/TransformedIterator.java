package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<? extends F> f17232a;

    TransformedIterator(Iterator<? extends F> it) {
        this.f17232a = (Iterator) Preconditions.m5392s(it);
    }

    /* access modifiers changed from: package-private */
    @ParametricNullness
    /* renamed from: a */
    public abstract T mo34726a(@ParametricNullness F f);

    public final boolean hasNext() {
        return this.f17232a.hasNext();
    }

    @ParametricNullness
    public final T next() {
        return mo34726a(this.f17232a.next());
    }

    public final void remove() {
        this.f17232a.remove();
    }
}
