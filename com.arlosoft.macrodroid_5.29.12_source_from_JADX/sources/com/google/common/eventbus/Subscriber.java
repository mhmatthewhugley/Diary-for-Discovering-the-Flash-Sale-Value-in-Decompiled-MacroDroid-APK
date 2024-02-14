package com.google.common.eventbus;

import com.google.common.annotations.VisibleForTesting;
import java.lang.reflect.Method;

@ElementTypesAreNonnullByDefault
class Subscriber {
    @VisibleForTesting

    /* renamed from: a */
    final Object f17372a;

    /* renamed from: b */
    private final Method f17373b;

    @VisibleForTesting
    static final class SynchronizedSubscriber extends Subscriber {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscriber)) {
            return false;
        }
        Subscriber subscriber = (Subscriber) obj;
        if (this.f17372a != subscriber.f17372a || !this.f17373b.equals(subscriber.f17373b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f17373b.hashCode() + 31) * 31) + System.identityHashCode(this.f17372a);
    }
}
