package com.google.firebase.firestore.local;

import androidx.annotation.Nullable;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class MemoryMutationQueue implements MutationQueue {

    /* renamed from: a */
    private final List<MutationBatch> f54275a = new ArrayList();

    /* renamed from: b */
    private ImmutableSortedSet<DocumentReference> f54276b = new ImmutableSortedSet<>(Collections.emptyList(), DocumentReference.f54163c);

    /* renamed from: c */
    private int f54277c = 1;

    /* renamed from: d */
    private ByteString f54278d = WriteStream.f54711s;

    /* renamed from: e */
    private final MemoryPersistence f54279e;

    MemoryMutationQueue(MemoryPersistence memoryPersistence) {
        this.f54279e = memoryPersistence;
    }

    /* renamed from: p */
    private int m75463p(int i) {
        if (this.f54275a.isEmpty()) {
            return 0;
        }
        return i - this.f54275a.get(0).mo62914e();
    }

    /* renamed from: q */
    private int m75464q(int i, String str) {
        int p = m75463p(i);
        Assert.m76443d(p >= 0 && p < this.f54275a.size(), "Batches must exist to be %s", str);
        return p;
    }

    /* renamed from: s */
    private List<MutationBatch> m75465s(ImmutableSortedSet<Integer> immutableSortedSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            MutationBatch d = mo62671d(it.next().intValue());
            if (d != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo62668a() {
        if (this.f54275a.isEmpty()) {
            Assert.m76443d(this.f54276b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    /* renamed from: b */
    public List<MutationBatch> mo62669b(Iterable<DocumentKey> iterable) {
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(Collections.emptyList(), Util.m76518a());
        for (DocumentKey next : iterable) {
            Iterator<DocumentReference> h = this.f54276b.mo23561h(new DocumentReference(next, 0));
            while (h.hasNext()) {
                DocumentReference next2 = h.next();
                if (!next.equals(next2.mo62582b())) {
                    break;
                }
                immutableSortedSet = immutableSortedSet.mo23560f(Integer.valueOf(next2.mo62581a()));
            }
        }
        return m75465s(immutableSortedSet);
    }

    @Nullable
    /* renamed from: c */
    public MutationBatch mo62670c(int i) {
        int p = m75463p(i + 1);
        if (p < 0) {
            p = 0;
        }
        if (this.f54275a.size() > p) {
            return this.f54275a.get(p);
        }
        return null;
    }

    @Nullable
    /* renamed from: d */
    public MutationBatch mo62671d(int i) {
        int p = m75463p(i);
        if (p < 0 || p >= this.f54275a.size()) {
            return null;
        }
        MutationBatch mutationBatch = this.f54275a.get(p);
        Assert.m76443d(mutationBatch.mo62914e() == i, "If found batch must match", new Object[0]);
        return mutationBatch;
    }

    /* renamed from: e */
    public ByteString mo62672e() {
        return this.f54278d;
    }

    /* renamed from: f */
    public void mo62673f(MutationBatch mutationBatch, ByteString byteString) {
        int e = mutationBatch.mo62914e();
        int q = m75464q(e, "acknowledged");
        Assert.m76443d(q == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        MutationBatch mutationBatch2 = this.f54275a.get(q);
        Assert.m76443d(e == mutationBatch2.mo62914e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(e), Integer.valueOf(mutationBatch2.mo62914e()));
        this.f54278d = (ByteString) Preconditions.m76513b(byteString);
    }

    /* renamed from: g */
    public MutationBatch mo62674g(Timestamp timestamp, List<Mutation> list, List<Mutation> list2) {
        boolean z = true;
        Assert.m76443d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int i = this.f54277c;
        this.f54277c = i + 1;
        int size = this.f54275a.size();
        if (size > 0) {
            if (this.f54275a.get(size - 1).mo62914e() >= i) {
                z = false;
            }
            Assert.m76443d(z, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        MutationBatch mutationBatch = new MutationBatch(i, timestamp, list, list2);
        this.f54275a.add(mutationBatch);
        for (Mutation next : list2) {
            this.f54276b = this.f54276b.mo23560f(new DocumentReference(next.mo62902e(), i));
            this.f54279e.mo62686b().mo62590a((ResourcePath) next.mo62902e().mo62832k().mo62809q());
        }
        return mutationBatch;
    }

    /* renamed from: h */
    public List<MutationBatch> mo62675h(DocumentKey documentKey) {
        DocumentReference documentReference = new DocumentReference(documentKey, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<DocumentReference> h = this.f54276b.mo23561h(documentReference);
        while (h.hasNext()) {
            DocumentReference next = h.next();
            if (!documentKey.equals(next.mo62582b())) {
                break;
            }
            MutationBatch d = mo62671d(next.mo62581a());
            Assert.m76443d(d != null, "Batches in the index must exist in the main table", new Object[0]);
            arrayList.add(d);
        }
        return arrayList;
    }

    /* renamed from: i */
    public void mo62676i(ByteString byteString) {
        this.f54278d = (ByteString) Preconditions.m76513b(byteString);
    }

    /* renamed from: j */
    public int mo62677j() {
        if (this.f54275a.isEmpty()) {
            return -1;
        }
        return this.f54277c - 1;
    }

    /* renamed from: k */
    public void mo62678k(MutationBatch mutationBatch) {
        Assert.m76443d(m75464q(mutationBatch.mo62914e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f54275a.remove(0);
        ImmutableSortedSet<DocumentReference> immutableSortedSet = this.f54276b;
        for (Mutation e : mutationBatch.mo62918h()) {
            DocumentKey e2 = e.mo62902e();
            this.f54279e.mo62688d().mo62661j(e2);
            immutableSortedSet = immutableSortedSet.mo23563i(new DocumentReference(e2, mutationBatch.mo62914e()));
        }
        this.f54276b = immutableSortedSet;
    }

    /* renamed from: l */
    public List<MutationBatch> mo62679l(Query query) {
        Assert.m76443d(!query.mo23929r(), "CollectionGroup queries should be handled in LocalDocumentsView", new Object[0]);
        ResourcePath m = query.mo23924m();
        int n = m.mo62807n() + 1;
        DocumentReference documentReference = new DocumentReference(DocumentKey.m75849i(!DocumentKey.m75851m(m) ? (ResourcePath) m.mo62796d("") : m), 0);
        ImmutableSortedSet immutableSortedSet = new ImmutableSortedSet(Collections.emptyList(), Util.m76518a());
        Iterator<DocumentReference> h = this.f54276b.mo23561h(documentReference);
        while (h.hasNext()) {
            DocumentReference next = h.next();
            ResourcePath k = next.mo62582b().mo62832k();
            if (!m.mo62806m(k)) {
                break;
            } else if (k.mo62807n() == n) {
                immutableSortedSet = immutableSortedSet.mo23560f(Integer.valueOf(next.mo62581a()));
            }
        }
        return m75465s(immutableSortedSet);
    }

    /* renamed from: m */
    public List<MutationBatch> mo62680m() {
        return Collections.unmodifiableList(this.f54275a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo62681n(DocumentKey documentKey) {
        Iterator<DocumentReference> h = this.f54276b.mo23561h(new DocumentReference(documentKey, 0));
        if (!h.hasNext()) {
            return false;
        }
        return h.next().mo62582b().equals(documentKey);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo62682o(LocalSerializer localSerializer) {
        long j = 0;
        for (MutationBatch k : this.f54275a) {
            j += (long) localSerializer.mo62602k(k).mo65174c();
        }
        return j;
    }

    /* renamed from: r */
    public boolean mo62683r() {
        return this.f54275a.isEmpty();
    }

    public void start() {
        if (mo62683r()) {
            this.f54277c = 1;
        }
    }
}
