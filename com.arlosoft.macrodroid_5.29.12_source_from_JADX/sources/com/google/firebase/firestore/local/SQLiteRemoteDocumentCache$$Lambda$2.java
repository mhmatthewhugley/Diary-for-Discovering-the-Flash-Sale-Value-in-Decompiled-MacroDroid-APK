package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.firestore.util.Consumer;
import java.util.Map;

/* compiled from: SQLiteRemoteDocumentCache */
final /* synthetic */ class SQLiteRemoteDocumentCache$$Lambda$2 implements Consumer {

    /* renamed from: a */
    private final SQLiteRemoteDocumentCache f54379a;

    /* renamed from: b */
    private final Map f54380b;

    private SQLiteRemoteDocumentCache$$Lambda$2(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, Map map) {
        this.f54379a = sQLiteRemoteDocumentCache;
        this.f54380b = map;
    }

    /* renamed from: a */
    public static Consumer m75712a(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, Map map) {
        return new SQLiteRemoteDocumentCache$$Lambda$2(sQLiteRemoteDocumentCache, map);
    }

    public void accept(Object obj) {
        SQLiteRemoteDocumentCache.m75702h(this.f54379a, this.f54380b, (Cursor) obj);
    }
}
