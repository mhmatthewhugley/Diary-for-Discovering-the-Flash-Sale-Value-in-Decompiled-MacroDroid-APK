package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class UnmodifiableIterator<E> implements Iterator<E> {
    protected UnmodifiableIterator() {
    }

    @DoNotCall
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
