package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    IndexedImmutableSet() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public ImmutableList<E> mo35439B() {
        return new ImmutableList<E>() {
            public E get(int i) {
                return IndexedImmutableSet.this.get(i);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: j */
            public boolean mo34781j() {
                return IndexedImmutableSet.this.mo34781j();
            }

            public int size() {
                return IndexedImmutableSet.this.size();
            }
        };
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: d */
    public int mo35355d(Object[] objArr, int i) {
        return mo35029c().mo35355d(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public abstract E get(int i);

    /* renamed from: k */
    public UnmodifiableIterator<E> iterator() {
        return mo35029c().iterator();
    }
}
