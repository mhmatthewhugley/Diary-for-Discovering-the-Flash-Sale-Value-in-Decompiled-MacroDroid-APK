package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Beta
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {
    private static final long serialVersionUID = 0;
    private final Queue<E> delegate;
    @VisibleForTesting
    final int maxSize;

    @CanIgnoreReturnValue
    public boolean add(E e) {
        Preconditions.m5392s(e);
        if (this.maxSize == 0) {
            return true;
        }
        if (size() == this.maxSize) {
            this.delegate.remove();
        }
        this.delegate.add(e);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.maxSize) {
            return mo35128T(collection);
        }
        clear();
        return Iterables.m27674a(this, Iterables.m27685l(collection, size - this.maxSize));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public Queue<E> mo34397R() {
        return this.delegate;
    }

    @CanIgnoreReturnValue
    public boolean offer(E e) {
        return add(e);
    }

    public Object[] toArray() {
        return super.toArray();
    }
}
