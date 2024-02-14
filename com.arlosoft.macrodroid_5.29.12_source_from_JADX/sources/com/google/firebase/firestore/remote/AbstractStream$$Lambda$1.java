package com.google.firebase.firestore.remote;

/* compiled from: AbstractStream */
final /* synthetic */ class AbstractStream$$Lambda$1 implements Runnable {

    /* renamed from: a */
    private final AbstractStream f54535a;

    private AbstractStream$$Lambda$1(AbstractStream abstractStream) {
        this.f54535a = abstractStream;
    }

    /* renamed from: a */
    public static Runnable m76153a(AbstractStream abstractStream) {
        return new AbstractStream$$Lambda$1(abstractStream);
    }

    public void run() {
        AbstractStream.m76132l(this.f54535a);
    }
}
