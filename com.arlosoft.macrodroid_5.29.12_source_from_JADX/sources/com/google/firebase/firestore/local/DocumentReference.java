package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.util.Util;
import java.util.Comparator;

class DocumentReference {

    /* renamed from: c */
    static final Comparator<DocumentReference> f54163c = DocumentReference$$Lambda$1.m75286a();

    /* renamed from: d */
    static final Comparator<DocumentReference> f54164d = DocumentReference$$Lambda$2.m75287a();

    /* renamed from: a */
    private final DocumentKey f54165a;

    /* renamed from: b */
    private final int f54166b;

    public DocumentReference(DocumentKey documentKey, int i) {
        this.f54165a = documentKey;
        this.f54166b = i;
    }

    /* renamed from: c */
    static /* synthetic */ int m75282c(DocumentReference documentReference, DocumentReference documentReference2) {
        int d = documentReference.f54165a.compareTo(documentReference2.f54165a);
        if (d != 0) {
            return d;
        }
        return Util.m76522e(documentReference.f54166b, documentReference2.f54166b);
    }

    /* renamed from: d */
    static /* synthetic */ int m75283d(DocumentReference documentReference, DocumentReference documentReference2) {
        int e = Util.m76522e(documentReference.f54166b, documentReference2.f54166b);
        if (e != 0) {
            return e;
        }
        return documentReference.f54165a.compareTo(documentReference2.f54165a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo62581a() {
        return this.f54166b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public DocumentKey mo62582b() {
        return this.f54165a;
    }
}
