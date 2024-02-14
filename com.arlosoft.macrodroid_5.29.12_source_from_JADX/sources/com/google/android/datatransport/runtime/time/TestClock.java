package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

public class TestClock implements Clock {

    /* renamed from: a */
    private final AtomicLong f1651a;

    /* renamed from: a */
    public long mo19627a() {
        return this.f1651a.get();
    }
}
