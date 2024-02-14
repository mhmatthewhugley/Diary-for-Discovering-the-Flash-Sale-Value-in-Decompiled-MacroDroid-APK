package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Ticker {

    /* renamed from: a */
    private static final Ticker f4264a = new Ticker() {
        /* renamed from: a */
        public long mo22274a() {
            return Platform.m5368f();
        }
    };

    protected Ticker() {
    }

    /* renamed from: b */
    public static Ticker m5495b() {
        return f4264a;
    }

    /* renamed from: a */
    public abstract long mo22274a();
}
