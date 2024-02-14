package com.google.firebase.firestore.local;

import com.google.firebase.firestore.local.MemoryIndexManager;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.List;

final class SQLiteIndexManager implements IndexManager {

    /* renamed from: a */
    private final MemoryIndexManager.MemoryCollectionParentIndex f54313a = new MemoryIndexManager.MemoryCollectionParentIndex();

    /* renamed from: b */
    private final SQLitePersistence f54314b;

    SQLiteIndexManager(SQLitePersistence sQLitePersistence) {
        this.f54314b = sQLitePersistence;
    }

    /* renamed from: a */
    public void mo62590a(ResourcePath resourcePath) {
        Assert.m76443d(resourcePath.mo62807n() % 2 == 1, "Expected a collection path.", new Object[0]);
        if (this.f54313a.mo62666a(resourcePath)) {
            this.f54314b.mo62744r("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", resourcePath.mo62802i(), EncodedPath.m75290c((ResourcePath) resourcePath.mo62809q()));
        }
    }

    /* renamed from: b */
    public List<ResourcePath> mo62591b(String str) {
        ArrayList arrayList = new ArrayList();
        this.f54314b.mo62742A("SELECT parent FROM collection_parents WHERE collection_id = ?").mo62760a(str).mo62763d(SQLiteIndexManager$$Lambda$1.m75585a(arrayList));
        return arrayList;
    }
}
