package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: LruGarbageCollector */
final /* synthetic */ class LruGarbageCollector$$Lambda$2 implements Consumer {

    /* renamed from: a */
    private final LruGarbageCollector.RollingSequenceNumberBuffer f54257a;

    private LruGarbageCollector$$Lambda$2(LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer) {
        this.f54257a = rollingSequenceNumberBuffer;
    }

    /* renamed from: a */
    public static Consumer m75421a(LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer) {
        return new LruGarbageCollector$$Lambda$2(rollingSequenceNumberBuffer);
    }

    public void accept(Object obj) {
        this.f54257a.mo62652a((Long) obj);
    }
}
