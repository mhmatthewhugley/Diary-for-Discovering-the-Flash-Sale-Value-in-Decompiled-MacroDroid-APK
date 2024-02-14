package com.google.firebase.firestore.local;

import android.util.SparseArray;
import com.google.firebase.firestore.core.ListenSequence;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import java.util.Map;

class MemoryLruReferenceDelegate implements ReferenceDelegate, LruDelegate {

    /* renamed from: a */
    private final MemoryPersistence f54267a;

    /* renamed from: b */
    private final LocalSerializer f54268b;

    /* renamed from: c */
    private final Map<DocumentKey, Long> f54269c;

    /* renamed from: d */
    private ReferenceSet f54270d;

    /* renamed from: e */
    private final LruGarbageCollector f54271e;

    /* renamed from: f */
    private final ListenSequence f54272f;

    /* renamed from: g */
    private long f54273g;

    /* renamed from: q */
    private boolean m75443q(DocumentKey documentKey, long j) {
        if (m75445s(documentKey) || this.f54270d.mo62730c(documentKey) || this.f54267a.mo62690f().mo62720k(documentKey)) {
            return true;
        }
        Long l = this.f54269c.get(documentKey);
        if (l == null || l.longValue() <= j) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    static /* synthetic */ void m75444r(long[] jArr, Long l) {
        jArr[0] = jArr[0] + 1;
    }

    /* renamed from: s */
    private boolean m75445s(DocumentKey documentKey) {
        for (MemoryMutationQueue n : this.f54267a.mo62696m()) {
            if (n.mo62681n(documentKey)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public long mo62638a() {
        long m = this.f54267a.mo62690f().mo62722m(this.f54268b) + 0 + this.f54267a.mo62689e().mo62704g(this.f54268b);
        for (MemoryMutationQueue o : this.f54267a.mo62696m()) {
            m += o.mo62682o(this.f54268b);
        }
        return m;
    }

    /* renamed from: b */
    public void mo62639b(Consumer<Long> consumer) {
        for (Map.Entry next : this.f54269c.entrySet()) {
            if (!m75443q((DocumentKey) next.getKey(), ((Long) next.getValue()).longValue())) {
                consumer.accept((Long) next.getValue());
            }
        }
    }

    /* renamed from: c */
    public LruGarbageCollector mo62640c() {
        return this.f54271e;
    }

    /* renamed from: d */
    public long mo62657d() {
        Assert.m76443d(this.f54273g != -1, "Attempting to get a sequence number outside of a transaction", new Object[0]);
        return this.f54273g;
    }

    /* renamed from: e */
    public int mo62641e(long j) {
        MemoryRemoteDocumentCache n = this.f54267a.mo62689e();
        int i = 0;
        for (MutableDocument key : n.mo62705h()) {
            DocumentKey key2 = key.getKey();
            if (!m75443q(key2, j)) {
                n.mo62700b(key2);
                this.f54269c.remove(key2);
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public int mo62642f(long j, SparseArray<?> sparseArray) {
        return this.f54267a.mo62690f().mo62724o(j, sparseArray);
    }

    /* renamed from: g */
    public void mo62658g(DocumentKey documentKey) {
        this.f54269c.put(documentKey, Long.valueOf(mo62657d()));
    }

    /* renamed from: h */
    public void mo62659h() {
        Assert.m76443d(this.f54273g != -1, "Committing a transaction without having started one", new Object[0]);
        this.f54273g = -1;
    }

    /* renamed from: i */
    public void mo62660i() {
        Assert.m76443d(this.f54273g == -1, "Starting a transaction without committing the previous one", new Object[0]);
        this.f54273g = this.f54272f.mo23896a();
    }

    /* renamed from: j */
    public void mo62661j(DocumentKey documentKey) {
        this.f54269c.put(documentKey, Long.valueOf(mo62657d()));
    }

    /* renamed from: k */
    public void mo62643k(Consumer<TargetData> consumer) {
        this.f54267a.mo62690f().mo62721l(consumer);
    }

    /* renamed from: l */
    public void mo62662l(TargetData targetData) {
        this.f54267a.mo62690f().mo62710a(targetData.mo62792j(mo62657d()));
    }

    /* renamed from: m */
    public long mo62644m() {
        long n = this.f54267a.mo62690f().mo62723n();
        long[] jArr = new long[1];
        mo62639b(MemoryLruReferenceDelegate$$Lambda$1.m75462a(jArr));
        return n + jArr[0];
    }

    /* renamed from: n */
    public void mo62663n(ReferenceSet referenceSet) {
        this.f54270d = referenceSet;
    }

    /* renamed from: o */
    public void mo62664o(DocumentKey documentKey) {
        this.f54269c.put(documentKey, Long.valueOf(mo62657d()));
    }

    /* renamed from: p */
    public void mo62665p(DocumentKey documentKey) {
        this.f54269c.put(documentKey, Long.valueOf(mo62657d()));
    }
}
