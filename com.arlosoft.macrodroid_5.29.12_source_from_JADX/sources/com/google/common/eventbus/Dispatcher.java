package com.google.common.eventbus;

import com.google.common.collect.Queues;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@ElementTypesAreNonnullByDefault
abstract class Dispatcher {

    private static final class ImmediateDispatcher extends Dispatcher {

        /* renamed from: a */
        private static final ImmediateDispatcher f17361a = new ImmediateDispatcher();

        private ImmediateDispatcher() {
        }
    }

    private static final class LegacyAsyncDispatcher extends Dispatcher {

        /* renamed from: a */
        private final ConcurrentLinkedQueue<EventWithSubscriber> f17362a = Queues.m28542b();

        private static final class EventWithSubscriber {
        }

        private LegacyAsyncDispatcher() {
        }
    }

    private static final class PerThreadQueuedDispatcher extends Dispatcher {

        /* renamed from: a */
        private final ThreadLocal<Queue<Event>> f17363a;

        /* renamed from: b */
        private final ThreadLocal<Boolean> f17364b;

        private static final class Event {
        }

        private PerThreadQueuedDispatcher() {
            this.f17363a = new ThreadLocal<Queue<Event>>(this) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Queue<Event> initialValue() {
                    return Queues.m28541a();
                }
            };
            this.f17364b = new ThreadLocal<Boolean>(this) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Boolean initialValue() {
                    return Boolean.FALSE;
                }
            };
        }
    }

    Dispatcher() {
    }

    /* renamed from: a */
    static Dispatcher m29240a() {
        return new PerThreadQueuedDispatcher();
    }
}
