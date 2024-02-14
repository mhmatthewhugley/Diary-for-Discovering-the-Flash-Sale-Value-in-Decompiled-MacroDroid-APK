package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.MutableDocument;
import com.google.firebase.firestore.model.SnapshotVersion;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Precondition;
import com.google.firebase.firestore.model.mutation.VerifyMutation;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Executors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Transaction {

    /* renamed from: g */
    private static final Executor f6001g = m8226b();

    /* renamed from: a */
    private final Datastore f6002a;

    /* renamed from: b */
    private final HashMap<DocumentKey, SnapshotVersion> f6003b = new HashMap<>();

    /* renamed from: c */
    private final ArrayList<Mutation> f6004c = new ArrayList<>();

    /* renamed from: d */
    private boolean f6005d;

    /* renamed from: e */
    private FirebaseFirestoreException f6006e;

    /* renamed from: f */
    private Set<DocumentKey> f6007f = new HashSet();

    public Transaction(Datastore datastore) {
        this.f6002a = datastore;
    }

    /* renamed from: b */
    private static Executor m8226b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, (long) 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    private void m8227c() {
        Assert.m76443d(!this.f6005d, "A transaction object cannot be used after its update callback has been invoked.", new Object[0]);
    }

    /* renamed from: d */
    static /* synthetic */ Task m8228d(Task task) throws Exception {
        if (task.mo23719t()) {
            return Tasks.m66667f(null);
        }
        return Tasks.m66666e(task.mo23714o());
    }

    /* renamed from: e */
    static /* synthetic */ Task m8229e(Transaction transaction, Task task) throws Exception {
        if (task.mo23719t()) {
            for (MutableDocument g : (List) task.mo23715p()) {
                transaction.m8231g(g);
            }
        }
        return task;
    }

    /* renamed from: f */
    private Precondition m8230f(DocumentKey documentKey) {
        SnapshotVersion snapshotVersion = this.f6003b.get(documentKey);
        if (this.f6007f.contains(documentKey) || snapshotVersion == null) {
            return Precondition.f54494c;
        }
        return Precondition.m75996f(snapshotVersion);
    }

    /* renamed from: g */
    private void m8231g(MutableDocument mutableDocument) throws FirebaseFirestoreException {
        SnapshotVersion snapshotVersion;
        if (mutableDocument.mo62822e()) {
            snapshotVersion = mutableDocument.getVersion();
        } else if (mutableDocument.mo62821d()) {
            snapshotVersion = SnapshotVersion.f54468c;
        } else {
            throw Assert.m76440a("Unexpected document type in transaction: " + mutableDocument, new Object[0]);
        }
        if (!this.f6003b.containsKey(mutableDocument.getKey())) {
            this.f6003b.put(mutableDocument.getKey(), snapshotVersion);
        } else if (!this.f6003b.get(mutableDocument.getKey()).equals(mutableDocument.getVersion())) {
            throw new FirebaseFirestoreException("Document version changed between two reads.", FirebaseFirestoreException.Code.ABORTED);
        }
    }

    /* renamed from: a */
    public Task<Void> mo23966a() {
        m8227c();
        FirebaseFirestoreException firebaseFirestoreException = this.f6006e;
        if (firebaseFirestoreException != null) {
            return Tasks.m66666e(firebaseFirestoreException);
        }
        HashSet hashSet = new HashSet(this.f6003b.keySet());
        Iterator<Mutation> it = this.f6004c.iterator();
        while (it.hasNext()) {
            hashSet.remove(it.next().mo62902e());
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it2.next();
            this.f6004c.add(new VerifyMutation(documentKey, m8230f(documentKey)));
        }
        this.f6005d = true;
        return this.f6002a.mo63019a(this.f6004c).mo23713n(Executors.f54770b, Transaction$$Lambda$2.m8234b());
    }
}
