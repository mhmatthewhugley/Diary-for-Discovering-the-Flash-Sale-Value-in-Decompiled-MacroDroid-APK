package com.google.firebase.firestore.util;

import com.google.firebase.firestore.util.AsyncQueue;
import java.util.Comparator;

/* compiled from: AsyncQueue */
final /* synthetic */ class AsyncQueue$$Lambda$6 implements Comparator {

    /* renamed from: a */
    private static final AsyncQueue$$Lambda$6 f54752a = new AsyncQueue$$Lambda$6();

    private AsyncQueue$$Lambda$6() {
    }

    /* renamed from: a */
    public static Comparator m76486a() {
        return f54752a;
    }

    public int compare(Object obj, Object obj2) {
        return Long.compare(((AsyncQueue.DelayedTask) obj).f54719b, ((AsyncQueue.DelayedTask) obj2).f54719b);
    }
}
