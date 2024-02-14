package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;

public class QueryResult {

    /* renamed from: a */
    private final ImmutableSortedMap<DocumentKey, Document> f54304a;

    /* renamed from: b */
    private final ImmutableSortedSet<DocumentKey> f54305b;

    public QueryResult(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        this.f54304a = immutableSortedMap;
        this.f54305b = immutableSortedSet;
    }

    /* renamed from: a */
    public ImmutableSortedMap<DocumentKey, Document> mo62726a() {
        return this.f54304a;
    }

    /* renamed from: b */
    public ImmutableSortedSet<DocumentKey> mo62727b() {
        return this.f54305b;
    }
}
