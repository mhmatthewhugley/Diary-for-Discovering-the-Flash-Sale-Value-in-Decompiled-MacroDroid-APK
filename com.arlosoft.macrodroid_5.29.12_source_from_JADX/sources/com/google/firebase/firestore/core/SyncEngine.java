package com.google.firebase.firestore.core;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.LoadBundleTask;
import com.google.firebase.firestore.LoadBundleTaskProgress;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleElement;
import com.google.firebase.firestore.bundle.BundleLoader;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.BundleReader;
import com.google.firebase.firestore.core.View;
import com.google.firebase.firestore.core.ViewSnapshot;
import com.google.firebase.firestore.local.LocalStore;
import com.google.firebase.firestore.local.LocalViewChanges;
import com.google.firebase.firestore.local.LocalWriteResult;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.QueryResult;
import com.google.firebase.firestore.local.ReferenceSet;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Function;
import com.google.firebase.firestore.util.Logger;
import com.google.firebase.firestore.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p292io.grpc.C12537b1;

public class SyncEngine implements RemoteStore.RemoteStoreCallback {

    /* renamed from: o */
    private static final String f5973o = "SyncEngine";

    /* renamed from: a */
    private final LocalStore f5974a;

    /* renamed from: b */
    private final RemoteStore f5975b;

    /* renamed from: c */
    private final Map<Query, QueryView> f5976c = new HashMap();

    /* renamed from: d */
    private final Map<Integer, List<Query>> f5977d = new HashMap();

    /* renamed from: e */
    private final int f5978e;

    /* renamed from: f */
    private final LinkedHashSet<DocumentKey> f5979f = new LinkedHashSet<>();

    /* renamed from: g */
    private final Map<DocumentKey, Integer> f5980g = new HashMap();

    /* renamed from: h */
    private final Map<Integer, LimboResolution> f5981h = new HashMap();

    /* renamed from: i */
    private final ReferenceSet f5982i = new ReferenceSet();

    /* renamed from: j */
    private final Map<User, Map<Integer, TaskCompletionSource<Void>>> f5983j = new HashMap();

    /* renamed from: k */
    private final Map<Integer, List<TaskCompletionSource<Void>>> f5984k;

    /* renamed from: l */
    private final TargetIdGenerator f5985l = TargetIdGenerator.m8222a();

    /* renamed from: m */
    private User f5986m;

    /* renamed from: n */
    private SyncEngineCallback f5987n;

    /* renamed from: com.google.firebase.firestore.core.SyncEngine$1 */
    static /* synthetic */ class C19591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5988a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.firestore.core.LimboDocumentChange$Type[] r0 = com.google.firebase.firestore.core.LimboDocumentChange.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5988a = r0
                com.google.firebase.firestore.core.LimboDocumentChange$Type r1 = com.google.firebase.firestore.core.LimboDocumentChange.Type.ADDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5988a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.core.LimboDocumentChange$Type r1 = com.google.firebase.firestore.core.LimboDocumentChange.Type.REMOVED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.core.SyncEngine.C19591.<clinit>():void");
        }
    }

    private static class LimboResolution {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final DocumentKey f5989a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f5990b;

        LimboResolution(DocumentKey documentKey) {
            this.f5989a = documentKey;
        }
    }

    interface SyncEngineCallback {
        /* renamed from: a */
        void mo23851a(OnlineState onlineState);

        /* renamed from: b */
        void mo23852b(Query query, C12537b1 b1Var);

        /* renamed from: c */
        void mo23853c(List<ViewSnapshot> list);
    }

    public SyncEngine(LocalStore localStore, RemoteStore remoteStore, User user, int i) {
        this.f5974a = localStore;
        this.f5975b = remoteStore;
        this.f5978e = i;
        this.f5986m = user;
        this.f5984k = new HashMap();
    }

    /* renamed from: A */
    private void m8178A(List<LimboDocumentChange> list, int i) {
        for (LimboDocumentChange next : list) {
            int i2 = C19591.f5988a[next.mo23893b().ordinal()];
            if (i2 == 1) {
                this.f5982i.mo62728a(next.mo23892a(), i);
                m8191y(next);
            } else if (i2 == 2) {
                Logger.m76508a(f5973o, "Document no longer in limbo: %s", next.mo23892a());
                DocumentKey a = next.mo23892a();
                this.f5982i.mo62732f(a, i);
                if (!this.f5982i.mo62730c(a)) {
                    m8189u(a);
                }
            } else {
                throw Assert.m76440a("Unknown limbo change type: %s", next.mo23893b());
            }
        }
    }

    /* renamed from: g */
    private void m8179g(int i, TaskCompletionSource<Void> taskCompletionSource) {
        Map map = this.f5983j.get(this.f5986m);
        if (map == null) {
            map = new HashMap();
            this.f5983j.put(this.f5986m, map);
        }
        map.put(Integer.valueOf(i), taskCompletionSource);
    }

    /* renamed from: h */
    private void m8180h(String str) {
        Assert.m76443d(this.f5987n != null, "Trying to call %s before setting callback", str);
    }

    /* renamed from: i */
    private void m8181i(ImmutableSortedMap<DocumentKey, Document> immutableSortedMap, @Nullable RemoteEvent remoteEvent) {
        TargetChange targetChange;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<Query, QueryView> value : this.f5976c.entrySet()) {
            QueryView queryView = (QueryView) value.getValue();
            View c = queryView.mo23943c();
            View.DocumentChanges f = c.mo23972f(immutableSortedMap);
            if (f.mo23976b()) {
                f = c.mo23973g(this.f5974a.mo62615i(queryView.mo23941a(), false).mo62726a(), f);
            }
            if (remoteEvent == null) {
                targetChange = null;
            } else {
                targetChange = remoteEvent.mo63053d().get(Integer.valueOf(queryView.mo23942b()));
            }
            ViewChange b = queryView.mo23943c().mo23970b(f, targetChange);
            m8178A(b.mo23978a(), queryView.mo23942b());
            if (b.mo23979b() != null) {
                arrayList.add(b.mo23979b());
                arrayList2.add(LocalViewChanges.m75387a(queryView.mo23942b(), b.mo23979b()));
            }
        }
        this.f5987n.mo23853c(arrayList);
        this.f5974a.mo62604H(arrayList2);
    }

    /* renamed from: j */
    private boolean m8182j(C12537b1 b1Var) {
        C12537b1.C12539b m = b1Var.mo69062m();
        String n = b1Var.mo69063n() != null ? b1Var.mo69063n() : "";
        if ((m != C12537b1.C12539b.FAILED_PRECONDITION || !n.contains("requires an index")) && m != C12537b1.C12539b.PERMISSION_DENIED) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    private void m8183k() {
        for (Map.Entry<Integer, List<TaskCompletionSource<Void>>> value : this.f5984k.entrySet()) {
            for (TaskCompletionSource b : (List) value.getValue()) {
                b.mo56138b(new FirebaseFirestoreException("'waitForPendingWrites' task is cancelled due to User change.", FirebaseFirestoreException.Code.CANCELLED));
            }
        }
        this.f5984k.clear();
    }

    /* renamed from: m */
    private ViewSnapshot m8184m(Query query, int i) {
        TargetChange targetChange;
        QueryResult i2 = this.f5974a.mo62615i(query, true);
        ViewSnapshot.SyncState syncState = ViewSnapshot.SyncState.NONE;
        if (this.f5977d.get(Integer.valueOf(i)) != null) {
            boolean z = false;
            if (this.f5976c.get((Query) this.f5977d.get(Integer.valueOf(i)).get(0)).mo23943c().mo23974h() == ViewSnapshot.SyncState.SYNCED) {
                z = true;
            }
            targetChange = TargetChange.m76369a(z);
        } else {
            targetChange = null;
        }
        View view = new View(query, i2.mo62727b());
        ViewChange b = view.mo23970b(view.mo23972f(i2.mo62726a()), targetChange);
        m8178A(b.mo23978a(), i);
        this.f5976c.put(query, new QueryView(query, i, view));
        if (!this.f5977d.containsKey(Integer.valueOf(i))) {
            this.f5977d.put(Integer.valueOf(i), new ArrayList(1));
        }
        this.f5977d.get(Integer.valueOf(i)).add(query);
        return b.mo23979b();
    }

    /* renamed from: p */
    private void m8185p(C12537b1 b1Var, String str, Object... objArr) {
        if (m8182j(b1Var)) {
            Logger.m76511d("Firestore", "%s: %s", String.format(str, objArr), b1Var);
        }
    }

    /* renamed from: q */
    private void m8186q(int i, @Nullable C12537b1 b1Var) {
        Map map = this.f5983j.get(this.f5986m);
        if (map != null) {
            Integer valueOf = Integer.valueOf(i);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) map.get(valueOf);
            if (taskCompletionSource != null) {
                if (b1Var != null) {
                    taskCompletionSource.mo56138b(Util.m76527j(b1Var));
                } else {
                    taskCompletionSource.mo56139c(null);
                }
                map.remove(valueOf);
            }
        }
    }

    /* renamed from: r */
    private void m8187r() {
        while (!this.f5979f.isEmpty() && this.f5980g.size() < this.f5978e) {
            Iterator it = this.f5979f.iterator();
            DocumentKey documentKey = (DocumentKey) it.next();
            it.remove();
            int c = this.f5985l.mo23965c();
            this.f5981h.put(Integer.valueOf(c), new LimboResolution(documentKey));
            this.f5980g.put(documentKey, Integer.valueOf(c));
            this.f5975b.mo63080D(new TargetData(Query.m8139b(documentKey.mo62832k()).mo23934z(), c, -1, QueryPurpose.LIMBO_RESOLUTION));
        }
    }

    /* renamed from: t */
    private void m8188t(int i, C12537b1 b1Var) {
        for (Query query : this.f5977d.get(Integer.valueOf(i))) {
            this.f5976c.remove(query);
            if (!b1Var.mo69064o()) {
                this.f5987n.mo23852b(query, b1Var);
                m8185p(b1Var, "Listen for %s failed", query);
            }
        }
        this.f5977d.remove(Integer.valueOf(i));
        ImmutableSortedSet<DocumentKey> d = this.f5982i.mo62731d(i);
        this.f5982i.mo62734h(i);
        Iterator<DocumentKey> it = d.iterator();
        while (it.hasNext()) {
            DocumentKey next = it.next();
            if (!this.f5982i.mo62730c(next)) {
                m8189u(next);
            }
        }
    }

    /* renamed from: u */
    private void m8189u(DocumentKey documentKey) {
        this.f5979f.remove(documentKey);
        Integer num = this.f5980g.get(documentKey);
        if (num != null) {
            this.f5975b.mo63083P(num.intValue());
            this.f5980g.remove(documentKey);
            this.f5981h.remove(num);
            m8187r();
        }
    }

    /* renamed from: v */
    private void m8190v(int i) {
        if (this.f5984k.containsKey(Integer.valueOf(i))) {
            for (TaskCompletionSource c : this.f5984k.get(Integer.valueOf(i))) {
                c.mo56139c(null);
            }
            this.f5984k.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: y */
    private void m8191y(LimboDocumentChange limboDocumentChange) {
        DocumentKey a = limboDocumentChange.mo23892a();
        if (!this.f5980g.containsKey(a) && !this.f5979f.contains(a)) {
            Logger.m76508a(f5973o, "New document in limbo: %s", a);
            this.f5979f.add(a);
            m8187r();
        }
    }

    /* renamed from: B */
    public void mo23944B(List<Mutation> list, TaskCompletionSource<Void> taskCompletionSource) {
        m8180h("writeMutations");
        LocalWriteResult Q = this.f5974a.mo62610Q(list);
        m8179g(Q.mo62636a(), taskCompletionSource);
        m8181i(Q.mo62637b(), (RemoteEvent) null);
        this.f5975b.mo63090r();
    }

    /* renamed from: a */
    public void mo23898a(OnlineState onlineState) {
        m8180h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Query, QueryView> value : this.f5976c.entrySet()) {
            ViewChange c = ((QueryView) value.getValue()).mo23943c().mo23971c(onlineState);
            Assert.m76443d(c.mo23978a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (c.mo23979b() != null) {
                arrayList.add(c.mo23979b());
            }
        }
        this.f5987n.mo23853c(arrayList);
        this.f5987n.mo23851a(onlineState);
    }

    /* renamed from: b */
    public ImmutableSortedSet<DocumentKey> mo23899b(int i) {
        LimboResolution limboResolution = this.f5981h.get(Integer.valueOf(i));
        if (limboResolution != null && limboResolution.f5990b) {
            return DocumentKey.m75847f().mo23560f(limboResolution.f5989a);
        }
        ImmutableSortedSet<DocumentKey> f = DocumentKey.m75847f();
        if (this.f5977d.containsKey(Integer.valueOf(i))) {
            for (Query query : this.f5977d.get(Integer.valueOf(i))) {
                if (this.f5976c.containsKey(query)) {
                    f = f.mo23566j(this.f5976c.get(query).mo23943c().mo23975i());
                }
            }
        }
        return f;
    }

    /* renamed from: c */
    public void mo23900c(int i, C12537b1 b1Var) {
        m8180h("handleRejectedListen");
        LimboResolution limboResolution = this.f5981h.get(Integer.valueOf(i));
        DocumentKey c = limboResolution != null ? limboResolution.f5989a : null;
        if (c != null) {
            this.f5980g.remove(c);
            this.f5981h.remove(Integer.valueOf(i));
            m8187r();
            SnapshotVersion snapshotVersion = SnapshotVersion.f54468c;
            mo23902e(new RemoteEvent(snapshotVersion, Collections.emptyMap(), Collections.emptySet(), Collections.singletonMap(c, MutableDocument.m75873r(c, snapshotVersion)), Collections.singleton(c)));
            return;
        }
        this.f5974a.mo62607L(i);
        m8188t(i, b1Var);
    }

    /* renamed from: d */
    public void mo23901d(int i, C12537b1 b1Var) {
        m8180h("handleRejectedWrite");
        ImmutableSortedMap<DocumentKey, Document> K = this.f5974a.mo62606K(i);
        if (!K.isEmpty()) {
            m8185p(b1Var, "Write failed at %s", K.mo23537i().mo62832k());
        }
        m8186q(i, b1Var);
        m8190v(i);
        m8181i(K, (RemoteEvent) null);
    }

    /* renamed from: e */
    public void mo23902e(RemoteEvent remoteEvent) {
        m8180h("handleRemoteEvent");
        for (Map.Entry next : remoteEvent.mo63053d().entrySet()) {
            TargetChange targetChange = (TargetChange) next.getValue();
            LimboResolution limboResolution = this.f5981h.get((Integer) next.getKey());
            if (limboResolution != null) {
                Assert.m76443d((targetChange.mo63098b().size() + targetChange.mo63099c().size()) + targetChange.mo63100d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (targetChange.mo63098b().size() > 0) {
                    boolean unused = limboResolution.f5990b = true;
                } else if (targetChange.mo63099c().size() > 0) {
                    Assert.m76443d(limboResolution.f5990b, "Received change for limbo target document without add.", new Object[0]);
                } else if (targetChange.mo63100d().size() > 0) {
                    Assert.m76443d(limboResolution.f5990b, "Received remove for limbo target document without add.", new Object[0]);
                    boolean unused2 = limboResolution.f5990b = false;
                }
            }
        }
        m8181i(this.f5974a.mo62613f(remoteEvent), remoteEvent);
    }

    /* renamed from: f */
    public void mo23903f(MutationBatchResult mutationBatchResult) {
        m8180h("handleSuccessfulWrite");
        m8186q(mutationBatchResult.mo62921b().mo62914e(), (C12537b1) null);
        m8190v(mutationBatchResult.mo62921b().mo62914e());
        m8181i(this.f5974a.mo62611d(mutationBatchResult), (RemoteEvent) null);
    }

    /* renamed from: l */
    public void mo23945l(User user) {
        boolean z = !this.f5986m.equals(user);
        this.f5986m = user;
        if (z) {
            m8183k();
            m8181i(this.f5974a.mo62622p(user), (RemoteEvent) null);
        }
        this.f5975b.mo63091s();
    }

    /* renamed from: n */
    public int mo23946n(Query query) {
        m8180h("listen");
        Assert.m76443d(!this.f5976c.containsKey(query), "We already listen to query: %s", query);
        TargetData e = this.f5974a.mo62612e(query.mo23934z());
        this.f5987n.mo23853c(Collections.singletonList(m8184m(query, e.mo62788g())));
        this.f5975b.mo63080D(e);
        return e.mo62788g();
    }

    /* renamed from: o */
    public void mo23947o(BundleReader bundleReader, LoadBundleTask loadBundleTask) {
        try {
            BundleMetadata d = bundleReader.mo23778d();
            if (this.f5974a.mo62623q(d)) {
                loadBundleTask.mo23698B(LoadBundleTaskProgress.m7905b(d));
                try {
                    bundleReader.mo23777b();
                } catch (IOException e) {
                    Logger.m76511d(f5973o, "Exception while closing bundle", e);
                }
            } else {
                loadBundleTask.mo23699C(LoadBundleTaskProgress.m7904a(d));
                BundleLoader bundleLoader = new BundleLoader(this.f5974a, d);
                long j = 0;
                while (true) {
                    BundleElement f = bundleReader.mo23780f();
                    if (f != null) {
                        long e2 = bundleReader.mo23779e();
                        LoadBundleTaskProgress a = bundleLoader.mo23768a(f, e2 - j);
                        if (a != null) {
                            loadBundleTask.mo23699C(a);
                        }
                        j = e2;
                    } else {
                        m8181i(bundleLoader.mo23769b(), (RemoteEvent) null);
                        this.f5974a.mo23763c(d);
                        loadBundleTask.mo23698B(LoadBundleTaskProgress.m7905b(d));
                        try {
                            bundleReader.mo23777b();
                            return;
                        } catch (IOException e3) {
                            Logger.m76511d(f5973o, "Exception while closing bundle", e3);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e4) {
            Logger.m76511d("Firestore", "Loading bundle failed : %s", e4);
            loadBundleTask.mo23697A(new FirebaseFirestoreException("Bundle failed to load", FirebaseFirestoreException.Code.INVALID_ARGUMENT, e4));
            try {
                bundleReader.mo23777b();
            } catch (IOException e5) {
                Logger.m76511d(f5973o, "Exception while closing bundle", e5);
            }
        } catch (Throwable th) {
            try {
                bundleReader.mo23777b();
            } catch (IOException e6) {
                Logger.m76511d(f5973o, "Exception while closing bundle", e6);
            }
            throw th;
        }
    }

    /* renamed from: s */
    public void mo23948s(TaskCompletionSource<Void> taskCompletionSource) {
        if (!this.f5975b.mo63086l()) {
            Logger.m76508a(f5973o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int j = this.f5974a.mo62616j();
        if (j == -1) {
            taskCompletionSource.mo56139c(null);
            return;
        }
        if (!this.f5984k.containsKey(Integer.valueOf(j))) {
            this.f5984k.put(Integer.valueOf(j), new ArrayList());
        }
        this.f5984k.get(Integer.valueOf(j)).add(taskCompletionSource);
    }

    /* renamed from: w */
    public void mo23949w(SyncEngineCallback syncEngineCallback) {
        this.f5987n = syncEngineCallback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo23950x(Query query) {
        m8180h("stopListening");
        QueryView queryView = this.f5976c.get(query);
        Assert.m76443d(queryView != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f5976c.remove(query);
        int b = queryView.mo23942b();
        List list = this.f5977d.get(Integer.valueOf(b));
        list.remove(query);
        if (list.isEmpty()) {
            this.f5974a.mo62607L(b);
            this.f5975b.mo63083P(b);
            m8188t(b, C12537b1.f59407f);
        }
    }

    /* renamed from: z */
    public <TResult> Task<TResult> mo23951z(AsyncQueue asyncQueue, Function<Transaction, Task<TResult>> function) {
        return new TransactionRunner(asyncQueue, this.f5975b, function).mo23967f();
    }
}
