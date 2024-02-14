package com.google.firebase.firestore.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public final class DocumentSet implements Iterable<Document> {

    /* renamed from: a */
    private final ImmutableSortedMap<DocumentKey, Document> f54446a;

    /* renamed from: c */
    private final ImmutableSortedSet<Document> f54447c;

    private DocumentSet(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, ImmutableSortedSet<Document> immutableSortedSet) {
        this.f54446a = immutableSortedMap;
        this.f54447c = immutableSortedSet;
    }

    /* renamed from: d */
    public static DocumentSet m75856d(Comparator<Document> comparator) {
        return new DocumentSet(DocumentCollections.m75842a(), new ImmutableSortedSet(Collections.emptyList(), DocumentSet$$Lambda$1.m75863a(comparator)));
    }

    /* renamed from: j */
    static /* synthetic */ int m75857j(Comparator comparator, Document document, Document document2) {
        int compare = comparator.compare(document, document2);
        return compare == 0 ? Document.f54439t.compare(document, document2) : compare;
    }

    /* renamed from: c */
    public DocumentSet mo62836c(Document document) {
        DocumentSet k = mo62844k(document.getKey());
        return new DocumentSet(k.f54446a.mo23540j(document.getKey(), document), k.f54447c.mo23560f(document));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DocumentSet.class != obj.getClass()) {
            return false;
        }
        DocumentSet documentSet = (DocumentSet) obj;
        if (size() != documentSet.size()) {
            return false;
        }
        Iterator<Document> it = iterator();
        Iterator<Document> it2 = documentSet.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: f */
    public Document mo62838f(DocumentKey documentKey) {
        return this.f54446a.mo23534d(documentKey);
    }

    @Nullable
    /* renamed from: h */
    public Document mo62839h() {
        return this.f54447c.mo23558d();
    }

    public int hashCode() {
        Iterator<Document> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Document next = it.next();
            i = (((i * 31) + next.getKey().hashCode()) * 31) + next.getData().hashCode();
        }
        return i;
    }

    @Nullable
    /* renamed from: i */
    public Document mo62841i() {
        return this.f54447c.mo23556c();
    }

    public boolean isEmpty() {
        return this.f54446a.isEmpty();
    }

    @NonNull
    public Iterator<Document> iterator() {
        return this.f54447c.iterator();
    }

    /* renamed from: k */
    public DocumentSet mo62844k(DocumentKey documentKey) {
        Document d = this.f54446a.mo23534d(documentKey);
        if (d == null) {
            return this;
        }
        return new DocumentSet(this.f54446a.mo23542l(documentKey), this.f54447c.mo23563i(d));
    }

    public int size() {
        return this.f54446a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Document> it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Document next = it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append("]");
        return sb.toString();
    }
}
