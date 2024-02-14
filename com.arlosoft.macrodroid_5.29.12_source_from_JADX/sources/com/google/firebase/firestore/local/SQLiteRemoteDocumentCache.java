package com.google.firebase.firestore.local;

import android.database.Cursor;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.local.SQLitePersistence;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.proto.MaybeDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.BackgroundQueue;
import com.google.firebase.firestore.util.Executors;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

final class SQLiteRemoteDocumentCache implements RemoteDocumentCache {

    /* renamed from: a */
    private final SQLitePersistence f54376a;

    /* renamed from: b */
    private final LocalSerializer f54377b;

    SQLiteRemoteDocumentCache(SQLitePersistence sQLitePersistence, LocalSerializer localSerializer) {
        this.f54376a = sQLitePersistence;
        this.f54377b = localSerializer;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public MutableDocument m75700f(byte[] bArr) {
        try {
            return this.f54377b.mo62597c(MaybeDocument.m76019e0(bArr));
        } catch (InvalidProtocolBufferException e) {
            throw Assert.m76440a("MaybeDocument failed to parse: %s", e);
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m75702h(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, Map map, Cursor cursor) {
        MutableDocument f = sQLiteRemoteDocumentCache.m75700f(cursor.getBlob(0));
        map.put(f.getKey(), f);
    }

    /* renamed from: i */
    static /* synthetic */ void m75703i(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, byte[] bArr, Query query, ImmutableSortedMap[] immutableSortedMapArr) {
        MutableDocument f = sQLiteRemoteDocumentCache.m75700f(bArr);
        if (f.mo62822e() && query.mo23931t(f)) {
            synchronized (sQLiteRemoteDocumentCache) {
                immutableSortedMapArr[0] = immutableSortedMapArr[0].mo23540j(f.getKey(), f);
            }
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m75704j(SQLiteRemoteDocumentCache sQLiteRemoteDocumentCache, int i, BackgroundQueue backgroundQueue, Query query, ImmutableSortedMap[] immutableSortedMapArr, Cursor cursor) {
        if (EncodedPath.m75289b(cursor.getString(0)).mo62807n() == i) {
            byte[] blob = cursor.getBlob(1);
            Executor executor = backgroundQueue;
            if (cursor.isLast()) {
                executor = Executors.f54770b;
            }
            executor.execute(SQLiteRemoteDocumentCache$$Lambda$4.m75714a(sQLiteRemoteDocumentCache, blob, query, immutableSortedMapArr));
        }
    }

    /* renamed from: k */
    private String m75705k(DocumentKey documentKey) {
        return EncodedPath.m75290c(documentKey.mo62832k());
    }

    /* renamed from: a */
    public MutableDocument mo62699a(DocumentKey documentKey) {
        MutableDocument mutableDocument = (MutableDocument) this.f54376a.mo62742A("SELECT contents FROM remote_documents WHERE path = ?").mo62760a(m75705k(documentKey)).mo62762c(SQLiteRemoteDocumentCache$$Lambda$1.m75711a(this));
        return mutableDocument != null ? mutableDocument : MutableDocument.m75872q(documentKey);
    }

    /* renamed from: b */
    public void mo62700b(DocumentKey documentKey) {
        String k = m75705k(documentKey);
        this.f54376a.mo62744r("DELETE FROM remote_documents WHERE path = ?", k);
    }

    /* renamed from: c */
    public Map<DocumentKey, MutableDocument> mo62701c(Iterable<DocumentKey> iterable) {
        ArrayList arrayList = new ArrayList();
        for (DocumentKey k : iterable) {
            arrayList.add(EncodedPath.m75290c(k.mo62832k()));
        }
        HashMap hashMap = new HashMap();
        for (DocumentKey next : iterable) {
            hashMap.put(next, MutableDocument.m75872q(next));
        }
        SQLitePersistence.LongQuery longQuery = new SQLitePersistence.LongQuery(this.f54376a, "SELECT contents FROM remote_documents WHERE path IN (", arrayList, ") ORDER BY path");
        while (longQuery.mo62753b()) {
            longQuery.mo62754c().mo62763d(SQLiteRemoteDocumentCache$$Lambda$2.m75712a(this, hashMap));
        }
        return hashMap;
    }

    /* renamed from: d */
    public void mo62702d(MutableDocument mutableDocument, SnapshotVersion snapshotVersion) {
        Assert.m76443d(!snapshotVersion.equals(SnapshotVersion.f54468c), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        String k = m75705k(mutableDocument.getKey());
        Timestamp d = snapshotVersion.mo62876d();
        MaybeDocument j = this.f54377b.mo62601j(mutableDocument);
        this.f54376a.mo62744r("INSERT OR REPLACE INTO remote_documents (path, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?)", k, Long.valueOf(d.mo61973e()), Integer.valueOf(d.mo61971d()), j.mo64718h());
        this.f54376a.mo62686b().mo62590a((ResourcePath) mutableDocument.getKey().mo62832k().mo62809q());
    }

    /* renamed from: e */
    public ImmutableSortedMap<DocumentKey, MutableDocument> mo62703e(Query query, SnapshotVersion snapshotVersion) {
        SQLitePersistence.Query query2;
        Assert.m76443d(!query.mo23929r(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath m = query.mo23924m();
        int n = m.mo62807n() + 1;
        String c = EncodedPath.m75290c(m);
        String f = EncodedPath.m75293f(c);
        Timestamp d = snapshotVersion.mo62876d();
        BackgroundQueue backgroundQueue = new BackgroundQueue();
        ImmutableSortedMap<DocumentKey, MutableDocument>[] immutableSortedMapArr = {DocumentCollections.m75843b()};
        if (snapshotVersion.equals(SnapshotVersion.f54468c)) {
            query2 = this.f54376a.mo62742A("SELECT path, contents FROM remote_documents WHERE path >= ? AND path < ?").mo62760a(c, f);
        } else {
            query2 = this.f54376a.mo62742A("SELECT path, contents FROM remote_documents WHERE path >= ? AND path < ?AND (read_time_seconds > ? OR (read_time_seconds = ? AND read_time_nanos > ?))").mo62760a(c, f, Long.valueOf(d.mo61973e()), Long.valueOf(d.mo61973e()), Integer.valueOf(d.mo61971d()));
        }
        query2.mo62763d(SQLiteRemoteDocumentCache$$Lambda$3.m75713a(this, n, backgroundQueue, query, immutableSortedMapArr));
        try {
            backgroundQueue.mo63173a();
        } catch (InterruptedException e) {
            Assert.m76440a("Interrupted while deserializing documents", e);
        }
        return immutableSortedMapArr[0];
    }
}
