package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Interner<E> {
    @CanIgnoreReturnValue
    /* renamed from: a */
    E mo35600a(E e);
}
