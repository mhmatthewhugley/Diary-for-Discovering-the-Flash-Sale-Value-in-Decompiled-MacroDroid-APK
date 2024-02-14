package com.google.firebase.firestore.local;

import java.util.Comparator;

/* compiled from: LruGarbageCollector */
final /* synthetic */ class LruGarbageCollector$RollingSequenceNumberBuffer$$Lambda$1 implements Comparator {

    /* renamed from: a */
    private static final LruGarbageCollector$RollingSequenceNumberBuffer$$Lambda$1 f54258a = new LruGarbageCollector$RollingSequenceNumberBuffer$$Lambda$1();

    private LruGarbageCollector$RollingSequenceNumberBuffer$$Lambda$1() {
    }

    /* renamed from: a */
    public static Comparator m75422a() {
        return f54258a;
    }

    public int compare(Object obj, Object obj2) {
        return ((Long) obj2).compareTo((Long) obj);
    }
}
