package com.google.firebase.firestore.remote;

import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.DocumentViewChange;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.local.QueryPurpose;
import com.google.firebase.firestore.local.TargetData;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.remote.WatchChange;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WatchChangeAggregator {

    /* renamed from: a */
    private final TargetMetadataProvider f54703a;

    /* renamed from: b */
    private final Map<Integer, TargetState> f54704b = new HashMap();

    /* renamed from: c */
    private Map<DocumentKey, MutableDocument> f54705c = new HashMap();

    /* renamed from: d */
    private Map<DocumentKey, Set<Integer>> f54706d = new HashMap();

    /* renamed from: e */
    private Set<Integer> f54707e = new HashSet();

    /* renamed from: com.google.firebase.firestore.remote.WatchChangeAggregator$1 */
    static /* synthetic */ class C112471 {

        /* renamed from: a */
        static final /* synthetic */ int[] f54708a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType[] r0 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f54708a = r0
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.NoChange     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f54708a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Added     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f54708a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Removed     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f54708a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Current     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f54708a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.firebase.firestore.remote.WatchChange$WatchTargetChangeType r1 = com.google.firebase.firestore.remote.WatchChange.WatchTargetChangeType.Reset     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.remote.WatchChangeAggregator.C112471.<clinit>():void");
        }
    }

    public interface TargetMetadataProvider {
        @Nullable
        /* renamed from: a */
        TargetData mo63084a(int i);

        /* renamed from: b */
        ImmutableSortedSet<DocumentKey> mo63085b(int i);
    }

    public WatchChangeAggregator(TargetMetadataProvider targetMetadataProvider) {
        this.f54703a = targetMetadataProvider;
    }

    /* renamed from: a */
    private void m76396a(int i, MutableDocument mutableDocument) {
        DocumentViewChange.Type type;
        if (m76401j(i)) {
            if (m76405p(i, mutableDocument.getKey())) {
                type = DocumentViewChange.Type.MODIFIED;
            } else {
                type = DocumentViewChange.Type.ADDED;
            }
            m76398d(i).mo63105a(mutableDocument.getKey(), type);
            this.f54705c.put(mutableDocument.getKey(), mutableDocument);
            m76397c(mutableDocument.getKey()).add(Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    private Set<Integer> m76397c(DocumentKey documentKey) {
        Set<Integer> set = this.f54706d.get(documentKey);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f54706d.put(documentKey, hashSet);
        return hashSet;
    }

    /* renamed from: d */
    private TargetState m76398d(int i) {
        TargetState targetState = this.f54704b.get(Integer.valueOf(i));
        if (targetState != null) {
            return targetState;
        }
        TargetState targetState2 = new TargetState();
        this.f54704b.put(Integer.valueOf(i), targetState2);
        return targetState2;
    }

    /* renamed from: e */
    private int m76399e(int i) {
        TargetChange j = m76398d(i).mo63114j();
        return (this.f54703a.mo63085b(i).size() + j.mo63098b().size()) - j.mo63100d().size();
    }

    /* renamed from: f */
    private Collection<Integer> m76400f(WatchChange.WatchTargetChange watchTargetChange) {
        List<Integer> d = watchTargetChange.mo63129d();
        if (!d.isEmpty()) {
            return d;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.f54704b.keySet()) {
            if (m76401j(next.intValue())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private boolean m76401j(int i) {
        return m76402k(i) != null;
    }

    @Nullable
    /* renamed from: k */
    private TargetData m76402k(int i) {
        TargetState targetState = this.f54704b.get(Integer.valueOf(i));
        if (targetState == null || !targetState.mo63109e()) {
            return this.f54703a.mo63084a(i);
        }
        return null;
    }

    /* renamed from: m */
    private void m76403m(int i, DocumentKey documentKey, @Nullable MutableDocument mutableDocument) {
        if (m76401j(i)) {
            TargetState d = m76398d(i);
            if (m76405p(i, documentKey)) {
                d.mo63105a(documentKey, DocumentViewChange.Type.REMOVED);
            } else {
                d.mo63113i(documentKey);
            }
            m76397c(documentKey).add(Integer.valueOf(i));
            if (mutableDocument != null) {
                this.f54705c.put(documentKey, mutableDocument);
            }
        }
    }

    /* renamed from: o */
    private void m76404o(int i) {
        Assert.m76443d(this.f54704b.get(Integer.valueOf(i)) != null && !this.f54704b.get(Integer.valueOf(i)).mo63109e(), "Should only reset active targets", new Object[0]);
        this.f54704b.put(Integer.valueOf(i), new TargetState());
        Iterator<DocumentKey> it = this.f54703a.mo63085b(i).iterator();
        while (it.hasNext()) {
            m76403m(i, it.next(), (MutableDocument) null);
        }
    }

    /* renamed from: p */
    private boolean m76405p(int i, DocumentKey documentKey) {
        return this.f54703a.mo63085b(i).contains(documentKey);
    }

    /* renamed from: b */
    public RemoteEvent mo63133b(SnapshotVersion snapshotVersion) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f54704b.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            TargetState targetState = (TargetState) next.getValue();
            TargetData k = m76402k(intValue);
            if (k != null) {
                if (targetState.mo63108d() && k.mo62787f().mo23963j()) {
                    DocumentKey i = DocumentKey.m75849i(k.mo62787f().mo23959g());
                    if (this.f54705c.get(i) == null && !m76405p(intValue, i)) {
                        m76403m(intValue, i, MutableDocument.m75873r(i, snapshotVersion));
                    }
                }
                if (targetState.mo63107c()) {
                    hashMap.put(Integer.valueOf(intValue), targetState.mo63114j());
                    targetState.mo63106b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry next2 : this.f54706d.entrySet()) {
            DocumentKey documentKey = (DocumentKey) next2.getKey();
            boolean z = true;
            Iterator it = ((Set) next2.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    TargetData k2 = m76402k(((Integer) it.next()).intValue());
                    if (k2 != null && !k2.mo62782b().equals(QueryPurpose.LIMBO_RESOLUTION)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                hashSet.add(documentKey);
            }
        }
        RemoteEvent remoteEvent = new RemoteEvent(snapshotVersion, Collections.unmodifiableMap(hashMap), Collections.unmodifiableSet(this.f54707e), Collections.unmodifiableMap(this.f54705c), Collections.unmodifiableSet(hashSet));
        this.f54705c = new HashMap();
        this.f54706d = new HashMap();
        this.f54707e = new HashSet();
        return remoteEvent;
    }

    /* renamed from: g */
    public void mo63134g(WatchChange.DocumentChange documentChange) {
        MutableDocument b = documentChange.mo63117b();
        DocumentKey a = documentChange.mo63116a();
        for (Integer intValue : documentChange.mo63119d()) {
            int intValue2 = intValue.intValue();
            if (b == null || !b.mo62822e()) {
                m76403m(intValue2, a, b);
            } else {
                m76396a(intValue2, b);
            }
        }
        for (Integer intValue3 : documentChange.mo63118c()) {
            m76403m(intValue3.intValue(), a, documentChange.mo63117b());
        }
    }

    /* renamed from: h */
    public void mo63135h(WatchChange.ExistenceFilterWatchChange existenceFilterWatchChange) {
        int b = existenceFilterWatchChange.mo63124b();
        int a = existenceFilterWatchChange.mo63123a().mo63023a();
        TargetData k = m76402k(b);
        if (k != null) {
            Target f = k.mo62787f();
            if (f.mo23963j()) {
                if (a == 0) {
                    DocumentKey i = DocumentKey.m75849i(f.mo23959g());
                    m76403m(b, i, MutableDocument.m75873r(i, SnapshotVersion.f54468c));
                    return;
                }
                Assert.m76443d(a == 1, "Single document existence filter with count: %d", Integer.valueOf(a));
            } else if (((long) m76399e(b)) != ((long) a)) {
                m76404o(b);
                this.f54707e.add(Integer.valueOf(b));
            }
        }
    }

    /* renamed from: i */
    public void mo63136i(WatchChange.WatchTargetChange watchTargetChange) {
        for (Integer intValue : m76400f(watchTargetChange)) {
            int intValue2 = intValue.intValue();
            TargetState d = m76398d(intValue2);
            int i = C112471.f54708a[watchTargetChange.mo63127b().ordinal()];
            boolean z = true;
            if (i != 1) {
                if (i == 2) {
                    d.mo63112h();
                    if (!d.mo63109e()) {
                        d.mo63106b();
                    }
                    d.mo63115k(watchTargetChange.mo63128c());
                } else if (i == 3) {
                    d.mo63112h();
                    if (!d.mo63109e()) {
                        mo63138n(intValue2);
                    }
                    if (watchTargetChange.mo63126a() != null) {
                        z = false;
                    }
                    Assert.m76443d(z, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (i != 4) {
                    if (i != 5) {
                        throw Assert.m76440a("Unknown target watch change state: %s", watchTargetChange.mo63127b());
                    } else if (m76401j(intValue2)) {
                        m76404o(intValue2);
                        d.mo63115k(watchTargetChange.mo63128c());
                    }
                } else if (m76401j(intValue2)) {
                    d.mo63110f();
                    d.mo63115k(watchTargetChange.mo63128c());
                }
            } else if (m76401j(intValue2)) {
                d.mo63115k(watchTargetChange.mo63128c());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo63137l(int i) {
        m76398d(i).mo63111g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo63138n(int i) {
        this.f54704b.remove(Integer.valueOf(i));
    }
}
