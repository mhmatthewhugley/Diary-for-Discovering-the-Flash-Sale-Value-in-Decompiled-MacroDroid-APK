package com.google.firebase.firestore.model.mutation;

import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.firestore.model.DocumentCollections;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Assert;
import com.google.protobuf.ByteString;
import java.util.List;

public final class MutationBatchResult {

    /* renamed from: a */
    private final MutationBatch f54484a;

    /* renamed from: b */
    private final SnapshotVersion f54485b;

    /* renamed from: c */
    private final List<MutationResult> f54486c;

    /* renamed from: d */
    private final ByteString f54487d;

    /* renamed from: e */
    private final ImmutableSortedMap<DocumentKey, SnapshotVersion> f54488e;

    private MutationBatchResult(MutationBatch mutationBatch, SnapshotVersion snapshotVersion, List<MutationResult> list, ByteString byteString, ImmutableSortedMap<DocumentKey, SnapshotVersion> immutableSortedMap) {
        this.f54484a = mutationBatch;
        this.f54485b = snapshotVersion;
        this.f54486c = list;
        this.f54487d = byteString;
        this.f54488e = immutableSortedMap;
    }

    /* renamed from: a */
    public static MutationBatchResult m75975a(MutationBatch mutationBatch, SnapshotVersion snapshotVersion, List<MutationResult> list, ByteString byteString) {
        Assert.m76443d(mutationBatch.mo62918h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(mutationBatch.mo62918h().size()), Integer.valueOf(list.size()));
        ImmutableSortedMap<DocumentKey, SnapshotVersion> c = DocumentCollections.m75844c();
        List<Mutation> h = mutationBatch.mo62918h();
        ImmutableSortedMap<DocumentKey, SnapshotVersion> immutableSortedMap = c;
        for (int i = 0; i < h.size(); i++) {
            immutableSortedMap = immutableSortedMap.mo23540j(h.get(i).mo62902e(), list.get(i).mo62927b());
        }
        return new MutationBatchResult(mutationBatch, snapshotVersion, list, byteString, immutableSortedMap);
    }

    /* renamed from: b */
    public MutationBatch mo62921b() {
        return this.f54484a;
    }

    /* renamed from: c */
    public SnapshotVersion mo62922c() {
        return this.f54485b;
    }

    /* renamed from: d */
    public ImmutableSortedMap<DocumentKey, SnapshotVersion> mo62923d() {
        return this.f54488e;
    }

    /* renamed from: e */
    public List<MutationResult> mo62924e() {
        return this.f54486c;
    }

    /* renamed from: f */
    public ByteString mo62925f() {
        return this.f54487d;
    }
}
