package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: LruGarbageCollector */
final /* synthetic */ class LruGarbageCollector$$Lambda$1 implements Consumer {

    /* renamed from: a */
    private final LruGarbageCollector.RollingSequenceNumberBuffer f54256a;

    private LruGarbageCollector$$Lambda$1(LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer) {
        this.f54256a = rollingSequenceNumberBuffer;
    }

    /* renamed from: a */
    public static Consumer m75420a(LruGarbageCollector.RollingSequenceNumberBuffer rollingSequenceNumberBuffer) {
        return new LruGarbageCollector$$Lambda$1(rollingSequenceNumberBuffer);
    }

    public void accept(Object obj) {
        this.f54256a.mo62652a(Long.valueOf(((TargetData) obj).mo62784d()));
    }
}
