package com.google.firebase.firestore.model;

import java.util.Comparator;

/* compiled from: DocumentSet */
final /* synthetic */ class DocumentSet$$Lambda$1 implements Comparator {

    /* renamed from: a */
    private final Comparator f54448a;

    private DocumentSet$$Lambda$1(Comparator comparator) {
        this.f54448a = comparator;
    }

    /* renamed from: a */
    public static Comparator m75863a(Comparator comparator) {
        return new DocumentSet$$Lambda$1(comparator);
    }

    public int compare(Object obj, Object obj2) {
        return DocumentSet.m75857j(this.f54448a, (Document) obj, (Document) obj2);
    }
}
