package com.google.firebase.firestore.local;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.Timestamp;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.bundle.BundleCallback;
import com.google.firebase.firestore.bundle.BundleMetadata;
import com.google.firebase.firestore.bundle.NamedQuery;
import com.google.firebase.firestore.core.Query;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.core.TargetIdGenerator;
import com.google.firebase.firestore.local.LruGarbageCollector;
import com.google.firebase.firestore.model.Document;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.ObjectValue;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.MutationBatch;
import com.google.firebase.firestore.model.mutation.MutationBatchResult;
import com.google.firebase.firestore.model.mutation.PatchMutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.remote.RemoteEvent;
import com.google.firebase.firestore.remote.TargetChange;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Logger;
import com.google.protobuf.ByteString;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class LocalStore implements BundleCallback {

    /* renamed from: l */
    private static final long f54179l = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a */
    private final Persistence f54180a;

    /* renamed from: b */
    private MutationQueue f54181b;

    /* renamed from: c */
    private final RemoteDocumentCache f54182c;

    /* renamed from: d */
    private LocalDocumentsView f54183d;

    /* renamed from: e */
    private QueryEngine f54184e;

    /* renamed from: f */
    private final ReferenceSet f54185f;

    /* renamed from: g */
    private final TargetCache f54186g;

    /* renamed from: h */
    private final BundleCache f54187h;

    /* renamed from: i */
    private final SparseArray<TargetData> f54188i = new SparseArray<>();

    /* renamed from: j */
    private final Map<Target, Integer> f54189j = new HashMap();

    /* renamed from: k */
    private final TargetIdGenerator f54190k;

    private static class AllocateQueryHolder {

        /* renamed from: a */
        TargetData f54191a;

        /* renamed from: b */
        int f54192b;

        private AllocateQueryHolder() {
        }
    }

    public LocalStore(Persistence persistence, QueryEngine queryEngine, User user) {
        Assert.m76443d(persistence.mo62691g(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f54180a = persistence;
        TargetCache f = persistence.mo62690f();
        this.f54186g = f;
        this.f54187h = persistence.mo62685a();
        this.f54190k = TargetIdGenerator.m8223b(f.mo62715f());
        this.f54181b = persistence.mo62687c(user);
        RemoteDocumentCache e = persistence.mo62689e();
        this.f54182c = e;
        LocalDocumentsView localDocumentsView = new LocalDocumentsView(e, this.f54181b, persistence.mo62686b());
        this.f54183d = localDocumentsView;
        this.f54184e = queryEngine;
        queryEngine.mo62579a(localDocumentsView);
        ReferenceSet referenceSet = new ReferenceSet();
        this.f54185f = referenceSet;
        persistence.mo62688d().mo62663n(referenceSet);
    }

    /* renamed from: A */
    static /* synthetic */ void m75329A(LocalStore localStore, int i) {
        TargetData targetData = localStore.f54188i.get(i);
        Assert.m76443d(targetData != null, "Tried to release nonexistent target: %s", Integer.valueOf(i));
        Iterator<DocumentKey> it = localStore.f54185f.mo62734h(i).iterator();
        while (it.hasNext()) {
            localStore.f54180a.mo62688d().mo62665p(it.next());
        }
        localStore.f54180a.mo62688d().mo62662l(targetData);
        localStore.f54188i.remove(i);
        localStore.f54189j.remove(targetData.mo62787f());
    }

    /* renamed from: C */
    static /* synthetic */ void m75331C(LocalStore localStore, NamedQuery namedQuery, TargetData targetData, int i, ImmutableSortedSet immutableSortedSet) {
        if (namedQuery.mo23797c().compareTo(targetData.mo62785e()) > 0) {
            TargetData i2 = targetData.mo62791i(ByteString.f56619a, namedQuery.mo23797c());
            localStore.f54188i.append(i, i2);
            localStore.f54186g.mo62710a(i2);
            localStore.f54186g.mo62719j(i);
            localStore.f54186g.mo62718i(immutableSortedSet, i);
        }
        localStore.f54187h.mo62575a(namedQuery);
    }

    /* renamed from: F */
    static /* synthetic */ LocalWriteResult m75334F(LocalStore localStore, Set set, List list, Timestamp timestamp) {
        ImmutableSortedMap<DocumentKey, Document> e = localStore.f54183d.mo62593e(set);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Mutation mutation = (Mutation) it.next();
            ObjectValue c = mutation.mo62900c(e.mo23534d(mutation.mo62902e()));
            if (c != null) {
                arrayList.add(new PatchMutation(mutation.mo62902e(), c, c.mo62868k(), Precondition.m75995a(true)));
            }
        }
        MutationBatch g = localStore.f54181b.mo62674g(timestamp, arrayList, list);
        return new LocalWriteResult(g.mo62914e(), g.mo62910a(e));
    }

    /* renamed from: G */
    private static Target m75335G(String str) {
        return Query.m8139b(ResourcePath.m75903t("__bundle__/docs/" + str)).mo23934z();
    }

    /* renamed from: I */
    private Map<DocumentKey, MutableDocument> m75336I(Map<DocumentKey, MutableDocument> map, @Nullable Map<DocumentKey, SnapshotVersion> map2, SnapshotVersion snapshotVersion) {
        HashMap hashMap = new HashMap();
        Map<DocumentKey, MutableDocument> c = this.f54182c.mo62701c(map.keySet());
        for (Map.Entry next : map.entrySet()) {
            DocumentKey documentKey = (DocumentKey) next.getKey();
            MutableDocument mutableDocument = (MutableDocument) next.getValue();
            MutableDocument mutableDocument2 = c.get(documentKey);
            SnapshotVersion snapshotVersion2 = map2 != null ? map2.get(documentKey) : snapshotVersion;
            if (mutableDocument.mo62821d() && mutableDocument.getVersion().equals(SnapshotVersion.f54468c)) {
                this.f54182c.mo62700b(mutableDocument.getKey());
                hashMap.put(documentKey, mutableDocument);
            } else if (!mutableDocument2.mo62858o() || mutableDocument.getVersion().compareTo(mutableDocument2.getVersion()) > 0 || (mutableDocument.getVersion().compareTo(mutableDocument2.getVersion()) == 0 && mutableDocument2.mo62820c())) {
                Assert.m76443d(!SnapshotVersion.f54468c.equals(snapshotVersion2), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f54182c.mo62702d(mutableDocument, snapshotVersion2);
                hashMap.put(documentKey, mutableDocument);
            } else {
                Logger.m76508a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", documentKey, mutableDocument2.getVersion(), mutableDocument.getVersion());
            }
        }
        return hashMap;
    }

    /* renamed from: N */
    private static boolean m75337N(TargetData targetData, TargetData targetData2, TargetChange targetChange) {
        Assert.m76443d(!targetData2.mo62783c().isEmpty(), "Attempted to persist query data with empty resume token", new Object[0]);
        if (!targetData.mo62783c().isEmpty() && targetData2.mo62785e().mo62876d().mo61973e() - targetData.mo62785e().mo62876d().mo61973e() < f54179l && targetChange.mo63098b().size() + targetChange.mo63099c().size() + targetChange.mo63100d().size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    private void m75338P() {
        this.f54180a.mo62693i("Start MutationQueue", LocalStore$$Lambda$1.m75372a(this));
    }

    /* renamed from: g */
    private void m75339g(MutationBatchResult mutationBatchResult) {
        MutationBatch b = mutationBatchResult.mo62921b();
        for (DocumentKey next : b.mo62916f()) {
            MutableDocument a = this.f54182c.mo62699a(next);
            SnapshotVersion d = mutationBatchResult.mo62923d().mo23534d(next);
            Assert.m76443d(d != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (a.getVersion().compareTo(d) < 0) {
                b.mo62912c(a, mutationBatchResult);
                if (a.mo62858o()) {
                    this.f54182c.mo62702d(a, mutationBatchResult.mo62922c());
                }
            }
        }
        this.f54181b.mo62678k(b);
    }

    /* renamed from: r */
    static /* synthetic */ ImmutableSortedMap m75340r(LocalStore localStore, MutationBatchResult mutationBatchResult) {
        MutationBatch b = mutationBatchResult.mo62921b();
        localStore.f54181b.mo62673f(b, mutationBatchResult.mo62925f());
        localStore.m75339g(mutationBatchResult);
        localStore.f54181b.mo62668a();
        return localStore.f54183d.mo62593e(b.mo62916f());
    }

    /* renamed from: s */
    static /* synthetic */ void m75341s(LocalStore localStore, AllocateQueryHolder allocateQueryHolder, Target target) {
        int c = localStore.f54190k.mo23965c();
        allocateQueryHolder.f54192b = c;
        TargetData targetData = new TargetData(target, c, localStore.f54180a.mo62688d().mo62657d(), QueryPurpose.LISTEN);
        allocateQueryHolder.f54191a = targetData;
        localStore.f54186g.mo62713d(targetData);
    }

    /* renamed from: t */
    static /* synthetic */ ImmutableSortedMap m75342t(LocalStore localStore, ImmutableSortedMap immutableSortedMap, TargetData targetData) {
        ImmutableSortedSet<DocumentKey> f = DocumentKey.m75847f();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = immutableSortedMap.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            DocumentKey documentKey = (DocumentKey) entry.getKey();
            MutableDocument mutableDocument = (MutableDocument) entry.getValue();
            if (mutableDocument.mo62822e()) {
                f = f.mo23560f(documentKey);
            }
            hashMap.put(documentKey, mutableDocument);
            hashMap2.put(documentKey, mutableDocument.getVersion());
        }
        localStore.f54186g.mo62719j(targetData.mo62788g());
        localStore.f54186g.mo62718i(f, targetData.mo62788g());
        return localStore.f54183d.mo62595j(localStore.m75336I(hashMap, hashMap2, SnapshotVersion.f54468c));
    }

    /* renamed from: u */
    static /* synthetic */ ImmutableSortedMap m75343u(LocalStore localStore, RemoteEvent remoteEvent, SnapshotVersion snapshotVersion) {
        Map<Integer, TargetChange> d = remoteEvent.mo63053d();
        long d2 = localStore.f54180a.mo62688d().mo62657d();
        for (Map.Entry next : d.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            TargetChange targetChange = (TargetChange) next.getValue();
            TargetData targetData = localStore.f54188i.get(intValue);
            if (targetData != null) {
                localStore.f54186g.mo62712c(targetChange.mo63100d(), intValue);
                localStore.f54186g.mo62718i(targetChange.mo63098b(), intValue);
                ByteString e = targetChange.mo63101e();
                if (!e.isEmpty()) {
                    TargetData j = targetData.mo62791i(e, remoteEvent.mo63052c()).mo62792j(d2);
                    localStore.f54188i.put(intValue, j);
                    if (m75337N(targetData, j, targetChange)) {
                        localStore.f54186g.mo62710a(j);
                    }
                }
            }
        }
        Map<DocumentKey, MutableDocument> a = remoteEvent.mo63050a();
        Set<DocumentKey> b = remoteEvent.mo63051b();
        for (DocumentKey next2 : a.keySet()) {
            if (b.contains(next2)) {
                localStore.f54180a.mo62688d().mo62658g(next2);
            }
        }
        Map<DocumentKey, MutableDocument> I = localStore.m75336I(a, (Map<DocumentKey, SnapshotVersion>) null, remoteEvent.mo63052c());
        SnapshotVersion h = localStore.f54186g.mo62717h();
        if (!snapshotVersion.equals(SnapshotVersion.f54468c)) {
            Assert.m76443d(snapshotVersion.compareTo(h) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", snapshotVersion, h);
            localStore.f54186g.mo62711b(snapshotVersion);
        }
        return localStore.f54183d.mo62595j(I);
    }

    /* renamed from: x */
    static /* synthetic */ Boolean m75346x(LocalStore localStore, BundleMetadata bundleMetadata) {
        BundleMetadata c = localStore.f54187h.mo62577c(bundleMetadata.mo23770a());
        return Boolean.valueOf(c != null && c.mo23771b().compareTo(bundleMetadata.mo23771b()) >= 0);
    }

    /* renamed from: y */
    static /* synthetic */ void m75347y(LocalStore localStore, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalViewChanges localViewChanges = (LocalViewChanges) it.next();
            int d = localViewChanges.mo62634d();
            localStore.f54185f.mo62729b(localViewChanges.mo62632b(), d);
            ImmutableSortedSet<DocumentKey> c = localViewChanges.mo62633c();
            Iterator<DocumentKey> it2 = c.iterator();
            while (it2.hasNext()) {
                localStore.f54180a.mo62688d().mo62665p(it2.next());
            }
            localStore.f54185f.mo62733g(c, d);
            if (!localViewChanges.mo62635e()) {
                TargetData targetData = localStore.f54188i.get(d);
                Assert.m76443d(targetData != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(d));
                localStore.f54188i.put(d, targetData.mo62789h(targetData.mo62785e()));
            }
        }
    }

    /* renamed from: z */
    static /* synthetic */ ImmutableSortedMap m75348z(LocalStore localStore, int i) {
        MutationBatch d = localStore.f54181b.mo62671d(i);
        Assert.m76443d(d != null, "Attempt to reject nonexistent batch!", new Object[0]);
        localStore.f54181b.mo62678k(d);
        localStore.f54181b.mo62668a();
        return localStore.f54183d.mo62593e(d.mo62916f());
    }

    /* renamed from: H */
    public void mo62604H(List<LocalViewChanges> list) {
        this.f54180a.mo62693i("notifyLocalViewChanges", LocalStore$$Lambda$7.m75384a(this, list));
    }

    /* renamed from: J */
    public Document mo62605J(DocumentKey documentKey) {
        return this.f54183d.mo62592c(documentKey);
    }

    /* renamed from: K */
    public ImmutableSortedMap<DocumentKey, Document> mo62606K(int i) {
        return (ImmutableSortedMap) this.f54180a.mo62692h("Reject batch", LocalStore$$Lambda$4.m75381a(this, i));
    }

    /* renamed from: L */
    public void mo62607L(int i) {
        this.f54180a.mo62693i("Release target", LocalStore$$Lambda$14.m75377a(this, i));
    }

    /* renamed from: M */
    public void mo62608M(ByteString byteString) {
        this.f54180a.mo62693i("Set stream token", LocalStore$$Lambda$5.m75382a(this, byteString));
    }

    /* renamed from: O */
    public void mo62609O() {
        m75338P();
    }

    /* renamed from: Q */
    public LocalWriteResult mo62610Q(List<Mutation> list) {
        Timestamp f = Timestamp.m74424f();
        HashSet hashSet = new HashSet();
        for (Mutation e : list) {
            hashSet.add(e.mo62902e());
        }
        return (LocalWriteResult) this.f54180a.mo62692h("Locally write mutations", LocalStore$$Lambda$2.m75379a(this, hashSet, list, f));
    }

    /* renamed from: a */
    public ImmutableSortedMap<DocumentKey, Document> mo23761a(ImmutableSortedMap<DocumentKey, MutableDocument> immutableSortedMap, String str) {
        return (ImmutableSortedMap) this.f54180a.mo62692h("Apply bundle documents", LocalStore$$Lambda$11.m75374a(this, immutableSortedMap, mo62612e(m75335G(str))));
    }

    /* renamed from: b */
    public void mo23762b(NamedQuery namedQuery, ImmutableSortedSet<DocumentKey> immutableSortedSet) {
        TargetData e = mo62612e(namedQuery.mo23795a().mo23792b());
        this.f54180a.mo62693i("Saved named query", LocalStore$$Lambda$12.m75375a(this, namedQuery, e, e.mo62788g(), immutableSortedSet));
    }

    /* renamed from: c */
    public void mo23763c(BundleMetadata bundleMetadata) {
        this.f54180a.mo62693i("Save bundle", LocalStore$$Lambda$10.m75373a(this, bundleMetadata));
    }

    /* renamed from: d */
    public ImmutableSortedMap<DocumentKey, Document> mo62611d(MutationBatchResult mutationBatchResult) {
        return (ImmutableSortedMap) this.f54180a.mo62692h("Acknowledge batch", LocalStore$$Lambda$3.m75380a(this, mutationBatchResult));
    }

    /* renamed from: e */
    public TargetData mo62612e(Target target) {
        int i;
        TargetData e = this.f54186g.mo62714e(target);
        if (e != null) {
            i = e.mo62788g();
        } else {
            AllocateQueryHolder allocateQueryHolder = new AllocateQueryHolder();
            this.f54180a.mo62693i("Allocate target", LocalStore$$Lambda$8.m75385a(this, allocateQueryHolder, target));
            i = allocateQueryHolder.f54192b;
            e = allocateQueryHolder.f54191a;
        }
        if (this.f54188i.get(i) == null) {
            this.f54188i.put(i, e);
            this.f54189j.put(target, Integer.valueOf(i));
        }
        return e;
    }

    /* renamed from: f */
    public ImmutableSortedMap<DocumentKey, Document> mo62613f(RemoteEvent remoteEvent) {
        return (ImmutableSortedMap) this.f54180a.mo62692h("Apply remote event", LocalStore$$Lambda$6.m75383a(this, remoteEvent, remoteEvent.mo63052c()));
    }

    /* renamed from: h */
    public LruGarbageCollector.Results mo62614h(LruGarbageCollector lruGarbageCollector) {
        return (LruGarbageCollector.Results) this.f54180a.mo62692h("Collect garbage", LocalStore$$Lambda$15.m75378a(this, lruGarbageCollector));
    }

    /* renamed from: i */
    public QueryResult mo62615i(Query query, boolean z) {
        SnapshotVersion snapshotVersion;
        ImmutableSortedSet<DocumentKey> immutableSortedSet;
        ImmutableSortedSet<DocumentKey> immutableSortedSet2;
        TargetData o = mo62621o(query.mo23934z());
        SnapshotVersion snapshotVersion2 = SnapshotVersion.f54468c;
        ImmutableSortedSet<DocumentKey> f = DocumentKey.m75847f();
        if (o != null) {
            snapshotVersion = o.mo62781a();
            immutableSortedSet = this.f54186g.mo62716g(o.mo62788g());
        } else {
            immutableSortedSet = f;
            snapshotVersion = snapshotVersion2;
        }
        QueryEngine queryEngine = this.f54184e;
        if (z) {
            snapshotVersion2 = snapshotVersion;
        }
        if (z) {
            immutableSortedSet2 = immutableSortedSet;
        } else {
            immutableSortedSet2 = DocumentKey.m75847f();
        }
        return new QueryResult(queryEngine.mo62580b(query, snapshotVersion2, immutableSortedSet2), immutableSortedSet);
    }

    /* renamed from: j */
    public int mo62616j() {
        return this.f54181b.mo62677j();
    }

    /* renamed from: k */
    public SnapshotVersion mo62617k() {
        return this.f54186g.mo62717h();
    }

    /* renamed from: l */
    public ByteString mo62618l() {
        return this.f54181b.mo62672e();
    }

    @Nullable
    /* renamed from: m */
    public NamedQuery mo62619m(String str) {
        return (NamedQuery) this.f54180a.mo62692h("Get named query", LocalStore$$Lambda$13.m75376a(this, str));
    }

    @Nullable
    /* renamed from: n */
    public MutationBatch mo62620n(int i) {
        return this.f54181b.mo62670c(i);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    /* renamed from: o */
    public TargetData mo62621o(Target target) {
        Integer num = this.f54189j.get(target);
        if (num != null) {
            return this.f54188i.get(num.intValue());
        }
        return this.f54186g.mo62714e(target);
    }

    /* renamed from: p */
    public ImmutableSortedMap<DocumentKey, Document> mo62622p(User user) {
        List<MutationBatch> m = this.f54181b.mo62680m();
        this.f54181b = this.f54180a.mo62687c(user);
        m75338P();
        List<MutationBatch> m2 = this.f54181b.mo62680m();
        LocalDocumentsView localDocumentsView = new LocalDocumentsView(this.f54182c, this.f54181b, this.f54180a.mo62686b());
        this.f54183d = localDocumentsView;
        this.f54184e.mo62579a(localDocumentsView);
        ImmutableSortedSet<DocumentKey> f = DocumentKey.m75847f();
        for (List<MutationBatch> it : Arrays.asList(new List[]{m, m2})) {
            for (MutationBatch h : it) {
                for (Mutation e : h.mo62918h()) {
                    f = f.mo23560f(e.mo62902e());
                }
            }
        }
        return this.f54183d.mo62593e(f);
    }

    /* renamed from: q */
    public boolean mo62623q(BundleMetadata bundleMetadata) {
        return ((Boolean) this.f54180a.mo62692h("Has newer bundle", LocalStore$$Lambda$9.m75386a(this, bundleMetadata))).booleanValue();
    }
}
