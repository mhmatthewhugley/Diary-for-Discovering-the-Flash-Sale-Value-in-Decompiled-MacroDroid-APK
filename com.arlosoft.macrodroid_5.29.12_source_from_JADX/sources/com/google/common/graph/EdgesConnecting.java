package com.google.common.graph;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Map;

@ElementTypesAreNonnullByDefault
final class EdgesConnecting<E> extends AbstractSet<E> {

    /* renamed from: a */
    private final Map<?, E> f17418a;

    /* renamed from: c */
    private final Object f17419c;

    /* renamed from: c */
    private E m29358c() {
        return this.f17418a.get(this.f17419c);
    }

    public boolean contains(Object obj) {
        Object c = m29358c();
        return c != null && c.equals(obj);
    }

    /* renamed from: d */
    public UnmodifiableIterator<E> iterator() {
        Object c = m29358c();
        if (c == null) {
            return ImmutableSet.m27506F().iterator();
        }
        return Iterators.m27700G(c);
    }

    public int size() {
        return m29358c() == null ? 0 : 1;
    }
}
