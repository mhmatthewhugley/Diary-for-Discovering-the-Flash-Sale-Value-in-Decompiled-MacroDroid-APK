package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import java.util.Map;

interface RemoteDocumentCache {
    /* renamed from: a */
    MutableDocument mo62699a(DocumentKey documentKey);

    /* renamed from: b */
    void mo62700b(DocumentKey documentKey);

    /* renamed from: c */
    Map<DocumentKey, MutableDocument> mo62701c(Iterable<DocumentKey> iterable);

    /* renamed from: d */
    void mo62702d(MutableDocument mutableDocument, SnapshotVersion snapshotVersion);

    /* renamed from: e */
    ImmutableSortedMap<DocumentKey, MutableDocument> mo62703e(Query query, SnapshotVersion snapshotVersion);
}
