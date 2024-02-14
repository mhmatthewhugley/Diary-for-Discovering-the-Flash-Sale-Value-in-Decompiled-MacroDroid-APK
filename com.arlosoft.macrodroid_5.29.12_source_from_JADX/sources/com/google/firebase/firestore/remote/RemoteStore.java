package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.core.Transaction;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.MutationResult;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.remote.WatchChangeAggregator;
import com.google.firebase.firestore.remote.WatchStream;
import com.google.firebase.firestore.remote.WriteStream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import com.google.protobuf.ByteString;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p292io.grpc.C12537b1;

public final class RemoteStore implements WatchChangeAggregator.TargetMetadataProvider {

    /* renamed from: a */
    private final RemoteStoreCallback f54653a;

    /* renamed from: b */
    private final LocalStore f54654b;

    /* renamed from: c */
    private final Datastore f54655c;

    /* renamed from: d */
    private final ConnectivityMonitor f54656d;

    /* renamed from: e */
    private final Map<Integer, TargetData> f54657e;

    /* renamed from: f */
    private final OnlineStateTracker f54658f;

    /* renamed from: g */
    private boolean f54659g = false;

    /* renamed from: h */
    private final WatchStream f54660h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final WriteStream f54661i;
    @Nullable

    /* renamed from: j */
    private WatchChangeAggregator f54662j;

    /* renamed from: k */
    private final Deque<MutationBatch> f54663k;

    public interface RemoteStoreCallback {
        /* renamed from: a */
        void mo23898a(OnlineState onlineState);

        /* renamed from: b */
        ImmutableSortedSet<DocumentKey> mo23899b(int i);

        /* renamed from: c */
        void mo23900c(int i, C12537b1 b1Var);

        /* renamed from: d */
        void mo23901d(int i, C12537b1 b1Var);

        /* renamed from: e */
        void mo23902e(RemoteEvent remoteEvent);

        /* renamed from: f */
        void mo23903f(MutationBatchResult mutationBatchResult);
    }

    public RemoteStore(RemoteStoreCallback remoteStoreCallback, LocalStore localStore, Datastore datastore, AsyncQueue asyncQueue, ConnectivityMonitor connectivityMonitor) {
        this.f54653a = remoteStoreCallback;
        this.f54654b = localStore;
        this.f54655c = datastore;
        this.f54656d = connectivityMonitor;
        this.f54657e = new HashMap();
        this.f54663k = new ArrayDeque();
        remoteStoreCallback.getClass();
        this.f54658f = new OnlineStateTracker(asyncQueue, RemoteStore$$Lambda$1.m76363b(remoteStoreCallback));
        this.f54660h = datastore.mo63020b(new WatchStream.Callback() {
            /* renamed from: a */
            public void mo63092a(C12537b1 b1Var) {
                RemoteStore.this.m76332u(b1Var);
            }

            /* renamed from: b */
            public void mo63093b() {
                RemoteStore.this.m76333v();
            }

            /* renamed from: d */
            public void mo63094d(SnapshotVersion snapshotVersion, WatchChange watchChange) {
                RemoteStore.this.m76331t(snapshotVersion, watchChange);
            }
        });
        this.f54661i = datastore.mo63021c(new WriteStream.Callback() {
            /* renamed from: a */
            public void mo63092a(C12537b1 b1Var) {
                RemoteStore.this.m76336y(b1Var);
            }

            /* renamed from: b */
            public void mo63093b() {
                RemoteStore.this.f54661i.mo63146y();
            }

            /* renamed from: c */
            public void mo63095c(SnapshotVersion snapshotVersion, List<MutationResult> list) {
                RemoteStore.this.m76308A(snapshotVersion, list);
            }

            /* renamed from: e */
            public void mo63096e() {
                RemoteStore.this.m76337z();
            }
        });
        connectivityMonitor.mo63012a(RemoteStore$$Lambda$2.m76365a(this, asyncQueue));
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m76308A(SnapshotVersion snapshotVersion, List<MutationResult> list) {
        this.f54653a.mo23903f(MutationBatchResult.m75975a(this.f54663k.poll(), snapshotVersion, list, this.f54661i.mo63142u()));
        mo63090r();
    }

    /* renamed from: B */
    static /* synthetic */ void m76309B(RemoteStore remoteStore) {
        if (remoteStore.mo63086l()) {
            Logger.m76508a("RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
            remoteStore.m76313G();
        }
    }

    /* renamed from: E */
    private void m76311E(WatchChange.WatchTargetChange watchTargetChange) {
        Assert.m76443d(watchTargetChange.mo63126a() != null, "Processing target error without a cause", new Object[0]);
        for (Integer next : watchTargetChange.mo63129d()) {
            if (this.f54657e.containsKey(next)) {
                this.f54657e.remove(next);
                this.f54662j.mo63138n(next.intValue());
                this.f54653a.mo23900c(next.intValue(), watchTargetChange.mo63126a());
            }
        }
    }

    /* renamed from: F */
    private void m76312F(SnapshotVersion snapshotVersion) {
        Assert.m76443d(!snapshotVersion.equals(SnapshotVersion.f54468c), "Can't raise event for unknown SnapshotVersion", new Object[0]);
        RemoteEvent b = this.f54662j.mo63133b(snapshotVersion);
        for (Map.Entry next : b.mo63053d().entrySet()) {
            TargetChange targetChange = (TargetChange) next.getValue();
            if (!targetChange.mo63101e().isEmpty()) {
                int intValue = ((Integer) next.getKey()).intValue();
                TargetData targetData = this.f54657e.get(Integer.valueOf(intValue));
                if (targetData != null) {
                    this.f54657e.put(Integer.valueOf(intValue), targetData.mo62791i(targetChange.mo63101e(), snapshotVersion));
                }
            }
        }
        for (Integer intValue2 : b.mo63054e()) {
            int intValue3 = intValue2.intValue();
            TargetData targetData2 = this.f54657e.get(Integer.valueOf(intValue3));
            if (targetData2 != null) {
                this.f54657e.put(Integer.valueOf(intValue3), targetData2.mo62791i(ByteString.f56619a, targetData2.mo62785e()));
                m76314H(intValue3);
                m76315I(new TargetData(targetData2.mo62787f(), intValue3, targetData2.mo62784d(), QueryPurpose.EXISTENCE_FILTER_MISMATCH));
            }
        }
        this.f54653a.mo23902e(b);
    }

    /* renamed from: G */
    private void m76313G() {
        this.f54659g = false;
        m76330p();
        this.f54658f.mo63047g(OnlineState.UNKNOWN);
        this.f54661i.mo62992i();
        this.f54660h.mo62992i();
        mo63089q();
    }

    /* renamed from: H */
    private void m76314H(int i) {
        this.f54662j.mo63137l(i);
        this.f54660h.mo63140v(i);
    }

    /* renamed from: I */
    private void m76315I(TargetData targetData) {
        this.f54662j.mo63137l(targetData.mo62788g());
        this.f54660h.mo63141w(targetData);
    }

    /* renamed from: J */
    private boolean m76316J() {
        return mo63086l() && !this.f54660h.mo62994k() && !this.f54657e.isEmpty();
    }

    /* renamed from: K */
    private boolean m76317K() {
        return mo63086l() && !this.f54661i.mo62994k() && !this.f54663k.isEmpty();
    }

    /* renamed from: N */
    private void m76318N() {
        Assert.m76443d(m76316J(), "startWatchStream() called when shouldStartWatchStream() is false.", new Object[0]);
        this.f54662j = new WatchChangeAggregator(this);
        this.f54660h.mo62997q();
        this.f54658f.mo63046c();
    }

    /* renamed from: O */
    private void m76319O() {
        Assert.m76443d(m76317K(), "startWriteStream() called when shouldStartWriteStream() is false.", new Object[0]);
        this.f54661i.mo62997q();
    }

    /* renamed from: j */
    private void m76327j(MutationBatch mutationBatch) {
        Assert.m76443d(m76328k(), "addToWritePipeline called when pipeline is full", new Object[0]);
        this.f54663k.add(mutationBatch);
        if (this.f54661i.mo62993j() && this.f54661i.mo63143v()) {
            this.f54661i.mo63147z(mutationBatch.mo62918h());
        }
    }

    /* renamed from: k */
    private boolean m76328k() {
        return mo63086l() && this.f54663k.size() < 10;
    }

    /* renamed from: m */
    private void m76329m() {
        this.f54662j = null;
    }

    /* renamed from: p */
    private void m76330p() {
        this.f54660h.mo62998r();
        this.f54661i.mo62998r();
        if (!this.f54663k.isEmpty()) {
            Logger.m76508a("RemoteStore", "Stopping write stream with %d pending writes", Integer.valueOf(this.f54663k.size()));
            this.f54663k.clear();
        }
        m76329m();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m76331t(SnapshotVersion snapshotVersion, WatchChange watchChange) {
        this.f54658f.mo63047g(OnlineState.ONLINE);
        Assert.m76443d((this.f54660h == null || this.f54662j == null) ? false : true, "WatchStream and WatchStreamAggregator should both be non-null", new Object[0]);
        boolean z = watchChange instanceof WatchChange.WatchTargetChange;
        WatchChange.WatchTargetChange watchTargetChange = z ? (WatchChange.WatchTargetChange) watchChange : null;
        if (watchTargetChange == null || !watchTargetChange.mo63127b().equals(WatchChange.WatchTargetChangeType.Removed) || watchTargetChange.mo63126a() == null) {
            if (watchChange instanceof WatchChange.DocumentChange) {
                this.f54662j.mo63134g((WatchChange.DocumentChange) watchChange);
            } else if (watchChange instanceof WatchChange.ExistenceFilterWatchChange) {
                this.f54662j.mo63135h((WatchChange.ExistenceFilterWatchChange) watchChange);
            } else {
                Assert.m76443d(z, "Expected watchChange to be an instance of WatchTargetChange", new Object[0]);
                this.f54662j.mo63136i((WatchChange.WatchTargetChange) watchChange);
            }
            if (!snapshotVersion.equals(SnapshotVersion.f54468c) && snapshotVersion.compareTo(this.f54654b.mo62617k()) >= 0) {
                m76312F(snapshotVersion);
                return;
            }
            return;
        }
        m76311E(watchTargetChange);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m76332u(C12537b1 b1Var) {
        if (b1Var.mo69064o()) {
            Assert.m76443d(!m76316J(), "Watch stream was stopped gracefully while still needed.", new Object[0]);
        }
        m76329m();
        if (m76316J()) {
            this.f54658f.mo63045b(b1Var);
            m76318N();
            return;
        }
        this.f54658f.mo63047g(OnlineState.UNKNOWN);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m76333v() {
        for (TargetData I : this.f54657e.values()) {
            m76315I(I);
        }
    }

    /* renamed from: w */
    private void m76334w(C12537b1 b1Var) {
        Assert.m76443d(!b1Var.mo69064o(), "Handling write error with status OK.", new Object[0]);
        if (Datastore.m76167g(b1Var)) {
            this.f54661i.mo62992i();
            this.f54653a.mo23901d(this.f54663k.poll().mo62914e(), b1Var);
            mo63090r();
        }
    }

    /* renamed from: x */
    private void m76335x(C12537b1 b1Var) {
        Assert.m76443d(!b1Var.mo69064o(), "Handling write error with status OK.", new Object[0]);
        if (Datastore.m76166f(b1Var)) {
            Logger.m76508a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", Util.m76530m(this.f54661i.mo63142u()), b1Var);
            WriteStream writeStream = this.f54661i;
            ByteString byteString = WriteStream.f54711s;
            writeStream.mo63145x(byteString);
            this.f54654b.mo62608M(byteString);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m76336y(C12537b1 b1Var) {
        if (b1Var.mo69064o()) {
            Assert.m76443d(!m76317K(), "Write stream was stopped gracefully while still needed.", new Object[0]);
        }
        if (!b1Var.mo69064o() && !this.f54663k.isEmpty()) {
            if (this.f54661i.mo63143v()) {
                m76334w(b1Var);
            } else {
                m76335x(b1Var);
            }
        }
        if (m76317K()) {
            m76319O();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m76337z() {
        this.f54654b.mo62608M(this.f54661i.mo63142u());
        for (MutationBatch h : this.f54663k) {
            this.f54661i.mo63147z(h.mo62918h());
        }
    }

    /* renamed from: D */
    public void mo63080D(TargetData targetData) {
        Integer valueOf = Integer.valueOf(targetData.mo62788g());
        if (!this.f54657e.containsKey(valueOf)) {
            this.f54657e.put(valueOf, targetData);
            if (m76316J()) {
                m76318N();
            } else if (this.f54660h.mo62993j()) {
                m76315I(targetData);
            }
        }
    }

    /* renamed from: L */
    public void mo63081L() {
        Logger.m76508a("RemoteStore", "Shutting down", new Object[0]);
        this.f54656d.shutdown();
        this.f54659g = false;
        m76330p();
        this.f54655c.mo63022j();
        this.f54658f.mo63047g(OnlineState.UNKNOWN);
    }

    /* renamed from: M */
    public void mo63082M() {
        mo63089q();
    }

    /* renamed from: P */
    public void mo63083P(int i) {
        Assert.m76443d(this.f54657e.remove(Integer.valueOf(i)) != null, "stopListening called on target no currently watched: %d", Integer.valueOf(i));
        if (this.f54660h.mo62993j()) {
            m76314H(i);
        }
        if (!this.f54657e.isEmpty()) {
            return;
        }
        if (this.f54660h.mo62993j()) {
            this.f54660h.mo62995m();
        } else if (mo63086l()) {
            this.f54658f.mo63047g(OnlineState.UNKNOWN);
        }
    }

    @Nullable
    /* renamed from: a */
    public TargetData mo63084a(int i) {
        return this.f54657e.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public ImmutableSortedSet<DocumentKey> mo63085b(int i) {
        return this.f54653a.mo23899b(i);
    }

    /* renamed from: l */
    public boolean mo63086l() {
        return this.f54659g;
    }

    /* renamed from: n */
    public Transaction mo63087n() {
        return new Transaction(this.f54655c);
    }

    /* renamed from: o */
    public void mo63088o() {
        this.f54659g = false;
        m76330p();
        this.f54658f.mo63047g(OnlineState.OFFLINE);
    }

    /* renamed from: q */
    public void mo63089q() {
        this.f54659g = true;
        if (mo63086l()) {
            this.f54661i.mo63145x(this.f54654b.mo62618l());
            if (m76316J()) {
                m76318N();
            } else {
                this.f54658f.mo63047g(OnlineState.UNKNOWN);
            }
            mo63090r();
        }
    }

    /* renamed from: r */
    public void mo63090r() {
        int e = this.f54663k.isEmpty() ? -1 : this.f54663k.getLast().mo62914e();
        while (true) {
            if (!m76328k()) {
                break;
            }
            MutationBatch n = this.f54654b.mo62620n(e);
            if (n != null) {
                m76327j(n);
                e = n.mo62914e();
            } else if (this.f54663k.size() == 0) {
                this.f54661i.mo62995m();
            }
        }
        if (m76317K()) {
            m76319O();
        }
    }

    /* renamed from: s */
    public void mo63091s() {
        if (mo63086l()) {
            Logger.m76508a("RemoteStore", "Restarting streams for new credential.", new Object[0]);
            m76313G();
        }
    }
}
