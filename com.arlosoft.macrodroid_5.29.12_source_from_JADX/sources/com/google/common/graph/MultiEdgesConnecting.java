package com.google.common.graph;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

@ElementTypesAreNonnullByDefault
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {

    /* renamed from: a */
    private final Map<E, ?> f17457a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Object f17458c;

    public boolean contains(Object obj) {
        return this.f17458c.equals(this.f17457a.get(obj));
    }

    /* renamed from: d */
    public UnmodifiableIterator<E> iterator() {
        final Iterator<Map.Entry<E, ?>> it = this.f17457a.entrySet().iterator();
        return new AbstractIterator<E>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public E mo34417a() {
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (MultiEdgesConnecting.this.f17458c.equals(entry.getValue())) {
                        return entry.getKey();
                    }
                }
                return mo34418b();
            }
        };
    }
}
