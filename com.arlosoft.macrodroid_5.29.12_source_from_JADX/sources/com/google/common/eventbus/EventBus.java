package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@ElementTypesAreNonnullByDefault
public class EventBus {

    /* renamed from: f */
    private static final Logger f17365f = Logger.getLogger(EventBus.class.getName());

    /* renamed from: a */
    private final String f17366a;

    /* renamed from: b */
    private final Executor f17367b;

    /* renamed from: c */
    private final SubscriberExceptionHandler f17368c;

    /* renamed from: d */
    private final SubscriberRegistry f17369d;

    /* renamed from: e */
    private final Dispatcher f17370e;

    static final class LoggingHandler implements SubscriberExceptionHandler {

        /* renamed from: a */
        static final LoggingHandler f17371a = new LoggingHandler();

        LoggingHandler() {
        }
    }

    public EventBus() {
        this("default");
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22196k(this.f17366a).toString();
    }

    public EventBus(String str) {
        this(str, MoreExecutors.m74259a(), Dispatcher.m29240a(), LoggingHandler.f17371a);
    }

    EventBus(String str, Executor executor, Dispatcher dispatcher, SubscriberExceptionHandler subscriberExceptionHandler) {
        this.f17369d = new SubscriberRegistry(this);
        this.f17366a = (String) Preconditions.m5392s(str);
        this.f17367b = (Executor) Preconditions.m5392s(executor);
        this.f17370e = (Dispatcher) Preconditions.m5392s(dispatcher);
        this.f17368c = (SubscriberExceptionHandler) Preconditions.m5392s(subscriberExceptionHandler);
    }
}
