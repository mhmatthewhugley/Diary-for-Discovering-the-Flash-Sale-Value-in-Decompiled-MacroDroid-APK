package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Function;

/* compiled from: SQLiteRemoteDocumentCache */
final /* synthetic */ class SQLiteRemoteDocumentCache$$Lambda$1 implements Function {

    /* renamed from: a */
    private final SQLiteRemoteDocumentCache f54378a;

    private SQLiteRemoteDocumentCache$$Lambda$1(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache) {
        this.f54378a = sQLiteRemoteDocumentCache;
    }

    /* renamed from: a */
    public static Function m75711a(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache) {
        return new SQLiteRemoteDocumentCache$$Lambda$1(sQLiteRemoteDocumentCache);
    }

    public Object apply(Object obj) {
        return this.f54378a.m75700f(((Cursor) obj).getBlob(0));
    }
}
