package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@DoNotMock
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        @ParametricNullness
        /* renamed from: a */
        R mo34747a();

        @ParametricNullness
        /* renamed from: b */
        C mo34748b();

        @ParametricNullness
        V getValue();
    }

    void clear();

    boolean containsValue(@CompatibleWith Object obj);

    boolean equals(Object obj);

    int hashCode();

    /* renamed from: j */
    Map<R, Map<C, V>> mo34741j();

    /* renamed from: l */
    Map<C, Map<R, V>> mo34742l();

    /* renamed from: m */
    Set<Cell<R, C, V>> mo34723m();

    int size();

    Collection<V> values();
}
