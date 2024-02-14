package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

@GwtCompatible
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Optional$1 */
    final class C108611 implements Iterable<Object> {

        /* renamed from: a */
        final /* synthetic */ Iterable f52631a;

        public Iterator<Object> iterator() {
            return new AbstractIterator<Object>() {

                /* renamed from: d */
                private final Iterator<? extends Optional<Object>> f52632d;

                {
                    this.f52632d = (Iterator) Preconditions.m72472e(C108611.this.f52631a.iterator());
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo60564a() {
                    while (this.f52632d.hasNext()) {
                        Optional optional = (Optional) this.f52632d.next();
                        if (optional.mo60560b()) {
                            return optional.mo60559a();
                        }
                    }
                    return mo60565b();
                }
            };
        }
    }

    Optional() {
    }

    /* renamed from: a */
    public abstract T mo60559a();

    /* renamed from: b */
    public abstract boolean mo60560b();
}
