package com.google.firebase.firestore.model;

import java.util.Comparator;

/* compiled from: Document */
final /* synthetic */ class Document$$Lambda$1 implements Comparator {

    /* renamed from: a */
    private static final Document$$Lambda$1 f54440a = new Document$$Lambda$1();

    private Document$$Lambda$1() {
    }

    /* renamed from: a */
    public static Comparator m75841a() {
        return f54440a;
    }

    public int compare(Object obj, Object obj2) {
        return ((Document) obj).getKey().compareTo(((Document) obj2).getKey());
    }
}
