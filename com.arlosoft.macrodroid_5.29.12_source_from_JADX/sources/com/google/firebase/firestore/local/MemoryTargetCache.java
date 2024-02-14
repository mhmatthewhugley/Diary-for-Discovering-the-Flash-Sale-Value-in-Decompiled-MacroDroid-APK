package com.google.firebase.firestore.local;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.firebase.database.collection.ImmutableSortedSet;
import com.google.firebase.firestore.core.Target;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.util.Consumer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class MemoryTargetCache implements TargetCache {

    /* renamed from: a */
    private final Map<Target, TargetData> f54292a = new HashMap();

    /* renamed from: b */
    private final ReferenceSet f54293b = new ReferenceSet();

    /* renamed from: c */
    private int f54294c;

    /* renamed from: d */
    private SnapshotVersion f54295d = SnapshotVersion.f54468c;

    /* renamed from: e */
    private long f54296e = 0;

    /* renamed from: f */
    private final MemoryPersistence f54297f;

    MemoryTargetCache(MemoryPersistence memoryPersistence) {
        this.f54297f = memoryPersistence;
    }

    /* renamed from: a */
    public void mo62710a(TargetData targetData) {
        mo62713d(targetData);
    }

    /* renamed from: b */
    public void mo62711b(SnapshotVersion snapshotVersion) {
        this.f54295d = snapshotVersion;
    }

    /* renamed from: c */
    public void mo62712c(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        this.f54293b.mo62733g(immutableSortedSet, i);
        ReferenceDelegate d = this.f54297f.mo62688d();
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            d.mo62665p(it.next());
        }
    }

    /* renamed from: d */
    public void mo62713d(TargetData targetData) {
        this.f54292a.put(targetData.mo62787f(), targetData);
        int g = targetData.mo62788g();
        if (g > this.f54294c) {
            this.f54294c = g;
        }
        if (targetData.mo62784d() > this.f54296e) {
            this.f54296e = targetData.mo62784d();
        }
    }

    @Nullable
    /* renamed from: e */
    public TargetData mo62714e(Target target) {
        return this.f54292a.get(target);
    }

    /* renamed from: f */
    public int mo62715f() {
        return this.f54294c;
    }

    /* renamed from: g */
    public ImmutableSortedSet<DocumentKey> mo62716g(int i) {
        return this.f54293b.mo62731d(i);
    }

    /* renamed from: h */
    public SnapshotVersion mo62717h() {
        return this.f54295d;
    }

    /* renamed from: i */
    public void mo62718i(ImmutableSortedSet<DocumentKey> immutableSortedSet, int i) {
        this.f54293b.mo62729b(immutableSortedSet, i);
        ReferenceDelegate d = this.f54297f.mo62688d();
        Iterator<DocumentKey> it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            d.mo62664o(it.next());
        }
    }

    /* renamed from: j */
    public void mo62719j(int i) {
        this.f54293b.mo62734h(i);
    }

    /* renamed from: k */
    public boolean mo62720k(DocumentKey documentKey) {
        return this.f54293b.mo62730c(documentKey);
    }

    /* renamed from: l */
    public void mo62721l(Consumer<TargetData> consumer) {
        for (TargetData accept : this.f54292a.values()) {
            consumer.accept(accept);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public long mo62722m(LocalSerializer localSerializer) {
        long j = 0;
        for (Map.Entry<Target, TargetData> value : this.f54292a.entrySet()) {
            j += (long) localSerializer.mo62603m((TargetData) value.getValue()).mo65174c();
        }
        return j;
    }

    /* renamed from: n */
    public long mo62723n() {
        return (long) this.f54292a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo62724o(long j, SparseArray<?> sparseArray) {
        Iterator<Map.Entry<Target, TargetData>> it = this.f54292a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry next = it.next();
            int g = ((TargetData) next.getValue()).mo62788g();
            if (((TargetData) next.getValue()).mo62784d() <= j && sparseArray.get(g) == null) {
                it.remove();
                mo62719j(g);
                i++;
            }
        }
        return i;
    }

    /* renamed from: p */
    public void mo62725p(TargetData targetData) {
        this.f54292a.remove(targetData.mo62787f());
        this.f54293b.mo62734h(targetData.mo62788g());
    }
}
