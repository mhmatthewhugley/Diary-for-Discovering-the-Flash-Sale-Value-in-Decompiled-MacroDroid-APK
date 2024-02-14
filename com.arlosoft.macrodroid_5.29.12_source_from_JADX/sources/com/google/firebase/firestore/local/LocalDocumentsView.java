package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.util.Assert;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class LocalDocumentsView {

    /* renamed from: a */
    private final RemoteDocumentCache f54173a;

    /* renamed from: b */
    private final MutationQueue f54174b;

    /* renamed from: c */
    private final IndexManager f54175c;

    LocalDocumentsView(RemoteDocumentCache remoteDocumentCache, MutationQueue mutationQueue, IndexManager indexManager) {
        this.f54173a = remoteDocumentCache;
        this.f54174b = mutationQueue;
        this.f54175c = indexManager;
    }

    /* renamed from: a */
    private ImmutableSortedMap<DocumentKey, MutableDocument> m75305a(List<MutationBatch> list, ImmutableSortedMap<DocumentKey, MutableDocument> immutableSortedMap) {
        HashSet hashSet = new HashSet();
        for (MutationBatch h : list) {
            for (Mutation next : h.mo62918h()) {
                if ((next instanceof PatchMutation) && !immutableSortedMap.mo23533c(next.mo62902e())) {
                    hashSet.add(next.mo62902e());
                }
            }
        }
        for (Map.Entry next2 : this.f54173a.mo62701c(hashSet).entrySet()) {
            if (((MutableDocument) next2.getValue()).mo62822e()) {
                immutableSortedMap = immutableSortedMap.mo23540j((DocumentKey) next2.getKey(), (MutableDocument) next2.getValue());
            }
        }
        return immutableSortedMap;
    }

    /* renamed from: b */
    private void m75306b(Map<DocumentKey, MutableDocument> map, List<MutationBatch> list) {
        for (Map.Entry next : map.entrySet()) {
            for (MutationBatch b : list) {
                b.mo62911b((MutableDocument) next.getValue());
            }
        }
    }

    /* renamed from: d */
    private Document m75307d(DocumentKey documentKey, List<MutationBatch> list) {
        MutableDocument a = this.f54173a.mo62699a(documentKey);
        for (MutationBatch b : list) {
            b.mo62911b(a);
        }
        return a;
    }

    /* renamed from: f */
    private ImmutableSortedMap<DocumentKey, Document> m75308f(Query query, SnapshotVersion snapshotVersion) {
        Assert.m76443d(query.mo23924m().mo62804k(), "Currently we only support collection group queries at the root.", new Object[0]);
        String d = query.mo23913d();
        ImmutableSortedMap<DocumentKey, Document> a = DocumentCollections.m75842a();
        for (ResourcePath d2 : this.f54175c.mo62591b(d)) {
            Iterator<Map.Entry<DocumentKey, Document>> it = m75309g(query.mo23911a((ResourcePath) d2.mo62796d(d)), snapshotVersion).iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                a = a.mo23540j((DocumentKey) next.getKey(), (Document) next.getValue());
            }
        }
        return a;
    }

    /* renamed from: g */
    private ImmutableSortedMap<DocumentKey, Document> m75309g(Query query, SnapshotVersion snapshotVersion) {
        ImmutableSortedMap<DocumentKey, MutableDocument> e = this.f54173a.mo62703e(query, snapshotVersion);
        List<MutationBatch> l = this.f54174b.mo62679l(query);
        ImmutableSortedMap<DocumentKey, MutableDocument> a = m75305a(l, e);
        for (MutationBatch next : l) {
            for (Mutation next2 : next.mo62918h()) {
                if (query.mo23924m().mo62805l(next2.mo62902e().mo62832k())) {
                    DocumentKey e2 = next2.mo62902e();
                    MutableDocument d = a.mo23534d(e2);
                    if (d == null) {
                        d = MutableDocument.m75872q(e2);
                        a = a.mo23540j(e2, d);
                    }
                    next2.mo62887a(d, next.mo62917g());
                    if (!d.mo62822e()) {
                        a = a.mo23542l(e2);
                    }
                }
            }
        }
        ImmutableSortedMap<DocumentKey, Document> a2 = DocumentCollections.m75842a();
        Iterator<Map.Entry<DocumentKey, MutableDocument>> it = a.iterator();
        while (it.hasNext()) {
            Map.Entry next3 = it.next();
            if (query.mo23931t((Document) next3.getValue())) {
                a2 = a2.mo23540j((DocumentKey) next3.getKey(), (Document) next3.getValue());
            }
        }
        return a2;
    }

    /* renamed from: h */
    private ImmutableSortedMap<DocumentKey, Document> m75310h(ResourcePath resourcePath) {
        ImmutableSortedMap<DocumentKey, Document> a = DocumentCollections.m75842a();
        Document c = mo62592c(DocumentKey.m75849i(resourcePath));
        return c.mo62822e() ? a.mo23540j(c.getKey(), c) : a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Document mo62592c(DocumentKey documentKey) {
        return m75307d(documentKey, this.f54174b.mo62675h(documentKey));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ImmutableSortedMap<DocumentKey, Document> mo62593e(Iterable<DocumentKey> iterable) {
        return mo62595j(this.f54173a.mo62701c(iterable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public ImmutableSortedMap<DocumentKey, Document> mo62594i(Query query, SnapshotVersion snapshotVersion) {
        ResourcePath m = query.mo23924m();
        if (query.mo23930s()) {
            return m75310h(m);
        }
        if (query.mo23929r()) {
            return m75308f(query, snapshotVersion);
        }
        return m75309g(query, snapshotVersion);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ImmutableSortedMap<DocumentKey, Document> mo62595j(Map<DocumentKey, MutableDocument> map) {
        ImmutableSortedMap<DocumentKey, Document> a = DocumentCollections.m75842a();
        m75306b(map, this.f54174b.mo62669b(map.keySet()));
        for (Map.Entry next : map.entrySet()) {
            a = a.mo23540j((DocumentKey) next.getKey(), (Document) next.getValue());
        }
        return a;
    }
}
