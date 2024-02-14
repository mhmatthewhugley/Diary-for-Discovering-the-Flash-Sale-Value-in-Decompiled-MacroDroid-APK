package com.google.firebase.firestore.local;

import com.google.firebase.firestore.auth.User;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Supplier;
import java.util.HashMap;
import java.util.Map;

public final class MemoryPersistence extends Persistence {

    /* renamed from: c */
    private final Map<User, MemoryMutationQueue> f54280c = new HashMap();

    /* renamed from: d */
    private final MemoryIndexManager f54281d = new MemoryIndexManager();

    /* renamed from: e */
    private final MemoryTargetCache f54282e = new MemoryTargetCache(this);

    /* renamed from: f */
    private final MemoryBundleCache f54283f = new MemoryBundleCache();

    /* renamed from: g */
    private final MemoryRemoteDocumentCache f54284g = new MemoryRemoteDocumentCache(this);

    /* renamed from: h */
    private ReferenceDelegate f54285h;

    /* renamed from: i */
    private boolean f54286i;

    private MemoryPersistence() {
    }

    /* renamed from: l */
    public static MemoryPersistence m75482l() {
        MemoryPersistence memoryPersistence = new MemoryPersistence();
        memoryPersistence.m75483p(new MemoryEagerReferenceDelegate(memoryPersistence));
        return memoryPersistence;
    }

    /* renamed from: p */
    private void m75483p(ReferenceDelegate referenceDelegate) {
        this.f54285h = referenceDelegate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public BundleCache mo62685a() {
        return this.f54283f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public IndexManager mo62686b() {
        return this.f54281d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public MutationQueue mo62687c(User user) {
        MemoryMutationQueue memoryMutationQueue = this.f54280c.get(user);
        if (memoryMutationQueue != null) {
            return memoryMutationQueue;
        }
        MemoryMutationQueue memoryMutationQueue2 = new MemoryMutationQueue(this);
        this.f54280c.put(user, memoryMutationQueue2);
        return memoryMutationQueue2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ReferenceDelegate mo62688d() {
        return this.f54285h;
    }

    /* renamed from: g */
    public boolean mo62691g() {
        return this.f54286i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <T> T mo62692h(String str, Supplier<T> supplier) {
        this.f54285h.mo62660i();
        try {
            return supplier.get();
        } finally {
            this.f54285h.mo62659h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo62693i(String str, Runnable runnable) {
        this.f54285h.mo62660i();
        try {
            runnable.run();
        } finally {
            this.f54285h.mo62659h();
        }
    }

    /* renamed from: j */
    public void mo62694j() {
        Assert.m76443d(this.f54286i, "MemoryPersistence shutdown without start", new Object[0]);
        this.f54286i = false;
    }

    /* renamed from: k */
    public void mo62695k() {
        Assert.m76443d(!this.f54286i, "MemoryPersistence double-started!", new Object[0]);
        this.f54286i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public Iterable<MemoryMutationQueue> mo62696m() {
        return this.f54280c.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public MemoryRemoteDocumentCache mo62689e() {
        return this.f54284g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public MemoryTargetCache mo62690f() {
        return this.f54282e;
    }
}
