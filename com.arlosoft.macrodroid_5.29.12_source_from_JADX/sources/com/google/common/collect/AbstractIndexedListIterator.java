package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {

    /* renamed from: a */
    private final int f16380a;

    /* renamed from: c */
    private int f16381c;

    protected AbstractIndexedListIterator(int i) {
        this(i, 0);
    }

    /* access modifiers changed from: protected */
    @ParametricNullness
    /* renamed from: a */
    public abstract E mo34410a(int i);

    public final boolean hasNext() {
        return this.f16381c < this.f16380a;
    }

    public final boolean hasPrevious() {
        return this.f16381c > 0;
    }

    @ParametricNullness
    public final E next() {
        if (hasNext()) {
            int i = this.f16381c;
            this.f16381c = i + 1;
            return mo34410a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f16381c;
    }

    @ParametricNullness
    public final E previous() {
        if (hasPrevious()) {
            int i = this.f16381c - 1;
            this.f16381c = i;
            return mo34410a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f16381c - 1;
    }

    protected AbstractIndexedListIterator(int i, int i2) {
        Preconditions.m5395v(i2, i);
        this.f16380a = i;
        this.f16381c = i2;
    }
}
