package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Queues {
    private Queues() {
    }

    /* renamed from: a */
    public static <E> ArrayDeque<E> m28541a() {
        return new ArrayDeque<>();
    }

    @GwtIncompatible
    /* renamed from: b */
    public static <E> ConcurrentLinkedQueue<E> m28542b() {
        return new ConcurrentLinkedQueue<>();
    }
}
