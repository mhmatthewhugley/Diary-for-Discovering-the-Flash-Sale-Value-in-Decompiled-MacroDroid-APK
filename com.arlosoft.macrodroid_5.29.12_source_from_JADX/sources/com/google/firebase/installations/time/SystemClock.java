package com.google.firebase.installations.time;

public class SystemClock implements Clock {

    /* renamed from: a */
    private static SystemClock f54926a;

    private SystemClock() {
    }

    /* renamed from: b */
    public static SystemClock m76773b() {
        if (f54926a == null) {
            f54926a = new SystemClock();
        }
        return f54926a;
    }

    /* renamed from: a */
    public long mo63311a() {
        return System.currentTimeMillis();
    }
}
