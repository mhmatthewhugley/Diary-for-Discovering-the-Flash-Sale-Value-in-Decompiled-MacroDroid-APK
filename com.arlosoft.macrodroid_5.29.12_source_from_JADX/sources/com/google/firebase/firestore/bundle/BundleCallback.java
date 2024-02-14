package com.google.firebase.firestore.bundle;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;

public interface BundleCallback {
    /* renamed from: a */
    ImmutableSortedMap<DocumentKey, Document> mo23761a(ImmutableSortedMap<DocumentKey, MutableDocument> immutableSortedMap, String str);

    /* renamed from: b */
    void mo23762b(NamedQuery namedQuery, ImmutableSortedSet<DocumentKey> immutableSortedSet);

    /* renamed from: c */
    void mo23763c(BundleMetadata bundleMetadata);
}
