package com.google.firebase.events;

public class Event<T> {

    /* renamed from: a */
    private final Class<T> f5619a;

    /* renamed from: b */
    private final T f5620b;

    /* renamed from: a */
    public T mo23659a() {
        return this.f5620b;
    }

    /* renamed from: b */
    public Class<T> mo23660b() {
        return this.f5619a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f5619a, this.f5620b});
    }
}
