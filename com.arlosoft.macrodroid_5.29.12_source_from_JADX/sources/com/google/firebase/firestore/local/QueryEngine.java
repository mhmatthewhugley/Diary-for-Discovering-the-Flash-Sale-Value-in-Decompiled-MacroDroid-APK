package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;

public interface QueryEngine {
    /* renamed from: a */
    void mo62579a(LocalDocumentsView localDocumentsView);

    /* renamed from: b */
    ImmutableSortedMap<DocumentKey, Document> mo62580b(Query query, SnapshotVersion snapshotVersion, ImmutableSortedSet<DocumentKey> immutableSortedSet);
}
