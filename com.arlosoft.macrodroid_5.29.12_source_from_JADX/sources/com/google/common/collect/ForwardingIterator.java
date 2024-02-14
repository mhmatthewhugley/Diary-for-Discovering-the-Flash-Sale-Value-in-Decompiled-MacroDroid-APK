package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    protected ForwardingIterator() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract Iterator<T> mo22325Q();

    public boolean hasNext() {
        return mo22325Q().hasNext();
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public T next() {
        return mo22325Q().next();
    }

    public void remove() {
        mo22325Q().remove();
    }
}
