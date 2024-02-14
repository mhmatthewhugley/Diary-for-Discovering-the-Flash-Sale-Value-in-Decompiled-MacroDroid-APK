package com.google.firebase.firestore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.util.Preconditions;
import java.util.Iterator;

public class QuerySnapshot implements Iterable<QueryDocumentSnapshot> {

    /* renamed from: a */
    private final Query f5742a;

    /* renamed from: c */
    private final ViewSnapshot f5743c;

    /* renamed from: d */
    private final FirebaseFirestore f5744d;

    /* renamed from: f */
    private final SnapshotMetadata f5745f;

    private class QuerySnapshotIterator implements Iterator<QueryDocumentSnapshot> {

        /* renamed from: a */
        private final Iterator<Document> f5746a;

        QuerySnapshotIterator(Iterator<Document> it) {
            this.f5746a = it;
        }

        /* renamed from: a */
        public QueryDocumentSnapshot next() {
            return QuerySnapshot.this.m7920d(this.f5746a.next());
        }

        public boolean hasNext() {
            return this.f5746a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    QuerySnapshot(Query query, ViewSnapshot viewSnapshot, FirebaseFirestore firebaseFirestore) {
        this.f5742a = (Query) Preconditions.m76513b(query);
        this.f5743c = (ViewSnapshot) Preconditions.m76513b(viewSnapshot);
        this.f5744d = (FirebaseFirestore) Preconditions.m76513b(firebaseFirestore);
        this.f5745f = new SnapshotMetadata(viewSnapshot.mo23989i(), viewSnapshot.mo23990j());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public QueryDocumentSnapshot m7920d(Document document) {
        return QueryDocumentSnapshot.m7918e(this.f5744d, document, this.f5743c.mo23990j(), this.f5743c.mo23985f().contains(document.getKey()));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuerySnapshot)) {
            return false;
        }
        QuerySnapshot querySnapshot = (QuerySnapshot) obj;
        if (!this.f5744d.equals(querySnapshot.f5744d) || !this.f5742a.equals(querySnapshot.f5742a) || !this.f5743c.equals(querySnapshot.f5743c) || !this.f5745f.equals(querySnapshot.f5745f)) {
            return false;
        }
        return true;
    }

    @NonNull
    /* renamed from: f */
    public SnapshotMetadata mo23740f() {
        return this.f5745f;
    }

    public int hashCode() {
        return (((((this.f5744d.hashCode() * 31) + this.f5742a.hashCode()) * 31) + this.f5743c.hashCode()) * 31) + this.f5745f.hashCode();
    }

    @NonNull
    public Iterator<QueryDocumentSnapshot> iterator() {
        return new QuerySnapshotIterator(this.f5743c.mo23983e().iterator());
    }
}
