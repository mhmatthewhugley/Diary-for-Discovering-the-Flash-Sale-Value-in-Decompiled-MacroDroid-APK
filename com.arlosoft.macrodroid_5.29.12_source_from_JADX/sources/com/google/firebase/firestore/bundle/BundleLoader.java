package com.google.firebase.firestore.bundle;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.LoadBundleTaskProgress;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BundleLoader {

    /* renamed from: a */
    private final BundleCallback f5774a;

    /* renamed from: b */
    private final BundleMetadata f5775b;

    /* renamed from: c */
    private final List<NamedQuery> f5776c = new ArrayList();

    /* renamed from: d */
    private final Map<DocumentKey, BundledDocumentMetadata> f5777d = new HashMap();

    /* renamed from: e */
    private ImmutableSortedMap<DocumentKey, MutableDocument> f5778e = DocumentCollections.m75843b();

    /* renamed from: f */
    private long f5779f;
    @Nullable

    /* renamed from: g */
    private DocumentKey f5780g;

    public BundleLoader(BundleCallback bundleCallback, BundleMetadata bundleMetadata) {
        this.f5774a = bundleCallback;
        this.f5775b = bundleMetadata;
    }

    /* renamed from: c */
    private Map<String, ImmutableSortedSet<DocumentKey>> m7947c() {
        HashMap hashMap = new HashMap();
        for (NamedQuery b : this.f5776c) {
            hashMap.put(b.mo23796b(), DocumentKey.m75847f());
        }
        for (BundledDocumentMetadata next : this.f5777d.values()) {
            for (String next2 : next.mo23787c()) {
                hashMap.put(next2, ((ImmutableSortedSet) hashMap.get(next2)).mo23560f(next.mo23786b()));
            }
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: a */
    public LoadBundleTaskProgress mo23768a(BundleElement bundleElement, long j) {
        Preconditions.m76512a(!(bundleElement instanceof BundleMetadata), "Unexpected bundle metadata element.", new Object[0]);
        int size = this.f5778e.size();
        if (bundleElement instanceof NamedQuery) {
            this.f5776c.add((NamedQuery) bundleElement);
        } else if (bundleElement instanceof BundledDocumentMetadata) {
            BundledDocumentMetadata bundledDocumentMetadata = (BundledDocumentMetadata) bundleElement;
            this.f5777d.put(bundledDocumentMetadata.mo23786b(), bundledDocumentMetadata);
            this.f5780g = bundledDocumentMetadata.mo23786b();
            if (!bundledDocumentMetadata.mo23785a()) {
                this.f5778e = this.f5778e.mo23540j(bundledDocumentMetadata.mo23786b(), MutableDocument.m75873r(bundledDocumentMetadata.mo23786b(), bundledDocumentMetadata.mo23788d()));
                this.f5780g = null;
            }
        } else if (bundleElement instanceof BundleDocument) {
            BundleDocument bundleDocument = (BundleDocument) bundleElement;
            if (bundleDocument.mo23765b().equals(this.f5780g)) {
                this.f5778e = this.f5778e.mo23540j(bundleDocument.mo23765b(), bundleDocument.mo23764a());
                this.f5780g = null;
            } else {
                throw new IllegalArgumentException("The document being added does not match the stored metadata.");
            }
        }
        this.f5779f += j;
        if (size != this.f5778e.size()) {
            return new LoadBundleTaskProgress(this.f5778e.size(), this.f5775b.mo23774e(), this.f5779f, this.f5775b.mo23773d(), (Exception) null, LoadBundleTaskProgress.TaskState.RUNNING);
        }
        return null;
    }

    /* renamed from: b */
    public ImmutableSortedMap<DocumentKey, Document> mo23769b() {
        Preconditions.m76512a(this.f5780g == null, "Bundled documents end with a document metadata element instead of a document.", new Object[0]);
        Preconditions.m76512a(this.f5775b.mo23770a() != null, "Bundle ID must be set", new Object[0]);
        Preconditions.m76512a(this.f5778e.size() == this.f5775b.mo23774e(), "Expected %s documents, but loaded %s.", Integer.valueOf(this.f5775b.mo23774e()), Integer.valueOf(this.f5778e.size()));
        ImmutableSortedMap<DocumentKey, Document> a = this.f5774a.mo23761a(this.f5778e, this.f5775b.mo23770a());
        Map<String, ImmutableSortedSet<DocumentKey>> c = m7947c();
        for (NamedQuery next : this.f5776c) {
            this.f5774a.mo23762b(next, c.get(next.mo23796b()));
        }
        this.f5774a.mo23763c(this.f5775b);
        return a;
    }
}
