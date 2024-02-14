package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.MapMaker;
import com.google.common.collect.MapMakerInternalMap;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class Interners {

    public static class InternerBuilder {

        /* renamed from: a */
        private final MapMaker f16737a = new MapMaker();

        /* renamed from: b */
        private boolean f16738b = true;

        private InternerBuilder() {
        }
    }

    private static class InternerFunction<E> implements Function<E, E> {

        /* renamed from: a */
        private final Interner<E> f16739a;

        public E apply(E e) {
            return this.f16739a.mo35600a(e);
        }

        public boolean equals(Object obj) {
            if (obj instanceof InternerFunction) {
                return this.f16739a.equals(((InternerFunction) obj).f16739a);
            }
            return false;
        }

        public int hashCode() {
            return this.f16739a.hashCode();
        }
    }

    @VisibleForTesting
    static final class InternerImpl<E> implements Interner<E> {
        @VisibleForTesting

        /* renamed from: a */
        final MapMakerInternalMap<E, MapMaker.Dummy, ?, ?> f16740a;

        /* renamed from: a */
        public E mo35600a(E e) {
            E key;
            do {
                MapMakerInternalMap.InternalEntry d = this.f16740a.mo35795d(e);
                if (d != null && (key = d.getKey()) != null) {
                    return key;
                }
            } while (this.f16740a.putIfAbsent(e, MapMaker.Dummy.VALUE) != null);
            return e;
        }
    }

    private Interners() {
    }
}
