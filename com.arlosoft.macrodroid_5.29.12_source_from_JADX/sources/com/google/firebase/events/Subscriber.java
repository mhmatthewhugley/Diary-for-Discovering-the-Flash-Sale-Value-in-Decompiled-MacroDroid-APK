package com.google.firebase.events;

import java.util.concurrent.Executor;

public interface Subscriber {
    /* renamed from: a */
    <T> void mo22917a(Class<T> cls, EventHandler<? super T> eventHandler);

    /* renamed from: b */
    <T> void mo22918b(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler);
}
