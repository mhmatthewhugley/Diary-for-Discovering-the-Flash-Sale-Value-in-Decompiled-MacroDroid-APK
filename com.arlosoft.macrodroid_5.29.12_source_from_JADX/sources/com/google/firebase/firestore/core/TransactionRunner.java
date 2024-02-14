package com.google.firebase.firestore.core;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.remote.Datastore;
import com.google.firebase.firestore.remote.RemoteStore;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.ExponentialBackoff;
import com.google.firebase.firestore.util.Function;

public class TransactionRunner<TResult> {

    /* renamed from: a */
    private AsyncQueue f6010a;

    /* renamed from: b */
    private RemoteStore f6011b;

    /* renamed from: c */
    private Function<Transaction, Task<TResult>> f6012c;

    /* renamed from: d */
    private int f6013d;

    /* renamed from: e */
    private ExponentialBackoff f6014e;

    /* renamed from: f */
    private TaskCompletionSource<TResult> f6015f = new TaskCompletionSource<>();

    public TransactionRunner(AsyncQueue asyncQueue, RemoteStore remoteStore, Function<Transaction, Task<TResult>> function) {
        this.f6010a = asyncQueue;
        this.f6011b = remoteStore;
        this.f6012c = function;
        this.f6013d = 5;
        this.f6014e = new ExponentialBackoff(asyncQueue, AsyncQueue.TimerId.RETRY_TRANSACTION);
    }

    /* renamed from: a */
    private void m8236a(Task task) {
        if (this.f6013d <= 0 || !m8237b(task.mo23714o())) {
            this.f6015f.mo56138b(task.mo23714o());
            return;
        }
        this.f6013d--;
        m8241g();
    }

    /* renamed from: b */
    private static boolean m8237b(Exception exc) {
        if (!(exc instanceof FirebaseFirestoreException)) {
            return false;
        }
        FirebaseFirestoreException firebaseFirestoreException = (FirebaseFirestoreException) exc;
        FirebaseFirestoreException.Code a = firebaseFirestoreException.mo23685a();
        if (a == FirebaseFirestoreException.Code.ABORTED || a == FirebaseFirestoreException.Code.FAILED_PRECONDITION || !Datastore.m76165e(firebaseFirestoreException.mo23685a())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static /* synthetic */ void m8238c(TransactionRunner transactionRunner, Task task, Task task2) {
        if (task2.mo23719t()) {
            transactionRunner.f6015f.mo56139c(task.mo23715p());
        } else {
            transactionRunner.m8236a(task2);
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m8239d(TransactionRunner transactionRunner, Transaction transaction, Task task) {
        if (!task.mo23719t()) {
            transactionRunner.m8236a(task);
        } else {
            transaction.mo23966a().mo23703d(transactionRunner.f6010a.mo63153i(), TransactionRunner$$Lambda$3.m8246b(transactionRunner, task));
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m8240e(TransactionRunner transactionRunner) {
        Transaction n = transactionRunner.f6011b.mo63087n();
        transactionRunner.f6012c.apply(n).mo23703d(transactionRunner.f6010a.mo63153i(), TransactionRunner$$Lambda$2.m8244b(transactionRunner, n));
    }

    /* renamed from: g */
    private void m8241g() {
        this.f6014e.mo63180a(TransactionRunner$$Lambda$1.m8243a(this));
    }

    /* renamed from: f */
    public Task<TResult> mo23967f() {
        m8241g();
        return this.f6015f.mo56137a();
    }
}
