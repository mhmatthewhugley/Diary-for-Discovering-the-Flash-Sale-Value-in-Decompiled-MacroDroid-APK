package com.google.firebase.firestore.core;

public class ListenSequence {

    /* renamed from: a */
    private long f5934a;

    public ListenSequence(long j) {
        this.f5934a = j;
    }

    /* renamed from: a */
    public long mo23896a() {
        long j = this.f5934a + 1;
        this.f5934a = j;
        return j;
    }
}
