package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

public final class OnDemandCounter {

    /* renamed from: a */
    private final AtomicInteger f5023a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f5024b = new AtomicInteger();

    /* renamed from: a */
    public void mo23056a() {
        this.f5024b.getAndIncrement();
    }

    /* renamed from: b */
    public void mo23057b() {
        this.f5023a.getAndIncrement();
    }

    /* renamed from: c */
    public void mo23058c() {
        this.f5024b.set(0);
    }
}
