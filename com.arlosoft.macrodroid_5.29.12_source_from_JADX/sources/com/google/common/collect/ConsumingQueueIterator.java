package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Queue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
final class ConsumingQueueIterator<T> extends AbstractIterator<T> {

    /* renamed from: d */
    private final Queue<T> f16543d;

    ConsumingQueueIterator(Queue<T> queue) {
        this.f16543d = (Queue) Preconditions.m5392s(queue);
    }

    /* renamed from: a */
    public T mo34417a() {
        if (this.f16543d.isEmpty()) {
            return mo34418b();
        }
        return this.f16543d.remove();
    }
}
