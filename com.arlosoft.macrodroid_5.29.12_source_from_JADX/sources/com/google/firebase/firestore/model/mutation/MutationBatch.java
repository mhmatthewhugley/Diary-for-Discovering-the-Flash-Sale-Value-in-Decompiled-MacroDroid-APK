package com.google.firebase.firestore.model.mutation;

import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class MutationBatch {

    /* renamed from: a */
    private final int f54480a;

    /* renamed from: b */
    private final Timestamp f54481b;

    /* renamed from: c */
    private final List<Mutation> f54482c;

    /* renamed from: d */
    private final List<Mutation> f54483d;

    public MutationBatch(int i, Timestamp timestamp, List<Mutation> list, List<Mutation> list2) {
        Assert.m76443d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f54480a = i;
        this.f54481b = timestamp;
        this.f54482c = list;
        this.f54483d = list2;
    }

    /* renamed from: a */
    public ImmutableSortedMap<DocumentKey, Document> mo62910a(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap) {
        for (DocumentKey d : mo62916f()) {
            MutableDocument mutableDocument = (MutableDocument) immutableSortedMap.mo23534d(d);
            mo62911b(mutableDocument);
            if (!mutableDocument.mo62858o()) {
                mutableDocument.mo62855k(SnapshotVersion.f54468c);
            }
            immutableSortedMap = immutableSortedMap.mo23540j(mutableDocument.getKey(), mutableDocument);
        }
        return immutableSortedMap;
    }

    /* renamed from: b */
    public void mo62911b(MutableDocument mutableDocument) {
        for (int i = 0; i < this.f54482c.size(); i++) {
            Mutation mutation = this.f54482c.get(i);
            if (mutation.mo62902e().equals(mutableDocument.getKey())) {
                mutation.mo62887a(mutableDocument, this.f54481b);
            }
        }
        for (int i2 = 0; i2 < this.f54483d.size(); i2++) {
            Mutation mutation2 = this.f54483d.get(i2);
            if (mutation2.mo62902e().equals(mutableDocument.getKey())) {
                mutation2.mo62887a(mutableDocument, this.f54481b);
            }
        }
    }

    /* renamed from: c */
    public void mo62912c(MutableDocument mutableDocument, MutationBatchResult mutationBatchResult) {
        int size = this.f54483d.size();
        List<MutationResult> e = mutationBatchResult.mo62924e();
        Assert.m76443d(e.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(e.size()));
        for (int i = 0; i < size; i++) {
            Mutation mutation = this.f54483d.get(i);
            if (mutation.mo62902e().equals(mutableDocument.getKey())) {
                mutation.mo62888b(mutableDocument, e.get(i));
            }
        }
    }

    /* renamed from: d */
    public List<Mutation> mo62913d() {
        return this.f54482c;
    }

    /* renamed from: e */
    public int mo62914e() {
        return this.f54480a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MutationBatch.class != obj.getClass()) {
            return false;
        }
        MutationBatch mutationBatch = (MutationBatch) obj;
        if (this.f54480a != mutationBatch.f54480a || !this.f54481b.equals(mutationBatch.f54481b) || !this.f54482c.equals(mutationBatch.f54482c) || !this.f54483d.equals(mutationBatch.f54483d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Set<DocumentKey> mo62916f() {
        HashSet hashSet = new HashSet();
        for (Mutation e : this.f54483d) {
            hashSet.add(e.mo62902e());
        }
        return hashSet;
    }

    /* renamed from: g */
    public Timestamp mo62917g() {
        return this.f54481b;
    }

    /* renamed from: h */
    public List<Mutation> mo62918h() {
        return this.f54483d;
    }

    public int hashCode() {
        return (((((this.f54480a * 31) + this.f54481b.hashCode()) * 31) + this.f54482c.hashCode()) * 31) + this.f54483d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f54480a + ", localWriteTime=" + this.f54481b + ", baseMutations=" + this.f54482c + ", mutations=" + this.f54483d + ')';
    }
}
