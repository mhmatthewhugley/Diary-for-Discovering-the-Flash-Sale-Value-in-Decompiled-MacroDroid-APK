package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Set;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSet<E> extends ForwardingCollection<E> implements Set<E> {
    protected ForwardingSet() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public abstract Set<E> mo34397R();

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public boolean mo35235d0(Collection<?> collection) {
        return Sets.m28730m(this, (Collection) Preconditions.m5392s(collection));
    }

    public boolean equals(Object obj) {
        return obj == this || mo34397R().equals(obj);
    }

    public int hashCode() {
        return mo34397R().hashCode();
    }
}
