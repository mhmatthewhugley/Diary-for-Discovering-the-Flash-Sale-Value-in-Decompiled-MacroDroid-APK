package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Consumer;

/* compiled from: SQLiteRemoteDocumentCache */
final /* synthetic */ class SQLiteRemoteDocumentCache$$Lambda$3 implements Consumer {

    /* renamed from: a */
    private final SQLiteRemoteDocumentCache f54381a;

    /* renamed from: b */
    private final int f54382b;

    /* renamed from: c */
    private final BackgroundQueue f54383c;

    /* renamed from: d */
    private final Query f54384d;

    /* renamed from: e */
    private final ImmutableSortedMap[] f54385e;

    private SQLiteRemoteDocumentCache$$Lambda$3(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, int i, BackgroundQueue backgroundQueue, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        this.f54381a = sQLiteRemoteDocumentCache;
        this.f54382b = i;
        this.f54383c = backgroundQueue;
        this.f54384d = query;
        this.f54385e = immutableSortedMapArr;
    }

    /* renamed from: a */
    public static Consumer m75713a(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, int i, BackgroundQueue backgroundQueue, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        return new SQLiteRemoteDocumentCache$$Lambda$3(sQLiteRemoteDocumentCache, i, backgroundQueue, query, immutableSortedMapArr);
    }

    public void accept(Object obj) {
        SQLiteRemoteDocumentCache.m75704j(this.f54381a, this.f54382b, this.f54383c, this.f54384d, this.f54385e, (Cursor) obj);
    }
}
