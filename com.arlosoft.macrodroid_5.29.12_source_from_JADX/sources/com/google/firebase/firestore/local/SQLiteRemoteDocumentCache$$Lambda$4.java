package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;

/* compiled from: SQLiteRemoteDocumentCache */
final /* synthetic */ class SQLiteRemoteDocumentCache$$Lambda$4 implements Runnable {

    /* renamed from: a */
    private final SQLiteRemoteDocumentCache f54386a;

    /* renamed from: c */
    private final byte[] f54387c;

    /* renamed from: d */
    private final Query f54388d;

    /* renamed from: f */
    private final ImmutableSortedMap[] f54389f;

    private SQLiteRemoteDocumentCache$$Lambda$4(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, byte[] bArr, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        this.f54386a = sQLiteRemoteDocumentCache;
        this.f54387c = bArr;
        this.f54388d = query;
        this.f54389f = immutableSortedMapArr;
    }

    /* renamed from: a */
    public static Runnable m75714a(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, byte[] bArr, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        return new SQLiteRemoteDocumentCache$$Lambda$4(sQLiteRemoteDocumentCache, bArr, query, immutableSortedMapArr);
    }

    public void run() {
        SQLiteRemoteDocumentCache.m75703i(this.f54386a, this.f54387c, this.f54388d, this.f54389f);
    }
}
