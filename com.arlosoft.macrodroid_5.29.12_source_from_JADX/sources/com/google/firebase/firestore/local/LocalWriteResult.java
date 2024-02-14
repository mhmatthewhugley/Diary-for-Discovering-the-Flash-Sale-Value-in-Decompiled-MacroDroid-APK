package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;

public final class LocalWriteResult {

    /* renamed from: a */
    private final int f54235a;

    /* renamed from: b */
    private final ImmutableSortedMap<DocumentKey, Document> f54236b;

    LocalWriteResult(int i, ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        this.f54235a = i;
        this.f54236b = immutableSortedMap;
    }

    /* renamed from: a */
    public int mo62636a() {
        return this.f54235a;
    }

    /* renamed from: b */
    public ImmutableSortedMap<DocumentKey, Document> mo62637b() {
        return this.f54236b;
    }
}
