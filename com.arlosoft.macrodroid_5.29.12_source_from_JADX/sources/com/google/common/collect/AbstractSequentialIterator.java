package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: a */
    private T f16445a;

    protected AbstractSequentialIterator(T t) {
        this.f16445a = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo22419a(T t);

    public final boolean hasNext() {
        return this.f16445a != null;
    }

    public final T next() {
        T t = this.f16445a;
        if (t != null) {
            this.f16445a = mo22419a(t);
            return t;
        }
        throw new NoSuchElementException();
    }
}
