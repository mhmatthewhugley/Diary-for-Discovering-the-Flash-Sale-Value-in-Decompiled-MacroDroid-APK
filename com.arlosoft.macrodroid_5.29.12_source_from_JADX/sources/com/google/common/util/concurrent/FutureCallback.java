package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface FutureCallback<V> {
    /* renamed from: a */
    void mo61663a(Throwable th);

    /* renamed from: b */
    void mo61664b(@ParametricNullness V v);
}
