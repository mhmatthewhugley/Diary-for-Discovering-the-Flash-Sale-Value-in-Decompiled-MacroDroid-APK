package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.DocumentKey;
import java.util.Collections;
import java.util.Iterator;

public class ReferenceSet {

    /* renamed from: a */
    private ImmutableSortedSet<DocumentReference> f54306a = new ImmutableSortedSet<>(Collections.emptyList(), DocumentReference.f54163c);

    /* renamed from: b */
    private ImmutableSortedSet<DocumentReference> f54307b = new ImmutableSortedSet<>(Collections.emptyList(), DocumentReference.f54164d);

    /* renamed from: e */
    private void m75560e(DocumentReference documentReference) {
        this.f54306a = this.f54306a.mo23563i(documentReference);
        this.f54307b = this.f54307b.mo23563i(documentReference);
    }

    /* renamed from: a */
    public void mo62728a(DocumentKey documentKey, int i) {
        DocumentReference documentReference = new DocumentReference(documentKey, i);
        this.f54306a = this.f54306a.mo23560f(documentReference);
        this.f54307b = this.f54307b.mo23560f(documentReference);
    }

    /* renamed from: b */
    public void mo62729b(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            mo62728a(it.next(), i);
        }
    }

    /* renamed from: c */
    public boolean mo62730c(DocumentKey documentKey) {
        Iterator<DocumentReference> h = this.f54306a.mo23561h(new DocumentReference(documentKey, 0));
        if (!h.hasNext()) {
            return false;
        }
        return h.next().mo62582b().equals(documentKey);
    }

    /* renamed from: d */
    public ImmutableSortedSet<DocumentKey> mo62731d(int i) {
        Iterator<DocumentReference> h = this.f54307b.mo23561h(new DocumentReference(DocumentKey.m75846e(), i));
        ImmutableSortedSet<DocumentKey> f = DocumentKey.m75847f();
        while (h.hasNext()) {
            DocumentReference next = h.next();
            if (next.mo62581a() != i) {
                break;
            }
            f = f.mo23560f(next.mo62582b());
        }
        return f;
    }

    /* renamed from: f */
    public void mo62732f(DocumentKey documentKey, int i) {
        m75560e(new DocumentReference(documentKey, i));
    }

    /* renamed from: g */
    public void mo62733g(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            mo62732f(it.next(), i);
        }
    }

    /* renamed from: h */
    public ImmutableSortedSet<DocumentKey> mo62734h(int i) {
        Iterator<DocumentReference> h = this.f54307b.mo23561h(new DocumentReference(DocumentKey.m75846e(), i));
        ImmutableSortedSet<DocumentKey> f = DocumentKey.m75847f();
        while (h.hasNext()) {
            DocumentReference next = h.next();
            if (next.mo62581a() != i) {
                break;
            }
            f = f.mo23560f(next.mo62582b());
            m75560e(next);
        }
        return f;
    }
}
