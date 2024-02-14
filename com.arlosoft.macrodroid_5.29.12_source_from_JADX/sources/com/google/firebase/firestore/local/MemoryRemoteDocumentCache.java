package com.google.firebase.firestore.local;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class MemoryRemoteDocumentCache implements RemoteDocumentCache {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ImmutableSortedMap<DocumentKey, Pair<MutableDocument, SnapshotVersion>> f54287a = ImmutableSortedMap.Builder.m7652b(DocumentKey.m75845b());

    /* renamed from: b */
    private final MemoryPersistence f54288b;

    private class DocumentIterable implements Iterable<MutableDocument> {
        private DocumentIterable() {
        }

        @NonNull
        public Iterator<MutableDocument> iterator() {
            final Iterator it = MemoryRemoteDocumentCache.this.f54287a.iterator();
            return new Iterator<MutableDocument>() {
                /* renamed from: a */
                public MutableDocument next() {
                    return (MutableDocument) ((Pair) ((Map.Entry) it.next()).getValue()).first;
                }

                public boolean hasNext() {
                    return it.hasNext();
                }
            };
        }
    }

    MemoryRemoteDocumentCache(MemoryPersistence memoryPersistence) {
        this.f54288b = memoryPersistence;
    }

    /* renamed from: a */
    public MutableDocument mo62699a(DocumentKey documentKey) {
        Pair d = this.f54287a.mo23534d(documentKey);
        return d != null ? ((MutableDocument) d.first).clone() : MutableDocument.m75872q(documentKey);
    }

    /* renamed from: b */
    public void mo62700b(DocumentKey documentKey) {
        this.f54287a = this.f54287a.mo23542l(documentKey);
    }

    /* renamed from: c */
    public Map<DocumentKey, MutableDocument> mo62701c(Iterable<DocumentKey> iterable) {
        HashMap hashMap = new HashMap();
        for (DocumentKey next : iterable) {
            hashMap.put(next, mo62699a(next));
        }
        return hashMap;
    }

    /* renamed from: d */
    public void mo62702d(MutableDocument mutableDocument, SnapshotVersion snapshotVersion) {
        Assert.m76443d(!snapshotVersion.equals(SnapshotVersion.f54468c), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        this.f54287a = this.f54287a.mo23540j(mutableDocument.getKey(), new Pair(mutableDocument.clone(), snapshotVersion));
        this.f54288b.mo62686b().mo62590a((ResourcePath) mutableDocument.getKey().mo62832k().mo62809q());
    }

    /* renamed from: e */
    public ImmutableSortedMap<DocumentKey, MutableDocument> mo62703e(Query query, SnapshotVersion snapshotVersion) {
        Assert.m76443d(!query.mo23929r(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ImmutableSortedMap<DocumentKey, MutableDocument> b = DocumentCollections.m75843b();
        ResourcePath m = query.mo23924m();
        Iterator<Map.Entry<DocumentKey, Pair<MutableDocument, SnapshotVersion>>> k = this.f54287a.mo23541k(DocumentKey.m75849i((ResourcePath) m.mo62796d("")));
        while (k.hasNext()) {
            Map.Entry next = k.next();
            if (!m.mo62806m(((DocumentKey) next.getKey()).mo62832k())) {
                break;
            }
            MutableDocument mutableDocument = (MutableDocument) ((Pair) next.getValue()).first;
            if (mutableDocument.mo62822e() && ((SnapshotVersion) ((Pair) next.getValue()).second).compareTo(snapshotVersion) > 0 && query.mo23931t(mutableDocument)) {
                b = b.mo23540j(mutableDocument.getKey(), mutableDocument.clone());
            }
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo62704g(LocalSerializer localSerializer) {
        Iterator<MutableDocument> it = new DocumentIterable().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) localSerializer.mo62601j(it.next()).mo65174c();
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Iterable<MutableDocument> mo62705h() {
        return new DocumentIterable();
    }
}
