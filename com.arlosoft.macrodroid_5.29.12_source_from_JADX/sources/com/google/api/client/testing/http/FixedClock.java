package com.google.api.client.testing.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Clock;
import java.util.concurrent.atomic.AtomicLong;

@Beta
public class FixedClock implements Clock {

    /* renamed from: b */
    private AtomicLong f52678b;

    public FixedClock() {
        this(0);
    }

    /* renamed from: a */
    public long mo60637a() {
        return this.f52678b.get();
    }

    public FixedClock(long j) {
        this.f52678b = new AtomicLong(j);
    }
}
