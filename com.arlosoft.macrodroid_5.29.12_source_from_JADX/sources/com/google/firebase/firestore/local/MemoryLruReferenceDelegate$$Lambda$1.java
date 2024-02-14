package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.Consumer;

/* compiled from: MemoryLruReferenceDelegate */
final /* synthetic */ class MemoryLruReferenceDelegate$$Lambda$1 implements Consumer {

    /* renamed from: a */
    private final long[] f54274a;

    private MemoryLruReferenceDelegate$$Lambda$1(long[] jArr) {
        this.f54274a = jArr;
    }

    /* renamed from: a */
    public static Consumer m75462a(long[] jArr) {
        return new MemoryLruReferenceDelegate$$Lambda$1(jArr);
    }

    public void accept(Object obj) {
        MemoryLruReferenceDelegate.m75444r(this.f54274a, (Long) obj);
    }
}
