package com.google.firebase.firestore.local;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class DefaultQueryEngine implements QueryEngine {

    /* renamed from: a */
    private LocalDocumentsView f54162a;

    /* renamed from: c */
    private ImmutableSortedSet<Document> m75277c(Query query, ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        ImmutableSortedSet<Document> immutableSortedSet = new ImmutableSortedSet<>(Collections.emptyList(), query.mo23912c());
        Iterator<Map.Entry<DocumentKey, Document>> it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Document document = (Document) it.next().getValue();
            if (query.mo23931t(document)) {
                immutableSortedSet = immutableSortedSet.mo23560f(document);
            }
        }
        return immutableSortedSet;
    }

    /* renamed from: d */
    private ImmutableSortedMap<DocumentKey, Document> m75278d(Query query) {
        if (Logger.m76510c()) {
            Logger.m76508a("DefaultQueryEngine", "Using full collection scan to execute query: %s", query.toString());
        }
        return this.f54162a.mo62594i(query, SnapshotVersion.f54468c);
    }

    /* renamed from: e */
    private boolean m75279e(Query.LimitType limitType, ImmutableSortedSet<Document> immutableSortedSet, ImmutableSortedSet<DocumentKey> immutableSortedSet2, SnapshotVersion snapshotVersion) {
        Document document;
        if (immutableSortedSet2.size() != immutableSortedSet.size()) {
            return true;
        }
        if (limitType == Query.LimitType.LIMIT_TO_FIRST) {
            document = immutableSortedSet.mo23556c();
        } else {
            document = immutableSortedSet.mo23558d();
        }
        if (document == null) {
            return false;
        }
        if (document.mo62820c() || document.getVersion().compareTo(snapshotVersion) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo62579a(LocalDocumentsView localDocumentsView) {
        this.f54162a = localDocumentsView;
    }

    /* renamed from: b */
    public ImmutableSortedMap<DocumentKey, Document> mo62580b(Query query, SnapshotVersion snapshotVersion, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        Assert.m76443d(this.f54162a != null, "setLocalDocumentsView() not called", new Object[0]);
        if (query.mo23933u()) {
            return m75278d(query);
        }
        if (snapshotVersion.equals(SnapshotVersion.f54468c)) {
            return m75278d(query);
        }
        ImmutableSortedSet<Document> c = m75277c(query, this.f54162a.mo62593e(immutableSortedSet));
        if ((query.mo23926o() || query.mo23927p()) && m75279e(query.mo23922k(), c, immutableSortedSet, snapshotVersion)) {
            return m75278d(query);
        }
        if (Logger.m76510c()) {
            Logger.m76508a("DefaultQueryEngine", "Re-using previous result from %s to execute query: %s", snapshotVersion.toString(), query.toString());
        }
        ImmutableSortedMap<DocumentKey, Document> i = this.f54162a.mo62594i(query, snapshotVersion);
        Iterator<Document> it = c.iterator();
        while (it.hasNext()) {
            Document next = it.next();
            i = i.mo23540j(next.getKey(), next);
        }
        return i;
    }
}
